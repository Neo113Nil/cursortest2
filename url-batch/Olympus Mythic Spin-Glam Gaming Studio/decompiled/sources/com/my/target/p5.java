package com.my.target;

import android.content.Context;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.Reward;
import com.my.target.common.models.IAdLoadingError;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public interface p5 {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void a(double d);

        void a(InterstitialAd.BannerInfo bannerInfo);

        void a(IAdLoadingError iAdLoadingError);

        void b();

        void c();

        void c(InterstitialAd.BannerInfo bannerInfo);

        void d();

        void e();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void a(Reward reward);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface c {
        void a(InterstitialAd.BannerInfo bannerInfo, float f);

        void b(InterstitialAd.BannerInfo bannerInfo);
    }

    String a();

    void a(Context context);

    void a(b bVar);

    float d();

    void destroy();

    void dismiss();
}
