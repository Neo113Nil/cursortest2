package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4459x2 implements G8 {
    public final CoroutineScope a;
    public final Wn b;
    public final MutableStateFlow c;
    public final Mutex d;
    public final AtomicBoolean e;
    public Job f;
    public final Se g;

    public AbstractC4459x2(CoroutineScope coroutineScope, Tn viewabilityModel, Wn viewabilityCriteria, MutableStateFlow lifecycleObserver) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        this.a = coroutineScope;
        this.b = viewabilityCriteria;
        this.c = lifecycleObserver;
        this.d = MutexKt.Mutex$default(false, 1, null);
        this.e = new AtomicBoolean(false);
        this.g = new Se(coroutineScope, viewabilityModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(AbstractC4459x2 abstractC4459x2, ContinuationImpl continuationImpl) {
        C4354t2 c4354t2;
        int i;
        Mutex mutex;
        abstractC4459x2.getClass();
        try {
            if (continuationImpl instanceof C4354t2) {
                c4354t2 = (C4354t2) continuationImpl;
                int i2 = c4354t2.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4354t2.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4354t2.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4354t2.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = abstractC4459x2.d;
                        c4354t2.a = mutex2;
                        c4354t2.d = 1;
                        if (mutex2.lock(null, c4354t2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c4354t2.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    C3875ao c = abstractC4459x2.c();
                    Ng ng = c.a;
                    ng.f.set(true);
                    P6.a(ng.e);
                    ng.e = null;
                    P6.a(c.d.a);
                    c.d.a = null;
                    P6.a(c.e);
                    c.e = null;
                    abstractC4459x2.g.b();
                    return Unit.INSTANCE;
                }
            }
            C3875ao c2 = abstractC4459x2.c();
            Ng ng2 = c2.a;
            ng2.f.set(true);
            P6.a(ng2.e);
            ng2.e = null;
            P6.a(c2.d.a);
            c2.d.a = null;
            P6.a(c2.e);
            c2.e = null;
            abstractC4459x2.g.b();
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c4354t2 = new C4354t2(abstractC4459x2, continuationImpl);
        Object obj2 = c4354t2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4354t2.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0048, B:13:0x0050, B:14:0x005d, B:16:0x0065, B:17:0x008e, B:22:0x0075, B:23:0x0058), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0048, B:13:0x0050, B:14:0x005d, B:16:0x0065, B:17:0x008e, B:22:0x0075, B:23:0x0058), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0048, B:13:0x0050, B:14:0x005d, B:16:0x0065, B:17:0x008e, B:22:0x0075, B:23:0x0058), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0048, B:13:0x0050, B:14:0x005d, B:16:0x0065, B:17:0x008e, B:22:0x0075, B:23:0x0058), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(AbstractC4459x2 abstractC4459x2, ContinuationImpl continuationImpl) {
        C4380u2 c4380u2;
        int i;
        Mutex mutex;
        abstractC4459x2.getClass();
        try {
            if (continuationImpl instanceof C4380u2) {
                c4380u2 = (C4380u2) continuationImpl;
                int i2 = c4380u2.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4380u2.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4380u2.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4380u2.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = abstractC4459x2.d;
                        c4380u2.a = mutex2;
                        c4380u2.d = 1;
                        if (mutex2.lock(null, c4380u2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c4380u2.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (abstractC4459x2.e.get()) {
                        abstractC4459x2.g.b();
                    } else {
                        abstractC4459x2.g.a();
                    }
                    if (abstractC4459x2.e.get()) {
                        Ng ng = abstractC4459x2.c().a;
                        ng.b.setValue(EnumC4192mo.a);
                        ng.f.set(true);
                        P6.a(ng.e);
                        ng.e = null;
                    } else {
                        Ng ng2 = abstractC4459x2.c().a;
                        ng2.f.set(false);
                        ng2.a();
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
            }
            if (abstractC4459x2.e.get()) {
            }
            if (abstractC4459x2.e.get()) {
            }
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c4380u2 = new C4380u2(abstractC4459x2, continuationImpl);
        Object obj2 = c4380u2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4380u2.d;
        if (i != 0) {
        }
    }

    public abstract C3875ao c();

    @Override // com.inmobi.media.G8
    public final Flow b() {
        Job launch$default;
        Job launch$default2;
        if (this.f == null) {
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new C4327s2(this.c, null, this), 3, null);
            this.f = launch$default2;
            Unit unit = Unit.INSTANCE;
        }
        C3875ao c = c();
        if (c.e == null) {
            Ng ng = c.a;
            ng.a();
            launch$default = BuildersKt__Builders_commonKt.launch$default(c.b.a, null, null, new Yn(ng.b, null, c), 3, null);
            c.e = launch$default;
            Unit unit2 = Unit.INSTANCE;
        }
        return FlowKt.onCompletion(FlowKt.onStart(c.c, new C4407v2(this, null)), new C4433w2(this, null));
    }

    @Override // com.inmobi.media.G8
    public final void a() {
        this.e.set(false);
        this.g.b();
        C3875ao c = c();
        Ng ng = c.a;
        ng.f.set(true);
        P6.a(ng.e);
        ng.e = null;
        P6.a(c.d.a);
        c.d.a = null;
        P6.a(c.e);
        c.e = null;
        P6.a(this.f);
        this.f = null;
    }
}
