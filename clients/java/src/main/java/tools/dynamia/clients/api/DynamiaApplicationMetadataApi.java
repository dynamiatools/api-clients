package tools.dynamia.clients.api;

import tools.dynamia.clients.ApiClient;

import tools.dynamia.clients.model.ActionExecutionRequest;
import tools.dynamia.clients.model.ActionExecutionResponse;
import tools.dynamia.clients.model.ApplicationMetadata;
import tools.dynamia.clients.model.ApplicationMetadataActions;
import tools.dynamia.clients.model.ApplicationMetadataEntities;
import tools.dynamia.clients.model.EntityMetadata;
import tools.dynamia.clients.model.NavigationTree;
import tools.dynamia.clients.model.ViewDescriptor;

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
public class DynamiaApplicationMetadataApi {
    private ApiClient apiClient;

    public DynamiaApplicationMetadataApi() {
        this(new ApiClient());
    }

    @Autowired
    public DynamiaApplicationMetadataApi(ApiClient apiClient) {
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
     * @param action The action parameter
     * @param actionExecutionRequest The actionExecutionRequest parameter
     * @return ActionExecutionResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec executeEntityActionRequestCreation(String className, String action, ActionExecutionRequest actionExecutionRequest) throws RestClientResponseException {
        Object postBody = actionExecutionRequest;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling executeEntityAction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new RestClientResponseException("Missing the required parameter 'action' when calling executeEntityAction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'actionExecutionRequest' is set
        if (actionExecutionRequest == null) {
            throw new RestClientResponseException("Missing the required parameter 'actionExecutionRequest' when calling executeEntityAction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("className", className);
        pathParams.put("action", action);

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

        ParameterizedTypeReference<ActionExecutionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata/entities/{className}/action/{action}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param action The action parameter
     * @param actionExecutionRequest The actionExecutionRequest parameter
     * @return ActionExecutionResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ActionExecutionResponse executeEntityAction(String className, String action, ActionExecutionRequest actionExecutionRequest) throws RestClientResponseException {
        ParameterizedTypeReference<ActionExecutionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return executeEntityActionRequestCreation(className, action, actionExecutionRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param action The action parameter
     * @param actionExecutionRequest The actionExecutionRequest parameter
     * @return ResponseEntity&lt;ActionExecutionResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ActionExecutionResponse> executeEntityActionWithHttpInfo(String className, String action, ActionExecutionRequest actionExecutionRequest) throws RestClientResponseException {
        ParameterizedTypeReference<ActionExecutionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return executeEntityActionRequestCreation(className, action, actionExecutionRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param action The action parameter
     * @param actionExecutionRequest The actionExecutionRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec executeEntityActionWithResponseSpec(String className, String action, ActionExecutionRequest actionExecutionRequest) throws RestClientResponseException {
        return executeEntityActionRequestCreation(className, action, actionExecutionRequest);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @return List&lt;ViewDescriptor&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec executeEntityAction1RequestCreation(String className) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling executeEntityAction1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ViewDescriptor>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata/entities/{className}/views", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @return List&lt;ViewDescriptor&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ViewDescriptor> executeEntityAction1(String className) throws RestClientResponseException {
        ParameterizedTypeReference<List<ViewDescriptor>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return executeEntityAction1RequestCreation(className).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @return ResponseEntity&lt;List&lt;ViewDescriptor&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ViewDescriptor>> executeEntityAction1WithHttpInfo(String className) throws RestClientResponseException {
        ParameterizedTypeReference<List<ViewDescriptor>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return executeEntityAction1RequestCreation(className).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec executeEntityAction1WithResponseSpec(String className) throws RestClientResponseException {
        return executeEntityAction1RequestCreation(className);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param action The action parameter
     * @param request The request parameter
     * @return ActionExecutionResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec executeGlobalActionRequestCreation(String action, ActionExecutionRequest request) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new RestClientResponseException("Missing the required parameter 'action' when calling executeGlobalAction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new RestClientResponseException("Missing the required parameter 'request' when calling executeGlobalAction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("action", action);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "data", request.getData()));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "params", request.getParams()));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", request.getSource()));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataType", request.getDataType()));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataId", request.getDataId()));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataName", request.getDataName()));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ActionExecutionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata/actions/{action}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param action The action parameter
     * @param request The request parameter
     * @return ActionExecutionResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ActionExecutionResponse executeGlobalAction(String action, ActionExecutionRequest request) throws RestClientResponseException {
        ParameterizedTypeReference<ActionExecutionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return executeGlobalActionRequestCreation(action, request).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param action The action parameter
     * @param request The request parameter
     * @return ResponseEntity&lt;ActionExecutionResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ActionExecutionResponse> executeGlobalActionWithHttpInfo(String action, ActionExecutionRequest request) throws RestClientResponseException {
        ParameterizedTypeReference<ActionExecutionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return executeGlobalActionRequestCreation(action, request).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param action The action parameter
     * @param request The request parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec executeGlobalActionWithResponseSpec(String action, ActionExecutionRequest request) throws RestClientResponseException {
        return executeGlobalActionRequestCreation(action, request);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ApplicationMetadataEntities
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEntitiesRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

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

        ParameterizedTypeReference<ApplicationMetadataEntities> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata/entities", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ApplicationMetadataEntities
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ApplicationMetadataEntities getEntities() throws RestClientResponseException {
        ParameterizedTypeReference<ApplicationMetadataEntities> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEntitiesRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ApplicationMetadataEntities&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApplicationMetadataEntities> getEntitiesWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<ApplicationMetadataEntities> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEntitiesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEntitiesWithResponseSpec() throws RestClientResponseException {
        return getEntitiesRequestCreation();
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @return EntityMetadata
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEntityMetadataRequestCreation(String className) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling getEntityMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<EntityMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata/entities/{className}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @return EntityMetadata
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public EntityMetadata getEntityMetadata(String className) throws RestClientResponseException {
        ParameterizedTypeReference<EntityMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEntityMetadataRequestCreation(className).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @return ResponseEntity&lt;EntityMetadata&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EntityMetadata> getEntityMetadataWithHttpInfo(String className) throws RestClientResponseException {
        ParameterizedTypeReference<EntityMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEntityMetadataRequestCreation(className).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEntityMetadataWithResponseSpec(String className) throws RestClientResponseException {
        return getEntityMetadataRequestCreation(className);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param view The view parameter
     * @return ViewDescriptor
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEntityViewDescriptorRequestCreation(String className, String view) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new RestClientResponseException("Missing the required parameter 'className' when calling getEntityViewDescriptor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'view' is set
        if (view == null) {
            throw new RestClientResponseException("Missing the required parameter 'view' when calling getEntityViewDescriptor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("className", className);
        pathParams.put("view", view);

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

        ParameterizedTypeReference<ViewDescriptor> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata/entities/{className}/views/{view}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param view The view parameter
     * @return ViewDescriptor
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ViewDescriptor getEntityViewDescriptor(String className, String view) throws RestClientResponseException {
        ParameterizedTypeReference<ViewDescriptor> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEntityViewDescriptorRequestCreation(className, view).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param view The view parameter
     * @return ResponseEntity&lt;ViewDescriptor&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ViewDescriptor> getEntityViewDescriptorWithHttpInfo(String className, String view) throws RestClientResponseException {
        ParameterizedTypeReference<ViewDescriptor> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEntityViewDescriptorRequestCreation(className, view).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param className The className parameter
     * @param view The view parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEntityViewDescriptorWithResponseSpec(String className, String view) throws RestClientResponseException {
        return getEntityViewDescriptorRequestCreation(className, view);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ApplicationMetadataActions
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getGlobalActionsRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

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

        ParameterizedTypeReference<ApplicationMetadataActions> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata/actions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ApplicationMetadataActions
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ApplicationMetadataActions getGlobalActions() throws RestClientResponseException {
        ParameterizedTypeReference<ApplicationMetadataActions> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getGlobalActionsRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ApplicationMetadataActions&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApplicationMetadataActions> getGlobalActionsWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<ApplicationMetadataActions> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getGlobalActionsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getGlobalActionsWithResponseSpec() throws RestClientResponseException {
        return getGlobalActionsRequestCreation();
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ApplicationMetadata
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMetadataRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

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

        ParameterizedTypeReference<ApplicationMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ApplicationMetadata
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ApplicationMetadata getMetadata() throws RestClientResponseException {
        ParameterizedTypeReference<ApplicationMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getMetadataRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ApplicationMetadata&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApplicationMetadata> getMetadataWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<ApplicationMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getMetadataRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMetadataWithResponseSpec() throws RestClientResponseException {
        return getMetadataRequestCreation();
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return NavigationTree
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getNavigationRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

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

        ParameterizedTypeReference<NavigationTree> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/app/metadata/navigation", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return NavigationTree
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public NavigationTree getNavigation() throws RestClientResponseException {
        ParameterizedTypeReference<NavigationTree> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getNavigationRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;NavigationTree&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NavigationTree> getNavigationWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<NavigationTree> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getNavigationRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getNavigationWithResponseSpec() throws RestClientResponseException {
        return getNavigationRequestCreation();
    }
}
