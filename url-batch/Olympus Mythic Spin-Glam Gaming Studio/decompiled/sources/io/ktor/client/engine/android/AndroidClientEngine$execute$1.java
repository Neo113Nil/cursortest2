package io.ktor.client.engine.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidClientEngine.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.android.AndroidClientEngine", f = "AndroidClientEngine.kt", l = {38, 80, 83}, m = "execute")
/* loaded from: classes13.dex */
final class AndroidClientEngine$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidClientEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidClientEngine$execute$1(AndroidClientEngine androidClientEngine, Continuation continuation) {
        super(continuation);
        this.this$0 = androidClientEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
