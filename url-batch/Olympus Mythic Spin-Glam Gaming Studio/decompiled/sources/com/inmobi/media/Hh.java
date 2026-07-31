package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes12.dex */
public final class Hh {
    public final Mutex a = MutexKt.Mutex$default(false, 1, null);
    public WeakReference b = new WeakReference(null);
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Fh fh;
        int i;
        CoroutineContext coroutineContext;
        if (continuationImpl instanceof Fh) {
            fh = (Fh) continuationImpl;
            int i2 = fh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fh.d = i2 - Integer.MIN_VALUE;
                Object obj = fh.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fh.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext context = fh.getContext();
                    System.out.println(fh.getContext());
                    if (Intrinsics.areEqual(this.b.get(), context)) {
                        this.c++;
                        return Unit.INSTANCE;
                    }
                    Mutex mutex = this.a;
                    fh.a = context;
                    fh.d = 1;
                    if (Mutex.DefaultImpls.lock$default(mutex, null, fh, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineContext = context;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineContext = fh.a;
                    ResultKt.throwOnFailure(obj);
                }
                this.b = new WeakReference(coroutineContext);
                this.c = 1;
                return Unit.INSTANCE;
            }
        }
        fh = new Fh(this, continuationImpl);
        Object obj2 = fh.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fh.d;
        if (i != 0) {
        }
        this.b = new WeakReference(coroutineContext);
        this.c = 1;
        return Unit.INSTANCE;
    }

    public final Unit a(Gh gh) {
        CoroutineContext context = gh.getContext();
        System.out.println(gh.getContext());
        if (Intrinsics.areEqual(this.b.get(), context)) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b = new WeakReference(null);
                Mutex.DefaultImpls.unlock$default(this.a, null, 1, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("ReentrantMutex is not locked by this coroutine.");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(2:18|19))(3:20|21|(1:24)(1:23)))(1:26))(1:30)|27|28))|36|6|7|(0)(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r0.a = r8;
        r0.d = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (a(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        throw r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(M3 m3, ContinuationImpl continuationImpl) {
        Gh gh;
        int i;
        M3 m32;
        if (continuationImpl instanceof Gh) {
            gh = (Gh) continuationImpl;
            int i2 = gh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gh.d = i2 - Integer.MIN_VALUE;
                Object obj = gh.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gh.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    gh.a = m3;
                    gh.d = 1;
                    m32 = m3;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            gh.a = obj;
                            gh.d = 3;
                            return a(gh) == coroutine_suspended ? coroutine_suspended : obj;
                        }
                        if (i == 3) {
                            Object obj2 = gh.a;
                            ResultKt.throwOnFailure(obj);
                            return obj2;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) gh.a;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                    ?? r8 = (Function1) gh.a;
                    ResultKt.throwOnFailure(obj);
                    m32 = r8;
                }
                gh.a = null;
                gh.d = 2;
                obj = m32.invoke(gh);
            }
        }
        gh = new Gh(this, continuationImpl);
        Object obj3 = gh.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gh.d;
        if (i != 0) {
        }
        gh.a = null;
        gh.d = 2;
        obj3 = m32.invoke(gh);
    }
}
