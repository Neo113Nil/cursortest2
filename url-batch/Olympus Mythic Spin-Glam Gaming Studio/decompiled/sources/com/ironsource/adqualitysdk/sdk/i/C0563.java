package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.B5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.smaato.sdk.banner.injections.BannerModuleInterface;
import com.smaato.sdk.banner.model.BannerAdRequest;
import com.smaato.sdk.banner.model.soma.BannerSomaRemoteSource;
import com.smaato.sdk.banner.view.BannerViewDelegate;
import com.smaato.sdk.banner.viewmodel.BannerViewModel;
import com.smaato.sdk.banner.widget.BannerView;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.ad.AdInteractor;
import com.smaato.sdk.core.ad.AdObject;
import com.smaato.sdk.core.ad.AdPresenter;
import com.smaato.sdk.core.ad.BannerAdPresenter;
import com.smaato.sdk.core.ad.BaseAdPresenter;
import com.smaato.sdk.core.ad.InterstitialAdPresenter;
import com.smaato.sdk.core.ad.RewardedAdPresenter;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity;
import com.smaato.sdk.core.framework.SimpleModuleInterface;
import com.smaato.sdk.core.mvvm.injections.MvvmCommonInterface;
import com.smaato.sdk.core.mvvm.model.AdRequest;
import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.mvvm.model.AdResponseParser;
import com.smaato.sdk.core.mvvm.model.imagead.ImageAdContentView;
import com.smaato.sdk.core.mvvm.model.imagead.ImageAdResponseParser;
import com.smaato.sdk.core.mvvm.model.soma.SomaAdRequest;
import com.smaato.sdk.core.mvvm.model.soma.SomaRemoteSource;
import com.smaato.sdk.core.mvvm.model.video.VideoResourceCache;
import com.smaato.sdk.core.mvvm.model.video.VideoWrappedInRichMediaAdResponseParser;
import com.smaato.sdk.core.mvvm.view.SmaatoSdkViewDelegate;
import com.smaato.sdk.core.mvvm.viewmodel.SmaatoSdkViewModel;
import com.smaato.sdk.core.ui.AdContentView;
import com.smaato.sdk.core.ui.WatermarkImageButton;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.interstitial.AdEvent;
import com.smaato.sdk.interstitial.DiInterstitial;
import com.smaato.sdk.interstitial.InterstitialAd;
import com.smaato.sdk.interstitial.InterstitialAdActivity;
import com.smaato.sdk.interstitial.InterstitialAdBase;
import com.smaato.sdk.interstitial.InterstitialBase;
import com.smaato.sdk.interstitial.InterstitialServerAdFormatResolvingFunction;
import com.smaato.sdk.interstitial.ad.InterstitialAdLoaderPlugin;
import com.smaato.sdk.interstitial.framework.InterstitialModuleInterface;
import com.smaato.sdk.interstitial.model.InterstitialAdRequest;
import com.smaato.sdk.interstitial.model.soma.InterstitialSomaRemoteSource;
import com.smaato.sdk.interstitial.view.InterstitialAdBaseDelegate;
import com.smaato.sdk.interstitial.view.InterstitialAdDelegate;
import com.smaato.sdk.interstitial.viewmodel.EventListenerNotifications;
import com.smaato.sdk.interstitial.viewmodel.EventListenerNotificationsInterface;
import com.smaato.sdk.interstitial.viewmodel.InterstitialAdBaseViewModel;
import com.smaato.sdk.interstitial.viewmodel.InterstitialAdViewModel;
import com.smaato.sdk.rewarded.EventListener;
import com.smaato.sdk.rewarded.injections.RewardedAdsModuleInterface;
import com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository;
import com.smaato.sdk.rewarded.view.RewardedAdDelegate;
import com.smaato.sdk.rewarded.viewmodel.RewardedAdEventListenerNotifications;
import com.smaato.sdk.rewarded.viewmodel.RewardedAdViewModel;
import com.smaato.sdk.rewarded.widget.RewardedInterstitialAdActivity;
import com.smaato.sdk.richmedia.ad.RichMediaAdObject;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.video.ad.InterstitialVideoAdPresenter;
import com.smaato.sdk.video.ad.RewardedVideoAdPresenter;
import com.smaato.sdk.video.ad.VastParsingResult;
import com.smaato.sdk.video.vast.model.Advertiser;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;
import com.smaato.sdk.video.vast.model.VideoClicks;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;
import com.smaato.sdk.video.vast.player.VastVideoPlayerPresenter;
import com.smaato.sdk.video.vast.player.VideoPlayer;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayer;
import com.smaato.sdk.video.vast.vastplayer.VideoPlayer;
import com.smaato.sdk.video.vast.widget.companion.CompanionPresenterImpl;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenterImpl;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ї, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0563 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f919 = StringFog.decrypt("3y1wLD+H5jjLIGEOA4E=\n", "uEgEfErlilE=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f918 = StringFog.decrypt("wtioGr6A3rjG2JU/\n", "pb3cW9rTrtk=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f916 = StringFog.decrypt("iI9M5AvMBlWAhHHT\n", "7+o4t26/dTw=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f915 = StringFog.decrypt("FctZ83ZnBKgb2Ej5YA==\n", "cq4tsAQCZdw=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f913 = StringFog.decrypt("36SYn6Jj5PrWqIOyjmL9+NOVhK6ie/Pz\n", "uMHs3M0OlJs=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f912 = StringFog.decrypt("n2VN6+7MOgadYVrS4eo8KA==\n", "+AA5vY+/TkQ=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f911 = StringFog.decrypt("3NdJNjTO67zJ5FQRIuHhisvTXhEcxA==\n", "u7I9dFWghdk=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f910 = StringFog.decrypt("Uuz8SLLO4mBQ7eF7msnFT1/s626YwuRZUOf8\n", "NYmIGtutii0=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f909 = StringFog.decrypt("iu7nO3LuNliK//oGdfs/fJDv9h1d/gNYnPj2HGj/IWaQ+OcXcv8h\n", "+YuTchyaUyo=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f908 = StringFog.decrypt("xIZZ6WHLRebFtUTOd+Bd5tmXYcJz0U7t0pE=\n", "t+MtqwClK4M=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f907 = StringFog.decrypt("JG4ieOHobNIJYzVf8Od9xQ==\n", "RQpGK5WJGLc=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f906 = StringFog.decrypt("o51YgpcNspiqi0mSnRq7\n", "xPgs0PJ+wvc=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f905 = StringFog.decrypt("U3svtpQMw2BabT6ngxrSe11oPq2V\n", "NB5b5PF/sw8=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f904 = StringFog.decrypt("Y6qcdZ5It01b\n", "MMf9FOon5Ck=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f903 = StringFog.decrypt("cXR6+xs5/HhMc2/yKC7JckxzePcdMw==\n", "OBoOnmlKiBE=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f902 = StringFog.decrypt("Oz1dnZHMU60sPR7AhsocpTYmVcGR1Vu4MTNcnavPRqkqIUTalshToBk2cdCWyESlLCs=\n", "WFIws+KhMsw=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f901 = StringFog.decrypt("XLbr9jdO6ldHvejyN1n7Wnq6/fsETs5Qerrq/jFT\n", "DtOcl0UqjzM=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f900 = StringFog.decrypt("sYe1OoMXKj+mh/ZnlBFlLLefuWaUHy9wpYG8c5UOZQy3n7lmlB8vF7ycvWaDDiIqu4m0VZQ7KCq7\nnrFgiQ==\n", "0ujYFPB6S14=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f899 = StringFog.decrypt("N2zvgmG08ykPQ/yMYqjFPyVi+opjstQ0\n", "ZAGO4xXboE0=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f898 = StringFog.decrypt("ecx7dTdmHTZuzDgoIGBSNHXRc3UmeRMgacZkdRdmHTZuzEU/L0kOOG3QcykFaAg+bMpiIg==\n", "GqMWW0QLfFc=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f897 = StringFog.decrypt("xE3+gevC8vHjWw==\n", "hiyQ746wpJg=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f896 = StringFog.decrypt("M9Lx6/RyPHok0rK243RzeTHT8qD1MSpyNNr5saldPHU+2O6T7noq\n", "UL2cxYcfXRs=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f895 = StringFog.decrypt("xwQ7RuxFTq3yNhFM9Q==\n", "hmB4KYIxK8M=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f894 = StringFog.decrypt("w+I82ZC05+bwyjvysr/36v//Cdi4pg==\n", "kYtfsd3Rg48=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f893 = StringFog.decrypt("+Pn65f/ZC/rF/u/szM4v4dTk6+75zw0=\n", "sZeOgI2qf5M=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f892 = StringFog.decrypt("VazuddT+iQtoq/t85+mtEHmx/37S6I8udbHudcjojw==\n", "HMKaEKaN/WI=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f891 = StringFog.decrypt("Cc1U45hbIdk0ykHqq0w=\n", "QKMghuooVbA=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f890 = StringFog.decrypt("1ojgueHYpdTrj/WwwM6jy/qU1bjVxKPQ/pLGueDEvcv2iPOa5sWyyfaJ+g==\n", "n+aU3JOr0b0=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f889 = StringFog.decrypt("36M4vPbfTw==\n", "nsd9ypOxO5Q=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f888 = StringFog.decrypt("5K+kt1KgaDrZqLG+YbdQPMyltaBwv2k0xK8=\n", "rcHQ0iDTHFM=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f887 = StringFog.decrypt("nkingjw+QEauSJqFKTc=\n", "2iHu7EhbMjU=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f886 = StringFog.decrypt("6BigJIYuZUjVH7UtuTJ1VM0TnS+AOGNHwBWx\n", "oXbUQfRdESE=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f885 = StringFog.decrypt("uU0HY0BIulCMTCU=\n", "+ClXESU73z4=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f884 = StringFog.decrypt("JYY2aVRWHRcYgSNgcEwNGwOpJlxUQBobApwnfg==\n", "bOhCDCYlaX4=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f883 = StringFog.decrypt("IKcwT0ndq9gZli9aZtG9\n", "dsZDOx+0z70=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f882 = StringFog.decrypt("1Es0gfC157jteiuU37nxjfBPNJDIqOav\n", "gipH9abcg90=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f881 = StringFog.decrypt("bR8ZLPGURDZaDwsI+JhwNkw=\n", "PmZqWJT5CVM=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f880 = StringFog.decrypt("pG2bgFPgj96LYY0=\n", "8gT/5Tyw478=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f879 = StringFog.decrypt("jf89ntEvCB2k2jKIxjMFFLM=\n", "wZZb+7JWa3E=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f878 = StringFog.decrypt("lD3UA070ugS5AssWXP+9H7Ig8B5f9g==\n", "11K5cy+a02s=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f877 = StringFog.decrypt("OksxcxmmH4cJRDZXLq8JjwJeJ3UVpwqG\n", "bCpCB1zKeuo=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f876 = StringFog.decrypt("r/PyqbG1bzCY/OiynIlhJZfz87Sd\n", "+ZKB3fLaAkA=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f875 = StringFog.decrypt("ijjLaLZOyBK5N8xMgUfeGrIt3W4=\n", "3Fm4HPMirX8=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f874 = StringFog.decrypt("SWeR/BBK1Jt8ZYY=\n", "Hw71mX8JuPI=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f873 = StringFog.decrypt("TlTNXWrUv713Ww==\n", "GDW+KSix3t4=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f872 = StringFog.decrypt("hnO66pRd+B2kY5z2\n", "xxfzhOA4inw=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f871 = StringFog.decrypt("21YAwNZNN8HgSw/R\n", "iCJhtLMAVqI=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f870 = StringFog.decrypt("sTQKnjs+n42KKQWPEhqNmocuDpg=\n", "4kBr6l5z/u4=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f869 = StringFog.decrypt("4nF7mkRqRm0=\n", "rxQP+yALMgw=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f868 = StringFog.decrypt("El0VbyGxAcwBXDF8LawBxjRdE1wtrwvbKUwOfDE=\n", "QDhhDkjfZKg=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f867 = StringFog.decrypt("eiKl8OhG3aZpI4Lj/1HdrFwioA==\n", "KEfSkZoiuMI=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f866 = StringFog.decrypt("QT/l8n01LDZFM/b2YBAtAmE/4fZhJSwg\n", "E1qSkw9RSVI=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f865 = StringFog.decrypt("vV3xXHAv1eo=\n", "/Dm+PhpKtp4=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f864 = StringFog.decrypt("zvZXUKTCLbPy3k5UscoOtO3jTFs=\n", "mZcjNdavTME=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f863 = StringFog.decrypt("uS0GbnAPLnOeOy12cBMMVpI/HGV7GAo=\n", "+0xoABV9eBo=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f862 = StringFog.decrypt("uWoQSe9Yw8+KQhduwFfCxZ8=\n", "6wNzIaI9p6Y=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f861 = StringFog.decrypt("0Gl1oiTZV5H3e2OpEdh1\n", "kggGx2W9B+M=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f860 = StringFog.decrypt("m1qoviELo/CJSaOjIReW8as=\n", "2TvG0ER54pQ=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f859 = StringFog.decrypt("GZjzvbQO9Nwoh/SPtQ==\n", "WOia/NBcka8=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f858 = StringFog.decrypt("g487WiFxkbSXniZnJmSYh4CoLmAqRJCVlIssdgZh\n", "5OpPE08F9MY=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f857 = StringFog.decrypt("C3iFVPrsoNAfaZhp/fmp4whfkG7xy6DRH3Sec938\n", "bB3xHZSYxaI=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f856 = StringFog.decrypt("jLPNZ1plM8aYotBaXXA69Y+U2F1RUiTRiqLQWFFYMg==\n", "69a5LjQRVrQ=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f855 = StringFog.decrypt("rInZnAgFdCS7g8OuCRR9PqiH+K8A\n", "y+yt3WxXEVc=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f854 = StringFog.decrypt("bwXDhtCjCVd4D9m00bgBRW8F4rXY\n", "CGC3x7TxbCQ=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f853 = StringFog.decrypt("tU88dAQYn+yiRSZGBRiT/LpnLVEJK7nwvF4tWxQ=\n", "0ipINWBK+p8=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f852 = StringFog.decrypt("wPeJJmHib7DX/ZMUYOZrsNPdnw1g034=\n", "p5L9ZwWwCsM=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f851 = StringFog.decrypt("vtgHpWKYGCOp0h2XY4kRObrWJ5ZnqRY5t9omlmq5\n", "2b1z5AbKfVA=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f850 = StringFog.decrypt("7mqxD3Ip7En5YKs9czLkSvtqtj1/FOdu+26mJX8V7m/7Y7Y=\n", "iQ/FThZ7iTo=\n");

    /* renamed from: پ, reason: contains not printable characters */
    public static final String f849 = StringFog.decrypt("Z1mQhNS7lBVjWYqzx6GP\n", "ADzk0rXI4EY=\n");

    /* renamed from: ٽ, reason: contains not printable characters */
    public static final String f848 = StringFog.decrypt("hSgngwz2AdiNICO0A+wa9bEuNrsM9xz0\n", "4k1T1W2FdZs=\n");

    /* renamed from: ث, reason: contains not printable characters */
    public static final String f847 = StringFog.decrypt("WZ7J5ubAXB5dntPR9dpHH1uI0sX10E0JX4/c\n", "Pvu9sIezKE0=\n");

    /* renamed from: ת, reason: contains not printable characters */
    public static final String f846 = StringFog.decrypt("xv0VWgxiCSPCygR6F3YPKcQ=\n", "oZhhCXgDfUo=\n");

    /* renamed from: ק, reason: contains not printable characters */
    public static final String f845 = StringFog.decrypt("j4LREd8PsTKLtcAxxBu3OI2y1ys=\n", "6OelQqtuxVs=\n");

    /* renamed from: פ, reason: contains not printable characters */
    public static final String f844 = StringFog.decrypt("Vx3NkkGDuGlTHdelUpmjeUId2LBJhql+UQzY\n", "MHi5xCDwzDo=\n");

    /* renamed from: ս, reason: contains not printable characters */
    public static final String f843 = StringFog.decrypt("MXCA/sgCLuU1cJrJ2xg19SRwldzABz/yN2GV4c0=\n", "VhX0qKlxWrY=\n");

    /* renamed from: ո, reason: contains not printable characters */
    public static final String f842 = StringFog.decrypt("1ufmSNHJPYnS5/x/wtMmmcPn82rZzCye0PbzX9TzLQ==\n", "sYKSHrC6Sdo=\n");

    /* renamed from: յ, reason: contains not printable characters */
    public static final String f841 = StringFog.decrypt("Q95bt7DPvZlB30aAl9WlsXfYSo+wzqC7\n", "JLsv4dG8ydQ=\n");

    /* renamed from: Ն, reason: contains not printable characters */
    public static final String f840 = StringFog.decrypt("eEkUfdArvXRcQAlI0jw=\n", "HyxgK7lP2Bs=\n");

    /* renamed from: Ԇ, reason: contains not printable characters */
    public static final String f839 = StringFog.decrypt("lmqn4T6MhLKyY7rUPLyJr556tN8VjYC+nmE=\n", "8Q/Tt1fo4d0=\n");

    /* renamed from: Ӵ, reason: contains not printable characters */
    public static final String f838 = StringFog.decrypt("u53aDQTgb2eflMc4BvdJZLWbxQ8f5WljtZbJFwT3fg==\n", "3PiuW22ECgg=\n");

    /* renamed from: ӟ, reason: contains not printable characters */
    public static final String f837 = StringFog.decrypt("+AJ3r1DLu4vxMnGE\n", "n2cD7TWq2OQ=\n");

    /* renamed from: Ҭ, reason: contains not printable characters */
    public static final String f836 = StringFog.decrypt("RSuh+Afggz1SK7HrBtKUKlg6mcMR44chUzybxRb+hCZVL6HDDfmRCkAru94u/pE7UyCw2A==\n", "Nk7VqmKX4k8=\n");

    /* renamed from: Ғ, reason: contains not printable characters */
    public static final String f835 = StringFog.decrypt("OmSdA1sBNQI6dYA+XBQ8MS1Eny9bARwZOnWMJFAHHh89aI8jVhQkGSZvmg9DED4EBWiaPlAbNQI=\n", "SQHpSjV1UHA=\n");

    /* renamed from: ѵ, reason: contains not printable characters */
    public static final String f834 = StringFog.decrypt("zq98dqXorhHbnGFRs8WyEci+YUKhz6Q=\n", "qcoINMSGwHQ=\n");

    /* renamed from: п, reason: contains not printable characters */
    public static final String f833 = StringFog.decrypt("bHSGU8S+csdRc5Na96lHzVFzhF/CtFDHQG0=\n", "JRryNrbNBq4=\n");

    /* renamed from: н, reason: contains not printable characters */
    public static final String f832 = StringFog.decrypt("r4+x6OEHP5S4j/K19gFwnKKUubThHjeBpYGw6OQDO4LiqbKy9xgtgaWUtaf+Kzq0r5S1sPseJw==\n", "zODcxpJqXvU=\n");

    /* renamed from: У, reason: contains not printable characters */
    public static final String f831 = StringFog.decrypt("872Dr1sz25LotoCrWyTKn9WxlaJoM/+V1bGCp10u6J/Erw==\n", "odj0zilXvvY=\n");

    /* renamed from: С, reason: contains not printable characters */
    public static final String f830 = StringFog.decrypt("2C69E1l+gPbPLv5OTnjP5d42sU9OdoW5zSi1SgRBhODaM7RYTlqP494zo0lDZ4j21wC0fElniOHS\nNak=\n", "u0HQPSoT4Zc=\n");

    /* renamed from: Ϲ, reason: contains not printable characters */
    public static final String f829 = StringFog.decrypt("2rco8IVfIbXnsD35tU0muQ==\n", "k9lclfcsVdw=\n");

    /* renamed from: ϵ, reason: contains not printable characters */
    public static final String f828 = StringFog.decrypt("+GR6B4Trmh3FY28Ot/ysFcJv\n", "sQoOYvaY7nQ=\n");

    /* renamed from: ϯ, reason: contains not printable characters */
    public static final String f827 = StringFog.decrypt("7q+skNePzVTTqLmZ5JjvVMK2lZrBmdU=\n", "p8HY9aX8uT0=\n");

    /* renamed from: Ϯ, reason: contains not printable characters */
    public static final String f826 = StringFog.decrypt("KMLshd2NXCsVxfmM7ppqIxLJzonKiWUtBcn0\n", "YayY4K/+KEI=\n");

    /* renamed from: ϝ, reason: contains not printable characters */
    public static final String f825 = StringFog.decrypt("6vRjA5upSrDSz2sHmIt2sNz1\n", "uZkCYu/GGdQ=\n");

    /* renamed from: ϙ, reason: contains not printable characters */
    public static final String f824 = StringFog.decrypt("r5hTvaVXylaei1i2o1XMUYOIX7Cwb8pKhJ0=\n", "6u4209EboyU=\n");

    /* renamed from: Λ, reason: contains not printable characters */
    public static final String f823 = StringFog.decrypt("VOwJw0a6SY5l/wLIQLhPiXj8Bc5TgkmSf+klw0aTUptw+Qk=\n", "EZpsrTL2IP0=\n");

    /* renamed from: Κ, reason: contains not printable characters */
    public static final String f822 = StringFog.decrypt("XzcOcqF/t0ViMBt7kmiHSXo8HXanaQ==\n", "Fll6F9MMwyw=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f821 = StringFog.decrypt("zKz+o+iOebvxq+uq25lPs/anzqP2mGqz8ac=\n", "hcKKxpr9DdI=\n");

    /* renamed from: ʜ, reason: contains not printable characters */
    public static final String f820 = StringFog.decrypt("GbGs3YbPaBwhiqTZheReFC+7rMiX\n", "StzNvPKgO3g=\n");

    /* renamed from: Ȳ, reason: contains not printable characters */
    public static final String f819 = StringFog.decrypt("dMAiVYdI54pJxzdctF/BhkzbM0OB\n", "Pa5WMPU7k+M=\n");

    /* renamed from: ȝ, reason: contains not printable characters */
    public static final String f818 = StringFog.decrypt("JQsDRckAFAwHEQtX/A==\n", "dmRuJIhkRmk=\n");

    /* renamed from: ƈ, reason: contains not printable characters */
    public static final String f817 = StringFog.decrypt("a2U8Rzkj3a5WYilOGD/EpnBuJU0/NfqoV3krRw==\n", "IgtIIktQqcc=\n");

    /* renamed from: Ɔ, reason: contains not printable characters */
    public static final String f816 = StringFog.decrypt("fThBOh5fBkpaMn80OUgIQA==\n", "LlcsW0w6ayU=\n");

    /* renamed from: Ť, reason: contains not printable characters */
    public static final String f815 = StringFog.decrypt("3U6wFAWZQrPgSaUdOoVSr/hFjR8Dj0S89UOhOBmAU7ngSasfBA==\n", "lCDEcXfqNto=\n");

    /* renamed from: ţ, reason: contains not printable characters */
    public static final String f814 = StringFog.decrypt("K1jBrm3KcS8cRMC7SMFIJQpXzb1k\n", "eDGs3gGvPEA=\n");

    /* renamed from: ō, reason: contains not printable characters */
    public static final String f813 = StringFog.decrypt("iyszJY0FtqKYKhItmhaeqb0rKA==\n", "2U5ERP9h08Y=\n");

    /* renamed from: Ł, reason: contains not printable characters */
    public static final String f812 = StringFog.decrypt("9i50atRa2t/lL0Z9w1DL9804d27IW831yz9qbc9d3s/NJG14\n", "pEsDC6Y+v7s=\n");

    /* renamed from: Ĵ, reason: contains not printable characters */
    public static final String f811 = StringFog.decrypt("ZQ+x1ln70MJ2DoLSR/rSx0MP\n", "N2rGtyuftaY=\n");

    /* renamed from: ﾓ, reason: contains not printable characters */
    public static final String f944 = StringFog.decrypt("MgnHmA2ATDUhCMO0EIBcPQUl3o0alk8wAwn5lxWBSiUJA96K\n", "YGyw+X/kKVE=\n");

    /* renamed from: ﾊ, reason: contains not printable characters */
    public static final String f943 = StringFog.decrypt("o2vJp3IFJsWEfeqmcxIc\n", "4QqnyRd3cKw=\n");

    /* renamed from: ﾁ, reason: contains not printable characters */
    public static final String f942 = StringFog.decrypt("c58mXsn2RCRUiQxVwOF1LEWb\n", "Mf5IMKyEEk0=\n");

    /* renamed from: ｽ, reason: contains not printable characters */
    public static final String f941 = StringFog.decrypt("fLVUv8giysNssUukyCP/\n", "PtQ60a1Qi6c=\n");

    /* renamed from: ｹ, reason: contains not printable characters */
    public static final String f940 = StringFog.decrypt("3K03+iLQd//zrQvxKs1Q9c2jLOYkxw==\n", "nsxZlEeiJJA=\n");

    /* renamed from: ｸ, reason: contains not printable characters */
    public static final String f939 = StringFog.decrypt("BnwpUkVTfeIgaCtZaU9E6DZ7Jl9FaF7nIX4zVU9PQw==\n", "RB1HPCAhMI0=\n");

    /* renamed from: ｷ, reason: contains not printable characters */
    public static final String f938 = StringFog.decrypt("jQ8s694lwci/Dg==\n", "zGt+jq1VrqY=\n");

    /* renamed from: ｳ, reason: contains not printable characters */
    public static final String f937 = StringFog.decrypt("9uR7TrhBIb7D\n", "t4ApK8k0RM0=\n");

    /* renamed from: ｦ, reason: contains not printable characters */
    public static final String f936 = StringFog.decrypt("7/ZEv9CqzfLd90a70anH7g==\n", "rpIW2qPaopw=\n");

    /* renamed from: ｓ, reason: contains not printable characters */
    public static final String f935 = StringFog.decrypt("jKzzmCOHU5+1sOWeKZZXj7Kg\n", "2sWX/UzVNuw=\n");

    /* renamed from: ｒ, reason: contains not printable characters */
    public static final String f934 = StringFog.decrypt("TrJipCx/C3Noq2OlCkYre3uzS6QnQRhTfIljsjNHF2F9i2ezME0L\n", "GNsGwUMoeRI=\n");

    /* renamed from: ｎ, reason: contains not printable characters */
    public static final String f933 = StringFog.decrypt("GKqRdUWauoM+qYR3Tq+IqTSw\n", "UcfwEiDb3sA=\n");

    /* renamed from: ｌ, reason: contains not printable characters */
    public static final String f932 = StringFog.decrypt("OiSgmiKZ8VkWOrGSKavwWxI7spg1\n", "c0nB/UfYlQs=\n");

    /* renamed from: Ｉ, reason: contains not printable characters */
    public static final String f931 = StringFog.decrypt("AyxRjtlOOkMhNG6N7kQlSC85Qqr0SzJNOjNIjQ==\n", "Tlon45ohVy4=\n");

    /* renamed from: Ｆ, reason: contains not printable characters */
    public static final String f930 = StringFog.decrypt("xyD9rO7d4Lf+EeK5wdH2nPQ2\n", "kUGO2Li0hNI=\n");

    /* renamed from: ﻢ, reason: contains not printable characters */
    public static final String f929 = StringFog.decrypt("v2Np9cLtHXmGUnbg7eELTJtnaeT68Bxup2dt\n", "6QIagZSEeRw=\n");

    /* renamed from: ﻌ, reason: contains not printable characters */
    public static final String f928 = StringFog.decrypt("vAk0AGOiQrGTBSIraYU=\n", "6mBQZQzyLtA=\n");

    /* renamed from: ﻋ, reason: contains not printable characters */
    public static final String f927 = StringFog.decrypt("Hq3Y14Y24v03iNfBkSrv9CCK28U=\n", "UsS+suVPgZE=\n");

    /* renamed from: ﺧ, reason: contains not printable characters */
    public static final String f926 = StringFog.decrypt("Tn7H5YtR/kZxcdPDvkP5WWw=\n", "GB+0kdswjDU=\n");

    /* renamed from: ﺟ, reason: contains not printable characters */
    public static final String f925 = StringFog.decrypt("TPx5bImO9UF772N3\n", "Gp0KGNrtkC8=\n");

    /* renamed from: ﺕ, reason: contains not printable characters */
    public static final String f924 = StringFog.decrypt("kBDBUF+/XGqnN9tId4lbZqgQwE19\n", "xnGyJBLaOAM=\n");

    /* renamed from: ﭞ, reason: contains not printable characters */
    public static final String f923 = StringFog.decrypt("ZWZ2Pc1hmy1BcA==\n", "JAIAWL8V8l4=\n");

    /* renamed from: ﭒ, reason: contains not printable characters */
    public static final String f922 = StringFog.decrypt("DH9yZAE/J9g7bGh/ES4n1y53d3UWPTbX\n", "Wh4BEFJcQrY=\n");

    /* renamed from: בֿ, reason: contains not printable characters */
    public static final String f921 = StringFog.decrypt("oDgYhNMbL9GXKwKf0h050IMrCJXEGT7e\n", "9llr8IB4Sr8=\n");

    /* renamed from: צּ, reason: contains not printable characters */
    public static final String f920 = StringFog.decrypt("3TSqwApFfgr9L77GAEM=\n", "jkDLtGMmLG8=\n");

    /* renamed from: ﬥ, reason: contains not printable characters */
    public static final String f917 = StringFog.decrypt("0wfmjU1Hn2HEFPSCS2+TdvUH/4lN\n", "gWKR7D8j+gU=\n");

    /* renamed from: 宀, reason: contains not printable characters */
    public static final String f914 = StringFog.decrypt("onMOcCUFj8ifdBt5EgCez59RE2YjE5XEmQ==\n", "6x16FVd2+6E=\n");

    public C0563(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        return SmaatoSdk.getVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f919, new C1337(this));
        hashMap.put(f918, new C1122(this));
        hashMap.put(f916, new C0853(this));
        hashMap.put(f915, new C0841(this));
        hashMap.put(f858, new C0802(this));
        hashMap.put(f857, new C0801(this));
        hashMap.put(f856, new C0799(this));
        hashMap.put(f913, new C0627(this));
        hashMap.put(f912, new C0578(this));
        hashMap.put(f911, new C0623(this));
        hashMap.put(f910, new C0615(this));
        hashMap.put(f909, new C0614(this));
        hashMap.put(f908, new C0607(this));
        hashMap.put(f907, new C0603(this));
        hashMap.put(f906, new C0521(this));
        hashMap.put(f905, new C0467(this));
        hashMap.put(f855, new C0436(this));
        hashMap.put(f854, new C0400(this));
        hashMap.put(f852, new C0370(this));
        hashMap.put(f853, new C1297(this));
        hashMap.put(f851, new C1291(this));
        hashMap.put(f850, new C1259(this));
        hashMap.put(f849, new C1235(this));
        hashMap.put(f848, new C1229(this));
        hashMap.put(f847, new C1228(this));
        hashMap.put(f846, new C1225(this));
        hashMap.put(f845, new C1202(this));
        hashMap.put(f844, new C1194(this));
        hashMap.put(f843, new C1155(this));
        hashMap.put(f842, new C1117(this));
        hashMap.put(f841, new C1110(this));
        hashMap.put(f840, new C1025(this));
        hashMap.put(f839, new C1014(this));
        hashMap.put(f838, new C1008(this));
        hashMap.put(f837, new C0910(this));
        hashMap.put(f836, new C0908(this));
        hashMap.put(f835, new C0900(this));
        hashMap.put(f834, new C0854(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2049897434:
                if (str.equals(f874)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1900544603:
                if (str.equals(f821)) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case -1861698122:
                if (str.equals(f884)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1769924254:
                if (str.equals(f865)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1677935844:
                if (str.equals(f880)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1675718270:
                if (str.equals(f914)) {
                    c = '_';
                    break;
                }
                c = 65535;
                break;
            case -1674650815:
                if (str.equals(f886)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1605194088:
                if (str.equals(f866)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -1584225191:
                if (str.equals(f896)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1583575161:
                if (str.equals(f898)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1571835843:
                if (str.equals(f829)) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case -1503687848:
                if (str.equals(f882)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1440136784:
                if (str.equals(f876)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1436015311:
                if (str.equals(f816)) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case -1402220894:
                if (str.equals(f927)) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case -1341412401:
                if (str.equals(f820)) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -1233246005:
                if (str.equals(f868)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1219148258:
                if (str.equals(f879)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -1087751373:
                if (str.equals(f894)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1071862731:
                if (str.equals(f922)) {
                    c = '[';
                    break;
                }
                c = 65535;
                break;
            case -1040892388:
                if (str.equals(f925)) {
                    c = 'X';
                    break;
                }
                c = 65535;
                break;
            case -1025547468:
                if (str.equals(f822)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -1013665366:
                if (str.equals(f862)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -920640106:
                if (str.equals(f811)) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case -787846165:
                if (str.equals(f812)) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case -742272100:
                if (str.equals(f934)) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case -712253219:
                if (str.equals(f863)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -589175173:
                if (str.equals(f895)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case -572702516:
                if (str.equals(f937)) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case -541270242:
                if (str.equals(f859)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -520974940:
                if (str.equals(f938)) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case -385360049:
                if (str.equals(f869)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -323297896:
                if (str.equals(f875)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -284636416:
                if (str.equals(f941)) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case -273562919:
                if (str.equals(f860)) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -270120119:
                if (str.equals(f931)) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case -19118816:
                if (str.equals(f933)) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -6319260:
                if (str.equals(f826)) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 8254577:
                if (str.equals(f887)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 35040560:
                if (str.equals(f883)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 38686469:
                if (str.equals(f832)) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 73990117:
                if (str.equals(f904)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 114527097:
                if (str.equals(f935)) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case 144295720:
                if (str.equals(f929)) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case 181475721:
                if (str.equals(f864)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 204897024:
                if (str.equals(f819)) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 216348240:
                if (str.equals(f930)) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case 280670893:
                if (str.equals(f892)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 305949075:
                if (str.equals(f813)) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 312751073:
                if (str.equals(f926)) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f891)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 349056031:
                if (str.equals(f823)) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 452090875:
                if (str.equals(f814)) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 488451095:
                if (str.equals(f889)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 496581789:
                if (str.equals(f815)) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 578263171:
                if (str.equals(f833)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 588580693:
                if (str.equals(f888)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 597879523:
                if (str.equals(f936)) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case 623119894:
                if (str.equals(f881)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 650807658:
                if (str.equals(f870)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 675758650:
                if (str.equals(f824)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 676623548:
                if (str.equals(f920)) {
                    c = ']';
                    break;
                }
                c = 65535;
                break;
            case 702241176:
                if (str.equals(f943)) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 794130622:
                if (str.equals(f903)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 812241244:
                if (str.equals(f878)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 835423389:
                if (str.equals(f939)) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case 846122526:
                if (str.equals(f932)) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case 847197472:
                if (str.equals(f902)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 847587288:
                if (str.equals(f877)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 884316988:
                if (str.equals(f872)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 916971807:
                if (str.equals(f825)) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f897)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 967684716:
                if (str.equals(f901)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 973798583:
                if (str.equals(f867)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1060616468:
                if (str.equals(f921)) {
                    c = '\\';
                    break;
                }
                c = 65535;
                break;
            case 1119630518:
                if (str.equals(f942)) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case 1162892950:
                if (str.equals(f871)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1178278880:
                if (str.equals(f917)) {
                    c = '^';
                    break;
                }
                c = 65535;
                break;
            case 1266924544:
                if (str.equals(f828)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1348788149:
                if (str.equals(f827)) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1404027096:
                if (str.equals(f890)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1467009488:
                if (str.equals(f873)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1512520214:
                if (str.equals(f900)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1529031602:
                if (str.equals(f899)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1607887623:
                if (str.equals(f944)) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case 1682698788:
                if (str.equals(f924)) {
                    c = 'Y';
                    break;
                }
                c = 65535;
                break;
            case 1737707748:
                if (str.equals(f928)) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case 1758259732:
                if (str.equals(f861)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1839156017:
                if (str.equals(f831)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1943455869:
                if (str.equals(f817)) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case 2016637657:
                if (str.equals(f893)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2025864597:
                if (str.equals(f830)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 2065545547:
                if (str.equals(f923)) {
                    c = 'Z';
                    break;
                }
                c = 65535;
                break;
            case 2067789221:
                if (str.equals(f885)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2106788284:
                if (str.equals(f818)) {
                    c = B5.U;
                    break;
                }
                c = 65535;
                break;
            case 2127198333:
                if (str.equals(f940)) {
                    c = 'I';
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
                return SmaatoSdk.class;
            case 1:
            case 2:
                return InterstitialAdActivity.class;
            case 3:
            case 4:
                return RewardedInterstitialAdActivity.class;
            case 5:
                return InterstitialAdPresenter.class;
            case 6:
                return InterstitialAdPresenter.Listener.class;
            case 7:
                return InterstitialAd.class;
            case '\b':
                return InterstitialServerAdFormatResolvingFunction.class;
            case '\t':
                return AdEvent.class;
            case '\n':
                return InterstitialAdLoaderPlugin.class;
            case 11:
                return DiInterstitial.class;
            case '\f':
                return InterstitialModuleInterface.class;
            case '\r':
                return AdPresenter.class;
            case 14:
                return InterstitialVideoAdPresenter.class;
            case 15:
            case 16:
                return SmaatoSdkBrowserActivity.class;
            case 17:
                return VastVideoPlayer.class;
            case 18:
                return VastVideoPlayerPresenter.class;
            case 19:
                return VideoPlayer.class;
            case 20:
                return SystemMediaPlayer.class;
            case 21:
                return CompanionPresenterImpl.class;
            case 22:
                return VastElementPresenterImpl.class;
            case 23:
                return VastCompanionScenario.class;
            case 24:
                return VastElementPresenter.class;
            case 25:
                return VideoClicks.class;
            case 26:
                return VastBeacon.class;
            case 27:
                return AdInteractor.class;
            case 28:
                return StateMachine.class;
            case 29:
                return StateMachine.Listener.class;
            case 30:
                return Metadata.class;
            case 31:
                return RetainedAdPresenterRepository.class;
            case ' ':
                return RewardedAdPresenter.class;
            case '!':
                return RewardedVideoAdPresenter.class;
            case '\"':
                return AdObject.class;
            case '#':
                return VideoPlayer.LifecycleListener.class;
            case '$':
            case '%':
                return BannerView.class;
            case '&':
                return AdContentView.class;
            case '\'':
                return RichMediaAdContentView.class;
            case '(':
                return WatermarkImageButton.class;
            case ')':
                return BannerView.EventListener.class;
            case '*':
                return RichMediaAdObject.class;
            case '+':
                return BaseAdPresenter.class;
            case ',':
                return BannerAdPresenter.class;
            case '-':
                return ApiAdResponse.class;
            case '.':
            case '/':
                return com.smaato.sdk.interstitial.view.InterstitialAdActivity.class;
            case '0':
            case '1':
                return com.smaato.sdk.rewarded.view.RewardedInterstitialAdActivity.class;
            case '2':
                return InterstitialBase.class;
            case '3':
                return InterstitialAdBase.class;
            case '4':
                return InterstitialAdViewModel.class;
            case '5':
                return InterstitialAdBaseViewModel.class;
            case '6':
                return SmaatoSdkViewModel.class;
            case '7':
                return EventListenerNotifications.class;
            case '8':
                return EventListenerNotificationsInterface.class;
            case '9':
                return InterstitialAdDelegate.class;
            case ':':
                return InterstitialAdBaseDelegate.class;
            case ';':
                return SmaatoSdkViewDelegate.class;
            case '<':
                return InterstitialAdRequest.class;
            case '=':
                return SomaAdRequest.class;
            case '>':
                return InterstitialSomaRemoteSource.class;
            case '?':
                return SomaRemoteSource.class;
            case '@':
                return InterstitialModuleInterface.class;
            case 'A':
                return SimpleModuleInterface.class;
            case 'B':
                return RewardedAdViewModel.class;
            case 'C':
                return RewardedAdEventListenerNotifications.class;
            case 'D':
                return RewardedAdDelegate.class;
            case 'E':
                return RewardedAdsModuleInterface.class;
            case 'F':
                return BannerViewModel.class;
            case 'G':
                return BannerViewDelegate.class;
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                return BannerAdRequest.class;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                return BannerSomaRemoteSource.class;
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return BannerModuleInterface.class;
            case 'K':
                return AdResponse.class;
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                return AdRequest.class;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                return AdResponseParser.class;
            case 'N':
                return VideoResourceCache.class;
            case 'O':
                return VideoWrappedInRichMediaAdResponseParser.class;
            case 'P':
                return ImageAdContentView.class;
            case 'Q':
                return ImageAdResponseParser.class;
            case 'R':
                return MvvmCommonInterface.class;
            case 'S':
                return com.smaato.sdk.video.vast.vastplayer.VastVideoPlayer.class;
            case 'T':
                return com.smaato.sdk.video.vast.vastplayer.VastVideoPlayerPresenter.class;
            case 'U':
                return com.smaato.sdk.video.vast.vastplayer.VideoPlayer.class;
            case 'V':
                return VideoPlayer.LifecycleListener.class;
            case 'W':
                return VastParsingResult.class;
            case 'X':
                return VastScenario.class;
            case 'Y':
                return VastMediaFileScenario.class;
            case 'Z':
                return Advertiser.class;
            case '[':
                return VastScenarioCreativeData.class;
            case '\\':
                return VastScenarioResourceData.class;
            case ']':
                return StaticResource.class;
            case '^':
                return EventListener.class;
            case '_':
                return com.smaato.sdk.interstitial.EventListener.class;
            default:
                return null;
        }
    }
}
