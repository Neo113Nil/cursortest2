package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.C1;
import com.ironsource.C4560af;
import com.ironsource.C4630ed;
import com.ironsource.C4782n4;
import com.ironsource.C4841q9;
import com.ironsource.C4966x5;
import com.ironsource.Dc;
import com.ironsource.Ee;
import com.ironsource.EnumC4984y5;
import com.ironsource.Fe;
import com.ironsource.G1;
import com.ironsource.InterfaceC4749l7;
import com.ironsource.Kb;
import com.ironsource.L6;
import com.ironsource.Lb;
import com.ironsource.M1;
import com.ironsource.Mc;
import com.ironsource.Md;
import com.ironsource.Pd;
import com.ironsource.U9;
import com.ironsource.V4;
import com.ironsource.We;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
class q implements Dc {
    private static q z;
    private C4560af a;
    private NetworkStateReceiver p;
    private CountDownTimer q;
    private String t;
    private We u;
    private long w;
    private int b = e.f;
    private InterfaceC4749l7 c = Kb.Y().k();
    private final String d = "appKey";
    private final String e = getClass().getSimpleName();
    private boolean l = false;
    private boolean n = false;
    private List<Mc> r = new ArrayList();
    private String s = "";
    private f y = new a();
    private Handler m = IronSourceThreadManager.INSTANCE.getInitHandler();
    private int f = 1;
    private int g = 0;
    private int h = 62;
    private int i = 12;
    private int j = 5;
    private AtomicBoolean o = new AtomicBoolean(true);
    private boolean k = false;
    private boolean v = false;
    private U9 x = new U9();

