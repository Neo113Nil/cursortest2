package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭩ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1207 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3176 = StringFog.decrypt("BjsrEc0DJt8AODkvyy4QxwQ9KxPaDQE=\n", "YV5fRqhhcq0=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3175 = StringFog.decrypt("YjyotcqCiFRGOL+SyaeBT2YyiJLei5hBbQyulg==\n", "BVnc+qzk7SY=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3174 = StringFog.decrypt("YaeprfR2\n", "Kd7Z37kuomo=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3173 = StringFog.decrypt("TbwHbqIIdBRrsQVzgzxSCQ==\n", "BcV3HO9QN3s=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3172 = StringFog.decrypt("TPLJVyZ37oNoytFEJg==\n", "HJ6oNEMai+0=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3171 = StringFog.decrypt("nAE=\n", "3WWxvIbterk=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3170 = StringFog.decrypt("XTnWIT5M83F6Je4rPEzzbQ==\n", "GVymRFAolh8=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3169 = StringFog.decrypt("32DXc6wCIcjrRNNstyck2e4=\n", "jxKyH8NjRa0=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3168 = StringFog.decrypt("ECJS1fZhDa03K0fVz1A4rA==\n", "WFsip7s5Xd8=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3167 = StringFog.decrypt("HGbSU+J3Rps2SctE2Hh4ijxczk7cTnOSMVHDV+1OYw==\n", "VB+iIa8vEf4=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3166 = StringFog.decrypt("xquQ9ncY8B/IvNO5cQXyAsyg06t7Cq4K16WNsHYC80PtvY2qUjnXCMeSlL1oNukZzYeRt2wA4gHA\nipyuXQDy\n", "pcT92B9hgG0=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3165 = StringFog.decrypt("9JyeRnU7qhHzg4hRShClHciMmF1MGg==\n", "vOXuNDhj5H4=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3164 = StringFog.decrypt("4Dhde9pv31juLx403HLdReozHibWfYFL4CNZI9ti1gTLLkAn/07hRcwxVjDAZe5J9z5GPMZv\n", "g1cwVbIWryo=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3163 = StringFog.decrypt("i0velichcmClV9yyAxxKY7FzzZADD1Ryug==\n", "wzKu5Gp5PQY=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3162 = StringFog.decrypt("nWBYTbC1i+mTdxsCtqiJ9JdrGxC8p9X6nXtcFbG4grW2dkURlZS0/ZhqRzWxqYz+jE5WF7G6ku+H\n", "/g81Y9jM+5s=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3161 = StringFog.decrypt("ZhaES5VcsgRfGp1LvWCpD0gAhlS5cIkOQC6XTbFyiRVX\n", "Lm/0OdgE4GE=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3160 = StringFog.decrypt("FwXRwQdGod4ZEpKOAVujwx0OkpwLVP/NFx7VmQZLqII8E8ydImeDyQUf1Z0KW5jCEgXOgg5LuMMa\nK9+bBkm42A0=\n", "dGq8728/0aw=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3159 = StringFog.decrypt("HZpJRy4XotEmhm9cBjij3zuXS1oPI4XC\n", "VeM5NWNP4LA=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3158 = StringFog.decrypt("RWeseASpLWZ+aopjLIY4aGNqrmUlnR51\n", "DR7cCknxewc=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3157 = StringFog.decrypt("PZ0/LLjkpx0XsD0/k9qZGyONKim2054MB4sjMpDO\n", "deRPXvW88Hg=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3156 = StringFog.decrypt("P/zvAIJW9dYY/8wLhHzgzA==\n", "cJqJZfAVlLU=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3155 = StringFog.decrypt("j6TA1ataZcexou3js15g1Q==\n", "2MGigdk7A6E=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3154 = StringFog.decrypt("ozM8/aSLaEudNQv7mg==\n", "9FZeqdbqDi0=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3153 = StringFog.decrypt("mRJfRcL4H5ywGUF64NI2ur4FW0XgzD+cow==\n", "0WsvN4+gU/k=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3152 = StringFog.decrypt("K63YCS9KFUkCvcwtC3cveAy63AkNfjReEQ==\n", "Y9Soe2ISWDs=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3151 = StringFog.decrypt("IZOFD89jSqMPj4cq51lTrAydthLsT3eqBYaQDw==\n", "aer1fYI7BcU=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3150 = StringFog.decrypt("sRH/+yBhaJebPubsGg==\n", "+WiPiW05P/I=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3149 = StringFog.decrypt("lPYMrTBFYJy+2RW6Cl5bkLnhCA==\n", "3I98330dN/k=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3148 = StringFog.decrypt("tAuiI5VidkiaF6AHsV9OS446sz+8Vlxc\n", "/HLSUdg6OS4=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3147 = StringFog.decrypt("bldxJPqNMZJWVGUJ6bU8m0RDWyj7rz2ZREM=\n", "ITEXQYjbWPc=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3146 = StringFog.decrypt("lfc3gBk2AZe0/gSdOhogk7HiIoA=\n", "3Y5H8lRuUvw=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3145 = StringFog.decrypt("InalnEEWeo8Df5aBYjpbiwZjsJxAJ1qQD2GwnA==\n", "ag/V7gxOKeQ=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3144 = StringFog.decrypt("9T63BIAJ4ez3\n", "klvDReRdmJw=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3143 = StringFog.decrypt("5bT1cWquwOzvtO9VUrbT7Me/9Ew=\n", "gtGBIQbPo4k=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3142 = StringFog.decrypt("ii4n3dmIE9eJLj36xbAZ1YkuIdDSiwLYgyg2\n", "7UtTmbz4drk=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3141 = StringFog.decrypt("pwQsFIF9k6qpAy0kh3yuvA==\n", "wGFYUOgO59g=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3140 = StringFog.decrypt("6hxlyaWp1pvgHH/tiqfbiv8WffWsug==\n", "jXkRmcnItf4=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f3139 = StringFog.decrypt("OGIGDZMFlbU+Yxc5pQGNuw==\n", "XwdyXeFg+do=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f3138 = StringFog.decrypt("gP0LVtSVOt+C7Bp0xg==\n", "55h/BrXnW7I=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f3137 = StringFog.decrypt("1WjMz0Gxf9jyZs/Yfqhe3vRn1cl1\n", "nRG8vQzpPao=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f3136 = StringFog.decrypt("dS/23br+iX57OLWSvOOLY38ktYC27NdjYCXpn7P+10RvMOm+isWLY2Ez/oGT5I1lYCnvig==\n", "FkCb89KH+Qw=\n");

    public C1207(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        try {
            try {
                return (String) BuildConfig.class.getDeclaredField(StringFog.decrypt("4wz6CGdG2Jv7COUe\n", "tUmoWy4JlsQ=\n")).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C0568 c0568 = C0860.m4221().f2085;
            String decrypt = StringFog.decrypt("IAvBFIWCQQBVC8Fr\n", "flelT9nmb10=\n");
            c0568.getClass();
            return C0568.m4057((Object) null, BuildConfig.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3176, new C1332(this));
        hashMap.put(f3175, new C1330(this));
        hashMap.put(f3144, new C1320(this));
        hashMap.put(f3143, new C1290(this));
        hashMap.put(f3142, new C1274(this));
        hashMap.put(f3141, new C1224(this));
        hashMap.put(f3140, new C1222(this));
        hashMap.put(f3139, new C1218(this));
        hashMap.put(f3138, new C1215(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2118473762:
                if (str.equals(f3174)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2115661176:
                if (str.equals(f3157)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2082076211:
                if (str.equals(f3145)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2060981001:
                if (str.equals(f3170)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1783324338:
                if (str.equals(f3164)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1711062568:
                if (str.equals(f3167)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1632261541:
                if (str.equals(f3150)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1625751435:
                if (str.equals(f3160)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1429076201:
                if (str.equals(f3151)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1345825871:
                if (str.equals(f3168)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1289932600:
                if (str.equals(f3155)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1102538544:
                if (str.equals(f3147)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1056910325:
                if (str.equals(f3166)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -793729563:
                if (str.equals(f3165)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -684201479:
                if (str.equals(f3146)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -411143178:
                if (str.equals(f3162)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -352824194:
                if (str.equals(f3169)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -58290677:
                if (str.equals(f3158)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -52302939:
                if (str.equals(f3136)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -48720897:
                if (str.equals(f3163)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f3171)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 5206681:
                if (str.equals(f3137)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f3172)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 217655834:
                if (str.equals(f3173)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 748493318:
                if (str.equals(f3149)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 902272186:
                if (str.equals(f3152)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1056638846:
                if (str.equals(f3161)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1527993897:
                if (str.equals(f3156)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1564846544:
                if (str.equals(f3159)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1575934042:
                if (str.equals(f3148)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1775126662:
                if (str.equals(f3154)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1872662391:
                if (str.equals(f3153)) {
                    c = 21;
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
                return HyprMX.class;
            case 1:
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case '\b':
                return HyprMXWebViewWithClosableNavBar.class;
            case '\t':
            case '\n':
                return HyprMXNoOffersActivity.class;
            case 11:
            case '\f':
                return HyprMXOfferViewerActivity.class;
            case '\r':
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }
}
