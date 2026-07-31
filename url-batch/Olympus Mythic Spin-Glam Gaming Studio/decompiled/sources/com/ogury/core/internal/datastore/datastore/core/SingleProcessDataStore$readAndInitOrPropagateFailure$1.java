package com.ogury.core.internal.datastore.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {298}, m = "readAndInitOrPropagateFailure")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInitOrPropagateFailure$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateFailure$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object readAndInitOrPropagateFailure;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readAndInitOrPropagateFailure = this.this$0.readAndInitOrPropagateFailure(this);
        return readAndInitOrPropagateFailure;
    }
}
