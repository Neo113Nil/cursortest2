package com.unity3d.ads.core.domain.exposure;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1", f = "CommonAdViewerExposedFunctions.kt", l = {89}, m = "invoke")
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$getAdContext$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(CommonAdViewerExposedFunctionsKt$getAdContext$1 commonAdViewerExposedFunctionsKt$getAdContext$1, Continuation continuation) {
        super(continuation);
        this.this$0 = commonAdViewerExposedFunctionsKt$getAdContext$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (Continuation) this);
    }
}
