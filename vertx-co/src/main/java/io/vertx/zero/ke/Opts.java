package io.vertx.zero.ke;

import com.vie.hoc.HNull;
import com.vie.hoc.HPool;
import com.vie.hors.DemonException;
import com.vie.hors.ZeroException;
import com.vie.util.Instance;
import io.vertx.core.json.JsonObject;
import io.vertx.zero.hors.zero.LimeFileException;
import io.vertx.zero.ke.config.ZeroLime;
import io.vertx.zero.ke.config.ZeroPlugin;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Options for different configuration
 *
 * @param <T>
 */
public interface Opts<T> {
    /**
     * Read data from files
     *
     * @return
     * @throws DemonException
     */
    T ingest(String file) throws ZeroException;

    /**
     * Read reference of Opts
     *
     * @return
     */
    static Opts<JsonObject> get() {
        return YamlOpts.create();
    }
}

class YamlOpts implements Opts<JsonObject> {

    private static final ConcurrentMap<String, ZeroNode<JsonObject>>
            EXTENSIONS = new ConcurrentHashMap<>();

    /**
     * Default package scope, manually implement singleton
     * instead of Instance.singleton.
     *
     * @return
     */
    public static Opts<JsonObject> create() {
        if (null == INSTANCE) {
            synchronized (YamlOpts.class) {
                if (null == INSTANCE) {
                    INSTANCE = new YamlOpts();
                }
            }
        }
        return INSTANCE;
    }

    private static Opts<JsonObject> INSTANCE;

    private YamlOpts() {
    }

    ;

    @Override
    public JsonObject ingest(final String key)
            throws ZeroException {
        final ZeroNode<JsonObject> node =
                HPool.exec(EXTENSIONS, key,
                        () -> Instance.instance(ZeroPlugin.class, key));
        return HNull.get(node.read(),
                new LimeFileException(getClass(), ZeroLime.calculatePath(key)));
    }
}
