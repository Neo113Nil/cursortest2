package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.MyTargetActivity;
import com.my.target.fe;
import com.my.target.p5;
import com.my.target.pj;
import com.my.target.wh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public class c4 extends n8 {
    private List k;
    private WeakReference l;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends pj.a {
        final /* synthetic */ e4 a;

        a(e4 e4Var) {
            this.a = e4Var;
        }

        @Override // com.my.target.pj.a
        public void b() {
            View closeButton;
            super.b();
            fe b = this.a.b();
            if (b == null || b.b()) {
                return;
            }
            z9 i = c4.this.i();
            if (i != null && (closeButton = i.getCloseButton()) != null) {
                b.a(new fe.b(closeButton, 0));
            }
            b.c();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class b {
        private final c4 a;

        b(c4 c4Var) {
            this.a = c4Var;
        }

        public void a(e4 e4Var, float f) {
            this.a.a(e4Var, f);
        }

        public void b(e4 e4Var) {
            this.a.b(e4Var);
        }

        public void a(com.my.target.b bVar, String str, int i, o2 o2Var, Context context) {
            this.a.a(bVar, str, i, o2Var, context);
        }

        public void a(e4 e4Var) {
            this.a.a(e4Var);
        }

        public void a(com.my.target.b bVar) {
            this.a.b(bVar);
        }

        public void a(e4 e4Var, View view) {
            this.a.a(e4Var, view);
        }

        public void a(boolean z) {
            this.a.a(z);
        }

        public void a(InterstitialAd.BannerInfo bannerInfo) {
            this.a.a(bannerInfo);
        }

        public void a(double d) {
            this.a.b(d);
        }
    }

    private c4(BaseInterstitialAd baseInterstitialAd, List list, boolean z, final p5.a aVar, p5.c cVar) {
        super(aVar, baseInterstitialAd, cVar);
        this.k = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final d9 d9Var = (d9) it.next();
            this.k.add(new e4(d9Var, mj.a(d9Var.H(), new wh.c() { // from class: com.my.target.c4$$ExternalSyntheticLambda0
                @Override // com.my.target.wh.c
                public final void a() {
                    c4.a(p5.a.this, d9Var);
                }
            }), z));
        }
    }

    public static c4 a(BaseInterstitialAd baseInterstitialAd, List list, boolean z, p5.a aVar, p5.c cVar) {
        return new c4(baseInterstitialAd, list, z, aVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(com.my.target.b bVar) {
        this.a.c(InterstitialAd.BannerInfo.a(bVar.x(), bVar.A()));
    }

    void b(e4 e4Var) {
        if (this.b != null) {
            d9 a2 = e4Var.a();
            this.b.b(InterstitialAd.BannerInfo.a(a2.x(), a2.A()));
        }
    }

    @Override // com.my.target.n8
    protected boolean h() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((e4) it.next()).e()) {
                return false;
            }
        }
        return true;
    }

    z9 i() {
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            return (z9) weakReference.get();
        }
        return null;
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(this.k, frameLayout);
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        super.onActivityDestroy();
        WeakReference weakReference = this.l;
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
            this.l.clear();
            this.l = null;
        }
        for (e4 e4Var : this.k) {
            pj d = e4Var.d();
            if (d != null) {
                d.e();
                e4Var.a((pj) null);
            }
            fe b2 = e4Var.b();
            if (b2 != null) {
                b2.a();
            }
        }
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        super.onActivityPause();
        z9 i = i();
        if (i != null) {
            i.pause();
        }
        for (e4 e4Var : this.k) {
            pj d = e4Var.d();
            if (d != null) {
                d.e();
            }
            e4Var.c().a((View) null);
        }
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        super.onActivityResume();
        z9 i = i();
        if (i != null) {
            i.resume();
            for (e4 e4Var : this.k) {
                pj d = e4Var.d();
                if (d != null) {
                    d.b(i.i());
                }
                mj c = e4Var.c();
                c.a(i.i());
                c.b();
            }
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
        if (i() == null) {
            return;
        }
        l2 a2 = l2.a(this.c.getCustomParams());
        if (TextUtils.isEmpty(str)) {
            a2.a(bVar, i, o2Var, this.c.getWebFormClient(), context);
        } else {
            a2.a(bVar, str, i, o2Var, this.c.getWebFormClient(), context);
        }
        this.a.a(InterstitialAd.BannerInfo.a(bVar.x(), bVar.A()));
        if ((bVar instanceof d9) && ((d9) bVar).k0()) {
            bVar.f().b(1, 5004);
            dismiss();
        }
    }

    @Override // com.my.target.n8
    public void b(final com.my.target.b bVar) {
        bVar.f().b(1, 5004);
        wh.a(bVar.H(), "closedByUser", 1, new wh.c() { // from class: com.my.target.c4$$ExternalSyntheticLambda2
            @Override // com.my.target.wh.c
            public final void a() {
                c4.this.f(bVar);
            }
        });
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((e4) it.next()).f()) {
                return;
            }
        }
        dismiss();
    }

    void a(e4 e4Var, float f) {
        if (this.b != null) {
            d9 a2 = e4Var.a();
            this.b.a(InterstitialAd.BannerInfo.a(a2.x(), a2.A()), f);
        }
    }

    void a(e4 e4Var) {
        d9 a2 = e4Var.a();
        a2.f().b(1, 5004);
        wh.b(a2.H(), "closedByUser", 999);
        dismiss();
    }

    void a(e4 e4Var, View view) {
        pj d = e4Var.d();
        if (d != null) {
            d.e();
        }
        final d9 a2 = e4Var.a();
        pj a3 = pj.a(a2.P(), a2.H(), new wh.c() { // from class: com.my.target.c4$$ExternalSyntheticLambda1
            @Override // com.my.target.wh.c
            public final void a() {
                c4.this.a(a2);
            }
        });
        a3.a(new a(e4Var));
        if (this.d) {
            a3.b(view);
        }
        e4Var.a(a3);
        e4Var.a(true);
        mi.a("InterstitialAdDoublePromoEngine: Ad shown, banner Id = " + a2.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(d9 d9Var) {
        this.a.c(InterstitialAd.BannerInfo.a(d9Var.x(), d9Var.A()));
    }

    void a(InterstitialAd.BannerInfo bannerInfo) {
        this.a.c(bannerInfo);
    }

    private void a(List list, ViewGroup viewGroup) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e4 e4Var = (e4) it.next();
            d9 a2 = e4Var.a();
            a2.f().b(1, 5000);
            if (e4Var.b() != null) {
                e4Var.b().a();
                eb j0 = a2.j0();
                e4Var.a(fe.a(a2, j0 != null ? 3 : 2, j0, viewGroup.getContext()));
            }
        }
        k4 a3 = k4.a(i4.a(viewGroup.getContext()), list, new b(this));
        this.l = new WeakReference(a3);
        viewGroup.addView(a3.i(), new FrameLayout.LayoutParams(-1, -1));
        this.k = list;
    }
}
