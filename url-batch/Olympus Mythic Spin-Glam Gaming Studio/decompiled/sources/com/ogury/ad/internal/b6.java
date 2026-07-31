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
public final class b6 extends SuspendLambda implements Function2 {
    public Mutex a;
    public g6 b;
    public ArrayList c;
    public int d;
    public final /* synthetic */ g6 e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(g6 g6Var, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.e = g6Var;
        this.f = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b6(this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b6(this.e, this.f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r3.a(r8, r7) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        ArrayList arrayList;
        g6 g6Var;
        Mutex mutex2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                g6 g6Var2 = this.e;
                mutex = g6Var2.c;
                arrayList = this.f;
                this.a = mutex;
                this.b = g6Var2;
                this.c = arrayList;
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
            ArrayList arrayList2 = this.c;
            g6Var = this.b;
            Mutex mutex3 = this.a;
            ResultKt.throwOnFailure(obj);
            arrayList = arrayList2;
            mutex = mutex3;
            if (!g6Var.d.isEmpty()) {
                arrayList.addAll(g6Var.d);
                g6Var.d.clear();
                ArrayList arrayList3 = g6Var.d;
                this.a = mutex;
                this.b = null;
                this.c = null;
                this.d = 2;
            }
            mutex2 = mutex;
            Unit unit2 = Unit.INSTANCE;
            mutex2.unlock(null);
            return unit2;
        } catch (Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }
}
