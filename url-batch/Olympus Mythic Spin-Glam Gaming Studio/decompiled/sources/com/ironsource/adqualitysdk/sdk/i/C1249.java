package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.B5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.auction.AdSourceConfig;
import net.pubnative.lite.sdk.auction.Auction;
import net.pubnative.lite.sdk.auction.HyBidAdSource;
import net.pubnative.lite.sdk.auction.VastTagAdSource;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.banner.presenter.MraidAdPresenter;
import net.pubnative.lite.sdk.banner.presenter.VastAdPresenter;
import net.pubnative.lite.sdk.browser.BrowserManager;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastSender;
import net.pubnative.lite.sdk.interstitial.PNInterstitialAd;
import net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.MraidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.VastInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterDecorator;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterFactory;
import net.pubnative.lite.sdk.interstitial.presenter.MraidInterstitialPresenter;
import net.pubnative.lite.sdk.interstitial.presenter.VastInterstitialPresenter;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.AdExt;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.AdvertisingInfo;
import net.pubnative.lite.sdk.models.RemoteConfigAppInfo;
import net.pubnative.lite.sdk.models.VASTtag;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDInterstitial;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.presenter.AdPresenterDecorator;
import net.pubnative.lite.sdk.presenter.PresenterFactory;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastSender;
import net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity;
import net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterDecorator;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterFactory;
import net.pubnative.lite.sdk.rewarded.presenter.VastRewardedPresenter;
import net.pubnative.lite.sdk.views.HyBidAdView;
import net.pubnative.lite.sdk.views.HyBidBannerAdView;
import net.pubnative.lite.sdk.views.HyBidLeaderboardAdView;
import net.pubnative.lite.sdk.views.HyBidMRectAdView;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.PNAdView;
import net.pubnative.lite.sdk.views.PNBannerAdView;
import net.pubnative.lite.sdk.views.PNMRectAdView;
import net.pubnative.lite.sdk.views.PNWebView;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFiles;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.response.VastProcessor;
import net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹿ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1249 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3398 = StringFog.decrypt("IkCuncEp11suQLQ=\n", "RSXa3LFZgzQ=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3397 = StringFog.decrypt("f5jNU5xUCJ9zj8lfj1AVunI=\n", "FuufNus1evs=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3396 = StringFog.decrypt("5RQJJqnvMDzXFTEZs/8wPfMD\n", "lnF9cMCLVVM=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3395 = StringFog.decrypt("Fl4tVIBbld0f\n", "cTtZFeQR5rI=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3394 = StringFog.decrypt("/9oPS7QnSrj5yxJ8tS1c\n", "mL97CtBkON0=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3393 = StringFog.decrypt("GLme5fbQt3QL\n", "f9zqpJKG1gc=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3392 = StringFog.decrypt("8ahDLgAWRLPzhFM=\n", "ls03b2RMK90=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3391 = StringFog.decrypt("E5QNQ0z8EPEV\n", "dPF5AiixdYU=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3390 = StringFog.decrypt("edX8cQ0kqgZ7xA==\n", "HrCIMGll2XU=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3389 = StringFog.decrypt("VU9eYtJeF+tRRURQ\n", "MioqI7Yccoo=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3388 = StringFog.decrypt("4fggwezn7wvj6QHy5A==\n", "hp1UgIimnHg=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3387 = StringFog.decrypt("mN/I5piGI1Oe8sjKkA==\n", "/7q8p/zCQic=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3386 = StringFog.decrypt("NJK2h7ZYoHkyvbE=\n", "U/fCxtIcwQ0=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3385 = StringFog.decrypt("HoZYR4+Qb5QYtl5q\n", "eeMsBuvUDuA=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3384 = StringFog.decrypt("gR/NH4eGcUiHKc0siqx3eo8f1To=\n", "5nq5XuPCEDw=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3383 = StringFog.decrypt("YGfxFhEM+z5VfPASCijLMGpm4BILDN0=\n", "AxWUd2Vpr3w=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3382 = StringFog.decrypt("08kr3DkgXC7VwSzOKQJUMtM=\n", "tKxfnV1wPVw=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3381 = StringFog.decrypt("OD8I+Ncj0tQ+Nw/w1w==\n", "X1p8ubNzs6Y=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3380 = StringFog.decrypt("MB7CDZHFbN42FsUanPFowwUe0iWH8G7YAgna\n", "V3u2TPWVDaw=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3379 = StringFog.decrypt("Th1nxiwPGuxIFWDCJjs4/1scQeIsNgn7SgxG9SQ=\n", "KXgTh0hfe54=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3378 = StringFog.decrypt("/Eggy/5Cr4r6QCfc83arl9hBPenxYQ==\n", "my1UipoSzvg=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3377 = StringFog.decrypt("KlIA78cdXnYsWgfrzSl8ZT9TN8LKLlR3\n", "TTd0rqNNPwQ=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3376 = StringFog.decrypt("bJb8mT4s31dqnvuOMxjbSk2a5L0PDtJWR5r7rA==\n", "C/OI2Fp8viU=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3375 = StringFog.decrypt("fe8MJRtMxP175wshEXjm7mjuLRYTUMz8bg==\n", "Gop4ZH8cpY8=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3374 = StringFog.decrypt("SBO5++o0dvNOG74=\n", "L3bNuo5kF4E=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3373 = StringFog.decrypt("qpnVfjZGV4uOkMhLNFFxiKSfynw3UF2RqpQ=\n", "zfyhKF8iMuQ=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3372 = StringFog.decrypt("ue1fzx+E8eKd5EL6HZPX4bfrQM0Egffmt+ZM1R+T4A==\n", "3ogrmXbglI0=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3371 = StringFog.decrypt("fwPdwVmgRix2D8bsdaFfLnMywfBZuFEl\n", "GGapgjbNNk0=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3370 = StringFog.decrypt("vC2tueV39xGyPry5+H/mBLUhtpTWduU=\n", "20jZ+pcSlmU=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3369 = StringFog.decrypt("FY2YgGbP+9cXq56sadf7zxeb\n", "cujsyQijkrk=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3368 = StringFog.decrypt("n44lvRDkzUycuD6eA/TcToqOMJ8Y4dx+\n", "+OtR63GXuQ0=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3367 = StringFog.decrypt("E7DLxB35pm0yvNPsLPi3eA==\n", "dNW/iXidzww=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3366 = StringFog.decrypt("VsuhUhTqpL5S/LByD/6itFT6sHkU\n", "Ma7VAWCL0Nc=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3365 = StringFog.decrypt("uWm1Gtj3xpq9XqQ6w+PAkLtPsyzN4tuFu1i4Ock=\n", "3gzBSayWsvM=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3364 = StringFog.decrypt("U6ssFYYqPPJRvBswkSo460KrKw==\n", "NM5YQvRLTII=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3363 = StringFog.decrypt("ePNLWKqK6kB65GlOi7/bVEv3WFqKog==\n", "H5Y/D9jrmjA=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3362 = StringFog.decrypt("wsZ0Wy3cd07M1WVIPst3V9bgcn0+zX9MwOdhbD4=\n", "paMAGF+5Fjo=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f3361 = StringFog.decrypt("n2DiYRPE7S+Rc/NyANPtNotA+FQI0+M1lWD4VjfA/ig=\n", "+AWWImGhjFs=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f3360 = StringFog.decrypt("QVvoWME=\n", "CSKqMaUaEdg=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f3359 = StringFog.decrypt("MXtxzBSIpw==\n", "cB8yrXfgwgs=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f3358 = StringFog.decrypt("r3GUk3EKqGW3Y5+AUg6u\n", "+gLx4TVr3AQ=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f3357 = StringFog.decrypt("MW+E0bXQFDIXbLnCvsIAPgo=\n", "eAL0o9CjZ1s=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f3356 = StringFog.decrypt("k4V0AIxk9CCgjmQSjGU=\n", "weAFdekXgG0=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f3355 = StringFog.decrypt("flRrCT36TqN8X1YAIe8=\n", "PzA4ZkiILcY=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f3354 = StringFog.decrypt("yzb+wKFXIWDsOs7KoA==\n", "g0+8qcUWRTM=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f3353 = StringFog.decrypt("YTfMj7NqcDtTBdCOlWhy\n", "N1a/++cLF3o=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f3352 = StringFog.decrypt("/UJMtekfSg==\n", "vDcvwYBwJN8=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f3351 = StringFog.decrypt("PtbdMHL2k/8ZxNYwY+Gxyx3UxzFl/Q==\n", "fLezXheEw40=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f3350 = StringFog.decrypt("zItmzkmNKDbznHTCQ7gpFA==\n", "gfkHpy3MTGY=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f3349 = StringFog.decrypt("kuyvf+Tbq1Sh/rll0dqJ\n", "xI3cC6W/+yY=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f3348 = StringFog.decrypt("RIjGdb6ut8NnlMhlqLk=\n", "BvqpAs3LxY4=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f3347 = StringFog.decrypt("BR+d5cZ7MqYoFKz4y0Y1syEnuw==\n", "TWbfjKIyXNI=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f3346 = StringFog.decrypt("UKf7Gxk/3ut9rMoGFALZ/nScyx0cEtP+a6rrFx4T2el9rA==\n", "GN65cn12sJ8=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f3345 = StringFog.decrypt("sYTsnDCF8xGcj92BPbj0BJW/3Jo1qP4Eion9kDqo+Bc=\n", "+f2u9VTMnWU=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f3344 = StringFog.decrypt("HJOqAv5Pjyw4tJcF60a8Ow==\n", "TN3jbIoq/V8=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f3343 = StringFog.decrypt("QVDoMpCPtal8V/07so6ks21Q6DKQuKSjZ0z9I42O\n", "CD6cV+L8wcA=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f3342 = StringFog.decrypt("Oy+M+5ygDgkGKJnyvqEfExcvjPuclRsDBi6K5w==\n", "ckH4nu7TemA=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f3341 = StringFog.decrypt("MN1LNZxQn4MY3VkokW2YlhH/WDmLfJ+DGN0=\n", "fa8qXPgZ8fc=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f3340 = StringFog.decrypt("j/5YAXnwfyGr7F8cRPdqKIntTgZV8H8hqw==\n", "2Z8rdTCeC0Q=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f3339 = StringFog.decrypt("x19mYPioyqHITns47fPEpt1fPD3stoamx053PPupwbvAW35g6b7cpt9TZjemldGNwF5bIPy42rzd\nU2Yn6bHprN1TZCf8pA==\n", "qToSTojdqM8=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f3338 = StringFog.decrypt("PVBlAtC8xRoQW1Qf3YHCDxloRB/dg8IaDA==\n", "dSkna7T1q24=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f3337 = StringFog.decrypt("9OBHK+9yD3/78Vpz+ikBeO7gHXb7bEN49PFWd+xzBGXz5F8r/mQZeOzsR3yxSh9w8+F6a+tiH2Lu\n7Eds/msscu7sRWzrfg==\n", "moUzBZ8HbRE=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f3336 = StringFog.decrypt("7FdLRXd7CdXEV1lYekYOwM1kSVh6RA7V2A==\n", "oSUqLBMyZ6E=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f3335 = StringFog.decrypt("Ya/+URry0EZuvuMJD6neQXuvpAwO7JxBYb7vDRnz21xmq+ZRC+TGQXmj/gZE0dNbe4PkCw/1wVxm\nvuMeBsbRXGa84wsT\n", "D8qKf2qHsig=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f3334 = StringFog.decrypt("EyrmVvWVGuk3OOFLyJIP4AQo4UvKkhr1\n", "RUuVIrz7bow=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f3333 = StringFog.decrypt("e78=\n", "Ottj6b3u/Bk=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f3332 = StringFog.decrypt("SKv4ONdG\n", "Cc+8WaMnUJE=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f3331 = StringFog.decrypt("tEuV1rI=\n", "9S/QrsadnXg=\n");

    /* renamed from: پ, reason: contains not printable characters */
    public static final String f3330 = StringFog.decrypt("LgGD9BO+NugcAA==\n", "b2XRkWDOWYY=\n");

    /* renamed from: ٽ, reason: contains not printable characters */
    public static final String f3329 = StringFog.decrypt("5bAlqnWq5ZPNujSGabjj\n", "pNRTzwfejOA=\n");

    /* renamed from: ث, reason: contains not printable characters */
    public static final String f3328 = StringFog.decrypt("t2HbtVnuCEmLYt+9bPs7b4ti2Q==\n", "5QS22i2LSyY=\n");

    /* renamed from: ת, reason: contains not printable characters */
    public static final String f3327 = StringFog.decrypt("uOuluyYlQA==\n", "7qr271JEJ1o=\n");

    /* renamed from: ק, reason: contains not printable characters */
    public static final String f3326 = StringFog.decrypt("xbXjsi0dY1j/\n", "iOei+2lLCj0=\n");

    /* renamed from: פ, reason: contains not printable characters */
    public static final String f3325 = StringFog.decrypt("M2vkGeb1GIwbS9Yky8gfmRI=\n", "fjmlUKK8dvg=\n");

    /* renamed from: ս, reason: contains not printable characters */
    public static final String f3324 = StringFog.decrypt("Za2tEM4hYMlGmp4=\n", "KP/sWYpjAac=\n");

    /* renamed from: ո, reason: contains not printable characters */
    public static final String f3323 = StringFog.decrypt("mBQwos/CV0WtFRKUz9JdWbgED6I=\n", "2XBg0KqxMis=\n");

    /* renamed from: յ, reason: contains not printable characters */
    public static final String f3322 = StringFog.decrypt("QOEMIOQJRx9i1Qgw9QhBAw==\n", "EJNpU4FnM3o=\n");

    /* renamed from: Ն, reason: contains not printable characters */
    public static final String f3321 = StringFog.decrypt("3Eltkrzghgj1QkuevPOH\n", "lDAv+9iy438=\n");

    /* renamed from: Ԇ, reason: contains not printable characters */
    public static final String f3320 = StringFog.decrypt("d7VM/GVRnLNevmrwZUGLq16obfRyd6uhXKln42Rx\n", "P8wOlQED+cQ=\n");

    /* renamed from: Ӵ, reason: contains not printable characters */
    public static final String f3319 = StringFog.decrypt("IhDSQIvekawLG/RMi86GtAsN80ic+Ke+BA31Ww==\n", "ammQKe+M9Ns=\n");

    /* renamed from: ӟ, reason: contains not printable characters */
    public static final String f3318 = StringFog.decrypt("Z8+24PlwL8Rl2KTy7no+xUfupOLkZivUWtg=\n", "NarBgYsUSqA=\n");

    /* renamed from: Ҭ, reason: contains not printable characters */
    public static final String f3317 = StringFog.decrypt("vChbdDUUlsi+P0lmIh6HyZwLTXYzH4HV\n", "7k0sFUdw86w=\n");

    /* renamed from: Ғ, reason: contains not printable characters */
    public static final String f3316 = StringFog.decrypt("wYYPIs38JpHlgxkyz+s0g/KJCDPt\n", "l+d8Vp+ZUfA=\n");

    /* renamed from: ѵ, reason: contains not printable characters */
    public static final String f3315 = StringFog.decrypt("iSft1IcYWxeGNvCMkkNVEJMnt4mTBhcLgjX4iJMIXVeGIe2TgQRNAMkK4LieCWsckCPrnpIJeBqT\nK++TgxQ=\n", "50KZ+vdtOXk=\n");

    /* renamed from: п, reason: contains not printable characters */
    public static final String f3314 = StringFog.decrypt("WkRapol1IPJzT3yqiWYm8XtLcbuU\n", "Ej0Yz+0nRYU=\n");

    /* renamed from: н, reason: contains not printable characters */
    public static final String f3313 = StringFog.decrypt("bq/95Uo2orxhvuC9X22su3Svp7heKO6gZb3ouV4mpPxhqf2iTCq0qy6c6LhOEaWlYbjtrl4Co6Zp\nvOC/Qw==\n", "AMqJyzpDwNI=\n");

    /* renamed from: У, reason: contains not printable characters */
    public static final String f3312 = StringFog.decrypt("R5szv5nHVmtjniWvisFVY2eTNLI=\n", "EfpAy8uiIQo=\n");

    /* renamed from: С, reason: contains not printable characters */
    public static final String f3311 = StringFog.decrypt("GcNMPUTNZo0=\n", "SY0NWRKkA/o=\n");

    /* renamed from: Ϲ, reason: contains not printable characters */
    public static final String f3310 = StringFog.decrypt("kIk20KSjLAexlQM=\n", "2PB0ucDiSFE=\n");

    /* renamed from: ϵ, reason: contains not printable characters */
    public static final String f3309 = StringFog.decrypt("ewJH+BaN0qpdHnfQFpnaoUQ=\n", "M3sFkXLPs8Q=\n");

    /* renamed from: ϯ, reason: contains not printable characters */
    public static final String f3308 = StringFog.decrypt("oR3gfW7CNBeNAdB2Ze8jEqgA9H1v+Q==\n", "6WSiFAqOUXY=\n");

    /* renamed from: Ϯ, reason: contains not printable characters */
    public static final String f3307 = StringFog.decrypt("y46D/F6R1rDgg4DxbLXhog==\n", "g/fBlTrchNU=\n");

    /* renamed from: ϝ, reason: contains not printable characters */
    public static final String f3306 = StringFog.decrypt("zkL9kKEvwPHqadK0oQLJ8Mhl2bc=\n", "ngy8wOhsr58=\n");

    /* renamed from: ϙ, reason: contains not printable characters */
    public static final String f3305 = StringFog.decrypt("LmqZLyk/QHg/QI0nIiY=\n", "fiTbTkdRJQo=\n");

    /* renamed from: Λ, reason: contains not printable characters */
    public static final String f3304 = StringFog.decrypt("0FoSuT/9JqHkQjaOLQ==\n", "gBRf61qeUuA=\n");

    /* renamed from: Κ, reason: contains not printable characters */
    public static final String f3303 = StringFog.decrypt("Z4exgqQJ5jZA\n", "N8nm58Zfj1M=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3302 = StringFog.decrypt("K/scGb4xSQ==\n", "fZJ4fNFwLXI=\n");

    /* renamed from: ʜ, reason: contains not printable characters */
    public static final String f3301 = StringFog.decrypt("ritZT9/Khv6RMUlP3u6Q\n", "+EI9KrCL4rI=\n");

    /* renamed from: Ȳ, reason: contains not printable characters */
    public static final String f3300 = StringFog.decrypt("efbGo8bYTThG+tU=\n", "L5+ixqmZKW4=\n");

    /* renamed from: ȝ, reason: contains not printable characters */
    public static final String f3299 = StringFog.decrypt("b5q4aTkAeVhciLhyGw==\n", "OfvLHWlyFjs=\n");

    /* renamed from: ƈ, reason: contains not printable characters */
    public static final String f3298 = StringFog.decrypt("yLc2S4YdN3r+tA==\n", "mNtXMuNvfhQ=\n");

    /* renamed from: Ɔ, reason: contains not printable characters */
    public static final String f3297 = StringFog.decrypt("ClUemRM8p3InXi+EHgGgZy5tOLweBr1jLEku\n", "Qixc8Hd1yQY=\n");

    /* renamed from: Ť, reason: contains not printable characters */
    public static final String f3296 = StringFog.decrypt("27eM+rGcFzzyvKr2sY8WB/q9uva7qwA=\n", "k87Ok9XOcks=\n");

    /* renamed from: ţ, reason: contains not printable characters */
    public static final String f3295 = StringFog.decrypt("D+NUEid12QMu/2E3KkfJMCn/ZA==\n", "R5oWe0M0vVU=\n");

    /* renamed from: ō, reason: contains not printable characters */
    public static final String f3294 = StringFog.decrypt("BMMyRzLUvGo0zQ1dItS9TiI=\n", "UIFkLlax0ys=\n");

    /* renamed from: Ł, reason: contains not printable characters */
    public static final String f3293 = StringFog.decrypt("q3jtZWkekCs=\n", "6hy9BBt//Vg=\n");

    /* renamed from: Ĵ, reason: contains not printable characters */
    public static final String f3292 = StringFog.decrypt("Rjus82KLBdFiPaXoRJY9xGMm\n", "EFLJhCHka6U=\n");

    /* renamed from: ﾓ, reason: contains not printable characters */
    public static final String f3417 = StringFog.decrypt("WDtDlJ4r+AJhPFODngbwJHw=\n", "DlIn8fFqnEE=\n");

    /* renamed from: ﾊ, reason: contains not printable characters */
    public static final String f3416 = StringFog.decrypt("FA+XK75Op7IhDYA=\n", "QmbzTtENy9s=\n");

    /* renamed from: ﾁ, reason: contains not printable characters */
    public static final String f3415 = StringFog.decrypt("mSpE7bIW+Y21M0rm\n", "2kYtjtlCkf8=\n");

    /* renamed from: ｽ, reason: contains not printable characters */
    public static final String f3414 = StringFog.decrypt("mfIRbTqiMo+59RFgNg==\n", "2p54DlH2QO4=\n");

    /* renamed from: ｹ, reason: contains not printable characters */
    public static final String f3413 = StringFog.decrypt("Dkl6pQpwS/Ij\n", "TSYX1WseIp0=\n");

    /* renamed from: ｸ, reason: contains not printable characters */
    public static final String f3412 = StringFog.decrypt("o20pfup8LY2OQyB9\n", "4AJEDosSROI=\n");

    /* renamed from: ｷ, reason: contains not printable characters */
    public static final String f3411 = StringFog.decrypt("Vy03dzVcgop6ATZuN1m/jWYtL2A8\n", "FEJaB1Qy6+U=\n");

    /* renamed from: ｳ, reason: contains not printable characters */
    public static final String f3410 = StringFog.decrypt("5rHEzNqwj/TLncXV2LWy6cS9wtXVuQ==\n", "pd6pvLve5ps=\n");

    /* renamed from: ｦ, reason: contains not printable characters */
    public static final String f3409 = StringFog.decrypt("vCQj/fg+FKM=\n", "/1ZGnIxXYsY=\n");

    /* renamed from: ｓ, reason: contains not printable characters */
    public static final String f3408 = StringFog.decrypt("uIx5+qe/McKI\n", "+/4cm9PWR6c=\n");

    /* renamed from: ｒ, reason: contains not printable characters */
    public static final String f3407 = StringFog.decrypt("HOgI/RCV\n", "VYZElH7w5eA=\n");

    /* renamed from: ｎ, reason: contains not printable characters */
    public static final String f3406 = StringFog.decrypt("KpAfXhNOY4MJgw9P\n", "fPFsKlIqMOw=\n");

    /* renamed from: ｌ, reason: contains not printable characters */
    public static final String f3405 = StringFog.decrypt("p9sUA2ryBvOP\n", "6r5wagu0b58=\n");

    /* renamed from: Ｉ, reason: contains not printable characters */
    public static final String f3404 = StringFog.decrypt("eoLyYWA4qOFSlA==\n", "N+eWCAF+wY0=\n");

    /* renamed from: Ｆ, reason: contains not printable characters */
    public static final String f3403 = StringFog.decrypt("d3b03oH/LmZXbeDYi/k=\n", "JAKVquicfAM=\n");

    /* renamed from: ﻢ, reason: contains not printable characters */
    public static final String f3402 = StringFog.decrypt("bHAleg==\n", "OhFWDr4xLCI=\n");

    /* renamed from: ﻌ, reason: contains not printable characters */
    public static final String f3401 = StringFog.decrypt("kn668CCDSw==\n", "xQzbgFDmOc0=\n");

    /* renamed from: ﻋ, reason: contains not printable characters */
    public static final String f3400 = StringFog.decrypt("Pjl7Jv3OBqwPLXo7\n", "aHgocryqUs0=\n");

    /* renamed from: ﺧ, reason: contains not printable characters */
    public static final String f3399 = StringFog.decrypt("CKrCU5o7ZAwbudVTgyE=\n", "S9inMu5SEmk=\n");

    public C1249(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        return HyBid.getHyBidVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3398, new C0855(this));
        hashMap.put(f3397, new C0510(this));
        hashMap.put(f3396, new C0382(this));
        hashMap.put(f3395, new C0378(this));
        hashMap.put(f3394, new C0376(this));
        hashMap.put(f3393, new C0367(this));
        hashMap.put(f3392, new C0365(this));
        hashMap.put(f3391, new C1292(this));
        hashMap.put(f3390, new C1269(this));
        hashMap.put(f3389, new C1012(this));
        hashMap.put(f3388, new C0997(this));
        hashMap.put(f3387, new C0989(this));
        hashMap.put(f3386, new C0978(this));
        hashMap.put(f3385, new C0960(this));
        hashMap.put(f3384, new C0917(this));
        hashMap.put(f3383, new C0886(this));
        hashMap.put(f3382, new C0862(this));
        hashMap.put(f3381, new C0859(this));
        hashMap.put(f3380, new C0857(this));
        hashMap.put(f3379, new C0842(this));
        hashMap.put(f3378, new C0778(this));
        hashMap.put(f3377, new C0753(this));
        hashMap.put(f3376, new C0745(this));
        hashMap.put(f3375, new C0722(this));
        hashMap.put(f3374, new C0674(this));
        hashMap.put(f3373, new C0656(this));
        hashMap.put(f3372, new C0655(this));
        hashMap.put(f3371, new C0626(this));
        hashMap.put(f3370, new C0604(this));
        hashMap.put(f3369, new C0445(this));
        hashMap.put(f3368, new C0415(this));
        hashMap.put(f3367, new C0411(this));
        hashMap.put(f3366, new C0410(this));
        hashMap.put(f3365, new C0402(this));
        hashMap.put(f3364, new C0401(this));
        hashMap.put(f3363, new C0396(this));
        hashMap.put(f3362, new C0387(this));
        hashMap.put(f3361, new C0384(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2115104349:
                if (str.equals(f3300)) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case -2101083431:
                if (str.equals(f3407)) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case -2095699225:
                if (str.equals(f3334)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -2049897434:
                if (str.equals(f3416)) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case -2030915791:
                if (str.equals(f3313)) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case -2022878658:
                if (str.equals(f3356)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1973009238:
                if (str.equals(f3406)) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -1867123455:
                if (str.equals(f3315)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1758764491:
                if (str.equals(f3399)) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case -1741983831:
                if (str.equals(f3293)) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case -1692490108:
                if (str.equals(f3408)) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case -1668741680:
                if (str.equals(f3340)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1474059205:
                if (str.equals(f3303)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -1454339106:
                if (str.equals(f3345)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1305745411:
                if (str.equals(f3321)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1042733280:
                if (str.equals(f3355)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1040143378:
                if (str.equals(f3350)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1034806157:
                if (str.equals(f3401)) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case -1007287447:
                if (str.equals(f3314)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case -917597044:
                if (str.equals(f3337)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -889171374:
                if (str.equals(f3336)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -844922724:
                if (str.equals(f3326)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -801627293:
                if (str.equals(f3324)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -747024196:
                if (str.equals(f3319)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -729230458:
                if (str.equals(f3299)) {
                    c = B5.U;
                    break;
                }
                c = 65535;
                break;
            case -709708726:
                if (str.equals(f3354)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -617879491:
                if (str.equals(f3415)) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case -594285390:
                if (str.equals(f3301)) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -589715152:
                if (str.equals(f3306)) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -587420703:
                if (str.equals(f3400)) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case -567645543:
                if (str.equals(f3308)) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -520974940:
                if (str.equals(f3330)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -514201671:
                if (str.equals(f3349)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -385055469:
                if (str.equals(f3404)) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case -348198615:
                if (str.equals(f3411)) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case -242952691:
                if (str.equals(f3344)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -232966702:
                if (str.equals(f3329)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -217201711:
                if (str.equals(f3296)) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case -205981873:
                if (str.equals(f3298)) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -150968480:
                if (str.equals(f3405)) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case -133293208:
                if (str.equals(f3295)) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case -114588646:
                if (str.equals(f3417)) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f3333)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 2658924:
                if (str.equals(f3402)) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case 22955995:
                if (str.equals(f3304)) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 63078110:
                if (str.equals(f3331)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 70165004:
                if (str.equals(f3360)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 152629510:
                if (str.equals(f3311)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 254077974:
                if (str.equals(f3323)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 271735736:
                if (str.equals(f3358)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 282218207:
                if (str.equals(f3343)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 287435653:
                if (str.equals(f3348)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 353872196:
                if (str.equals(f3357)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 378666444:
                if (str.equals(f3353)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 424904237:
                if (str.equals(f3292)) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case 441957133:
                if (str.equals(f3307)) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 476474561:
                if (str.equals(f3339)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 482776408:
                if (str.equals(f3346)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 485976319:
                if (str.equals(f3359)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 504900231:
                if (str.equals(f3338)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 591135468:
                if (str.equals(f3413)) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 606183598:
                if (str.equals(f3342)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 676623548:
                if (str.equals(f3403)) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case 767767497:
                if (str.equals(f3312)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 789926062:
                if (str.equals(f3351)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 862687632:
                if (str.equals(f3317)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 956069326:
                if (str.equals(f3327)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1002796579:
                if (str.equals(f3352)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1044987291:
                if (str.equals(f3347)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1150879268:
                if (str.equals(f3412)) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case 1164559907:
                if (str.equals(f3325)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1199380782:
                if (str.equals(f3316)) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1228519789:
                if (str.equals(f3335)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1241891335:
                if (str.equals(f3328)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1250739860:
                if (str.equals(f3310)) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 1296210799:
                if (str.equals(f3297)) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 1373883333:
                if (str.equals(f3341)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1402445010:
                if (str.equals(f3305)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 1506578400:
                if (str.equals(f3309)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1521679714:
                if (str.equals(f3322)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1607572150:
                if (str.equals(f3320)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1877773523:
                if (str.equals(f3410)) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case 1885066191:
                if (str.equals(f3409)) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case 1955369613:
                if (str.equals(f3332)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1969459009:
                if (str.equals(f3318)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 2079062148:
                if (str.equals(f3294)) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 2107600959:
                if (str.equals(f3414)) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case 2117435870:
                if (str.equals(f3302)) {
                    c = ':';
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
                return HyBid.class;
            case 1:
                return AdCache.class;
            case 2:
                return UserDataManager.class;
            case 3:
                return ImpressionManager.class;
            case 4:
                return RequestManager.class;
            case 5:
                return AdSourceConfig.class;
            case 6:
                return HyBidAdSource.class;
            case 7:
                return VastTagAdSource.class;
            case '\b':
                return Auction.class;
            case '\t':
                return BannerPresenterFactory.class;
            case '\n':
                return MraidAdPresenter.class;
            case 11:
                return VastAdPresenter.class;
            case '\f':
                return BrowserManager.class;
            case '\r':
                return HyBidInterstitialAd.class;
            case 14:
                return HyBidInterstitialBroadcastReceiver.class;
            case 15:
                return HyBidInterstitialBroadcastSender.class;
            case 16:
                return PNInterstitialAd.class;
            case 17:
                return InterstitialPresenterDecorator.class;
            case 18:
                return InterstitialPresenterFactory.class;
            case 19:
                return MraidInterstitialPresenter.class;
            case 20:
                return VastInterstitialPresenter.class;
            case 21:
            case 22:
                return HyBidInterstitialActivity.class;
            case 23:
            case 24:
                return MraidInterstitialActivity.class;
            case 25:
            case 26:
                return VastInterstitialActivity.class;
            case 27:
                return Ad.class;
            case 28:
                return AdData.class;
            case 29:
                return AdExt.class;
            case 30:
                return AdResponse.class;
            case 31:
                return AdvertisingInfo.class;
            case ' ':
                return RemoteConfigAppInfo.class;
            case '!':
                return VASTtag.class;
            case '\"':
                return MRAIDView.class;
            case '#':
                return MRAIDInterstitial.class;
            case '$':
                return MRAIDBanner.class;
            case '%':
                return AdPresenterDecorator.class;
            case '&':
                return PresenterFactory.class;
            case '\'':
                return HyBidRewardedAd.class;
            case '(':
                return HyBidRewardedBroadcastReceiver.class;
            case ')':
                return HyBidRewardedBroadcastSender.class;
            case '*':
                return RewardedPresenterDecorator.class;
            case '+':
                return RewardedPresenterFactory.class;
            case ',':
                return VastRewardedPresenter.class;
            case '-':
            case '.':
                return HyBidRewardedActivity.class;
            case '/':
            case '0':
                return VastRewardedActivity.class;
            case '1':
                return PNAdView.class;
            case '2':
                return HyBidAdView.class;
            case '3':
                return HyBidBannerAdView.class;
            case '4':
                return HyBidLeaderboardAdView.class;
            case '5':
                return HyBidMRectAdView.class;
            case '6':
                return PNAPIContentInfoView.class;
            case '7':
                return PNBannerAdView.class;
            case '8':
                return PNMRectAdView.class;
            case '9':
                return PNWebView.class;
            case ':':
                return VideoAd.class;
            case ';':
                return VideoAdListener.class;
            case '<':
                return VideoAdView.class;
            case '=':
                return VastProcessor.class;
            case '>':
                return PlayerInfo.class;
            case '?':
                return HyBidInterstitialAd.Listener.class;
            case '@':
                return HyBidRewardedAd.Listener.class;
            case 'A':
                return HyBidAdView.Listener.class;
            case 'B':
                return C1260.class;
            case 'C':
                return AdParams.class;
            case 'D':
                return ViewControllerVast.class;
            case 'E':
                return VideoAdController.class;
            case 'F':
                return VideoClicks.class;
            case 'G':
                return ClickThrough.class;
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                return ClickTracking.class;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                return Companion.class;
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return CompanionAds.class;
            case 'K':
                return CompanionClickThrough.class;
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                return CompanionClickTracking.class;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                return Creative.class;
            case 'N':
                return Creatives.class;
            case 'O':
                return InLine.class;
            case 'P':
                return VastAdSource.class;
            case 'Q':
                return MediaFile.class;
            case 'R':
                return MediaFiles.class;
            case 'S':
                return StaticResource.class;
            case 'T':
                return Vast.class;
            case 'U':
                return Wrapper.class;
            case 'V':
                return VASTAdTagURI.class;
            case 'W':
                return CreativeParams.class;
            default:
                return null;
        }
    }
}
