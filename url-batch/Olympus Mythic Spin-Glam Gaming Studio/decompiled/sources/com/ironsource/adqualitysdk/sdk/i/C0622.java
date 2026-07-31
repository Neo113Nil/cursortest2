package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ק, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0622 extends AbstractC0955 {
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0955
    /* renamed from: ﻛ */
    public final String mo3942() {
        return StringFog.decrypt("6BctZGEX9hvnHW4raBzrE+Icbi1rC7cd7wtuB2ka8BDuOSQ5\n", "i3hASgZ4mXw=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0955
    /* renamed from: ｋ */
    public final Class mo3943() {
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0955
    /* renamed from: ﾇ */
    public final String mo3944() {
        return StringFog.decrypt("Cu5LQ5I=\n", "a4omLPBurr0=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0955
    /* renamed from: ﾒ */
    public final AbstractC0593 mo3945() {
        try {
            if (Prode.class.getName().equals("com.ironsource.adqualitysdk.sdk.i.Prode")) {
                Class.forName(StringFog.decrypt("2fXVZPsOOZTW/5Yr8gUknNP+li3xEniS3umWHPkTJZrV9PEk+g4=\n", "upq4SpxhVvM=\n"));
            }
            return new C0660(StringFog.decrypt("Cu5LQ5I=\n", "a4omLPBurr0=\n"));
        } catch (Throwable unused) {
            return new C0624(StringFog.decrypt("Cu5LQ5I=\n", "a4omLPBurr0=\n"));
        }
    }
}
