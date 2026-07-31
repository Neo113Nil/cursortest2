package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerView;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵣ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1024 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2535 = StringFog.decrypt("1wdy66hVaAPiClHstVg=\n", "lmMnhcEhKWA=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2534 = StringFog.decrypt("h73oICI33hWd4eEgJDzFF42x4H15ONMSyrPhezkww0+lttBgPi32ApC782cjIA==\n", "5NKFDldZt2E=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2533 = StringFog.decrypt("tj2haNTsNcyRKw==\n", "9FzPBrGeY6U=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2532 = StringFog.decrypt("XA+rhohUQRdGU6KGjl9aFVYDo9vTWEkNUQW029N4SQ1RBbT+lF9f\n", "P2DGqP06KGM=\n");

    public C1024(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        String version = UnityAds.getVersion();
        if (version != null) {
            return version.split(StringFog.decrypt("XQ==\n", "cNeaWmVqDp8=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        return new HashMap();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 252148886) {
            if (str.equals(f2535)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 961844241) {
            if (str.equals(f2533)) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 1067215379) {
            if (hashCode == 1531208100 && str.equals(f2534)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(f2532)) {
                c = 3;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            return AdUnitActivity.class;
        }
        if (c == 2 || c == 3) {
            return BannerView.class;
        }
        return null;
    }
}
