package io.ktor.client.plugins;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.cio.CIOMultipartDataBase;
import io.ktor.http.content.MultiPartData;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.DeprecationKt;
import io.ktor.utils.io.WriterJob;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.io.Source;
import org.slf4j.Logger;

/* compiled from: DefaultTransform.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER, 81, 81, 85, 92, 116, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class DefaultTransformKt$defaultTransformers$2 extends SuspendLambda implements Function3 {
    final /* synthetic */ HttpClient $this_defaultTransformers;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultTransformKt$defaultTransformers$2(HttpClient httpClient, Continuation continuation) {
        super(3, continuation);
        this.$this_defaultTransformers = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext pipelineContext, HttpResponseContainer httpResponseContainer, Continuation continuation) {
        DefaultTransformKt$defaultTransformers$2 defaultTransformKt$defaultTransformers$2 = new DefaultTransformKt$defaultTransformers$2(this.$this_defaultTransformers, continuation);
        defaultTransformKt$defaultTransformers$2.L$0 = pipelineContext;
        defaultTransformKt$defaultTransformers$2.L$1 = httpResponseContainer;
        return defaultTransformKt$defaultTransformers$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x032f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PipelineContext pipelineContext;
        TypeInfo component1;
        Object readRemaining;
        PipelineContext pipelineContext2;
        PipelineContext pipelineContext3;
        TypeInfo typeInfo;
        TypeInfo typeInfo2;
        Object proceedWith;
        TypeInfo typeInfo3;
        Object proceedWith2;
        Object proceedWith3;
        Object byteArray;
        PipelineContext pipelineContext4;
        TypeInfo typeInfo4;
        Object readRemaining2;
        PipelineContext pipelineContext5;
        TypeInfo typeInfo5;
        TypeInfo typeInfo6;
        Object proceedWith4;
        Object proceedWith5;
        TypeInfo typeInfo7;
        Object proceedWith6;
        Object proceedWith7;
        Logger logger;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        HttpResponseContainer httpResponseContainer = null;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                pipelineContext = (PipelineContext) this.L$0;
                HttpResponseContainer httpResponseContainer2 = (HttpResponseContainer) this.L$1;
                component1 = httpResponseContainer2.component1();
                Object component2 = httpResponseContainer2.component2();
                if (!(component2 instanceof ByteReadChannel)) {
                    return Unit.INSTANCE;
                }
                HttpResponse response = ((HttpClientCall) pipelineContext.getContext()).getResponse();
                KClass type = component1.getType();
                if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Unit.class))) {
                    ByteReadChannelKt.cancel((ByteReadChannel) component2);
                    HttpResponseContainer httpResponseContainer3 = new HttpResponseContainer(component1, Unit.INSTANCE);
                    this.L$0 = pipelineContext;
                    this.L$1 = component1;
                    this.label = 1;
                    proceedWith4 = pipelineContext.proceedWith(httpResponseContainer3, this);
                    if (proceedWith4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo3 = component1;
                    httpResponseContainer = (HttpResponseContainer) proceedWith4;
                    component1 = typeInfo3;
                    if (httpResponseContainer != null) {
                        logger = DefaultTransformKt.LOGGER;
                        logger.trace("Transformed with default transformers response body for " + ((HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + " to " + component1.getType());
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    this.L$0 = pipelineContext;
                    this.L$1 = component1;
                    this.L$2 = pipelineContext;
                    this.L$3 = component1;
                    this.label = 2;
                    readRemaining2 = ByteReadChannelOperationsKt.readRemaining((ByteReadChannel) component2, this);
                    if (readRemaining2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext2 = pipelineContext;
                    pipelineContext5 = pipelineContext2;
                    typeInfo5 = component1;
                    typeInfo6 = typeInfo5;
                    HttpResponseContainer httpResponseContainer4 = new HttpResponseContainer(typeInfo5, Boxing.boxInt(Integer.parseInt(DeprecationKt.readText((Source) readRemaining2))));
                    this.L$0 = pipelineContext2;
                    this.L$1 = typeInfo6;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    proceedWith5 = pipelineContext5.proceedWith(httpResponseContainer4, this);
                    if (proceedWith5 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo7 = typeInfo6;
                    httpResponseContainer = (HttpResponseContainer) proceedWith5;
                    component1 = typeInfo7;
                    pipelineContext = pipelineContext2;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Source.class)) || Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Source.class))) {
                    this.L$0 = pipelineContext;
                    this.L$1 = component1;
                    this.L$2 = pipelineContext;
                    this.L$3 = component1;
                    this.label = 4;
                    readRemaining = ByteReadChannelOperationsKt.readRemaining((ByteReadChannel) component2, this);
                    if (readRemaining == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext2 = pipelineContext;
                    pipelineContext3 = pipelineContext2;
                    typeInfo = component1;
                    typeInfo2 = typeInfo;
                    HttpResponseContainer httpResponseContainer5 = new HttpResponseContainer(typeInfo, readRemaining);
                    this.L$0 = pipelineContext2;
                    this.L$1 = typeInfo2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 5;
                    proceedWith6 = pipelineContext3.proceedWith(httpResponseContainer5, this);
                    if (proceedWith6 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo7 = typeInfo2;
                    httpResponseContainer = (HttpResponseContainer) proceedWith6;
                    component1 = typeInfo7;
                    pipelineContext = pipelineContext2;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(byte[].class))) {
                    this.L$0 = pipelineContext;
                    this.L$1 = component1;
                    this.label = 6;
                    byteArray = ByteReadChannelOperationsKt.toByteArray((ByteReadChannel) component2, this);
                    if (byteArray == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext4 = pipelineContext;
                    typeInfo4 = component1;
                    UtilsKt.checkContentLength(HttpMessagePropertiesKt.contentLength(((HttpClientCall) pipelineContext4.getContext()).getResponse()), r3.length, ((HttpClientCall) pipelineContext4.getContext()).getRequest().getMethod());
                    HttpResponseContainer httpResponseContainer6 = new HttpResponseContainer(typeInfo4, (byte[]) byteArray);
                    this.L$0 = pipelineContext4;
                    this.L$1 = typeInfo4;
                    this.label = 7;
                    proceedWith7 = pipelineContext4.proceedWith(httpResponseContainer6, this);
                    if (proceedWith7 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo3 = typeInfo4;
                    pipelineContext = pipelineContext4;
                    httpResponseContainer = (HttpResponseContainer) proceedWith7;
                    component1 = typeInfo3;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(ByteReadChannel.class))) {
                    final CompletableJob Job = JobKt.Job((Job) response.getCoroutineContext().get(Job.Key));
                    WriterJob writer$default = ByteWriteChannelOperationsKt.writer$default(pipelineContext, this.$this_defaultTransformers.getCoroutineContext(), false, new DefaultTransformKt$defaultTransformers$2$result$channel$1(component2, response, null), 2, null);
                    ByteWriteChannelOperationsKt.invokeOnCompletion(writer$default, new Function1() { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$1$lambda$0;
                            invokeSuspend$lambda$1$lambda$0 = DefaultTransformKt$defaultTransformers$2.invokeSuspend$lambda$1$lambda$0(CompletableJob.this, (Throwable) obj2);
                            return invokeSuspend$lambda$1$lambda$0;
                        }
                    });
                    HttpResponseContainer httpResponseContainer7 = new HttpResponseContainer(component1, writer$default.getChannel());
                    this.L$0 = pipelineContext;
                    this.L$1 = component1;
                    this.label = 8;
                    proceedWith3 = pipelineContext.proceedWith(httpResponseContainer7, this);
                    if (proceedWith3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo3 = component1;
                    httpResponseContainer = (HttpResponseContainer) proceedWith3;
                    component1 = typeInfo3;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(HttpStatusCode.class))) {
                    ByteReadChannelKt.cancel((ByteReadChannel) component2);
                    HttpResponseContainer httpResponseContainer8 = new HttpResponseContainer(component1, response.getStatus());
                    this.L$0 = pipelineContext;
                    this.L$1 = component1;
                    this.label = 9;
                    proceedWith2 = pipelineContext.proceedWith(httpResponseContainer8, this);
                    if (proceedWith2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo3 = component1;
                    httpResponseContainer = (HttpResponseContainer) proceedWith2;
                    component1 = typeInfo3;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(MultiPartData.class))) {
                    Headers headers = ((HttpClientCall) pipelineContext.getContext()).getResponse().getHeaders();
                    HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                    String str = headers.get(httpHeaders.getContentType());
                    if (str == null) {
                        throw new IllegalStateException("No content type provided for multipart");
                    }
                    ContentType parse = ContentType.Companion.parse(str);
                    if (!parse.match(ContentType.MultiPart.INSTANCE.getFormData())) {
                        throw new IllegalStateException(("Expected multipart/form-data, got " + parse).toString());
                    }
                    String str2 = ((HttpClientCall) pipelineContext.getContext()).getResponse().getHeaders().get(httpHeaders.getContentLength());
                    HttpResponseContainer httpResponseContainer9 = new HttpResponseContainer(component1, new CIOMultipartDataBase(pipelineContext.getCoroutineContext(), (ByteReadChannel) component2, str, str2 != null ? Boxing.boxLong(Long.parseLong(str2)) : null, 0L, 16, null));
                    this.L$0 = pipelineContext;
                    this.L$1 = component1;
                    this.label = 10;
                    proceedWith = pipelineContext.proceedWith(httpResponseContainer9, this);
                    if (proceedWith == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo3 = component1;
                    httpResponseContainer = (HttpResponseContainer) proceedWith;
                    component1 = typeInfo3;
                }
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 1:
                typeInfo3 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith4 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith4;
                component1 = typeInfo3;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 2:
                typeInfo5 = (TypeInfo) this.L$3;
                PipelineContext pipelineContext6 = (PipelineContext) this.L$2;
                typeInfo6 = (TypeInfo) this.L$1;
                pipelineContext2 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext5 = pipelineContext6;
                readRemaining2 = obj;
                HttpResponseContainer httpResponseContainer42 = new HttpResponseContainer(typeInfo5, Boxing.boxInt(Integer.parseInt(DeprecationKt.readText((Source) readRemaining2))));
                this.L$0 = pipelineContext2;
                this.L$1 = typeInfo6;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                proceedWith5 = pipelineContext5.proceedWith(httpResponseContainer42, this);
                if (proceedWith5 != coroutine_suspended) {
                }
                break;
            case 3:
                typeInfo7 = (TypeInfo) this.L$1;
                PipelineContext pipelineContext7 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext2 = pipelineContext7;
                proceedWith5 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith5;
                component1 = typeInfo7;
                pipelineContext = pipelineContext2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 4:
                typeInfo = (TypeInfo) this.L$3;
                PipelineContext pipelineContext8 = (PipelineContext) this.L$2;
                typeInfo2 = (TypeInfo) this.L$1;
                pipelineContext2 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext3 = pipelineContext8;
                readRemaining = obj;
                HttpResponseContainer httpResponseContainer52 = new HttpResponseContainer(typeInfo, readRemaining);
                this.L$0 = pipelineContext2;
                this.L$1 = typeInfo2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                proceedWith6 = pipelineContext3.proceedWith(httpResponseContainer52, this);
                if (proceedWith6 != coroutine_suspended) {
                }
                break;
            case 5:
                typeInfo7 = (TypeInfo) this.L$1;
                PipelineContext pipelineContext9 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext2 = pipelineContext9;
                proceedWith6 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith6;
                component1 = typeInfo7;
                pipelineContext = pipelineContext2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 6:
                typeInfo4 = (TypeInfo) this.L$1;
                PipelineContext pipelineContext10 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext4 = pipelineContext10;
                byteArray = obj;
                UtilsKt.checkContentLength(HttpMessagePropertiesKt.contentLength(((HttpClientCall) pipelineContext4.getContext()).getResponse()), r3.length, ((HttpClientCall) pipelineContext4.getContext()).getRequest().getMethod());
                HttpResponseContainer httpResponseContainer62 = new HttpResponseContainer(typeInfo4, (byte[]) byteArray);
                this.L$0 = pipelineContext4;
                this.L$1 = typeInfo4;
                this.label = 7;
                proceedWith7 = pipelineContext4.proceedWith(httpResponseContainer62, this);
                if (proceedWith7 != coroutine_suspended) {
                }
                break;
            case 7:
                typeInfo3 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith7 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith7;
                component1 = typeInfo3;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 8:
                typeInfo3 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith3 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith3;
                component1 = typeInfo3;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 9:
                typeInfo3 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith2 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith2;
                component1 = typeInfo3;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 10:
                typeInfo3 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith;
                component1 = typeInfo3;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(CompletableJob completableJob, Throwable th) {
        completableJob.complete();
        return Unit.INSTANCE;
    }
}
