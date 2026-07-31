package io.ktor.client.engine.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidClientEngine.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.android.AndroidClientEngineKt", f = "AndroidClientEngine.kt", l = {120, 128, 134}, m = "writeTo")
/* loaded from: classes4.dex */
final class AndroidClientEngineKt$writeTo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    AndroidClientEngineKt$writeTo$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AndroidClientEngineKt.writeTo(null, null, null, this);
    }
}
