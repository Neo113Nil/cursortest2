package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.イ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1141 extends AbstractC1100 {
    static {
        StringFog.decrypt("vr/+5HvtmO2IrPXuRQ==\n", "zdqQgDGe94M=\n");
        StringFog.decrypt("fr0IYZsFqMlaoRxFgwSjzw==\n", "H9lsJO1gxr0=\n");
        StringFog.decrypt("vxnKv0GzyNO7CNGO\n", "2Hy+/C7dprY=\n");
        StringFog.decrypt("mj+6k6hignmFLg==\n", "/VrO0McM9hw=\n");
        StringFog.decrypt("KkBERs2nqA==\n", "TSUwEqTKzes=\n");
        StringFog.decrypt("vKNSrWGN5Jy0s0WJ\n", "28Ym4QD+kMg=\n");
        StringFog.decrypt("XUCHbC9SNaVVUJBIGkgslA==\n", "OiXzIE4hQfE=\n");
        StringFog.decrypt("WpsfHIuHGTpTiio8ipwdNkmH\n", "Pf5rX/71a18=\n");
        StringFog.decrypt("H0WeSxS6G4gZVo9DFroRlBpY\n", "fDf7KmDfWPo=\n");
        StringFog.decrypt("z2ypNZO08Lfae74gjqLUoeVwqjs=\n", "rB7MVOfRsdM=\n");
        StringFog.decrypt("AJT4kM0D2BYGh+mYzwPSABA=\n", "Y+ad8blmm2Q=\n");
        StringFog.decrypt("kjmDGefvtBWVIocM+uWXNJA/hw==\n", "8UvmeJOK+XA=\n");
        StringFog.decrypt("iSZL4PaOjlmcMFbc/A==\n", "7kM/s5Ll2Dw=\n");
        StringFog.decrypt("Z1MwNGdOU7FkXRIXYFFWjW4=\n", "ADZEchIiP+I=\n");
        StringFog.decrypt("ki4fUYmiYTuUGA9psKh+JJwkBQ==\n", "9UtrAubNDFc=\n");
        StringFog.decrypt("43FRDNFfVYT1RkgI20g=\n", "gQM+bbU8NPc=\n");
        StringFog.decrypt("r5XvBljsuz2alfYoS+yWJqaW8iA=\n", "yPCbRz+J1Uk=\n");
        StringFog.decrypt("4JBi4H5mS1Tlg3LtfkZ5VO2WTfJlbQ==\n", "g+IHgQoDDzE=\n");
        StringFog.decrypt("5Y1NMTQZyGPhnFYADRLUdeuHVw==\n", "gug5clt3pgY=\n");
        StringFog.decrypt("cFeU6SR44oY=\n", "HDjzrFIdjPI=\n");
        StringFog.decrypt("eCw+oLWks+Z0LBmJsYm4\n", "EV9txN7t3bI=\n");
        StringFog.decrypt("R2EodQhuyatFQDlHD0jZq1RtM1o=\n", "IARcNGw6sNs=\n");
        StringFog.decrypt("wusFjZdwAUPL+jKhjGwWRdHhA4CDbxY=\n", "pY5xzuICcyY=\n");
        StringFog.decrypt("SkNrDrgDXFFDUlMkvgVLWkhUUSygFA==\n", "LSYfTc1xLjQ=\n");
        StringFog.decrypt("d3kusO4HR+FYZR+85TJL6HpPA77iDUvi\n", "Hgpt34BhLoY=\n");
        StringFog.decrypt("NSe5Dkihp6g1DKIESr+EuSYwrAhRqq+1Aie/LkKhtQ==\n", "UkLNTSfPwcE=\n");
        StringFog.decrypt("Z0a9b1fkzJ5pTqxEW9fGgmZKrg==\n", "ACPJKi+Uqew=\n");
        StringFog.decrypt("r4DYWrIhiIGhiMlxvgSelrqxw3SvPw==\n", "yOWsH8pR7fM=\n");
        StringFog.decrypt("3RBW892UJRzTGEfY0bAyD9MBUQ==\n", "unUitqXkQG4=\n");
        StringFog.decrypt("Nnbzn+vGV304fuK05+JAbjhn\n", "UROH2pO2Mg8=\n");
        StringFog.decrypt("kd6DPggnAZaZ1aMCBjEc\n", "9rv3bW1Ucv8=\n");
        StringFog.decrypt("pa+j4jEUEUyjvrY=\n", "wsrXr1RgcAg=\n");
    }

    /* renamed from: טּ, reason: contains not printable characters */
    public static boolean m4412() {
        return ((C0600) AbstractC0590.m4087()).f1007;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    public static boolean m4413() {
        return AbstractC0590.m4087().mo4093();
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    public static long m4414() {
        String str = AbstractC0530.f589;
        return Calendar.getInstance().getTimeInMillis();
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static String m4415() {
        return IronSourceAdQuality.getSDKVersion();
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static String m4416() {
        JSONObject jSONObject;
        C0783 c0783;
        C0600 c0600 = (C0600) AbstractC0590.m4087();
        synchronized (c0600) {
            jSONObject = c0600.f2998;
        }
        if (!jSONObject.optBoolean(c0600.f1026) || (c0783 = c0600.f1003) == null) {
            return null;
        }
        return c0783.f1829;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static HashMap m4417() {
        JSONObject jSONObject;
        C0600 c0600 = (C0600) AbstractC0590.m4087();
        synchronized (c0600) {
            jSONObject = c0600.f2998;
        }
        if (!jSONObject.optBoolean(c0600.f1025) || c0600.f1003 == null) {
            return null;
        }
        return new HashMap(c0600.f1003.f1831);
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static long m4418() {
        C0784 c0784;
        C0506 m4029 = C0506.m4029();
        synchronized (m4029) {
            c0784 = m4029.f469;
        }
        return c0784.f1840;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static JSONObject m4419() {
        C0784 c0784;
        C0506 m4029 = C0506.m4029();
        synchronized (m4029) {
            c0784 = m4029.f469;
        }
        return AbstractC1006.m4290(c0784.f1842, c0784.f1841, c0784.f1840, c0784.f1839);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static String m4420() {
        return ((C0600) AbstractC0590.m4087()).f1014.m4085();
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static JSONObject m4421() {
        JSONObject jSONObject;
        C0586 c0586 = ((C0600) AbstractC0590.m4087()).f1014;
        synchronized (c0586) {
            jSONObject = c0586.f2998;
        }
        return jSONObject.optJSONObject(C0586.f972);
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static String m4422(C0880 c0880) {
        return c0880.f2139.f1854.m4101();
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static Activity m4424() {
        return AbstractC0698.m4143().mo4146();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static String m4427(C0880 c0880) {
        return c0880.f2146.f1776.f1688;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m4428(C0880 c0880) {
        return c0880.f2139.f1857.f2831;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static C1094 m4431() {
        return new C1094();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static C0677 m4433() {
        return new C0677();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C0687 m4436() {
        return new C0687();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4442(C0880 c0880, ArrayList arrayList) {
        c0880.m4238((String) AbstractC1100.m4401(arrayList, 0, String.class), (JSONObject) AbstractC1100.m4401(arrayList, 1, JSONObject.class));
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static String m4425(C0880 c0880) {
        return c0880.f2139.f1854.mo4017();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Context m4430(C0880 c0880) {
        return c0880.f2139.f1853;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m4435(C0880 c0880) {
        return c0880.f2139.f1857.f2829;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C0786 m4437(C0880 c0880) {
        return c0880.f2139;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m4438(ArrayList arrayList) {
        return ISAdQualityAdType.fromInt(((Integer) AbstractC1100.m4401(arrayList, 0, Integer.class)).intValue()).name().toLowerCase();
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static JSONObject m4423() {
        JSONObject jSONObject;
        C0586 c0586 = ((C0600) AbstractC0590.m4087()).f1014;
        synchronized (c0586) {
            jSONObject = c0586.f2998;
        }
        return jSONObject;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static double m4426() {
        JSONObject jSONObject;
        C0600 c0600 = (C0600) AbstractC0590.m4087();
        synchronized (c0600) {
            jSONObject = c0600.f2998;
        }
        return jSONObject.optDouble(c0600.f1032, 1.0d);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m4429() {
        JSONObject jSONObject;
        AbstractC0590 m4087 = AbstractC0590.m4087();
        synchronized (m4087) {
            jSONObject = m4087.f2998;
        }
        return AbstractC1006.m4291(jSONObject, false);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m4432(ArrayList arrayList) {
        String decrypt = StringFog.decrypt("efNH3dhlO5hBxFLj\n", "OJcWqLkJUuw=\n");
        AbstractC0580.m4081(decrypt, decrypt, (String) AbstractC1100.m4401(arrayList, 0, String.class), true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4441(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        C1064 c1064 = (C1064) AbstractC1100.m4401(arrayList, 0, C1064.class);
        if (c1064 != null) {
            c0880.f2139.f1856.f624.add(new C1164(c1064, c0785, c0880));
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m4434(ArrayList arrayList) {
        JSONObject jSONObject;
        String str = (String) AbstractC1100.m4401(arrayList, 0, String.class);
        C0586 c0586 = ((C0600) AbstractC0590.m4087()).f1014;
        synchronized (c0586) {
            jSONObject = c0586.f2998;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(C0586.f972);
        if (optJSONObject == null) {
            return null;
        }
        return optJSONObject.opt(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0524 m4439() {
        return new C0524();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4443(ArrayList arrayList) {
        C0791 c0791;
        String str = (String) AbstractC1100.m4401(arrayList, 0, String.class);
        List m4402 = AbstractC1100.m4402(arrayList, 1);
        C1213 m4452 = C1213.m4452();
        synchronized (m4452) {
            c0791 = m4452.f3192;
        }
        if (c0791 != null) {
            c0791.m4205(str, m4402);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m4440(C0880 c0880) {
        return c0880.m4234();
    }
}
