package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAdRefresh.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidAdRefresh", f = "AndroidAdRefresh.kt", l = {75, 79, 95}, m = "performRefresh")
/* loaded from: classes12.dex */
final class AndroidAdRefresh$performRefresh$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidAdRefresh$performRefresh$1(AndroidAdRefresh androidAdRefresh, Continuation continuation) {
        super(continuation);
        this.this$0 = androidAdRefresh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object performRefresh;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performRefresh = this.this$0.performRefresh(null, this);
        return performRefresh;
    }
}
