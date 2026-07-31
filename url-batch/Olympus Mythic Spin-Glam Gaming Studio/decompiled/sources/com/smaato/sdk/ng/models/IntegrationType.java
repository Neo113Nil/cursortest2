package com.smaato.sdk.ng.models;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes8.dex */
public enum IntegrationType {
    HEADER_BIDDING(CampaignEx.JSON_KEY_HB),
    IN_APP_BIDDING("b"),
    MEDIATION("m"),
    STANDALONE("s");

    private final String code;

    IntegrationType(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }
}
