package com.ironsource;

import android.text.TextUtils;
import com.ironsource.Bf;
import com.ironsource.F0;
import com.ironsource.L8;
import com.ironsource.R0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.j3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4709j3<Listener extends R0> implements NetworkInitializationListener, Bf.a, E0, AdapterAdListener, L8.b {
    protected C4778n0 a;
    protected Listener b;
    protected BaseAdAdapter<?, AdapterAdListener> c;
    protected F0 d;
    protected h e;
    protected C4684hd g;
    protected C4618e1 h;
    protected JSONObject i;
    protected String j;
    protected AdData k;
    protected Long l;
    protected C4658g5 m;
    private final C4834q2 o;
    private final InterfaceC4862rd p;
    private AtomicBoolean f = new AtomicBoolean(false);
    private Bf n = new Bf(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    /* renamed from: com.ironsource.j3$a */
    class a extends AbstractRunnableC4756le {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            AbstractC4709j3.this.L();
        }
    }

    /* renamed from: com.ironsource.j3$b */
    class b extends AbstractRunnableC4756le {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            AbstractC4709j3.this.K();
        }
    }

    /* renamed from: com.ironsource.j3$c */
    class c extends AbstractRunnableC4756le {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        c(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            AbstractC4709j3.this.a(this.b, this.c);
        }
    }

    /* renamed from: com.ironsource.j3$d */
    class d extends AbstractRunnableC4756le {
        d() {
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            AbstractC4709j3.this.I();
        }
    }

    /* renamed from: com.ironsource.j3$e */
    class e extends AbstractRunnableC4756le {
        final /* synthetic */ AdapterErrorType b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        e(AdapterErrorType adapterErrorType, int i, String str) {
            this.b = adapterErrorType;
            this.c = i;
            this.d = str;
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            AbstractC4709j3.this.a(this.b, this.c, this.d);
        }
    }

    /* renamed from: com.ironsource.j3$f */
    class f extends AbstractRunnableC4756le {
        f() {
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            AbstractC4709j3.this.J();
        }
    }

    /* renamed from: com.ironsource.j3$g */
    class g extends AbstractRunnableC4756le {
        g() {
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            AbstractC4709j3.this.H();
        }
    }

    /* renamed from: com.ironsource.j3$h */
    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4709j3(InterfaceC4862rd interfaceC4862rd, C4778n0 c4778n0, BaseAdAdapter<?, ?> baseAdAdapter, C4618e1 c4618e1, C4834q2 c4834q2, Listener listener) {
        this.a = c4778n0;
        this.b = listener;
        this.d = new F0(c4778n0.a(), F0.b.PROVIDER, this);
        this.h = c4618e1;
        this.i = c4618e1.c();
        this.c = baseAdAdapter;
        this.o = c4834q2;
        this.p = interfaceC4862rd;
        a(h.NONE);
    }

    private boolean D() {
        return this.e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.n.a((Bf.a) this);
            G();
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.a(j());
        }
        this.b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        Bf bf = this.n;
        if (bf != null) {
            bf.e();
        }
        synchronized (this.q) {
            try {
                h hVar = this.e;
                z = false;
                if (hVar == h.LOADING) {
                    long a2 = C4658g5.a(this.m);
                    ironLog.verbose(a("Load duration = " + a2));
                    if (this.d != null) {
                        if (v()) {
                            this.d.f.a(a2);
                        } else {
                            this.d.f.a(a2, false);
                        }
                    }
                    a(h.LOADED);
                    z = O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.e)));
                    String format = String.format("unexpected load success, state - %s", this.e);
                    if (this.d != null) {
                        if (v()) {
                            this.d.j.s(format);
                        } else {
                            this.d.j.p(format);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.g(j());
        }
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            Bf bf = this.n;
            if (bf != null) {
                bf.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.e)));
        if (this.d != null) {
            this.d.j.n(String.format("unexpected init success, state - %s", this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long a2 = C4658g5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a2 + ", state = " + this.e + ", isBidder = " + w()));
        synchronized (this.q) {
            try {
                if (!z()) {
                    ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.e, 1025)));
                    if (this.d != null) {
                        this.d.j.u(String.format("unexpected timeout, state - %s, error - %s", this.e, 1025));
                    }
                    return;
                }
                a(h.FAILED);
                F0 f0 = this.d;
                if (f0 != null) {
                    f0.f.a(a2, 1025, false);
                    this.d.f.a(a2, 1025, "time out", false);
                }
                this.b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C4834q2 c4834q2 = this.o;
        if (c4834q2 == null) {
            return this.a.f();
        }
        Integer f2 = c4834q2.f();
        int f3 = (f2 == null || f2.intValue() <= 0) ? this.a.f() : f2.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + f3 + " seconds"));
        return f3;
    }

    public AtomicBoolean A() {
        return this.f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.e == h.SHOWING;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4834q2 i = i();
        String k = i.k();
        Map<String, Object> a2 = C4699ia.a(i.a());
        a2.put("adUnit", this.a.a());
        b(k);
        try {
            boolean z = false;
            if (v()) {
                this.d.f.d();
            } else {
                this.d.f.a(false);
            }
            this.l = null;
            this.m = new C4658g5();
            this.k = a(k, a2);
            synchronized (this.q) {
                if (this.e != h.NONE) {
                    z = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.j.g(str);
                onInitFailed(B0.c(this.a.a()), str);
                return;
            }
            this.n.a((Bf.a) this);
            ?? networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(B0.c(this.a.a()), str2);
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str3);
            }
            onInitFailed(B0.c(this.a.a()), str3);
        }
    }

    protected void G() {
        Object obj = this.c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public void M() {
        synchronized (this) {
            if (this.c != null) {
                try {
                    this.c = null;
                } catch (Exception e2) {
                    C4782n4.d().a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    IronLog.INTERNAL.error(a(str));
                    if (this.d != null) {
                        this.d.j.g(str);
                    }
                }
            }
            F0 f0 = this.d;
            if (f0 != null) {
                f0.f();
                this.d = null;
            }
            Bf bf = this.n;
            if (bf != null) {
                bf.d();
                this.n = null;
            }
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.a();
        }
    }

    protected boolean O() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public Map<String, Object> a(C0 c0) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        hashMap.put("spId", this.h.i());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        hashMap.put("instanceType", Integer.valueOf(l()));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("dynamicDemandSource", this.j);
        }
        hashMap.put("sessionDepth", r());
        if (this.a.e() != null && this.a.e().length() > 0) {
            hashMap.put("genericParams", this.a.e());
        }
        if (!TextUtils.isEmpty(this.a.c())) {
            hashMap.put("auctionId", this.a.c());
        }
        if (b(c0)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.a.d()));
            if (!TextUtils.isEmpty(this.a.b())) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.a.b());
            }
        }
        if (!TextUtils.isEmpty(this.a.g().getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.a.g().getCustomNetwork());
        }
        return hashMap;
    }

    public void b(String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.L8.b
    public String c() {
        return this.h.f();
    }

    protected String d() {
        return a((String) null);
    }

    public Long e() {
        return this.l;
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()), this.o.d());
    }

    public IronSource.a g() {
        return this.a.a();
    }

    public String h() {
        return this.a.c();
    }

    public C4834q2 i() {
        return this.o;
    }

    protected String j() {
        C4684hd c4684hd = this.g;
        return c4684hd == null ? "" : c4684hd.c();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.h.d();
    }

    public String m() {
        return this.h.h().isMultipleInstances() ? this.h.h().getProviderTypeForReflection() : this.h.f();
    }

    public String n() {
        return this.h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.c()) {
            this.p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
        if (this.p.c()) {
            this.p.a(new e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.c()) {
            this.p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.p.c()) {
            this.p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.p.c()) {
            this.p.a(new c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.p.c()) {
            this.p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.a.g();
    }

    protected Map<String, Object> q() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(C4699ia.a(this.i));
        return hashMap;
    }

    public Integer r() {
        C4778n0 c4778n0 = this.a;
        if (c4778n0 != null) {
            return Integer.valueOf(c4778n0.h());
        }
        return null;
    }

    public h t() {
        return this.e;
    }

    protected InterfaceC4862rd u() {
        return this.p;
    }

    protected boolean v() {
        return false;
    }

    public boolean w() {
        return this.h.j();
    }

    public boolean x() {
        return this.e == h.FAILED;
    }

    public boolean y() {
        return this.e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    @Override // com.ironsource.L8.b
    public int b() {
        return this.h.e();
    }

    private boolean b(C0 c0) {
        return new ArrayList(Arrays.asList(C0.LOAD_AD, C0.LOAD_AD_SUCCESS, C0.LOAD_AD_FAILED, C0.LOAD_AD_FAILED_WITH_REASON, C0.LOAD_AD_NO_FILL, C0.RELOAD_AD, C0.RELOAD_AD_SUCCESS, C0.RELOAD_AD_FAILED_WITH_REASON, C0.RELOAD_AD_NO_FILL, C0.DESTROY_AD, C0.AD_PRESENT_SCREEN, C0.AD_DISMISS_SCREEN, C0.AD_LEFT_APPLICATION, C0.AD_OPENED, C0.AD_CLOSED, C0.SHOW_AD, C0.SHOW_AD_FAILED, C0.AD_CLICKED, C0.AD_REWARDED)).contains(c0);
    }

    protected void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    protected Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.a.i());
        return map;
    }

    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    protected String a(String str) {
        String str2 = this.a.a().name() + " - " + k() + " - state = " + this.e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    @Override // com.ironsource.Bf.a
    public void a() {
        if (!this.p.c()) {
            L();
        } else {
            this.p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (D()) {
            Bf bf = this.n;
            if (bf != null) {
                bf.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4658g5.a(this.m));
            this.b.a(new IronSourceError(i, str), this);
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
        if (this.d != null) {
            this.d.j.m(String.format("unexpected init failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C4658g5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        Bf bf = this.n;
        if (bf != null) {
            bf.e();
        }
        synchronized (this.q) {
            h hVar = this.e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i, str, a2);
                a(h.FAILED);
                this.b.a(new IronSourceError(i, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i, str, a2);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a(String.format("ad expired for %s, state = %s", this.h.f(), this.e)));
                F0 f0 = this.d;
                if (f0 != null) {
                    f0.j.a(String.format("ad expired, state = %s", this.e));
                }
                return;
            }
            ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
            String format = String.format("unexpected load failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str);
            if (this.d != null) {
                if (v()) {
                    this.d.j.r(format);
                } else if (this.a.a() != IronSource.a.REWARDED_VIDEO || this.e != h.SHOWING) {
                    this.d.j.o(format);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.d.f.a(j, i);
                    return;
                } else {
                    this.d.f.b(j, i, false);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.d.f.a(j, i, str);
                    return;
                } else {
                    this.d.f.a(j, i, str, false);
                    return;
                }
            }
            this.d.f.a(j, i, false);
        }
    }
}
