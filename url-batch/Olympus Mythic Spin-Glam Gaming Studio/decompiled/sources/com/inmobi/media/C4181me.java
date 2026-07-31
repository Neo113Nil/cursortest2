package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.me, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4181me extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4235oe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4181me(C4235oe c4235oe, Continuation continuation) {
        super(2, continuation);
        this.a = c4235oe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4181me(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4181me(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.g.setActivated(true);
        this.a.g.setFocusable(true);
        C4235oe c4235oe = this.a;
        if (c4235oe.i) {
            c4235oe.a();
        } else {
            X4.a(c4235oe.b, new C4208ne(c4235oe, null));
        }
        return Unit.INSTANCE;
    }
}
