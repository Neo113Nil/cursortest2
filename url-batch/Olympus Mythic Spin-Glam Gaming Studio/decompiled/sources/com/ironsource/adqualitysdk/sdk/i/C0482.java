package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˉ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0482 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f418 = StringFog.decrypt("XMaU+NSOTJ5p2w==\n", "HaLVm6DnOvc=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f417 = StringFog.decrypt("H6m5X932hlwQo/oQz/DGUhKysQPF4oQVCa/6MM/Ci08VsL0F0g==\n", "fMbUcauD6Ds=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f416 = StringFog.decrypt("Spy7iqdttA==\n", "C/j6+dQIwFY=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f415 = StringFog.decrypt("gJ8kHQFnjm6glw==\n", "wfttc3UC/AA=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f414 = StringFog.decrypt("H0XgPCbDKko6\n", "XiGwXV+vRSs=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f413 = StringFog.decrypt("MCDvbQJA1g==\n", "cVCfI20ksw0=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f412 = StringFog.decrypt("RE+An8JRzL8=\n", "Bi7u8acjjds=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f411 = StringFog.decrypt("x++nzrlA6wTJ57rUuVzPEg==\n", "hY7JoNwyqmA=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f410 = StringFog.decrypt("doSX94MtH2RnjIP8\n", "NOX5meZfXgA=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f409 = StringFog.decrypt("6rdJ2vVw82XNoQ==\n", "qNYntJACpQw=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f408 = StringFog.decrypt("EOMLlI03Z2sf6UjbnzEnThLiCN+JFGBpBA==\n", "c4xmuvtCCQw=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f407 = StringFog.decrypt("5Ov+MD8E\n", "poqNVX5gazQ=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f406 = StringFog.decrypt("GInuvgWBaGUpnPi1IZc=\n", "Wuid20TlJAw=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f405 = StringFog.decrypt("pj9YCob96CiXPVkKpebFIA==\n", "5F4rb8CIhEQ=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f404 = StringFog.decrypt("wRyOJKumeq7nL4g8oqZ7p+8Ygzg=\n", "gn3tTM7HGMI=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f403 = StringFog.decrypt("7hYUuOyciN7NDTmw\n", "qGN41J//+rs=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f402 = StringFog.decrypt("P6fnF3NskA4cvMofTGaRHxy87gk=\n", "edKLewAP4ms=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f401 = StringFog.decrypt("ZRnaig30+qdYHs+DPuM=\n", "LHeu73+Hjs4=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f400 = StringFog.decrypt("Cch8XByQAIU0z2lVL4c4hTPSbVcLkQ==\n", "QKYIOW7jdOw=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f399 = StringFog.decrypt("MrSARt05bmYMg697/Bs=\n", "f+bBD5lpHAM=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f398 = StringFog.decrypt("9cf3Jk+qgcnR\n", "pauWRSrH5Kc=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f397 = StringFog.decrypt("/8LwqF0u+Bvsww==\n", "raeHyS9KnX8=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f396 = StringFog.decrypt("LQ/7YHBOUbw+DsBocV5RthoY\n", "f2qMAQIqNNg=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f395 = StringFog.decrypt("E3E4EE+xk8cxbSAeV60=\n", "RQRWdyPU0qQ=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f394 = StringFog.decrypt("LnIeznB0DJMheF2BYnJMnSNpFpJoYA7aOHRdtnNvBZgoXBCUb3cLgDQ=\n", "TR1z4AYBYvQ=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f393 = StringFog.decrypt("cMhklGzAOTFV\n", "Jr0K8wCleFU=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f392 = StringFog.decrypt("5irNS18vbqPZHM9FViRb\n", "sF+jLDNKL9M=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f391 = StringFog.decrypt("+o06MqxP/b7Ouzg8pUTe\n", "rPhUVcAqqts=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f390 = StringFog.decrypt("+T9kdJHZClvq\n", "nloQNfWMZDI=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f389 = StringFog.decrypt("6p+rEV+lOeo=\n", "jfrfUC/VcI4=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f388 = StringFog.decrypt("N/FrMNXYqwQx9nMW5t6zDTH3eh7R1bc0Ivg=\n", "UJQfc7S7w2E=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f387 = StringFog.decrypt("hqaF6axfzVKIpJ8=\n", "4cPxqs0yvTM=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f386 = StringFog.decrypt("nJuZwomvYHaWm4PmrKo=\n", "+/7tkuXOAxM=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f385 = StringFog.decrypt("FfE5NAI/tLgT4CgzAiawvRzzPg==\n", "cpRNYGdSxNQ=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f384 = StringFog.decrypt("SQ45r93GtedFGT2jzsKo\n", "IH1ryqqnx4M=\n");

    public C0482(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        try {
            return mo4017().split(StringFog.decrypt("jw==\n", "oq4qoEkd7m4=\n"))[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f390, new C1238(this));
        hashMap.put(f389, new C0788(this));
        hashMap.put(f388, new C0787(this));
        hashMap.put(f387, new C0637(this));
        hashMap.put(f386, new C0490(this));
        hashMap.put(f385, new C0486(this));
        hashMap.put(f384, new C0485(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String mo4017() {
        try {
            C0568 c0568 = C0860.m4221().f2085;
            String decrypt = StringFog.decrypt("qBb5MviVZQPdFvlHjtU=\n", "9kqdaaTxS14=\n");
            c0568.getClass();
            return C0568.m4057((Object) null, BuildConfig.class, decrypt);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -1836618638:
                if (str.equals(f418)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1791176561:
                if (str.equals(f412)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1560947009:
                if (str.equals(f408)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1494265129:
                if (str.equals(f394)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1435839138:
                if (str.equals(f403)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1179107681:
                if (str.equals(f393)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f397)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(f400)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f398)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -486531311:
                if (str.equals(f399)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -393802555:
                if (str.equals(f396)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -43797322:
                if (str.equals(f404)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 307971376:
                if (str.equals(f410)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f401)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 324239304:
                if (str.equals(f406)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 389759008:
                if (str.equals(f415)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 484680813:
                if (str.equals(f416)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 870529955:
                if (str.equals(f413)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f409)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 989853769:
                if (str.equals(f417)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1205766784:
                if (str.equals(f395)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1208038126:
                if (str.equals(f391)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1442693170:
                if (str.equals(f402)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1505622627:
                if (str.equals(f411)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1839869899:
                if (str.equals(f414)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1853648591:
                if (str.equals(f405)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1930966324:
                if (str.equals(f392)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1982630644:
                if (str.equals(f407)) {
                    c = 11;
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
                return AdActivity.class;
            case 2:
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case '\b':
                return BannerAdSize.class;
            case '\t':
            case '\n':
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case '\f':
                return BaseAdListener.class;
            case '\r':
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
                return FullscreenAd.class;
            case 16:
                return FullscreenAdListener.class;
            case 17:
                return InterstitialAd.class;
            case 18:
                return InterstitialAdListener.class;
            case 19:
                return MRAIDPresenter.class;
            case 20:
                return Placement.class;
            case 21:
                return RewardedAd.class;
            case 22:
                return RewardedAdListener.class;
            case 23:
            case 24:
                return VungleActivity.class;
            case 25:
                return VungleAds.class;
            case 26:
                return VungleApiClient.class;
            case 27:
                return VungleWebClient.class;
            default:
                return null;
        }
    }
}
