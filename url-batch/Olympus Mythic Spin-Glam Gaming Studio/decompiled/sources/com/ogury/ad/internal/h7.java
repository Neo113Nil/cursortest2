package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.MutablePreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final class h7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(String str, Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h7 h7Var = new h7(this.b, continuation);
        h7Var.a = obj;
        return h7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        h7 h7Var = new h7(this.b, (Continuation) obj2);
        h7Var.a = (MutablePreferences) obj;
        return h7Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((MutablePreferences) this.a).set(l7.c, this.b);
        return Unit.INSTANCE;
    }
}
