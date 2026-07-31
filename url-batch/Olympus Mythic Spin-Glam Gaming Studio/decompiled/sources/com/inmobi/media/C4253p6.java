package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4253p6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4173m6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C4358t6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4253p6(C4173m6 c4173m6, boolean z, C4358t6 c4358t6, Continuation continuation) {
        super(2, continuation);
        this.a = c4173m6;
        this.b = z;
        this.c = c4358t6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4253p6(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4253p6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
