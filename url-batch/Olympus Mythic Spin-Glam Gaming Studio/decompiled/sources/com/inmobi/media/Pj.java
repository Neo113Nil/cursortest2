package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes13.dex */
public final class Pj extends SuspendLambda implements Function2 {
    public final /* synthetic */ Vj a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pj(Vj vj, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.a = vj;
        this.b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pj(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Pj(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4493y9 c4493y9 = this.a.e;
        if (c4493y9 != null) {
            c4493y9.a("StaticExperienceManager", "inflate called - adding ImageView to parent layout");
        }
        Un.a(this.a.g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.b.addView(this.a.g, layoutParams);
        return Unit.INSTANCE;
    }
}
