package com.my.target;

import android.content.Context;
import com.my.target.common.MyTargetManager;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.e6;
import com.my.target.g;
import com.my.target.he;
import com.my.target.ie;
import com.my.target.instreamads.InstreamAudioAd;
import com.my.target.instreamads.InstreamAudioAdPlayer;
import com.my.target.p;
import com.my.target.tb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public class p6 {
    final InstreamAudioAd a;
    final MenuFactory b;
    private final l6 c;
    private final n d;
    private final tb.a e;
    private final e6 f;
    private final l2 g;
    f h;
    String i;
    public volatile ie j;
    eb k;
    InstreamAudioAd.InstreamAudioAdBanner l;
    private List n;
    private int p;
    final g.a m = new a();
    private float[] o = new float[0];
    private final bb q = new bb();
    private final ie.a r = new b();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements g.a {
        a() {
        }

        @Override // com.my.target.g.a
        public void b() {
            InstreamAudioAd.InstreamAudioAdListener listener = p6.this.a.getListener();
            if (listener != null) {
                p6 p6Var = p6.this;
                listener.onBannerShouldClose(p6Var.a, p6Var.l);
                mi.a("InstreamAudioAdEngine: onBannerShouldClose called by adChoicesOption");
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class c implements he.a {
        final /* synthetic */ InstreamAudioAd.a a;

        c(InstreamAudioAd.a aVar) {
            this.a = aVar;
        }

        @Override // com.my.target.he.a
        public boolean a(List list, p.b bVar) {
            return p6.this.a(list, bVar);
        }

        @Override // com.my.target.he.a
        public void a(IAdLoadingError iAdLoadingError, hb hbVar, float f) {
            p6.this.q.b(hbVar, f);
            try {
                this.a.a(hbVar.h(), f, iAdLoadingError, p6.this.a);
            } catch (Throwable th) {
                mi.a("InstreamAudioAdEngine: sectionPrepareCallback.onPrepareResult failed: " + th.getMessage());
            }
        }
    }

    private p6(InstreamAudioAd instreamAudioAd, l6 l6Var, n nVar, tb.a aVar, MenuFactory menuFactory) {
        this.a = instreamAudioAd;
        this.c = l6Var;
        this.d = nVar;
        this.e = aVar;
        e6 h = e6.h();
        this.f = h;
        h.a(new d());
        this.g = l2.a(instreamAudioAd.getCustomParams());
        this.b = menuFactory;
    }

    public static p6 a(InstreamAudioAd instreamAudioAd, l6 l6Var, n nVar, tb.a aVar, MenuFactory menuFactory) {
        return new p6(instreamAudioAd, l6Var, nVar, aVar, menuFactory);
    }

    public void b(float f) {
        a(this.j);
        for (float f2 : this.o) {
            if (Float.compare(f2, f) == 0) {
                hb a2 = this.c.a("midroll");
                if (a2 != null) {
                    a(a2, f);
                    return;
                }
                return;
            }
        }
        mi.a("InstreamAudioAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    public InstreamAudioAdPlayer c() {
        return this.f.e();
    }

    public float d() {
        return this.f.f();
    }

    public void e() {
        if (this.k == null) {
            mi.a("InstreamAudioAdEngine: can't handle click - no playing banner");
            return;
        }
        Context d2 = this.f.d();
        if (d2 == null) {
            mi.a("InstreamAudioAdEngine: can't handle click - context is null");
        } else {
            this.g.a(this.k, 1, this.a.getWebFormClient(), d2);
        }
    }

    public void f() {
        if (this.j != null) {
            this.f.i();
        }
    }

    void g() {
        ie ieVar = this.j;
        if (ieVar != null) {
            ieVar.d();
        }
    }

    public void h() {
        if (this.j != null) {
            this.f.j();
        }
    }

    public void i() {
        a(this.k, "closedByUser");
        a(this.j);
    }

    public void j() {
        a(this.k, "closedByUser");
        this.f.k();
        g();
    }

    public void k() {
        a(this.j);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements ie.a {
        b() {
        }

        @Override // com.my.target.ie.a
        public void a() {
        }

        @Override // com.my.target.ie.a
        public boolean a(List list, p.b bVar) {
            return p6.this.a(list, bVar);
        }

        @Override // com.my.target.ie.a
        public void a(eb ebVar, String str) {
            p6.this.a(ebVar, str);
        }

        @Override // com.my.target.ie.a
        public void a(eb ebVar) {
            p6.this.a(ebVar);
        }

        @Override // com.my.target.ie.a
        public void a(ie ieVar, boolean z) {
            if (z) {
                p6.this.b(ieVar);
            } else {
                p6.this.a(ieVar);
            }
        }
    }

    public void a(Context context) {
        mi.a("InstreamAudioAdEngine: handleAdChoicesClick called");
        f fVar = this.h;
        if (fVar != null) {
            if (fVar.b()) {
                return;
            }
            this.h.a(context);
            this.h.a(this.m);
            return;
        }
        mi.a("InstreamAudioAdEngine: hasn't adChoicesOptions");
        if (this.i != null) {
            mi.a("InstreamAudioAdEngine: open adChoicesClickLink");
            a7.a(this.i, context);
        }
    }

    public void c(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        if (this.f.d() == null) {
            mi.a("InstreamAudioAdEngine: Can't handle show - context is null");
            return;
        }
        c3 a2 = a(instreamAdCompanionBanner);
        if (a2 == null) {
            mi.a("InstreamAudioAdEngine: Can't handle show - companion banner not found");
        } else {
            wh.b(a2.H(), "playbackStarted", 1);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class d implements e6.b {
        d() {
        }

        private boolean d(eb ebVar) {
            if (p6.this.j == null) {
                return true;
            }
            p6 p6Var = p6.this;
            return p6Var.k != ebVar || p6Var.l == null;
        }

        @Override // com.my.target.e6.b
        public void a(eb ebVar) {
            if (d(ebVar)) {
                return;
            }
            mi.a("InstreamAudioAdEngine: Ad shown, banner Id = " + ebVar.x());
            InstreamAudioAd.InstreamAudioAdListener listener = p6.this.a.getListener();
            if (listener != null) {
                p6 p6Var = p6.this;
                listener.onBannerStart(p6Var.a, p6Var.l);
            }
        }

        @Override // com.my.target.e6.b
        public void b(eb ebVar) {
            if (d(ebVar)) {
                return;
            }
            InstreamAudioAd.InstreamAudioAdListener listener = p6.this.a.getListener();
            if (listener != null) {
                p6 p6Var = p6.this;
                listener.onBannerComplete(p6Var.a, p6Var.l);
            }
            p6.this.g();
        }

        @Override // com.my.target.e6.b
        public void c(eb ebVar) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            if (d(ebVar) || (listener = p6.this.a.getListener()) == null) {
                return;
            }
            p6 p6Var = p6.this;
            listener.onBannerComplete(p6Var.a, p6Var.l);
        }

        @Override // com.my.target.e6.b
        public void a(float f, float f2, eb ebVar) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            if (d(ebVar) || (listener = p6.this.a.getListener()) == null) {
                return;
            }
            listener.onBannerTimeLeftChange(f, f2, p6.this.a);
        }

        @Override // com.my.target.e6.b
        public void a(String str, eb ebVar) {
            if (d(ebVar)) {
                return;
            }
            InstreamAudioAd.InstreamAudioAdListener listener = p6.this.a.getListener();
            if (listener != null) {
                listener.onError(str, p6.this.a);
            }
            p6.this.g();
        }
    }

    public void b(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context d2 = this.f.d();
        if (d2 == null) {
            mi.a("InstreamAudioAdEngine: Can't handle click - context is null");
            return;
        }
        c3 a2 = a(instreamAdCompanionBanner);
        if (a2 == null) {
            mi.a("InstreamAudioAdEngine: Can't handle click - companion banner not found");
        } else {
            this.g.a(a2, 1, this.a.getWebFormClient(), d2);
        }
    }

    public void a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.f.a(instreamAudioAdPlayer);
    }

    public void a(float[] fArr) {
        this.o = fArr;
    }

    public void a(int i) {
        this.p = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List list, p.b bVar) {
        jg c2 = MyTargetManager.c();
        if (c2 == null) {
            mi.a("InstreamAudioAdEngine: can't load after services - context is null");
            return false;
        }
        q6.a(list, this.d, this.e, this.p).a(bVar).a(this.e.a(), c2.a);
        return true;
    }

    public InstreamAudioAd.InstreamAudioAdBanner b() {
        return this.l;
    }

    void b(ie ieVar) {
        this.q.a(ieVar);
        if (ieVar != this.j) {
            return;
        }
        this.k = null;
        this.l = null;
        this.j = null;
        InstreamAudioAd.InstreamAudioAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onComplete(ieVar.b.h(), this.a);
        }
    }

    public void a(String str, InstreamAudioAd.a aVar) {
        hb a2 = this.c.a(str);
        if (a2 != null) {
            a(a2, -1.0f, aVar);
            return;
        }
        mi.a("InstreamAudioAdEngine: No section with name " + str);
    }

    public void a(String str) {
        a(this.j);
        hb a2 = this.c.a(str);
        if (a2 != null) {
            a(a2, -1.0f);
            return;
        }
        mi.a("InstreamAudioAdEngine: No section with name " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ie ieVar) {
        if (ieVar != null) {
            this.f.k();
            b(ieVar);
        }
    }

    public void a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        c3 a2 = a(instreamAdCompanionBanner);
        if (a2 == null) {
            mi.a("InstreamAudioAdEngine: Can't handle click - companion banner not found");
        } else {
            this.g.a(a2, 1, this.a.getWebFormClient(), context);
        }
    }

    public void a() {
        this.f.c();
    }

    public void a(float f) {
        this.f.c(f);
    }

    private void a(hb hbVar, float f, InstreamAudioAd.a aVar) {
        this.q.a(this.j, hbVar, f, new c(aVar));
    }

    private void a(final hb hbVar, float f) {
        this.q.a(hbVar, f, this.r, new g3() { // from class: com.my.target.p6$$ExternalSyntheticLambda0
            @Override // com.my.target.g3
            public final void accept(Object obj) {
                p6.this.a(hbVar, (ie) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(hb hbVar, ie ieVar) {
        if (this.a.getPlayer() == null) {
            mi.a("InstreamAudioAdEngine: Unable to start delayed ad: player has not set");
            return;
        }
        this.j = ieVar;
        this.f.a(hbVar.e());
        ieVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(eb ebVar) {
        List list;
        this.k = ebVar;
        e a2 = ebVar.a();
        if (a2 != null) {
            this.i = a2.c();
            list = a2.b();
        } else {
            list = null;
        }
        if (list != null) {
            this.h = f.a(a2, this.b);
        }
        if (ebVar.A0() != null) {
            InstreamAudioAd.InstreamAudioAdBanner a3 = InstreamAudioAd.InstreamAudioAdBanner.a(ebVar);
            this.l = a3;
            this.n = new ArrayList(a3.companionBanners);
            this.f.a(ebVar, a3);
            return;
        }
        mi.a("InstreamAudioAdEngine: failed play instreamAd banner, media-data is empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(eb ebVar, String str) {
        if (ebVar == null) {
            mi.a("InstreamAudioAdEngine: Can't send stat: banner is null");
            return;
        }
        if (this.f.e() == null) {
            mi.a("InstreamAudioAdEngine: Can't send stat: no player");
        }
        wh.b(ebVar.H(), str, 999);
    }

    private c3 a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        eb ebVar;
        if (this.n != null && this.l != null && (ebVar = this.k) != null) {
            ArrayList c0 = ebVar.c0();
            int indexOf = this.n.indexOf(instreamAdCompanionBanner);
            if (indexOf >= 0 && indexOf < c0.size()) {
                return (c3) c0.get(indexOf);
            }
            mi.a("InstreamAudioAdEngine: Can't find companion banner - provided instreamAdCompanionBanner not found in current playing banner");
            return null;
        }
        mi.a("InstreamAudioAdEngine: Can't find companion banner - no playing banner");
        return null;
    }
}
