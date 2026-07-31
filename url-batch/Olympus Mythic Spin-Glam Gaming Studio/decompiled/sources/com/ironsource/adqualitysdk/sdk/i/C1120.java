package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⅼ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1120 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2867 = StringFog.decrypt("O49jWVI4EnwsmVt9QCUYUy2Y\n", "SOoXFDNRfT0=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2866 = StringFog.decrypt("LwpXxUhb5A==\n", "Yms+qgk/l1Y=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2865 = StringFog.decrypt("il3KQ69PXPupT9dNgEhK\n", "xzyjLO4rL7I=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2864 = StringFog.decrypt("Yu+p7pNvFCBG/bTkvG4V\n", "L47AgdILZ2w=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2863 = StringFog.decrypt("7UsvXO0YSjnJWTJWwhlLPM5eI0HKHVoQ\n", "oCpGM6x8OXU=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2862 = StringFog.decrypt("fxh/m3pmDrtMGVyAV2kJsUgVTZc=\n", "Pnw57hYKfdg=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2861 = StringFog.decrypt("zLXxFBHRCXnVobRXEdYCJcmsu1cx3CAiyqmsGgLdAznnpqsQBtESLg==\n", "psXfeXC4Zlc=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2860 = StringFog.decrypt("SsbCMkDQvohm88sfYcWkm2vG1g==\n", "ArKvXgKxze0=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2859 = StringFog.decrypt("hdJ6v7GZ72+cxj/8sZ7kM4DLMPyYhO0trcMnt7Sx5ACM1j2kuYT5\n", "76JU0tDwgEE=\n");

    public C1120(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        return MaioAds.getSdkVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2867, new C1124(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -1799290762:
                if (str.equals(f2866)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455130644:
                if (str.equals(f2861)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1303622385:
                if (str.equals(f2863)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1069735125:
                if (str.equals(f2865)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -278703286:
                if (str.equals(f2864)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 357386522:
                if (str.equals(f2860)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1819361677:
                if (str.equals(f2862)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1914325723:
                if (str.equals(f2859)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return MaioAds.class;
            case 1:
            case 2:
                return AdFullscreenActivity.class;
            case 3:
            case 4:
                return HtmlBasedAdActivity.class;
            case 5:
                return MaioAdsInstance.class;
            case 6:
                return MaioAdsListener.class;
            case 7:
                return MaioAdsListenerInterface.class;
            default:
                return null;
        }
    }
}
