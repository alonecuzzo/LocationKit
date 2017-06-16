package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Collection;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.GeneralResponse;
import io.swagger.client.model.GetCollectionResponse;
import io.swagger.client.model.GetCollectionsListResponse;
import io.swagger.client.model.GetLocationResponse;
import io.swagger.client.model.GetLocationsListResponse;
import io.swagger.client.model.Location;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * delete a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delCollectionTest() throws ApiException {
        String id = null;
        // GeneralResponse response = api.delCollection(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delLocationTest() throws ApiException {
        String id = null;
        // GeneralResponse response = api.delLocation(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * add a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCollectionsTest() throws ApiException {
        // GetCollectionsListResponse response = api.getAllCollections();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get locations list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLocationsTest() throws ApiException {
        // GetLocationsListResponse response = api.getAllLocations();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get a single collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOneCollectionTest() throws ApiException {
        String id = null;
        // GetCollectionResponse response = api.getOneCollection(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get a location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOneLocationTest() throws ApiException {
        String id = null;
        // GetLocationResponse response = api.getOneLocation(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * add a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveCollectionTest() throws ApiException {
        Collection collection = null;
        // GeneralResponse response = api.saveCollection(collection);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * add location to the list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveLocationTest() throws ApiException {
        Location location = null;
        // GeneralResponse response = api.saveLocation(location);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * update a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionTest() throws ApiException {
        String id = null;
        Collection collection = null;
        // GeneralResponse response = api.updateCollection(id, collection);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * update a location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationTest() throws ApiException {
        String id = null;
        Location location = null;
        // GeneralResponse response = api.updateLocation(id, location);

        // TODO: test validations
    }
    
}
