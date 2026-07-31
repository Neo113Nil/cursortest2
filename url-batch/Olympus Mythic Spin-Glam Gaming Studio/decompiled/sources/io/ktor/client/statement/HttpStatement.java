package io.ktor.client.statement;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCallKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.utils.io.ByteReadChannelKt;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* compiled from: HttpStatement.kt */
/* loaded from: classes10.dex */
public final class HttpStatement {
    private final HttpRequestBuilder builder;
    private final HttpClient client;

    public HttpStatement(HttpRequestBuilder builder, HttpClient client) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.builder = builder;
        this.client = client;
    }

    public final Object execute(Continuation continuation) {
        return fetchResponse(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchResponse(Continuation continuation) {
        HttpStatement$fetchResponse$1 httpStatement$fetchResponse$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        HttpClientCall httpClientCall;
        try {
            if (continuation instanceof HttpStatement$fetchResponse$1) {
                httpStatement$fetchResponse$1 = (HttpStatement$fetchResponse$1) continuation;
                int i2 = httpStatement$fetchResponse$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    httpStatement$fetchResponse$1.label = i2 - Integer.MIN_VALUE;
                    obj = httpStatement$fetchResponse$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$fetchResponse$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HttpRequestBuilder takeFromWithExecutionContext = new HttpRequestBuilder().takeFromWithExecutionContext(this.builder);
                        HttpClient httpClient = this.client;
                        httpStatement$fetchResponse$1.label = 1;
                        obj = httpClient.execute$ktor_client_core(takeFromWithExecutionContext, httpStatement$fetchResponse$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                HttpResponse httpResponse = (HttpResponse) httpStatement$fetchResponse$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                return httpResponse;
                            }
                            httpClientCall = (HttpClientCall) httpStatement$fetchResponse$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            HttpResponse response = ((HttpClientCall) obj).getResponse();
                            HttpResponse response2 = httpClientCall.getResponse();
                            httpStatement$fetchResponse$1.L$0 = response;
                            httpStatement$fetchResponse$1.label = 3;
                            return cleanup(response2, httpStatement$fetchResponse$1) == coroutine_suspended ? coroutine_suspended : response;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    httpClientCall = (HttpClientCall) obj;
                    httpStatement$fetchResponse$1.L$0 = httpClientCall;
                    httpStatement$fetchResponse$1.label = 2;
                    obj = SavedCallKt.save(httpClientCall, httpStatement$fetchResponse$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HttpResponse response3 = ((HttpClientCall) obj).getResponse();
                    HttpResponse response22 = httpClientCall.getResponse();
                    httpStatement$fetchResponse$1.L$0 = response3;
                    httpStatement$fetchResponse$1.label = 3;
                    if (cleanup(response22, httpStatement$fetchResponse$1) == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            httpClientCall = (HttpClientCall) obj;
            httpStatement$fetchResponse$1.L$0 = httpClientCall;
            httpStatement$fetchResponse$1.label = 2;
            obj = SavedCallKt.save(httpClientCall, httpStatement$fetchResponse$1);
            if (obj == coroutine_suspended) {
            }
            HttpResponse response32 = ((HttpClientCall) obj).getResponse();
            HttpResponse response222 = httpClientCall.getResponse();
            httpStatement$fetchResponse$1.L$0 = response32;
            httpStatement$fetchResponse$1.label = 3;
            if (cleanup(response222, httpStatement$fetchResponse$1) == coroutine_suspended) {
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$fetchResponse$1 = new HttpStatement$fetchResponse$1(this, continuation);
        obj = httpStatement$fetchResponse$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$fetchResponse$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(HttpResponse httpResponse, Continuation continuation) {
        HttpStatement$cleanup$1 httpStatement$cleanup$1;
        int i;
        if (continuation instanceof HttpStatement$cleanup$1) {
            httpStatement$cleanup$1 = (HttpStatement$cleanup$1) continuation;
            int i2 = httpStatement$cleanup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpStatement$cleanup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = httpStatement$cleanup$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpStatement$cleanup$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = httpResponse.getCoroutineContext().get(Job.Key);
                    Intrinsics.checkNotNull(element);
                    CompletableJob completableJob = (CompletableJob) element;
                    completableJob.complete();
                    try {
                        ByteReadChannelKt.cancel(httpResponse.getRawContent());
                    } catch (Throwable unused) {
                    }
                    httpStatement$cleanup$1.L$0 = completableJob;
                    httpStatement$cleanup$1.label = 1;
                    if (completableJob.join(httpStatement$cleanup$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        httpStatement$cleanup$1 = new HttpStatement$cleanup$1(this, continuation);
        Object obj2 = httpStatement$cleanup$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$cleanup$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public String toString() {
        return "HttpStatement[" + this.builder.getUrl() + ']';
    }
}
