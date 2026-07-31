package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.zm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4532zm extends SuspendLambda implements Function2 {
    public final /* synthetic */ Nm a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4532zm(Nm nm, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.a = nm;
        this.b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4532zm(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4532zm(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4493y9 c4493y9 = this.a.e;
        if (c4493y9 != null) {
            c4493y9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        Un.a(this.a.j);
        this.b.addView(this.a.j);
        return Unit.INSTANCE;
    }
}
