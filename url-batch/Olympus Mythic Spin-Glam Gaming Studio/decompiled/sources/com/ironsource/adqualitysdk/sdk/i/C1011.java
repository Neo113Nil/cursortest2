package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsBaseOptions;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerHide;
import com.unity3d.services.banners.BannerShow;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;
import com.unity3d.services.banners.api.Banner;
import com.unity3d.services.banners.api.BannerListener;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.banners.properties.BannerProperties;
import com.unity3d.services.banners.view.BannerEvent;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.monetization.UnityMonetization;
import com.unity3d.services.monetization.placementcontent.ads.ShowAdListenerAdapter;
import com.unity3d.services.monetization.placementcontent.core.CustomEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵕ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1011 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2515 = StringFog.decrypt("Y6LIsekeMORqs+uX/jor5HOGzII=\n", "BMe88pxsQoE=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2514 = StringFog.decrypt("zWD08ZgYz4j5d/PGhRjsi95i\n", "rhKRkOx9m8o=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2513 = StringFog.decrypt("K8VoDTyKOJU21EsrK64jlS/hbD4=\n", "WKAcTkn4SvA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2512 = StringFog.decrypt("kLek3X/vSoeT\n", "99LQmh6CL84=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2511 = StringFog.decrypt("65GaAsx6Wy/NkJ0by2BbM+KRnA==\n", "jPTuV6ITL1Y=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2510 = StringFog.decrypt("RTcu3ndO6np3NinHcFTqZlg3KA==\n", "NlJaixknngM=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2509 = StringFog.decrypt("lBT47RJKfs+PBezDAFxnyJUF8OwBXQ==\n", "5nGVgmQvK6E=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2508 = StringFog.decrypt("An9L1CWJnccif1zNIpOd2w1+XQ==\n", "YxsvgUvg6b4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2507 = StringFog.decrypt("jxkCHH0J1nmNCzM9fQX0U4kIEyx3Gfk=\n", "6Hx2SxhrgBA=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2506 = StringFog.decrypt("dcgFD/sqddxj2BQr6g1R3HzZ\n", "Eq1xWJ5IJ7k=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2505 = StringFog.decrypt("5Zn9JeEWLYXvmecBxBM=\n", "gvyJdY13TuA=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2504 = StringFog.decrypt("rof0RcPqQEq7rul01uFASrs=\n", "yeKAB6KELi8=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2503 = StringFog.decrypt("Frl9HSMwbPUXkGAsNjts9Rc=\n", "ZdwJX0JeApA=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2502 = StringFog.decrypt("m6IeSGV/Hrmboh5IZX8euQ==\n", "zsx3PBw+eso=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2501 = StringFog.decrypt("t4KLuhBsWcqruYynHVR83ZGgi70dSFPckA==\n", "4uzizmktPbk=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2500 = StringFog.decrypt("nPMVvwuKRwGAyBKiBrJiFrrYBL8XpUcXrdEVuAauTRe7\n", "yZ18y3LLI3I=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2499 = StringFog.decrypt("Ji3kWQZIoZQkJu97FmyypgMz\n", "c0ONLX8Jxec=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2498 = StringFog.decrypt("svlBQYguk9iR+mZU\n", "5rsWJOp4+r0=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2497 = StringFog.decrypt("coHkDnpq8j9WkMMqenXz\n", "JeSGXB8bh1o=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2496 = StringFog.decrypt("C7SB1O/2X8wqtI32xfJc7Du+kfs=\n", "XNHjgoaTKIk=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2495 = StringFog.decrypt("1CmXbV+zXqDkM5djR4pYoe8=\n", "gUf+GSb+Mc4=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2494 = StringFog.decrypt("Hjbfw5jFOic+KtXavNM3KiwuxNGr\n", "TV6wtNmhdk4=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2493 = StringFog.decrypt("L1vMtkoRC6sJQMs=\n", "bC6/wiV8Tt0=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2492 = StringFog.decrypt("5UoG19hpnH3BWw==\n", "si9khb0Y6Rg=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2491 = StringFog.decrypt("yR4Y19riVKXLFRP1ysZH\n", "nHBxo6OjMNY=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2490 = StringFog.decrypt("FKuO9VuIDbshpq3yRoU=\n", "Vc/bmzL8TNg=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2489 = StringFog.decrypt("gelRnRfA\n", "w4g/83KyEmc=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2488 = StringFog.decrypt("Gd090X2ocRMi1ibW\n", "TLNUpQTqEH0=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2487 = StringFog.decrypt("PTUMxEtHZGEGPhfjW39g\n", "aFtlsDIFBQ8=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2486 = StringFog.decrypt("WRfoMR+zh0h0AQ==\n", "G3aGX3rB1CA=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2485 = StringFog.decrypt("lsPXaxCt+mOwxw==\n", "1KK5BXXfsgo=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2484 = StringFog.decrypt("WQ0vyaRd9ld+AjU=\n", "G2xBp8EvsyE=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2483 = StringFog.decrypt("fSlC0iTIkhhMPEnSJMg=\n", "P0gsvEG63nE=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2482 = StringFog.decrypt("e5exirPUTfBWkqqIs+VR01+fuJGkx0rUVpg=\n", "Ofbf5NamPr0=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2481 = StringFog.decrypt("UKN4RUgv4pJ9snNZWTTXkw==\n", "EsIWKy1dsuA=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2480 = StringFog.decrypt("Q/AWfWpURt1y+Ax6YEg=\n", "AZF4Ew8mFrI=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2479 = StringFog.decrypt("IQASHTeNn/kBMRASK5q63wwPCBI7ka3u\n", "Y2F8c1L/yJw=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2478 = StringFog.decrypt("Z6pIud6oPIFXpFSU1L4c\n", "Jcsm17vaefM=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2477 = StringFog.decrypt("DT3rxQipCoQ9M/fiA70g\n", "T1yFq23bT/Y=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2476 = StringFog.decrypt("vsDCly3VgLCZ1g==\n", "/KGs+Uin1tk=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2475 = StringFog.decrypt("O5Hzi9XgJ2chzfqL0+s8ZTGd+9aO7C99Npvs1o7ML302m+zzyes5\n", "WP6epaCOThM=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2474 = StringFog.decrypt("+bSpMVTepFbeoogzVQ==\n", "u9XHXzGs8j8=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2473 = StringFog.decrypt("X4iEFNWDnXlF1I0U04iGe1WEjEmOj5VjUoKbSY6bnWhLyatbzoORf2qOjE0=\n", "POfpOqDt9A0=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2472 = StringFog.decrypt("YNoEKWoutrVHzCkmbDSF\n", "IrtqRw9c4Nw=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2471 = StringFog.decrypt("J8ZtsfeaDNYA/Waqz4o9wwv9Zqo=\n", "bpMD2IPjTrc=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2470 = StringFog.decrypt("lTSnrV/+RquyIoCPU/9kp7kwuw==\n", "11XJwzqMEMI=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2469 = StringFog.decrypt("OfoT0cAAexUe7DHW1gZIEh7p\n", "e5t9v6VyLXw=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2468 = StringFog.decrypt("i9QQJy3ym+uozysuPMeA67rlFTgu/Yj3\n", "zaF8S16R6Y4=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f2467 = StringFog.decrypt("AFdaF72A7OsaC1MXqYr2sQJcR1Wpl+DtTX5CVaS95u0GXVlurYzT9gZPc1C7nun+Gg==\n", "Yzg3OcjuhZ8=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f2466 = StringFog.decrypt("NvRkKJ0OMQw=\n", "d5ArSvdrUng=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f2465 = StringFog.decrypt("kNQgge8JghSk1iiA4xKDN7/tIZHWCYMlkN4Un+EZgyA=\n", "0bpE84Bg5lI=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f2464 = StringFog.decrypt("Fm8bOF8LM28PbhMoaTojdSxvAQ==\n", "QwFyTCZKVxw=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f2463 = StringFog.decrypt("Tm57zrPaDVZZYWHfhesdTHRuYQ==\n", "GwASusqbaSU=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f2462 = StringFog.decrypt("eFnTlAf2wCU=\n", "OT2V+3WboVE=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f2461 = StringFog.decrypt("qPU24nQKZyKE6Tr1bhdSIw==\n", "65lfhxp+N1A=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f2460 = StringFog.decrypt("I1wQXtfXJm0OVjRP3NYh\n", "ZzVxObm4VRk=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f2459 = StringFog.decrypt("k6mmvYOLHIipr6C7gL40n66ZprGF\n", "2vzI1PfyXew=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f2458 = StringFog.decrypt("krJFIwOczjeBol8FB5XoIQ==\n", "9dcxbHPsoUU=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f2457 = StringFog.decrypt("xBNwOt8pX2jOE2oe+ix6f8wbRQ78KlZowAI=\n", "o3YEarNIPA0=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f2456 = StringFog.decrypt("lPzkGMS5jtCD7fk7xas=\n", "85mQVKvY6p8=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f2455 = StringFog.decrypt("y3a8l89gtw==\n", "rBPI064U1gk=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f2454 = StringFog.decrypt("BIqJuOBHsWIHqY+Q7Gm4QgaBia/zRaROEZuUmvI=\n", "Y+/9/4Eq1Cs=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f2453 = StringFog.decrypt("JZ7mYAMWxVsvnvxEJhPgTC2W1lkOEMhRMY/7UyoBw1A2\n", "QvuSMG93pj4=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f2452 = StringFog.decrypt("abS9ctCsBeBphahG1w==\n", "DtHJIaTebI4=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f2451 = StringFog.decrypt("UeCVgyc/Huhf64aDOjUY7Q==\n", "NoXh11VefYM=\n");

    public C1011(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        String version = UnityAds.getVersion();
        if (version != null) {
            return version.split(StringFog.decrypt("HQ==\n", "MD4QhSiyOk0=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2515, new C0990(this));
        hashMap.put(f2514, new C0933(this));
        hashMap.put(f2513, new C0882(this));
        hashMap.put(f2512, new C0881(this));
        hashMap.put(f2511, new C0840(this));
        hashMap.put(f2510, new C0790(this));
        hashMap.put(f2508, new C0781(this));
        hashMap.put(f2509, new C0779(this));
        hashMap.put(f2507, new C1181(this));
        hashMap.put(f2506, new C0681(this));
        hashMap.put(f2505, new C0606(this));
        hashMap.put(f2504, new C0494(this));
        hashMap.put(f2503, new C0489(this));
        hashMap.put(f2458, new C0463(this));
        hashMap.put(f2457, new C0409(this));
        hashMap.put(f2456, new C0371(this));
        hashMap.put(f2455, new C1355(this));
        hashMap.put(f2454, new C1013(this));
        hashMap.put(f2453, new C1001(this));
        hashMap.put(f2452, new C0982(this));
        hashMap.put(f2451, new C0980(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2043984616:
                if (str.equals(f2479)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -2015334886:
                if (str.equals(f2462)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -1797664962:
                if (str.equals(f2495)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1769924254:
                if (str.equals(f2466)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -1719935914:
                if (str.equals(f2474)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1673897431:
                if (str.equals(f2478)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1673719574:
                if (str.equals(f2477)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1627944928:
                if (str.equals(f2483)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1543737546:
                if (str.equals(f2502)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1347165098:
                if (str.equals(f2498)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1258512514:
                if (str.equals(f2461)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -1251710408:
                if (str.equals(f2473)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -858834302:
                if (str.equals(f2487)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -800280637:
                if (str.equals(f2482)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -618035586:
                if (str.equals(f2491)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -598903877:
                if (str.equals(f2494)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -553681069:
                if (str.equals(f2465)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -327500225:
                if (str.equals(f2496)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -324825325:
                if (str.equals(f2460)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -324012869:
                if (str.equals(f2492)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -262912338:
                if (str.equals(f2484)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -249507173:
                if (str.equals(f2467)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -133620343:
                if (str.equals(f2493)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -30759555:
                if (str.equals(f2501)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 29694293:
                if (str.equals(f2459)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 67119908:
                if (str.equals(f2468)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 252148886:
                if (str.equals(f2490)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 539301490:
                if (str.equals(f2463)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 626721475:
                if (str.equals(f2499)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 692588017:
                if (str.equals(f2472)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 819533772:
                if (str.equals(f2471)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 961427118:
                if (str.equals(f2485)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 961754217:
                if (str.equals(f2486)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f2476)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1067215379:
                if (str.equals(f2475)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1246120607:
                if (str.equals(f2497)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1326268204:
                if (str.equals(f2470)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1374920114:
                if (str.equals(f2488)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1407526303:
                if (str.equals(f2481)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1646468069:
                if (str.equals(f2469)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1658279126:
                if (str.equals(f2500)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1982491468:
                if (str.equals(f2489)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2020034237:
                if (str.equals(f2464)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 2068667541:
                if (str.equals(f2480)) {
                    c = 22;
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
                return UnityAds.class;
            case 1:
                return IUnityAdsListener.class;
            case 2:
                return IUnityAdsExtendedListener.class;
            case 3:
                return WebViewApp.class;
            case 4:
                return C1168.class;
            case 5:
                return WebRequestEvent.class;
            case 6:
                return WebViewEventCategory.class;
            case 7:
                return UnityMonetization.class;
            case '\b':
                return ShowAdListenerAdapter.class;
            case '\t':
                return CustomEvent.class;
            case '\n':
                return WebView.class;
            case 11:
                return WebRequest.class;
            case '\f':
                return AdUnitActivity.class;
            case '\r':
                return Banner.class;
            case 14:
                return UnityBanners.class;
            case 15:
                return UnityBannerSize.class;
            case 16:
                return BannerShow.class;
            case 17:
                return BannerHide.class;
            case 18:
                return BannerEvent.class;
            case 19:
                return BannerListener.class;
            case 20:
                return BannersModuleConfiguration.class;
            case 21:
                return BannerProperties.class;
            case 22:
                return BannerPosition.class;
            case 23:
                return BannerWebPlayerContainer.class;
            case 24:
                return BannerErrorCode.class;
            case 25:
                return BannerErrorInfo.class;
            case 26:
            case 27:
                return BannerView.class;
            case 28:
                return BannerViewCache.class;
            case 29:
                return IUnityBannerListener.class;
            case 30:
                return BannerView.IListener.class;
            case 31:
                return BannerView.Listener.class;
            case ' ':
            case '!':
                return com.unity3d.services.banners.view.BannerView.class;
            case '\"':
            case '#':
                return FullScreenWebViewDisplay.class;
            case '$':
                return AdObject.class;
            case '%':
                return AndroidFullscreenWebViewAdPlayer.class;
            case '&':
                return UnityAdsLoadOptions.class;
            case '\'':
                return UnityAdsBaseOptions.class;
            case '(':
                return AdFormat.class;
            case ')':
                return ClientProperties.class;
            case '*':
                return DiagnosticEventRequestOuterClass.DiagnosticEvent.class;
            case '+':
                return IUnityAdsShowListener.class;
            default:
                return null;
        }
    }
}
