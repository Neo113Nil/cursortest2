package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3306iB implements InterfaceC2514Om {
    public final SharedPreferences A00;

    public C3306iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2514Om
    public final C3307iC A6I() {
        return new C3307iC(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2514Om
    public final long A8Q(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2514Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
