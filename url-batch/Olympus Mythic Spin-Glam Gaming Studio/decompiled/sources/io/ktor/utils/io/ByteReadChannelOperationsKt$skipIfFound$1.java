package io.ktor.utils.io;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {598, CommonGatewayClient.CODE_599}, m = "skipIfFound")
/* loaded from: classes8.dex */
final class ByteReadChannelOperationsKt$skipIfFound$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$skipIfFound$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.skipIfFound(null, null, this);
    }
}
