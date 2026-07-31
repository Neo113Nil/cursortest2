package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɟ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0427 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f294 = StringFog.decrypt("duiyVbgkBPJ2+a9ovzENwWHBr2+iNQ/ldw==\n", "BY3GHNZQYYA=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f293 = StringFog.decrypt("4lts4L0jjGv1W3zzvBiEauVbdteq\n", "kT4YsthU7Rk=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f292 = StringFog.decrypt("RvsMaPqXailcugAiu5lxL0DmEjL8hHY6SboUL7u5cS9A5hIy/IR2OknVAjL8hnYvXA==\n", "JZRhRpXwH1s=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f291 = StringFog.decrypt("xfMNIBCH/NX49BgpI5f81fr0DTw=\n", "jJ15RWL0iLw=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f290 = StringFog.decrypt("R+o8Ebk=\n", "CI1JY8C5h80=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f289 = StringFog.decrypt("MwA2oqBU0RsZFTCksGnWDhAmJw==\n", "fGdD0Nkdv28=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f288 = StringFog.decrypt("nLRo9Ozd/5u2oW7y/OD4jr+Secr85+WKvbZv\n", "09MdhpWUke8=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f287 = StringFog.decrypt("Sx/DB9fHsDllCtIQytSx\n", "BHi2da6V1U4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f286 = StringFog.decrypt("zo33++/Qw/3gmObs8sPCxuiZ9uz459Q=\n", "geqCiZaCpoo=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f285 = StringFog.decrypt("GtM5n0YI9JU0xig=\n", "VbRM7T9akeI=\n");

    public C0427(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        try {
            return Ogury.getSdkVersion();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f294, new C0439(this));
        hashMap.put(f293, new C0437(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -1704786309:
                if (str.equals(f291)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -734879533:
                if (str.equals(f285)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 76142724:
                if (str.equals(f290)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82913255:
                if (str.equals(f288)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 186993737:
                if (str.equals(f286)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1169123445:
                if (str.equals(f287)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1789379091:
                if (str.equals(f289)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1866202823:
                if (str.equals(f292)) {
                    c = 0;
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
            case 1:
                return InterstitialActivity.class;
            case 2:
                return Ogury.class;
            case 3:
                return OguryInterstitialAd.class;
            case 4:
                return OguryInterstitialAdListener.class;
            case 5:
                return OguryRewardedAd.class;
            case 6:
                return OguryRewardedAdListener.class;
            case 7:
                return OguryReward.class;
            default:
                return null;
        }
    }
}
