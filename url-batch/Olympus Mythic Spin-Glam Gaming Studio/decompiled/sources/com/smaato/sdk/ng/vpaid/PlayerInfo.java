package com.smaato.sdk.ng.vpaid;

import android.text.TextUtils;

/* loaded from: classes14.dex */
public class PlayerInfo {
    private final String a;
    private boolean b;

    public PlayerInfo(String str) {
        this.a = TextUtils.isEmpty(str) ? "Unknown error" : str;
    }

    public String getMessage() {
        return this.a;
    }

    public boolean isNoAdsFound() {
        return this.b;
    }

    public void setNoAdsFound() {
        this.b = true;
    }

    public String toString() {
        return "PlayerInfo{message='" + this.a + "'}";
    }
}
