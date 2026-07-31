package io.ktor.http.cio;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Multipart.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 136}, m = "parsePartBodyImpl")
/* loaded from: classes12.dex */
final class MultipartKt$parsePartBodyImpl$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    MultipartKt$parsePartBodyImpl$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object parsePartBodyImpl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parsePartBodyImpl = MultipartKt.parsePartBodyImpl(null, null, null, null, 0L, this);
        return parsePartBodyImpl;
    }
}
