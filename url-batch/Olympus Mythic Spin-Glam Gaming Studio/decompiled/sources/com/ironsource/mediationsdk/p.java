package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.AbstractC4745l3;
import com.ironsource.C4548ac;
import com.ironsource.C4573ba;
import com.ironsource.C4593cc;
import com.ironsource.C4620e3;
import com.ironsource.C4630ed;
import com.ironsource.C4642f7;
import com.ironsource.C4644f9;
import com.ironsource.C4648fd;
import com.ironsource.C4649fe;
import com.ironsource.C4680h9;
import com.ironsource.C4684hd;
import com.ironsource.C4685he;
import com.ironsource.C4706j0;
import com.ironsource.C4729k5;
import com.ironsource.C4742l0;
import com.ironsource.C4755ld;
import com.ironsource.C4770ma;
import com.ironsource.C4782n4;
import com.ironsource.C4830pg;
import com.ironsource.C4848qg;
import com.ironsource.C4964x3;
import com.ironsource.C4966x5;
import com.ironsource.C4990yb;
import com.ironsource.E9;
import com.ironsource.Ec;
import com.ironsource.Ee;
import com.ironsource.Ef;
import com.ironsource.EnumC4984y5;
import com.ironsource.Fe;
import com.ironsource.G9;
import com.ironsource.InterfaceC4749l7;
import com.ironsource.InterfaceC4986y7;
import com.ironsource.J1;
import com.ironsource.J8;
import com.ironsource.J9;
import com.ironsource.Kb;
import com.ironsource.Lb;
import com.ironsource.M1;
import com.ironsource.M3;
import com.ironsource.M6;
import com.ironsource.M7;
import com.ironsource.Mc;
import com.ironsource.N3;
import com.ironsource.Nd;
import com.ironsource.O4;
import com.ironsource.Of;
import com.ironsource.P4;
import com.ironsource.P5;
import com.ironsource.P7;
import com.ironsource.Pf;
import com.ironsource.Rb;
import com.ironsource.T6;
import com.ironsource.T9;
import com.ironsource.U2;
import com.ironsource.U9;
import com.ironsource.V3;
import com.ironsource.V4;
import com.ironsource.We;
import com.ironsource.X7;
import com.ironsource.Ye;
import com.ironsource.Z9;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.q;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class p implements T9, Mc, O4, O4.b, O4.c, O4.a {
    private static boolean a0;
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Boolean H;
    private Boolean I;
    private Ec J;
    private boolean K;
    private boolean L;
    private boolean M;
    private final ConcurrentHashMap<String, h.d> N;
    private final ConcurrentHashMap<String, h.b> O;
    private final ConcurrentHashMap<String, h.d> P;
    private com.ironsource.mediationsdk.demandOnly.f Q;
    private com.ironsource.mediationsdk.demandOnly.k R;
    private com.ironsource.mediationsdk.demandOnly.c S;
    private P5 T;
    private U9 U;
    private T6 V;
    private boolean W;
    private AdQualityBridge X;
    X7<ISDemandOnlyInterstitialListener> Y;
    X7<ISDemandOnlyRewardedVideoListener> Z;
    private final String a;
    private final String b;
    private final InterfaceC4986y7 c;
    private final InterfaceC4986y7.a d;
    private final M7 e;
    private final InterfaceC4749l7 f;
    private final J8.a g;
    private IronSourceLoggerManager h;
    private C4990yb i;
    private AtomicBoolean j;
    private final Object k;
    private We l;
    private String m;
    private String n;
    private String o;
    private Map<String, String> p;
    private String q;
    private AtomicBoolean r;
    private boolean s;
    private List<IronSource.a> t;
    private String u;
    private Set<IronSource.a> v;
    private Set<IronSource.a> w;
    private boolean x;
    private C4573ba y;
    private final String z;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[q.d.values().length];
            b = iArr;
            try {
                iArr[q.d.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[q.d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[q.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[q.d.INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface b {
        void a(String str);
    }

    private static class c {
        static volatile p a = new p();

        private c() {
        }
    }

    private p() {
        this(Kb.Y().a(), Kb.Q().c(), Kb.Y().w(), Kb.Y().k(), Kb.Q().D());
    }

    private boolean A() {
        We we = this.l;
        return (we == null || we.c() == null || this.l.c().e() == null) ? false : true;
    }

    private boolean B() {
        return A() && C();
    }

    private boolean C() {
        We we = this.l;
        return (we == null || we.k() == null || this.l.k().c() == null || this.l.k().c().isEmpty()) ? false : true;
    }

    private boolean D() {
        We we = this.l;
        return (we == null || we.c() == null || this.l.c().f() == null) ? false : true;
    }

    private boolean E() {
        return D() && F();
    }

    private boolean F() {
        We we = this.l;
        return (we == null || we.k() == null || this.l.k().d() == null || this.l.k().d().size() <= 0) ? false : true;
    }

    private void J() {
        ConcurrentHashMap<String, List<String>> c2 = C4770ma.b().c();
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.c)) {
            if (TextUtils.isEmpty(c2.get(com.ironsource.mediationsdk.metadata.a.c).get(0))) {
                return;
            }
            V4.a.b(!MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    private void K() {
        if (this.D) {
            L();
        }
    }

    private void L() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.k().a().size(); i++) {
            String str = this.l.k().a().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject a2 = IronSourceUtils.a(false, false, 1);
            a(a2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(EnumC4984y5.TROUBLESHOOTING_BN_INIT_FAILED, a2);
            a(IronSource.a.BANNER, false);
            return;
        }
        synchronized (this.O) {
            try {
                U2 c2 = this.l.c().c();
                P4.a aVar = new P4.a("Mediation");
                if (c2.k()) {
                    aVar.a("isOneFlow", 1);
                }
                this.S = new com.ironsource.mediationsdk.demandOnly.c(arrayList, c2, i(), j(), new P4.b(G9.i(), aVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        for (h.b bVar : this.O.values()) {
            this.S.a(bVar.g(), bVar.e());
        }
        this.O.clear();
    }

    private void M() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.k().b().size(); i++) {
            String str = this.l.k().b().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject a2 = IronSourceUtils.a(false, false, 1);
            a(a2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(EnumC4984y5.TROUBLESHOOTING_IS_INIT_FAILED, a2);
            a(IronSource.a.INTERSTITIAL, false);
            return;
        }
        synchronized (this.N) {
            this.Q = a((List<NetworkSettings>) arrayList);
        }
        Iterator<h.d> it = this.N.values().iterator();
        while (it.hasNext()) {
            this.Q.a(it.next());
        }
        this.N.clear();
    }

    private void N() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.k().d().size(); i++) {
            String str = this.l.k().d().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.P) {
            this.R = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Iterator<h.d> it = this.P.values().iterator();
        while (it.hasNext()) {
            this.R.a(it.next());
        }
        this.P.clear();
    }

    private void O() {
        if (this.C) {
            M();
        }
    }

    private void P() {
        if (this.B) {
            N();
        }
    }

    private boolean b(List<IronSource.a> list, boolean z, N3 n3) {
        IronLog.INTERNAL.verbose();
        try {
            this.t = list;
            c(true);
            this.h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.i("init success");
            if (z) {
                JSONObject b2 = IronSourceUtils.b(false);
                try {
                    b2.put("revived", true);
                } catch (JSONException e) {
                    C4782n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
                Kb.Y().q().a(new C4966x5(EnumC4984y5.FIRST_INSTANCE_RESULT, b2));
            }
            int b3 = n3.b().f().b();
            if (b3 >= 0) {
                V3 v3 = new V3();
                v3.a(b3);
                v3.a(b3, this.l.l().d());
            }
            G9.i().h();
            C4685he.i().h();
            Kb.Y().q().h();
            com.ironsource.mediationsdk.c.b().b(i(), j());
            for (IronSource.a aVar : IronSource.a.values()) {
                if (this.v.contains(aVar)) {
                    if (list.contains(aVar)) {
                        b(aVar);
                    } else {
                        a(aVar, false);
                    }
                }
            }
            Ec l = l();
            if (l != null) {
                l.a(this.l);
            }
            return true;
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Ec l2 = l();
            if (l2 != null) {
                l2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private synchronized void c(boolean z) {
        this.s = z;
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        Ef.a().a(new M6(context));
        Kb.Y().q().a(context, this.y);
        G9.i().a(context, this.y);
        C4685he.i().a(context, this.y);
        C4630ed.P.a(context, this.y);
    }

    public static p h() {
        return c.a;
    }

    private synchronized Ec l() {
        return this.J;
    }

    private void p() {
        this.h = IronSourceLoggerManager.getLogger(0);
        this.i = new C4990yb();
    }

    private boolean q() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: " + IronSourceAdQuality.class.getName());
            return true;
        } catch (Throwable th) {
            C4782n4.d().a(th);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean r() {
        We we = this.l;
        return (we == null || we.c() == null || this.l.c().b() == null || this.l.c().b().b() == null) ? false : true;
    }

    private boolean s() {
        We we = this.l;
        return (we == null || we.c() == null || this.l.c().c() == null) ? false : true;
    }

    private boolean t() {
        return s() && u();
    }

    private boolean u() {
        We we = this.l;
        return (we == null || we.k() == null || this.l.k().a() == null || this.l.k().a().size() <= 0) ? false : true;
    }

    private synchronized boolean w() {
        return this.s;
    }

    private boolean x() {
        We we = this.l;
        return (we == null || we.c() == null || this.l.c().d() == null) ? false : true;
    }

    private boolean y() {
        return x() && z();
    }

    private boolean z() {
        We we = this.l;
        return (we == null || we.k() == null || this.l.k().b() == null || this.l.k().b().size() <= 0) ? false : true;
    }

    public boolean G() {
        return w();
    }

    public void H() {
        this.W = false;
    }

    public void I() {
        if (a0) {
            return;
        }
        a0 = true;
        JSONObject b2 = IronSourceUtils.b(false);
        try {
            b2.put("status", "false");
            b2.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Kb.Y().q().a(new C4966x5(EnumC4984y5.FIRST_INSTANCE_RESULT, b2));
    }

    public void a(long j, We.a aVar) {
        JSONObject b2 = IronSourceUtils.b(v());
        try {
            b2.put(IronSourceConstants.EVENTS_DURATION, j);
            b2.put("sessionDepth", this.A);
            b2.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Kb.Y().q().a(new C4966x5(EnumC4984y5.INIT_COMPLETE, b2));
    }

    @Override // com.ironsource.O4.a
    public void e(String str) {
        this.h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.S;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th) {
            C4782n4.d().a(th);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    @Override // com.ironsource.T9
    public void f(String str) {
        try {
            String str2 = this.a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (a(str, 1, 64) && k(str)) {
                this.q = str;
                this.U.f(str);
            } else {
                this.h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, this.a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    @Override // com.ironsource.Mc
    public void g(String str) {
        try {
            this.h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.i("Mediation init failed");
            if (this.i != null) {
                Iterator<IronSource.a> it = this.v.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            Ec l = l();
            if (l != null) {
                l.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public String i() {
        return this.m;
    }

    public void j(String str) {
        IronLog.API.verbose("userId = " + str);
        this.n = str;
        Kb.Y().q().a(new C4966x5(EnumC4984y5.SET_USER_ID, IronSourceUtils.a(false)));
        AdQualityBridge adQualityBridge = this.X;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public String k() {
        return this.q;
    }

    public Map<String, String> m() {
        return this.p;
    }

    public C4573ba n() {
        return this.y;
    }

    public String o() {
        return this.u;
    }

    boolean v() {
        return this.B || this.C || this.D;
    }

    private boolean k(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private M3 l(String str) {
        M3 m3 = new M3();
        if (str == null) {
            m3.a(new IronSourceError(506, "Init Fail - appKey is missing"));
        } else if (!a(str, 5, 10)) {
            m3.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
        } else if (!k(str)) {
            m3.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
        }
        return m3;
    }

    public C4548ac c() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a2 = a(this.l.k().c());
        if (a2.size() > 0) {
            return new C4548ac(a2, this.l.c().e(), IronSourceUtils.f(), C4770ma.b(), this.y);
        }
        JSONObject a3 = IronSourceUtils.a(false, true, 1);
        a(a3, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(EnumC4984y5.TROUBLESHOOTING_NT_INIT_FAILED, a3);
        return null;
    }

    @Override // com.ironsource.O4.c
    public synchronized boolean h(String str) {
        boolean z;
        com.ironsource.mediationsdk.demandOnly.k kVar = this.R;
        if (kVar != null) {
            z = kVar.a(str);
        }
        return z;
    }

    public C4593cc i(String str) {
        Rb e = this.l.c().e();
        if (e == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return e.e();
        }
        C4593cc a2 = e.a(str);
        return a2 != null ? a2 : e.e();
    }

    p(InterfaceC4986y7 interfaceC4986y7, InterfaceC4986y7.a aVar, M7 m7, InterfaceC4749l7 interfaceC4749l7, J8.a aVar2) {
        this.a = getClass().getName();
        this.b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b9.4.4";
        this.k = new Object();
        this.l = null;
        this.m = null;
        this.n = "";
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = false;
        this.x = true;
        this.z = "sessionDepth";
        this.I = null;
        this.W = false;
        this.c = interfaceC4986y7;
        this.d = aVar;
        this.e = m7;
        this.f = interfaceC4749l7;
        this.g = aVar2;
        p();
        this.j = new AtomicBoolean();
        this.v = new HashSet();
        this.w = new HashSet();
        this.C = false;
        this.B = false;
        this.D = false;
        this.r = new AtomicBoolean(true);
        this.A = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.u = IronSourceUtils.d();
        this.H = Boolean.FALSE;
        this.M = false;
        this.J = null;
        this.K = true;
        this.N = new ConcurrentHashMap<>();
        this.P = new ConcurrentHashMap<>();
        this.O = new ConcurrentHashMap<>();
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = new P5();
        U9 u9 = new U9();
        this.U = u9;
        this.V = new T6(u9);
        this.X = null;
        this.Y = new X7.a();
        this.Z = new X7.b();
    }

    @Override // com.ironsource.O4.b
    public synchronized boolean d(String str) {
        boolean z;
        com.ironsource.mediationsdk.demandOnly.f fVar = this.Q;
        if (fVar != null) {
            z = fVar.b(str);
        }
        return z;
    }

    Boolean d() {
        return this.I;
    }

    public We e() {
        return this.l;
    }

    public String j() {
        return this.n;
    }

    private boolean d(We we) {
        com.ironsource.mediationsdk.adquality.a a2 = we.c().a();
        return this.X == null && a2 != null && a2.b() && AdQualityBridge.adQualityAvailable();
    }

    public synchronized IronSourceError a(Context context, String str, boolean z, Ec ec, IronSource.a... aVarArr) {
        IronLog.INTERNAL.verbose("GitHash: 8fb7065");
        if (!Z9.a((Object) context, "Init Failed - provided context is null")) {
            g("Provided context is null");
            return new IronSourceError(2000, "Provided context is null");
        }
        this.g.a(context);
        boolean z2 = context instanceof Activity;
        if (z2) {
            a((Activity) context);
        }
        AtomicBoolean atomicBoolean = this.r;
        if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
            Fe.a.a(ec == null);
            if ((aVarArr == null || aVarArr.length == 0) && ec == null) {
                for (IronSource.a aVar : IronSource.a.values()) {
                    this.v.add(aVar);
                }
                this.E = true;
                this.F = true;
                this.G = true;
            } else {
                for (IronSource.a aVar2 : aVarArr) {
                    this.v.add(aVar2);
                    this.w.add(aVar2);
                    if (aVar2.equals(IronSource.a.INTERSTITIAL)) {
                        this.F = true;
                    }
                    if (aVar2.equals(IronSource.a.BANNER)) {
                        this.G = true;
                    }
                    if (aVar2.equals(IronSource.a.REWARDED_VIDEO)) {
                        this.E = true;
                    }
                }
            }
            IronLog.API.info("init(appKey:" + str + ")");
            M3 l = l(str);
            if (l.b()) {
                this.m = str;
            }
            We a2 = a(context, this.m);
            if (a2 != null) {
                IronLog.INTERNAL.verbose("init cache exists");
                a(a2.c().b().f());
            } else {
                IronLog.INTERNAL.verbose("init cache does not exist");
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            this.d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(V4.a.d()));
            this.U.g(LevelPlay.getSdkVersion());
            this.U.a(P7.a());
            this.U.a(C4742l0.a());
            J();
            d(context);
            if (this.m == null) {
                q.c().e();
                if (this.v.contains(IronSource.a.REWARDED_VIDEO)) {
                    Nd.a().a(false, (AdInfo) null);
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, l.a().toString(), 1);
                return new IronSourceError(2010, "App key is null");
            }
            this.U.a(context);
            this.U.c(this.m);
            this.U.h(this.u);
            if (this.x) {
                JSONObject b2 = IronSourceUtils.b(z);
                if (aVarArr != null) {
                    for (IronSource.a aVar3 : aVarArr) {
                        try {
                            b2.put(aVar3.toString(), true);
                        } catch (Exception e) {
                            C4782n4.d().a(e);
                        }
                    }
                }
                int i = this.A + 1;
                this.A = i;
                a(z2, z, i, b2, ec != null);
                this.x = false;
            }
            return null;
        }
        if (aVarArr != null) {
            a(z2, z, ec != null, aVarArr);
        } else {
            this.h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
        }
        Ee b3 = Fe.a.b();
        if (w()) {
            a(this.l);
            return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
        }
        if (b3 == Ee.INIT_FAILED) {
            return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
        }
        if (b3 != Ee.NOT_INIT) {
            if (ec != null) {
                a(ec);
            }
            return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
        }
        return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
    }

    private P4 f() {
        return new P4.b(Kb.Y().q(), new P4.a("IronSource"));
    }

    public String g() {
        return this.o;
    }

    @Override // com.ironsource.O4.b
    public void c(String str) {
        this.h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener a2 = this.Y.a(str);
        try {
            if (!this.C) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                a2.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.Q;
            if (fVar == null) {
                IronLog.API.error("Interstitial was not initiated");
                a2.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was not initiated"));
            } else {
                fVar.a(str);
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.API.error(e.getMessage());
            if (a2 != null) {
                a2.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void c(@NotNull Context context) {
        Of of = Of.a;
        of.b();
        if (!w()) {
            of.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!c(this.l)) {
            of.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error(IronSourceConstants.errorMessage_TEST_SUITE_DISABLED);
        } else if (!IronSourceUtils.f(context)) {
            of.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
        } else {
            new Pf().a(context, i(), this.l.j(), LevelPlay.getSdkVersion(), this.l.c().g().b(), d(), this.K);
            this.W = true;
            of.c();
        }
    }

    private void b(IronSource.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            P();
        } else if (i == 2) {
            O();
        } else {
            if (i != 3) {
                return;
            }
            K();
        }
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        C4649fe f = this.l.c().f();
        P4.a aVar = new P4.a("Mediation");
        if (f.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, f, com.ironsource.mediationsdk.c.b(), this.Z, i(), j(), new P4.b(C4685he.i(), aVar));
    }

    private boolean c(We we) {
        return we != null && we.p();
    }

    @Override // com.ironsource.T9
    public boolean b(String str) {
        try {
            M3 m3 = new M3();
            a(str, m3);
            if (m3.b()) {
                this.o = str;
                Kb.Y().q().a(new C4966x5(EnumC4984y5.SET_USER_ID, IronSourceUtils.a(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, m3.a().toString(), 2);
            return false;
        } catch (Exception e) {
            C4782n4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, this.a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    @Override // com.ironsource.O4.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.REWARDED_VIDEO).b(), this.Z.a(str));
    }

    @Override // com.ironsource.O4.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).a(true).a(str2).b(), this.Y.a(str));
    }

    public o b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new o(activity, iSBannerSize);
    }

    private boolean b(h.b bVar) {
        synchronized (this.O) {
            try {
                if (this.S != null) {
                    return false;
                }
                this.O.put(bVar.e(), bVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(M1 m1) {
        V4 v4 = V4.a;
        v4.c(m1.g());
        v4.a(m1.f());
        v4.a(m1.j());
        this.f.a(m1);
    }

    public String b() {
        q c2 = q.c();
        int i = a.b[c2.a().ordinal()];
        if (i != 1) {
            return i != 2 ? i != 3 ? (i == 4 && !B()) ? "No Native Ad configurations found" : "" : c2.d() ? "init() had failed" : "init() not finished yet" : "init() had failed";
        }
        return "init() must be called first";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0046, B:10:0x004a, B:12:0x0054, B:14:0x0058, B:15:0x005c, B:17:0x0064, B:18:0x0067, B:20:0x006f, B:22:0x0073, B:23:0x0077, B:25:0x007f, B:26:0x0082, B:28:0x008a, B:30:0x008e, B:33:0x0092, B:35:0x009a, B:32:0x009d, B:41:0x00a2, B:43:0x00a6, B:44:0x00ac, B:50:0x0012, B:52:0x0016, B:53:0x0023, B:55:0x0027, B:56:0x0034, B:58:0x0038, B:59:0x003e, B:60:0x002d, B:61:0x001c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0046, B:10:0x004a, B:12:0x0054, B:14:0x0058, B:15:0x005c, B:17:0x0064, B:18:0x0067, B:20:0x006f, B:22:0x0073, B:23:0x0077, B:25:0x007f, B:26:0x0082, B:28:0x008a, B:30:0x008e, B:33:0x0092, B:35:0x009a, B:32:0x009d, B:41:0x00a2, B:43:0x00a6, B:44:0x00ac, B:50:0x0012, B:52:0x0016, B:53:0x0023, B:55:0x0027, B:56:0x0034, B:58:0x0038, B:59:0x003e, B:60:0x002d, B:61:0x001c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<IronSource.a> a(Context context, String str, boolean z, IronSource.a... aVarArr) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (aVarArr != null) {
                if (aVarArr.length == 0) {
                }
                for (IronSource.a aVar : aVarArr) {
                    if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                        if (this.F) {
                            a(aVar);
                        } else {
                            this.C = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                    if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                        if (this.E) {
                            a(aVar);
                        } else {
                            this.B = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                    if (aVar.equals(IronSource.a.BANNER)) {
                        if (this.G) {
                            a(aVar);
                        } else {
                            this.D = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
                if (context != null) {
                    if (context instanceof Activity) {
                        a((Activity) context);
                    }
                    ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
                }
            }
            if (z) {
                if (this.E) {
                    a(IronSource.a.REWARDED_VIDEO);
                } else {
                    this.B = true;
                    arrayList.add(IronSource.a.REWARDED_VIDEO);
                }
                if (this.F) {
                    a(IronSource.a.INTERSTITIAL);
                } else {
                    this.C = true;
                    arrayList.add(IronSource.a.INTERSTITIAL);
                }
                if (this.G) {
                    a(IronSource.a.BANNER);
                } else {
                    this.D = true;
                    arrayList.add(IronSource.a.BANNER);
                }
                if (context != null) {
                }
            }
            while (r1 < r7) {
            }
            if (context != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    We b(Context context, String str, b bVar) {
        synchronized (this.k) {
            try {
                We we = this.l;
                if (we != null) {
                    return new We(we);
                }
                We a2 = a(context, str, bVar);
                if (a2 == null || !a2.q()) {
                    IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                    a2 = a(context, i());
                    if (a2 != null) {
                        IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(i(), str);
                        this.h.log(ironSourceTag, buildUsingCachedConfigurationError.toString() + ": " + a2.toString(), 1);
                        Kb.Y().q().a(new C4966x5(EnumC4984y5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
                    }
                }
                if (a2 != null) {
                    this.l = a2;
                    IronSourceUtils.e(context, a2.toString());
                    b(this.l, context);
                    G9.i().c(true);
                    C4685he.i().c(true);
                    C4630ed.P.c(true);
                    Kb.Y().q().c(true);
                }
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(IronSource.a aVar) {
        String str = aVar + " ad unit has already been initialized";
        this.h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.i(str);
    }

    private synchronized void a(boolean z, boolean z2, boolean z3, IronSource.a... aVarArr) {
        try {
            int i = 0;
            for (IronSource.a aVar : aVarArr) {
                if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                    this.F = true;
                } else if (aVar.equals(IronSource.a.BANNER)) {
                    this.G = true;
                } else if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                    this.E = true;
                }
            }
            if (q.c().a() == q.d.INIT_FAILED) {
                try {
                    if (this.i != null) {
                        int length = aVarArr.length;
                        while (i < length) {
                            IronSource.a aVar2 = aVarArr[i];
                            if (!this.v.contains(aVar2)) {
                                a(aVar2, true);
                            }
                            i++;
                        }
                    }
                } catch (Exception e) {
                    C4782n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
                return;
            }
            if (!w()) {
                JSONObject b2 = IronSourceUtils.b(z2);
                int length2 = aVarArr.length;
                while (i < length2) {
                    IronSource.a aVar3 = aVarArr[i];
                    if (!this.v.contains(aVar3)) {
                        this.v.add(aVar3);
                        this.w.add(aVar3);
                        try {
                            b2.put(aVar3.toString(), true);
                        } catch (Exception e2) {
                            C4782n4.d().a(e2);
                            IronLog.INTERNAL.error(e2.toString());
                        }
                    } else {
                        this.h.log(IronSourceLogger.IronSourceTag.API, aVar3 + " ad unit has started initializing.", 3);
                    }
                    i++;
                }
                int i2 = this.A + 1;
                this.A = i2;
                a(z, z2, i2, b2, z3);
                return;
            }
            if (this.t == null) {
                return;
            }
            try {
                new Lb().a(this.l.c().b().e().b(), v());
            } catch (Exception e3) {
                C4782n4.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
            JSONObject b3 = IronSourceUtils.b(z2);
            for (IronSource.a aVar4 : aVarArr) {
                if (!this.v.contains(aVar4)) {
                    this.v.add(aVar4);
                    this.w.add(aVar4);
                    try {
                        b3.put(aVar4.toString(), true);
                    } catch (Exception e4) {
                        C4782n4.d().a(e4);
                        IronLog.INTERNAL.error(e4.toString());
                    }
                    List<IronSource.a> list = this.t;
                    if (list != null && list.contains(aVar4)) {
                        b(aVar4);
                    } else {
                        a(aVar4, false);
                    }
                } else {
                    a(aVar4);
                }
            }
            int i3 = this.A + 1;
            this.A = i3;
            a(z, z2, i3, b3, z3);
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public void b(We we, Context context) {
        b(we);
        a(we, context);
    }

    private void b(We we) {
        this.h.setLoggerDebugLevel("console", we.c().b().h().a());
    }

    @Override // com.ironsource.T9
    public String b(Context context) {
        String I = this.c.I(context);
        Kb.Y().q().a(new C4966x5(EnumC4984y5.GET_ADVERTISING_ID, IronSourceUtils.b(false)));
        return !TextUtils.isEmpty(I) ? I : "";
    }

    private void b(EnumC4984y5 enumC4984y5, JSONObject jSONObject) {
        C4685he.i().a(new C4966x5(enumC4984y5, jSONObject));
    }

    public void b(boolean z) {
        this.I = Boolean.valueOf(z);
        com.ironsource.mediationsdk.c.b().b(z);
        this.U.a(z);
        Kb.Y().q().a(new C4966x5(z ? EnumC4984y5.CONSENT_TRUE_CODE : EnumC4984y5.CONSENT_FALSE_CODE, IronSourceUtils.b(false)));
    }

    public void b(@NotNull String str, @NotNull JSONObject jSONObject) {
        com.ironsource.mediationsdk.c.b().b(new t(str, jSONObject));
    }

    @Override // com.ironsource.V8
    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        if (Z9.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C4770ma.b().a(impressionDataListener);
            IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    private void a(boolean z, boolean z2, int i, JSONObject jSONObject, boolean z3) {
        try {
            StringBuilder sb = new StringBuilder();
            if (z2) {
                sb.append(String.format(",Activity=%s", Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null)));
            } else if (!z) {
                sb.append(StringUtils.COMMA);
                sb.append(IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
            }
            sb.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.c.n())));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i);
            if (z3) {
                if (z2) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Kb.Y().q().a(new C4966x5(EnumC4984y5.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(Ec ec) {
        this.J = ec;
    }

    public boolean a(boolean z, We we) {
        a(we);
        if (w()) {
            return true;
        }
        synchronized (this.k) {
            this.l = we;
        }
        return b(we.h(), z, we.c());
    }

    @Override // com.ironsource.Mc
    public void a(List<IronSource.a> list, boolean z, N3 n3) {
        a(this.l);
        b(list, z, n3);
    }

    private void a(We we) {
        if (q() && d(we)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), i(), j(), new C4706j0(), we.c().b().h().a());
            this.X = adQualityBridge;
            C4573ba c4573ba = this.y;
            if (c4573ba != null) {
                adQualityBridge.setSegment(c4573ba);
            }
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        E9 d = this.l.c().d();
        P4.a aVar = new P4.a("Mediation");
        if (d.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, d, com.ironsource.mediationsdk.c.b(), this.Y, i(), j(), new P4.b(G9.i(), aVar));
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.l.l().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.Mc
    public void a() {
        if (this.H.booleanValue()) {
            this.H = Boolean.FALSE;
            l.a().b(IronSource.a.BANNER, new IronSourceError(603, "init() had failed"));
        }
        if (this.M) {
            this.M = false;
            l.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.L) {
            this.L = false;
            l.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.N) {
            try {
                Iterator<h.d> it = this.N.values().iterator();
                while (it.hasNext()) {
                    String e = it.next().e();
                    this.Y.a(e).onInterstitialAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                }
                this.N.clear();
            } finally {
            }
        }
        synchronized (this.P) {
            try {
                Iterator<h.d> it2 = this.P.values().iterator();
                while (it2.hasNext()) {
                    String e2 = it2.next().e();
                    this.Z.a(e2).onRewardedVideoAdLoadFailed(e2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.P.clear();
            } finally {
            }
        }
        synchronized (this.O) {
            try {
                for (h.b bVar : this.O.values()) {
                    ISDemandOnlyBannerLayout g = bVar.g();
                    if (g != null) {
                        g.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                    }
                }
                this.O.clear();
            } finally {
            }
        }
    }

    private void a(IronSource.a aVar, boolean z) {
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            if (this.B) {
                Iterator<h.d> it = this.P.values().iterator();
                while (it.hasNext()) {
                    String e = it.next().e();
                    this.Z.a(e).onRewardedVideoAdLoadFailed(e, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.P.clear();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && this.D) {
                for (h.b bVar : this.O.values()) {
                    ISDemandOnlyBannerLayout g = bVar.g();
                    if (g != null) {
                        g.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                    }
                }
                this.O.clear();
                return;
            }
            return;
        }
        if (this.C) {
            Iterator<h.d> it2 = this.N.values().iterator();
            while (it2.hasNext()) {
                String e2 = it2.next().e();
                this.Y.a(e2).onInterstitialAdLoadFailed(e2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.N.clear();
        }
    }

    public void a(C4573ba c4573ba) {
        this.y = c4573ba;
        AdQualityBridge adQualityBridge = this.X;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(c4573ba);
        }
        G9.i().a(this.y);
        C4685he.i().a(this.y);
        C4630ed.P.a(this.y);
        Kb.Y().q().a(this.y);
    }

    @Override // com.ironsource.T9
    public void a(boolean z) {
        com.ironsource.mediationsdk.c.b().a(z);
    }

    @Override // com.ironsource.O4.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.a.REWARDED_VIDEO).b(), this.Z.a(str));
    }

    void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String e = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + e);
        try {
        } catch (Throwable th) {
            C4782n4.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new IronSourceError(510, th.getMessage()));
        }
        if (!this.E) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.B) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        q.d a2 = q.c().a();
        if (a2 == q.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronSourceError a3 = dVar.a();
        if (a3 != null) {
            if (a3.getErrorCode() == 1060) {
                b(EnumC4984y5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(a3.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, a3);
            return;
        }
        a(dVar.d());
        if (a2 == q.d.INIT_IN_PROGRESS) {
            if (q.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.P) {
                this.P.put(e, dVar);
            }
            if (TextUtils.isEmpty(dVar.b())) {
                return;
            }
            b(EnumC4984y5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            return;
        }
        if (!E()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.P) {
            try {
                com.ironsource.mediationsdk.demandOnly.k kVar = this.R;
                if (kVar == null) {
                    this.P.put(e, dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        b(EnumC4984y5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    return;
                }
                kVar.a(dVar);
                return;
            } finally {
            }
        }
        C4782n4.d().a(th);
        IronLog.API.error(th.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new IronSourceError(510, th.getMessage()));
    }

    @Override // com.ironsource.O4.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener a2 = this.Z.a(str);
        try {
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.API.error(e.getMessage());
            if (a2 != null) {
                a2.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e.getMessage()));
            }
        }
        if (!this.B) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            a2.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        com.ironsource.mediationsdk.demandOnly.k kVar = this.R;
        if (kVar == null) {
            ironLog.error("Rewarded video was not initiated");
            a2.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was not initiated"));
        } else {
            kVar.b(str);
        }
    }

    @Override // com.ironsource.O4.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.Z.a((X7<ISDemandOnlyRewardedVideoListener>) iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.O4.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).b(), this.Y.a(str));
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String e = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + e);
        try {
        } catch (Throwable th) {
            C4782n4.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new IronSourceError(510, th.getMessage()));
        }
        if (!this.F) {
            ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
            return;
        }
        if (!this.C) {
            ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
            return;
        }
        q.d a2 = q.c().a();
        if (a2 == q.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            return;
        }
        IronSourceError a3 = dVar.a();
        if (a3 != null) {
            if (a3.getErrorCode() == 1060) {
                b(EnumC4984y5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(a3.toString());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, a3);
            return;
        }
        a(dVar.d());
        if (a2 == q.d.INIT_IN_PROGRESS) {
            if (q.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            } else {
                synchronized (this.N) {
                    this.N.put(dVar.e(), dVar);
                }
                if (!TextUtils.isEmpty(dVar.e())) {
                    a(EnumC4984y5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
            }
            return;
        }
        if (!y()) {
            ironLog.error("No interstitial configurations found");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            return;
        }
        synchronized (this.N) {
            try {
                com.ironsource.mediationsdk.demandOnly.f fVar = this.Q;
                if (fVar == null) {
                    this.N.put(dVar.e(), dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        a(EnumC4984y5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    return;
                }
                fVar.a(dVar);
            } finally {
            }
        }
    }

    @Override // com.ironsource.O4.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.Y.a((X7<ISDemandOnlyInterstitialListener>) iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.O4.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    @Override // com.ironsource.O4.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b a2 = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.a.BANNER).a();
        IronSourceError a3 = a2.a();
        if (a3 != null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, a3.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, a3);
            }
            return;
        }
        IronSourceError a4 = a(q.c().a());
        if (a4 != null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, a4.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, a4);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(a2)) {
            return;
        }
        if (!t()) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(a2)) {
                return;
            }
            this.S.a(iSDemandOnlyBannerLayout, str);
        }
    }

    private boolean a(h.b bVar) {
        if (q.c().a() != q.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.O) {
            this.O.put(bVar.e(), bVar);
        }
        return true;
    }

    @Nullable
    private IronSourceError a(q.d dVar) {
        if (!this.G) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.D) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == q.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == q.d.INIT_IN_PROGRESS && q.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    public We a(Context context, String str) {
        if (C4680h9.a(context)) {
            C4964x3 c2 = C4680h9.c(context);
            String d = c2.d();
            String f = c2.f();
            String e = c2.e();
            if (d.equals(str)) {
                We we = new We(context, d, f, e);
                we.a(We.a.CACHE);
                return we;
            }
        }
        return null;
    }

    private We a(Context context, String str, b bVar) {
        We we = null;
        if (!IronSourceUtils.f(context)) {
            return null;
        }
        try {
            String b2 = b(context);
            if (TextUtils.isEmpty(b2)) {
                b2 = this.c.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = b2;
            C4573ba c4573ba = this.y;
            String a2 = C4642f7.a(Ye.a(context, i(), str, str2, k(), this.K, c4573ba != null ? c4573ba.f() : null, v()), C4644f9.a().toString(), bVar);
            if (a2 == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.g()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(a2);
                String optString = jsonObjectInit.optString("response", null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                a2 = a(optString, Boolean.valueOf(jsonObjectInit.optBoolean("compression", false)));
                if (TextUtils.isEmpty(a2)) {
                    ironLog.warning("encoded response invalid - return null");
                    I();
                    return null;
                }
            }
            We we2 = new We(context, i(), str, a2);
            try {
                we2.a(We.a.SERVER);
                if (we2.q()) {
                    return we2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e) {
                e = e;
                we = we2;
                C4782n4.d().a(e);
                IronLog.INTERNAL.warning("exception = " + e);
                return we;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private String a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return J9.d(C4729k5.b().c(), str);
        }
        return J9.b(C4729k5.b().c(), str);
    }

    private void a(We we, Context context) {
        boolean l = r() ? we.c().b().b().l() : false;
        boolean l2 = D() ? we.c().f().m().l() : false;
        boolean l3 = x() ? we.c().d().i().l() : false;
        boolean l4 = s() ? we.c().c().g().l() : false;
        boolean l5 = A() ? we.c().e().g().l() : false;
        C4648fd i = we.c().b().i();
        boolean i2 = i.i();
        if (l) {
            a((AbstractC4745l3) Kb.Y().q(), we.c().b().b(), context, we, true);
        }
        if (l2) {
            a((AbstractC4745l3) C4685he.i(), we.c().f().m(), context, we, true);
        } else {
            C4685he.i().a(false);
        }
        if (l3) {
            a((AbstractC4745l3) G9.i(), we.c().d().i(), context, we, true);
        } else if (l4) {
            a((AbstractC4745l3) G9.i(), we.c().c().g(), context, we, true);
        } else if (l5) {
            a((AbstractC4745l3) G9.i(), we.c().e().g(), context, we, true);
        } else {
            G9.i().a(false);
        }
        C4630ed c4630ed = C4630ed.P;
        c4630ed.a(i2);
        if (i2) {
            c4630ed.b(i.j(), context);
            c4630ed.b(i.l(), context);
            c4630ed.c(i.k(), context);
            c4630ed.b(i.g());
            c4630ed.c(i.h());
        }
    }

    private void a(AbstractC4745l3 abstractC4745l3, J1 j1, Context context, We we, boolean z) {
        abstractC4745l3.a(z);
        abstractC4745l3.a(j1.c(), context);
        abstractC4745l3.b(j1.d(), context);
        abstractC4745l3.a(j1.f());
        abstractC4745l3.d(j1.e());
        abstractC4745l3.b(j1.a());
        abstractC4745l3.b(j1.i(), context);
        abstractC4745l3.c(j1.h(), context);
        abstractC4745l3.a(j1.j(), context);
        abstractC4745l3.d(j1.g(), context);
        abstractC4745l3.a(we.c().b().j());
        abstractC4745l3.b(j1.k());
        abstractC4745l3.c(j1.b());
    }

    private void a(String str, M3 m3) {
        if (a(str, 1, 128)) {
            return;
        }
        m3.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    boolean a(C4620e3 c4620e3) {
        return this.e.c(ContextProvider.getInstance().getApplicationContext(), c4620e3, IronSource.a.BANNER);
    }

    C4755ld.b a(C4684hd c4684hd) {
        return this.e.a(ContextProvider.getInstance().getApplicationContext(), c4684hd, IronSource.a.REWARDED_VIDEO);
    }

    private void a(EnumC4984y5 enumC4984y5, JSONObject jSONObject) {
        G9.i().a(new C4966x5(enumC4984y5, jSONObject));
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
            }
        }
    }

    public void a(String str, List<String> list) {
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataKeyValidity);
            return;
        }
        if (checkMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataValueValidity);
            return;
        }
        MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = formatMetaData.getMetaDataKey();
        List<String> metaDataValue = formatMetaData.getMetaDataValue();
        if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            if (w() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                C4770ma.b().a(metaDataKey, metaDataValue);
            }
        } else {
            com.ironsource.mediationsdk.c.b().c(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> d = com.ironsource.mediationsdk.c.b().d();
            d.putAll(C4770ma.b().c());
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            for (Map.Entry<String, List<String>> entry : d.entrySet()) {
                jsonObjectInit.put(entry.getKey(), entry.getValue());
            }
            this.V.a(jsonObjectInit);
            this.U.a(jsonObjectInit);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
        Kb.Y().q().a(new C4966x5(w() ? EnumC4984y5.SET_META_DATA_AFTER_INIT : EnumC4984y5.SET_META_DATA, IronSourceUtils.a(str, list, metaDataValue)));
    }

    @Override // com.ironsource.O4
    @Nullable
    public String a(@NotNull Context context) {
        String str;
        Ee ee;
        String str2;
        C4848qg k;
        P4 f = f();
        Ee ee2 = null;
        try {
            ee = Fe.a.a();
            try {
                f.a(EnumC4984y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, ee);
            } catch (Exception unused) {
                str = null;
                ee2 = ee;
                f.a(EnumC4984y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, ee2);
                ee = ee2;
                str2 = str;
                f.a(EnumC4984y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, ee);
                return str2;
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            f.a(EnumC4984y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (Ee) null);
            return null;
        }
        if (ee == Ee.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            f.a(EnumC4984y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (Ee) null);
            return null;
        }
        q.c().f();
        We we = this.l;
        boolean e = (we == null || (k = we.c().b().k()) == null) ? true : k.e();
        this.U.b(context);
        JSONObject a2 = new C4830pg().a(context);
        d.b().a(a2, true);
        if (e) {
            str2 = J9.a(a2.toString());
        } else {
            str2 = J9.c(a2.toString());
        }
        if (ee == Ee.INITIATED) {
            IronLog.INTERNAL.verbose("external token parameters: " + a2);
        }
        if (TextUtils.isEmpty(str2)) {
            f.a(EnumC4984y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, ee);
        }
        f.a(EnumC4984y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, ee);
        return str2;
    }

    @Override // com.ironsource.V8
    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        if (Z9.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C4770ma.b().b(impressionDataListener);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (Z9.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && Z9.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.T.a(str, jSONObject);
        }
    }

    private void a(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }
}
