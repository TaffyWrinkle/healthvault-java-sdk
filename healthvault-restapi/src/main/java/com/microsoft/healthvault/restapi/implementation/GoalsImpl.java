/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.implementation;

import retrofit2.Retrofit;
import com.microsoft.healthvault.restapi.Goals;
import com.google.common.reflect.TypeToken;
import com.microsoft.healthvault.restapi.models.ErrorResponseException;
import com.microsoft.healthvault.restapi.models.Goal;
import com.microsoft.healthvault.restapi.models.GoalsResponse;
import com.microsoft.healthvault.restapi.models.GoalsWrapper;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Goals.
 */
public class GoalsImpl implements Goals {
    /** The Retrofit service to perform REST calls. */
    private GoalsService service;
    /** The service client containing this operation class. */
    private MicrosoftHealthVaultRestApiImpl client;

    /**
     * Initializes an instance of Goals.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public GoalsImpl(Retrofit retrofit, MicrosoftHealthVaultRestApiImpl client) {
        this.service = retrofit.create(GoalsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Goals to be
     * used by Retrofit to perform actually REST calls.
     */
    interface GoalsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.healthvault.restapi.Goals get" })
        @GET("Goals")
        Observable<Response<ResponseBody>> get(@Query("types") String types, @Query("windowTypes") String windowTypes, @Query("startDate") DateTime startDate, @Query("endDate") DateTime endDate);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.healthvault.restapi.Goals replace" })
        @PUT("Goals")
        Observable<Response<ResponseBody>> replace(@Body Goal goal);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.healthvault.restapi.Goals create" })
        @POST("Goals")
        Observable<Response<ResponseBody>> create(@Body GoalsWrapper goalsWrapper);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.healthvault.restapi.Goals update" })
        @PATCH("Goals")
        Observable<Response<ResponseBody>> update(@Body GoalsWrapper goalsWrapper);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.healthvault.restapi.Goals getById" })
        @GET("Goals/{goalId}")
        Observable<Response<ResponseBody>> getById(@Path("goalId") String goalId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.healthvault.restapi.Goals delete" })
        @HTTP(path = "Goals/{goalId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("goalId") String goalId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.healthvault.restapi.Goals getActive" })
        @GET("Goals/active")
        Observable<Response<ResponseBody>> getActive(@Query("types") String types, @Query("windowTypes") String windowTypes);

    }

    /**
     * Get a collection of all goals.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GoalsResponse object if successful.
     */
    public GoalsResponse get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get a collection of all goals.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GoalsResponse> getAsync(final ServiceCallback<GoalsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a collection of all goals.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<GoalsResponse> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<GoalsResponse>, GoalsResponse>() {
            @Override
            public GoalsResponse call(ServiceResponse<GoalsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a collection of all goals.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<ServiceResponse<GoalsResponse>> getWithServiceResponseAsync() {
        final String types = null;
        final String windowTypes = null;
        final DateTime startDate = null;
        final DateTime endDate = null;
        return service.get(types, windowTypes, startDate, endDate)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GoalsResponse>>>() {
                @Override
                public Observable<ServiceResponse<GoalsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GoalsResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get a collection of all goals.
     *
     * @param types The goal types(e.g Steps, CaloriesBurned) filter.
     * @param windowTypes The goal window types(e.g Daily, Weekly) filter.
     * @param startDate The start date for date range filter.
     * @param endDate The end date for date range filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GoalsResponse object if successful.
     */
    public GoalsResponse get(String types, String windowTypes, DateTime startDate, DateTime endDate) {
        return getWithServiceResponseAsync(types, windowTypes, startDate, endDate).toBlocking().single().body();
    }

    /**
     * Get a collection of all goals.
     *
     * @param types The goal types(e.g Steps, CaloriesBurned) filter.
     * @param windowTypes The goal window types(e.g Daily, Weekly) filter.
     * @param startDate The start date for date range filter.
     * @param endDate The end date for date range filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GoalsResponse> getAsync(String types, String windowTypes, DateTime startDate, DateTime endDate, final ServiceCallback<GoalsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(types, windowTypes, startDate, endDate), serviceCallback);
    }

    /**
     * Get a collection of all goals.
     *
     * @param types The goal types(e.g Steps, CaloriesBurned) filter.
     * @param windowTypes The goal window types(e.g Daily, Weekly) filter.
     * @param startDate The start date for date range filter.
     * @param endDate The end date for date range filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<GoalsResponse> getAsync(String types, String windowTypes, DateTime startDate, DateTime endDate) {
        return getWithServiceResponseAsync(types, windowTypes, startDate, endDate).map(new Func1<ServiceResponse<GoalsResponse>, GoalsResponse>() {
            @Override
            public GoalsResponse call(ServiceResponse<GoalsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a collection of all goals.
     *
     * @param types The goal types(e.g Steps, CaloriesBurned) filter.
     * @param windowTypes The goal window types(e.g Daily, Weekly) filter.
     * @param startDate The start date for date range filter.
     * @param endDate The end date for date range filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<ServiceResponse<GoalsResponse>> getWithServiceResponseAsync(String types, String windowTypes, DateTime startDate, DateTime endDate) {
        return service.get(types, windowTypes, startDate, endDate)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GoalsResponse>>>() {
                @Override
                public Observable<ServiceResponse<GoalsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GoalsResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GoalsResponse> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<GoalsResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GoalsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update/Replace a complete goal instance with no merge.
     *
     * @param goal The instance of the goal to update. The entire goal will be replaced with this version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Goal object if successful.
     */
    public Goal replace(Goal goal) {
        return replaceWithServiceResponseAsync(goal).toBlocking().single().body();
    }

    /**
     * Update/Replace a complete goal instance with no merge.
     *
     * @param goal The instance of the goal to update. The entire goal will be replaced with this version.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Goal> replaceAsync(Goal goal, final ServiceCallback<Goal> serviceCallback) {
        return ServiceFuture.fromResponse(replaceWithServiceResponseAsync(goal), serviceCallback);
    }

    /**
     * Update/Replace a complete goal instance with no merge.
     *
     * @param goal The instance of the goal to update. The entire goal will be replaced with this version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Goal object
     */
    public Observable<Goal> replaceAsync(Goal goal) {
        return replaceWithServiceResponseAsync(goal).map(new Func1<ServiceResponse<Goal>, Goal>() {
            @Override
            public Goal call(ServiceResponse<Goal> response) {
                return response.body();
            }
        });
    }

    /**
     * Update/Replace a complete goal instance with no merge.
     *
     * @param goal The instance of the goal to update. The entire goal will be replaced with this version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Goal object
     */
    public Observable<ServiceResponse<Goal>> replaceWithServiceResponseAsync(Goal goal) {
        if (goal == null) {
            throw new IllegalArgumentException("Parameter goal is required and cannot be null.");
        }
        Validator.validate(goal);
        return service.replace(goal)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Goal>>>() {
                @Override
                public Observable<ServiceResponse<Goal>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Goal> clientResponse = replaceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Goal> replaceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Goal, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Goal>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Post a collection of goal instances.
     *
     * @param goalsWrapper The collection of goal instances to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object create(GoalsWrapper goalsWrapper) {
        return createWithServiceResponseAsync(goalsWrapper).toBlocking().single().body();
    }

    /**
     * Post a collection of goal instances.
     *
     * @param goalsWrapper The collection of goal instances to create.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> createAsync(GoalsWrapper goalsWrapper, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(goalsWrapper), serviceCallback);
    }

    /**
     * Post a collection of goal instances.
     *
     * @param goalsWrapper The collection of goal instances to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createAsync(GoalsWrapper goalsWrapper) {
        return createWithServiceResponseAsync(goalsWrapper).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Post a collection of goal instances.
     *
     * @param goalsWrapper The collection of goal instances to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createWithServiceResponseAsync(GoalsWrapper goalsWrapper) {
        if (goalsWrapper == null) {
            throw new IllegalArgumentException("Parameter goalsWrapper is required and cannot be null.");
        }
        Validator.validate(goalsWrapper);
        return service.create(goalsWrapper)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .register(201, new TypeToken<GoalsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update collection of goal instances with merge.
     *
     * @param goalsWrapper The collection of goal instances to update. Only the fields present in the passed in model will be updated. All other fields and colelctions
                 will be left, as is, unless invalid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GoalsResponse object if successful.
     */
    public GoalsResponse update(GoalsWrapper goalsWrapper) {
        return updateWithServiceResponseAsync(goalsWrapper).toBlocking().single().body();
    }

    /**
     * Update collection of goal instances with merge.
     *
     * @param goalsWrapper The collection of goal instances to update. Only the fields present in the passed in model will be updated. All other fields and colelctions
                 will be left, as is, unless invalid.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GoalsResponse> updateAsync(GoalsWrapper goalsWrapper, final ServiceCallback<GoalsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(goalsWrapper), serviceCallback);
    }

    /**
     * Update collection of goal instances with merge.
     *
     * @param goalsWrapper The collection of goal instances to update. Only the fields present in the passed in model will be updated. All other fields and colelctions
                 will be left, as is, unless invalid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<GoalsResponse> updateAsync(GoalsWrapper goalsWrapper) {
        return updateWithServiceResponseAsync(goalsWrapper).map(new Func1<ServiceResponse<GoalsResponse>, GoalsResponse>() {
            @Override
            public GoalsResponse call(ServiceResponse<GoalsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Update collection of goal instances with merge.
     *
     * @param goalsWrapper The collection of goal instances to update. Only the fields present in the passed in model will be updated. All other fields and colelctions
                 will be left, as is, unless invalid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<ServiceResponse<GoalsResponse>> updateWithServiceResponseAsync(GoalsWrapper goalsWrapper) {
        if (goalsWrapper == null) {
            throw new IllegalArgumentException("Parameter goalsWrapper is required and cannot be null.");
        }
        Validator.validate(goalsWrapper);
        return service.update(goalsWrapper)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GoalsResponse>>>() {
                @Override
                public Observable<ServiceResponse<GoalsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GoalsResponse> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GoalsResponse> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<GoalsResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GoalsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get an instance of a specific goal.
     *
     * @param goalId The goal identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Goal object if successful.
     */
    public Goal getById(String goalId) {
        return getByIdWithServiceResponseAsync(goalId).toBlocking().single().body();
    }

    /**
     * Get an instance of a specific goal.
     *
     * @param goalId The goal identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Goal> getByIdAsync(String goalId, final ServiceCallback<Goal> serviceCallback) {
        return ServiceFuture.fromResponse(getByIdWithServiceResponseAsync(goalId), serviceCallback);
    }

    /**
     * Get an instance of a specific goal.
     *
     * @param goalId The goal identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Goal object
     */
    public Observable<Goal> getByIdAsync(String goalId) {
        return getByIdWithServiceResponseAsync(goalId).map(new Func1<ServiceResponse<Goal>, Goal>() {
            @Override
            public Goal call(ServiceResponse<Goal> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an instance of a specific goal.
     *
     * @param goalId The goal identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Goal object
     */
    public Observable<ServiceResponse<Goal>> getByIdWithServiceResponseAsync(String goalId) {
        if (goalId == null) {
            throw new IllegalArgumentException("Parameter goalId is required and cannot be null.");
        }
        return service.getById(goalId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Goal>>>() {
                @Override
                public Observable<ServiceResponse<Goal>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Goal> clientResponse = getByIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Goal> getByIdDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Goal, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Goal>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete a goal instance.
     *
     * @param goalId The identifier of the goal to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object delete(String goalId) {
        return deleteWithServiceResponseAsync(goalId).toBlocking().single().body();
    }

    /**
     * Delete a goal instance.
     *
     * @param goalId The identifier of the goal to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> deleteAsync(String goalId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(goalId), serviceCallback);
    }

    /**
     * Delete a goal instance.
     *
     * @param goalId The identifier of the goal to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deleteAsync(String goalId) {
        return deleteWithServiceResponseAsync(goalId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a goal instance.
     *
     * @param goalId The identifier of the goal to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteWithServiceResponseAsync(String goalId) {
        if (goalId == null) {
            throw new IllegalArgumentException("Parameter goalId is required and cannot be null.");
        }
        return service.delete(goalId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a collection of the active goals.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GoalsResponse object if successful.
     */
    public GoalsResponse getActive() {
        return getActiveWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get a collection of the active goals.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GoalsResponse> getActiveAsync(final ServiceCallback<GoalsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getActiveWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a collection of the active goals.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<GoalsResponse> getActiveAsync() {
        return getActiveWithServiceResponseAsync().map(new Func1<ServiceResponse<GoalsResponse>, GoalsResponse>() {
            @Override
            public GoalsResponse call(ServiceResponse<GoalsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a collection of the active goals.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<ServiceResponse<GoalsResponse>> getActiveWithServiceResponseAsync() {
        final String types = null;
        final String windowTypes = null;
        return service.getActive(types, windowTypes)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GoalsResponse>>>() {
                @Override
                public Observable<ServiceResponse<GoalsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GoalsResponse> clientResponse = getActiveDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get a collection of the active goals.
     *
     * @param types The goal types(e.g Steps, CaloriesBurned) filter.
     * @param windowTypes The goal window types(e.g Daily, Weekly) filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GoalsResponse object if successful.
     */
    public GoalsResponse getActive(String types, String windowTypes) {
        return getActiveWithServiceResponseAsync(types, windowTypes).toBlocking().single().body();
    }

    /**
     * Get a collection of the active goals.
     *
     * @param types The goal types(e.g Steps, CaloriesBurned) filter.
     * @param windowTypes The goal window types(e.g Daily, Weekly) filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GoalsResponse> getActiveAsync(String types, String windowTypes, final ServiceCallback<GoalsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getActiveWithServiceResponseAsync(types, windowTypes), serviceCallback);
    }

    /**
     * Get a collection of the active goals.
     *
     * @param types The goal types(e.g Steps, CaloriesBurned) filter.
     * @param windowTypes The goal window types(e.g Daily, Weekly) filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<GoalsResponse> getActiveAsync(String types, String windowTypes) {
        return getActiveWithServiceResponseAsync(types, windowTypes).map(new Func1<ServiceResponse<GoalsResponse>, GoalsResponse>() {
            @Override
            public GoalsResponse call(ServiceResponse<GoalsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a collection of the active goals.
     *
     * @param types The goal types(e.g Steps, CaloriesBurned) filter.
     * @param windowTypes The goal window types(e.g Daily, Weekly) filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GoalsResponse object
     */
    public Observable<ServiceResponse<GoalsResponse>> getActiveWithServiceResponseAsync(String types, String windowTypes) {
        return service.getActive(types, windowTypes)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GoalsResponse>>>() {
                @Override
                public Observable<ServiceResponse<GoalsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GoalsResponse> clientResponse = getActiveDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GoalsResponse> getActiveDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<GoalsResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GoalsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}