package com.my.target.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.i9;
import com.my.target.jb;
import com.my.target.mi;
import com.my.target.n8;
import com.my.target.p5;
import com.my.target.q;
import com.my.target.rb;
import com.my.target.s;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public final class RewardedAd extends BaseInterstitialAd {

    @Nullable
    protected RewardedAdListener listener;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface RewardedAdListener {
        void onClick(@NonNull RewardedAd rewardedAd);

        void onDismiss(@NonNull RewardedAd rewardedAd);

        void onDisplay(@NonNull RewardedAd rewardedAd);

        void onFailedToShow(@NonNull RewardedAd rewardedAd);

        void onLoad(@NonNull RewardedAd rewardedAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull RewardedAd rewardedAd);

        void onReward(@NonNull Reward reward, @NonNull RewardedAd rewardedAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class a implements p5.a {
        private a() {
        }

        @Override // com.my.target.p5.a
        public void a(double d) {
        }

        @Override // com.my.target.p5.a
        public void b() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDismiss(rewardedAd);
            }
        }

        @Override // com.my.target.p5.a
        public void c() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onFailedToShow(rewardedAd);
            }
        }

        @Override // com.my.target.p5.a
        public void d() {
            RewardedAd.this.c();
        }

        @Override // com.my.target.p5.a
        public void e() {
            RewardedAd.this.b();
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDisplay(rewardedAd);
            }
        }

        @Override // com.my.target.p5.a
        public void a() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onLoad(rewardedAd);
            }
        }

        @Override // com.my.target.p5.a
        public void c(InterstitialAd.BannerInfo bannerInfo) {
            BaseInterstitialAd.InterstitialAdStatListener interstitialAdStatListener = RewardedAd.this.i;
            if (interstitialAdStatListener != null) {
                interstitialAdStatListener.onImpressionTracked();
            }
        }

        @Override // com.my.target.p5.a
        public void a(IAdLoadingError iAdLoadingError) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onNoAd(iAdLoadingError, rewardedAd);
            }
        }

        @Override // com.my.target.p5.a
        public void a(InterstitialAd.BannerInfo bannerInfo) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onClick(rewardedAd);
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class b implements p5.b {
        private b() {
        }

        @Override // com.my.target.p5.b
        public void a(Reward reward) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onReward(reward, rewardedAd);
            }
        }
    }

    public RewardedAd(int i, @NonNull Context context) {
        super(i, "rewarded", context);
        mi.c("Rewarded ad created. Version - " + MyTargetVersion.VERSION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.my.target.ads.BaseInterstitialAd
    void a(i9 i9Var, s sVar) {
        if (this.listener == null) {
            return;
        }
        q a2 = sVar.a();
        if (i9Var == null) {
            RewardedAdListener rewardedAdListener = this.listener;
            if (a2 == null) {
                a2 = q.o;
            }
            rewardedAdListener.onNoAd(a2, this);
            return;
        }
        List c = i9Var.c();
        jb b2 = i9Var.b();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!c.isEmpty()) {
            n8 a3 = n8.a(this, c, i9Var, this.h, new a(), (p5.c) null);
            this.g = a3;
            if (a3 == null) {
                this.listener.onNoAd(q.o, this);
                return;
            }
            a3.a(new b());
            this.listener.onLoad(this);
            this.a.a().b(0, 3);
            return;
        }
        if (b2 == null) {
            RewardedAdListener rewardedAdListener2 = this.listener;
            if (a2 == null) {
                a2 = q.v;
            }
            rewardedAdListener2.onNoAd(a2, this);
            return;
        }
        rb a4 = rb.a(b2, this.a, this.b, new a());
        a4.a(new b());
        this.g = a4;
        a4.b(this.f);
        this.a.a().b(0, 3);
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void destroy() {
        super.destroy();
        this.listener = null;
    }

    @Nullable
    public RewardedAdListener getListener() {
        return this.listener;
    }

    public void setListener(@Nullable RewardedAdListener rewardedAdListener) {
        this.listener = rewardedAdListener;
    }
}
