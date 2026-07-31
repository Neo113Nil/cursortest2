package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڑ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0660 extends C0624 {

    /* renamed from: ﺟ, reason: contains not printable characters */
    public static final String f1412 = StringFog.decrypt("uknpLZIbeDWCSvQ=\n", "7CybXvt0Fnw=\n");

    public C0660(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0624, com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        return MobileAds.getVersion().toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0624, com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        return (str.hashCode() == -1938329210 && str.equals(f1412)) ? VersionInfo.class : super.mo3941(str);
    }
}
