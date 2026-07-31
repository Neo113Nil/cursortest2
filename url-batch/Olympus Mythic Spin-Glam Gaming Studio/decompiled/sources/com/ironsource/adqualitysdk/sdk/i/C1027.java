package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdView;
import com.ironsource.B5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterstitialActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵦ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1027 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2611 = StringFog.decrypt("fIt4GS3g8XN2i2I9D+D/cw==\n", "G+4MSUGBkhY=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2610 = StringFog.decrypt("Oqdd5WQ/ap4vjkjeaiRwqzGjSsJoNGqPE6NEwg==\n", "XcIppwVRBPs=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2609 = StringFog.decrypt("d8TZC7dmtspj0sQttFKl23Hr3i20\n", "EKGtQtoWxK8=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2608 = StringFog.decrypt("ACyDOTRgKX8SO44fN1Q6bgAEjgMtdTV/Ew==\n", "YUjncFkQWxo=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2607 = StringFog.decrypt("Cu/g0T2nEc4I+OjNOKs3zTzr+d8HqyvXHeTozA==\n", "eIqNvkvCWKM=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2606 = StringFog.decrypt("o3PdfAVwd0K1V81+DXdqUb5z2w==\n", "0BapMmQEHjQ=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2605 = StringFog.decrypt("p/0b1k6Yuwey3A7xSg==\n", "wJhvhSvqzWI=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2604 = StringFog.decrypt("HAWhNjdkRhAcA7MyMWBX\n", "XWfSQkUFJWQ=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2603 = StringFog.decrypt("qer1km9GBD6N\n", "+YaU8QorYVA=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2602 = StringFog.decrypt("6Zw1iumf4UfPgRqd75n7Qt6K\n", "qvNb/pvwjSs=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2601 = StringFog.decrypt("emrsRkLoR0pqavQaSP8GV31urwtE9FxWdmntDVm0a0t3cfMHR/ZNVlhm9QFd81xd\n", "GQWBaCuaKCQ=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2600 = StringFog.decrypt("v2jbyVKzn9eCb87AYaOf14Bv29U=\n", "9gavrCDA674=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2599 = StringFog.decrypt("UfB4OIaeSiBB8GBkjIkLPVb0O3WAglE8XfN5c53CbCBG+mdlm4VRJ1PzVHWbhVMnRuY=\n", "Mp8VFu/sJU4=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2598 = StringFog.decrypt("1L4dLSTdtdf4uhE1GNug\n", "m854Q3Gv2ZY=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2597 = StringFog.decrypt("ttBiprd2h1um0Hr6vWHGRrHUIeuxapxHutNj7awqp0Ww0Vr6skWLQbzJZvyn\n", "1b8PiN4E6DU=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2596 = StringFog.decrypt("viNwn+TqaMSUNF2Q2et4xLswZp7C8Q==\n", "91Ef8beFHbY=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2595 = StringFog.decrypt("oXh/oThAJomxeGf9Mldniqdze+4lWyaJsXN5oRhAJomReGf9MlcLhqx5d/0dUzCIt2M=\n", "whcSj1EySec=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2594 = StringFog.decrypt("NNNXJNHYzvAXwVEG3dnp+BjXSw==\n", "drI5SrSqnZ0=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2593 = StringFog.decrypt("ysmbiimMcW3g3g==\n", "g7v05HrjBB8=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2592 = StringFog.decrypt("FDOgAE1oduUyMJQTXHo=\n", "XV7QcigbBYw=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2591 = StringFog.decrypt("13XbNo6WKtXxdu8ln4QV1e1sziqOlw==\n", "nhirROvlWbw=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2590 = StringFog.decrypt("CEmknimJjIA7\n", "TB3m303f5eU=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2589 = StringFog.decrypt("KjcBdUudvBEmNkI/T4a0CCx2DT9Z3pk/CxkIDUOVqg==\n", "SVhsWyrw3Ws=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2588 = StringFog.decrypt("hlTJhiM4dCKzc96NIQ1qD6NCy4YhDWo=\n", "yjG/409oGEM=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2587 = StringFog.decrypt("KCtjBZ3tOw8dB3sUlM8kGg06fAGd8T4dECt7BYM=\n", "ZE4VYPG9V24=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2586 = StringFog.decrypt("MJcKmyulVjYFoBmJJodeMhikFZoimnsiCJ0RnzOcWRsVgQibKZBI\n", "fPJ8/kf1Olc=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2585 = StringFog.decrypt("XoX0khBiNtNrsueAHUA+13a265MZXRbbYZTnmRlA\n", "EuCC93wyWrI=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2584 = StringFog.decrypt("KGHNolkc8m4dVt6wVD76agBS0qNQI9NuCnHaq3kl7XsBat61\n", "ZAS7xzVMng8=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2583 = StringFog.decrypt("j1KEB0cf\n", "zjbNaSFwALA=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2582 = StringFog.decrypt("ByDcTr5s8L8yC8tfu0r5ny8=\n", "S0WqK9I8nN4=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2581 = StringFog.decrypt("jdSxuYviK52P1Ly/iPM=\n", "w7XF0P2Havk=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2580 = StringFog.decrypt("Md/QnsE6PL8E9MePxBw1nxn2z4jZDz67Dw==\n", "fbqm+61qUN4=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2579 = StringFog.decrypt("Syklai8EE29+ATZrKjUpZ2I7\n", "B0xTD0NUfw4=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2578 = StringFog.decrypt("1vzYt0w8cy727NCxXRhlJPbs2A==\n", "l5i5xzhZAWA=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2577 = StringFog.decrypt("1AH5PalrRXPMCegjl2Foc/8S\n", "mmCNVN8OBBc=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2576 = StringFog.decrypt("DGPZ4vzP4JwLbNnu+MTAlAlk3vPrz+SC\n", "RQ2th46hgfA=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2575 = StringFog.decrypt("L7f2118juFMgsuPOXSOLfg+i58xPJ5pS\n", "YdaCvilG+Tc=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2574 = StringFog.decrypt("AGFHuxrRdTkKYUezJdpAODxmUrEJ\n", "TgAz0my0NF0=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2573 = StringFog.decrypt("vg+pB3z1KXC5AKkLePELYJkBsyJj4xxxnguv\n", "8G7dbgqQaBQ=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2572 = StringFog.decrypt("9OiuBiOKZ8rz564KJ4lHzd8=\n", "uonab1XvJq4=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2571 = StringFog.decrypt("7dSPKBsnA+7v2polISsx/sbbnjM=\n", "o7X7QW1CQoo=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2570 = StringFog.decrypt("sEMC1siHBgCtTxfM1q4uF4pHGNrM\n", "/iJ2v77iR2Q=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2569 = StringFog.decrypt("5v4/hScejTb+9i6bExKiNs3tAoIlHr40yfwu\n", "qJ9L7FF7zFI=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2568 = StringFog.decrypt("2J6OTDHW\n", "mfrKLUW3hTM=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2567 = StringFog.decrypt("rwZE5lMS8IeaIlbKUSTz\n", "42Mygz9CnOY=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2566 = StringFog.decrypt("BcDKrUavXZ0w592mRJpDvS3z1a1d\n", "SaW8yCr/Mfw=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2565 = StringFog.decrypt("1B/hw5XAjXLOQ+jDjcuAb9YE5YKOgIZn2R7pn87igXDSHNyBgdemZ9ke6Z+hyrJv0gc=\n", "t3CM7eCu5AY=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2564 = StringFog.decrypt("PA165uq9dWIJKm3t6IhrQhQ+ZebxoXBwBA1i5vQ=\n", "cGgMg4btGQM=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f2563 = StringFog.decrypt("AOomT/mnr7Yq/QhF2Y61tiT5PQ==\n", "SZhJIarI2sQ=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f2562 = StringFog.decrypt("dQPnMqjnWf5+DO8z\n", "N2KJXM2VGJo=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f2561 = StringFog.decrypt("AkWs3vBPt8USQbPF8E6C\n", "QCTCsJU99qE=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f2560 = StringFog.decrypt("VGgW3epmglhAYB3E\n", "Fgl4s48Uwzw=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f2559 = StringFog.decrypt("hF/2ApiXZ86eA/8ChIth1JRf7l6OnG/elB75TYOXa8jJcvpCg5x8+4Nm8kma\n", "5zCbLO35Dro=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f2558 = StringFog.decrypt("gCt+2ROn1XaUI3XAOrznZqckdcU=\n", "wkoQt3bVlBI=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f2557 = StringFog.decrypt("6GDsTArvRAHVZ/lFOfg=\n", "oQ6YKXicMGg=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f2556 = StringFog.decrypt("4H1/gmoork/demqLWT+TSM98\n", "qRML5xhb2iY=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f2555 = StringFog.decrypt("0H746JXh8o3tee3hpvbKjepk6eOC4A==\n", "mRCMjeeShuQ=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f2554 = StringFog.decrypt("6E695yXVNbbVSajuFsITutBVrPEj\n", "oSDJglemQd8=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f2553 = StringFog.decrypt("9+q9/G6WVWfk6w==\n", "pY/KnRzyMAM=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f2552 = StringFog.decrypt("pZMTQzEg5i22ki1MJSs=\n", "9/ZkIkNEg0k=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f2551 = StringFog.decrypt("d/lyk79viBxk+Embvn+IFkDu\n", "JZwF8s0L7Xg=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f2550 = StringFog.decrypt("IT6y/Tg4vRkyP5f5Oym9Dgc=\n", "c1vFnEpc2H0=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f2549 = StringFog.decrypt("jF4Z/8qrgQa5cgHuw4meE6lPBvvKuok=\n", "wDtvmqb77Wc=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f2548 = StringFog.decrypt("PtGiBgolpX8L/boXAwe6ahvAvQIKNK1SG8egBggQuw==\n", "crTUY2Z1yR4=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f2547 = StringFog.decrypt("a41bll9L9gJeukiEUmn+BkOpSQ==\n", "J+gt8zMbmmM=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f2546 = StringFog.decrypt("ChQ5WQONw+s/IypLDq/L7yIwK3AGrtvvKBQ9\n", "RnFPPG/dr4o=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f2545 = StringFog.decrypt("/3gyCQXLGTvKTyEbCOkR\n", "sx1EbGmbdVo=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f2544 = StringFog.decrypt("6a5IcXbczUbcglNkaOnSVMykUFB7+MA=\n", "pcs+FBqMoSc=\n");

    /* renamed from: پ, reason: contains not printable characters */
    public static final String f2543 = StringFog.decrypt("7aV4lJGNU5/YiWOBj7hMjcivYLWcqV6yyLN6lJO4TQ==\n", "ocAO8f3dP/4=\n");

    /* renamed from: ٽ, reason: contains not printable characters */
    public static final String f2542 = StringFog.decrypt("M2Gztcly1AcEaKaA5WnBGTF3tJDDavUKIGWNisNq\n", "VATH+awEsWs=\n");

    /* renamed from: ث, reason: contains not printable characters */
    public static final String f2541 = StringFog.decrypt("XoHfeVFFPh1vidpMfV4rA1qWyFxbXRcYTJHeW1FB\n", "P+W7NTQzW3E=\n");

    /* renamed from: ת, reason: contains not printable characters */
    public static final String f2540 = StringFog.decrypt("VhGwiRB9WLlSEbG2CnltlUkEr4MVa32zSji0lRJ9erlW\n", "JHTd5mYYFNw=\n");

    public C1027(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        try {
            try {
                return LevelPlay.getSdkVersion();
            } catch (Throwable unused) {
                return IronSourceUtils.getSDKVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2611, new C1184(this));
        hashMap.put(f2610, new C1162(this));
        hashMap.put(f2609, new C1160(this));
        hashMap.put(f2608, new C1159(this));
        hashMap.put(f2607, new C1145(this));
        hashMap.put(f2542, new C1132(this));
        hashMap.put(f2541, new C1131(this));
        hashMap.put(f2540, new C1058(this));
        hashMap.put(f2606, new C1057(this));
        hashMap.put(f2605, new C1211(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2063883567:
                if (str.equals(f2579)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -2054763962:
                if (str.equals(f2580)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -2044561387:
                if (str.equals(f2574)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -2012752057:
                if (str.equals(f2549)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case -1879025222:
                if (str.equals(f2590)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1810844504:
                if (str.equals(f2558)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case -1704786309:
                if (str.equals(f2600)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1678289205:
                if (str.equals(f2601)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1555060867:
                if (str.equals(f2546)) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case -1406023077:
                if (str.equals(f2599)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1282106699:
                if (str.equals(f2565)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1276273849:
                if (str.equals(f2591)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f2592)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1088585376:
                if (str.equals(f2564)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -989825485:
                if (str.equals(f2578)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -838208757:
                if (str.equals(f2577)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -643050252:
                if (str.equals(f2597)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f2553)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case -559540471:
                if (str.equals(f2585)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(f2555)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f2603)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -393802555:
                if (str.equals(f2551)) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -284636416:
                if (str.equals(f2561)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -154075626:
                if (str.equals(f2570)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -153002112:
                if (str.equals(f2559)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 30304559:
                if (str.equals(f2584)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 85893348:
                if (str.equals(f2563)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 149942051:
                if (str.equals(f2593)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 204617641:
                if (str.equals(f2547)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 204897024:
                if (str.equals(f2554)) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 307677661:
                if (str.equals(f2562)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 308060116:
                if (str.equals(f2560)) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f2557)) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 334118616:
                if (str.equals(f2588)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 663296747:
                if (str.equals(f2602)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 766880816:
                if (str.equals(f2569)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 779287609:
                if (str.equals(f2596)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 823061407:
                if (str.equals(f2572)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 846220331:
                if (str.equals(f2544)) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 894546539:
                if (str.equals(f2576)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1052532031:
                if (str.equals(f2552)) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1069602180:
                if (str.equals(f2575)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1081984916:
                if (str.equals(f2571)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1180349927:
                if (str.equals(f2595)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1226831433:
                if (str.equals(f2567)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 1266525324:
                if (str.equals(f2566)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1267145181:
                if (str.equals(f2556)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1304950957:
                if (str.equals(f2604)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1325013503:
                if (str.equals(f2543)) {
                    c = B5.U;
                    break;
                }
                c = 65535;
                break;
            case 1432059210:
                if (str.equals(f2586)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1517126868:
                if (str.equals(f2598)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1628896204:
                if (str.equals(f2573)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1715808775:
                if (str.equals(f2545)) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 1773831812:
                if (str.equals(f2581)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1870849118:
                if (str.equals(f2550)) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 1910059890:
                if (str.equals(f2582)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1910219460:
                if (str.equals(f2594)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1955369613:
                if (str.equals(f2568)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1955530641:
                if (str.equals(f2583)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2019413793:
                if (str.equals(f2589)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2019599576:
                if (str.equals(f2587)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2102577435:
                if (str.equals(f2548)) {
                    c = '8';
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
                return AbstractAdapter.class;
            case 1:
                return Placement.class;
            case 2:
            case 3:
                return ControllerActivity.class;
            case 4:
            case 5:
                return InterstitialActivity.class;
            case 6:
            case 7:
                return OpenUrlActivity.class;
            case '\b':
            case '\t':
                return IronSourceBannerLayout.class;
            case '\n':
                return BannerSmashListener.class;
            case 11:
                return IronSource.class;
            case '\f':
                return ImpressionData.class;
            case '\r':
                return ImpressionDataListener.class;
            case 14:
            case 15:
                return DTBAdView.class;
            case 16:
                return LevelPlayBannerListener.class;
            case 17:
                return LevelPlayInterstitialListener.class;
            case 18:
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 19:
                return LevelPlayRewardedVideoListener.class;
            case 20:
                return LevelPlayRewardedVideoManualListener.class;
            case 21:
                return AdInfo.class;
            case 22:
                return LevelPlayNativeAd.class;
            case 23:
                return NativeAdLayout.class;
            case 24:
                return LevelPlayNativeAdListener.class;
            case 25:
                return LevelPlayMediaView.class;
            case 26:
                return AdapterNativeAdData.class;
            case 27:
                return NativeAdViewHolder.class;
            case 28:
                return InternalNativeAdListener.class;
            case 29:
                return NativeAdAdapterInterface.class;
            case 30:
                return NativeAdDataInterface.class;
            case 31:
                return NativeAdInteractionListener.class;
            case ' ':
                return NativeAdInterface.class;
            case '!':
                return NativeAdLoadListener.class;
            case '\"':
                return NativeAdSmashListener.class;
            case '#':
                return NativeAdViewBinderInterface.class;
            case '$':
                return AdData.class;
            case '%':
                return LevelPlayAdInfo.class;
            case '&':
            case '\'':
                return LevelPlayBannerAdView.class;
            case '(':
                return LevelPlayBannerAdViewListener.class;
            case ')':
                return IronSourceAds.AdFormat.class;
            case '*':
                return BannerAdInfo.class;
            case '+':
                return BannerAdRequest.class;
            case ',':
            case '-':
                return BannerAdView.class;
            case '.':
                return BannerAdViewListener.class;
            case '/':
                return InterstitialAd.class;
            case '0':
                return InterstitialAdInfo.class;
            case '1':
                return InterstitialAdListener.class;
            case '2':
                return InterstitialAdRequest.class;
            case '3':
                return RewardedAd.class;
            case '4':
                return RewardedAdInfo.class;
            case '5':
                return RewardedAdListener.class;
            case '6':
                return RewardedAdRequest.class;
            case '7':
                return LevelPlayInterstitialAd.class;
            case '8':
                return LevelPlayInterstitialAdListener.class;
            case '9':
                return LevelPlayRewardedAd.class;
            case ':':
                return LevelPlayRewardedAdListener.class;
            case ';':
                return LevelPlayReward.class;
            case '<':
                return LevelPlayImpressionData.class;
            case '=':
                return LevelPlayImpressionDataListener.class;
            default:
                return null;
        }
    }
}
