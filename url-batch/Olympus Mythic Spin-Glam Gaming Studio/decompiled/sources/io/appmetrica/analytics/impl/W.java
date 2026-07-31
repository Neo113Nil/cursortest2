package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class W implements Za {
    public final Context a;
    public final ICommonExecutor b;
    public FutureTask i;
    public final O l;
    public L n;
    public boolean o;
    public final String c = "advertising identifiers collecting is forbidden by client configuration";
    public final String d = "advertising identifiers collecting is forbidden by startup";
    public final String e = "advertising identifiers collecting is forbidden by unknown reason";
    public final K f = new K(new Hg("google"));
    public final K g = new K(new Hg("huawei"));
    public final K h = new K(new Hg("yandex"));
    public final Lazy j = LazyKt.lazy(new S(this));
    public final long k = 90;
    public volatile AdvertisingIdsHolder m = new AdvertisingIdsHolder();

    public W(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor, @NotNull C5783wm c5783wm) {
        this.a = context;
        this.b = iCommonExecutor;
        this.l = new O(c5783wm);
        M m = M.d;
        this.n = new L(m, m, m);
    }

    public static final Void f(W w) {
        w.m = new AdvertisingIdsHolder(w.a(w.n.a, new T(w)), w.a(w.n.b, new U(w)), w.a(w.n.c, new V(w, new C5671se())));
        w.b.executeDelayed((FutureTask) w.j.getValue(), w.k, TimeUnit.SECONDS);
        return null;
    }

    public static final Void g(W w) {
        w.b();
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsProvider
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blockingRefreshTask");
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.m;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized void init() {
        if (this.i == null) {
            this.n = this.l.a();
            FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.W$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return W.f(W.this);
                }
            });
            this.i = futureTask;
            this.b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Za, io.appmetrica.analytics.impl.Bm
    public final synchronized void a(@NotNull C5783wm c5783wm) {
        this.l.a(c5783wm);
        a();
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized void b(boolean z) {
        this.o = true;
        this.l.b.update(z);
        a();
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized void c(boolean z) {
        if (!this.o) {
            b(z);
        }
    }

    public final void a() {
        L a = this.l.a();
        if (!Intrinsics.areEqual(a, this.n)) {
            this.b.remove((FutureTask) this.j.getValue());
            this.n = a;
            this.i = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.W$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return W.g(W.this);
                }
            });
        }
        ICommonExecutor iCommonExecutor = this.b;
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blockingRefreshTask");
            futureTask = null;
        }
        iCommonExecutor.execute(futureTask);
        if (this.i == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blockingRefreshTask");
        }
    }

    public final void b() {
        AdTrackingInfoResult a = a(this.n.a, new T(this));
        AdTrackingInfoResult google = this.m.getGoogle();
        IdentifierStatus identifierStatus = a.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a.mErrorExplanation);
        }
        AdTrackingInfoResult a2 = a(this.n.b, new U(this));
        AdTrackingInfoResult huawei = this.m.getHuawei();
        IdentifierStatus identifierStatus3 = a2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a2.mErrorExplanation);
        }
        AdTrackingInfoResult a3 = a(this.n.c, new V(this, new C5241bo(3, 500)));
        AdTrackingInfoResult yandex = this.m.getYandex();
        IdentifierStatus identifierStatus4 = a3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a3.mErrorExplanation);
        }
        this.m = new AdvertisingIdsHolder(a, a2, a3);
        this.b.executeDelayed((FutureTask) this.j.getValue(), this.k, TimeUnit.SECONDS);
    }

    public final AdTrackingInfoResult a(M m, Function0 function0) {
        int ordinal = m.ordinal();
        if (ordinal == 0) {
            return (AdTrackingInfoResult) function0.mo4828invoke();
        }
        if (ordinal == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.c);
        }
        if (ordinal == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.d);
        }
        if (ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.e);
    }
}
