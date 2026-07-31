package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.Reward;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.webform.WebFormClient;
import com.my.target.fe;
import com.my.target.p5;
import com.my.target.wh;
import com.my.target.xa;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class q8 extends n8 {
    private final p8 k;
    private final i9 l;
    private final uh m;
    private WeakReference n;
    private pj o;
    private final mj p;
    private fe q;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a implements xa.a {
        private final q8 a;
        private final p8 b;
        private final p5.a c;
        private final WebFormClient d;
        private final wh.c e;
        private final CustomParams f;

        a(q8 q8Var, p8 p8Var, p5.a aVar, WebFormClient webFormClient, wh.c cVar, CustomParams customParams) {
            this.a = q8Var;
            this.b = p8Var;
            this.c = aVar;
            this.d = webFormClient;
            this.f = customParams;
            this.e = cVar;
        }

        @Override // com.my.target.z9.a
        public void a(b bVar, String str, int i, o2 o2Var, Context context) {
            l2 a = l2.a(this.f);
            if (TextUtils.isEmpty(str)) {
                a.a(this.b, i, o2Var, this.d, context);
            } else {
                a.a(this.b, str, i, o2Var, this.d, context);
            }
            this.c.a(InterstitialAd.BannerInfo.a(this.b.x(), this.b.A()));
        }

        @Override // com.my.target.z9.a
        public void b(b bVar) {
            this.a.b(bVar);
        }

        @Override // com.my.target.xa.a
        public void e() {
            this.a.e();
        }

        @Override // com.my.target.xa.a
        public void b() {
            this.a.e(this.b);
            a();
        }

        public void a() {
            this.b.f().b(1, 5004);
            this.a.dismiss();
        }

        @Override // com.my.target.z9.a
        public void a(b bVar) {
            bVar.f().b(1, 5004);
            wh.a(bVar.H(), "closedByUser", 999, this.e);
            this.a.dismiss();
        }

        @Override // com.my.target.z9.a
        public void a(b bVar, View view) {
            mi.a("InterstitialAdHtmlEngine$InterstitialWebViewPresenterListener: Ad shown, banner Id = " + this.b.x());
            this.a.a(bVar, view);
        }

        @Override // com.my.target.xa.a
        public void a(String str) {
            this.b.f().b(1, 5004);
            this.a.dismiss();
        }

        @Override // com.my.target.xa.a
        public void a(b bVar, String str, Context context) {
            this.a.a(bVar, str);
        }

        @Override // com.my.target.xa.a
        public void a(b bVar, float f, float f2, Context context) {
            this.a.a(f, f2);
        }

        @Override // com.my.target.xa.a
        public void a(WebView webView) {
            this.a.a(webView);
        }

        @Override // com.my.target.z9.a
        public void a(boolean z) {
            this.a.a(z);
        }

        @Override // com.my.target.z9.a
        public void a(double d) {
            this.a.b(d);
        }
    }

    private q8(BaseInterstitialAd baseInterstitialAd, final p8 p8Var, i9 i9Var, final p5.a aVar, p5.c cVar) {
        super(aVar, baseInterstitialAd, cVar);
        this.k = p8Var;
        this.l = i9Var;
        this.p = mj.a(p8Var.H(), new wh.c() { // from class: com.my.target.q8$$ExternalSyntheticLambda2
            @Override // com.my.target.wh.c
            public final void a() {
                q8.a(p5.a.this, p8Var);
            }
        });
        this.m = p8Var.H().c();
    }

    static q8 a(BaseInterstitialAd baseInterstitialAd, p8 p8Var, i9 i9Var, p5.a aVar, p5.c cVar) {
        return new q8(baseInterstitialAd, p8Var, i9Var, aVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(b bVar) {
        this.a.c(InterstitialAd.BannerInfo.a(bVar.x(), bVar.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.a.c(InterstitialAd.BannerInfo.a(this.k.x(), this.k.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.a.c(InterstitialAd.BannerInfo.a(this.k.x(), this.k.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.a.c(InterstitialAd.BannerInfo.a(this.k.x(), this.k.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.a.c(InterstitialAd.BannerInfo.a(this.k.x(), this.k.A()));
    }

    void e() {
        if (this.e) {
            return;
        }
        this.e = true;
        p5.c cVar = this.b;
        if (cVar != null) {
            cVar.b(InterstitialAd.BannerInfo.a(this.k.x(), this.k.A()));
        }
        p5.b g = g();
        if (g != null) {
            wh.a(this.k.H(), "reward", 999, new wh.c() { // from class: com.my.target.q8$$ExternalSyntheticLambda0
                @Override // com.my.target.wh.c
                public final void a() {
                    q8.this.l();
                }
            });
            g.a(Reward.getDefault());
        }
    }

    @Override // com.my.target.n8
    protected boolean h() {
        return this.k.a0();
    }

    xa i() {
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            return (xa) weakReference.get();
        }
        return null;
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(frameLayout);
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        xa xaVar;
        super.onActivityDestroy();
        pj pjVar = this.o;
        if (pjVar != null) {
            pjVar.e();
            this.o = null;
        }
        fe feVar = this.q;
        if (feVar != null) {
            feVar.a();
        }
        WeakReference weakReference = this.n;
        if (weakReference != null && (xaVar = (xa) weakReference.get()) != null) {
            xaVar.a(this.q != null ? 7000 : 0);
        }
        this.n = null;
        this.p.a((View) null);
        this.p.c();
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        xa xaVar;
        super.onActivityPause();
        WeakReference weakReference = this.n;
        if (weakReference != null && (xaVar = (xa) weakReference.get()) != null) {
            xaVar.pause();
        }
        pj pjVar = this.o;
        if (pjVar != null) {
            pjVar.e();
        }
        this.p.a((View) null);
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        xa xaVar;
        super.onActivityResume();
        WeakReference weakReference = this.n;
        if (weakReference == null || (xaVar = (xa) weakReference.get()) == null) {
            return;
        }
        xaVar.resume();
        pj pjVar = this.o;
        if (pjVar != null) {
            pjVar.b(xaVar.i());
        }
        this.p.a(xaVar.i());
        this.p.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(p5.a aVar, p8 p8Var) {
        aVar.c(InterstitialAd.BannerInfo.a(p8Var.x(), p8Var.A()));
    }

    void a(float f, float f2) {
        if (this.m.c.isEmpty()) {
            return;
        }
        float f3 = f2 - f;
        uh a2 = this.m.a();
        Iterator it = this.m.c.iterator();
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
        wh.a(a2, 1, new wh.c() { // from class: com.my.target.q8$$ExternalSyntheticLambda3
            @Override // com.my.target.wh.c
            public final void a() {
                q8.this.k();
            }
        });
    }

    void a(final b bVar, String str) {
        wh.a(bVar.H(), str, 999, new wh.c() { // from class: com.my.target.q8$$ExternalSyntheticLambda5
            @Override // com.my.target.wh.c
            public final void a() {
                q8.this.f(bVar);
            }
        });
    }

    void a(b bVar, View view) {
        pj pjVar = this.o;
        if (pjVar != null) {
            pjVar.e();
        }
        pj a2 = pj.a(this.k.P(), this.k.H(), new wh.c() { // from class: com.my.target.q8$$ExternalSyntheticLambda4
            @Override // com.my.target.wh.c
            public final void a() {
                q8.this.m();
            }
        });
        this.o = a2;
        if (this.d) {
            a2.b(view);
        }
        mi.a("InterstitialAdHtmlEngine: Ad shown, banner Id = " + bVar.x());
    }

    void a(WebView webView) {
        xa i;
        if (this.q == null || (i = i()) == null) {
            return;
        }
        this.q.a(webView, new fe.b[0]);
        View closeButton = i.getCloseButton();
        if (closeButton != null) {
            this.q.a(new fe.b(closeButton, 0));
        }
        this.q.c();
    }

    private void a(ViewGroup viewGroup) {
        xa a2;
        this.k.f().b(1, 5000);
        this.q = fe.a(this.k, 1, null, viewGroup.getContext());
        if ("mraid".equals(this.k.M())) {
            a2 = u9.a(viewGroup.getContext());
        } else {
            a2 = o9.a(viewGroup.getContext());
        }
        this.n = new WeakReference(a2);
        a2.a(new a(this, this.k, this.a, this.c.getWebFormClient(), new wh.c() { // from class: com.my.target.q8$$ExternalSyntheticLambda1
            @Override // com.my.target.wh.c
            public final void a() {
                q8.this.j();
            }
        }, this.c.getCustomParams()));
        a2.a(this.l, this.k);
        viewGroup.addView(a2.i(), new FrameLayout.LayoutParams(-1, -1));
    }
}
