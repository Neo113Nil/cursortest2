package com.my.target.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.i9;
import com.my.target.jb;
import com.my.target.mb;
import com.my.target.mi;
import com.my.target.n8;
import com.my.target.p5;
import com.my.target.q;
import com.my.target.s;
import com.my.target.v4;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public final class InterstitialAd extends BaseInterstitialAd {
    private InterstitialAdListener l;
    private InterstitialAdListener2 m;
    private InterstitialAdBannerListener n;
    private InterstitialVideoListener o;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class BannerInfo {
        private final String a;
        private final long b;

        private BannerInfo(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public static BannerInfo a(String str, long j) {
            return new BannerInfo(str, j);
        }

        @NonNull
        public String getBannerId() {
            return this.a;
        }

        public long getImpressionId() {
            return this.b;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static abstract class InterstitialAdBannerListener {
        public void onClick(@NonNull InterstitialAd interstitialAd, @Nullable BannerInfo bannerInfo) {
        }

        public void onImpressionTracked(@NonNull InterstitialAd interstitialAd, @Nullable BannerInfo bannerInfo) {
        }

        public void onSkip(@NonNull InterstitialAd interstitialAd, @Nullable BannerInfo bannerInfo) {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @Deprecated
    public interface InterstitialAdListener {
        @Deprecated
        void onClick(@NonNull InterstitialAd interstitialAd);

        @Deprecated
        void onDismiss(@NonNull InterstitialAd interstitialAd);

        @Deprecated
        void onDisplay(@NonNull InterstitialAd interstitialAd);

        @Deprecated
        void onFailedToShow(@NonNull InterstitialAd interstitialAd);

        @Deprecated
        void onLoad(@NonNull InterstitialAd interstitialAd);

        @Deprecated
        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InterstitialAd interstitialAd);

        @Deprecated
        void onVideoCompleted(@NonNull InterstitialAd interstitialAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static abstract class InterstitialAdListener2 {
        public void onClose(@NonNull InterstitialAd interstitialAd) {
        }

        public void onDisplay(@NonNull InterstitialAd interstitialAd) {
        }

        public void onFailedToShow(@NonNull InterstitialAd interstitialAd) {
        }

        public void onLoad(@NonNull InterstitialAd interstitialAd) {
        }

        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InterstitialAd interstitialAd) {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static abstract class InterstitialVideoListener {
        public void onVideoCompleted(@NonNull InterstitialAd interstitialAd, @Nullable BannerInfo bannerInfo) {
        }

        public void onVideoVolumeChanged(@NonNull InterstitialAd interstitialAd, @NonNull BannerInfo bannerInfo, float f) {
        }
    }

    public InterstitialAd(int i, @NonNull Context context) {
        super(i, "fullscreen", context);
        mi.c("Interstitial ad created. Version - " + MyTargetVersion.VERSION);
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    void a(i9 i9Var, s sVar) {
        if (this.m == null && this.l == null) {
            return;
        }
        try {
            q a2 = sVar.a();
            if (i9Var == null) {
                InterstitialAdListener2 interstitialAdListener2 = this.m;
                if (interstitialAdListener2 != null) {
                    if (a2 == null) {
                        a2 = q.o;
                    }
                    interstitialAdListener2.onNoAd(a2, this);
                    return;
                } else {
                    InterstitialAdListener interstitialAdListener = this.l;
                    if (a2 == null) {
                        a2 = q.o;
                    }
                    interstitialAdListener.onNoAd(a2, this);
                    return;
                }
            }
            List c = i9Var.c();
            jb b = i9Var.b();
            if (c.isEmpty()) {
                if (b != null) {
                    a aVar = new a();
                    mb a3 = mb.a(b, this.a, this.b, aVar, aVar);
                    this.g = a3;
                    a3.b(this.f);
                    this.a.a().b(0, 3);
                    return;
                }
                InterstitialAdListener2 interstitialAdListener22 = this.m;
                if (interstitialAdListener22 != null) {
                    if (a2 == null) {
                        a2 = q.v;
                    }
                    interstitialAdListener22.onNoAd(a2, this);
                    return;
                } else {
                    InterstitialAdListener interstitialAdListener3 = this.l;
                    if (interstitialAdListener3 != null) {
                        if (a2 == null) {
                            a2 = q.v;
                        }
                        interstitialAdListener3.onNoAd(a2, this);
                        return;
                    }
                    return;
                }
            }
            a aVar2 = new a();
            n8 a4 = n8.a(this, c, i9Var, this.h, aVar2, aVar2);
            this.g = a4;
            if (a4 != null) {
                InterstitialAdListener2 interstitialAdListener23 = this.m;
                if (interstitialAdListener23 != null) {
                    interstitialAdListener23.onLoad(this);
                } else {
                    InterstitialAdListener interstitialAdListener4 = this.l;
                    if (interstitialAdListener4 != null) {
                        interstitialAdListener4.onLoad(this);
                    }
                }
                this.a.a().b(0, 3);
                return;
            }
            InterstitialAdListener2 interstitialAdListener24 = this.m;
            if (interstitialAdListener24 != null) {
                interstitialAdListener24.onNoAd(q.o, this);
                return;
            }
            InterstitialAdListener interstitialAdListener5 = this.l;
            if (interstitialAdListener5 != null) {
                interstitialAdListener5.onNoAd(q.o, this);
            }
        } catch (Throwable th) {
            mi.b("InterstitialAd: " + th);
        }
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void destroy() {
        super.destroy();
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
    }

    @Nullable
    public InterstitialAdBannerListener getBannerListener() {
        return this.n;
    }

    @Nullable
    @Deprecated
    public InterstitialAdListener getListener() {
        return this.l;
    }

    @Nullable
    public InterstitialAdListener2 getListener2() {
        return this.m;
    }

    @Nullable
    public InterstitialVideoListener getVideoListener() {
        return this.o;
    }

    public void setBannerListener(@Nullable InterstitialAdBannerListener interstitialAdBannerListener) {
        this.n = interstitialAdBannerListener;
    }

    @Deprecated
    public void setListener(@Nullable InterstitialAdListener interstitialAdListener) {
        this.l = interstitialAdListener;
    }

    public void setListener2(@Nullable InterstitialAdListener2 interstitialAdListener2) {
        this.m = interstitialAdListener2;
    }

    public void setVideoListener(@Nullable InterstitialVideoListener interstitialVideoListener) {
        this.o = interstitialVideoListener;
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class a implements p5.a, p5.c {
        private float a;

        private a() {
            this.a = -10.0f;
        }

        @Override // com.my.target.p5.a
        public void a() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener2 interstitialAdListener2 = interstitialAd.m;
            if (interstitialAdListener2 != null) {
                interstitialAdListener2.onLoad(interstitialAd);
                return;
            }
            InterstitialAdListener interstitialAdListener = interstitialAd.l;
            if (interstitialAdListener != null) {
                interstitialAdListener.onLoad(interstitialAd);
            }
        }

        @Override // com.my.target.p5.a
        public void b() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener2 interstitialAdListener2 = interstitialAd.m;
            if (interstitialAdListener2 != null) {
                interstitialAdListener2.onClose(interstitialAd);
                return;
            }
            InterstitialAdListener interstitialAdListener = interstitialAd.l;
            if (interstitialAdListener != null) {
                interstitialAdListener.onDismiss(interstitialAd);
            }
        }

        @Override // com.my.target.p5.a
        public void c() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener2 interstitialAdListener2 = interstitialAd.m;
            if (interstitialAdListener2 != null) {
                interstitialAdListener2.onFailedToShow(interstitialAd);
                return;
            }
            InterstitialAdListener interstitialAdListener = interstitialAd.l;
            if (interstitialAdListener != null) {
                interstitialAdListener.onFailedToShow(interstitialAd);
            }
        }

        @Override // com.my.target.p5.a
        public void d() {
            InterstitialAd.this.c();
        }

        @Override // com.my.target.p5.a
        public void e() {
            InterstitialAd.this.b();
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener2 interstitialAdListener2 = interstitialAd.m;
            if (interstitialAdListener2 != null) {
                interstitialAdListener2.onDisplay(interstitialAd);
                return;
            }
            InterstitialAdListener interstitialAdListener = interstitialAd.l;
            if (interstitialAdListener != null) {
                interstitialAdListener.onDisplay(interstitialAd);
            }
        }

        @Override // com.my.target.p5.a
        public void a(IAdLoadingError iAdLoadingError) {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener2 interstitialAdListener2 = interstitialAd.m;
            if (interstitialAdListener2 != null) {
                interstitialAdListener2.onNoAd(iAdLoadingError, interstitialAd);
                return;
            }
            InterstitialAdListener interstitialAdListener = interstitialAd.l;
            if (interstitialAdListener != null) {
                interstitialAdListener.onNoAd(iAdLoadingError, interstitialAd);
            }
        }

        @Override // com.my.target.p5.c
        public void b(BannerInfo bannerInfo) {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialVideoListener interstitialVideoListener = interstitialAd.o;
            if (interstitialVideoListener != null) {
                interstitialVideoListener.onVideoCompleted(interstitialAd, bannerInfo);
                return;
            }
            InterstitialAdListener interstitialAdListener = interstitialAd.l;
            if (interstitialAdListener != null) {
                interstitialAdListener.onVideoCompleted(interstitialAd);
            }
        }

        @Override // com.my.target.p5.a
        public void c(BannerInfo bannerInfo) {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdBannerListener interstitialAdBannerListener = interstitialAd.n;
            if (interstitialAdBannerListener != null) {
                interstitialAdBannerListener.onImpressionTracked(interstitialAd, bannerInfo);
                return;
            }
            BaseInterstitialAd.InterstitialAdStatListener interstitialAdStatListener = interstitialAd.i;
            if (interstitialAdStatListener != null) {
                interstitialAdStatListener.onImpressionTracked();
            }
        }

        @Override // com.my.target.p5.a
        public void a(BannerInfo bannerInfo) {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdBannerListener interstitialAdBannerListener = interstitialAd.n;
            if (interstitialAdBannerListener != null) {
                interstitialAdBannerListener.onClick(interstitialAd, bannerInfo);
                return;
            }
            InterstitialAdListener interstitialAdListener = interstitialAd.l;
            if (interstitialAdListener != null) {
                interstitialAdListener.onClick(interstitialAd);
            }
        }

        @Override // com.my.target.p5.c
        public void a(BannerInfo bannerInfo, float f) {
            if (v4.a(this.a, f) != 0) {
                this.a = f;
                InterstitialAd interstitialAd = InterstitialAd.this;
                InterstitialVideoListener interstitialVideoListener = interstitialAd.o;
                if (interstitialVideoListener != null) {
                    interstitialVideoListener.onVideoVolumeChanged(interstitialAd, bannerInfo, f);
                }
            }
        }

        @Override // com.my.target.p5.a
        public void a(double d) {
            InterstitialAd.this.a(d);
        }
    }
}
