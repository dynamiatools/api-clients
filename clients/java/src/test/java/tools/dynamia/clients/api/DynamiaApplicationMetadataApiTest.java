/*
 * DynamiaTools API
 * DynamiaTools Metadata API
 *
 * The version of the OpenAPI document: 5.3.6
 * Contact: mario@dynamiasoluciones.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package tools.dynamia.clients.api;

import tools.dynamia.clients.model.ActionExecutionRequest;
import tools.dynamia.clients.model.ActionExecutionResponse;
import tools.dynamia.clients.model.ApplicationMetadata;
import tools.dynamia.clients.model.ApplicationMetadataActions;
import tools.dynamia.clients.model.ApplicationMetadataEntities;
import tools.dynamia.clients.model.EntityMetadata;
import tools.dynamia.clients.model.NavigationTree;
import tools.dynamia.clients.model.ViewDescriptor;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for DynamiaApplicationMetadataApi
 */
@Disabled
public class DynamiaApplicationMetadataApiTest {

    private final DynamiaApplicationMetadataApi api = new DynamiaApplicationMetadataApi();

    
    /**
     * 
     *
     * 
     */
    @Test
    public void executeEntityActionTest()  {
        String className = null;
        String action = null;
        ActionExecutionRequest actionExecutionRequest = null;
        ActionExecutionResponse response = api.executeEntityAction(className, action, actionExecutionRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void executeEntityAction1Test()  {
        String className = null;
        List<ViewDescriptor> response = api.executeEntityAction1(className);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void executeGlobalActionTest()  {
        String action = null;
        ActionExecutionRequest request = null;
        ActionExecutionResponse response = api.executeGlobalAction(action, request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void getEntitiesTest()  {
        ApplicationMetadataEntities response = api.getEntities();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void getEntityMetadataTest()  {
        String className = null;
        EntityMetadata response = api.getEntityMetadata(className);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void getEntityViewDescriptorTest()  {
        String className = null;
        String view = null;
        ViewDescriptor response = api.getEntityViewDescriptor(className, view);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void getGlobalActionsTest()  {
        ApplicationMetadataActions response = api.getGlobalActions();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void getMetadataTest()  {
        ApplicationMetadata response = api.getMetadata();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void getNavigationTest()  {
        NavigationTree response = api.getNavigation();

        // TODO: test validations
    }
    
}