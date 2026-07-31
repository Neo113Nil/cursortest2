package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔆ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0880 {

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2123;

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2124;

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2125;

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2126;

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2127;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2128;

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2129;

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2130;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f2131;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final C1147 f2137;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public JSONObject f2138;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final C0786 f2139;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public C0945 f2140;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public C1067 f2141 = null;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public C1189 f2142;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0593 f2143;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0537 f2144;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0785 f2145;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0770 f2146;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f2136 = StringFog.decrypt("K/eB4yl5NJs1+5/4OHIQjQ==\n", "eZLsjF0cdf8=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2135 = StringFog.decrypt("FDfznWhugqM=\n", "dVSH9B4H9to=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f2134 = StringFog.decrypt("c2CAXg==\n", "BQnlKVoZSq8=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f2133 = StringFog.decrypt("KmiUpoZH\n", "XQH6wukwgn8=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f2132 = StringFog.decrypt("uOKBH4vzO/eV6JMTnuMs4rw=\n", "2YH1dv2aT44=\n");

    static {
        StringFog.decrypt("mDvq94zepUaGN/TsndWBUOQ=\n", "yl6HmPi75CI=\n");
        f2131 = StringFog.decrypt("GtEw5B2BXl0m3zvqEJNoAQ==\n", "Sb5fiXHgHC8=\n");
        StringFog.decrypt("r9lFfVf7VNCv3n19UuZFx4vIHw==\n", "7roxFCGSIKk=\n");
        StringFog.decrypt("6P0R3ysjJFLN4BHGDzVG\n", "vpR0qGpHaDs=\n");
        StringFog.decrypt("UoEVEJ3kCxlJgQgAl/0vDys=\n", "Beh7dPKTSn0=\n");
        StringFog.decrypt("D9oWVnt7G9oC0ARabmsMzyuX\n", "TrliPw0Sb6M=\n");
        StringFog.decrypt("Ws+rqHa0m5FJxA==\n", "M6HC3B/V9/g=\n");
        StringFog.decrypt("7RFFxwrM08P1EGU=\n", "jHUBrnm8v6I=\n");
        StringFog.decrypt("YBmtIIsWlAp4GI0MgBKKCg==\n", "AX3pSfhm+Gs=\n");
        StringFog.decrypt("p9vaIk/rdjWi\n", "xr+ZTiaIHVA=\n");
        StringFog.decrypt("T39ulCJ9+HFKXV+XJlTg\n", "Lhst+EsekxQ=\n");
        StringFog.decrypt("ZdcDtVIYCS0=\n", "BLNA2T1rbEk=\n");
        StringFog.decrypt("/ZhPaj9BouzomU95\n", "i/EqHX411o0=\n");
        StringFog.decrypt("WPcH3OR+9jNK0Qn26WLtG1n3C+s=\n", "L5Jln4wMmV4=\n");
        StringFog.decrypt("kNuOezGXMliWwIk=\n", "8679D176dy4=\n");
        StringFog.decrypt("Ur8i7MRwBG1JhQze1UAKZE++FvLQ\n", "PdFjnLQjYQM=\n");
        StringFog.decrypt("pIMPGhUev52+nyAPARi1r6SfKw0XI6+Hrw==\n", "y+1OamVM2uk=\n");
        StringFog.decrypt("5Zjemro6w1P+j9yLqzLBX+4=\n", "ivaf+c5TtTo=\n");
        StringFog.decrypt("ul1olFAgrTuhSnqDRTuvN7E=\n", "1TMp9yRJ21I=\n");
        StringFog.decrypt("EHe/BWKsONULYKwDZbAj2Rs=\n", "fxn+ZhbFTrw=\n");
        StringFog.decrypt("ACBU0A7crEUbN0XSD8a/SA==\n", "b04Vs3q12iw=\n");
        StringFog.decrypt("PEePnNM6QN4nUJ2LyCNG0jc=\n", "UynO/6dTNrc=\n");
        StringFog.decrypt("tmKK3IE1dIatdZjegzlLgap4qtGWOVGbuHiu\n", "2QzLv/VcAu8=\n");
        StringFog.decrypt("ozaLnmTVwwS4IY6YY8jHArU9rg==\n", "zFjK/RC8tW0=\n");
        f2130 = StringFog.decrypt("zxlx77xH1C0=\n", "pncbit8znl4=\n");
        f2129 = StringFog.decrypt("jC8jODOn8uyFKA==\n", "5lx3V3rJmIk=\n");
        f2128 = StringFog.decrypt("gjODR4D1eH0=\n", "6EDTNeWTEQU=\n");
        f2127 = StringFog.decrypt("7KK/Zt1uYr3Tog==\n", "mdHaI6UaENw=\n");
        f2126 = StringFog.decrypt("W35StYO9X34=\n", "Og4i8+zeKg0=\n");
        StringFog.decrypt("BYN5xH+GaqUImnr2dYt6pGo=\n", "RPMJghDlH9Y=\n");
        StringFog.decrypt("wLh7Oi4bVFfApUk=\n", "r9Y9VU1uJxs=\n");
        StringFog.decrypt("JwoedaiVjyEtFyx1uYWY\n", "SGRYGsvg/HM=\n");
        f2125 = StringFog.decrypt("ApySpmrocA4XgZ2kc+Q=\n", "Y/jTxR6BBmc=\n");
        f2124 = StringFog.decrypt("s3uX0wikGaCzbLL0DL4/\n", "0h/Bum3TWsw=\n");
        f2123 = StringFog.decrypt("tfIWVTWkeEKw1RJPEw==\n", "w5tzInbIGTE=\n");
    }

    public C0880(C0786 c0786, C0537 c0537, AbstractC0593 abstractC0593, C0770 c0770, C0785 c0785) {
        this.f2146 = c0770;
        C0785 c07852 = new C0785(new HashMap(), c0785, true);
        this.f2145 = c07852;
        Iterator it = c0770.m4162().iterator();
        while (it.hasNext()) {
            c07852.f1850.put((String) it.next(), null);
        }
        c0785.m4182(c0770.f1776.f1688, this);
        this.f2144 = c0537;
        this.f2143 = abstractC0593;
        this.f2142 = new C1189(this);
        this.f2139 = c0786;
        this.f2137 = new C1147();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m4230() {
        JSONObject jSONObject;
        ArrayList arrayList;
        Iterator it = this.f2146.m4164().iterator();
        while (it.hasNext()) {
            C0749 c0749 = (C0749) it.next();
            C0600 c0600 = (C0600) AbstractC0590.m4087();
            if (c0600.f1005 == null) {
                synchronized (c0600) {
                    jSONObject = c0600.f2998;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(c0600.f1031);
                if (optJSONArray != null) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        ISAdQualityAdType fromInt = ISAdQualityAdType.fromInt(optJSONArray.optInt(i));
                        if (fromInt != null) {
                            arrayList.add(fromInt);
                        }
                    }
                } else {
                    arrayList = null;
                }
                c0600.f1005 = arrayList;
            }
            ArrayList arrayList2 = c0600.f1005;
            ISAdQualityAdType iSAdQualityAdType = c0749.f1678;
            boolean z = true;
            if (arrayList2 != null && iSAdQualityAdType != ISAdQualityAdType.UNKNOWN) {
                z = true ^ arrayList2.contains(iSAdQualityAdType);
            }
            if (z) {
                m4236(c0749);
            }
        }
        String decrypt = StringFog.decrypt("7KJBXpwzaK/yrl9FjThMuZCuQlicP0in171J\n", "vscsMehWKcs=\n");
        ArrayList arrayList3 = new ArrayList();
        AbstractC1026.m4313(new C1185(this, decrypt, arrayList3));
        AbstractC1026.m4312(new C1179(this, decrypt, arrayList3));
        try {
            AbstractC1026.m4314(new C1152(new C1175(this, decrypt, arrayList3)));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m4231() {
        return this.f2139.f1857.f2830 + StringFog.decrypt("jQ==\n", "otookCWp/ok=\n") + this.f2146.f1776.f1688;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4236(C0749 c0749) {
        char c;
        String str = c0749.f1679;
        switch (str.hashCode()) {
            case -1825565413:
                if (str.equals(f2132)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1655966961:
                if (str.equals(f2135)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -787751952:
                if (str.equals(f2133)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3619493:
                if (str.equals(f2134)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1144592183:
                if (str.equals(f2126)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        C1150 c1150 = null;
        if (c == 0) {
            JSONObject m4235 = m4235(c0749.f1677);
            if (m4235 != null) {
                String str2 = c0749.f1674;
                if (!TextUtils.isEmpty(str2)) {
                    C1064 m4161 = str2 != null ? this.f2146.m4161(str2) : null;
                    if (m4161 != null) {
                        c1150 = new C1150(this, m4161, str2);
                    } else {
                        AbstractC0844.m4219(m4231(), AbstractC1293.m4543("NaCJV8vkB7h7qg==\n", "Fc7mI+uCaM0=\n", AbstractC0446.m4006("KSerrMF06R4BJLaqx2SgFQpiuavcMA==\n", "ZELfxK4QyXo=\n", new StringBuilder(), str2)), null, null);
                    }
                }
                C1150 c11502 = c1150;
                C1066 c1066 = new C1066(this, false);
                C1066 c10662 = new C1066(this, true);
                C1147 c1147 = this.f2137;
                C1022 c1022 = new C1022(this, c10662, c1066);
                C1204 c1204 = new C1204(this);
                c1147.getClass();
                AbstractC1026.m4312(new C1180(c1147, m4235, c11502, c1022, c1204));
            }
            m4237(f2135, c0749);
            return;
        }
        if (c == 1) {
            JSONObject m42352 = m4235(c0749.f1677);
            if (m42352 != null) {
                String str3 = c0749.f1675;
                C1037 c1037 = new C1037(this, true);
                C1037 c10372 = new C1037(this, false);
                if (TextUtils.isEmpty(str3)) {
                    C1147 c11472 = this.f2137;
                    C0999 c0999 = new C0999(this, c1037, c10372);
                    c11472.getClass();
                    AbstractC1026.m4312(new C1154(c11472, m42352, null, c0999));
                } else {
                    C1064 m41612 = str3 != null ? this.f2146.m4161(str3) : null;
                    if (m41612 != null) {
                        C1149 c1149 = new C1149(this, m41612);
                        C1147 c11473 = this.f2137;
                        C0999 c09992 = new C0999(this, c1037, c10372);
                        c11473.getClass();
                        AbstractC1026.m4312(new C1154(c11473, m42352, c1149, c09992));
                    } else {
                        AbstractC0844.m4219(m4231(), AbstractC1293.m4543("KkvC+74hG6pkQQ==\n", "CiWtj55HdN8=\n", AbstractC0446.m4006("tgUB3FoTqN2eBhzaXAPh1pVAE9tHVw==\n", "+2B1tDV3iLk=\n", new StringBuilder(), str3)), null, null);
                    }
                }
            }
            m4237(f2134, c0749);
            return;
        }
        if (c == 2) {
            JSONObject m42353 = m4235(c0749.f1677);
            if (m42353 != null) {
                C1031 c1031 = new C1031(this, false);
                C1031 c10312 = new C1031(this, true);
                C1147 c11474 = this.f2137;
                C1000 c1000 = new C1000(this, c10312, c1031);
                c11474.getClass();
                AbstractC1026.m4312(new C1167(c11474, m42353, c1000));
            }
            m4237(f2133, c0749);
            return;
        }
        if (c != 3) {
            if (c != 4) {
                return;
            }
            this.f2140 = new C0945(new C1199(this, m4233(c0749.f1676)));
        } else if (this.f2141 == null) {
            this.f2141 = new C1067(this, m4233(c0749.f1676));
            AbstractC0698 m4143 = AbstractC0698.m4143();
            C1067 c1067 = this.f2141;
            synchronized (m4143) {
                m4143.f1553.add(c1067);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4237(String str, C0749 c0749) {
        char c;
        JSONObject m4235 = m4235(c0749.f1677);
        if (m4235 == null || !m4235.has(StringFog.decrypt("yXQ5oJvAcSfYeDiqnOpAKs1+\n", "vRtMw/OEFFM=\n"))) {
            return;
        }
        String str2 = null;
        EnumC0814 m4214 = EnumC0814.m4214(m4235.optString(StringFog.decrypt("KkRrEdBSTy87SGob13h+Ii5O\n", "XisecrgWKls=\n"), null));
        int hashCode = str.hashCode();
        if (hashCode == -1655966961) {
            if (str.equals(f2135)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -787751952) {
            if (hashCode == 3619493 && str.equals(f2134)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(f2133)) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            str2 = m4235.optString(f2125, null);
        } else if (c == 1) {
            str2 = m4235.optString(f2124, null);
        } else if (c == 2) {
            str2 = m4235.optString(f2123, null);
        }
        if (m4214 != null) {
            C0813 m4209 = C0813.m4209();
            synchronized (m4209) {
                m4209.f2002.post(new C0925(m4209, str2, m4214));
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m4229(C0880 c0880, Activity activity, ArrayList arrayList) {
        c0880.getClass();
        return arrayList.isEmpty() || arrayList.contains(activity.getClass().getName());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m4227(C0880 c0880, Activity activity) {
        c0880.getClass();
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(AbstractC1183.f3069, c0880.f2139.f1857.f2831);
            jsonObjectInit.put(AbstractC1183.f3023, c0880.f2139.f1857.f2829);
            jsonObjectInit.put(AbstractC1183.f3022, c0880.f2139.f1854.mo4017());
            jsonObjectInit.put(StringFog.decrypt("xigPLXvbmg==\n", "p0t7Yxq2/28=\n"), activity.getClass().getName());
        } catch (JSONException unused) {
            AbstractC0580.m4072(f2136, StringFog.decrypt("wPhMMfxeQG7g60o34BkDfeb+HjT9EU086uhUO+0K\n", "hYo+Xo5+Ixw=\n"));
        }
        return jsonObjectInit;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4228(C0880 c0880, String str, boolean z, boolean z2, List list) {
        boolean z3;
        c0880.getClass();
        try {
            C0575 m4163 = c0880.f2146.m4163(str);
            if (m4163 != null) {
                String str2 = m4163.f964;
                C1064 m4161 = c0880.f2146.m4161(str2);
                if (m4161 != null) {
                    if (z == m4163.f966 && z2 == m4163.f965) {
                        C1213 m4452 = C1213.m4452();
                        synchronized (m4452) {
                            z3 = m4452.f3196;
                        }
                        if (z3) {
                            String m4231 = c0880.m4231();
                            int i = AbstractC0844.f2067;
                            String str3 = StringFog.decrypt("S60V3Q==\n", "GP9Z/f7u1W0=\n") + m4231;
                            AbstractC0580.m4081(str3, str3, str, false);
                        }
                        m4161.m4337(c0880.f2145, c0880, list);
                        return;
                    }
                    return;
                }
                new C0748(c0880, str2, StringFog.decrypt("RNs5WkHytuRvzSdcXbX+4HfMJUET\n", "AalLNTPS3oU=\n") + str).m4002(c0880.m4231());
            }
        } catch (Throwable th) {
            AbstractC0844.m4219(c0880.m4231(), AbstractC0584.m4083("1D9+neKQCHH/KWCb/tdAdecoYoaw\n", "kU0M8pCwYBA=\n", new StringBuilder(), str), th, null);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4232(String str) {
        Class cls;
        AbstractC0593 abstractC0593 = this.f2143;
        String substring = str.substring(0, str.length() - StringFog.decrypt("ijX4yZig\n", "pFaUqOvTwtk=\n").length());
        abstractC0593.getClass();
        try {
            if (Prode.class.getName().equals("com.ironsource.adqualitysdk.sdk.i.Prode")) {
                cls = abstractC0593.m4102(substring, false);
            } else {
                cls = abstractC0593.mo3941(substring);
            }
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            return cls.getName();
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m4234() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(AbstractC1183.f3069, this.f2139.f1857.f2831);
            jsonObjectInit.put(AbstractC1183.f3022, this.f2139.f1854.mo4017());
            jsonObjectInit.put(AbstractC1183.f3023, this.f2139.f1857.f2829);
        } catch (JSONException e) {
            AbstractC0580.m4072(f2136, StringFog.decrypt("1E65jXZ5CYz0Xb+Laj5Km+dZpZYkMxmR/wbr\n", "kTzL4gRZav4=\n") + e.getLocalizedMessage());
        }
        return jsonObjectInit;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m4235(JSONObject jSONObject) {
        C0484 c0484;
        String str = f2128;
        String optString = jSONObject.optString(str);
        jSONObject.remove(str);
        String str2 = f2130;
        if (jSONObject.optBoolean(str2)) {
            C0786 c0786 = this.f2139;
            synchronized (c0786) {
                c0484 = c0786.f1851;
            }
            if (c0484 != null) {
                if (!TextUtils.isEmpty(c0484.f422)) {
                    jSONObject.remove(str2);
                    try {
                        jSONObject.put(f2129, optString + c0484.f422);
                    } catch (JSONException unused) {
                    }
                }
                if (c0484.f421) {
                    try {
                        jSONObject.put(f2127, true);
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof String) {
                String str3 = (String) opt;
                if (str3.endsWith(StringFog.decrypt("3Im8axRB\n", "8urQCmcyEsA=\n"))) {
                    String m4232 = m4232(str3);
                    if (m4232 != null) {
                        try {
                            jSONObject.put(next, m4232);
                        } catch (JSONException unused3) {
                        }
                    } else {
                        String m4231 = m4231();
                        String m4543 = AbstractC1293.m4543("q9I1wGDMp5nl2HqZYMuqg/nIM9oniqSF+Mg/2iXY6J/uyC/E\n", "i7xatECqyOw=\n", AbstractC0446.m4006("DXTpEdz7\n", "ThiIYq/blyw=\n", new StringBuilder(), str3));
                        int i = AbstractC0844.f2067;
                        String m4083 = AbstractC0584.m4083("S60V3Q==\n", "GP9Z/f7u1W0=\n", new StringBuilder(), m4231);
                        AbstractC0580.m4081(m4083, m4083, m4543, false);
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (opt instanceof JSONArray) {
                jSONObject.put(next, new JSONArray((Collection) m4233(AbstractC1006.m4289((JSONArray) opt))));
            }
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m4233(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.endsWith(StringFog.decrypt("3Im8axRB\n", "8urQCmcyEsA=\n"))) {
                String m4232 = m4232(str);
                if (m4232 != null) {
                    arrayList.add(m4232);
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4238(String str, JSONObject jSONObject) {
        C1353 c1353;
        if (str.equals(StringFog.decrypt("LEWYXqdNBNMsWKJe\n", "TSHHOs4+dL8=\n"))) {
            C0546 c0546 = this.f2139.f1856;
            c0546.getClass();
            int optInt = jSONObject.optInt(AbstractC1183.f3066);
            C1353 c13532 = c0546.f627;
            if (c13532 != null) {
                c13532.adDisplayed(jSONObject.optString(AbstractC1183.f3069), ISAdQualityAdType.fromInt(optInt));
            }
        } else if (str.equals(StringFog.decrypt("gcsgvnylk12E\n", "4K9/3RDK4Dg=\n")) && (c1353 = this.f2139.f1856.f627) != null) {
            c1353.adClosed(jSONObject.optString(AbstractC1183.f3069), ISAdQualityAdType.fromInt(jSONObject.optInt(AbstractC1183.f3066)));
        }
        JSONObject m4234 = m4234();
        AbstractC1006.m4293(m4234, jSONObject, false);
        JSONObject m4291 = AbstractC1006.m4291(m4234, false);
        if (str.equals(AbstractC1183.f3029)) {
            C0546 c05462 = this.f2139.f1856;
            c05462.f626.post(new C0571(c05462, C0546.f619, m4291));
            return;
        }
        if (str.equals(AbstractC1183.f3028)) {
            C0546 c05463 = this.f2139.f1856;
            c05463.f626.post(new C0571(c05463, C0546.f618, m4291));
            return;
        }
        if (str.equals(AbstractC1183.f3030)) {
            C0546 c05464 = this.f2139.f1856;
            c05464.f626.post(new C0571(c05464, C0546.f620, m4291));
            return;
        }
        if (str.equals(AbstractC1183.f3031)) {
            C0546 c05465 = this.f2139.f1856;
            c05465.f626.post(new C0571(c05465, C0546.f621, m4291));
            return;
        }
        if (str.equals(AbstractC1183.f3027)) {
            C0546 c05466 = this.f2139.f1856;
            c05466.f626.post(new C0571(c05466, C0546.f617, m4291));
        } else if (str.equals(AbstractC1183.f3025)) {
            C0546 c05467 = this.f2139.f1856;
            c05467.f626.post(new C0571(c05467, C0546.f615, m4291));
        } else if (str.equals(AbstractC1183.f3026)) {
            C0546 c05468 = this.f2139.f1856;
            c05468.f626.post(new C0571(c05468, C0546.f616, m4291));
        } else {
            C0546 c05469 = this.f2139.f1856;
            c05469.f626.post(new C0571(c05469, str, jSONObject));
        }
    }
}
