package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.י, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0610 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public String f1110;

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1109 = StringFog.decrypt("Ri6JNyzzOXJGK6kjKvI=\n", "L13AWU+WVwY=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1108 = StringFog.decrypt("WToZPylRGxpVOhk3KQ==\n", "Pl9tfk0cemg=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1107 = StringFog.decrypt("YpCznhx4Nd5skqk=\n", "BfXH3X0VRb8=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1106 = StringFog.decrypt("yXbyDkTvohvBcuIrSfSpItx/9Q==\n", "rhOGSiuYzHc=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1105 = StringFog.decrypt("OCJ/bP9r+wYyImVI\n", "X0cLPJMKmGM=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1104 = StringFog.decrypt("0kXAVRvhjiDy\n", "hSCiFH+350U=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1103 = StringFog.decrypt("//9SMR9q4yLb/14EHkg=\n", "qJowcHs6kUc=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1102 = StringFog.decrypt("xuV4ux0mU4TByQ==\n", "kYAa7XRDJMU=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1101 = StringFog.decrypt("vK0w79RavA+ImzLh3VGf\n", "6theiLg/62o=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1100 = StringFog.decrypt("U0F4ml+AjAd3dk4=\n", "HhM50xvB6FE=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1099 = StringFog.decrypt("BUf/DAJGKGAtct8xIw==\n", "SBW+RUYCTQw=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1098 = StringFog.decrypt("wTh842ad69PlMW/oYLnwxfM5ZPJxm93l9jlk8liA8dTlMm/0\n", "gFwKhhTpgqA=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1097 = StringFog.decrypt("hZ3UXUmcaCKwgA==\n", "xPmVPj31Hks=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1096 = StringFog.decrypt("4UyZE545\n", "tzn3dPJczCg=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1095 = StringFog.decrypt("oo+NG8viDJuAk5UV0/4=\n", "9PrjfKeHTfg=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1094 = StringFog.decrypt("HiS74TrY+6wRLvi4Ld/nrhNlo6Zi++ClGiezji/Z/L0UP68=\n", "fUvWz0ytlcs=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1093 = StringFog.decrypt("EeDU09Cfypk16cfY1g==\n", "UISitqLro+o=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1092 = StringFog.decrypt("9YcDs2tcSyvR\n", "peti0A4xLkU=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1091 = StringFog.decrypt("SWBvCOW9BV99Q2gK/pkxTnZjaBvw\n", "HxUBb4nYUjo=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1090 = StringFog.decrypt("n+sCxh3wRpyQ4UGfCvdanpKqGoFF012Vm+gKvw7nfpKZ8y6LH+xekoj9\n", "/IRv6GuFKPs=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1089 = StringFog.decrypt("X1/RVEB2QiZjX9JMYnk=\n", "DzOwLQESAUc=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1088 = StringFog.decrypt("HjWMd3YB\n", "TFD8GAR1VnI=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1087 = StringFog.decrypt("8QvHeiYrp7vRFw==\n", "o263FVVC09Q=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1086 = StringFog.decrypt("R5+kdCipaIlljw==\n", "BvvnG0bdGug=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1085 = StringFog.decrypt("WsOiNdg/JoZ5wrUm1R02\n", "FqzBVLR+QsU=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1084 = StringFog.decrypt("f+RnLSjxkIJa7nM=\n", "M4sETESw9NQ=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1083 = StringFog.decrypt("GJ6I8UBEI1cj\n", "VPHrkCwSSjI=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1082 = StringFog.decrypt("bUHF3SLyBwpSS8jIK9A=\n", "IS6mvE6idW8=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1081 = StringFog.decrypt("EtuUuFCp62gwy4iWWqv8eyfWpLJTuPd9A82ypFuz7Wwh\n", "U7/X1z7dmQk=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1080 = StringFog.decrypt("fsZT+YxDJ2Zaz0Dyimc8cEzHS+ifQyd6UeRE/4pYPGw=\n", "P6IlnP43ThU=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1079 = StringFog.decrypt("JlHcz3aStW8YW8zLdKe0TQ==\n", "aj6/rhrT0T8=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1078 = StringFog.decrypt("W/PzO12q4sBkxMEXd5/j4g==\n", "FqGychnrhpA=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1077 = StringFog.decrypt("6c1ztsErv2vR1nij\n", "v7gd0a1O/Qo=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1076 = StringFog.decrypt("Yqg+BF/Z6c9ton1dSN71zW/pBV9Hy+vNQ6Y9REze\n", "AcdTKimsh6g=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1075 = StringFog.decrypt("iK9Ca9UTwBGqs1pp7x/rBw==\n", "3tosDLl2jnA=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1074 = StringFog.decrypt("RExTRqj0rJ9LRhAfv/OwnUkNSwHw96udUA1oHbDmrp1pQkoBqOSUkUJU\n", "JyM+aN6Bwvg=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1073 = StringFog.decrypt("noCaRUZ4ooemm5FQfHSFkQ==\n", "yPX0Iiod4OY=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f1072 = StringFog.decrypt("UmCdmaMt2Ipdat7AtCrEiF8hhd77Lt+IRiGmwrs/2ohzbp7ZsCrghFR4\n", "MQ/wt9VYtu0=\n");

    public C0610(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        String mo4017 = mo4017();
        if (mo4017 != null) {
            return mo4017.split(StringFog.decrypt("7w==\n", "wNJtr7uU8J0=\n"))[1];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1105, new C1023(this));
        hashMap.put(f1109, new C1010(this));
        hashMap.put(f1108, new C1004(this));
        hashMap.put(f1107, new C0979(this));
        hashMap.put(f1106, new C0645(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final String mo4017() {
        if (this.f1110 == null) {
            C1082 c1082 = C0860.m4221().f2086;
            C1084 c1084 = new C1085().f2749;
            c1084.f2744 = String.class;
            c1084.f1126 |= 8;
            c1084.f1125 |= 16;
            C1082 c10822 = C0860.m4221().f2086;
            ArrayList arrayList = new ArrayList();
            c10822.m4371(VungleApiClient.class, c1084, arrayList);
            String str = null;
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((Field) it.next()).get(null);
                    if (str2.startsWith(StringFog.decrypt("46GsiUdbQHbUrq2A\n", "tdTC7is+ARs=\n")) || str2.startsWith(StringFog.decrypt("h4sdj2+8txq+lxc=\n", "0f5z6APZ82g=\n"))) {
                        str = str2.split(StringFog.decrypt("HQ==\n", "JtUNkrDCfas=\n"))[0];
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            this.f1110 = str;
            this.f992 = str;
        }
        return this.f1110;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2075872274:
                if (str.equals(f1078)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2012803321:
                if (str.equals(f1074)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1853707364:
                if (str.equals(f1072)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1850654380:
                if (str.equals(f1088)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1836618638:
                if (str.equals(f1097)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1740904301:
                if (str.equals(f1084)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1721428911:
                if (str.equals(f1096)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1057659822:
                if (str.equals(f1098)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -965507231:
                if (str.equals(f1102)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -899612152:
                if (str.equals(f1090)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -828205665:
                if (str.equals(f1100)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -747599243:
                if (str.equals(f1086)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f1092)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -350701718:
                if (str.equals(f1087)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -92732536:
                if (str.equals(f1076)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 156342925:
                if (str.equals(f1075)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 315438882:
                if (str.equals(f1073)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 332396988:
                if (str.equals(f1104)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 505165239:
                if (str.equals(f1091)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 670892517:
                if (str.equals(f1093)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 746354589:
                if (str.equals(f1082)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 798818448:
                if (str.equals(f1083)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1033471823:
                if (str.equals(f1094)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1110462460:
                if (str.equals(f1099)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1205766784:
                if (str.equals(f1095)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1208038126:
                if (str.equals(f1101)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1230133745:
                if (str.equals(f1103)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1461477995:
                if (str.equals(f1080)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1611471226:
                if (str.equals(f1079)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1731532800:
                if (str.equals(f1085)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1766407901:
                if (str.equals(f1077)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1777696764:
                if (str.equals(f1089)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1861686093:
                if (str.equals(f1081)) {
                    c = 18;
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
                return Vungle.class;
            case 1:
            case 2:
                return VungleActivity.class;
            case 3:
            case 4:
                return VungleWebViewActivity.class;
            case 5:
                return Advertisement.class;
            case 6:
                return Placement.class;
            case 7:
                return VungleWebClient.class;
            case '\b':
                return Report.class;
            case '\t':
                return PlayAdCallback.class;
            case '\n':
                return Repository.class;
            case 11:
                return AdContract.class;
            case '\f':
                return LocalAdContract.class;
            case '\r':
                return LocalAdView.class;
            case 14:
                return LocalAdContract.LocalView.class;
            case 15:
                return LocalAdContract.LocalPresenter.class;
            case 16:
                return LocalAdPresenter.class;
            case 17:
                return MRAIDAdPresenter.class;
            case 18:
                return AdContract.AdvertisementPresenter.class;
            case 19:
                return AdvertisementPresentationFactory.class;
            case 20:
                return WebAdContract.WebAdView.class;
            case 21:
                return WebAdContract.WebAdPresenter.class;
            case 22:
                return WebViewAPI.class;
            case 23:
                return MRAIDAdView.class;
            case 24:
                return WebViewAPI.MRAIDDelegate.class;
            case 25:
                return AdContract.AdvertisementPresenter.EventListener.class;
            case 26:
                return AdActivity.class;
            case 27:
            case 28:
                return VungleBanner.class;
            case 29:
            case 30:
                return VungleBannerView.class;
            case 31:
            case ' ':
                return VungleNativeView.class;
            default:
                return null;
        }
    }
}
