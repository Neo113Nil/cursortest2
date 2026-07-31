package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes10.dex */
public final class a6 extends SuspendLambda implements Function2 {
    public Mutex a;
    public g6 b;
    public int c;
    public final /* synthetic */ g6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(g6 g6Var, Continuation continuation) {
        super(2, continuation);
        this.d = g6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a6(this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a6(this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r7.lock(null, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g6 g6Var;
        Mutex mutex;
        Mutex mutex2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                g6Var = this.d;
                mutex = g6Var.c;
                this.a = mutex;
                this.b = g6Var;
                this.c = 1;
            } else {
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
                        Mutex mutex3 = mutex2;
                        th = th;
                        mutex = mutex3;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                g6Var = this.b;
                Mutex mutex4 = this.a;
                ResultKt.throwOnFailure(obj);
                mutex = mutex4;
            }
            g6Var.d.clear();
            DataStore dataStore = g6Var.b;
            z5 z5Var = new z5(null);
            this.a = mutex;
            this.b = null;
            this.c = 2;
            if (PreferencesKt.edit(dataStore, z5Var, this) != coroutine_suspended) {
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
