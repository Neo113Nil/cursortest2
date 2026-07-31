package com.inmobi.media;

import android.app.Activity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.eg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3971eg extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3999fg b;
    public final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3971eg(C3999fg c3999fg, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.b = c3999fg;
        this.c = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3971eg(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3971eg(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3999fg c3999fg = this.b;
            Activity activity = this.c;
            this.a = 1;
            if (c3999fg.a(activity, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