    class a extends f {
        a() {
            super();
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x02a2, code lost:
        
            if (r0.g == r0.j) goto L57;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            try {
                p h = p.h();
                if (!TextUtils.isEmpty(q.this.s)) {
                    L6.a().a("userId", q.this.s);
                }
                if (!TextUtils.isEmpty(q.this.t)) {
                    L6.a().a("appKey", q.this.t);
                }
                q qVar = q.this;
                qVar.x.i(qVar.s);
                q.this.w = new Date().getTime();
                Md.c().a();
                q.this.u = h.b(ContextProvider.getInstance().getApplicationContext(), q.this.s, this.c);
                q qVar2 = q.this;
                if (qVar2.u == null) {
                    if (qVar2.g == 3) {
                        qVar2.v = true;
                        Iterator it = qVar2.r.iterator();
                        while (it.hasNext()) {
                            ((Mc) it.next()).a();
                        }
                    }
                    if (this.a) {
                        q qVar3 = q.this;
                        if (qVar3.g < qVar3.h) {
                            qVar3.k = true;
                            qVar3.m.postDelayed(this, qVar3.f * 1000);
                            q qVar4 = q.this;
                            if (qVar4.g < qVar4.i) {
                                qVar4.f *= 2;
                            }
                        }
                    }
                    if (this.a) {
                        q qVar5 = q.this;
                    }
                    q qVar6 = q.this;
                    if (!qVar6.l) {
                        qVar6.l = true;
                        if (TextUtils.isEmpty(this.b)) {
                            this.b = "noServerResponse";
                        }
                        Iterator it2 = q.this.r.iterator();
                        while (it2.hasNext()) {
                            ((Mc) it2.next()).g(this.b);
                        }
                        q.this.b(d.INIT_FAILED);
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    q.this.g++;
                    return;
                }
                qVar2.m.removeCallbacks(this);
                if (!q.this.u.q()) {
                    q qVar7 = q.this;
                    if (qVar7.l) {
                        return;
                    }
                    qVar7.b(d.INIT_FAILED);
                    q qVar8 = q.this;
                    qVar8.l = true;
                    Iterator it3 = qVar8.r.iterator();
                    while (it3.hasNext()) {
                        ((Mc) it3.next()).g("serverResponseIsNotValid");
                    }
                    return;
                }
                q.this.b(d.INITIATED);
                new Lb().a(q.this.u.c().b().e().b(), h.v());
                M1 f = q.this.u.c().b().f();
                if (f != null) {
                    V4 v4 = V4.a;
                    v4.c(f.g());
                    v4.a(f.f());
                    v4.a(f.j());
                    IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(f.h());
                    q.this.c.a(f);
                }
                q.this.a(ContextProvider.getInstance().getApplicationContext(), q.this.u);
                long time = new Date().getTime();
                q qVar9 = q.this;
                h.a(time - qVar9.w, qVar9.u.i());
                if (f != null && f.e()) {
                    new Pd(Kb.Y().q(), new Function0() { // from class: com.ironsource.mediationsdk.q$a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return Long.valueOf(System.currentTimeMillis());
                        }
                    }, Kb.Y(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(ContextProvider.getInstance().getApplicationContext());
                }
                q.this.a = new C4560af();
                q qVar10 = q.this;
                qVar10.a.a(qVar10.c);
                if (q.this.u.c().b().g() && ContextProvider.getInstance().getApplicationContext() != null) {
                    C4841q9.a.a(ContextProvider.getInstance().getApplicationContext());
                }
                List<IronSource.a> h2 = q.this.u.h();
                Iterator it4 = q.this.r.iterator();
                while (it4.hasNext()) {
                    ((Mc) it4.next()).a(h2, q.this.g(), q.this.u.c());
                }
                C4630ed.P.i();
                G1 d = q.this.u.c().b().d();
                if (d.f()) {
                    C4782n4.d().a(d.b(), d.d(), d.c(), d.e(), IronSourceUtils.d(), d.a(), d.g());
                }
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements Runnable {

        class a extends CountDownTimer {
            a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                q qVar = q.this;
                if (qVar.l) {
                    return;
                }
                qVar.l = true;
                Iterator it = qVar.r.iterator();
                while (it.hasNext()) {
                    ((Mc) it.next()).g("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    q qVar = q.this;
                    qVar.v = true;
                    Iterator it = qVar.r.iterator();
                    while (it.hasNext()) {
                        ((Mc) it.next()).a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.q = new a(60000L, 15000L).start();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {
        public static int a = 0;
        public static int b = 1;
        public static int c = 2;
        public static int d = 3;
        public static int e = 4;
        public static int f = 5;
    }

    abstract class f implements Runnable {
        String b;
        boolean a = true;
        protected p.b c = new a();

        class a implements p.b {
            a() {
            }

            @Override // com.ironsource.mediationsdk.p.b
            public void a(String str) {
                f fVar = f.this;
                fVar.a = false;
                fVar.b = str;
            }
        }

        f() {
        }
    }

    private q() {
    }

    public static synchronized q c() {
        q qVar;
        synchronized (q.class) {
            try {
                if (z == null) {
                    z = new q();
                }
                qVar = z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.k;
    }

    public void a(Context context, We we) {
        this.x.i(we.g().h());
        this.x.c(we.g().d());
        C1 b2 = we.c().b();
        this.x.a(b2.a());
        this.x.d(b2.c().b());
        this.x.b(b2.k().b());
        this.x.a(Boolean.valueOf(IronSourceUtils.c(context)));
        M1 f2 = we.c().b().f();
        this.x.b(f2.b());
        Kb.Q().o().a(f2.c());
    }

    public int b() {
        return this.b;
    }

    public synchronized boolean d() {
        return this.v;
    }

    void e() {
        b(d.INIT_FAILED);
    }

    public synchronized void f() {
        int a2 = a(a());
        this.b = a2;
        this.x.c(a2);
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        Fe.a.a(Ee.values()[dVar.ordinal()]);
    }

    private static int a(d dVar) {
        int i = c.a[dVar.ordinal()];
        if (i == 1) {
            return e.d;
        }
        if (i == 2) {
            return e.e;
        }
        if (i != 3) {
            return e.a;
        }
        return e.b;
    }

    public synchronized void a(Context context, String str, String str2, IronSource.a... aVarArr) {
        try {
            try {
                AtomicBoolean atomicBoolean = this.o;
                if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                    b(d.INIT_IN_PROGRESS);
                    this.s = str2;
                    this.t = str;
                    if (IronSourceUtils.f(context)) {
                        this.m.post(this.y);
                    } else {
                        this.n = true;
                        if (this.p == null) {
                            this.p = new NetworkStateReceiver(context, this);
                        }
                        context.registerReceiver(this.p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                    }
                } else {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.e + ": Multiple calls to init are not allowed", 2);
                }
            } catch (Exception e2) {
                C4782n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.Dc
    public void a(boolean z2) {
        if (this.n && z2) {
            CountDownTimer countDownTimer = this.q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.n = false;
            this.k = true;
            Kb.Y().q().a(new C4966x5(EnumC4984y5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.b(false)));
            this.m.post(this.y);
        }
    }

    public synchronized d a() {
        return d.values()[Fe.a.a().ordinal()];
    }
}
