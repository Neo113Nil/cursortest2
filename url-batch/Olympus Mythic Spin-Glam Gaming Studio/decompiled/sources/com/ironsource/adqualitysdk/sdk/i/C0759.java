package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.B5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.mbridge.msdk.newreward.player.BaseActivity;
import com.mbridge.msdk.newreward.player.MBRewardVideoActivity;
import com.mintegral.msdk.MIntegralConstans;
import com.mintegral.msdk.MIntegralSDK;
import com.mintegral.msdk.activity.DomainMTGCommonActivity;
import com.mintegral.msdk.activity.MTGCommonActivity;
import com.mintegral.msdk.appwall.BottomRefreshListView;
import com.mintegral.msdk.appwall.MintegralAdActivity;
import com.mintegral.msdk.appwall.ShuffleFragment;
import com.mintegral.msdk.appwall.TabListFragment;
import com.mintegral.msdk.appwall.WallFragment;
import com.mintegral.msdk.appwall.report.eventcache.ImpressionCampaignExModel;
import com.mintegral.msdk.appwall.service.WallService;
import com.mintegral.msdk.appwall.view.WallViewPager;
import com.mintegral.msdk.appwall.viewpager.indicater.TabPageIndicator;
import com.mintegral.msdk.appwallex.TabListView;
import com.mintegral.msdk.appwallex.WallView;
import com.mintegral.msdk.base.entity.CampaignEx;
import com.mintegral.msdk.base.entity.CampaignUnit;
import com.mintegral.msdk.base.fragment.BaseFragment;
import com.mintegral.msdk.base.webview.BrowserView;
import com.mintegral.msdk.base.webview.WebViewFragment;
import com.mintegral.msdk.click.AppReceiver;
import com.mintegral.msdk.click.CommonJumpLoader;
import com.mintegral.msdk.interstitial.jscommon.interstitial;
import com.mintegral.msdk.interstitial.view.MTGInterstitialActivity;
import com.mintegral.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mintegral.msdk.interstitialvideo.out.MTGBidInterstitialVideoHandler;
import com.mintegral.msdk.interstitialvideo.out.MTGInterstitialVideoHandler;
import com.mintegral.msdk.mtgbanner.view.MTGBannerWebView;
import com.mintegral.msdk.mtgbid.out.BidManager;
import com.mintegral.msdk.mtgbid.out.BidResponsed;
import com.mintegral.msdk.mtgjscommon.authority.activity.MTGAuthorityActivity;
import com.mintegral.msdk.mtgjscommon.base.BaseWebView;
import com.mintegral.msdk.mtgjscommon.windvane.WindVaneWebView;
import com.mintegral.msdk.out.AppWallTrackingListener;
import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.Campaign;
import com.mintegral.msdk.out.IDownloadListener;
import com.mintegral.msdk.out.InterstitialListener;
import com.mintegral.msdk.out.LoadingActivity;
import com.mintegral.msdk.out.MIntegralSDKFactory;
import com.mintegral.msdk.out.MTGBannerView;
import com.mintegral.msdk.out.MTGBidRewardVideoHandler;
import com.mintegral.msdk.out.MTGConfiguration;
import com.mintegral.msdk.out.MTGInterstitialHandler;
import com.mintegral.msdk.out.MTGOfferWallHandler;
import com.mintegral.msdk.out.MTGRewardVideoHandler;
import com.mintegral.msdk.out.MtgBidCommonHandler;
import com.mintegral.msdk.out.MtgWallHandler;
import com.mintegral.msdk.out.NativeListener;
import com.mintegral.msdk.out.OnMTGMediaViewListener;
import com.mintegral.msdk.out.RewardVideoListener;
import com.mintegral.msdk.reward.player.MTGRewardVideoActivity;
import com.mintegral.msdk.rover.RoverCampaignUnit;
import com.mintegral.msdk.shell.MTGActivity;
import com.mintegral.msdk.video.js.activity.AbstractActivity;
import com.mintegral.msdk.video.js.activity.AbstractJSActivity;
import com.mintegral.msdk.video.js.activity.VideoWebViewActivity;
import com.mintegral.msdk.video.module.MintegralBaseView;
import com.mintegral.msdk.video.module.MintegralClickCTAView;
import com.mintegral.msdk.video.module.MintegralClickMiniCardView;
import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.MintegralH5EndCardView;
import com.mintegral.msdk.video.module.MintegralLandingPageView;
import com.mintegral.msdk.video.module.MintegralNativeEndCardView;
import com.mintegral.msdk.video.module.MintegralPlayableView;
import com.mintegral.msdk.video.module.MintegralVastEndCardView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.videocommon.dialog.MTGAlertDialog;
import com.mintegral.msdk.videocommon.listener.InterVideoOutListener;
import com.mintegral.msdk.widget.MTGImageView;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ა, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0759 extends AbstractC1271 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1764 = StringFog.decrypt("fi5HQ6zkSedwLF1FtQ==\n", "GUszAM2JOYY=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1763 = StringFog.decrypt("c1sd43rrMoc=\n", "FD5poh6de+M=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1762 = StringFog.decrypt("98QCKd37jcnd5TcLxvyEzg==\n", "upBFarKV66A=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1761 = StringFog.decrypt("HGGiw+r0jME1Y4z16uys0CVck/j7+g==\n", "UTXlkY+D7bM=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1760 = StringFog.decrypt("WARVsGMoDsV8JGs=\n", "FVAS8QBcZ7M=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1759 = StringFog.decrypt("Eyg3+KLJhCAwPRPPpNKAOyc=\n", "Xnxwu82k6U8=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1758 = StringFog.decrypt("4o3dufy9mXXdsO6ByKqFc9mw7oE=\n", "r9ma+InJ8Ro=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1757 = StringFog.decrypt("ug3IEr9TwwWELeYvuEbKP5Y36ze0VQ==\n", "91mPW9Enpnc=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1756 = StringFog.decrypt("836xy2A4CRPNXp/2Zy0AN9dOk+1GLQIF0k+E\n", "vir2gg5MbGE=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1755 = StringFog.decrypt("pSxkwbHm7aGMLkr3sf7EsoYcT/am\n", "6Hgjk9SRjNM=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1754 = StringFog.decrypt("j7/SOCe4efa2jucJOrVE8aOHwxMquV/Qo4XxFiuu\n", "wuuVek7cMJg=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1753 = StringFog.decrypt("ifi3xwpvQ/6zzYLhNWJ1/qvkkesHZ3Tp\n", "xKzwhWMLEZs=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1752 = StringFog.decrypt("rAtqdPWTjf2TCURT4w==\n", "4V8tNpT945g=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1751 = StringFog.decrypt("3bNLjnWsEfHbu1TBdOsS9tq3CM9tsVHI6ptkwXarGvfotUPX\n", "vtwmoBjFf4U=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1750 = StringFog.decrypt("I3YuvRXb1WYcdQydItzedA==\n", "biJp/3S1uwM=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1749 = StringFog.decrypt("qASb+Ta7SYGuDIS2N/xKhq8A2LovtUWUpQWTpXWkTpC8RbuDHJBGm6UOhIA+sHGcrhw=\n", "y2v211vSJ/U=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1748 = StringFog.decrypt("VErNiaSrwJtuTs+R\n", "Ayuh5eLZofw=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1747 = StringFog.decrypt("3KRH6FeB3gjarFinVsbdD9ugBKdKmMcd06cEkVuE3DrNqk2rX4bE\n", "v8sqxjrosHw=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1746 = StringFog.decrypt("1ItnaCp0aRfnmnRUInZiD/yIY1olfXc=\n", "lfsXP0sYBUM=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1745 = StringFog.decrypt("CB9VVVfkTnouH1B0W/lO\n", "XH43GT6XOjw=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1744 = StringFog.decrypt("Xzr3j30lW7p+M+WEfidK\n", "DFKC6RtJPvw=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1743 = StringFog.decrypt("/S7ZXfhRGlrZM8ha/3AhTMsXxEzg\n", "v0GtKZc8SD8=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1742 = StringFog.decrypt("uDlJQNtViXmCPEJz20aDQg==\n", "7FgrELoy7DA=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1741 = StringFog.decrypt("/j38nd2vGZj5PfeU+Q==\n", "qVyQ8YvGfO8=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1740 = StringFog.decrypt("e7JWh9PISel9uknI0o9K7ny2FcjO0VD8dLEV39fEULNPvFfF6MhC6ki8XMzM\n", "GN07qb6hJ50=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1739 = StringFog.decrypt("T8Ai+JVu/9xxwis=\n", "GKFOlMYLjao=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1738 = StringFog.decrypt("iOOyOtUjOQuu4IEp3SArC6bghzD9Py4HrQ==\n", "wY7CSLBQSmI=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1737 = StringFog.decrypt("eylSEgdd8TdGLUc=\n", "L0gwXm4uhWE=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1736 = StringFog.decrypt("Lcr2rVBuvz8=\n", "equawQYH2kg=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1735 = StringFog.decrypt("uHsMyDUlqJS+cxOHNGKrk79/T4coPLGBt3gEnnYbp4y3QgiDLw==\n", "2xRh5lhMxuA=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1734 = StringFog.decrypt("r/jwTi5lGZep8O8BLyIakKj8swIifxLNu/L/FippAM2O5fIXMGkFtaXy6g==\n", "zJedYEMMd+M=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1733 = StringFog.decrypt("HqtPHJBaJ8wFlm0i\n", "U/8IVf07QKk=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1732 = StringFog.decrypt("mmGaXr2yI6icaYURvPUgr51l2Qe5vyq5jSC6JJeSIL2ea6EZtaw=\n", "+Q73cNDbTdw=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1731 = StringFog.decrypt("gOnhd5am1zSi5/51irDYMKY=\n", "0oaXEuTltlk=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1730 = StringFog.decrypt("bjtMgQZK6tpCIU+6AlQ=\n", "I08r1mcmhpI=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1729 = StringFog.decrypt("QJSO+9hh7ilaoaXY9mblP2Gluw==\n", "DcDJtL4Hi1s=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1728 = StringFog.decrypt("kapy2APJKvuxs3r0IswH8LC7Zw==\n", "3N4VmmqtaZQ=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1727 = StringFog.decrypt("FKQno9A+q6Azvw==\n", "Vs1D7rFQysc=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f1726 = StringFog.decrypt("JAhosnEoLp0IEmmE\n", "ZmEM4BRbXvI=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f1725 = StringFog.decrypt("oHr66sw4R8qmcuWlzX9Ezad+uanVNkPNoHr6qc4/B9yiZvLq4zBa25Rw9ZLINF4=\n", "wxWXxKFRKb4=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f1724 = StringFog.decrypt("g/PEcHKUtWOF+9s/c9O2ZIT3hzNrmrFkg/PEM3CT9WCJ8s0ofpO+Obf1xzpJnLVyt/nLCHaYrA==\n", "4JypXh/92xc=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f1723 = StringFog.decrypt("BtOCxfD5oVwP7qTo8/s=\n", "S4fFhJyc0yg=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f1722 = StringFog.decrypt("UIlPGjt1EN9WgVBVOjIT2FeNDEI/eBvEUIlPWTlyUM9ah05bMTIz/3SnTlEkaDrCUopNUw==\n", "M+YiNFYcfqs=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f1721 = StringFog.decrypt("la2759MEZeCTpaSo0kNm55Kp+L/XCW772K+5rcsBbrq7q7i92wp59ZqUv63bAl39k7U=\n", "9sLWyb5tC5Q=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f1720 = StringFog.decrypt("pBMGLE22g6qiGxljTPGAraMXRXRJu4ix6REEZlWziPCKFQV2Rbifv6sqCnFUmoO6hB0ZZna2iKk=\n", "x3xrAiDf7d4=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f1719 = StringFog.decrypt("2PcnDZiifs/e/zhCmeV9yN/zZFWcr3XUlfUlR4CndZX28SRXkKxi2tfWK1ecvXX+1fwJQoevRtLe\n7w==\n", "u5hKI/XLELs=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f1718 = StringFog.decrypt("COu5W4sc+AYO46YUilv7AQ/v+gOPEfMdRem7EZMZ81wm7boBgxLkEwfHuByFHtUmKtK9EJE=\n", "a4TUdeZ1lnI=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f1717 = StringFog.decrypt("OBdkgJQorT8+H3vPlW+uOD8TJ9iQJaYkdRVmyowtpmUWEWfanCaxKjc6aN2cF6ouLA==\n", "W3gJrvlBw0s=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f1716 = StringFog.decrypt("A1eCjgmjpuQFX53BCOSl4wRTwdYNrq3/TlWAxBGmrb4tUYHUAa268Qx7g8kHoYX5DlGswRaunvkF\nTw==\n", "YDjvoGTKyJA=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f1715 = StringFog.decrypt("jLyLekKVatSKtJQ1Q9Jp04u4yCJGmGHPwb6JMFqQYY6iuoggSpt2wYOQiTpbnW3OiqGwPUqL\n", "79PmVC/8BKA=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f1714 = StringFog.decrypt("PowJID5SbsE4hBZvPxVtxjmISng6X2Xac44LaiZXZZsQigp6Nlxy1DGrUUs9X0PUL4cyZzZM\n", "XeNkDlM7ALU=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f1713 = StringFog.decrypt("Zk7HSQ1qY5xgRtgGDC1gm2FKhBEJZ2iHK0zFAxVvaMZISMQTBWR/iWltywkEamOPVUDNAjZqaJ8=\n", "BSGqZ2ADDeg=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f1712 = StringFog.decrypt("jcwGrYMPBNGLxBnigkgH1orIRfWHAg/KwM4E55sKD4ujygX3iwEYxILzB+KXBwjJi/UC5pk=\n", "7qNrg+5maqU=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f1711 = StringFog.decrypt("6Q7HwL1+P3LPAdz9n0QWf9UU7/qfQQ==\n", "pmCKlPozWhY=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f1710 = StringFog.decrypt("FNXpdEm+GsIX+et4Tb851zPO7WNJpC4=\n", "ULqEFSDQV5Y=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f1709 = StringFog.decrypt("7FSk1oxgJMLqXLuZjScnxetQ55mCfSPA5k+w1qVmJ9fmVYSspkol2+JUp7mCfSPA5k+w\n", "jzvJ+OEJSrY=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f1708 = StringFog.decrypt("DSAVUr/A7F4WCyNSp+D9TikULkOx\n", "QGJHN8ihnjo=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f1707 = StringFog.decrypt("8wQFQ/q59dD0DA1D+qjj0r4FDRrlvvDY4g9GHfu6/tziRSUvxb7w2OIPPgTzvuj48x8BG/6v/g==\n", "kGtobZfbh7k=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f1706 = StringFog.decrypt("vR8zZEVrIYuJFzR4\n", "/35AAQQIVeI=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f1705 = StringFog.decrypt("mnhvLtKn2fSdcGcu0rbP9td5Z3fNoNz8i3MscNOk0viLOUBhzKDq/o1+dGnLvA==\n", "+RcCAL/Fq50=\n");

    public C0759(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(StringFog.decrypt("pTPYz9fS3P+lJM3u7fjj\n", "wlasgr68qJo=\n"), new C0936(this));
        hashMap.put(f1764, new C0861(this));
        hashMap.put(StringFog.decrypt("+hCIvvibGnH6ELKP9J0=\n", "nXX87pn4cRA=\n"), new C0821(this));
        hashMap.put(StringFog.decrypt("ultF9yx2/JSITF0=\n", "3T4xtEAfn/8=\n"), new C0818(this));
        hashMap.put(StringFog.decrypt("RFZAAkbimKZaQ1E=\n", "IzM0Ti+M8/I=\n"), new C0816(this));
        hashMap.put(StringFog.decrypt("4kPczbnW1wXQVMQ=\n", "hSaohNS3sGA=\n"), new C0815(this));
        hashMap.put(StringFog.decrypt("6AU5o4MltJD9DA==\n", "j2BN6uBK2sU=\n"), new C0775(this));
        hashMap.put(StringFog.decrypt("d3gixU8Ezw==\n", "EB1WhCtNq78=\n"), new C0769(this));
        hashMap.put(f1763, new C0761(this));
        hashMap.put(StringFog.decrypt("2CbHFrhgMIHaFdo8vHsNhd4g2DG3cwqDzSrdPw==\n", "v0OzWNkUWfc=\n"), new C0985(this));
        hashMap.put(StringFog.decrypt("cVQqFiut3XNwZzcxPYLXWmtCKjEkpsE=\n", "AjFeVErDsxY=\n"), new C0974(this));
        hashMap.put(StringFog.decrypt("IjMzkyX5Jjwg\n", "RVZH0kGtX0w=\n"), new C0964(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final String mo4017() {
        C0568 c0568 = C0860.m4221().f2085;
        String decrypt = StringFog.decrypt("5+qaItHVPASt65poxdV2cufq\n", "ycDGRvqJElg=\n");
        c0568.getClass();
        return C0568.m4057((Object) null, MTGConfiguration.class, decrypt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2128525576:
                if (str.equals(f1737)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -2127096804:
                if (str.equals(f1747)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -2107186802:
                if (str.equals(StringFog.decrypt("6nz5fMZnhQzodP5h1WyhGg==\n", "pB2NFbACxGg=\n"))) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2088438133:
                if (str.equals(f1716)) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -2083223016:
                if (str.equals(f1754)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -2030516682:
                if (str.equals(f1718)) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case -1980005015:
                if (str.equals(StringFog.decrypt("SoQfVmPkW+VvgBptb+9Y\n", "HeF9AAqBLKM=\n"))) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case -1978654101:
                if (str.equals(f1732)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case -1969670564:
                if (str.equals(f1712)) {
                    c = 'X';
                    break;
                }
                c = 65535;
                break;
            case -1940754118:
                if (str.equals(StringFog.decrypt("+hFVNBnqNbnxIGcjH+IgpM8K\n", "u3MmQGuLVs0=\n"))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1919192581:
                if (str.equals(StringFog.decrypt("IKVDeb4piUMehW1EuTyAcA6FbUa5KZU=\n", "bfEEMNBd7DE=\n"))) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1876403509:
                if (str.equals(f1742)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -1874906197:
                if (str.equals(StringFog.decrypt("ImRq0jLo8ZIDW2XVI8rtlyxsdsIB5uaE\n", "bw0EplePg/M=\n"))) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case -1812546352:
                if (str.equals(f1719)) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case -1766796574:
                if (str.equals(StringFog.decrypt("xTnBM/sbxg3qO94z4xneFvgs0DToDA==\n", "i1i1Wo1+kn8=\n"))) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -1702626105:
                if (str.equals(StringFog.decrypt("H3sBNMzwux4+RAYkzPifFjdl\n", "UhJvQKmXyX8=\n"))) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case -1674303146:
                if (str.equals(f1762)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1656370481:
                if (str.equals(StringFog.decrypt("c4lyiV9j/nJzhX67YGfn\n", "JOAc7QkCkBc=\n"))) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case -1537112313:
                if (str.equals(StringFog.decrypt("QVE6CpttdBx8XAsFlGR0EHBuNAGN\n", "EjhdZPoBI3U=\n"))) {
                    c = '^';
                    break;
                }
                c = 65535;
                break;
            case -1522474666:
                if (str.equals(f1710)) {
                    c = '`';
                    break;
                }
                c = 65535;
                break;
            case -1507367077:
                if (str.equals(f1753)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1458291270:
                if (str.equals(f1759)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1325137233:
                if (str.equals(f1760)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1265212384:
                if (str.equals(StringFog.decrypt("zsCtqGgIz0fuzJ2jazLkQ+o=\n", "nanKxglkjSY=\n"))) {
                    c = '\\';
                    break;
                }
                c = 65535;
                break;
            case -1077685820:
                if (str.equals(f1729)) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -1061727315:
                if (str.equals(f1750)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1058625022:
                if (str.equals(StringFog.decrypt("n3lvoK0sd8y/ZHqvrzR8/Y1zfKe6KULX\n", "zBAIzsxANq4=\n"))) {
                    c = '[';
                    break;
                }
                c = 65535;
                break;
            case -931831919:
                if (str.equals(f1752)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -920590771:
                if (str.equals(StringFog.decrypt("i7xywKPPgeWqlnPassma6qOnSt2j3w==\n", "xtUctMao84Q=\n"))) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case -894298414:
                if (str.equals(StringFog.decrypt("5e/kKzBGsPfEyusxMUis8fjn7ToDSKfh\n", "qIaKX1UhwpY=\n"))) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case -811615267:
                if (str.equals(f1715)) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case -667901878:
                if (str.equals(StringFog.decrypt("jmEuA7D/rRavQHUyu/ycFrFsFh6w7w==\n", "wwhAd9WY33c=\n"))) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case -558926374:
                if (str.equals(f1714)) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case -495785498:
                if (str.equals(f1708)) {
                    c = 'b';
                    break;
                }
                c = 65535;
                break;
            case -464794090:
                if (str.equals(f1746)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -461263347:
                if (str.equals(f1740)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -396369642:
                if (str.equals(f1709)) {
                    c = 'a';
                    break;
                }
                c = 65535;
                break;
            case -249445036:
                if (str.equals(f1741)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -228661957:
                if (str.equals(f1720)) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case -201859056:
                if (str.equals(f1727)) {
                    c = B5.U;
                    break;
                }
                c = 65535;
                break;
            case -156796625:
                if (str.equals(StringFog.decrypt("oCb0ptUMP7OBDfuh1T0kt5o=\n", "7U+a0rBrTdI=\n"))) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case -126256187:
                if (str.equals(StringFog.decrypt("4z4kw+TzHw/ONiLH/voeC9g=\n", "qnpLtIqfcG4=\n"))) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -121577375:
                if (str.equals(StringFog.decrypt("grfeZfjdPBOjrfRa\n", "z/6wEZ26TnI=\n"))) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -75274960:
                if (str.equals(StringFog.decrypt("YkxrIbZjuNg=\n", "IS0GUdcK37Y=\n"))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -33766813:
                if (str.equals(StringFog.decrypt("scl+/DVE7vmMzmv1EV7+9ZfrY+ozUvT1ig==\n", "+KcKmUc3mpA=\n"))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 148631506:
                if (str.equals(f1758)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 154057692:
                if (str.equals(StringFog.decrypt("emkTPqDXprdbYxIktsS1uEQ=\n", "NyB9SsWw1NY=\n"))) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 329817920:
                if (str.equals(StringFog.decrypt("HREZorqMgyYrEQGPoZuhKiERHA==\n", "T3Ruw8jo1U8=\n"))) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 336960212:
                if (str.equals(StringFog.decrypt("5rTKzW0Bq1rwu87J\n", "pdWnvQxozDQ=\n"))) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 388542383:
                if (str.equals(f1736)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 522506349:
                if (str.equals(StringFog.decrypt("SHWsgZl8N4tIda2Tt0gmgGh1vJ0=\n", "HhzI5PYrUuk=\n"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (str.equals(StringFog.decrypt("ZYQRGPLdeyp4gwQR\n", "DOplfYCuD0M=\n"))) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 675209731:
                if (str.equals(StringFog.decrypt("e0CCyZKXa099WQ==\n", "OCHvufP+DCE=\n"))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 713779451:
                if (str.equals(StringFog.decrypt("8oKkY12ncBnTqKZ+W6tPEdGCiXZKpFQR2pw=\n", "v+vKFzjAAng=\n"))) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case 745946635:
                if (str.equals(StringFog.decrypt("FsaeaBj7m1Qr049vC+w=\n", "WKfqAW6e1z0=\n"))) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 751945826:
                if (str.equals(f1713)) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case 787683072:
                if (str.equals(f1733)) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 824636291:
                if (str.equals(StringFog.decrypt("pu7SebmEk3SK7+lpv56TY5vlyHm5\n", "74CmHMvS+hA=\n"))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 830238336:
                if (str.equals(f1730)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 849576491:
                if (str.equals(StringFog.decrypt("7jn7w2Mo7jnPEfH2ZTv1Lsok7A==\n", "o1CVtwZPnFg=\n"))) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 879499863:
                if (str.equals(f1721)) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 888727913:
                if (str.equals(StringFog.decrypt("ezfdz46ajTNaLffwrZycJlkMyg==\n", "Nn6zu+v9/1I=\n"))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 892841421:
                if (str.equals(StringFog.decrypt("n+qWrM32zGS0/Y4=\n", "3Zj5276TvjI=\n"))) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 897829864:
                if (str.equals(StringFog.decrypt("5gmPiaKGCKfNDYs=\n", "pGj87PXjavE=\n"))) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 923005467:
                if (str.equals(f1761)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 963675317:
                if (str.equals(f1749)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 985183301:
                if (str.equals(StringFog.decrypt("7xSqlrTe9SfpHLXZtZn2IOgQ6dWt0Og66xWm1LrY9j7jFenauMT+fc4atN2O0vkF5R6w\n", "jHvHuNm3m1M=\n"))) {
                    c = ']';
                    break;
                }
                c = 65535;
                break;
            case 989671232:
                if (str.equals(StringFog.decrypt("6+j+jTUYUMXKz/GNOQlH4cjl05giG3TNw/Y=\n", "poGQ+VB/IqQ=\n"))) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 1014009286:
                if (str.equals(StringFog.decrypt("W/nNfqeI8JB6089joYTBpVfGym+1\n", "FpCjCsLvgvE=\n"))) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case 1027072306:
                if (str.equals(f1751)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1031717908:
                if (str.equals(f1707)) {
                    c = 'c';
                    break;
                }
                c = 65535;
                break;
            case 1074855404:
                if (str.equals(StringFog.decrypt("2jAgtP2784v7CSKh4b3jhvIPJ6Xv\n", "l1lOwJjcgeo=\n"))) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case 1079743836:
                if (str.equals(f1711)) {
                    c = 'Y';
                    break;
                }
                c = 65535;
                break;
            case 1090486275:
                if (str.equals(f1722)) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case 1134055712:
                if (str.equals(f1706)) {
                    c = 'd';
                    break;
                }
                c = 65535;
                break;
            case 1138147458:
                if (str.equals(f1728)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 1139753057:
                if (str.equals(StringFog.decrypt("7fYhnfk0xH/C8jyM\n", "r5dS+L9GpRg=\n"))) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1163838042:
                if (str.equals(f1748)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1164173445:
                if (str.equals(StringFog.decrypt("7FSwk40yANfqXK/cjHUD0OtQ89CUPB3K6FW80YM0A87gVfPKiTUK1e5VuJO3MgDH2Vqz2Lc+DPXm\nXqo=\n", "jzvdveBbbqM=\n"))) {
                    c = '_';
                    break;
                }
                c = 65535;
                break;
            case 1194888483:
                if (str.equals(f1745)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1253985693:
                if (str.equals(f1738)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(StringFog.decrypt("NbNxG6IGc48ItGQSnBx0khmzYAw=\n", "fN0FftB1B+Y=\n"))) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1306792763:
                if (str.equals(f1756)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1331885131:
                if (str.equals(StringFog.decrypt("VYxE11j8nFh6l0zFWOaC\n", "GeMlszGS+xk=\n"))) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case 1355875652:
                if (str.equals(f1724)) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 1357502028:
                if (str.equals(StringFog.decrypt("LwfIQ97zOfoBGOlB0PkW/Q==\n", "bGilLrGdc48=\n"))) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1448823153:
                if (str.equals(StringFog.decrypt("VlBWTrIXDilWUVFTth8ZJA==\n", "FzIlOsB2bV0=\n"))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1491724830:
                if (str.equals(f1735)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 1505622627:
                if (str.equals(StringFog.decrypt("SdrGURQ4RmBH0ttLFCRidg==\n", "C7uoP3FKBwQ=\n"))) {
                    c = 'Z';
                    break;
                }
                c = 65535;
                break;
            case 1541095059:
                if (str.equals(f1743)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 1607057168:
                if (str.equals(StringFog.decrypt("28T0ibv731Ls0fY=\n", "mrSE296Yujs=\n"))) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1658563378:
                if (str.equals(f1705)) {
                    c = 'e';
                    break;
                }
                c = 65535;
                break;
            case 1659288939:
                if (str.equals(f1739)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1704806948:
                if (str.equals(f1723)) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case 1746536452:
                if (str.equals(f1725)) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 1792690910:
                if (str.equals(f1757)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1884374718:
                if (str.equals(f1755)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1991923194:
                if (str.equals(f1731)) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 2004707743:
                if (str.equals(f1717)) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case 2038381641:
                if (str.equals(f1744)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2095560678:
                if (str.equals(f1726)) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case 2118015322:
                if (str.equals(f1734)) {
                    c = '.';
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
                return MTGConfiguration.class;
            case 1:
                return MIntegralSDKFactory.class;
            case 2:
                return MTGRewardVideoActivity.class;
            case 3:
                return VideoWebViewActivity.class;
            case 4:
                return AbstractActivity.class;
            case 5:
                return AbstractJSActivity.class;
            case 6:
                return MTGActivity.class;
            case 7:
                return MTGCommonActivity.class;
            case '\b':
                return MTGAuthorityActivity.class;
            case '\t':
                return Campaign.class;
            case '\n':
                return CampaignEx.class;
            case 11:
                return InterVideoOutListener.class;
            case '\f':
                return InterstitialVideoListener.class;
            case '\r':
                return RewardVideoListener.class;
            case 14:
                return MTGInterstitialActivity.class;
            case 15:
                return InterstitialListener.class;
            case 16:
            case 17:
                return MTGBannerView.class;
            case 18:
            case 19:
                return MTGBannerWebView.class;
            case 20:
                return MTGInterstitialHandler.class;
            case 21:
                return MTGInterstitialVideoHandler.class;
            case 22:
                return MTGRewardVideoHandler.class;
            case 23:
                return MTGBidInterstitialVideoHandler.class;
            case 24:
                return MTGBidRewardVideoHandler.class;
            case 25:
            case 26:
                return WallFragment.class;
            case 27:
                return NativeListener.class;
            case 28:
                return NativeListener.NativeTrackingListener.class;
            case 29:
                return NativeListener.NativeAdListener.class;
            case 30:
                return AppWallTrackingListener.class;
            case 31:
                return TabListFragment.class;
            case ' ':
                return ShuffleFragment.class;
            case '!':
                return MintegralAdActivity.class;
            case '\"':
                return BottomRefreshListView.class;
            case '#':
                return TabPageIndicator.class;
            case '$':
            case '%':
                return WallViewPager.class;
            case '&':
                return WallService.class;
            case '\'':
                return ImpressionCampaignExModel.class;
            case '(':
                return TabListView.class;
            case ')':
            case '*':
                return WallView.class;
            case '+':
                return CampaignUnit.class;
            case ',':
                return BaseFragment.class;
            case '-':
            case '.':
                return BrowserView.class;
            case '/':
                return WebViewFragment.class;
            case '0':
                return AppReceiver.class;
            case '1':
                return CommonJumpLoader.class;
            case '2':
            case '3':
                return MTGImageView.class;
            case '4':
                return MIntegralSDK.class;
            case '5':
                return MIntegralConstans.class;
            case '6':
                return RoverCampaignUnit.class;
            case '7':
                return MtgWallHandler.class;
            case '8':
                return MTGOfferWallHandler.class;
            case '9':
                return MtgBidCommonHandler.class;
            case ':':
                return LoadingActivity.class;
            case ';':
                return IDownloadListener.class;
            case '<':
                return interstitial.class;
            case '=':
                return BidManager.class;
            case '>':
                return BidResponsed.class;
            case '?':
            case '@':
                return BaseWebView.class;
            case 'A':
            case 'B':
                return WindVaneWebView.class;
            case 'C':
            case 'D':
                return MTGAlertDialog.class;
            case 'E':
            case 'F':
                return MintegralVideoView.class;
            case 'G':
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                return MintegralVastEndCardView.class;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return MintegralNativeEndCardView.class;
            case 'K':
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                return MintegralClickCTAView.class;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
            case 'N':
                return MintegralBaseView.class;
            case 'O':
            case 'P':
                return MintegralClickMiniCardView.class;
            case 'Q':
            case 'R':
                return MintegralContainerView.class;
            case 'S':
            case 'T':
                return MintegralH5EndCardView.class;
            case 'U':
            case 'V':
                return MintegralLandingPageView.class;
            case 'W':
            case 'X':
                return MintegralPlayableView.class;
            case 'Y':
                return OnMTGMediaViewListener.class;
            case 'Z':
                return BannerAdListener.class;
            case '[':
                return com.mintegral.msdk.video.signal.activity.AbstractJSActivity.class;
            case '\\':
            case ']':
                return com.mintegral.msdk.mtgsignalcommon.base.BaseWebView.class;
            case '^':
            case '_':
                return com.mintegral.msdk.mtgsignalcommon.windvane.WindVaneWebView.class;
            case '`':
            case 'a':
                return DomainMTGCommonActivity.class;
            case 'b':
            case 'c':
                return MBRewardVideoActivity.class;
            case 'd':
            case 'e':
                return BaseActivity.class;
            default:
                return null;
        }
    }
}
