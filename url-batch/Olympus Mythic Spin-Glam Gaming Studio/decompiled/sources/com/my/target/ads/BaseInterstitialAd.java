package com.my.target.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.BaseAd;
import com.my.target.i9;
import com.my.target.kg;
import com.my.target.mi;
import com.my.target.o8;
import com.my.target.p5;
import com.my.target.q;
import com.my.target.s;
import com.my.target.t;
import com.my.target.tb;
import com.my.target.vb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public abstract class BaseInterstitialAd extends BaseAd {
    final Context f;
    p5 g;
    boolean h;
    protected InterstitialAdStatListener i;
    private double j;
    private tb k;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static abstract class InterstitialAdStatListener {
        public void onImpressionTracked() {
        }
    }

    protected BaseInterstitialAd(int i, @NonNull String str, @NonNull Context context) {
        super(i, str, context);
        this.h = true;
        this.j = 0.0d;
        this.f = context;
    }

    protected void a(double d) {
        this.j = d;
    }

    void a(i9 i9Var, s sVar) {
    }

    void b() {
        tb tbVar = this.k;
        if (tbVar == null) {
            return;
        }
        tbVar.b();
        this.k.d();
    }

    void c() {
        this.k = this.b.b();
    }

    public void destroy() {
        p5 p5Var = this.g;
        if (p5Var != null) {
            p5Var.destroy();
            this.g = null;
        }
    }

    public void dismiss() {
        p5 p5Var = this.g;
        if (p5Var != null) {
            p5Var.dismiss();
        }
    }

    @Nullable
    public String getAdSource() {
        p5 p5Var = this.g;
        if (p5Var != null) {
            return p5Var.a();
        }
        return null;
    }

    public float getAdSourcePriority() {
        p5 p5Var = this.g;
        if (p5Var != null) {
            return p5Var.d();
        }
        return 0.0f;
    }

    public double getCloseDelay() {
        return this.j;
    }

    public int getVideoQuality() {
        return this.a.l();
    }

    public boolean isMediationEnabled() {
        return this.a.m();
    }

    public boolean isUseExoPlayer() {
        return this.h;
    }

    public final void load() {
        if (isLoadCalled()) {
            mi.a("BaseInterstitialAd: Interstitial/Rewarded doesn't support multiple load");
            this.a.a().a(0, 1);
            a(null, s.a(q.t));
        } else {
            t a = t.a(this.d, this.a.j(), 3, vb.b());
            this.a.a(a);
            a.b(0, 0);
            o8.a(this.a, this.b).a(new BaseInterstitialAd$$ExternalSyntheticLambda0(this)).a(this.b.a(), this.f);
        }
    }

    public void loadFromBid(@NonNull String str) {
        this.a.b(str);
        load();
    }

    public void setMediationEnabled(boolean z) {
        this.a.a(z);
    }

    public void setStatListener(@Nullable InterstitialAdStatListener interstitialAdStatListener) {
        this.i = interstitialAdStatListener;
    }

    public void setVideoQuality(int i) {
        this.a.d(i);
    }

    public void show() {
        show(null);
    }

    public void useExoPlayer(boolean z) {
        this.h = z;
        if (z) {
            return;
        }
        kg.g();
    }

    public final void a(i9 i9Var) {
        o8.a(i9Var, this.a, this.b).a(new BaseInterstitialAd$$ExternalSyntheticLambda0(this)).a(this.b.a(), this.f);
    }

    public void show(@Nullable Context context) {
        p5 p5Var = this.g;
        if (p5Var == null) {
            mi.c("Base interstitial ad show - no ad");
            return;
        }
        if (context == null) {
            context = this.f;
        }
        p5Var.a(context);
    }
}
