package io.ktor.client;

import androidx.core.app.NotificationCompat;
import com.my.target.common.models.IAdLoadingError;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.BodyProgressKt;
import io.ktor.client.plugins.DefaultResponseValidationKt;
import io.ktor.client.plugins.DefaultTransformKt;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.plugins.HttpCallValidatorKt;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpPlainTextKt;
import io.ktor.client.plugins.HttpRedirectKt;
import io.ktor.client.plugins.HttpRequestLifecycleKt;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.client.utils.ClientEventsKt;
import io.ktor.client.utils.HttpResponseReceiveFail;
import io.ktor.events.Events;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClient.kt */
/* loaded from: classes14.dex */
public final class HttpClient implements CoroutineScope, Closeable {
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClient.class, "closed");
    private final Attributes attributes;
    private final CompletableJob clientJob;

    @NotNull
    private volatile /* synthetic */ int closed;
    private final HttpClientConfig config;
    private final CoroutineContext coroutineContext;
    private final HttpClientEngine engine;
    private final HttpClientEngineConfig engineConfig;
    private boolean manageEngine;
    private final Events monitor;
    private final HttpReceivePipeline receivePipeline;
    private final HttpRequestPipeline requestPipeline;
    private final HttpResponsePipeline responsePipeline;
    private final HttpSendPipeline sendPipeline;
    private final HttpClientConfig userConfig;

    public HttpClient(HttpClientEngine engine, HttpClientConfig userConfig) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.engine = engine;
        this.userConfig = userConfig;
        boolean z = false;
        this.closed = 0;
        CompletableJob Job = JobKt.Job((Job) engine.getCoroutineContext().get(Job.Key));
        this.clientJob = Job;
        this.coroutineContext = engine.getCoroutineContext().plus(Job);
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.requestPipeline = new HttpRequestPipeline(z, i, defaultConstructorMarker);
        HttpResponsePipeline httpResponsePipeline = new HttpResponsePipeline(z, i, defaultConstructorMarker);
        this.responsePipeline = httpResponsePipeline;
        HttpSendPipeline httpSendPipeline = new HttpSendPipeline(z, i, defaultConstructorMarker);
        this.sendPipeline = httpSendPipeline;
        this.receivePipeline = new HttpReceivePipeline(z, i, defaultConstructorMarker);
        this.attributes = AttributesJvmKt.Attributes(true);
        this.engineConfig = engine.getConfig();
        this.monitor = new Events();
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        this.config = httpClientConfig;
        if (this.manageEngine) {
            Job.invokeOnCompletion(new Function1() { // from class: io.ktor.client.HttpClient$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit _init_$lambda$0;
                    _init_$lambda$0 = HttpClient._init_$lambda$0(HttpClient.this, (Throwable) obj);
                    return _init_$lambda$0;
                }
            });
        }
        engine.install(this);
        httpSendPipeline.intercept(HttpSendPipeline.Phases.getReceive(), new AnonymousClass2(null));
        HttpClientConfig.install$default(httpClientConfig, HttpRequestLifecycleKt.getHttpRequestLifecycle(), null, 2, null);
        HttpClientConfig.install$default(httpClientConfig, BodyProgressKt.getBodyProgress(), null, 2, null);
        HttpClientConfig.install$default(httpClientConfig, DoubleReceivePluginKt.getSaveBody(), null, 2, null);
        if (userConfig.getUseDefaultTransformers()) {
            httpClientConfig.install("DefaultTransformers", new Function1() { // from class: io.ktor.client.HttpClient$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit lambda$2$lambda$1;
                    lambda$2$lambda$1 = HttpClient.lambda$2$lambda$1((HttpClient) obj);
                    return lambda$2$lambda$1;
                }
            });
        }
        HttpClientConfig.install$default(httpClientConfig, HttpSend.Plugin, null, 2, null);
        HttpClientConfig.install$default(httpClientConfig, HttpCallValidatorKt.getHttpCallValidator(), null, 2, null);
        if (userConfig.getFollowRedirects()) {
            HttpClientConfig.install$default(httpClientConfig, HttpRedirectKt.getHttpRedirect(), null, 2, null);
        }
        httpClientConfig.plusAssign(userConfig);
        if (userConfig.getUseDefaultTransformers()) {
            HttpClientConfig.install$default(httpClientConfig, HttpPlainTextKt.getHttpPlainText(), null, 2, null);
        }
        DefaultResponseValidationKt.addDefaultResponseValidation(httpClientConfig);
        httpClientConfig.install(this);
        httpResponsePipeline.intercept(HttpResponsePipeline.Phases.getReceive(), new AnonymousClass4(null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClient(HttpClientEngine engine, HttpClientConfig userConfig, boolean z) {
        this(engine, userConfig);
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.manageEngine = z;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final HttpRequestPipeline getRequestPipeline() {
        return this.requestPipeline;
    }

    public final HttpResponsePipeline getResponsePipeline() {
        return this.responsePipeline;
    }

    public final HttpSendPipeline getSendPipeline() {
        return this.sendPipeline;
    }

    public final HttpReceivePipeline getReceivePipeline() {
        return this.receivePipeline;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final Events getMonitor() {
        return this.monitor;
    }

    public final HttpClientConfig getConfig$ktor_client_core() {
        return this.config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(HttpClient httpClient, Throwable th) {
        if (th != null) {
            CoroutineScopeKt.cancel$default(httpClient.engine, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HttpClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", NotificationCompat.CATEGORY_CALL}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {1370, 1372}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.HttpClient$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function3 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass2(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext pipelineContext, Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = HttpClient.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = obj;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            PipelineContext pipelineContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                obj2 = this.L$1;
                if (!(obj2 instanceof HttpClientCall)) {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + Reflection.getOrCreateKotlinClass(obj2.getClass()) + ").").toString());
                }
                HttpReceivePipeline receivePipeline = HttpClient.this.getReceivePipeline();
                Unit unit = Unit.INSTANCE;
                HttpResponse response = ((HttpClientCall) obj2).getResponse();
                this.L$0 = pipelineContext2;
                this.L$1 = obj2;
                this.label = 1;
                Object execute = receivePipeline.execute(unit, response, this);
                if (execute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pipelineContext = pipelineContext2;
                obj = execute;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            ((HttpClientCall) obj2).setResponse$ktor_client_core((HttpResponse) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (pipelineContext.proceedWith(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$2$lambda$1(HttpClient install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        DefaultTransformKt.defaultTransformers(install);
        return Unit.INSTANCE;
    }

    /* compiled from: HttpClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {IAdLoadingError.LoadErrorType.NOT_FOUND}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.HttpClient$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function3 {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext pipelineContext, HttpResponseContainer httpResponseContainer, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = HttpClient.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = pipelineContext;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PipelineContext pipelineContext;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                try {
                    this.L$0 = pipelineContext2;
                    this.label = 1;
                    Object proceed = pipelineContext2.proceed(this);
                    if (proceed == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext = pipelineContext2;
                    obj = proceed;
                } catch (Throwable th2) {
                    pipelineContext = pipelineContext2;
                    th = th2;
                    HttpClient.this.getMonitor().raise(ClientEventsKt.getHttpResponseReceiveFailed(), new HttpResponseReceiveFail(((HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pipelineContext = (PipelineContext) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    HttpClient.this.getMonitor().raise(ClientEventsKt.getHttpResponseReceiveFailed(), new HttpResponseReceiveFail(((HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute$ktor_client_core(HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
        HttpClient$execute$1 httpClient$execute$1;
        int i;
        if (continuation instanceof HttpClient$execute$1) {
            httpClient$execute$1 = (HttpClient$execute$1) continuation;
            int i2 = httpClient$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpClient$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = httpClient$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpClient$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.monitor.raise(ClientEventsKt.getHttpRequestCreated(), httpRequestBuilder);
                    HttpRequestPipeline httpRequestPipeline = this.requestPipeline;
                    Object body = httpRequestBuilder.getBody();
                    httpClient$execute$1.label = 1;
                    obj = httpRequestPipeline.execute(httpRequestBuilder, body, httpClient$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
                return (HttpClientCall) obj;
            }
        }
        httpClient$execute$1 = new HttpClient$execute$1(this, continuation);
        Object obj2 = httpClient$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClient$execute$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (HttpClientCall) obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            Attributes attributes = (Attributes) this.attributes.get(HttpClientPluginKt.getPLUGIN_INSTALLED_LIST());
            for (AttributeKey attributeKey : attributes.getAllKeys()) {
                Intrinsics.checkNotNull(attributeKey, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object obj = attributes.get(attributeKey);
                if (obj instanceof AutoCloseable) {
                    ((AutoCloseable) obj).close();
                }
            }
            this.clientJob.complete();
            if (this.manageEngine) {
                this.engine.close();
            }
        }
    }

    public String toString() {
        return "HttpClient[" + this.engine + ']';
    }
}
