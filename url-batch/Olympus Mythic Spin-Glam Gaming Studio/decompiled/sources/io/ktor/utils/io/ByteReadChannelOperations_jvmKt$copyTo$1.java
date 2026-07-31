package io.ktor.utils.io;

import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteReadChannelOperations.jvm.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "copyTo")
/* loaded from: classes14.dex */
final class ByteReadChannelOperations_jvmKt$copyTo$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperations_jvmKt$copyTo$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperations_jvmKt.copyTo(null, null, 0L, this);
    }
}
