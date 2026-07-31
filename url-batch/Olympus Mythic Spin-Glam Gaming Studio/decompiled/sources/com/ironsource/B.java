package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4849r0;
import com.ironsource.Gf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class B implements AdapterAdListener, NetworkInitializationListener {
    static final /* synthetic */ KProperty<Object>[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(B.class, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener()Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/AdInstanceListener;", 0))};

    @NotNull
    private final V0 a;

    @NotNull
    private final C b;

    @NotNull
    private final I c;

    @NotNull
    private final Gf d;

    @NotNull
    private final ReadWriteProperty e;
    private G f;

    @Nullable
    private final BaseAdAdapter<?, ?> g;

    @Nullable
    private C4658g5 h;

    @Nullable
    private Gf.a i;

    @NotNull
    private final Map<String, Object> j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    @NotNull
    private final AdData o;

    @Nullable
    private final C4834q2 p;
    private final boolean q;

    @NotNull
    private final String r;
    private final int s;

    @NotNull
    private final String t;

    @NotNull
    private final IronSource.a u;
    private final int v;

    @NotNull
    private final J w;
    private final boolean x;

    public static final class a extends AbstractRunnableC4756le {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            long a = C4658g5.a(B.this.h);
            IronLog ironLog = IronLog.INTERNAL;
            B b = B.this;
            ironLog.verbose(b.a("Load duration = " + a + ", isBidder = " + b.v()));
            B.this.n = true;
            B.this.f().f().e().a(a, 1025, false, B.this.A());
            B.this.f().f().e().a(a, 1025, "time out", false, B.this.A());
            B b2 = B.this;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            Intrinsics.checkNotNullExpressionValue(buildLoadFailedError, "buildLoadFailedError(errorMessage)");
            b2.a(buildLoadFailedError);
        }
    }

    public B(@NotNull V0 adTools, @NotNull C instanceData, @NotNull I adInstancePayload, @NotNull Gf taskScheduler, @Nullable F f) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.a = adTools;
        this.b = instanceData;
        this.c = adInstancePayload;
        this.d = taskScheduler;
        this.e = C4606d7.a(f);
        this.j = new LinkedHashMap();
        this.o = instanceData.h();
        this.p = instanceData.q();
        this.q = instanceData.k().j();
        this.r = instanceData.s();
        this.s = instanceData.t();
        this.t = instanceData.x();
        this.u = instanceData.i();
        this.v = instanceData.w();
        this.w = instanceData.u();
        this.x = instanceData.y();
        BaseAdAdapter<?, ?> a2 = a(instanceData);
        this.g = a2;
        adTools.f().a(new D(adTools, instanceData, a2));
        adTools.f().a(new W1(instanceData.l()));
    }

    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            I();
            C();
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            this.a.f().h().g(str);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.a.f().a().a(k());
        F s = s();
        if (s != null) {
            s.a(this);
        }
    }

    private final void F() {
        IronLog ironLog = IronLog.INTERNAL;
        G g = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.k = false;
        if (this.n) {
            c();
            this.a.f().h().f("instance load success after it was already failed");
            return;
        }
        if (this.l) {
            this.a.f().h().f("instance load success after it was already loaded");
            return;
        }
        this.l = true;
        long a2 = C4658g5.a(this.h);
        ironLog.verbose(a("Load duration = " + a2));
        this.a.f().e().a(a2, false, this.x);
        a(C4849r0.a.LoadedSuccessfully);
        G g2 = this.f;
        if (g2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
        } else {
            g = g2;
        }
        g.b(this);
    }

    private final void G() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.m) {
            this.a.f().h().f("instance opened after it was already opened");
            return;
        }
        this.m = true;
        this.a.f().a().g(k());
        a(C4849r0.a.ShowedSuccessfully);
        F s = s();
        if (s != null) {
            s.b(this);
        }
    }

    private final void H() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        if (this.n) {
            return;
        }
        D();
    }

    private final void I() {
        J();
        Gf gf = this.d;
        a a2 = a();
        Duration.Companion companion = Duration.Companion;
        this.i = gf.a(a2, DurationKt.toDuration(o(), DurationUnit.SECONDS));
    }

    private final void J() {
        Gf.a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
        this.i = null;
    }

    private final int o() {
        Integer f = h().f();
        return (f == null || f.intValue() <= 0) ? this.b.j().h() : f.intValue();
    }

    public final boolean A() {
        return this.x;
    }

    public boolean B() {
        return this.l;
    }

    protected abstract void C();

    public abstract void a(@NotNull K k);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.a.f().e().a(this.v);
    }

    public void c() {
    }

    @NotNull
    public final IronSource.a d() {
        return this.u;
    }

    @NotNull
    public LevelPlayAdInfo e() {
        String uuid = this.b.j().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c = this.b.j().b().c();
        String aVar = this.b.i().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c, aVar, h(), null, this.b.j().l(), MapsKt.toMap(this.j));
    }

    @NotNull
    public final V0 f() {
        return this.a;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> g() {
        return this.g;
    }

    @NotNull
    public final C4834q2 h() {
        return this.b.o();
    }

    @NotNull
    protected final AdData i() {
        return this.o;
    }

    @Nullable
    protected final C4684hd j() {
        return this.b.j().b().f();
    }

    @NotNull
    protected final String k() {
        return this.b.j().l();
    }

    @NotNull
    protected final Map<String, Object> l() {
        return this.j;
    }

    @Nullable
    public final C4834q2 m() {
        return this.p;
    }

    @NotNull
    protected final C n() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull final AdapterErrorType adapterErrorType, final int i, @NotNull final String errorMessage) {
        Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, adapterErrorType, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(final int i, @NotNull final String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i, @Nullable final String str) {
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                B.c(B.this);
            }
        });
    }

    @NotNull
    public final String p() {
        return this.r;
    }

    @NotNull
    public final String q() {
        return this.t;
    }

    public final int r() {
        return this.s;
    }

    @Nullable
    public final F s() {
        return (F) this.e.getValue(this, y[0]);
    }

    @NotNull
    public final J t() {
        return this.w;
    }

    public final int u() {
        return this.v;
    }

    public final boolean v() {
        return this.q;
    }

    public final boolean w() {
        return this.n;
    }

    public final boolean x() {
        return this.l;
    }

    public final boolean y() {
        return this.k;
    }

    public final boolean z() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(@NotNull final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, extraData);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, extraData);
            }
        });
    }

    private final void b(int i, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i + ", " + str));
        J();
        this.n = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4658g5.a(this.h));
        a(new IronSourceError(i, str));
    }

    public final void a(@Nullable F f) {
        this.e.setValue(this, y[0], f);
    }

    public final void a(@NotNull C4834q2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.a(value);
    }

    protected final void a(@NotNull C4849r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.b.a(performance);
    }

    protected final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.c(callback);
    }

    public final void a(boolean z) {
        this.a.f().a().a(z);
    }

    private final BaseAdAdapter<?, ?> a(C c) {
        if (c.j().e().q()) {
            return this.c.b();
        }
        return this.a.a(c);
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(@NotNull G listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f = listener;
        this.k = true;
        try {
            this.a.f().e().a(false, this.x);
            this.h = new C4658g5();
            I();
            BaseAdAdapter<?, ?> baseAdAdapter = this.g;
            Intrinsics.checkNotNull(baseAdAdapter);
            ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.b.h(), ContextProvider.getInstance().getApplicationContext(), this);
            } else {
                String str = "loadAd - network adapter not available " + this.t;
                ironLog.error(a(str));
                b(B0.c(this.b.i()), str);
            }
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.a.f().h().g(str2);
            b(B0.c(this.b.i()), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.j.putAll(extraData);
        this$0.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(i, str);
    }

    public static /* synthetic */ String a(B b, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return b.a(str);
    }

    @NotNull
    protected final String a(@Nullable String str) {
        return this.a.a(str, this.t);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C4849r0.a.FailedToLoad);
        G g = this.f;
        if (g == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            g = null;
        }
        g.a(ironSourceError, this);
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C4658g5.a(this.h);
        IronLog.INTERNAL.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        J();
        this.k = false;
        if (this.n) {
            c();
            a(adapterErrorType, i, str, a2);
        } else {
            if (this.l) {
                a(adapterErrorType);
                return;
            }
            this.n = true;
            c();
            a(adapterErrorType, i, str, a2);
            a(new IronSourceError(i, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ B(V0 v0, C c, I i, Gf gf, F f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, c, i, (i2 & 8) != 0 ? new Ff(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : gf, (i2 & 16) != 0 ? null : f);
    }

    protected final void a(int i, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        IronLog.INTERNAL.verbose(a("Show error = " + i + ", " + errorMessage));
        this.n = true;
        this.a.f().a().a(k(), i, errorMessage, null);
        a(C4849r0.a.FailedToShow);
        F s = s();
        if (s != null) {
            s.a(this, new IronSourceError(i, errorMessage));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.a.f().h().a("");
        } else {
            this.a.f().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.a.f().e().b(j, i, this.x);
        } else if (str != null && str.length() != 0) {
            this.a.f().e().a(j, i, str, false, this.x);
        } else {
            this.a.f().e().a(j, i, false, this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.j.putAll(extraData);
        this$0.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, AdapterErrorType adapterErrorType, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(i, errorMessage);
    }
}
