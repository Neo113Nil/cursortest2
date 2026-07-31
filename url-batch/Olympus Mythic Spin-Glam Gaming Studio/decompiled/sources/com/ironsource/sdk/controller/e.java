package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.B5;
import com.ironsource.C4540a4;
import com.ironsource.C4622e5;
import com.ironsource.C4703ie;
import com.ironsource.C4782n4;
import com.ironsource.C4822p8;
import com.ironsource.C4826pc;
import com.ironsource.C4840q8;
import com.ironsource.C4857r8;
import com.ironsource.C4904u1;
import com.ironsource.C4947w4;
import com.ironsource.C4951w8;
import com.ironsource.C4965x4;
import com.ironsource.C4969x8;
import com.ironsource.EnumC4543a7;
import com.ironsource.InterfaceC4871s4;
import com.ironsource.InterfaceC4889t4;
import com.ironsource.InterfaceC4907u4;
import com.ironsource.Kb;
import com.ironsource.L3;
import com.ironsource.N;
import com.ironsource.Nb;
import com.ironsource.Pb;
import com.ironsource.R7;
import com.ironsource.T4;
import com.ironsource.U4;
import com.ironsource.W5;
import com.ironsource.X3;
import com.ironsource.X5;
import com.ironsource.Y6;
import com.ironsource.gh;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {
    private com.ironsource.sdk.controller.l b;
    private CountDownTimer d;
    private final R7 g;
    private final gh h;
    private final C4826pc k;
    private final String a = e.class.getSimpleName();
    private C4822p8.b c = C4822p8.b.None;
    private final L3 e = new L3("NativeCommandExecutor");
    private final L3 f = new L3("ControllerCommandsExecutor");
    private final Map<String, l.a> i = new HashMap();
    private final Map<String, l.b> j = new HashMap();

    class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4889t4 b;

        a(JSONObject jSONObject, InterfaceC4889t4 interfaceC4889t4) {
            this.a = jSONObject;
            this.b = interfaceC4889t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4889t4 c;

        b(T4 t4, Map map, InterfaceC4889t4 interfaceC4889t4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC4889t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC4871s4 d;

        c(String str, String str2, T4 t4, InterfaceC4871s4 interfaceC4871s4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC4871s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4871s4 b;

        d(JSONObject jSONObject, InterfaceC4871s4 interfaceC4871s4) {
            this.a = jSONObject;
            this.b = interfaceC4871s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC1374e implements Runnable {
        final /* synthetic */ T4 a;

        RunnableC1374e(T4 t4) {
            this.a = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a);
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ T4 a;

        f(T4 t4) {
            this.a = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4871s4 c;

        g(T4 t4, Map map, InterfaceC4871s4 interfaceC4871s4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC4871s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    class h implements Runnable {
        final /* synthetic */ l.a a;
        final /* synthetic */ f.c b;

        h(l.a aVar, f.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.b != null) {
                if (this.a != null) {
                    eVar.i.put(this.b.f(), this.a);
                }
                e.this.b.a(this.b, this.a);
            }
        }
    }

    class i implements Runnable {
        final /* synthetic */ JSONObject a;

        i(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a();
                e.this.b = null;
            }
        }
    }

    class k extends CountDownTimer {
        k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Global Controller Timer Finish");
            e.this.d(X3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    class m implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        m(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.b = eVar.b(eVar.h.b(), e.this.h.d(), e.this.h.f(), e.this.h.e(), e.this.h.g(), e.this.h.c(), this.a, this.b);
                e.this.b.b();
            } catch (Throwable th) {
                C4782n4.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    class n extends CountDownTimer {
        n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(X3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class o implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC4907u4 d;

        o(String str, String str2, T4 t4, InterfaceC4907u4 interfaceC4907u4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC4907u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class p implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4907u4 b;

        p(JSONObject jSONObject, InterfaceC4907u4 interfaceC4907u4) {
            this.a = jSONObject;
            this.b = interfaceC4907u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class q implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC4889t4 d;

        q(String str, String str2, T4 t4, InterfaceC4889t4 interfaceC4889t4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC4889t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class r implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ InterfaceC4889t4 b;

        r(String str, InterfaceC4889t4 interfaceC4889t4) {
            this.a = str;
            this.b = interfaceC4889t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class s implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4889t4 c;

        s(T4 t4, Map map, InterfaceC4889t4 interfaceC4889t4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC4889t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4951w8.a(C4703ie.j, new C4857r8().a(B5.v, this.a.f()).a("producttype", C4969x8.a(this.a, C4822p8.e.Interstitial)).a(B5.x, Boolean.valueOf(C4969x8.a(this.a))).a(B5.I, Long.valueOf(N.a.b(this.a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a, this.b, this.c);
            }
        }
    }

    public e(Context context, C4540a4 c4540a4, U4 u4, R7 r7, int i2, JSONObject jSONObject, String str, String str2, C4826pc c4826pc) {
        this.k = c4826pc;
        this.g = r7;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C4622e5 a2 = C4622e5.a(networkStorageDir, r7, jSONObject);
        this.h = new gh(context, c4540a4, u4, i2, a2, networkStorageDir);
        a(context, c4540a4, u4, i2, a2, networkStorageDir, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C4540a4 c4540a4, U4 u4, int i2, C4622e5 c4622e5, String str, String str2, String str3) {
        try {
            v b2 = b(context, c4540a4, u4, i2, c4622e5, str, str2, str3);
            this.b = b2;
            b2.b();
        } catch (Throwable th) {
            C4782n4.d().a(th);
            d(Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        C4951w8.a(C4703ie.d, new C4857r8().a(B5.A, str).a());
        this.c = C4822p8.b.Loading;
        this.b = new com.ironsource.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        R7 r7 = this.g;
        if (r7 != null) {
            r7.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C4840q8(1001, str));
    }

    private l.a i() {
        return new l.a() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                e.this.a(aVar);
            }
        };
    }

    private l.b j() {
        return new l.b() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Nb nb) {
                e.this.a(nb);
            }
        };
    }

    private void l() {
        Logger.i(this.a, "handleReadyState");
        this.c = C4822p8.b.Ready;
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f.c();
        this.f.a();
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C4822p8.b.Ready.equals(this.c);
    }

    private void n() {
        this.h.a(true);
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C4822p8.c h() {
        com.ironsource.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.h() : C4822p8.c.None;
    }

    public com.ironsource.sdk.controller.l k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(f.a aVar) {
        l.a remove = this.i.remove(aVar.c());
        if (remove != null) {
            remove.a(aVar);
        }
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C4540a4 c4540a4, U4 u4, int i2, C4622e5 c4622e5, String str, String str2, String str3) throws Throwable {
        C4951w8.a(C4703ie.c, new C4857r8().a(B5.y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, u4, c4540a4, this, this.g, i2, c4622e5, str, i(), j(), str2, str3);
        X5 x5 = new X5(context, c4622e5, new W5(this.g.a()), new Pb(c4622e5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c4622e5.a(), x5));
        vVar.a(new C4904u1());
        vVar.a(new C4965x4(context, new C4947w4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Nb nb) {
        l.b bVar = this.j.get(nb.d());
        if (bVar != null) {
            bVar.a(nb);
        }
    }

    private void a(Runnable runnable, long j2) {
        R7 r7 = this.g;
        if (r7 != null) {
            r7.d(runnable, j2);
        } else {
            Logger.e(this.a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final C4540a4 c4540a4, final U4 u4, final int i2, final C4622e5 c4622e5, final String str, final String str2, final String str3) {
        int C = Kb.Y().h().C();
        if (C > 0) {
            C4951w8.a(C4703ie.B, new C4857r8().a(B5.y, String.valueOf(C)).a());
        }
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                e.this.c(context, c4540a4, u4, i2, c4622e5, str, str2, str3);
            }
        };
        if (Kb.Y().h().s()) {
            this.g.b(runnable, C);
        } else {
            a(runnable, C);
        }
        this.d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.a, "handleControllerLoaded");
        this.c = C4822p8.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.a, "handleControllerReady ");
        this.k.a(h());
        if (C4822p8.c.Web.equals(h())) {
            C4951w8.a(C4703ie.e, new C4857r8().a(B5.y, String.valueOf(this.h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.a, "handleControllerFailed ");
        C4857r8 c4857r8 = new C4857r8();
        c4857r8.a(B5.A, str);
        c4857r8.a(B5.y, String.valueOf(this.h.l()));
        C4951w8.a(C4703ie.o, c4857r8.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            Logger.i(this.a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        C4951w8.a(C4703ie.y, new C4857r8().a(B5.y, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4, Map<String, String> map, InterfaceC4889t4 interfaceC4889t4) {
        this.f.a(new s(t4, map, interfaceC4889t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4) {
        this.f.a(new f(t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f.a(new i(jSONObject));
    }

    public void a(Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.ironsource.InterfaceC4588c7
    public void a(@NotNull Y6 y6) {
        EnumC4543a7 b2 = y6.b();
        if (b2 == EnumC4543a7.SendEvent) {
            C4951w8.a(C4703ie.A, new C4857r8().a(B5.y, y6.a() + " : strategy: " + b2).a());
            return;
        }
        if (b2 == EnumC4543a7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(y6.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.h());
            C4951w8.a(C4703ie.d, new C4857r8().a(B5.A, y6.a() + " : strategy: " + b2).a());
            C4951w8.a(C4703ie.A, new C4857r8().a(B5.y, y6.a() + " : strategy: " + b2).a());
        }
    }

    private void a(C4822p8.e eVar, T4 t4, String str, String str2) {
        Logger.i(this.a, "recoverWebController for product: " + eVar.toString());
        C4857r8 c4857r8 = new C4857r8();
        c4857r8.a("producttype", eVar.toString());
        c4857r8.a(B5.v, t4.f());
        C4951w8.a(C4703ie.b, c4857r8.a());
        this.h.n();
        a();
        m mVar = new m(str, str2);
        if (Kb.Y().h().s()) {
            this.g.b(mVar);
        } else {
            b(mVar);
        }
        this.d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4907u4 interfaceC4907u4) {
        if (this.h.a(h(), this.c)) {
            a(C4822p8.e.RewardedVideo, t4, str, str2);
        }
        this.f.a(new o(str, str2, t4, interfaceC4907u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4907u4 interfaceC4907u4) {
        this.f.a(new p(jSONObject, interfaceC4907u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4889t4 interfaceC4889t4) {
        if (this.h.a(h(), this.c)) {
            a(C4822p8.e.Interstitial, t4, str, str2);
        }
        this.f.a(new q(str, str2, t4, interfaceC4889t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4889t4 interfaceC4889t4) {
        Logger.i(this.a, "load interstitial");
        this.f.a(new r(str, interfaceC4889t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4889t4 interfaceC4889t4) {
        this.f.a(new a(jSONObject, interfaceC4889t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4889t4 interfaceC4889t4) {
        this.f.a(new b(t4, map, interfaceC4889t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.b == null || !m()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4871s4 interfaceC4871s4) {
        if (this.h.a(h(), this.c)) {
            a(C4822p8.e.Banner, t4, str, str2);
        }
        this.f.a(new c(str, str2, t4, interfaceC4871s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4871s4 interfaceC4871s4) {
        this.f.a(new d(jSONObject, interfaceC4871s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4) {
        this.f.a(new RunnableC1374e(t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4871s4 interfaceC4871s4) {
        this.f.a(new g(t4, map, interfaceC4871s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, @Nullable l.a aVar) {
        this.f.a(new h(aVar, cVar));
    }

    public void a(String str, l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.a, "destroy controller");
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        L3 l3 = this.f;
        if (l3 != null) {
            l3.b();
        }
        this.d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.b.a(activity);
    }
}
