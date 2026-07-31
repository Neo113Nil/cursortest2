package com.smaato.sdk.ng.vpaid;

import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.vpaid.response.AdParams;

/* loaded from: classes15.dex */
public class VideoAdCacheItem {
    private final AdParams a;
    private final String b;
    private final EndCardData c;
    private final String d;

    public VideoAdCacheItem(AdParams adParams, String str, EndCardData endCardData, String str2) {
        this.a = adParams;
        this.b = str;
        this.c = endCardData;
        this.d = str2;
    }

    public AdParams getAdParams() {
        return this.a;
    }

    public EndCardData getEndCardData() {
        return this.c;
    }

    public String getEndCardFilePath() {
        return this.d;
    }

    public String getVideoFilePath() {
        return this.b;
    }
}
