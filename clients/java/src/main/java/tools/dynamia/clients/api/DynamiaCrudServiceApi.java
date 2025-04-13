package tools.dynamia.clients.api;

import tools.dynamia.clients.ApiClient;

import tools.dynamia.clients.model.QueryParameters;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-13T13:27:54.300070628-05:00[America/Bogota]", comments = "Generator version: 7.12.0")
public class DynamiaCrudServiceApi {
    private ApiClient apiClient;

    public DynamiaCrudServiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public DynamiaCrudServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param body The body parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createOrSaveRequestCreation(String className, String body) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling createOrSave", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling createOrSave", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("className", className);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/crud-service/{className}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param body The body parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Object createOrSave(String className, String body) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createOrSaveRequestCreation(className, body).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param body The body parameter
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> createOrSaveWithHttpInfo(String className, String body) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createOrSaveRequestCreation(className, body).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param body The body parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createOrSaveWithResponseSpec(String className, String body) throws RestClientResponseException {
        return createOrSaveRequestCreation(className, body);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param body The body parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createOrSave1RequestCreation(String className, String body) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling createOrSave1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling createOrSave1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("className", className);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/crud-service/{className}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param body The body parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Object createOrSave1(String className, String body) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createOrSave1RequestCreation(className, body).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param body The body parameter
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> createOrSave1WithHttpInfo(String className, String body) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createOrSave1RequestCreation(className, body).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param body The body parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createOrSave1WithResponseSpec(String className, String body) throws RestClientResponseException {
        return createOrSave1RequestCreation(className, body);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param id The id parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRequestCreation(String className, Object id) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling delete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling delete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("className", className);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/crud-service/{className}/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param id The id parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Object delete(String className, Object id) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRequestCreation(className, id).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param id The id parameter
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> deleteWithHttpInfo(String className, Object id) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRequestCreation(className, id).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param id The id parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteWithResponseSpec(String className, Object id) throws RestClientResponseException {
        return deleteRequestCreation(className, id);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param queryParameters The queryParameters parameter
     * @return List&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findRequestCreation(String className, QueryParameters queryParameters) throws RestClientResponseException {
        Object postBody = queryParameters;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling find", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'queryParameters' is set
        if (queryParameters == null) {
            throw new RestClientResponseException("Missing the required parameter 'queryParameters' when calling find", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("className", className);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Object>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/crud-service/{className}/find", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param queryParameters The queryParameters parameter
     * @return List&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Object> find(String className, QueryParameters queryParameters) throws RestClientResponseException {
        ParameterizedTypeReference<List<Object>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findRequestCreation(className, queryParameters).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param queryParameters The queryParameters parameter
     * @return ResponseEntity&lt;List&lt;Object&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Object>> findWithHttpInfo(String className, QueryParameters queryParameters) throws RestClientResponseException {
        ParameterizedTypeReference<List<Object>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findRequestCreation(className, queryParameters).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param queryParameters The queryParameters parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findWithResponseSpec(String className, QueryParameters queryParameters) throws RestClientResponseException {
        return findRequestCreation(className, queryParameters);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param id The id parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRequestCreation(String className, Object id) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling get", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling get", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("className", className);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/crud-service/{className}/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param id The id parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Object get(String className, Object id) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRequestCreation(className, id).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param id The id parameter
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getWithHttpInfo(String className, Object id) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRequestCreation(className, id).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param id The id parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWithResponseSpec(String className, Object id) throws RestClientResponseException {
        return getRequestCreation(className, id);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param queryParameters The queryParameters parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getIdRequestCreation(String className, QueryParameters queryParameters) throws RestClientResponseException {
        Object postBody = queryParameters;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling getId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'queryParameters' is set
        if (queryParameters == null) {
            throw new RestClientResponseException("Missing the required parameter 'queryParameters' when calling getId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("className", className);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/crud-service/{className}/id", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param queryParameters The queryParameters parameter
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Object getId(String className, QueryParameters queryParameters) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getIdRequestCreation(className, queryParameters).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param queryParameters The queryParameters parameter
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getIdWithHttpInfo(String className, QueryParameters queryParameters) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getIdRequestCreation(className, queryParameters).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param queryParameters The queryParameters parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getIdWithResponseSpec(String className, QueryParameters queryParameters) throws RestClientResponseException {
        return getIdRequestCreation(className, queryParameters);
    }
}
