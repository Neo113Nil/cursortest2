package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4699ia;
import com.ironsource.InterfaceC4870s3;
import com.ironsource.Jf;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class a<Listener extends AdapterAdListener> extends BaseAdAdapter<s, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener>, AdapterBindAdViewInterface, InterfaceC4870s3 {
    protected AbstractAdapter a;
    protected WeakReference<Listener> b;

    public a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        super(Jf.a(aVar), networkSettings, uuid);
        this.b = new WeakReference<>(null);
        this.a = abstractAdapter;
    }

    public static a<?> a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return new v(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return new n(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.BANNER) {
            return new i(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return new r(abstractAdapter, networkSettings, uuid);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + aVar);
        return null;
    }

    protected abstract void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    protected abstract IronSource.a b();

    protected boolean b(JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    public void c(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.InterfaceC4870s3
    public void collectBiddingData(@NotNull AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        a(C4699ia.a(adData.getConfiguration()), C4699ia.a(adData.getAdUnitData()), biddingDataCallback);
    }

    public void d(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(@NotNull AdData adData) {
        a(C4699ia.a(adData.getConfiguration()));
    }

    protected void e(JSONObject jSONObject) {
        b(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.aj);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(@NotNull AdData adData) {
        return b(C4699ia.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(@NotNull AdData adData, @NotNull Context context, @NotNull Listener listener) {
        a(adData, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(@NotNull AdData adData) {
        c(C4699ia.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(@NotNull AdData adData) {
        d(C4699ia.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(@NotNull AdData adData, @NotNull Activity activity, @NotNull Listener listener) {
        this.b = new WeakReference<>(listener);
        e(C4699ia.a(adData.getConfiguration()));
    }

    private void b(String str) {
        IronLog.INTERNAL.error(a("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(@NotNull AdData adData, @NotNull Activity activity, @NotNull ISBannerSize iSBannerSize, @NotNull Listener listener) {
        a(adData, listener);
    }

    protected void a(JSONObject jSONObject) {
        b("destroyAd");
    }

    protected void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        b("collectBiddingData");
    }

    protected String a(String str) {
        String aVar = b().toString();
        if (TextUtils.isEmpty(str)) {
            return aVar;
        }
        return aVar + " - " + str;
    }

    protected String a() {
        return a((String) null);
    }

    private void a(@NotNull AdData adData, @NotNull Listener listener) {
        this.b = new WeakReference<>(listener);
        a(C4699ia.a(adData.getConfiguration()), C4699ia.a(adData.getAdUnitData()), adData);
    }
}
