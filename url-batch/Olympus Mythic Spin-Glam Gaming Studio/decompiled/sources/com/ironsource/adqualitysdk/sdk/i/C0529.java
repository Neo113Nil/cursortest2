package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Tap;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.VideoContentListenerAdapter;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IArichMediaVideoView;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϟ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0529 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f588 = StringFog.decrypt("nb9MqvK4EyGUrmib6KkEN4m/XLviuxQhia4=\n", "+to46YfKYUQ=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f587 = StringFog.decrypt("H2kknIdekmIc\n", "eAxQz/cx5is=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f586 = StringFog.decrypt("wvaRhEqWs17R9oux\n", "pZPlxS7V3DA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f585 = StringFog.decrypt("GbVyfHVOxAMCo1FnWEY=\n", "cMY0CRkit2A=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f584 = StringFog.decrypt("RyaMDaCd8mhK\n", "LlXaZMT4nSk=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f583 = StringFog.decrypt("bAmYvBw4WeNfBJ6QBTZS3XkA\n", "C2zs/3BROog=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f582 = StringFog.decrypt("aLqGASR39WN7\n", "D9/yTUUOmhY=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f581 = StringFog.decrypt("JYMLQf3lkLE2gxtH9uCBkS2IC2D35Zm3MA==\n", "QuZ/EpiJ9dI=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f580 = StringFog.decrypt("iE5Ev/qFkK+bTlSv8IeBqYFfc4PxnYejg0dVng==\n", "7ysw7J/p9cw=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f579 = StringFog.decrypt("VC2CwuvkJidABJ/06eQmNkE=\n", "M0j2h52BSFM=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f578 = StringFog.decrypt("nPDnGBC70J+c2fouErvQjp0=\n", "75WTXWbevus=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f577 = StringFog.decrypt("r7HpsIBVjd28\n", "yNSd8eQG/bI=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f576 = StringFog.decrypt("zJ3OsV50SwPCi8qIUWRrPtud/4pFcA==\n", "q/i65DAdP0c=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f575 = StringFog.decrypt("rByojaBvzFGJGLKut3zzXK4OlaQ=\n", "y3ncwNIOpTU=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f574 = StringFog.decrypt("L6OgKL9v76w7tb0OvFv8vSmCuwyzdvM=\n", "SMbUYdIfnck=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f573 = StringFog.decrypt("lSe/jH8he3G1P7SgYzR9d7Iovat/L292uTuQinkpbmyoMA==\n", "3EnR6Q1AGAU=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f572 = StringFog.decrypt("a9q9XXTlNx96m7kdfPknG2vBuQV3siYeY5uxEGb1IxN83LUAPNU7FG3HsRBm9SMfQdukFmDyNBZK\nx78EYfknO2vBuQV76Cw=\n", "CLXQcxKcVXo=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f571 = StringFog.decrypt("nAB4H/5QmXa8GHM8+V2WcbYccx/icJ5Dthp/DOVFgw==\n", "1W4Weowx+gI=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f570 = StringFog.decrypt("KbeT3FgF1Gg49pecUBnEbCmsl4RbUsVpIfafkUoVwGQ+sZuBEDXYYy+qn5FKFcBoDK2Snk0fxGgv\ntr+Wfx/CZDyxios=\n", "Stj+8j58tg0=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f569 = StringFog.decrypt("LxvC/HrobEAPA8nLYepneQMRxfhe4GtRCSXA+HHsfXUFAcXvYf12dwkHyQ==\n", "ZnWsmQiJDzQ=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f568 = StringFog.decrypt("1/4fG7wmJ9LGvxtbtDo31tflG0O/cTbT378TVq42M97A+BdG9BYr2dHjE1auNjPS5vgRXZc6Id7V\nxxtRvzAV29XoF0ebPDHewvgGTJkwN9I=\n", "tJFyNdpfRbc=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f567 = StringFog.decrypt("5PA7ViyD1Y7E6DByOrHGldk=\n", "rZ5VM17itvo=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f566 = StringFog.decrypt("5gPgbHok2r3GG+tIbBfcuNoI/X0=\n", "r22OCQhFuck=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f565 = StringFog.decrypt("MsT9vVBX+JsS3PaZRmT+gR/P4b1Q\n", "e6qT2CI2m+8=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f564 = StringFog.decrypt("L5UeZ7ZsJe4PjRVPoWkv+xKSH2yKbCv/\n", "ZvtwAsQNRpo=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f563 = StringFog.decrypt("Haak1Oq4L6AZhona47s0\n", "VOfnu4TeRsc=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f562 = StringFog.decrypt("9Z5hJUF9enzVhmoDXHJtbdKETC9daGtn0JxqMg==\n", "vPAPQDMcGQg=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f561 = StringFog.decrypt("DQbjqgbIE5otHuiaGsAErSsG+b0bxRyLNg==\n", "RGiNz3SpcO4=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f560 = StringFog.decrypt("09GVZxG4DNPzyZ5DB48Gwu3qlWsXmgDJ7s2Ubg+8HQ==\n", "mr/7AmPZb6c=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f559 = StringFog.decrypt("/k+uDOS0cYvHQL4s2a1n\n", "qyHHeKDdAvs=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f558 = StringFog.decrypt("5/AHuxnQ0OHR8ge7CNE=\n", "ooZi1W2jnIg=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f557 = StringFog.decrypt("0Q==\n", "g+zKcABqT0E=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f556 = StringFog.decrypt("7somk13d1QLO0i2wWtDaBcTWLZNB6t8SwssLmUHI0xjT5yeYW87ZGsvBOg==\n", "p6RI9i+8tnY=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f555 = StringFog.decrypt("kcLObCL8hFqx2sVPJfGLXbvexWw+3INrrsnOfSPRjl2syc5sIg==\n", "2KygCVCd5y4=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f554 = StringFog.decrypt("tSOTogNu9v2XL5mzIETq54YkkrU=\n", "40r3x2wtmZM=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f553 = StringFog.decrypt("ko+9dpHau1OZk6ZkkNGoc7KSvXaN0ag=\n", "2+HJE+O02j8=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f552 = StringFog.decrypt("ovsEROmqcRiPzB5EyI98DpT/GUTN\n", "4Jp3Ib/DFX0=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f551 = StringFog.decrypt("7YML\n", "ueJ7jcnW4MM=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f550 = StringFog.decrypt("kleYdk1S5V2yT5NVSl/qWrhLk3ZRcuJsrVyYZ0x/71qvXJh2TXLiSKtNk2E=\n", "2zn2Ez8zhik=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f549 = StringFog.decrypt("FH8hhLqXar00ZyqnvZpluj5jKoSmo2egKVIgj7yEZqUxdD0=\n", "XRFP4cj2Cck=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f548 = StringFog.decrypt("pW+cTejyJhqFd5dp/sUsC5tXm0z//AYBgnWXRu7QKgCYc51E9vY3\n", "7AHyKJqTRW4=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f547 = StringFog.decrypt("OyNtIp9V4SMNIW0ijlTsLh8lfCmZ\n", "flUITOsmrUo=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f546 = StringFog.decrypt("hWoHUSZzTeSnZg1ABVlR/rZtBkYIVEP6p2YR\n", "0wNjNEkwIoo=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f545 = StringFog.decrypt("k00wWDsMMyGzeA==\n", "2gx9KlplV2o=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f544 = StringFog.decrypt("TYG6QTZ2OKthooFaMmgfk2q0pVw7czmO\n", "BMDXM1cfXPw=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f543 = StringFog.decrypt("OyzaY0LC+Z4bGQ==\n", "cm2MCianltU=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f542 = StringFog.decrypt("LPvuU61T3DEK+NpAvEE=\n", "ZZaeIcggr1g=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f541 = StringFog.decrypt("NzmPtcXiZcQaEZyKz+5NzigRmKs=\n", "fnj93KaKKKE=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f540 = StringFog.decrypt("VVODzd9XfDN1S4ju2FpzNH9PiM3Dd3sCaliD3N56djRoWIPN32F2M3R0gNjfU2w0dVKD7MxCfg==\n", "HD3tqK02H0c=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f539 = StringFog.decrypt("Vg/0GHOgMa12F/88ZZc7vGgk7BhvtSGVdhLuGG+kII52FfI0bLEgvGwS8xJvhTOtfg==\n", "H2GafQHBUtk=\n");

    public C0529(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        return InneractiveAdManager.getVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f588, new C0643(this));
        hashMap.put(f587, new C0605(this));
        hashMap.put(f586, new C0589(this));
        hashMap.put(f585, new C0574(this));
        hashMap.put(f584, new C0573(this));
        hashMap.put(f583, new C0570(this));
        hashMap.put(f582, new C0567(this));
        hashMap.put(f581, new C0566(this));
        hashMap.put(f580, new C0536(this));
        hashMap.put(f579, new C0740(this));
        hashMap.put(f578, new C0709(this));
        hashMap.put(f577, new C0691(this));
        hashMap.put(f576, new C0670(this));
        hashMap.put(f575, new C0667(this));
        hashMap.put(f574, new C0644(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -1764994669:
                if (str.equals(f543)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1757761411:
                if (str.equals(f546)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1751837367:
                if (str.equals(f571)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1661930846:
                if (str.equals(f568)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1611796569:
                if (str.equals(f555)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1452673136:
                if (str.equals(f566)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1264220508:
                if (str.equals(f560)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1205203919:
                if (str.equals(f556)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1190251081:
                if (str.equals(f549)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f542)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -955341033:
                if (str.equals(f545)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -758374370:
                if (str.equals(f548)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -587023626:
                if (str.equals(f544)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -312786562:
                if (str.equals(f573)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -233888832:
                if (str.equals(f540)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -50587944:
                if (str.equals(f559)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 82:
                if (str.equals(f557)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 83843:
                if (str.equals(f551)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 114221977:
                if (str.equals(f562)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 218220615:
                if (str.equals(f564)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 294386593:
                if (str.equals(f567)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 305774826:
                if (str.equals(f539)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 334157136:
                if (str.equals(f541)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 598324252:
                if (str.equals(f561)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 652259752:
                if (str.equals(f550)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 778319234:
                if (str.equals(f547)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 809010015:
                if (str.equals(f553)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 986039922:
                if (str.equals(f554)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 996606931:
                if (str.equals(f563)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1840053850:
                if (str.equals(f572)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1945237502:
                if (str.equals(f569)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1956883725:
                if (str.equals(f558)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2019288557:
                if (str.equals(f570)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2082429859:
                if (str.equals(f552)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2110184418:
                if (str.equals(f565)) {
                    c = '\b';
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
                return InneractiveInternalBrowserActivity.class;
            case 2:
            case 3:
                return InneractiveFullscreenAdActivity.class;
            case 4:
            case 5:
                return InneractiveRichMediaVideoPlayerActivityCore.class;
            case 6:
                return InneractiveAdSpot.class;
            case 7:
                return InneractiveAdRequest.class;
            case '\b':
                return InneractiveAdRenderer.class;
            case '\t':
                return InneractiveMediationName.class;
            case '\n':
                return IAConfigManager.class;
            case 11:
                return InneractiveContentController.class;
            case '\f':
                return InneractiveUnitController.class;
            case '\r':
                return InneractiveAdViewUnitController.class;
            case 14:
                return UnitDisplayType.class;
            case 15:
                return InneractiveUnitController.EventsListener.class;
            case 16:
                return R.class;
            case 17:
                return InneractiveFullscreenVideoContentController.class;
            case 18:
                return InneractiveFullscreenAdEventsListener.class;
            case 19:
                return VideoContentListener.class;
            case 20:
                return InneractiveInternalBrowserActivity.InternalBrowserListener.class;
            case 21:
                return Tap.class;
            case 22:
                return InneractiveFullscreenAdEventsListenerAdapter.class;
            case 23:
                return InneractiveFullscreenUnitController.class;
            case 24:
                return InneractiveAdViewVideoContentController.class;
            case 25:
                return InneractiveUnitController.EventsListenerAdapter.class;
            case 26:
                return VideoContentListenerAdapter.class;
            case 27:
                return IAMraidKit.class;
            case 28:
                return IAmraidWebViewController.class;
            case 29:
                return IAVideoKit.class;
            case 30:
                return ImpressionData.class;
            case 31:
                return IArichMediaVideoView.class;
            case ' ':
                return IArichMediaVideoView.BaseVideoViewListener.class;
            case '!':
                return InneractiveFullscreenAdEventsListenerWithImpressionData.class;
            case '\"':
                return InneractiveAdViewEventsListenerWithImpressionData.class;
            default:
                return null;
        }
    }
}
