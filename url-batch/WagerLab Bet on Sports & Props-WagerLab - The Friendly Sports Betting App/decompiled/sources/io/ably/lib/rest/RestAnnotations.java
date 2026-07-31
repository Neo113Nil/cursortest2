package io.ably.lib.rest;

import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Annotation;
import io.ably.lib.types.AnnotationAction;
import io.ably.lib.types.AnnotationSerializer;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageDecodeException;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.Log;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class RestAnnotations {
    private static final String TAG = "io.ably.lib.rest.RestAnnotations";
    private final String channelName;
    private final ChannelOptions channelOptions;
    private final ClientOptions clientOptions;
    private final Http http;

    public RestAnnotations(String str, Http http, ClientOptions clientOptions, ChannelOptions channelOptions) {
        this.channelName = str;
        this.http = http;
        this.clientOptions = clientOptions;
        this.channelOptions = channelOptions;
    }

    public PaginatedResult<Annotation> get(String str, Param[] paramArr) throws AblyException {
        validateMessageSerial(str);
        return getImpl(str, paramArr).sync();
    }

    public PaginatedResult<Annotation> get(Message message, Param[] paramArr) throws AblyException {
        return get(message.serial, paramArr);
    }

    public void getAsync(String str, Param[] paramArr, Callback<AsyncPaginatedResult<Annotation>> callback) throws AblyException {
        validateMessageSerial(str);
        getImpl(str, paramArr).async(callback);
    }

    public void getAsync(Message message, Param[] paramArr, Callback<AsyncPaginatedResult<Annotation>> callback) throws AblyException {
        getAsync(message.serial, paramArr, callback);
    }

    public PaginatedResult<Annotation> get(String str) throws AblyException {
        return get(str, (Param[]) null);
    }

    public PaginatedResult<Annotation> get(Message message) throws AblyException {
        return get(message.serial);
    }

    public void getAsync(String str, Callback<AsyncPaginatedResult<Annotation>> callback) throws AblyException {
        validateMessageSerial(str);
        getImpl(str, null).async(callback);
    }

    public void getAsync(Message message, Callback<AsyncPaginatedResult<Annotation>> callback) throws AblyException {
        getAsync(message.serial, callback);
    }

    public void publish(String str, Annotation annotation) throws AblyException {
        validateMessageSerial(str);
        publishImpl(str, annotation).sync();
    }

    public void publish(Message message, Annotation annotation) throws AblyException {
        publish(message.serial, annotation);
    }

    public void publishAsync(String str, Annotation annotation, Callback<Void> callback) throws AblyException {
        validateMessageSerial(str);
        publishImpl(str, annotation).async(callback);
    }

    public void publishAsync(Message message, Annotation annotation, Callback<Void> callback) throws AblyException {
        publishAsync(message.serial, annotation, callback);
    }

    public void delete(String str, Annotation annotation) throws AblyException {
        validateMessageSerial(str);
        deleteImpl(str, annotation).sync();
    }

    public void delete(Message message, Annotation annotation) throws AblyException {
        delete(message.serial, annotation);
    }

    public void deleteAsync(String str, Annotation annotation, Callback<Void> callback) throws AblyException {
        validateMessageSerial(str);
        deleteImpl(str, annotation).async(callback);
    }

    public void deleteAsync(Message message, Annotation annotation, Callback<Void> callback) throws AblyException {
        deleteAsync(message.serial, annotation, callback);
    }

    private void validateMessageSerial(String str) throws AblyException {
        if (str == null) {
            throw AblyException.fromErrorInfo(new ErrorInfo("Message serial can not be empty", 400, 40003));
        }
    }

    private String getBasePath(String str) {
        return "/channels/" + HttpUtils.encodeURIComponent(this.channelName) + "/messages/" + HttpUtils.encodeURIComponent(str) + "/annotations";
    }

    private Http.Request<Void> deleteImpl(String str, Annotation annotation) throws AblyException {
        Log.v(TAG, "delete(): annotation=" + annotation);
        annotation.action = AnnotationAction.ANNOTATION_DELETE;
        return sendAnnotationImpl(str, annotation);
    }

    private Http.Request<Void> publishImpl(String str, Annotation annotation) throws AblyException {
        Log.v(TAG, "publish(): annotation=" + annotation);
        annotation.action = AnnotationAction.ANNOTATION_CREATE;
        return sendAnnotationImpl(str, annotation);
    }

    private Http.Request<Void> sendAnnotationImpl(final String str, final Annotation annotation) throws AblyException {
        if (annotation.type == null) {
            throw AblyException.fromErrorInfo(new ErrorInfo("Annotation type must be specified", 400, 40000));
        }
        annotation.messageSerial = str;
        try {
            annotation.encode(this.channelOptions);
            if (annotation.id == null && this.clientOptions.idempotentRestPublishing) {
                annotation.id = Crypto.getRandomId();
            }
            return this.http.request(new Http.Execute() { // from class: io.ably.lib.rest.RestAnnotations$$ExternalSyntheticLambda0
                @Override // io.ably.lib.http.Http.Execute
                public final void execute(HttpScheduler httpScheduler, Callback callback) {
                    RestAnnotations.this.m11010lambda$sendAnnotationImpl$0$ioablylibrestRestAnnotations(annotation, str, httpScheduler, callback);
                }
            });
        } catch (MessageDecodeException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    /* renamed from: lambda$sendAnnotationImpl$0$io-ably-lib-rest-RestAnnotations, reason: not valid java name */
    /* synthetic */ void m11010lambda$sendAnnotationImpl$0$ioablylibrestRestAnnotations(Annotation annotation, String str, HttpScheduler httpScheduler, Callback callback) throws AblyException {
        Annotation[] annotationArr = {annotation};
        httpScheduler.post(getBasePath(str), HttpUtils.defaultAcceptHeaders(this.clientOptions.useBinaryProtocol), this.clientOptions.addRequestIds ? Param.array(Crypto.generateRandomRequestId()) : null, this.clientOptions.useBinaryProtocol ? AnnotationSerializer.asMsgpackRequest(annotationArr) : AnnotationSerializer.asJsonRequest(annotationArr), null, true, callback);
    }

    private BasePaginatedQuery.ResultRequest<Annotation> getImpl(String str, Param[] paramArr) {
        Log.v(TAG, "getImpl(): params=" + Arrays.toString(paramArr));
        HttpCore.BodyHandler<Annotation> annotationResponseHandler = AnnotationSerializer.getAnnotationResponseHandler(this.channelOptions);
        if (this.clientOptions.addRequestIds) {
            paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
        }
        return new BasePaginatedQuery(this.http, getBasePath(str), HttpUtils.defaultAcceptHeaders(this.clientOptions.useBinaryProtocol), paramArr, annotationResponseHandler).get();
    }
}
