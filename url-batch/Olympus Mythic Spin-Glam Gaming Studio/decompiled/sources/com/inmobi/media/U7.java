package com.inmobi.media;

import android.transition.TransitionManager;
import android.widget.RelativeLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes13.dex */
public final class U7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ V7 a;
    public final /* synthetic */ VideoViewPosition b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7(Continuation continuation, V7 v7, VideoViewPosition videoViewPosition) {
        super(2, continuation);
        this.a = v7;
        this.b = videoViewPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new U7(continuation, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new U7((Continuation) obj2, this.a, this.b).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        TransitionManager.beginDelayedTransition(this.a.n);
        this.a.e.setVideoViewPosition(this.b);
        int b = (int) (R5.b() * this.b.getWidth());
        int b2 = (int) (R5.b() * this.b.getHeight());
        K1 k1 = this.a.n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b2);
        if (this.a.e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (R5.b() * this.b.getX()), (int) (R5.b() * this.b.getY()), 0, 0);
        }
        k1.setLayoutParams(layoutParams);
        if (this.a.i > 0 && this.a.j > 0) {
            V7 v7 = this.a;
            K1 k12 = v7.n;
            int i = v7.i;
            int i2 = this.a.j;
            k12.getClass();
            if (i > 0 && i2 > 0) {
                k12.a = i / i2;
                k12.requestLayout();
            }
        }
        this.a.n.requestLayout();
        return Unit.INSTANCE;
    }
}
