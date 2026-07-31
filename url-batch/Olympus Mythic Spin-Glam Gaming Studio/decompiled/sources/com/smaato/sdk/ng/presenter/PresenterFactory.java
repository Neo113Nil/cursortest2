package com.smaato.sdk.ng.presenter;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.ImpressionTrackingMethod;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.AdTracker;

/* loaded from: classes8.dex */
public abstract class PresenterFactory {
    private final Context a;
    protected final IntegrationType b;

    public PresenterFactory(Context context, IntegrationType integrationType) {
        this.a = context;
        this.b = integrationType;
    }

    protected Context a() {
        return this.a;
    }

    protected abstract AdPresenter a(int i, Ad ad, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, View view);

    public AdPresenter createPresenter(Ad ad, AdSize adSize, AdPresenter.Listener listener) {
        return createPresenter(ad, adSize, listener, null);
    }

    public AdPresenter createPresenter(Ad ad, AdSize adSize, AdPresenter.Listener listener, AdPresenter.ImpressionListener impressionListener) {
        return createPresenter(ad, null, adSize, ImpressionTrackingMethod.AD_VIEWABLE, listener, impressionListener, null);
    }

    public AdPresenter createPresenter(Ad ad, AdTracker adTracker, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, AdPresenter.Listener listener, AdPresenter.ImpressionListener impressionListener, View view) {
        AdPresenter a;
        if (ad == null || (a = a(ad.assetgroupid, ad, adSize, impressionTrackingMethod, view)) == null) {
            return null;
        }
        AdPresenterDecorator adPresenterDecorator = new AdPresenterDecorator(a, adTracker != null ? adTracker : new AdTracker(ad.getBeacons("impression"), ad.getBeacons("click"), ad.getBeacons("sdk_event"), ad.getBeacons("companion_ad_event"), ad.getBeacons("custom_endcard_event")), NextGen.getReportingController(), listener, impressionListener, this.b);
        a.setListener(adPresenterDecorator);
        a.setImpressionListener(adPresenterDecorator);
        a.setVideoListener(adPresenterDecorator);
        a.setMRaidListener(adPresenterDecorator);
        return adPresenterDecorator;
    }
}
