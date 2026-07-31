package io.ktor.client.call;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedCall.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", l = {36}, m = "save")
/* loaded from: classes10.dex */
final class SavedCallKt$save$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    SavedCallKt$save$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SavedCallKt.save(null, this);
    }
}
