package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0938aD implements C2X {
    public final SharedPreferences.Editor A00;

    public C0938aD(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C0938aD A00(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final C0938aD A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
