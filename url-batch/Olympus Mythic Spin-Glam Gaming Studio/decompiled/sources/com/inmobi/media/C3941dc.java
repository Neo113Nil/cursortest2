package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.dc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3941dc extends SuspendLambda implements Function1 {
    public final /* synthetic */ Kb a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3941dc(Kb kb, long j, int i, Continuation continuation) {
        super(1, continuation);
        this.a = kb;
        this.b = j;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3941dc(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3941dc) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C3915cc(this.a, this.b, this.c, null), 3, null);
        return Unit.INSTANCE;
    }
}
