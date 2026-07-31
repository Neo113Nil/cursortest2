package net.pubnative.lite.sdk.presenter;

import android.content.Context;
import android.view.View;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.ImpressionTrackingMethod;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.AdTracker;

/* loaded from: classes12.dex */
public abstract class PresenterFactory {
    private final Context mContext;
    protected final IntegrationType mIntegrationType;

    public PresenterFactory(Context context, IntegrationType integrationType) {
        this.mContext = context;
        this.mIntegrationType = integrationType;
    }

    public AdPresenter createPresenter(Ad ad, AdSize adSize, AdPresenter.Listener listener) {
        return createPresenter(ad, adSize, listener, null);
    }

    protected AdPresenter fromCreativeType(int i, Ad ad, AdSize adSize) {
        return fromCreativeType(i, ad, adSize, ImpressionTrackingMethod.AD_VIEWABLE, null);
    }

    protected abstract AdPresenter fromCreativeType(int i, Ad ad, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, View view);

    protected Context getContext() {
        return this.mContext;
    }

    public AdPresenter createPresenter(Ad ad, AdSize adSize, AdPresenter.Listener listener, AdPresenter.ImpressionListener impressionListener) {
        return createPresenter(ad, null, adSize, ImpressionTrackingMethod.AD_VIEWABLE, listener, impressionListener, null);
    }

    protected AdPresenter fromCreativeType(int i, Ad ad, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod) {
        return fromCreativeType(i, ad, adSize, impressionTrackingMethod, null);
    }

    public AdPresenter createPresenter(Ad ad, AdTracker adTracker, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, AdPresenter.Listener listener, AdPresenter.ImpressionListener impressionListener, View view) {
        AdPresenter fromCreativeType;
        if (ad == null || (fromCreativeType = fromCreativeType(ad.assetgroupid, ad, adSize, impressionTrackingMethod, view)) == null) {
            return null;
        }
        AdPresenterDecorator adPresenterDecorator = new AdPresenterDecorator(fromCreativeType, adTracker != null ? adTracker : new AdTracker(ad.getBeacons("impression"), ad.getBeacons("click"), ad.getBeacons("sdk_event"), ad.getBeacons("companion_ad_event"), ad.getBeacons("custom_endcard_event")), HyBid.getReportingController(), listener, impressionListener, this.mIntegrationType);
        fromCreativeType.setListener(adPresenterDecorator);
        fromCreativeType.setImpressionListener(adPresenterDecorator);
        fromCreativeType.setVideoListener(adPresenterDecorator);
        fromCreativeType.setMRaidListener(adPresenterDecorator);
        return adPresenterDecorator;
    }
}
