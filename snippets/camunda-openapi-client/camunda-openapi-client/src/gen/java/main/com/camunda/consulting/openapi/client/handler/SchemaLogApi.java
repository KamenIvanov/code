/*
 * Camunda BPM REST API
 * OpenApi Spec for Camunda BPM REST API.
 *
 * The version of the OpenAPI document: 7.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.handler;

import com.camunda.consulting.openapi.client.handler.ApiCallback;
import com.camunda.consulting.openapi.client.handler.ApiClient;
import com.camunda.consulting.openapi.client.handler.ApiException;
import com.camunda.consulting.openapi.client.handler.ApiResponse;
import com.camunda.consulting.openapi.client.handler.Configuration;
import com.camunda.consulting.openapi.client.handler.Pair;
import com.camunda.consulting.openapi.client.handler.ProgressRequestBody;
import com.camunda.consulting.openapi.client.handler.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.camunda.consulting.openapi.client.model.SchemaLogEntryDto;
import com.camunda.consulting.openapi.client.model.SchemaLogQueryDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchemaLogApi {
    private ApiClient localVarApiClient;

    public SchemaLogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SchemaLogApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getSchemaLog
     * @param version Only return schema log entries with a specific version. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. **Note**: In order to get any results a user of group &#x60;camunda-admin&#x60; must be authenticated. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSchemaLogCall(String version, Integer firstResult, Integer maxResults, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/schema/log";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (firstResult != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("firstResult", firstResult));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSchemaLogValidateBeforeCall(String version, Integer firstResult, Integer maxResults, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSchemaLogCall(version, firstResult, maxResults, _callback);
        return localVarCall;

    }

    /**
     * 
     * Queries for schema log entries that fulfill given parameters.
     * @param version Only return schema log entries with a specific version. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return List&lt;SchemaLogEntryDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. **Note**: In order to get any results a user of group &#x60;camunda-admin&#x60; must be authenticated. </td><td>  -  </td></tr>
     </table>
     */
    public List<SchemaLogEntryDto> getSchemaLog(String version, Integer firstResult, Integer maxResults) throws ApiException {
        ApiResponse<List<SchemaLogEntryDto>> localVarResp = getSchemaLogWithHttpInfo(version, firstResult, maxResults);
        return localVarResp.getData();
    }

    /**
     * 
     * Queries for schema log entries that fulfill given parameters.
     * @param version Only return schema log entries with a specific version. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return ApiResponse&lt;List&lt;SchemaLogEntryDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. **Note**: In order to get any results a user of group &#x60;camunda-admin&#x60; must be authenticated. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<SchemaLogEntryDto>> getSchemaLogWithHttpInfo(String version, Integer firstResult, Integer maxResults) throws ApiException {
        okhttp3.Call localVarCall = getSchemaLogValidateBeforeCall(version, firstResult, maxResults, null);
        Type localVarReturnType = new TypeToken<List<SchemaLogEntryDto>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Queries for schema log entries that fulfill given parameters.
     * @param version Only return schema log entries with a specific version. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. **Note**: In order to get any results a user of group &#x60;camunda-admin&#x60; must be authenticated. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSchemaLogAsync(String version, Integer firstResult, Integer maxResults, final ApiCallback<List<SchemaLogEntryDto>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSchemaLogValidateBeforeCall(version, firstResult, maxResults, _callback);
        Type localVarReturnType = new TypeToken<List<SchemaLogEntryDto>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for querySchemaLog
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param schemaLogQueryDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. **Note**: In order to get any results a user of group camunda-admin must be authenticated. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call querySchemaLogCall(Integer firstResult, Integer maxResults, SchemaLogQueryDto schemaLogQueryDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = schemaLogQueryDto;

        // create path and map variables
        String localVarPath = "/schema/log";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (firstResult != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("firstResult", firstResult));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call querySchemaLogValidateBeforeCall(Integer firstResult, Integer maxResults, SchemaLogQueryDto schemaLogQueryDto, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = querySchemaLogCall(firstResult, maxResults, schemaLogQueryDto, _callback);
        return localVarCall;

    }

    /**
     * 
     * Queries for schema log entries that fulfill given parameters.
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param schemaLogQueryDto  (optional)
     * @return List&lt;SchemaLogEntryDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. **Note**: In order to get any results a user of group camunda-admin must be authenticated. </td><td>  -  </td></tr>
     </table>
     */
    public List<SchemaLogEntryDto> querySchemaLog(Integer firstResult, Integer maxResults, SchemaLogQueryDto schemaLogQueryDto) throws ApiException {
        ApiResponse<List<SchemaLogEntryDto>> localVarResp = querySchemaLogWithHttpInfo(firstResult, maxResults, schemaLogQueryDto);
        return localVarResp.getData();
    }

    /**
     * 
     * Queries for schema log entries that fulfill given parameters.
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param schemaLogQueryDto  (optional)
     * @return ApiResponse&lt;List&lt;SchemaLogEntryDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. **Note**: In order to get any results a user of group camunda-admin must be authenticated. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<SchemaLogEntryDto>> querySchemaLogWithHttpInfo(Integer firstResult, Integer maxResults, SchemaLogQueryDto schemaLogQueryDto) throws ApiException {
        okhttp3.Call localVarCall = querySchemaLogValidateBeforeCall(firstResult, maxResults, schemaLogQueryDto, null);
        Type localVarReturnType = new TypeToken<List<SchemaLogEntryDto>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Queries for schema log entries that fulfill given parameters.
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param schemaLogQueryDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. **Note**: In order to get any results a user of group camunda-admin must be authenticated. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call querySchemaLogAsync(Integer firstResult, Integer maxResults, SchemaLogQueryDto schemaLogQueryDto, final ApiCallback<List<SchemaLogEntryDto>> _callback) throws ApiException {

        okhttp3.Call localVarCall = querySchemaLogValidateBeforeCall(firstResult, maxResults, schemaLogQueryDto, _callback);
        Type localVarReturnType = new TypeToken<List<SchemaLogEntryDto>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}