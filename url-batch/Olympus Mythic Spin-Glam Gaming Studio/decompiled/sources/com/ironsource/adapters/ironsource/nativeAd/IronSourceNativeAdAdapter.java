package com.ironsource.adapters.ironsource.nativeAd;

import android.app.Activity;
import com.ironsource.B8;
import com.ironsource.C4782n4;
import com.ironsource.X3;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {

    @Nullable
    private B8 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(@NotNull IronSourceAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter this$0, JSONObject config, NativeAdSmashListener listener, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            B8 a = B8.j.a();
            a.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(a, this$0.getNativeAdProperties(config)), listener));
            Activity activity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject prepareLoadParams = this$0.prepareLoadParams(config, str);
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            a.a(activity, prepareLoadParams);
            this$0.nativeAd = a;
        } catch (Exception e) {
            C4782n4.d().a(e);
            listener.onNativeAdLoadFailed(new IronSourceError(510, "IronSourceAdapter loadNativeAd exception " + e.getMessage()));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) {
        JSONObject loadParams = IronSourceNetworkBridge.jsonObjectInit().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(X3.s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        HashMap<String, String> extraParams = getAdapter().getInitParams();
        Intrinsics.checkNotNullExpressionValue(extraParams, "extraParams");
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        Intrinsics.checkNotNullExpressionValue(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        B8 b8 = this.nativeAd;
        if (b8 != null) {
            b8.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    @Nullable
    public Map<String, Object> getNativeAdBiddingData(@NotNull JSONObject config, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject config, @NotNull NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAdapter().initSDK(str, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(@NotNull final JSONObject config, @Nullable JSONObject jSONObject, @Nullable final String str, @NotNull final NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter.this, config, listener, str);
            }
        });
    }
}
