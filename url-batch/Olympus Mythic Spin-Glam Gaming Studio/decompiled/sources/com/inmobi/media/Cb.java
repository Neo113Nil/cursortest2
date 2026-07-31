package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes11.dex */
public final class Cb {
    public final Mutex[] a;
    public final LinkedHashMap b;

    public Cb() {
        Mutex[] mutexArr = new Mutex[16];
        for (int i = 0; i < 16; i++) {
            mutexArr[i] = MutexKt.Mutex$default(false, 1, null);
        }
        this.a = mutexArr;
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r11.lock(null, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:26:0x0070, B:28:0x0078), top: B:25:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Go go, ContinuationImpl continuationImpl) {
        Ab ab;
        int i;
        Mutex mutex;
        Function1 function1;
        Mutex mutex2;
        Object obj;
        String str2;
        try {
            if (continuationImpl instanceof Ab) {
                ab = (Ab) continuationImpl;
                int i2 = ab.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ab.f = i2 - Integer.MIN_VALUE;
                    Object obj2 = ab.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = ab.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex = this.a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                        ab.a = str;
                        ab.b = go;
                        ab.c = mutex;
                        ab.f = 1;
                        function1 = go;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) ab.b;
                            str2 = ab.a;
                            try {
                                ResultKt.throwOnFailure(obj2);
                                this.b.put(str2, obj2);
                                obj = obj2;
                                mutex = mutex2;
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = ab.c;
                        Function1 function12 = (Function1) ab.b;
                        String str3 = ab.a;
                        ResultKt.throwOnFailure(obj2);
                        mutex = mutex3;
                        str = str3;
                        function1 = function12;
                    }
                    obj = this.b.get(str);
                    if (obj == null) {
                        ab.a = str;
                        ab.b = mutex;
                        ab.c = null;
                        ab.f = 2;
                        Object invoke = function1.invoke(ab);
                        if (invoke != coroutine_suspended) {
                            str2 = str;
                            mutex2 = mutex;
                            obj2 = invoke;
                            this.b.put(str2, obj2);
                            obj = obj2;
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    mutex.unlock(null);
                    return obj;
                }
            }
            obj = this.b.get(str);
            if (obj == null) {
            }
            mutex.unlock(null);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        ab = new Ab(this, continuationImpl);
        Object obj22 = ab.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ab.f;
        if (i != 0) {
        }
    }

    public final String toString() {
        String str = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Bb bb;
        int i;
        String str2;
        Mutex mutex;
        try {
            if (continuationImpl instanceof Bb) {
                bb = (Bb) continuationImpl;
                int i2 = bb.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bb.e = i2 - Integer.MIN_VALUE;
                    Object obj = bb.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bb.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                        bb.a = str;
                        bb.b = mutex2;
                        bb.e = 1;
                        if (mutex2.lock(null, bb) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = bb.b;
                        str2 = bb.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.b.remove(str2);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            this.b.remove(str2);
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        bb = new Bb(this, continuationImpl);
        Object obj2 = bb.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bb.e;
        if (i != 0) {
        }
    }
}
