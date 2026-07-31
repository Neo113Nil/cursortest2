package com.composeunstyled;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composeunstyled.SliderKt", f = "Slider.kt", i = {0, 0}, l = {115}, m = "waitRelease", n = {"$this$waitRelease", "pass"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class SliderKt$waitRelease$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    SliderKt$waitRelease$1(Continuation<? super SliderKt$waitRelease$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SliderKt.waitRelease(null, null, this);
    }
}
