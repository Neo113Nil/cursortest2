package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3307iC implements InterfaceC2513Ol {
    public final SharedPreferences.Editor A00;

    public C3307iC(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C3307iC A00(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final C3307iC A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
