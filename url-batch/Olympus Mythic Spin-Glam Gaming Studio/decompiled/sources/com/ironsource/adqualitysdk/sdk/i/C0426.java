package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɜ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0426 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f284 = StringFog.decrypt("1s+SyuKkddPcz4jux6FQxN7Hp/7YrHPB\n", "sarmmo7FFrY=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f283 = StringFog.decrypt("857WLzCbRe35nswLFZ5g+vuW4xs=\n", "lPuif1z6Jog=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f282 = StringFog.decrypt("g2mIoCcWKd2EaZKEMQ==\n", "8Az84UNaQK4=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f281 = StringFog.decrypt("zB0EHnYY9+7FGxURZgjp5NkTMTx3Feji3wEmNmYLyvLbHTs6eg==\n", "q3hwXwN8nos=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f280 = StringFog.decrypt("yDm59YllJIbBP6j6mXU6jN03jNeIaDuK2yWI2phCLJHLEazGl3Q9qMol\n", "r1zNtPwBTeM=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f279 = StringFog.decrypt("0QETuJ71iiHREA6Fke2uN+4NFIWV74oh\n", "omRn8fCB71M=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f278 = StringFog.decrypt("1WztixtPNErbatWgA0UwVQ==\n", "sgmZz2IhVSc=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f277 = StringFog.decrypt("k9EfEcFCZ+GZ0QU1+Vp04Q==\n", "9LRrQa0jBIQ=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f276 = StringFog.decrypt("Id/5RqLmo+oMzOhOoOa2zBXI/Uye4oTAD8zs\n", "Qq2cJ9aD96g=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f275 = StringFog.decrypt("mvc=\n", "25P8FrIBuKU=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f274 = StringFog.decrypt("FV47iexFydMm\n", "VDp67Y01vbY=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f273 = StringFog.decrypt("jt+FmrEOGg==\n", "z7vA6MNhaBQ=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f272 = StringFog.decrypt("AeqbGSPfGIkl/A==\n", "QI7XcFCrfec=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f271 = StringFog.decrypt("OxXCa/7A\n", "enGUApu3WDo=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f270 = StringFog.decrypt("dn3FmQMSPLN3fcfcSxI7pTtTzOEMFig=\n", "FRKot2VzX9Y=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f269 = StringFog.decrypt("3vF71EKmqtj6+1/sWrWq\n", "n5UruCPFz7U=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f268 = StringFog.decrypt("XAkyFrkZU8x8Iy4IoQpF4XQFMw==\n", "GGBBZtV4Ko0=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f267 = StringFog.decrypt("J9vJQTQn7ecoy9lfPjvlwwXaxF44Pfc=\n", "Zq6tKFFJjoI=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f266 = StringFog.decrypt("aiySBpInl8drLJBD2ieQ0ScCikydI5rBbA2aXIMphslIIItBgi+A2w==\n", "CUP/KPRG9KI=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f265 = StringFog.decrypt("yLckqsxLrG31sDGj/1yUbfKtNaHbSg==\n", "gdlQz7442AQ=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f264 = StringFog.decrypt("gI348ueFe/m9iu371JI=\n", "yeOMl5X2D5A=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f263 = StringFog.decrypt("LwO9GZ5oWokrD64dg01boRQVvh2CaU0=\n", "fWbKeOwMP+0=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f262 = StringFog.decrypt("09yAaGaJt5bX0JNse6y2\n", "gbn3CRTt0vI=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f261 = StringFog.decrypt("SKWu7orfCL9jvaTqlfAKkHizsvY=\n", "DNzAj+e2a/M=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f260 = StringFog.decrypt("CLClsywHfKMEsKK/\n", "RtHR2lpiPcc=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f259 = StringFog.decrypt("JiQfV80ZaLoGKw5M+hg=\n", "aEVrPrt8Kts=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f258 = StringFog.decrypt("zIRPh7/QNYQ=\n", "guU77sm1dOA=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f257 = StringFog.decrypt("GXT+oZmNGb8BfO+/\n", "VxWKyO/oWNs=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f256 = StringFog.decrypt("zfX1OdmGd3TP/fIkyo1TYg==\n", "g5SBUK/jNhA=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f255 = StringFog.decrypt("xNAm2bmUcrHXyzvdvp1gsNHQMc0=\n", "h7lUusz4E8M=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f254 = StringFog.decrypt("1PH1RLLJ0OrB1+xAp8vu7vPb9kS2\n", "gLO7Jcagpo8=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f253 = StringFog.decrypt("dERBh44ysypZT0GHkQSMJFZKRYOQ\n", "OCsi5uJwwUU=\n");

    public C0426(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        try {
            try {
                try {
                    return (String) C0860.m4221().f2086.m4370(AdSdkVersion.class, String.class).get(null);
                } catch (Throwable unused) {
                    return null;
                }
            } catch (Throwable unused2) {
                return (String) C0860.m4221().f2086.m4370(AdSdkVersion.class, String.class).get(null);
            }
        } catch (Throwable unused3) {
            C0568 c0568 = C0860.m4221().f2085;
            String decrypt = StringFog.decrypt("Ju5YUMeysb5TnBY=\n", "eLI8C5vWn+M=\n");
            c0568.getClass();
            return C0568.m4057((Object) null, BuildConfig.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f284, new C0525(this));
        hashMap.put(f283, new C0516(this));
        hashMap.put(f282, new C0514(this));
        hashMap.put(f281, new C0512(this));
        hashMap.put(f280, new C0511(this));
        hashMap.put(f279, new C0509(this));
        hashMap.put(f278, new C0459(this));
        hashMap.put(f277, new C0458(this));
        hashMap.put(f276, new C0447(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(f256)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1585374524:
                if (str.equals(f263)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1513928064:
                if (str.equals(f266)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1256969519:
                if (str.equals(f255)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -501313640:
                if (str.equals(f261)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(f265)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -105717264:
                if (str.equals(f262)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f275)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 289409084:
                if (str.equals(f269)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f264)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 435867927:
                if (str.equals(f253)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 488344453:
                if (str.equals(f273)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 535330969:
                if (str.equals(f267)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 553704929:
                if (str.equals(f268)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1165508119:
                if (str.equals(f272)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1237162638:
                if (str.equals(f254)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1476063628:
                if (str.equals(f274)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1838933446:
                if (str.equals(f259)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1908493505:
                if (str.equals(f270)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1955913096:
                if (str.equals(f271)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2035065003:
                if (str.equals(f260)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2035668095:
                if (str.equals(f257)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2110329530:
                if (str.equals(f258)) {
                    c = 17;
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
                return Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case '\b':
                return InterstitialAdListener.class;
            case '\t':
                return InterstitialAd.class;
            case '\n':
                return RewardedVideoAdListener.class;
            case 11:
                return RewardedVideoAd.class;
            case '\f':
            case '\r':
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                return CircularProgressView.class;
            case 21:
                return C0444.class;
            case 22:
                int i = AbstractC1206.f3135;
                String decrypt = StringFog.decrypt("VORL0GMJMsEb5kDBbQw0y1rrS8FtEyLUVOROxWkSeNpa5FvHYhR49VrpTs5OEjnYUelO0XgtN9dU\n7UrQ\n", "NYovogxgVrk=\n");
                String str2 = AbstractC1226.f3226;
                try {
                    return Class.forName(decrypt);
                } catch (Throwable unused) {
                    return null;
                }
            default:
                return null;
        }
    }
}
