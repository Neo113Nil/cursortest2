package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGetUniversalRequestForPayLoad.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad", f = "AndroidGetUniversalRequestForPayLoad.kt", l = {14}, m = "invoke")
/* loaded from: classes10.dex */
final class AndroidGetUniversalRequestForPayLoad$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetUniversalRequestForPayLoad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetUniversalRequestForPayLoad$invoke$1(AndroidGetUniversalRequestForPayLoad androidGetUniversalRequestForPayLoad, Continuation continuation) {
        super(continuation);
        this.this$0 = androidGetUniversalRequestForPayLoad;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
