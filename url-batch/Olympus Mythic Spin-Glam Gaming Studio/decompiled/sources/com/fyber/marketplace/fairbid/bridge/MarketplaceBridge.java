package com.fyber.marketplace.fairbid.bridge;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.impl.n;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class MarketplaceBridge {
    public static volatile n a;
    public static final Object b = new Object();

    public static void currentAudienceAppliesCoppa() {
        InneractiveAdManager.currentAudienceAppliesToCoppa();
    }

    public static void currentAudienceIsAChild() {
        InneractiveAdManager.currentAudienceIsAChild();
    }

    public static MarketplaceBridge getInstance() {
        n nVar = a;
        if (nVar == null) {
            synchronized (b) {
                try {
                    nVar = a;
                    if (nVar == null) {
                        nVar = new n();
                        a = nVar;
                    }
                } finally {
                }
            }
        }
        return nVar;
    }

    public static String getVersion() {
        return InneractiveAdManager.getVersion();
    }

    public static MarketplaceBridge initialize(Context context, String str, String str2, boolean z) {
        InneractiveAdManager.initialize(context, str);
        IAConfigManager.N.s = str2;
        IAlog.a = z ? 2 : 5;
        return getInstance();
    }

    public static boolean isChild() {
        return InneractiveAdManager.isCurrentUserAChild();
    }

    public abstract MarketplaceAuctionParameters getAuctionParameters();

    public abstract MarketplaceAuctionParameters getAuctionParameters(String str);

    public abstract boolean isMuted();

    public abstract void loadBannerAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceBannerListener marketplaceBannerListener);

    public abstract void loadInterstitialAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceInterstitialListener marketplaceInterstitialListener);

    public abstract void loadRewardedAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceRewardedListener marketplaceRewardedListener);

    public abstract String requestUserAgent(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener);

    public abstract void setMuted(boolean z);
}
