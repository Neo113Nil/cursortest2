package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes10.dex */
public abstract class Ej {
    public final CoroutineScope a;
    public final Mutex b;

    public Ej(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.b = MutexKt.Mutex$default(false, 1, null);
    }

    public abstract Bj a();

    public abstract void a(Bj bj);

    public final void a(Bj newState, Bj callerState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(callerState, "callerState");
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new Cj(this, newState, callerState, null), 3, null);
    }

    public final void b(Bj bj, Bj bj2) {
        if (Intrinsics.areEqual(a(), bj2) && !Intrinsics.areEqual(a(), bj)) {
            Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)");
            a().getClass();
            bj.getClass();
            a().c();
            a(bj);
            a().a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.inmobi.media.Bj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4076id c4076id, Bj bj, ContinuationImpl continuationImpl) {
        Dj dj;
        int i;
        Mutex mutex;
        try {
            if (continuationImpl instanceof Dj) {
                dj = (Dj) continuationImpl;
                int i2 = dj.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dj.f = i2 - Integer.MIN_VALUE;
                    Object obj = dj.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dj.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.b;
                        dj.a = c4076id;
                        dj.b = bj;
                        dj.c = mutex;
                        dj.f = 1;
                        if (mutex.lock(null, dj) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = dj.c;
                        bj = dj.b;
                        ?? r0 = dj.a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        c4076id = r0;
                    }
                    b(c4076id, bj);
                    return Unit.INSTANCE;
                }
            }
            b(c4076id, bj);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        dj = new Dj(this, continuationImpl);
        Object obj2 = dj.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dj.f;
        if (i != 0) {
        }
    }
}
