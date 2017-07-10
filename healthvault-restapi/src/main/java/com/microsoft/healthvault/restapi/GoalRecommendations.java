/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi;

import com.microsoft.healthvault.restapi.models.ErrorResponseException;
import com.microsoft.healthvault.restapi.models.GoalRecommendation;
import com.microsoft.healthvault.restapi.models.GoalRecommendationInstance;
import com.microsoft.healthvault.restapi.models.GoalRecommendationsResponse;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in GoalRecommendations.
 */
public interface GoalRecommendations {
    /**
     * Get a collection of all goal recommendations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GoalRecommendationsResponse object if successful.
     */
    GoalRecommendationsResponse get();

    /**
     * Get a collection of all goal recommendations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GoalRecommendationsResponse> getAsync(final ServiceCallback<GoalRecommendationsResponse> serviceCallback);

    /**
     * Get a collection of all goal recommendations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalRecommendationsResponse object
     */
    Observable<GoalRecommendationsResponse> getAsync();

    /**
     * Get a collection of all goal recommendations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalRecommendationsResponse object
     */
    Observable<ServiceResponse<GoalRecommendationsResponse>> getWithServiceResponseAsync();
    /**
     * Get a collection of all goal recommendations.
     *
     * @param goalTypes The goal types(e.g Steps, CaloriesBurned) filter.
     * @param goalWindowTypes The goal window types(e.g Daily, Weekly) filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GoalRecommendationsResponse object if successful.
     */
    GoalRecommendationsResponse get(String goalTypes, String goalWindowTypes);

    /**
     * Get a collection of all goal recommendations.
     *
     * @param goalTypes The goal types(e.g Steps, CaloriesBurned) filter.
     * @param goalWindowTypes The goal window types(e.g Daily, Weekly) filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GoalRecommendationsResponse> getAsync(String goalTypes, String goalWindowTypes, final ServiceCallback<GoalRecommendationsResponse> serviceCallback);

    /**
     * Get a collection of all goal recommendations.
     *
     * @param goalTypes The goal types(e.g Steps, CaloriesBurned) filter.
     * @param goalWindowTypes The goal window types(e.g Daily, Weekly) filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalRecommendationsResponse object
     */
    Observable<GoalRecommendationsResponse> getAsync(String goalTypes, String goalWindowTypes);

    /**
     * Get a collection of all goal recommendations.
     *
     * @param goalTypes The goal types(e.g Steps, CaloriesBurned) filter.
     * @param goalWindowTypes The goal window types(e.g Daily, Weekly) filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalRecommendationsResponse object
     */
    Observable<ServiceResponse<GoalRecommendationsResponse>> getWithServiceResponseAsync(String goalTypes, String goalWindowTypes);

    /**
     * Post a goal recommendation instance.
     *
     * @param goalRecommendation The instance of the goal recommendation to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object create(GoalRecommendation goalRecommendation);

    /**
     * Post a goal recommendation instance.
     *
     * @param goalRecommendation The instance of the goal recommendation to create.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createAsync(GoalRecommendation goalRecommendation, final ServiceCallback<Object> serviceCallback);

    /**
     * Post a goal recommendation instance.
     *
     * @param goalRecommendation The instance of the goal recommendation to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createAsync(GoalRecommendation goalRecommendation);

    /**
     * Post a goal recommendation instance.
     *
     * @param goalRecommendation The instance of the goal recommendation to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createWithServiceResponseAsync(GoalRecommendation goalRecommendation);

    /**
     * Get an instance of a specific goal recommendation.
     *
     * @param goalRecommendationId The goal recommendation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GoalRecommendationInstance object if successful.
     */
    GoalRecommendationInstance getById(String goalRecommendationId);

    /**
     * Get an instance of a specific goal recommendation.
     *
     * @param goalRecommendationId The goal recommendation identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GoalRecommendationInstance> getByIdAsync(String goalRecommendationId, final ServiceCallback<GoalRecommendationInstance> serviceCallback);

    /**
     * Get an instance of a specific goal recommendation.
     *
     * @param goalRecommendationId The goal recommendation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalRecommendationInstance object
     */
    Observable<GoalRecommendationInstance> getByIdAsync(String goalRecommendationId);

    /**
     * Get an instance of a specific goal recommendation.
     *
     * @param goalRecommendationId The goal recommendation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalRecommendationInstance object
     */
    Observable<ServiceResponse<GoalRecommendationInstance>> getByIdWithServiceResponseAsync(String goalRecommendationId);

    /**
     * Delete a goal recommendation instance.
     *
     * @param goalRecommendationId The identifier of the goal recommendation to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object delete(String goalRecommendationId);

    /**
     * Delete a goal recommendation instance.
     *
     * @param goalRecommendationId The identifier of the goal recommendation to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> deleteAsync(String goalRecommendationId, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete a goal recommendation instance.
     *
     * @param goalRecommendationId The identifier of the goal recommendation to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deleteAsync(String goalRecommendationId);

    /**
     * Delete a goal recommendation instance.
     *
     * @param goalRecommendationId The identifier of the goal recommendation to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deleteWithServiceResponseAsync(String goalRecommendationId);

    /**
     * Updates the goal recommendation to acknowledged state.
     *
     * @param goalRecommendationId The identifier of the goal recommendation to acknowledge.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object acknowledge(String goalRecommendationId);

    /**
     * Updates the goal recommendation to acknowledged state.
     *
     * @param goalRecommendationId The identifier of the goal recommendation to acknowledge.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> acknowledgeAsync(String goalRecommendationId, final ServiceCallback<Object> serviceCallback);

    /**
     * Updates the goal recommendation to acknowledged state.
     *
     * @param goalRecommendationId The identifier of the goal recommendation to acknowledge.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> acknowledgeAsync(String goalRecommendationId);

    /**
     * Updates the goal recommendation to acknowledged state.
     *
     * @param goalRecommendationId The identifier of the goal recommendation to acknowledge.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> acknowledgeWithServiceResponseAsync(String goalRecommendationId);

}
