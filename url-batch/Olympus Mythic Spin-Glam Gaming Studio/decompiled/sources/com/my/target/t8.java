package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.MyTargetActivity;
import com.my.target.fe;
import com.my.target.p5;
import com.my.target.pj;
import com.my.target.wh;
import com.my.target.z9;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public final class t8 extends n8 {
    private final r8 k;
    private final mj l;
    private pj m;
    private WeakReference n;
    private fe o;

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
            fe feVar = t8.this.o;
            if (feVar != null) {
                feVar.a(this.a, new fe.b[0]);
                WeakReference weakReference = t8.this.n;
                if (weakReference != null && (closeButton = ((p9) weakReference.get()).getCloseButton()) != null) {
                    t8.this.o.a(new fe.b(closeButton, 0));
                }
                t8.this.o.c();
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class b implements z9.a {
        private final t8 a;

        b(t8 t8Var) {
            this.a = t8Var;
        }

        @Override // com.my.target.z9.a
        public void a(com.my.target.b bVar, String str, int i, o2 o2Var, Context context) {
            this.a.a(context, i, o2Var);
        }

        @Override // com.my.target.z9.a
        public void b(com.my.target.b bVar) {
            this.a.b(bVar);
        }

        @Override // com.my.target.z9.a
        public void a(com.my.target.b bVar) {
            this.a.a(bVar);
        }

        @Override // com.my.target.z9.a
        public void a(com.my.target.b bVar, View view) {
            mi.a("InterstitialAdImagineEngine$InterstitialImageListener: Ad shown, banner Id = " + bVar.x());
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
    }

    private t8(BaseInterstitialAd baseInterstitialAd, final r8 r8Var, final p5.a aVar) {
        super(aVar, baseInterstitialAd, null);
        this.k = r8Var;
        this.l = mj.a(r8Var.H(), new wh.c() { // from class: com.my.target.t8$$ExternalSyntheticLambda1
            @Override // com.my.target.wh.c
            public final void a() {
                t8.a(p5.a.this, r8Var);
            }
        });
    }

    static t8 a(BaseInterstitialAd baseInterstitialAd, r8 r8Var, p5.a aVar) {
        return new t8(baseInterstitialAd, r8Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.a.c(InterstitialAd.BannerInfo.a(this.k.x(), this.k.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.a.c(InterstitialAd.BannerInfo.a(this.k.x(), this.k.A()));
    }

    @Override // com.my.target.n8
    protected boolean h() {
        return this.k.a0();
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(frameLayout);
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        super.onActivityDestroy();
        pj pjVar = this.m;
        if (pjVar != null) {
            pjVar.e();
            this.m = null;
        }
        fe feVar = this.o;
        if (feVar != null) {
            feVar.a();
        }
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        super.onActivityPause();
        pj pjVar = this.m;
        if (pjVar != null) {
            pjVar.e();
        }
        this.l.a((View) null);
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        p9 p9Var;
        super.onActivityResume();
        WeakReference weakReference = this.n;
        if (weakReference == null || (p9Var = (p9) weakReference.get()) == null) {
            return;
        }
        pj pjVar = this.m;
        if (pjVar != null) {
            pjVar.b(p9Var.i());
        }
        this.l.a(p9Var.i());
        this.l.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(p5.a aVar, r8 r8Var) {
        aVar.c(InterstitialAd.BannerInfo.a(r8Var.x(), r8Var.A()));
    }

    void a(com.my.target.b bVar, View view) {
        pj pjVar = this.m;
        if (pjVar != null) {
            pjVar.e();
        }
        pj a2 = pj.a(this.k.P(), this.k.H(), new wh.c() { // from class: com.my.target.t8$$ExternalSyntheticLambda2
            @Override // com.my.target.wh.c
            public final void a() {
                t8.this.j();
            }
        });
        this.m = a2;
        a2.a(new a(view));
        if (this.d) {
            this.m.b(view);
        }
        mi.a("InterstitialAdImagineEngine: Ad shown, banner Id = " + bVar.x());
    }

    void a(com.my.target.b bVar) {
        bVar.f().b(1, 5004);
        wh.a(bVar.H(), "closedByUser", 999, new wh.c() { // from class: com.my.target.t8$$ExternalSyntheticLambda0
            @Override // com.my.target.wh.c
            public final void a() {
                t8.this.i();
            }
        });
        dismiss();
    }

    void a(Context context, int i, o2 o2Var) {
        l2.a(this.c.getCustomParams()).a(this.k, i, o2Var, this.c.getWebFormClient(), context);
        this.a.a(InterstitialAd.BannerInfo.a(this.k.x(), this.k.A()));
        this.k.f().b(1, 5004);
        dismiss();
    }

    private void a(ViewGroup viewGroup) {
        this.k.f().b(1, 5000);
        this.o = fe.a(this.k, 2, null, viewGroup.getContext());
        p9 a2 = p9.a(viewGroup.getContext(), new b(this));
        this.n = new WeakReference(a2);
        a2.a(this.k);
        viewGroup.addView(a2.i(), new FrameLayout.LayoutParams(-1, -1));
    }
}
