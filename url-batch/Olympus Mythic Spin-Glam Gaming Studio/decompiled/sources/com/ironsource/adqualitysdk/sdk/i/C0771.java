package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮠ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0771 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1814 = StringFog.decrypt("bJEUiRvHsoZmkQ6tI9+hhk6aFbQ=\n", "C/Rg2Xem0eM=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1813 = StringFog.decrypt("Z/lG2Ol+w0Jr6ULN9EPHdW7pXw==\n", "AJwymY0zojA=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1812 = StringFog.decrypt("TPxaknv07YZE/Uu6\n", "K5ku1hqAjMs=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1811 = StringFog.decrypt("r0vc60rwKuGpWsHcS+ch9K0=\n", "yC6oqi6zWIQ=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1810 = StringFog.decrypt("pb/LSLGmLgatsvJOpaYbGw==\n", "7NGGJ9PPb2I=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1809 = StringFog.decrypt("p2a2pfEDbU2mYPX5/QNkR7Zgtey2JG5vq2uyyvwsY1atf7L/4Q==\n", "xAnbi5htACI=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1808 = StringFog.decrypt("RsPFr0xsYZBOzvypWGxUjVmV\n", "D62IwC4FIPQ=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1807 = StringFog.decrypt("nYroAnr93BKcjKtNd+CfD5uL4Ulh+t8a0KzrYXzx2DyapOZYeuXYCYc=\n", "/uWFLBOTsX0=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1806 = StringFog.decrypt("dctTvh6tW7lfz0iBAa16\n", "O6on12jIDdA=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1805 = StringFog.decrypt("Eb8nAIOnBIYEohoE\n", "UNtqYfHMcfY=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1804 = StringFog.decrypt("Yl/EHZbo97hNXvU=\n", "IzuHcvicltE=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1803 = StringFog.decrypt("bffQ5fufgohYwszu7oiZklb3zQ==\n", "P5K+gZ7t6+Y=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1802 = StringFog.decrypt("qZmbAECHtcCNoYMTQA==\n", "+fX6YyXq0K4=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1801 = StringFog.decrypt("BzfiVFDQDWYn\n", "QkGHOiSEdBY=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1800 = StringFog.decrypt("eCtmp/maELNfK066\n", "MUUryJvzUtI=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1799 = StringFog.decrypt("Wkbk5zVEMHRdUe/nJHoYY2xC5Owi\n", "GCeKiVA2cRA=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1798 = StringFog.decrypt("2cq7Qt2cyifkwYRey5z3IPHI\n", "kKT2Lb/1g0k=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1797 = StringFog.decrypt("hpVieE22dlW7kndxfqFHSqqVYlFWtnZZoZ5k\n", "z/sWHT/FAjw=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1796 = StringFog.decrypt("TiwntDCbssFFOzazMrKa1nQoPbg0\n", "AE1T3Ub+86U=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1795 = StringFog.decrypt("w9aulYz6Pq77y4aZkMstpfDN\n", "lb/K8OO/SMs=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1794 = StringFog.decrypt("RSTDGHoDMEVn\n", "DEqOdxhqYyE=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1793 = StringFog.decrypt("xiUJSQFlKk3dLjVTBn8f\n", "j0tEJmMMayk=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1792 = StringFog.decrypt("nGd1oJP+NSKLag==\n", "yg4Q1/KcWUc=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1791 = StringFog.decrypt("jSfyvWci\n", "zEOn0w5WaEg=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1790 = StringFog.decrypt("ngoMuvnOgTWzEhu/6tmFObUcObfu26c1og==\n", "0Gt404+r01A=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1789 = StringFog.decrypt("zr53Yeag8+jEvm1Fw6U=\n", "qdsDMYrBkI0=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1788 = StringFog.decrypt("2Es9G3hXBPrM\n", "vy5JWhwEYY4=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1787 = StringFog.decrypt("tITtwuQMo6e4kw==\n", "3fe/p5Nt0cM=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1786 = StringFog.decrypt("/1YcnMia\n", "mDNo3azp0BQ=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1785 = StringFog.decrypt("pbWAHJhhd/i6pLA+g24=\n", "wtD0X/cPA50=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1784 = StringFog.decrypt("YrLLGaC5b/9hpA==\n", "Bde/S8XODo0=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1783 = StringFog.decrypt("J6cA3jy1Gg0ztg==\n", "QMJ0iVnXTGw=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1782 = StringFog.decrypt("RYdmpTav63RLlHevIA==\n", "IuIS5kTKigA=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1781 = StringFog.decrypt("buwXgJAZuY594BCkkCyzkn3sDbU=\n", "CYljwfRv3Pw=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1780 = StringFog.decrypt("N6EquUjA2cUFoA==\n", "dsV43Duwtqs=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1779 = StringFog.decrypt("A8gpkVQ=\n", "Qqx69CDyhjM=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1778 = StringFog.decrypt("MwI=\n", "cmauQ3Dn0zE=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1777 = StringFog.decrypt("Z0RN5pMzMxVFX0I=\n", "JCsjkvZLR1E=\n");

    public C0771(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        return InMobiSdk.getVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1814, new C0874(this));
        hashMap.put(f1813, new C0871(this));
        hashMap.put(f1812, new C0870(this));
        hashMap.put(f1811, new C0867(this));
        hashMap.put(f1789, new C0866(this));
        hashMap.put(f1788, new C0865(this));
        hashMap.put(f1787, new C0864(this));
        hashMap.put(f1786, new C0820(this));
        hashMap.put(f1785, new C0776(this));
        hashMap.put(f1784, new C0893(this));
        hashMap.put(f1783, new C0888(this));
        hashMap.put(f1782, new C0878(this));
        hashMap.put(f1781, new C0875(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2044438337:
                if (str.equals(f1803)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1769689844:
                if (str.equals(f1794)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1716191362:
                if (str.equals(f1804)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1405271692:
                if (str.equals(f1790)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1401317165:
                if (str.equals(f1795)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1304544044:
                if (str.equals(f1796)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1062227179:
                if (str.equals(f1809)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -808014786:
                if (str.equals(f1793)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -595852006:
                if (str.equals(f1800)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -560158238:
                if (str.equals(f1808)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -541364416:
                if (str.equals(f1810)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -520974940:
                if (str.equals(f1780)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -235933147:
                if (str.equals(f1805)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -204096109:
                if (str.equals(f1807)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -93733047:
                if (str.equals(f1806)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -32161126:
                if (str.equals(f1798)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f1778)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 63090975:
                if (str.equals(f1779)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f1802)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 515339810:
                if (str.equals(f1792)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 957243679:
                if (str.equals(f1799)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1228411167:
                if (str.equals(f1797)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1564529113:
                if (str.equals(f1777)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1955888231:
                if (str.equals(f1791)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2035398868:
                if (str.equals(f1801)) {
                    c = '\t';
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
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case '\b':
                return AdContainer.RenderingProperties.PlacementType.class;
            case '\t':
                return AdContainer.EventType.class;
            case '\n':
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case '\f':
                return InMobiSdk.class;
            case '\r':
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            case 21:
                return AdResponse.class;
            case 22:
                return AdSet.class;
            case 23:
                return Ad.class;
            case 24:
                return ContextData.class;
            default:
                return null;
        }
    }
}
