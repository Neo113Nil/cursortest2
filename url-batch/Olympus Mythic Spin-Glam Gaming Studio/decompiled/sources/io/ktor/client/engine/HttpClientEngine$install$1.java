package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ClientEventsKt;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: HttpClientEngine.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {154, 166}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HttpClientEngine$install$1 extends SuspendLambda implements Function3 {
    final /* synthetic */ HttpClient $client;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ HttpClientEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientEngine$install$1(HttpClient httpClient, HttpClientEngine httpClientEngine, Continuation continuation) {
        super(3, continuation);
        this.$client = httpClient;
        this.this$0 = httpClientEngine;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext pipelineContext, Object obj, Continuation continuation) {
        HttpClientEngine$install$1 httpClientEngine$install$1 = new HttpClientEngine$install$1(this.$client, this.this$0, continuation);
        httpClientEngine$install$1.L$0 = pipelineContext;
        httpClientEngine$install$1.L$1 = obj;
        return httpClientEngine$install$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KType kType;
        HttpRequestData build;
        Object executeWithinCallContext;
        PipelineContext pipelineContext;
        KType kType2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
            httpRequestBuilder.takeFromWithExecutionContext((HttpRequestBuilder) pipelineContext2.getContext());
            if (obj2 == null) {
                httpRequestBuilder.setBody(NullBody.INSTANCE);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                try {
                    kType2 = Reflection.typeOf(Object.class);
                } catch (Throwable unused) {
                    kType2 = null;
                }
                httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass, kType2));
            } else if (obj2 instanceof OutgoingContent) {
                httpRequestBuilder.setBody(obj2);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj2);
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                try {
                    kType = Reflection.typeOf(Object.class);
                } catch (Throwable unused2) {
                    kType = null;
                }
                httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass2, kType));
            }
            this.$client.getMonitor().raise(ClientEventsKt.getHttpRequestIsReadyForSending(), httpRequestBuilder);
            build = httpRequestBuilder.build();
            build.getAttributes().put(HttpClientEngineKt.getCLIENT_CONFIG(), this.$client.getConfig$ktor_client_core());
            HttpClientEngineKt.validateHeaders(build);
            HttpClientEngine.DefaultImpls.checkExtensions(this.this$0, build);
            HttpClientEngine httpClientEngine = this.this$0;
            this.L$0 = pipelineContext2;
            this.L$1 = build;
            this.label = 1;
            executeWithinCallContext = HttpClientEngine.DefaultImpls.executeWithinCallContext(httpClientEngine, build, this);
            if (executeWithinCallContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            pipelineContext = pipelineContext2;
            obj = executeWithinCallContext;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            build = (HttpRequestData) this.L$1;
            pipelineContext = (PipelineContext) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        HttpClientCall httpClientCall = new HttpClientCall(this.$client, build, (HttpResponseData) obj);
        final HttpResponse response = httpClientCall.getResponse();
        this.$client.getMonitor().raise(ClientEventsKt.getHttpResponseReceived(), response);
        Job job = JobKt.getJob(response.getCoroutineContext());
        final HttpClient httpClient = this.$client;
        job.invokeOnCompletion(new Function1() { // from class: io.ktor.client.engine.HttpClientEngine$install$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Unit invokeSuspend$lambda$2;
                invokeSuspend$lambda$2 = HttpClientEngine$install$1.invokeSuspend$lambda$2(HttpClient.this, response, (Throwable) obj3);
                return invokeSuspend$lambda$2;
            }
        });
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (pipelineContext.proceedWith(httpClientCall, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(HttpClient httpClient, HttpResponse httpResponse, Throwable th) {
        if (th != null) {
            httpClient.getMonitor().raise(ClientEventsKt.getHttpResponseCancelled(), httpResponse);
        }
        return Unit.INSTANCE;
    }
}
