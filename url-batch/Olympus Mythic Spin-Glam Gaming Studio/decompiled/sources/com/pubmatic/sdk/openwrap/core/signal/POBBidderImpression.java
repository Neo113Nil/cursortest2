package com.pubmatic.sdk.openwrap.core.signal;

import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.openwrap.core.POBBanner;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBNative;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/POBBidderImpression;", "Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "isRewarded", "", "isInterstitial", "(ZZ)V", "getImpressionJson", "Lorg/json/JSONObject;", "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class POBBidderImpression extends POBImpression {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public POBBidderImpression() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBImpression
    @NotNull
    public JSONObject getImpressionJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(POBConstants.KEY_CLICK_BROWSER, !POBInstanceProvider.getSdkConfig().isUseInternalBrowser() ? 1 : 0);
        jSONObject.put(POBConstants.KEY_DISPLAY_MANAGER, "PubMatic_OpenWrap_SDK");
        jSONObject.put(POBConstants.KEY_DISPLAY_MANAGER_VERSION, "5.1.2");
        jSONObject.put(POBConstants.KEY_SECURE, 1);
        POBBanner banner = getBanner();
        if (banner != null) {
            POBRequest.AdPosition adPosition = this.adPosition;
            if (adPosition != null && adPosition != POBRequest.AdPosition.UNKNOWN) {
                banner.setAdPosition(adPosition);
            }
            jSONObject.put("banner", banner.getRTBJson(banner.getSupportedAPIs(false), false));
        }
        POBVideo video = getVideo();
        if (video != null) {
            POBRequest.AdPosition adPosition2 = this.adPosition;
            if (adPosition2 != null && adPosition2 != POBRequest.AdPosition.UNKNOWN) {
                video.setPosition(adPosition2);
            }
            jSONObject.put("video", video.getRTBJson());
        }
        POBNative pOBNative = getNative();
        if (pOBNative != null) {
            jSONObject.put("native", pOBNative.getRTBJson());
        }
        JSONObject extJson = getExtJson(null);
        if (extJson != null && extJson.length() > 0) {
            jSONObject.putOpt("ext", extJson);
        }
        return jSONObject;
    }

    public /* synthetic */ POBBidderImpression(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public POBBidderImpression(boolean z, boolean z2) {
        super("NA", "", z, z2);
    }
}
