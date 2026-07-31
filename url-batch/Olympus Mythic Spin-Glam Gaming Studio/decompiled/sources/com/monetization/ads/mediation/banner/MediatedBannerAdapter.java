package com.monetization.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.ironsource.X3;
import com.ironsource.Zf;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0012"}, d2 = {"Lcom/monetization/ads/mediation/banner/MediatedBannerAdapter;", "Lcom/monetization/ads/mediation/base/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/monetization/ads/mediation/banner/MediatedBannerAdapter$MediatedBannerAdapterListener;", "mediatedBannerAdapterListener", "", "", "", "localExtras", "serverExtras", "", X3.h.N, "(Landroid/content/Context;Lcom/monetization/ads/mediation/banner/MediatedBannerAdapter$MediatedBannerAdapterListener;Ljava/util/Map;Ljava/util/Map;)V", "onInvalidate", "MediatedBannerAdapterListener", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MediatedBannerAdapter extends com.monetization.ads.mediation.base.a {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/mediation/banner/MediatedBannerAdapter$MediatedBannerAdapterListener;", "", Zf.f, "", "onAdFailedToLoad", "error", "Lcom/monetization/ads/mediation/base/MediatedAdRequestError;", "onAdImpression", Zf.j, "view", "Landroid/view/View;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MediatedBannerAdapterListener {
        void onAdClicked();

        void onAdFailedToLoad(@NotNull MediatedAdRequestError error);

        void onAdImpression();

        void onAdLoaded(@NotNull View view);
    }

    public abstract void loadBanner(@NotNull Context context, @NotNull MediatedBannerAdapterListener mediatedBannerAdapterListener, @NotNull Map<String, ? extends Object> localExtras, @NotNull Map<String, String> serverExtras);

    public abstract void onInvalidate();
}
