package io.ktor.utils.io;

import com.safedk.android.analytics.brandsafety.FileUploadManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {393}, m = FileUploadManager.m)
/* loaded from: classes8.dex */
final class ByteReadChannelOperationsKt$discard$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$discard$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.discard(null, 0L, this);
    }
}
