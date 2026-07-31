package com.monetization.ads.mediation.appopenad;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/monetization/ads/mediation/appopenad/MediatedAppOpenAdAdapter;", "Lcom/monetization/ads/mediation/base/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/monetization/ads/mediation/appopenad/MediatedAppOpenAdAdapter$MediatedAppOpenAdAdapterListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "", "", "localExtras", "serverExtras", "", "loadAppOpenAd", "(Landroid/content/Context;Lcom/monetization/ads/mediation/appopenad/MediatedAppOpenAdAdapter$MediatedAppOpenAdAdapterListener;Ljava/util/Map;Ljava/util/Map;)V", "onInvalidate", "Landroid/app/Activity;", "activity", "showAppOpenAd", "(Landroid/app/Activity;)V", "", "isLoaded", "()Z", "MediatedAppOpenAdAdapterListener", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MediatedAppOpenAdAdapter extends com.monetization.ads.mediation.base.a {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/mediation/appopenad/MediatedAppOpenAdAdapter$MediatedAppOpenAdAdapterListener;", "", "onAdImpression", "", "onAppOpenAdClicked", "onAppOpenAdDismissed", "onAppOpenAdFailedToLoad", "error", "Lcom/monetization/ads/mediation/base/MediatedAdRequestError;", "onAppOpenAdLoaded", "onAppOpenAdShown", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MediatedAppOpenAdAdapterListener {
        void onAdImpression();

        void onAppOpenAdClicked();

        void onAppOpenAdDismissed();

        void onAppOpenAdFailedToLoad(@NotNull MediatedAdRequestError error);

        void onAppOpenAdLoaded();

        void onAppOpenAdShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadAppOpenAd(@NotNull Context context, @NotNull MediatedAppOpenAdAdapterListener listener, @NotNull Map<String, ? extends Object> localExtras, @NotNull Map<String, String> serverExtras);

    public abstract void onInvalidate();

    public abstract void showAppOpenAd(@NotNull Activity activity);
}
