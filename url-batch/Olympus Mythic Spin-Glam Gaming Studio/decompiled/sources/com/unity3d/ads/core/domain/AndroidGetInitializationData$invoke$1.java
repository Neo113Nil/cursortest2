package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGetInitializationData.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationData", f = "AndroidGetInitializationData.kt", l = {10, 11}, m = "invoke")
/* loaded from: classes14.dex */
final class AndroidGetInitializationData$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetInitializationData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetInitializationData$invoke$1(AndroidGetInitializationData androidGetInitializationData, Continuation continuation) {
        super(continuation);
        this.this$0 = androidGetInitializationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
