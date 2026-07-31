package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetManager;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.webform.WebFormClient;
import com.my.target.g;
import com.my.target.h6;
import com.my.target.he;
import com.my.target.ie;
import com.my.target.instreamads.InstreamAd;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.instreamads.InstreamAdVideoMotionPlayer;
import com.my.target.instreamads.postview.InstreamAdPostViewPlayer;
import com.my.target.instreamads.qrcta.QrCtaPlayer;
import com.my.target.n6;
import com.my.target.og;
import com.my.target.p;
import com.my.target.tb;
import com.my.target.z6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class f6 {
    final InstreamAd a;
    final l6 b;
    final n c;
    final n6 d;
    final z6 e;
    final l2 f;
    final tb.a g;
    final MenuFactory h;
    og i;
    public volatile ie j;
    eb k;
    public InstreamAd.InstreamAdBanner l;
    InstreamAd.InstreamAdVideoMotionBanner m;
    List o;
    com.my.target.f p;
    String q;
    int v;
    final g.a n = new a();
    final h6 r = new h6(3000, new b());
    i6 s = new i6();
    float[] t = new float[0];
    int u = 0;
    private final bb w = new bb();
    private final ie.a x = new c();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements g.a {
        a() {
        }

        @Override // com.my.target.g.a
        public void b() {
            InstreamAd.InstreamAdListener listener = f6.this.a.getListener();
            if (listener == null) {
                mi.a("InstreamAdEngine: can't call onBannerShouldClose callback, instreamAdListener is null");
                return;
            }
            if (f6.this.k.M().equals("video-motion")) {
                mi.a("InstreamAdEngine: onVideoMotionBannerShouldClose called by adChoicesOption");
                f6 f6Var = f6.this;
                listener.onVideoMotionBannerShouldClose(f6Var.a, f6Var.m);
            } else {
                if (f6.this.k.M().equals("video")) {
                    mi.a("InstreamAdEngine: onBannerShouldClose called by adChoicesOption");
                    listener.onBannerShouldClose();
                    return;
                }
                mi.a("InstreamAdEngine: ignore " + f6.this.k.M() + " banner type for closing by adChoicesOption");
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements h6.d {
        private InstreamAd.InstreamAdBanner a;

        b() {
        }

        @Override // com.my.target.h6.d
        public void a() {
            if (this.a == null) {
                return;
            }
            InstreamAd.InstreamAdListener listener = f6.this.a.getListener();
            if (listener != null) {
                listener.onPostViewComplete();
                listener.onBannerComplete(f6.this.a, this.a);
            }
            this.a = null;
            f6.this.c();
        }

        @Override // com.my.target.h6.d
        public void b() {
            if (this.a == null) {
                return;
            }
            InstreamAd.InstreamAdListener listener = f6.this.a.getListener();
            if (listener != null) {
                listener.onPostViewComplete();
                listener.onBannerComplete(f6.this.a, this.a);
            }
            this.a = null;
        }

        @Override // com.my.target.h6.d
        public void onPostViewStart() {
            f6 f6Var = f6.this;
            this.a = f6Var.l;
            InstreamAd.InstreamAdListener listener = f6Var.a.getListener();
            if (listener != null) {
                listener.onPostViewStart();
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class c implements ie.a {
        c() {
        }

        @Override // com.my.target.ie.a
        public boolean a(List list, p.b bVar) {
            return f6.this.a(list, bVar);
        }

        @Override // com.my.target.ie.a
        public void a() {
            f6.this.b();
        }

        @Override // com.my.target.ie.a
        public void a(eb ebVar, String str) {
            f6.this.a(ebVar, str);
        }

        @Override // com.my.target.ie.a
        public void a(eb ebVar) {
            f6.this.a(ebVar);
        }

        @Override // com.my.target.ie.a
        public void a(ie ieVar, boolean z) {
            if (z) {
                f6.this.b(ieVar);
            } else {
                f6.this.a(ieVar);
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class d implements he.a {
        final /* synthetic */ InstreamAd.SectionPrepareCallback a;

        d(InstreamAd.SectionPrepareCallback sectionPrepareCallback) {
            this.a = sectionPrepareCallback;
        }

        @Override // com.my.target.he.a
        public boolean a(List list, p.b bVar) {
            return f6.this.a(list, bVar);
        }

        @Override // com.my.target.he.a
        public void a(IAdLoadingError iAdLoadingError, hb hbVar, float f) {
            f6.this.w.b(hbVar, f);
            try {
                this.a.onPrepareResult(hbVar.h(), f, iAdLoadingError, f6.this.a);
            } catch (Throwable th) {
                mi.a("InstreamAdEngine: sectionPrepareCallback.onPrepareResult failed: " + th.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class e implements og.a {
        final rg a;
        final l2 b;
        final WeakReference c;
        final WebFormClient d;
        final CustomParams e;

        e(rg rgVar, l2 l2Var, WebFormClient webFormClient, CustomParams customParams, Context context) {
            this.a = rgVar;
            this.b = l2Var;
            this.c = new WeakReference(context.getApplicationContext());
            this.d = webFormClient;
            this.e = customParams;
        }

        @Override // com.my.target.og.a
        public void a(String str) {
            Context context = (Context) this.c.get();
            if (context == null) {
                return;
            }
            this.b.a(this.a, str, 1, this.d, context);
        }

        @Override // com.my.target.og.a
        public void b(String str) {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class g implements z6.a {
        g() {
        }

        private boolean c(hj hjVar) {
            if (f6.this.j == null) {
                return true;
            }
            f6 f6Var = f6.this;
            return f6Var.k != hjVar || f6Var.m == null;
        }

        @Override // com.my.target.z6.a
        public void a(hj hjVar) {
            if (c(hjVar)) {
                return;
            }
            InstreamAdPlayer player = f6.this.a.getPlayer();
            if (player != null) {
                player.stopAdVideo();
            }
            InstreamAd.InstreamAdListener listener = f6.this.a.getListener();
            if (listener != null) {
                f6 f6Var = f6.this;
                listener.onVideoMotionBannerComplete(f6Var.a, f6Var.m);
            }
            f6 f6Var2 = f6.this;
            if (f6Var2.u == 0) {
                f6Var2.i();
            }
        }

        @Override // com.my.target.z6.a
        public void b(hj hjVar) {
            InstreamAd.InstreamAdListener listener;
            if (c(hjVar) || (listener = f6.this.a.getListener()) == null) {
                return;
            }
            f6 f6Var = f6.this;
            listener.onVideoMotionBannerStart(f6Var.a, f6Var.m);
        }
    }

    private f6(InstreamAd instreamAd, l6 l6Var, n nVar, tb.a aVar, MenuFactory menuFactory) {
        this.a = instreamAd;
        this.b = l6Var;
        this.c = nVar;
        this.g = aVar;
        n6 j = n6.j();
        this.d = j;
        j.a(new f());
        l2 a2 = l2.a(instreamAd.getCustomParams());
        this.f = a2;
        z6 a3 = z6.a(a2, instreamAd.getCustomParams(), instreamAd.getWebFormClient());
        this.e = a3;
        a3.a(new g());
        this.h = menuFactory;
    }

    public static f6 a(InstreamAd instreamAd, l6 l6Var, n nVar, tb.a aVar, MenuFactory menuFactory) {
        return new f6(instreamAd, l6Var, nVar, aVar, menuFactory);
    }

    public void b(Context context) {
        mi.a("InstreamAdEngine: handleAdChoicesClick called");
        com.my.target.f fVar = this.p;
        if (fVar != null) {
            if (fVar.b()) {
                return;
            }
            this.p.a(context);
            this.p.a(this.n);
            return;
        }
        mi.a("InstreamAdEngine: hasn't adChoicesOptions");
        if (this.q != null) {
            mi.a("InstreamAdEngine: open adChoicesClickLink");
            a7.a(this.q, context);
        }
    }

    public void c(String str) {
        a(this.j);
        hb a2 = this.b.a(str);
        if (a2 != null) {
            a(a2, -1.0f);
            return;
        }
        mi.a("InstreamAdEngine: No section with name " + str);
    }

    public InstreamAdPlayer d() {
        return this.d.f();
    }

    public float e() {
        return this.d.g();
    }

    public void f() {
        if (this.k == null) {
            mi.a("InstreamAdEngine: can't handle click - no playing banner");
            return;
        }
        Context e2 = this.d.e();
        if (e2 == null) {
            mi.a("InstreamAdEngine: can't handle click - context is null");
        } else {
            this.f.a(this.k, 2, this.a.getWebFormClient(), e2);
        }
    }

    public boolean g() {
        return this.u != 0;
    }

    public void h() {
        if (this.j == null || this.r.f()) {
            return;
        }
        this.d.k();
    }

    void i() {
        ie ieVar = this.j;
        if (ieVar != null) {
            ieVar.d();
        } else {
            b();
        }
    }

    public void j() {
        if (this.j == null || this.r.f()) {
            return;
        }
        this.d.l();
    }

    public void k() {
        a(this.k, "closedByUser");
        this.d.n();
        a(this.j);
    }

    public void l() {
        a(this.k, "closedByUser");
        this.d.n();
        this.d.m();
        if (this.r.f()) {
            this.r.a();
        }
        i();
    }

    public void m() {
        a(this.j);
    }

    public void a(InstreamAdPlayer instreamAdPlayer) {
        this.d.a(instreamAdPlayer);
    }

    public void a(InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        this.e.a(instreamAdVideoMotionPlayer);
    }

    public void a(float[] fArr) {
        this.t = fArr;
    }

    public void a(int i) {
        this.v = i;
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class f implements n6.a {
        f() {
        }

        private boolean f(eb ebVar) {
            if (f6.this.j == null) {
                return true;
            }
            f6 f6Var = f6.this;
            return f6Var.k != ebVar || f6Var.l == null;
        }

        @Override // com.my.target.n6.a
        public void a(eb ebVar) {
            InstreamAd.InstreamAdListener listener;
            if (f(ebVar) || (listener = f6.this.a.getListener()) == null) {
                return;
            }
            f6 f6Var = f6.this;
            listener.onBannerResume(f6Var.a, f6Var.l);
        }

        @Override // com.my.target.n6.a
        public void b(eb ebVar) {
            if (f(ebVar)) {
                return;
            }
            rg n0 = ebVar.n0();
            if (n0 != null && f6.this.g() && f6.this.i != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long b = f6.this.i.b();
                long X = n0.X();
                mi.a("InstreamAdEngine$VideoControllerListener: cm=" + currentTimeMillis + ", vi=" + b + ", it=" + X);
                if (currentTimeMillis - b < X) {
                    f6.this.a(n0, "shoppableReplay");
                    f6.this.d.a(ebVar, true);
                    return;
                } else {
                    f6.this.d.m();
                    f6.this.u = 2;
                }
            }
            InstreamAdPlayer player = f6.this.a.getPlayer();
            if (player != null) {
                player.stopAdVideo();
            }
            ue h0 = f6.this.k.h0();
            if (h0 == null || !f6.this.r.g()) {
                InstreamAd.InstreamAdListener listener = f6.this.a.getListener();
                if (listener != null) {
                    f6 f6Var = f6.this;
                    listener.onBannerComplete(f6Var.a, f6Var.l);
                }
                f6.this.c();
            } else {
                f6.this.r.b(h0);
            }
            if (ebVar.j0() != null) {
                f6.this.s.a(ebVar.j0());
            }
        }

        @Override // com.my.target.n6.a
        public void c(eb ebVar) {
            InstreamAd.InstreamAdListener listener;
            if (f(ebVar) || (listener = f6.this.a.getListener()) == null) {
                return;
            }
            f6 f6Var = f6.this;
            listener.onBannerPause(f6Var.a, f6Var.l);
        }

        @Override // com.my.target.n6.a
        public void d(eb ebVar) {
            if (!f(ebVar) && f6.this.u == 0) {
                mi.a("InstreamAdEngine$VideoControllerListener: Ad shown, banner Id = " + ebVar.x());
                InstreamAd.InstreamAdListener listener = f6.this.a.getListener();
                if (listener != null) {
                    f6 f6Var = f6.this;
                    listener.onBannerStart(f6Var.a, f6Var.l);
                }
                if (ebVar.j0() != null) {
                    f6.this.s.b();
                }
            }
        }

        @Override // com.my.target.n6.a
        public void e(eb ebVar) {
            InstreamAd.InstreamAdListener listener;
            if (f(ebVar) || (listener = f6.this.a.getListener()) == null) {
                return;
            }
            f6 f6Var = f6.this;
            listener.onBannerComplete(f6Var.a, f6Var.l);
        }

        @Override // com.my.target.n6.a
        public void a(float f, float f2, eb ebVar) {
            if (f(ebVar)) {
                return;
            }
            InstreamAd.InstreamAdListener listener = f6.this.a.getListener();
            if (listener != null) {
                listener.onBannerTimeLeftChange(f, f2, f6.this.a);
            }
            f6.this.s.a(f, f2, ebVar);
        }

        @Override // com.my.target.n6.a
        public void a(String str, eb ebVar) {
            if (f(ebVar)) {
                return;
            }
            InstreamAd.InstreamAdListener listener = f6.this.a.getListener();
            if (listener != null) {
                listener.onError(str, f6.this.a);
            }
            f6.this.s.a();
            f6.this.i();
        }
    }

    public void a(boolean z) {
        String str;
        if (!z) {
            str = "fullscreenOff";
        } else {
            str = "fullscreenOn";
        }
        a(this.k, str);
    }

    public void c(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        if (this.d.e() == null) {
            mi.a("can't handle show: context is null");
            return;
        }
        c3 a2 = a(instreamAdCompanionBanner);
        if (a2 == null) {
            mi.a("can't handle show: companion banner not found");
        } else {
            wh.b(a2.H(), "playbackStarted", 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List list, p.b bVar) {
        jg c2 = MyTargetManager.c();
        if (c2 == null) {
            mi.a("InstreamAdEngine: can't load after services - context is null");
            return false;
        }
        g6.a(list, this.c, this.g, this.v).a(bVar).a(this.g.a(), c2.a);
        return true;
    }

    public void b(InstreamAdPlayer instreamAdPlayer) {
        this.d.b(instreamAdPlayer);
    }

    public void b(boolean z) {
        eb ebVar = this.k;
        if (ebVar == null || ebVar.n0() == null) {
            return;
        }
        if (!z && this.u == 2) {
            i();
        }
        this.u = z ? 1 : 0;
        a(this.k, z ? "shoppableOn" : "shoppableOff");
    }

    void c() {
        if (this.u == 0) {
            i();
        }
    }

    public void a(String str, InstreamAd.SectionPrepareCallback sectionPrepareCallback) {
        hb a2 = this.b.a(str);
        if (a2 != null) {
            a(a2, -1.0f, sectionPrepareCallback);
            return;
        }
        mi.a("InstreamAdEngine: No section with name " + str);
    }

    public void a(float f2, InstreamAd.SectionPrepareCallback sectionPrepareCallback) {
        q qVar;
        float[] fArr = this.t;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (Float.compare(fArr[i], f2) == 0) {
                    hb a2 = this.b.a("midroll");
                    if (a2 != null) {
                        a(a2, f2, sectionPrepareCallback);
                        qVar = null;
                    } else {
                        qVar = q.o;
                    }
                } else {
                    i++;
                }
            } else {
                mi.a("InstreamAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
                qVar = q.o;
                break;
            }
        }
        if (qVar != null) {
            sectionPrepareCallback.onPrepareResult("midroll", f2, qVar, this.a);
        }
    }

    public void b(float f2) {
        a(this.j);
        for (float f3 : this.t) {
            if (Float.compare(f3, f2) == 0) {
                hb a2 = this.b.a("midroll");
                if (a2 != null) {
                    a(a2, f2);
                    return;
                }
                return;
            }
        }
        mi.a("InstreamAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    public void b(String str) {
        a(str, "shoppableAdsItemShow");
        a(str, "show");
    }

    public void b(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context e2 = this.d.e();
        if (e2 == null) {
            mi.a("InstreamAdEngine: can't handle click - context is null");
        } else {
            a(instreamAdCompanionBanner, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ie ieVar) {
        if (ieVar != null) {
            if (this.r.f()) {
                this.r.a();
            } else {
                this.d.m();
            }
            b(ieVar);
        }
    }

    void b() {
        this.u = 0;
        og ogVar = this.i;
        if (ogVar == null) {
            return;
        }
        ogVar.a();
        this.i.a((og.a) null);
        this.i = null;
    }

    public void a(String str) {
        a(str, "shoppableAdsItemClick");
        a(str, "click");
    }

    public void a(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        c3 a2 = a(instreamAdCompanionBanner);
        if (a2 == null) {
            mi.a("InstreamAdEngine: can't handle click - companion banner is null");
        } else {
            this.f.a(a2, 1, this.a.getWebFormClient(), context);
        }
    }

    void b(ie ieVar) {
        this.w.a(ieVar);
        if (ieVar != this.j) {
            return;
        }
        b();
        this.k = null;
        this.l = null;
        this.m = null;
        this.j = null;
        InstreamAd.InstreamAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onComplete(ieVar.b.h(), this.a);
        }
    }

    public void a() {
        this.d.d();
        b();
    }

    public void a(float f2) {
        this.d.b(f2);
    }

    public void a(InstreamAdPostViewPlayer instreamAdPostViewPlayer) {
        this.r.a(instreamAdPostViewPlayer);
    }

    public void a(QrCtaPlayer qrCtaPlayer) {
        this.s.a(qrCtaPlayer);
    }

    public View a(Context context) {
        og ogVar = this.i;
        if (ogVar != null) {
            return ogVar.c();
        }
        eb ebVar = this.k;
        if (ebVar == null) {
            mi.a("InstreamAdEngine: no current banner");
            return null;
        }
        rg n0 = ebVar.n0();
        if (n0 == null) {
            mi.a("InstreamAdEngine: no shoppable banner");
            return null;
        }
        og ogVar2 = new og(n0, new sg(n0, this.f, this.k.m0(), this.a.getWebFormClient(), context), context);
        this.i = ogVar2;
        ogVar2.a(new e(n0, this.f, this.a.getWebFormClient(), this.a.getCustomParams(), context));
        return this.i.c();
    }

    private void a(hb hbVar, float f2, InstreamAd.SectionPrepareCallback sectionPrepareCallback) {
        this.w.a(this.j, hbVar, f2, new d(sectionPrepareCallback));
    }

    private void a(final hb hbVar, float f2) {
        this.w.a(hbVar, f2, this.x, new g3() { // from class: com.my.target.f6$$ExternalSyntheticLambda0
            @Override // com.my.target.g3
            public final void accept(Object obj) {
                f6.this.a(hbVar, (ie) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(hb hbVar, ie ieVar) {
        if (this.a.getPlayer() == null) {
            mi.a("InstreamAdEngine: Unable to start delayed ad: player has not set");
            return;
        }
        this.j = ieVar;
        this.d.b(hbVar.e());
        ieVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(eb ebVar) {
        List list;
        this.k = ebVar;
        com.my.target.e a2 = ebVar.a();
        if (a2 != null) {
            this.q = a2.c();
            list = a2.b();
        } else {
            list = null;
        }
        if (list != null) {
            this.p = com.my.target.f.a(a2, this.h);
        }
        if (ebVar instanceof hj) {
            hj hjVar = (hj) ebVar;
            InstreamAd.InstreamAdVideoMotionBanner a3 = InstreamAd.InstreamAdVideoMotionBanner.a(hjVar);
            this.m = a3;
            if (a3 == null) {
                mi.a("InstreamAdEngine: can't create instreamAdVideoMotionBanner");
                return;
            } else {
                this.e.a(hjVar, a3);
                return;
            }
        }
        if (ebVar.A0() != null) {
            this.l = InstreamAd.InstreamAdBanner.a(ebVar, (dj) ebVar.A0());
            this.o = new ArrayList(this.l.companionBanners);
            this.d.a(ebVar);
            return;
        }
        mi.a("InstreamAdEngine: failed play instreamAd banner, media-data is empty");
    }

    void a(String str, String str2) {
        if (this.d.e() == null) {
            mi.a("InstreamAdEngine: Can't send stat - context is null");
            return;
        }
        eb ebVar = this.k;
        if (ebVar == null) {
            mi.a("InstreamAdEngine: hasn't current banner");
            return;
        }
        pg m0 = ebVar.m0();
        if (m0 == null) {
            mi.a("InstreamAdEngine: hasn't shoppableAdsData");
            return;
        }
        for (z7 z7Var : m0.a()) {
            if (str.equals(z7Var.id)) {
                wh.b(z7Var.a, str2, 999);
                wh.b(m0.b(), str2, 999);
                return;
            }
        }
        mi.a("InstreamAdEngine: wrong shoppableAdsItemId");
    }

    void a(com.my.target.b bVar, String str) {
        if (bVar == null) {
            mi.a("InstreamAdEngine: Can't send stat - banner is null");
        } else if (this.d.e() == null) {
            mi.a("InstreamAdEngine: Can't send stat - context is null");
        } else {
            wh.b(bVar.H(), str, 1);
        }
    }

    c3 a(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        eb ebVar;
        if (this.o != null && this.l != null && (ebVar = this.k) != null) {
            ArrayList c0 = ebVar.c0();
            int indexOf = this.o.indexOf(instreamAdCompanionBanner);
            if (indexOf >= 0 && indexOf < c0.size()) {
                return (c3) c0.get(indexOf);
            }
            mi.a("InstreamAdEngine: can't find companion banner - provided instreamAdCompanionBanner not found in current playing banner");
            return null;
        }
        mi.a("InstreamAdEngine: can't find companion banner - no playing banner");
        return null;
    }
}
