package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetActivity;
import com.my.target.fe;
import com.my.target.p5;
import com.my.target.pj;
import com.my.target.wh;
import com.my.target.xa;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class e9 extends n8 {
    private final i9 k;
    private final uh l;
    private final boolean m;
    private final mj n;
    fe o;
    private d9 p;
    private WeakReference q;
    private pj r;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends pj.a {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // com.my.target.pj.a
        public void b() {
            View closeButton;
            super.b();
            fe feVar = e9.this.o;
            if (feVar == null || feVar.b()) {
                return;
            }
            e9.this.o.a(this.a, new fe.b[0]);
            z9 i = e9.this.i();
            if (i != null && (closeButton = i.getCloseButton()) != null) {
                e9.this.o.a(new fe.b(closeButton, 0));
            }
            e9.this.o.c();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class b implements xa.a {
        private final e9 a;

        b(e9 e9Var) {
            this.a = e9Var;
        }

        @Override // com.my.target.z9.a
        public void a(com.my.target.b bVar, String str, int i, o2 o2Var, Context context) {
            if (bVar != null) {
                this.a.a(bVar, str, i, o2Var, context);
            }
        }

        @Override // com.my.target.xa.a
        public void a(String str) {
        }

        @Override // com.my.target.z9.a
        public void b(com.my.target.b bVar) {
            this.a.b(bVar);
        }

        @Override // com.my.target.xa.a
        public void e() {
            this.a.e();
        }

        @Override // com.my.target.z9.a
        public void a(com.my.target.b bVar) {
            this.a.a(bVar);
        }

        @Override // com.my.target.xa.a
        public void b() {
            e9 e9Var = this.a;
            e9Var.e(e9Var.p);
            this.a.m();
        }

        @Override // com.my.target.z9.a
        public void a(com.my.target.b bVar, View view) {
            this.a.a(bVar, view);
        }

        @Override // com.my.target.z9.a
        public void a(boolean z) {
            this.a.a(z);
        }

        @Override // com.my.target.z9.a
        public void a(double d) {
            this.a.b(d);
        }

        @Override // com.my.target.xa.a
        public void a(com.my.target.b bVar, String str, Context context) {
            this.a.a(bVar, str);
        }

        @Override // com.my.target.xa.a
        public void a(com.my.target.b bVar, float f, float f2, Context context) {
            this.a.a(f, f2);
        }

        @Override // com.my.target.xa.a
        public void a(WebView webView) {
            this.a.a(webView);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class c implements d0 {
        private final e9 a;

        public c(e9 e9Var) {
            this.a = e9Var;
        }

        @Override // com.my.target.d0
        public void a(float f) {
            this.a.a(f);
        }

        @Override // com.my.target.d0
        public void c() {
            this.a.c();
        }
    }

    private e9(BaseInterstitialAd baseInterstitialAd, final d9 d9Var, i9 i9Var, boolean z, final p5.a aVar, p5.c cVar) {
        super(aVar, baseInterstitialAd, cVar);
        this.p = d9Var;
        this.k = i9Var;
        this.m = z;
        this.n = mj.a(d9Var.H(), new wh.c() { // from class: com.my.target.e9$$ExternalSyntheticLambda5
            @Override // com.my.target.wh.c
            public final void a() {
                e9.a(p5.a.this, d9Var);
            }
        });
        this.l = d9Var.H().c();
    }

    public static e9 a(BaseInterstitialAd baseInterstitialAd, d9 d9Var, i9 i9Var, boolean z, p5.a aVar, p5.c cVar) {
        return new e9(baseInterstitialAd, d9Var, i9Var, z, aVar, cVar);
    }

    private void b(i8 i8Var, ViewGroup viewGroup) {
        fe feVar = this.o;
        if (feVar != null) {
            feVar.a();
        }
        fe a2 = fe.a(i8Var, 2, null, viewGroup.getContext());
        this.o = a2;
        na a3 = na.a(n9.a(a2, viewGroup.getContext()), (p8) i8Var, new b(this));
        this.q = new WeakReference(a3);
        viewGroup.addView(a3.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.e) {
            return;
        }
        this.e = true;
        p5.b g = g();
        if (g != null) {
            wh.a(this.p.H(), "reward", 999, new wh.c() { // from class: com.my.target.e9$$ExternalSyntheticLambda0
                @Override // com.my.target.wh.c
                public final void a() {
                    e9.this.k();
                }
            });
            g.a(Reward.getDefault());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.a.c(InterstitialAd.BannerInfo.a(this.p.x(), this.p.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.a.c(InterstitialAd.BannerInfo.a(this.p.x(), this.p.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.a.c(InterstitialAd.BannerInfo.a(this.p.x(), this.p.A()));
    }

    void c() {
        p5.c cVar = this.b;
        if (cVar != null) {
            cVar.b(InterstitialAd.BannerInfo.a(this.p.x(), this.p.A()));
        }
        e();
        i8 f0 = this.p.f0();
        z9 i = i();
        ViewParent parent = i != null ? i.i().getParent() : null;
        if (f0 == null || !(parent instanceof ViewGroup)) {
            return;
        }
        a(f0, this.p.i0(), (ViewGroup) parent);
    }

    @Override // com.my.target.n8
    protected boolean h() {
        return this.p.a0();
    }

    z9 i() {
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            return (z9) weakReference.get();
        }
        return null;
    }

    void m() {
        this.p.f().b(1, 5004);
        dismiss();
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(this.p, (ViewGroup) frameLayout);
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        super.onActivityDestroy();
        if (this.p.X() <= 0.0f) {
            e();
        }
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            z9 z9Var = (z9) weakReference.get();
            if (z9Var != null) {
                View i = z9Var.i();
                ViewParent parent = i.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(i);
                }
                z9Var.destroy();
            }
            this.q.clear();
            this.q = null;
        }
        pj pjVar = this.r;
        if (pjVar != null) {
            pjVar.e();
            this.r = null;
        }
        fe feVar = this.o;
        if (feVar != null) {
            feVar.a();
        }
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        super.onActivityPause();
        z9 i = i();
        if (i != null) {
            i.pause();
        }
        pj pjVar = this.r;
        if (pjVar != null) {
            pjVar.e();
        }
        this.n.a((View) null);
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        super.onActivityResume();
        z9 i = i();
        if (i != null) {
            i.resume();
            pj pjVar = this.r;
            if (pjVar != null) {
                pjVar.b(i.i());
            }
            this.n.a(i.i());
            this.n.b();
        }
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityStop() {
        super.onActivityStop();
        z9 i = i();
        if (i != null) {
            i.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(p5.a aVar, d9 d9Var) {
        aVar.c(InterstitialAd.BannerInfo.a(d9Var.x(), d9Var.A()));
    }

    void a(com.my.target.b bVar, String str, int i, o2 o2Var, Context context) {
        String str2;
        if (i() == null) {
            return;
        }
        l2 a2 = l2.a(this.c.getCustomParams());
        if (TextUtils.isEmpty(str)) {
            a2.a(bVar, i, o2Var, this.c.getWebFormClient(), context);
        } else {
            a2.a(bVar, str, i, o2Var, this.c.getWebFormClient(), context);
        }
        boolean z = bVar instanceof k8;
        if (z) {
            if (i == 2 && this.p.k() != null) {
                str2 = "ctaClick";
            } else {
                str2 = "click";
            }
            wh.b(this.p.H(), str2, 2);
        }
        this.a.a(InterstitialAd.BannerInfo.a(this.p.x(), this.p.A()));
        if ((z || (bVar instanceof d9)) && this.p.k0()) {
            this.p.f().b(1, 5004);
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(d9 d9Var) {
        this.a.c(InterstitialAd.BannerInfo.a(d9Var.x(), d9Var.A()));
    }

    private void b(r8 r8Var, ViewGroup viewGroup) {
        fe feVar = this.o;
        if (feVar != null) {
            feVar.a();
        }
        n9 a2 = n9.a(this.o, viewGroup.getContext());
        this.o = fe.a(r8Var, 2, null, viewGroup.getContext());
        qa a3 = qa.a(a2, r8Var, new b(this));
        this.q = new WeakReference(a3);
        viewGroup.addView(a3.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d9 d9Var) {
        this.a.c(InterstitialAd.BannerInfo.a(d9Var.x(), d9Var.A()));
    }

    void a(float f) {
        p5.c cVar = this.b;
        if (cVar != null) {
            cVar.a(InterstitialAd.BannerInfo.a(this.p.x(), this.p.A()), f);
        }
    }

    void a(com.my.target.b bVar) {
        bVar.f().b(1, 5004);
        wh.b(bVar.H(), "closedByUser", 999);
        dismiss();
    }

    void a(float f, float f2) {
        if (this.l.c.isEmpty()) {
            return;
        }
        float f3 = f2 - f;
        uh a2 = this.l.a();
        Iterator it = this.l.c.iterator();
        while (it.hasNext()) {
            xe xeVar = (xe) it.next();
            float h = xeVar.h();
            if (h < 0.0f && xeVar.g() >= 0.0f) {
                h = (f2 / 100.0f) * xeVar.g();
            }
            if (h >= 0.0f && h <= f3) {
                a2.c.add(xeVar);
                it.remove();
            }
        }
        wh.a(a2, 1, new wh.c() { // from class: com.my.target.e9$$ExternalSyntheticLambda6
            @Override // com.my.target.wh.c
            public final void a() {
                e9.this.j();
            }
        });
    }

    void a(com.my.target.b bVar, String str) {
        wh.b(bVar.H(), str, 999);
    }

    void a(com.my.target.b bVar, View view) {
        pj pjVar = this.r;
        if (pjVar != null) {
            pjVar.e();
        }
        pj a2 = pj.a(bVar.P(), bVar.H(), new wh.c() { // from class: com.my.target.e9$$ExternalSyntheticLambda1
            @Override // com.my.target.wh.c
            public final void a() {
                e9.this.l();
            }
        });
        this.r = a2;
        a2.a(new a(view));
        if (this.d) {
            this.r.b(view);
        }
        mi.a("InterstitialAdPromoEngine: Ad shown, banner Id = " + bVar.x());
    }

    void a(WebView webView) {
        fe feVar = this.o;
        if (feVar == null || !feVar.b()) {
            return;
        }
        this.o.a(webView, new fe.b[0]);
        z9 i = i();
        if (i == null) {
            return;
        }
        View closeButton = i.getCloseButton();
        if (closeButton != null) {
            this.o.a(new fe.b(closeButton, 0));
        }
        this.o.c();
    }

    private void a(i8 i8Var, int i, ViewGroup viewGroup) {
        z9 i2 = i();
        if (i2 != null) {
            i2.destroy();
        }
        if (i8Var instanceof p8) {
            viewGroup.removeAllViews();
            if (i == 3) {
                b(i8Var, viewGroup);
                return;
            } else {
                a(i8Var, viewGroup);
                return;
            }
        }
        if (i8Var instanceof r8) {
            viewGroup.removeAllViews();
            if (i == 3) {
                b((r8) i8Var, viewGroup);
                return;
            } else {
                a((r8) i8Var, viewGroup);
                return;
            }
        }
        if (i8Var instanceof d9) {
            viewGroup.removeAllViews();
            a((d9) i8Var, viewGroup);
        }
    }

    private void a(i8 i8Var, ViewGroup viewGroup) {
        xa a2;
        fe feVar = this.o;
        if (feVar != null) {
            feVar.a();
        }
        this.o = fe.a(i8Var, 2, null, viewGroup.getContext());
        if ("mraid".equals(i8Var.M())) {
            a2 = u9.a(viewGroup.getContext());
        } else {
            a2 = o9.a(viewGroup.getContext());
        }
        this.q = new WeakReference(a2);
        a2.a(new b(this));
        a2.a(this.k, (p8) i8Var);
        viewGroup.addView(a2.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    private void a(r8 r8Var, ViewGroup viewGroup) {
        fe feVar = this.o;
        if (feVar != null) {
            feVar.a();
        }
        this.o = fe.a(r8Var, 2, null, viewGroup.getContext());
        p9 a2 = p9.a(viewGroup.getContext(), new b(this));
        this.q = new WeakReference(a2);
        a2.a(r8Var);
        viewGroup.addView(a2.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(final d9 d9Var, ViewGroup viewGroup) {
        ea eaVar;
        fe feVar = this.o;
        if (feVar != null) {
            feVar.a();
        }
        d9Var.f().b(1, 5000);
        eb j0 = d9Var.j0();
        this.o = fe.a(d9Var, j0 != null ? 3 : 2, j0, viewGroup.getContext());
        if (d9Var.i0() == 2) {
            df a2 = df.a(d9Var.h0(), this.o, viewGroup.getContext());
            a2.a(this.m);
            fa a3 = fa.a(a2, d9Var, new b(this), new c(this), new wh.c() { // from class: com.my.target.e9$$ExternalSyntheticLambda2
                @Override // com.my.target.wh.c
                public final void a() {
                    e9.this.a(d9Var);
                }
            });
            a3.r();
            eaVar = a3;
        } else if (d9Var.i0() == 3) {
            n9 a4 = n9.a(this.o, viewGroup.getContext());
            a4.a(this.m);
            aa a5 = aa.a(a4, d9Var, new b(this), new c(this), new wh.c() { // from class: com.my.target.e9$$ExternalSyntheticLambda3
                @Override // com.my.target.wh.c
                public final void a() {
                    e9.this.b(d9Var);
                }
            });
            a5.x();
            eaVar = a5;
        } else {
            cf a6 = cf.a(this.o, viewGroup.getContext());
            a6.a(this.m);
            eaVar = ea.a(a6, d9Var, new b(this), new c(this), new wh.c() { // from class: com.my.target.e9$$ExternalSyntheticLambda4
                @Override // com.my.target.wh.c
                public final void a() {
                    e9.this.c(d9Var);
                }
            }, viewGroup.getContext());
        }
        this.q = new WeakReference(eaVar);
        viewGroup.addView(eaVar.i(), new FrameLayout.LayoutParams(-1, -1));
        this.p = d9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(d9 d9Var) {
        this.a.c(InterstitialAd.BannerInfo.a(d9Var.x(), d9Var.A()));
    }
}
