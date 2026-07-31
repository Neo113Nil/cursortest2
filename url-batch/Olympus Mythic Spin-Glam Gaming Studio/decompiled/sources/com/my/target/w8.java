package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.webform.WebFormClient;
import com.my.target.p5;
import com.my.target.wh;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class w8 extends n8 implements b9 {
    private final mj k;
    private final u8 l;
    private final l2 m;
    private pj n;
    private WeakReference o;

    private w8(BaseInterstitialAd baseInterstitialAd, final u8 u8Var, final p5.a aVar, p5.c cVar) {
        super(aVar, baseInterstitialAd, cVar);
        this.l = u8Var;
        this.k = mj.a(u8Var.H(), new wh.c() { // from class: com.my.target.w8$$ExternalSyntheticLambda1
            @Override // com.my.target.wh.c
            public final void a() {
                w8.a(p5.a.this, u8Var);
            }
        });
        this.m = l2.a(baseInterstitialAd.getCustomParams());
    }

    public static w8 a(BaseInterstitialAd baseInterstitialAd, u8 u8Var, p5.a aVar, p5.c cVar) {
        return new w8(baseInterstitialAd, u8Var, aVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.a.c(InterstitialAd.BannerInfo.a(this.l.x(), this.l.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.a.c(InterstitialAd.BannerInfo.a(this.l.x(), this.l.A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.a.c(InterstitialAd.BannerInfo.a(this.l.x(), this.l.A()));
    }

    @Override // com.my.target.b9
    public void c() {
        p5.c cVar = this.b;
        if (cVar != null) {
            cVar.b(null);
        }
    }

    @Override // com.my.target.b9
    public void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        p5.b g = g();
        if (g != null) {
            wh.a(this.l.H(), "reward", 999, new wh.c() { // from class: com.my.target.w8$$ExternalSyntheticLambda4
                @Override // com.my.target.wh.c
                public final void a() {
                    w8.this.j();
                }
            });
            g.a(Reward.getDefault());
        }
    }

    @Override // com.my.target.n8
    protected boolean h() {
        a9 a9Var;
        WeakReference weakReference = this.o;
        if (weakReference == null || (a9Var = (a9) weakReference.get()) == null) {
            return true;
        }
        return a9Var.f();
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(this.l, frameLayout);
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        a9 a9Var;
        super.onActivityDestroy();
        WeakReference weakReference = this.o;
        if (weakReference == null || (a9Var = (a9) weakReference.get()) == null) {
            return;
        }
        a9Var.destroy();
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        a9 a9Var;
        super.onActivityPause();
        pj pjVar = this.n;
        if (pjVar != null) {
            pjVar.e();
        }
        this.k.a((View) null);
        WeakReference weakReference = this.o;
        if (weakReference == null || (a9Var = (a9) weakReference.get()) == null) {
            return;
        }
        a9Var.pause();
    }

    @Override // com.my.target.n8, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        a9 a9Var;
        super.onActivityResume();
        WeakReference weakReference = this.o;
        if (weakReference == null || (a9Var = (a9) weakReference.get()) == null) {
            return;
        }
        pj pjVar = this.n;
        if (pjVar != null) {
            pjVar.b(a9Var.i());
        }
        this.k.a(a9Var.i());
        this.k.b();
        a9Var.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(p5.a aVar, u8 u8Var) {
        aVar.c(InterstitialAd.BannerInfo.a(u8Var.x(), u8Var.A()));
    }

    @Override // com.my.target.z9.a
    public void a(b bVar, String str, int i, o2 o2Var, Context context) {
        this.m.a(this.l, i, o2Var, (WebFormClient) null, context);
        this.a.a(InterstitialAd.BannerInfo.a(this.l.x(), this.l.A()));
    }

    @Override // com.my.target.z9.a
    public void a(b bVar) {
        bVar.f().b(1, 5004);
        wh.a(bVar.H(), "closedByUser", 999, new wh.c() { // from class: com.my.target.w8$$ExternalSyntheticLambda2
            @Override // com.my.target.wh.c
            public final void a() {
                w8.this.i();
            }
        });
        dismiss();
    }

    @Override // com.my.target.z9.a
    public void a(b bVar, View view) {
        pj pjVar = this.n;
        if (pjVar != null) {
            pjVar.e();
        }
        pj a = pj.a(this.l.P(), this.l.H(), new wh.c() { // from class: com.my.target.w8$$ExternalSyntheticLambda3
            @Override // com.my.target.wh.c
            public final void a() {
                w8.this.k();
            }
        });
        this.n = a;
        if (this.d) {
            a.b(view);
        }
        mi.a("InterstitialAdImagineEngine: Ad shown, banner Id = " + bVar.x());
    }

    @Override // com.my.target.z9.a
    public void a(double d) {
        this.a.a(d);
    }

    private void a(final u8 u8Var, FrameLayout frameLayout) {
        u8Var.f().b(1, 5000);
        a9 a = a9.a(u8Var, this.c.isUseExoPlayer(), this, new wh.c() { // from class: com.my.target.w8$$ExternalSyntheticLambda0
            @Override // com.my.target.wh.c
            public final void a() {
                w8.this.a(u8Var);
            }
        }, frameLayout.getContext());
        frameLayout.addView(a.i());
        a.j();
        this.o = new WeakReference(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u8 u8Var) {
        this.a.c(InterstitialAd.BannerInfo.a(u8Var.x(), u8Var.A()));
    }
}
