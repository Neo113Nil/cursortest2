package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.MutablePreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final class f6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(String str, Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f6 f6Var = new f6(this.b, continuation);
        f6Var.a = obj;
        return f6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        f6 f6Var = new f6(this.b, (Continuation) obj2);
        f6Var.a = (MutablePreferences) obj;
        return f6Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        g6.f.getClass();
        mutablePreferences.set(g6.i, Boxing.boxInt(1));
        mutablePreferences.set(g6.h, this.b);
        return Unit.INSTANCE;
    }
}
