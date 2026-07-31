package io.ktor.client.plugins;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCallValidator.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "HttpCallValidator$lambda$2$processException")
/* loaded from: classes11.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$processException$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    HttpCallValidatorKt$HttpCallValidator$2$processException$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object HttpCallValidator$lambda$2$processException;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        HttpCallValidator$lambda$2$processException = HttpCallValidatorKt.HttpCallValidator$lambda$2$processException(null, null, null, this);
        return HttpCallValidator$lambda$2$processException;
    }
}
