package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.冖, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1161 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2958 = StringFog.decrypt("vbcuO8wXuWquuzUY5BK+ar23KD/HAKRqtLE/\n", "2tJadqlz0As=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2957 = StringFog.decrypt("y2Kf5gP0uL/JV4fGBMWsqsJzv94XxQ==\n", "rAfrp2egwc8=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2956 = StringFog.decrypt("SDSyNji8hExcIq8QO4iXXU4Bqh42qZtMQSWSBiWp\n", "L1HGf1XM9ik=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2955 = StringFog.decrypt("JDFBNrlTtPowJ1wQumen6yIGUBGwRrT2LTNmG78=\n", "Q1Q1f9Qjxp8=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2954 = StringFog.decrypt("Luqj9KDZ+t46/L7So+3pzyjdstOpzPrSJ+iE2ab/7ck65rjT\n", "SY/Xvc2piLs=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2953 = StringFog.decrypt("oXBMetoiBdW1ZlFc2RYWxKdRXV7WPBPjqWBKUNI=\n", "xhU4M7dSd7A=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2952 = StringFog.decrypt("R97tuwlCGuxTyPCdCnYJ/UHt+IANUwb9ad8=\n", "ILuZ8mQyaIk=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2951 = StringFog.decrypt("8mZYE0T/eQrmcEU1R8tqG/RNSS557nIA4Hc=\n", "lQMsWimPC28=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2950 = StringFog.decrypt("y5FC1FnxfhDfh1/yWsVtAc23RPhV9WUDyb1S\n", "rPQ2nTSBDHU=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2949 = StringFog.decrypt("OS08QtIkPZUtOyFk0RAuhD8JLH3aJjuZLS06T9A5Lpkw\n", "XkhIC79UT/A=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2948 = StringFog.decrypt("JIKDjOKm/sYwlJ6q4ZLt1yKklqj/t+XELa6T\n", "Q+f3xY/WjKM=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2947 = StringFog.decrypt("82q9pfWwD2Y=\n", "lA/J5IXARgI=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2946 = StringFog.decrypt("YGDqiIWofsg=\n", "BwWe2/HHDK0=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2945 = StringFog.decrypt("dTBsQ0chltJ3J1ttTSaPwWcneXZKL4jV\n", "ElUYAiNA5qY=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2944 = StringFog.decrypt("ZgkB5FndJqJsCRvAdNgRvnEJ\n", "AWx1tDW8Rcc=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2943 = StringFog.decrypt("m7pD018hp5+Ruln3fSGpnw==\n", "/N83gzNAxPo=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2942 = StringFog.decrypt("lVjvhT5SXWSfWPWhIXtfb5ZR/qc=\n", "8j2b1VIzPgE=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2941 = StringFog.decrypt("APJ8q3NyH7MC0mafeg==\n", "Z5cI6hcmZsM=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2940 = StringFog.decrypt("53i3+M/Ku5znaarFyN+yov1ut9TP26w=\n", "lB3DsaG+3u4=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2939 = StringFog.decrypt("tNyfMlrOITmj3I8sVso0LqncmQ==\n", "x7nrYD+5QEs=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2938 = StringFog.decrypt("Odo8i2GHGqY52zuLdw==\n", "WKlP7hPzSdI=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2937 = StringFog.decrypt("Acfw4kfNZQ==\n", "R6aZkAWkAa0=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2936 = StringFog.decrypt("FBKLfB3DC0c3Oo57HdAHWg==\n", "WXfvFXy3Yig=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2935 = StringFog.decrypt("4zkAN0O8\n", "ol1UTjPZP8U=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2934 = StringFog.decrypt("eIXsbdGU9dBe\n", "OeGfLr76k7k=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2933 = StringFog.decrypt("LMx/VxCAbGQP6nRQF51i\n", "YakbPnH0BQs=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2932 = StringFog.decrypt("bK0mhKtHOf5Isg+GoE4w9U4=\n", "PMFH584qXJA=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2931 = StringFog.decrypt("jA+O1vW4Mtio\n", "3GPvtZDVV7Y=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2930 = StringFog.decrypt("NiteAKt3kdsLLEsJlW2WxhorTxc=\n", "f0UqZdkE5bI=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2929 = StringFog.decrypt("/3OBbpww80nhf4V7izrzXw==\n", "rRb2D+5Uli0=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2928 = StringFog.decrypt("NY8H05wHog8TjDPAjRU=\n", "fOJ3ofl00WY=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2927 = StringFog.decrypt("FwZa0NmzntwqAU/Z\n", "XmgutavA6rU=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2926 = StringFog.decrypt("Agxhx1vnQbUmNHnUWw==\n", "UmAApD6KJNs=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2925 = StringFog.decrypt("oAiai2ru2v0=\n", "8m3t6hiKv5k=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2924 = StringFog.decrypt("KUXRbeWqeqgVQ80=\n", "ei2+GqraDsE=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2923 = StringFog.decrypt("WggJ/1dXqyA=\n", "GWlqlzIz6kQ=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2922 = StringFog.decrypt("qWRSRKt34FuDYFZHoXc=\n", "5wEmM8QFixo=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2921 = StringFog.decrypt("DQi0mh1uxm4jA7k=\n", "TGzV6mkLtD4=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2920 = StringFog.decrypt("ICLbIcLwk/QOKNw40eCT1hUv1T8=\n", "YUa6UbaV4bc=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2919 = StringFog.decrypt("Il0BVR2UTMkCSgk=\n", "ZytkO2nHOLs=\n");

    public C1161(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        try {
            try {
                return (String) FairBid.class.getDeclaredField(StringFog.decrypt("DmO29t0NL0YUaLM=\n", "XSf9qYtIfRU=\n")).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C0568 c0568 = C0860.m4221().f2085;
            String decrypt = StringFog.decrypt("kG04u3MeVdiTbTi7cx5V2JNtOLtzHio=\n", "zjZk3y41DvY=\n");
            c0568.getClass();
            return C0568.m4057((Object) null, FairBid.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2958, new C1317(this));
        hashMap.put(f2957, new C1300(this));
        hashMap.put(f2956, new C1299(this));
        hashMap.put(f2955, new C1286(this));
        hashMap.put(f2954, new C1285(this));
        hashMap.put(f2953, new C1256(this));
        hashMap.put(f2952, new C1216(this));
        hashMap.put(f2951, new C1192(this));
        hashMap.put(f2950, new C1177(this));
        hashMap.put(f2949, new C0406(this));
        hashMap.put(f2948, new C0399(this));
        hashMap.put(f2947, new C0394(this));
        hashMap.put(f2946, new C0391(this));
        hashMap.put(f2945, new C1351(this));
        hashMap.put(f2944, new C1350(this));
        hashMap.put(f2943, new C1345(this));
        hashMap.put(f2942, new C1341(this));
        hashMap.put(f2941, new C1329(this));
        hashMap.put(f2940, new C1325(this));
        hashMap.put(f2939, new C1309(this));
        hashMap.put(f2938, new C1307(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2041833493:
                if (str.equals(f2921)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1598046662:
                if (str.equals(f2933)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f2928)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -847426041:
                if (str.equals(f2920)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f2931)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -368841467:
                if (str.equals(f2923)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -174936018:
                if (str.equals(f2925)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f2926)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 438795617:
                if (str.equals(f2922)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 578208537:
                if (str.equals(f2937)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 769047372:
                if (str.equals(f2927)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 806552769:
                if (str.equals(f2924)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1062384924:
                if (str.equals(f2932)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1212533506:
                if (str.equals(f2929)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(f2930)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1775008410:
                if (str.equals(f2919)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1884304309:
                if (str.equals(f2936)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1955869213:
                if (str.equals(f2935)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1969669106:
                if (str.equals(f2934)) {
                    c = 3;
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
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case '\b':
                return RewardedListener.class;
            case '\t':
                return ImpressionData.class;
            case '\n':
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case '\f':
                return Rewarded.class;
            case '\r':
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                return AdapterPool.class;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
    }
}
