package com.smaato.sdk.ng.mraid.model;

import android.content.Context;
import android.text.TextUtils;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.CustomCTAData;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.utils.AdCustomCTAManager;
import com.smaato.sdk.ng.utils.AdEndCardManager;
import com.smaato.sdk.ng.utils.ClickThroughTimerManager;
import com.smaato.sdk.ng.utils.SkipOffsetManager;

/* loaded from: classes14.dex */
public class HTMLAd {
    private final Ad ad;
    private int clickThroughTimer;
    ClickThroughTimerManager.ClickThroughTimerListener clickThroughTimerListener;
    private CustomCTAData customCTAData;
    private Integer customCTADelay;
    private Integer endCardCloseDelay;
    private EndCardData endCardData;
    private LandingPageHandler landingPageHandler;
    private String link;
    private Integer nativeButtonCloseDelay;
    private boolean shouldShowCustomEndCard;
    private Integer skipDelay;

    public enum AdType {
        INTERSTITIAL,
        REWARDED
    }

    public HTMLAd(Context context, Ad ad, AdType adType) {
        this.ad = ad;
        if (ad != null) {
            this.link = ad.getLink();
            this.customCTAData = ad.getCustomCta(context, false);
            this.customCTADelay = AdCustomCTAManager.getCustomCtaDelay(ad);
            this.clickThroughTimer = ad.getClickThroughTimer();
            this.landingPageHandler = new LandingPageHandler(ad);
            if (ad.getCustomEndCard() != null && AdEndCardManager.shouldShowCustomEndcard(ad)) {
                this.shouldShowCustomEndCard = AdEndCardManager.shouldShowCustomEndcard(ad);
                this.endCardData = ad.getCustomEndCard();
                this.endCardCloseDelay = ad.getEndCardCloseDelay();
            }
            if (adType == AdType.INTERSTITIAL) {
                this.skipDelay = Integer.valueOf(SkipOffsetManager.getHTMLSkipOffset(ad.getHtmlSkipOffset(), Boolean.TRUE).intValue() * 1000);
            } else {
                this.skipDelay = Integer.valueOf(SkipOffsetManager.getHTMLSkipOffset(ad.getMraidRewardedSkipOffset(), Boolean.FALSE).intValue() * 1000);
            }
            this.nativeButtonCloseDelay = Integer.valueOf(SkipOffsetManager.getNativeCloseButtonDelay(ad.getNativeCloseButtonDelay()).intValue() * 1000);
        }
    }

    public int getClickThroughTimer() {
        return this.clickThroughTimer;
    }

    public ClickThroughTimerManager.ClickThroughTimerListener getClickThroughTimerListener() {
        return this.clickThroughTimerListener;
    }

    public Integer getCloseDelay() {
        return this.skipDelay;
    }

    public CustomCTAData getCustomCTAData() {
        return this.customCTAData;
    }

    public Integer getCustomCTADelay() {
        return this.customCTADelay;
    }

    public Integer getEndCardCloseDelay() {
        return this.endCardCloseDelay;
    }

    public EndCardData getEndCardData() {
        return this.endCardData;
    }

    public LandingPageHandler getLandingPage() {
        return this.landingPageHandler;
    }

    public String getLink() {
        return this.link;
    }

    public Integer getNativeButtonCloseDelay() {
        return this.nativeButtonCloseDelay;
    }

    public Integer getSkipDelay() {
        return this.skipDelay;
    }

    public boolean hasLandingPage() {
        LandingPageHandler landingPageHandler = this.landingPageHandler;
        return (landingPageHandler == null || !landingPageHandler.isLandingPageEnabled().booleanValue() || TextUtils.isEmpty(this.landingPageHandler.getCustomisationString())) ? false : true;
    }

    public boolean hasReducedCloseSize() {
        Ad ad = this.ad;
        if (ad != null) {
            Boolean isIconSizeReduced = ad.isIconSizeReduced();
            if (this.ad.getAdExperience().equalsIgnoreCase("performance") && isIconSizeReduced != null && isIconSizeReduced.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public Boolean isCustomCTAEnabled() {
        Ad ad = this.ad;
        return Boolean.valueOf((ad == null || this.customCTAData == null || !AdCustomCTAManager.isEnabled(ad).booleanValue()) ? false : true);
    }

    public void setClickThroughTimerListener(ClickThroughTimerManager.ClickThroughTimerListener clickThroughTimerListener) {
        this.clickThroughTimerListener = clickThroughTimerListener;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public boolean shouldInitEndCardView() {
        Ad ad;
        EndCardData endCardData = this.endCardData;
        return (endCardData == null || TextUtils.isEmpty(endCardData.getContent()) || !this.shouldShowCustomEndCard || (ad = this.ad) == null || !ad.isPerformanceAd()) ? false : true;
    }
}
