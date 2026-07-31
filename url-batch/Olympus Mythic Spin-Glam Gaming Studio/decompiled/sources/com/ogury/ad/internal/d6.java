package com.ogury.ad.internal;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes10.dex */
public final class d6 extends SuspendLambda implements Function2 {
    public Mutex a;
    public g6 b;
    public o5 c;
    public int d;
    public final /* synthetic */ g6 e;
    public final /* synthetic */ o5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(g6 g6Var, o5 o5Var, Continuation continuation) {
        super(2, continuation);
        this.e = g6Var;
        this.f = o5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d6(this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d6(this.e, this.f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        o5 o5Var;
        g6 g6Var;
        Mutex mutex2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                g6 g6Var2 = this.e;
                mutex = g6Var2.c;
                o5Var = this.f;
                this.a = mutex;
                this.b = g6Var2;
                this.c = o5Var;
                this.d = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    g6Var = g6Var2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = this.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    mutex = mutex2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            o5 o5Var2 = this.c;
            g6Var = this.b;
            Mutex mutex3 = this.a;
            ResultKt.throwOnFailure(obj);
            o5Var = o5Var2;
            mutex = mutex3;
            g6Var.d.add(o5Var);
            ArrayList arrayList = g6Var.d;
            this.a = mutex;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (g6Var.a(arrayList, this) != coroutine_suspended) {
                mutex2 = mutex;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return unit2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }
}
