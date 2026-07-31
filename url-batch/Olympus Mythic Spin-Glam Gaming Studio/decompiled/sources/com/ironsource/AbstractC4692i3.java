package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC4709j3;
import com.ironsource.C4565b2;
import com.ironsource.C4888t3;
import com.ironsource.F0;
import com.ironsource.M7;
import com.ironsource.M8;
import com.ironsource.O0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4692i3<Smash extends AbstractC4709j3<?>, Listener extends AdapterAdListener> implements R0, U1, E0, Fb, Dc, InterfaceC4795o, Sg, InterfaceC4852r3, InterfaceC4862rd {
    private AdInfo A;
    private C4770ma B;
    final M8 C;
    final M8.a D;
    protected final M7 E;
    private final M7.a F;
    private boolean G;
    private Uf H;
    private AtomicBoolean I;

    @Nullable
    private S9 J;
    protected Rg<Smash> a;
    protected ConcurrentHashMap<String, C4565b2.a> b;
    protected com.ironsource.mediationsdk.e c;
    protected C4565b2 d;
    protected int e;
    protected String f;
    protected JSONObject g;
    protected C4834q2 h;
    protected C4684hd i;
    protected boolean j;
    private NetworkStateReceiver k;
    protected C4596cf l;
    protected C4658g5 m;
    protected C4658g5 n;
    protected W o;
    protected f p;
    protected Q0 q;
    protected O5 r;
    protected F0 s;
    protected L0 t;
    protected C4866s u;
    protected C4573ba v;
    protected UUID w;
    protected final Object x;
    private long y;
    private Boolean z;

    /* renamed from: com.ironsource.i3$a */
    class a extends AbstractRunnableC4756le {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            AbstractC4692i3.this.y();
        }
    }

    /* renamed from: com.ironsource.i3$b */
    class b implements Runnable {
        final /* synthetic */ NetworkSettings a;

        b(NetworkSettings networkSettings) {
            this.a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4692i3.this.c(this.a);
        }
    }

    /* renamed from: com.ironsource.i3$c */
    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4692i3.this.A();
        }
    }

    /* renamed from: com.ironsource.i3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4692i3.this.g = IronSourceNetworkBridge.jsonObjectInit();
            AbstractC4692i3.this.s.h.a((Double) null);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC4692i3.this.b(hashMap, arrayList, sb, arrayList2);
            AbstractC4692i3.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    /* renamed from: com.ironsource.i3$e */
    class e implements C4888t3.b {
        final /* synthetic */ Map a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        e(Map map, StringBuilder sb, List list) {
            this.a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.C4888t3.b
        public void a(@NotNull List<C4906u3> list, long j, @NotNull List<String> list2) {
            AbstractC4692i3.this.s.g.b(j);
            for (C4906u3 c4906u3 : list) {
                NetworkSettings a = AbstractC4692i3.this.o.a(c4906u3.c());
                Map<String, Object> b = AbstractC4692i3.this.b(a, com.ironsource.mediationsdk.c.b().b(a, AbstractC4692i3.this.o.b(), AbstractC4692i3.this.h()));
                if (c4906u3.a() != null) {
                    this.a.put(c4906u3.c(), c4906u3.a());
                    StringBuilder sb = this.b;
                    sb.append(c4906u3.d());
                    sb.append(c4906u3.c());
                    sb.append(StringUtils.COMMA);
                    AbstractC4692i3.this.s.g.a(b, c4906u3.e());
                } else {
                    AbstractC4692i3.this.s.g.a(b, c4906u3.e(), c4906u3.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings a2 = AbstractC4692i3.this.o.a(it.next());
                AbstractC4692i3.this.s.g.b(AbstractC4692i3.this.b(a2, com.ironsource.mediationsdk.c.b().b(a2, AbstractC4692i3.this.o.b(), AbstractC4692i3.this.h())), j);
            }
            AbstractC4692i3.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.C4888t3.b
        public void onFailure(String str) {
            AbstractC4692i3.this.s.g.a(str);
            AbstractC4692i3.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }
    }

    /* renamed from: com.ironsource.i3$f */
    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC4692i3(W w, C4770ma c4770ma, C4573ba c4573ba) {
        this(Kb.Y(), Kb.Q(), w, c4770ma, c4573ba);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        IronLog.INTERNAL.verbose(f());
        AsyncTask.execute(new d());
    }

    private Yg<Smash> B() {
        IronLog.INTERNAL.verbose();
        return new Xg(this.o).d(this.a.b());
    }

    private void C() {
        this.u.a(this.o.b(), false);
    }

    private void H() {
        IronLog.INTERNAL.verbose(f());
        synchronized (this.x) {
            try {
                f fVar = this.p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                a(fVar2);
                this.I.set(false);
                long k = this.o.d().k() - C4658g5.a(this.m);
                if (k > 0) {
                    new Timer().schedule(new c(), k);
                } else {
                    A();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void I() {
        IronLog.INTERNAL.verbose(f());
        a(g(), j());
    }

    @Nullable
    private S9 a(W w) {
        return null;
    }

    private boolean c(boolean z) {
        Boolean bool = this.z;
        if (bool == null) {
            return false;
        }
        return (z && !bool.booleanValue() && r()) || (!z && this.z.booleanValue());
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (b2 instanceof AdapterSettingsInterface) {
            return this.a.a(this.o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, b2), b2, this.o.b());
        }
        return false;
    }

    private List<C4834q2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.b()) && d(networkSettings)) {
                C4578bf c4578bf = new C4578bf(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()));
                if (!this.l.b(c4578bf)) {
                    copyOnWriteArrayList.add(new C4834q2(c4578bf.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int m() {
        return 1;
    }

    private void o() {
        IronLog.INTERNAL.verbose(f());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.o.k(), this.o.p(), arrayList);
    }

    private void p() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new C4578bf(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b())));
        }
        C4596cf c4596cf = new C4596cf();
        this.l = c4596cf;
        c4596cf.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        synchronized (this.x) {
            try {
                if (this.o.h().e() && this.l.a()) {
                    ironLog.verbose(b("all smashes are capped"));
                    a(B0.a(this.o.b()), "all smashes are capped", false);
                    return;
                }
                if (!q() && this.p == f.SHOWING) {
                    IronLog.API.error(b("load cannot be invoked while showing an ad"));
                    a(new IronSourceError(B0.d(this.o.b()), "load cannot be invoked while showing an ad"));
                    return;
                }
                if (this.o.h().a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.o.h().a() != O0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.l.a().b(this.o.b()))) {
                    IronLog.API.error(b("load is already in progress"));
                    return;
                }
                this.g = IronSourceNetworkBridge.jsonObjectInit();
                C();
                if (s()) {
                    this.s.f.d();
                } else {
                    this.s.f.a(n());
                }
                this.n = new C4658g5();
                if (this.o.q()) {
                    if (!this.b.isEmpty()) {
                        this.d.a(this.b);
                        this.b.clear();
                    }
                    H();
                } else {
                    a(f.LOADING);
                }
                if (this.o.q()) {
                    return;
                }
                ironLog.verbose(b("auction disabled"));
                I();
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void z() {
        Yg<Smash> B = B();
        if (B.c()) {
            a(509, "Mediation No fill", false);
        }
        Iterator<Smash> it = B.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    protected void D() {
        com.ironsource.mediationsdk.l.a().a(this.o.b(), this.o.f());
    }

    protected boolean E() {
        return true;
    }

    protected boolean F() {
        return true;
    }

    public void G() {
        Iterator<NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.o.b(), h());
        }
    }

    protected abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i, String str, C4834q2 c4834q2);

    public void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose(b("track = " + z));
        try {
            this.j = z;
            if (z) {
                if (this.k == null) {
                    this.k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.k != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    protected abstract JSONObject b(NetworkSettings networkSettings);

    protected void b(boolean z) {
        a(false, z, (AbstractC4709j3<?>) null);
    }

    protected abstract L0 d();

    protected Q0 e() {
        return new Q0(this.o.h(), this);
    }

    protected String f() {
        return b((String) null);
    }

    protected void h(AbstractC4709j3<?> abstractC4709j3) {
        if (this.o.h().f()) {
            a(abstractC4709j3, abstractC4709j3.f());
        } else {
            a(true, false, abstractC4709j3);
        }
    }

    protected abstract String i();

    protected void i(AbstractC4709j3<?> abstractC4709j3) {
        if (this.o.q() && this.I.compareAndSet(false, true)) {
            C4834q2 i = abstractC4709j3.i();
            this.c.a(i, abstractC4709j3.l(), this.h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C4834q2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.c.a(arrayList, concurrentHashMap, abstractC4709j3.l(), this.h, i);
        }
    }

    protected String j() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected String k() {
        C4684hd c4684hd = this.i;
        return c4684hd == null ? "" : c4684hd.c();
    }

    abstract String l();

    protected boolean n() {
        return false;
    }

    protected boolean q() {
        return false;
    }

    protected boolean r() {
        return false;
    }

    protected abstract boolean s();

    protected boolean t() {
        boolean z;
        synchronized (this.x) {
            try {
                f fVar = this.p;
                z = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } finally {
            }
        }
        return z;
    }

    protected boolean u() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean v() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.AUCTION;
        }
        return z;
    }

    protected boolean w() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.LOADING;
        }
        return z;
    }

    public void x() {
        if (c()) {
            a(new a());
        } else {
            y();
        }
    }

    @Override // com.ironsource.Fb
    public void b() {
        IronLog.INTERNAL.verbose(f());
        x();
    }

    @Override // com.ironsource.R0
    public void e(AbstractC4709j3<?> abstractC4709j3) {
        IronLog.INTERNAL.verbose(b(abstractC4709j3.k()));
        this.s.i.a(k());
        this.t.a(this.i, abstractC4709j3.f());
    }

    AbstractC4692i3(I7 i7, H7 h7, W w, C4770ma c4770ma, C4573ba c4573ba) {
        this.f = "";
        this.j = false;
        this.x = new Object();
        this.y = 0L;
        this.I = new AtomicBoolean(false);
        this.w = UUID.randomUUID();
        this.C = i7.s();
        this.D = h7.i();
        this.E = i7.w();
        this.F = h7.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + w.b() + ", loading mode = " + w.h().a());
        StringBuilder sb = new StringBuilder();
        sb.append(w.b());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.i(sb.toString());
        C4658g5 c4658g5 = new C4658g5();
        this.J = a(w);
        this.v = c4573ba;
        this.o = w;
        this.s = new F0(w.b(), F0.b.MEDIATION, this);
        this.t = d();
        this.q = e();
        a(f.NONE);
        this.B = c4770ma;
        this.a = new Rg<>(this.o.d().f(), this.o.d().i(), this);
        this.s.e.a(l(), this.o.h().a().toString());
        this.b = new ConcurrentHashMap<>();
        this.i = null;
        D();
        this.g = IronSourceNetworkBridge.jsonObjectInit();
        if (this.o.q()) {
            this.c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.o.d(), IronSourceUtils.d()));
        }
        this.d = new C4565b2(this.o.j(), this.o.d().c());
        p();
        o();
        this.m = new C4658g5();
        a(f.READY_TO_LOAD);
        this.r = new O5(w.a(), this);
        this.u = new C4866s();
        this.s.e.a(C4658g5.a(c4658g5));
        if (this.o.h().e()) {
            ironLog.verbose("first automatic load");
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC4835q3> list2) {
        for (NetworkSettings networkSettings : this.o.j()) {
            Uf uf = this.H;
            if (uf == null || uf.a(networkSettings, this.o.b())) {
                if (!this.l.b(new C4578bf(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()))) && d(networkSettings)) {
                    AdData a2 = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.o.b())) {
                        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
                        if (b2 instanceof InterfaceC4870s3) {
                            list2.add(new CallableC4835q3(networkSettings.getInstanceType(this.o.b()), networkSettings.getProviderInstanceName(), a2, (InterfaceC4870s3) b2, this, networkSettings));
                        } else {
                            this.s.j.g(b2 == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.o.b()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(StringUtils.COMMA);
                    }
                }
            }
        }
    }

    public UUID h() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData a2 = a(networkSettings, this.o.o());
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (b2 != null) {
            try {
                b2.init(a2, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                C4782n4.d().a(e2);
                this.s.j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    @Override // com.ironsource.R0
    public void d(AbstractC4709j3<?> abstractC4709j3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4709j3.k()));
        if (!abstractC4709j3.h().equals(this.a.c())) {
            ironLog.error(b("invoked from " + abstractC4709j3.c() + " with state = " + this.p + " auctionId: " + abstractC4709j3.h() + " and the current id is " + this.a.c()));
            C4865rg c4865rg = this.s.j;
            StringBuilder sb = new StringBuilder();
            sb.append("onAdLoadSuccess invoked with state = ");
            sb.append(this.p);
            c4865rg.p(sb.toString());
            return;
        }
        if (this.o.m()) {
            List<Smash> b2 = this.a.b();
            Xg xg = new Xg(this.o);
            boolean a2 = xg.a(abstractC4709j3, b2);
            synchronized (this.x) {
                if (a2) {
                    try {
                        if (t()) {
                            i(abstractC4709j3);
                        }
                    } finally {
                    }
                }
                if (xg.a(b2)) {
                    i(xg.c(b2));
                }
            }
        }
        this.b.put(abstractC4709j3.c(), C4565b2.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long a3 = C4658g5.a(this.n);
            if (s()) {
                this.s.f.a(a3);
            } else {
                this.s.f.a(a3, n());
            }
            if (this.o.h().e()) {
                this.r.a(0L);
            }
            if (!this.o.m()) {
                i(abstractC4709j3);
            }
            h(abstractC4709j3);
        }
    }

    protected void a(f fVar) {
        synchronized (this.x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.p = fVar;
        }
    }

    protected void g(AbstractC4709j3<?> abstractC4709j3) {
        this.t.d(abstractC4709j3.f());
    }

    protected boolean a(f fVar, f fVar2) {
        boolean z;
        synchronized (this.x) {
            try {
                if (this.p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.p = fVar2;
                    z = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.p + ", expected state = " + fVar);
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    protected void a(L0 l0) {
        this.t = l0;
    }

    protected BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, h());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    protected void a(boolean z, boolean z2, AbstractC4709j3<?> abstractC4709j3) {
        synchronized (this.x) {
            try {
                Boolean bool = this.z;
                if (bool != null) {
                    if (bool.booleanValue() != z) {
                    }
                }
                this.z = Boolean.valueOf(z);
                long j = 0;
                if (this.y != 0) {
                    j = new Date().getTime() - this.y;
                }
                this.y = new Date().getTime();
                this.s.f.a(z, j, z2);
                AdInfo f2 = abstractC4709j3 != null ? abstractC4709j3.f() : this.A;
                this.A = f2;
                L0 l0 = this.t;
                if (!z) {
                    f2 = null;
                }
                l0.a(z, f2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.a.a(adapterBaseInterface, this.o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.o.b()));
    }

    private boolean b(C0 c0) {
        return !new ArrayList(Arrays.asList(C0.INIT_STARTED, C0.LOAD_AD, C0.AUCTION_REQUEST, C0.AUCTION_REQUEST_WATERFALL, C0.AUCTION_FAILED_NO_CANDIDATES, C0.COLLECT_TOKEN, C0.COLLECT_TOKENS_COMPLETED, C0.COLLECT_TOKENS_FAILED, C0.INSTANCE_COLLECT_TOKEN, C0.INSTANCE_COLLECT_TOKEN_SUCCESS, C0.INSTANCE_COLLECT_TOKEN_FAILED, C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(c0);
    }

    private boolean c(C0 c0) {
        return new ArrayList(Arrays.asList(C0.LOAD_AD_SUCCESS, C0.LOAD_AD_FAILED, C0.LOAD_AD_FAILED_WITH_REASON, C0.AUCTION_SUCCESS, C0.AUCTION_FAILED, C0.AUCTION_FAILED_NO_CANDIDATES, C0.AD_FORMAT_CAPPED, C0.AD_OPENED, C0.SHOW_AD, C0.SHOW_AD_FAILED, C0.AD_CLICKED, C0.RELOAD_AD_FAILED_WITH_REASON, C0.RELOAD_AD_SUCCESS, C0.AD_LEFT_APPLICATION)).contains(c0);
    }

    @Override // com.ironsource.InterfaceC4795o
    public void a() {
        if (this.o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            x();
        }
    }

    protected void b(C4834q2 c4834q2, String str) {
        if (c4834q2 != null) {
            W8 a2 = c4834q2.a(str);
            if (a2 != null) {
                for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a2));
                    impressionDataListener.onImpressionSuccess(a2);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        F0 f0 = this.s;
        if (f0 != null) {
            f0.j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.Dc
    public void a(boolean z) {
        if (!this.j || this.o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (c(z)) {
            a(z, false, (AbstractC4709j3<?>) null);
        }
    }

    @Override // com.ironsource.InterfaceC4862rd
    public boolean c() {
        S9 s9 = this.J;
        if (s9 == null || s9 == Thread.currentThread()) {
            return false;
        }
        return this.o.l();
    }

    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    private String a(List<C4834q2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            C4834q2 c4834q2 = list.get(i);
            Smash a2 = a(c4834q2, str);
            if (a2 != null) {
                copyOnWriteArrayList.add(a2);
                sb.append(a(c4834q2, a2.l()));
            }
            if (i != list.size() - 1) {
                sb.append(StringUtils.COMMA);
            }
        }
        this.a.a(this.o.h().a(), copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    private void b(JSONObject jSONObject) {
        int i;
        if (jSONObject == null) {
            this.o.b(false);
            IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.o.r()));
            return;
        }
        try {
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.o.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                }
                this.o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(b(this.o.r()));
            } catch (JSONException e2) {
                C4782n4.d().a(e2);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.o.b() + " Error: " + e2.getMessage());
                ironLog.verbose(b(this.o.r()));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(b(this.o.r()));
            throw th;
        }
    }

    @Override // com.ironsource.Sg
    public void a(int i) {
        this.s.j.v("waterfalls hold too many with size = " + i);
    }

    private Smash a(C4834q2 c4834q2, String str) {
        NetworkSettings a2 = this.o.a(c4834q2.c());
        if (a2 != null) {
            com.ironsource.mediationsdk.c.b().b(a2, this.o.b(), h());
            BaseAdAdapter<?, Listener> a3 = a(a2, this.o.b());
            if (a3 != null) {
                Smash a4 = a(a2, a3, this.C.a(this.o.b()), str, c4834q2);
                this.b.put(c4834q2.c(), C4565b2.a.ISAuctionPerformanceDidntAttemptToLoad);
                return a4;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + a2.getProviderInstanceName()));
        } else {
            String str2 = "could not find matching provider settings for auction response item - item = " + c4834q2.c() + " state = " + this.p;
            IronLog.INTERNAL.error(b(str2));
            this.s.j.i(str2);
        }
        return null;
    }

    protected String b(String str) {
        String str2 = this.o.b().name() + " state:" + this.p;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            hashMap.put("spId", networkSettings.getSubProviderId());
            hashMap.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.o.b())));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m()));
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
        }
        return hashMap;
    }

    protected void a(int i, String str, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i + ", errorReason = " + str));
        if (this.o.h().f()) {
            if (!z) {
                this.s.f.a(C4658g5.a(this.n), i, str, n());
            }
            a(new IronSourceError(i, str));
        } else {
            if (!z) {
                this.s.j.b(i, str);
            }
            b(false);
        }
        this.q.e();
    }

    protected void a(AbstractC4709j3<?> abstractC4709j3, AdInfo adInfo) {
        this.t.c(adInfo);
    }

    protected void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.l.a().b(this.o.b(), ironSourceError);
    }

    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC4835q3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        C4888t3 c4888t3 = new C4888t3();
        e eVar = new e(map, sb, list);
        this.s.g.a();
        c4888t3.a(list2, eVar, this.o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.h.a(1005, "No candidates available for auctioning");
            a(B0.e(this.o.b()), "no available ad to load", false);
            return;
        }
        this.s.h.b(str);
        if (this.c != null) {
            int a2 = this.C.a(this.o.b());
            com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.o.b());
            hVar.b(IronSourceUtils.g());
            hVar.a(map);
            hVar.a(list);
            hVar.a(this.d);
            hVar.a(a2);
            hVar.a(this.v);
            hVar.d(this.G);
            Uf uf = this.H;
            if (uf != null && uf.c()) {
                z = true;
            }
            hVar.e(z);
            a(ContextProvider.getInstance().getApplicationContext(), hVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    protected void a(Context context, com.ironsource.mediationsdk.h hVar, U1 u1) {
        com.ironsource.mediationsdk.e eVar = this.c;
        if (eVar != null) {
            eVar.a(context, hVar, u1);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C4834q2> list, String str, C4834q2 c4834q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            this.f = "";
            this.e = i;
            this.h = c4834q2;
            this.g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.s.j.a(i2, str2);
            }
            a(jSONObject2);
            if (this.u.a(this.o.b())) {
                this.s.h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String a2 = a(list, str);
            this.s.h.a(j, this.o.r() + ";wtf=" + list.size());
            this.s.h.c(a2);
            a(f.LOADING);
            z();
            return;
        }
        ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.p));
        C4865rg c4865rg = this.s.j;
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected auction success, state = ");
        sb.append(this.p);
        c4865rg.k(sb.toString());
    }

    @Override // com.ironsource.U1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            String str3 = "Auction failed (error " + i + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.i(i() + ": " + str3);
            this.e = i2;
            this.f = str2;
            this.g = IronSourceNetworkBridge.jsonObjectInit();
            if (this.o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                I();
            }
            this.s.h.a(j, i, str);
            a(f.LOADING);
            z();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.p;
        ironLog.error(b(str4));
        this.s.j.j(str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    @Override // com.ironsource.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(IronSourceError ironSourceError, AbstractC4709j3<?> abstractC4709j3) {
        Yg<Smash> B;
        AbstractC4709j3<?> c2;
        synchronized (this.x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(abstractC4709j3.k() + " - error = " + ironSourceError));
                if (abstractC4709j3.h().equals(this.a.c()) && this.p != f.AUCTION) {
                    this.b.put(abstractC4709j3.c(), C4565b2.a.ISAuctionPerformanceFailedToLoad);
                    if (!w() && !u()) {
                        B = null;
                        if (B != null) {
                            return;
                        }
                        if (this.o.m()) {
                            synchronized (this.x) {
                                try {
                                    if (B.b() && t() && (c2 = new Xg(this.o).c(this.a.b())) != null) {
                                        i(c2);
                                    }
                                } finally {
                                }
                            }
                        }
                        Iterator<Smash> it = B.a().iterator();
                        while (it.hasNext()) {
                            it.next().E();
                        }
                        return;
                    }
                    B = B();
                    if (B.c()) {
                        a(509, "Mediation No fill", false);
                        return;
                    }
                    if (B != null) {
                    }
                }
                ironLog.error(b("onAdLoadFailed was invoked from " + abstractC4709j3.c() + " with state =" + this.p + " auctionId: " + abstractC4709j3.h() + " and the current id is " + this.a.c()));
                C4865rg c4865rg = this.s.j;
                StringBuilder sb = new StringBuilder();
                sb.append("onAdLoadFailed was invoked with state =");
                sb.append(this.p);
                c4865rg.o(sb.toString());
            } finally {
            }
        }
    }

    @Override // com.ironsource.R0
    public void a(AbstractC4709j3<?> abstractC4709j3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4709j3.k()));
        this.s.i.g(k());
        this.a.a(abstractC4709j3);
        this.a.b(abstractC4709j3);
        this.l.a(abstractC4709j3);
        if (this.l.b(abstractC4709j3)) {
            ironLog.verbose(b(abstractC4709j3.c() + " was session capped"));
            abstractC4709j3.N();
            IronSourceUtils.i(abstractC4709j3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), k(), this.o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.i, this.o.b())) {
            ironLog.verbose(b("placement " + k() + " is capped"));
            this.s.i.b(k(), null);
        }
        this.D.b(this.o.b());
        if (this.o.q()) {
            C4834q2 i = abstractC4709j3.i();
            this.c.a(i, abstractC4709j3.l(), this.h, k());
            this.b.put(abstractC4709j3.c(), C4565b2.a.ISAuctionPerformanceShowedSuccessfully);
            if (E()) {
                b(i, k());
            }
        }
        g(abstractC4709j3);
        if (this.o.h().e()) {
            b(false);
        }
        this.q.h();
    }

    public Map<String, Object> a(C0 c0) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put("genericParams", this.g);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.C.a(this.o.b())));
        if (c(c0)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.e));
            if (!TextUtils.isEmpty(this.f)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(c0) && !TextUtils.isEmpty(this.a.c())) {
            hashMap.put("auctionId", this.a.c());
        }
        return hashMap;
    }

    public void a(C4573ba c4573ba) {
        this.v = c4573ba;
    }

    private void a(JSONObject jSONObject) {
        this.u.a(this.o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    protected String a(C4834q2 c4834q2, int i) {
        return String.format("%s%s", Integer.valueOf(i), c4834q2.c());
    }

    public void a(Uf uf) {
        this.H = uf;
        if (uf != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.z = null;
    }

    @Override // com.ironsource.InterfaceC4852r3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (b2 != null) {
            this.s.g.b(b(networkSettings, b2));
        }
    }

    @Override // com.ironsource.InterfaceC4852r3
    public void a(String str) {
        this.s.j.g(str);
    }

    @Override // com.ironsource.InterfaceC4862rd
    public void a(Runnable runnable) {
        S9 s9 = this.J;
        if (s9 != null) {
            s9.a(runnable);
        }
    }
}
