package io.ktor.client.plugins;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCallKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.ByteReadChannelKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* compiled from: SaveBody.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1", f = "SaveBody.kt", l = {45, 52}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DoubleReceivePluginKt$SaveBody$1$1 extends SuspendLambda implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    DoubleReceivePluginKt$SaveBody$1$1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext pipelineContext, HttpResponse httpResponse, Continuation continuation) {
        DoubleReceivePluginKt$SaveBody$1$1 doubleReceivePluginKt$SaveBody$1$1 = new DoubleReceivePluginKt$SaveBody$1$1(continuation);
        doubleReceivePluginKt$SaveBody$1$1.L$0 = pipelineContext;
        doubleReceivePluginKt$SaveBody$1$1.L$1 = httpResponse;
        return doubleReceivePluginKt$SaveBody$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:(1:(3:5|6|7)(2:9|10))(3:11|12|13))(2:38|(4:40|(1:42)|43|44)(5:45|46|(1:48)|49|(1:51)(1:52)))|14|15|16|17|(1:19)|20|(1:22)|6|7) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r4 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PipelineContext pipelineContext;
        AttributeKey attributeKey;
        HttpResponse httpResponse;
        Throwable th;
        Logger logger;
        Attributes attributes;
        Logger logger2;
        Object m8023constructorimpl;
        Throwable m8026exceptionOrNullimpl;
        Logger logger3;
        AttributeKey attributeKey2;
        Logger logger4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pipelineContext = (PipelineContext) this.L$0;
            HttpResponse httpResponse2 = (HttpResponse) this.L$1;
            HttpClientCall call = httpResponse2.getCall();
            Attributes attributes2 = call.getAttributes();
            attributeKey = DoubleReceivePluginKt.SKIP_SAVE_BODY;
            if (attributes2.contains(attributeKey)) {
                logger2 = DoubleReceivePluginKt.getLOGGER();
                if (LoggerJvmKt.isTraceEnabled(logger2)) {
                    logger2.trace("Skipping body saving for " + call.getRequest().getUrl());
                }
                return Unit.INSTANCE;
            }
            try {
                logger = DoubleReceivePluginKt.getLOGGER();
                if (LoggerJvmKt.isTraceEnabled(logger)) {
                    logger.trace("Saving body for " + call.getRequest().getUrl());
                }
                this.L$0 = pipelineContext;
                this.L$1 = httpResponse2;
                this.L$2 = attributes2;
                this.label = 1;
                Object save = SavedCallKt.save(call, this);
                if (save == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpResponse = httpResponse2;
                obj = save;
                attributes = attributes2;
            } catch (Throwable th2) {
                httpResponse = httpResponse2;
                th = th2;
                Result.Companion companion = Result.INSTANCE;
                ByteReadChannelKt.cancel(httpResponse.getRawContent());
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            attributes = (Attributes) this.L$2;
            httpResponse = (HttpResponse) this.L$1;
            pipelineContext = (PipelineContext) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    ByteReadChannelKt.cancel(httpResponse.getRawContent());
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th4) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th4));
                }
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    throw th;
                }
                logger3 = DoubleReceivePluginKt.getLOGGER();
                logger3.debug("Failed to cancel response body", m8026exceptionOrNullimpl);
                throw th;
            }
        }
        HttpResponse response = ((HttpClientCall) obj).getResponse();
        Result.Companion companion4 = Result.INSTANCE;
        ByteReadChannelKt.cancel(httpResponse.getRawContent());
        Object m8023constructorimpl2 = Result.m8023constructorimpl(Unit.INSTANCE);
        Throwable m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
        if (m8026exceptionOrNullimpl2 != null) {
            logger4 = DoubleReceivePluginKt.getLOGGER();
            logger4.debug("Failed to cancel response body", m8026exceptionOrNullimpl2);
        }
        attributeKey2 = DoubleReceivePluginKt.RESPONSE_BODY_SAVED;
        attributes.put(attributeKey2, Unit.INSTANCE);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        if (pipelineContext.proceedWith(response, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
