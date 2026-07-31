package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.monetization.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class H extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f130 = StringFog.decrypt("RKDC/HlvO09XjNI=\n", "I8W2vR06VSY=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f129 = StringFog.decrypt("PkRWAZPUTAMtQA==\n", "WSEiU/KjCGI=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f128 = StringFog.decrypt("1ZKaSePuhrjjgYtx/saKpNKSgHr4\n", "pvfuH4qK49c=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f127 = StringFog.decrypt("L9OQLTrhGU06xZANIPsMRAHYggs=\n", "SLbkZFSSbSg=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f126 = StringFog.decrypt("PmIJ6PLJ9UU9RhDV4tDg\n", "WQd9upe+lDc=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f125 = StringFog.decrypt("rDC55ENKtMqvAbTGQw==\n", "y1XNtiY91bg=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f124 = StringFog.decrypt("kepUGyk2eueS6kQIKAh185k=\n", "9o8gSUxBG5U=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f123 = StringFog.decrypt("RhyPNhCt8mtRHJ8lEZ/lfFsNtw0GrvZ3UAs=\n", "NXn7ZHXakxk=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f122 = StringFog.decrypt("9WrT1wT9PtX1e87qA+g35uJK0fsE/RfO9XvC8A/7\n", "hg+nnmqJW6c=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f121 = StringFog.decrypt("JW2a8q2I0fYEYYLanZ7U\n", "Qgjuv8jsuJc=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f120 = StringFog.decrypt("IQW9n10kgMwHBISsUCmE5S8MrA==\n", "RmDJyTRA5aM=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f119 = StringFog.decrypt("UqBifDpDlrJ0oV9ENUg=\n", "NcUWKlMn890=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f118 = StringFog.decrypt("ksT+SHCFr9qT4O5PZ46vy63I+X50haTN\n", "4aGKChHrwb8=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f117 = StringFog.decrypt("wc+nDymDHrf00g==\n", "gKvmbF3qaN4=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f116 = StringFog.decrypt("ePQWdUVNWwp+41U2U05cAn61Gj9PAlYBdvYUNRJtUS947xItVVhM\n", "G5t7WzwsNW4=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f115 = StringFog.decrypt("BgIqZvz6\n", "R2ZjCJqVrIY=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f114 = StringFog.decrypt("nikcH0Qsfy6r\n", "301OejVZGl0=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f113 = StringFog.decrypt("Hae5DzRT\n", "XMPtdkQ2fPU=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f112 = StringFog.decrypt("Znc9+jSl4oJAdAnpJbc=\n", "LxpNiFHWkes=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f111 = StringFog.decrypt("AMfMkSrsi8Q+\n", "Taiu+EaJyqA=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f110 = StringFog.decrypt("vzIoNBuHIXidKSM9GKE8\n", "6VtMUXTEThY=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f109 = StringFog.decrypt("PUzUXKxa+NMFUfxQsGvr2A5X\n", "ayWwOcMfjrY=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f108 = StringFog.decrypt("/yV0sW9a32T4Mn+xfmT3c8khdLp4\n", "vUQa3woongA=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f107 = StringFog.decrypt("LN/5LD/13YA41/I1\n", "br6XQlqHnOQ=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f106 = StringFog.decrypt("NfxQ+ezygzIz6xO6+vGEOjO9XLPmvY83OP1YpbvRjDg49k+W8cWEMyE=\n", "VpM915WT7VY=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f105 = StringFog.decrypt("aJchEZMzxWFVkDQYoCQ=\n", "IflVdOFAsQg=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f104 = StringFog.decrypt("niYvyJ5uAP2jITrBrXkx4rImL+GFbgDxuS0p\n", "10hbrewddJQ=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f103 = StringFog.decrypt("D28mOhCA\n", "XQpRW2Lk8R0=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f102 = StringFog.decrypt("tR08Kl4rcUGmHA==\n", "53hLSyxPFCU=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f101 = StringFog.decrypt("eHy3LfcIN85rfYU64AIm5kNqtCnrCSA=\n", "KhnATIVsUqo=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f100 = StringFog.decrypt("bLu7l+Tps6lWs6aQ6su8tVOhq5flzaU=\n", "OtLf8ouo1/k=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f99 = StringFog.decrypt("3YlhHFI24sz1\n", "kOwFdTNwi6A=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f98 = StringFog.decrypt("1+mA0m4eBg==\n", "gYDktwFfYko=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f97 = StringFog.decrypt("Q09WqCh64VdlSw==\n", "ESohyVoepTY=\n");

    public H(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String mo3939() {
        return MobileAds.getLibraryVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f130, new y(this));
        hashMap.put(f129, new z(this));
        hashMap.put(f128, new A(this));
        hashMap.put(f127, new B(this));
        hashMap.put(f126, new C(this));
        hashMap.put(f125, new D(this));
        hashMap.put(f124, new E(this));
        hashMap.put(f123, new F(this));
        hashMap.put(f122, new G(this));
        hashMap.put(f121, new u(this));
        hashMap.put(f120, new v(this));
        hashMap.put(f119, new w(this));
        hashMap.put(f118, new x(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -1850459313:
                if (str.equals(f103)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1836618638:
                if (str.equals(f117)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1666698098:
                if (str.equals(f111)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1401317165:
                if (str.equals(f109)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1338246468:
                if (str.equals(f106)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1139615429:
                if (str.equals(f116)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f112)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -650052115:
                if (str.equals(f100)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -610771047:
                if (str.equals(f97)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f102)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -572702516:
                if (str.equals(f114)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -564429827:
                if (str.equals(f101)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -150968480:
                if (str.equals(f99)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 308060116:
                if (str.equals(f107)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f105)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 871099991:
                if (str.equals(f110)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 957243679:
                if (str.equals(f108)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1228411167:
                if (str.equals(f104)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1955530641:
                if (str.equals(f115)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1955869213:
                if (str.equals(f113)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2117435870:
                if (str.equals(f98)) {
                    c = 19;
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
                return AdInfo.class;
            case 3:
                return AdRequest.class;
            case 4:
                return AdType.class;
            case 5:
                return ImpressionData.class;
            case 6:
                return MobileAds.class;
            case 7:
            case '\b':
                return BannerAdView.class;
            case '\t':
                return VideoController.class;
            case '\n':
                return VideoEventListener.class;
            case 11:
                return BannerAdEventListener.class;
            case '\f':
                return InterstitialAd.class;
            case '\r':
                return InterstitialAdEventListener.class;
            case 14:
                return Reward.class;
            case 15:
                return RewardedAd.class;
            case 16:
                return RewardedAdEventListener.class;
            case 17:
                return VideoAdPlaybackListener.class;
            case 18:
                return MediaFile.class;
            case 19:
                return VideoAd.class;
            case 20:
                return RewardData.class;
            default:
                return null;
        }
    }
}
