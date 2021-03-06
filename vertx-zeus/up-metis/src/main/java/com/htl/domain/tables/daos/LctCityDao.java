/*
 * This file is generated by jOOQ.
*/
package com.htl.domain.tables.daos;


import com.htl.domain.tables.LctCity;
import com.htl.domain.tables.records.LctCityRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LctCityDao extends DAOImpl<LctCityRecord, com.htl.domain.tables.pojos.LctCity, String> implements VertxDAO<com.htl.domain.tables.records.LctCityRecord,com.htl.domain.tables.pojos.LctCity,java.lang.String> {

    /**
     * Create a new LctCityDao without any configuration
     */
    public LctCityDao() {
        super(LctCity.LCT_CITY, com.htl.domain.tables.pojos.LctCity.class);
    }

    /**
     * Create a new LctCityDao with an attached configuration
     */
    public LctCityDao(Configuration configuration) {
        super(LctCity.LCT_CITY, com.htl.domain.tables.pojos.LctCity.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.htl.domain.tables.pojos.LctCity object) {
        return object.getPkId();
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByPkId(String... values) {
        return fetch(LctCity.LCT_CITY.PK_ID, values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code>
     */
    public com.htl.domain.tables.pojos.LctCity fetchOneByPkId(String value) {
        return fetchOne(LctCity.LCT_CITY.PK_ID, value);
    }

    /**
     * Fetch records that have <code>S_NAME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchBySName(String... values) {
        return fetch(LctCity.LCT_CITY.S_NAME, values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchBySCode(String... values) {
        return fetch(LctCity.LCT_CITY.S_CODE, values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByJConfig(String... values) {
        return fetch(LctCity.LCT_CITY.J_CONFIG, values);
    }

    /**
     * Fetch records that have <code>I_ORDER IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByIOrder(Integer... values) {
        return fetch(LctCity.LCT_CITY.I_ORDER, values);
    }

    /**
     * Fetch records that have <code>R_STATE_ID IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByRStateId(String... values) {
        return fetch(LctCity.LCT_CITY.R_STATE_ID, values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByIsActive(Boolean... values) {
        return fetch(LctCity.LCT_CITY.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByZSigma(String... values) {
        return fetch(LctCity.LCT_CITY.Z_SIGMA, values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByZLanguage(String... values) {
        return fetch(LctCity.LCT_CITY.Z_LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByZCreateBy(String... values) {
        return fetch(LctCity.LCT_CITY.Z_CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByZCreateTime(LocalDateTime... values) {
        return fetch(LctCity.LCT_CITY.Z_CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByZUpdateBy(String... values) {
        return fetch(LctCity.LCT_CITY.Z_UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.LctCity> fetchByZUpdateTime(LocalDateTime... values) {
        return fetch(LctCity.LCT_CITY.Z_UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByPkIdAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.PK_ID,values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code> asynchronously
     */
    public CompletableFuture<com.htl.domain.tables.pojos.LctCity> fetchOneByPkIdAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByPkId(value)),vertx());
    }

    /**
     * Fetch records that have <code>S_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchBySNameAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.S_NAME,values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchBySCodeAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.S_CODE,values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByJConfigAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.J_CONFIG,values);
    }

    /**
     * Fetch records that have <code>I_ORDER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByIOrderAsync(List<Integer> values) {
        return fetchAsync(LctCity.LCT_CITY.I_ORDER,values);
    }

    /**
     * Fetch records that have <code>R_STATE_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByRStateIdAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.R_STATE_ID,values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByIsActiveAsync(List<Boolean> values) {
        return fetchAsync(LctCity.LCT_CITY.IS_ACTIVE,values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByZSigmaAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.Z_SIGMA,values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByZLanguageAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.Z_LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByZCreateByAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.Z_CREATE_BY,values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByZCreateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(LctCity.LCT_CITY.Z_CREATE_TIME,values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByZUpdateByAsync(List<String> values) {
        return fetchAsync(LctCity.LCT_CITY.Z_UPDATE_BY,values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.LctCity>> fetchByZUpdateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(LctCity.LCT_CITY.Z_UPDATE_TIME,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
