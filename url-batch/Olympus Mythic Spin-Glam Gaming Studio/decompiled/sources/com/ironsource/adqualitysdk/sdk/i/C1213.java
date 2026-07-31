package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮅ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1213 extends IronSourceAdQuality {

    /* renamed from: 丫, reason: contains not printable characters */
    public static C1213 f3181;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public C0672 f3184;

    /* renamed from: טּ, reason: contains not printable characters */
    public C0654 f3185;

    /* renamed from: ףּ, reason: contains not printable characters */
    public C0545 f3187;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public C0916 f3188;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C1086 f3189;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public C1007 f3190;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public ISAdQualityAdListener f3191;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public C0791 f3192;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public Context f3194;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public ISAdQualityConfig f3201;

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3183 = StringFog.decrypt("YxydsH5EiARbK4iO\n", "InjMxR8o4XA=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3182 = StringFog.decrypt("lgsObl5k\n", "5WRhAzIFcBE=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0783 f3202 = new C0783();

    /* renamed from: ｋ, reason: contains not printable characters */
    public boolean f3200 = false;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public boolean f3199 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public boolean f3198 = false;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public boolean f3197 = false;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f3196 = false;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public ISAdQualityLogLevel f3195 = ISAdQualityLogLevel.INFO;

    /* renamed from: סּ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f3186 = new CopyOnWriteArraySet();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final C0495 f3193 = new C0495();

    static {
        StringFog.decrypt("k9C/0uNSiF+Sw6iS+E+sQYbjrNn5Vdc=\n", "9qbavJch7TE=\n");
        f3181 = null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m4450(C1213 c1213) {
        boolean z;
        synchronized (c1213) {
            z = c1213.f3197;
        }
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m4451(C1213 c1213) {
        synchronized (c1213) {
            c1213.f3199 = false;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4454(C1213 c1213, Context context) {
        c1213.getClass();
        try {
            context.registerReceiver(new C1281(), new IntentFilter(StringFog.decrypt("OG2HGWRcWlswbZcOZUEQFDp3igRlG3w0DVemOVJqfT0YTaQuTw==\n", "WQPjaws1PnU=\n")), null, AbstractC1026.f2538);
        } catch (Throwable th) {
            String str = f3183;
            AbstractC0580.m4080(str, str, StringFog.decrypt("BVmRuqgfsvksGIqzqhLh+SZK2LSsD+boMUHYpKgY9+Q1XYo=\n", "Qzj41s17ko0=\n"), th, null, true);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4457(C1213 c1213, boolean z) {
        synchronized (c1213) {
            c1213.f3197 = z;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void changeUserId(String str) {
        C0783 c0783;
        try {
            if (m4470(str)) {
                synchronized (this) {
                    c0783 = this.f3202;
                }
                boolean equals = str.equals(c0783.m4177());
                boolean z = !equals;
                boolean mo4144 = AbstractC0698.m4143().mo4144();
                if (!equals && mo4144) {
                    C1086 c1086 = this.f3189;
                    c1086.getClass();
                    AbstractC1026.m4313(new C1163(c1086));
                }
                m4468(this.f3194, str, z, true, mo4144);
            }
        } catch (Exception e) {
            AbstractC0577.m4069(f3183, AbstractC0584.m4083("QoYab+Mw6l5zgAFu9jDsSGKGIWSx\n", "B/RoAJEQmTs=\n", new StringBuilder(), str), e, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initializeWithGameId(Context context, String str) {
        initializeWithGameId(context, str, null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        boolean z;
        synchronized (this) {
            z = this.f3198;
        }
        if (z) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("6dJ/38j4vAvE1zGbyau7AceTfJ3Ysa4aw9x/2M69uQvExnTYkfiGPevXQI3dtKYa05NCvPf4uA/Z\nk2KQyayrAd3dPw==\n", "qrMR+LzYz24=\n"));
            return;
        }
        if (!m4462()) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("C8lhjLXbBoEmzC/ItIgBiyWIYs6lkhSQIcdhi7OeA4Em3WqL7Ns8twnMXt6glxyQMYhc74rbHJdo\nxmDf4ZIbjTzBbseogRCAZg==\n", "SKgPq8H7deQ=\n"));
            return;
        }
        C0654 c0654 = this.f3185;
        c0654.getClass();
        if (iSAdQualityCustomMediationRevenue != null) {
            if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
                AbstractC0580.m4074(C0654.f1389, StringFog.decrypt("pvE0dOnHVaCL9How6JRSqoiwNzb5jkexjP80c++CUKCL5T9pvZVDs4D+Lza9lE6qkPw+c/+CBquK\n/nc9+IBHsYzmPw==\n", "5ZBaU53nJsU=\n"));
                return;
            }
            ISAdQualityMediationNetwork mediationNetwork = iSAdQualityCustomMediationRevenue.getMediationNetwork();
            if (mediationNetwork == null || TextUtils.isEmpty(C0654.m4131(mediationNetwork))) {
                AbstractC0580.m4074(C0654.f1389, StringFog.decrypt("GaPWyjaRUxc0ppiON8JUHTfi1Ygm2EEGM63WzTDUVhc0t93XYtxJASmr1opi3EUWM6PMhC3fABw/\nts+CMNo=\n", "WsK47UKxIHI=\n"));
                return;
            }
            ISAdQualityAdType adType = iSAdQualityCustomMediationRevenue.getAdType();
            if (adType != ISAdQualityAdType.INTERSTITIAL && adType != ISAdQualityAdType.VIDEO && adType != ISAdQualityAdType.REWARDED_VIDEO && adType != ISAdQualityAdType.REWARDED) {
                AbstractC0580.m4074(C0654.f1389, StringFog.decrypt("kcYzmvHSNve8w33e8IEx/b+HMNjhmyTmu8gznfeXM/e80jiHpYEw4qLIL8nglmXztocpxPWXNrKz\n1Tid7Jwx96DUKdTxmyT+/ocr1OGXKr7y1TjK5IAh97aHK9Thlyqys8k5nfeXMvOgwzjZ\n", "0qddvYXyRZI=\n"));
                return;
            }
            AbstractC1026.m4317(new C0661(c0654, iSAdQualityCustomMediationRevenue), ((C0600) AbstractC0590.m4087()).f2997 != null ? r6.f2054.optInt(StringFog.decrypt("2dHldQ==\n", "uryXEcNdBcc=\n"), 3000) : 3000);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        boolean z;
        synchronized (this) {
            z = this.f3198;
        }
        if (z) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("Mx30KS+dZTQEXPtqe9F/IgQZ9GspnTtxOS/bagrIdz0ZCOMuCPldcQcd6S4o1WMlFBPtYHU=\n", "cHyaDlu9FlE=\n"));
        } else {
            this.f3191 = iSAdQualityAdListener;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        boolean z;
        synchronized (this) {
            z = this.f3198;
        }
        if (z) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("LDbUvIZfVpIbd9n0nBlMkE96mtKhPkGmGjbW8oYGBaQrHJrskwwFhAcizv+dCEvZ\n", "b1e6m/J/Jfc=\n"));
        } else if (m4464()) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("nwVh5eNY6ZuoRGyt+R7zmfxJL4vEOf6vqQVjq+MBuq2YLy+r5Fj7kq4BbqbuWPOQtRBmo/sR4Ju4\nSg==\n", "3GQPwpd4mv4=\n"));
        } else {
            this.f3201 = iSAdQualityConfig;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setMetaData(String str, String str2) {
        boolean z;
        try {
            synchronized (this) {
                z = this.f3198;
            }
            if (z) {
                AbstractC0580.m4074(f3183, StringFog.decrypt("RY/OXFqx9NZyzs0eWvCn12eawVsDsc7gR4rxDk/97sd/zvM/ZbHw0nXO0xNb5ePccYCO\n", "Bu6gey6Rh7M=\n"));
                return;
            }
            if (!m4462()) {
                AbstractC0580.m4074(f3183, StringFog.decrypt("b7khfdjTJJAWvzo0wc82iF+sMX389RaAZ6M1MdzSLsRlkh9918Mxi0SzdD7UyjuNWLF0esbDI6lT\nojUZ1NI2ww==\n", "NtZUXbWmV+Q=\n"));
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (!AbstractC0588.f974.contains(str)) {
                    if (AbstractC0588.m4086(m4465().f1831, str)) {
                        AbstractC0580.m4074(f3183, StringFog.decrypt("1LssxphVwrTGqjmj3Q==\n", "p95Yi/0ho/A=\n") + str + StringFog.decrypt("lQhV4PDe9C7WUBC4vJu5b9lNGLX23vRvwUtV\n", "tSR13IK7kE8=\n") + 5 + StringFog.decrypt("Qk6K39ytFqoWQs/d3OEHrhENz+La4x25C02Ii9DoBqpCR47f3K0Eqg5WioU=\n", "YiPvq72Ncss=\n"));
                        return;
                    }
                    if (!AbstractC1246.m4509(str, 64) || !AbstractC1246.m4509(str2, 64)) {
                        AbstractC0580.m4074(f3183, StringFog.decrypt("FaN+crrFaWYHsmsX/w==\n", "ZsYKP9+xCCI=\n") + str + StringFog.decrypt("JXhvvlNlJbdmICrmHyBo9nE8KqJNZS+xcTxv7UcgI7lxPG/2SWVhvWAtb+NPZGGibTFv9EBsNLMl\nJyftVGwl9mcxb+BEdDazYDpv\n", "BVRPgiEAQdY=\n") + 1 + StringFog.decrypt("7lDB9y8=\n", "zjGvkw9lcbY=\n") + 64 + StringFog.decrypt("+Ipyu1vyWSK9m2n0\n", "2Oka2imTOlY=\n"));
                        return;
                    }
                }
                C0783 m4465 = m4465();
                if (str == null) {
                    m4465.getClass();
                } else if (str2 == null) {
                    m4465.f1831.remove(str);
                } else {
                    m4465.f1831.put(str, str2);
                }
                if (StringFog.decrypt("uYN5kUgfpT2/i3KMSBivJamM\n", "zOId4hdswE4=\n").equals(str)) {
                    m4465().f1829 = str2;
                }
            }
        } catch (Exception e) {
            AbstractC0577.m4069(f3183, AbstractC0584.m4083("OJZMtCqceJkJkFe1P5xmmQmFHr85yGrc\n", "feQ+21i8C/w=\n", new StringBuilder(), str), e, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setSegment(ISAdQualitySegment iSAdQualitySegment) {
        boolean z;
        synchronized (this) {
            z = this.f3198;
        }
        if (z) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("c04g3dnz8rhEDz2fyr7ks0QPY9rkgMC5YVovlsSn+P1jawXa2rLy/UNHO47JvPazHg==\n", "MC9O+q3Tgd0=\n"));
        } else {
            AbstractC1026.m4316(new C1272(this, iSAdQualitySegment));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setUserConsent(boolean z) {
        C0783 c0783;
        synchronized (this) {
            c0783 = this.f3202;
        }
        c0783.f1835 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final synchronized void shutdown() {
        m4469(false);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized void m4459() {
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized void m4460() {
        if (m4461()) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("iYaUaeVBWke+x5Mg5QRbTKuL2jr0El0Cp4ieK7FMCWuZpp4f5ABFS76e2h3VKglVq5TaPfkUXUal\nkJRg\n", "yuf6TpFhKSI=\n"));
        } else if (m4462()) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("Xm4/WzaKfD4zciJbc4t3K387OEpljTknfH8pD3ScfyVhfmxGeJBtI3J3JVV/l35r\n", "ExtMLxb5GUo=\n"));
        } else {
            this.f3196 = true;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized boolean m4461() {
        return this.f3198;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final synchronized boolean m4462() {
        return this.f3200;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m4463() {
        return this.f3196;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (context instanceof Application) {
            m4467((Application) context, (Activity) null, str, (String) null, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m4467((Application) context.getApplicationContext(), (Activity) null, str, (String) null, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m4467(activity.getApplication(), activity, str, (String) null, iSAdQualityConfig);
        } else {
            String decrypt = StringFog.decrypt("Smm9Tnv0hB1qToV5bsrLGG1TiENL7YwLZhqfRUT1gAl3Gp1YTaGIBHBO3EhPoYoXI06FWk+hpBJ3\nU4pDXvjKMHNKkENJ4JEYbFQ=\n", "Azr8KiqB5XE=\n");
            AbstractC0580.m4074(f3183, decrypt);
            m4458(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initializeWithGameId(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (context instanceof Application) {
            m4467((Application) context, (Activity) null, (String) null, str2, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m4467((Application) context.getApplicationContext(), (Activity) null, (String) null, str2, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m4467(activity.getApplication(), activity, (String) null, str2, iSAdQualityConfig);
        } else {
            String decrypt = StringFog.decrypt("63B71wz+Zt/LV0PgGcAp2sxKTto8527JxwNZ3DP/YsvWA1vBOqtqxtFXGtE4q2jVgldDwzirRtDW\nSkzaKfIo8tJTVto+6nPazU0=\n", "oiM6s12LB7M=\n");
            AbstractC0580.m4074(f3183, decrypt);
            m4458(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0783 m4455(C1213 c1213) {
        C0783 c0783;
        synchronized (c1213) {
            c0783 = c1213.f3202;
        }
        return c0783;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m4464() {
        return this.f3199;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized C0783 m4465() {
        return this.f3202;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4467(Application application, Activity activity, String str, String str2, ISAdQualityConfig iSAdQualityConfig) {
        boolean z;
        ISAdQualityInitError iSAdQualityInitError;
        String str3;
        String decrypt;
        ISAdQualityInitError iSAdQualityInitError2;
        if (iSAdQualityConfig == null) {
            iSAdQualityConfig = new ISAdQualityConfig.Builder().build();
        }
        if (this.f3201 == null) {
            z = true;
        } else {
            try {
                String str4 = iSAdQualityConfig.getMetaData().get(StringFog.decrypt("/6K8QuCGrNPBpKFy6w==\n", "nsbNHYnoxac=\n"));
                if (!TextUtils.isEmpty(str4)) {
                    z = IronSourceNetworkBridge.jsonObjectInit(str4).optBoolean(StringFog.decrypt("QNYrX7WI/Vpb1BpZqYTWdUreK1auig==\n", "KbFFMMftoio=\n"));
                }
            } catch (Throwable unused) {
            }
            z = false;
        }
        if (!z) {
            iSAdQualityConfig = ISAdQualityConfig.merge(this.f3201, iSAdQualityConfig);
        }
        ISAdQualityConfig iSAdQualityConfig2 = iSAdQualityConfig;
        synchronized (this) {
            try {
                if (this.f3198) {
                    iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN;
                    str3 = StringFog.decrypt("AmaOSaqJCCcoc4kPssAbLGEqwCeN6AUYNGaMB6rQQRoFTMAZv9pBOilylAqx3g9n\n", "QQfgbt6pYUk=\n");
                } else if (this.f3199) {
                    iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED;
                    str3 = StringFog.decrypt("dO6YoKAwcWpUyaCXtQ4+b1PUra2QKXl8WJ24qIMgcWJEnbqlnSl1Yg==\n", "Pb3ZxPFFEAY=\n");
                } else if (this.f3200) {
                    iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED;
                    str3 = StringFog.decrypt("koIdla8ZQUGypSXRrShrDbK/NYWXDUxEobR8nJsYSEK/8T+QkExCSPu0JJSdGVRIv/Ezn5IVAEK1\nsjk=\n", "29Fc8f5sIC0=\n");
                } else {
                    this.f3199 = true;
                    iSAdQualityInitError = null;
                    str3 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iSAdQualityInitError != null) {
            if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN) {
                AbstractC0580.m4074(f3183, str3);
            }
            m4458(iSAdQualityConfig2.getAdQualityInitListeners(), iSAdQualityInitError, str3);
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfig2.getUserId()) && iSAdQualityConfig2.isUserIdSet()) {
            String decrypt2 = StringFog.decrypt("D5svztEvBIkljiiIyWYXgmyzEqjBXhiGIJM1kIVcKaxsjSidzS8DkiCWYYbXLwiKPI44ydB8CJVs\nkyXH\n", "TPpB6aUPbec=\n");
            AbstractC0580.m4074(f3183, decrypt2);
            synchronized (this) {
                this.f3199 = false;
            }
            m4458(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, decrypt2);
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            if (str2 != null) {
                decrypt = StringFog.decrypt("ou7KTmSknjqI+80IfO2NMcGihA5x6ZIdha/HCH6jg3SD6oQHZeibdI79hAx99IMtzw==\n", "4Y+kaRCE91Q=\n");
            } else {
                decrypt = StringFog.decrypt("JPSRkMW/wYIO4ZbW3fbSiUe439bB7+OJHrWc1t+43MwF8N/ZxPPEzAjn39Lc79yVSQ==\n", "Z5X/t7GfqOw=\n");
            }
            if (str2 != null) {
                iSAdQualityInitError2 = ISAdQualityInitError.ILLEGAL_GAME_ID;
            } else {
                iSAdQualityInitError2 = ISAdQualityInitError.ILLEGAL_APP_KEY;
            }
            AbstractC0580.m4074(f3183, decrypt);
            synchronized (this) {
                this.f3199 = false;
            }
            m4458(iSAdQualityConfig2.getAdQualityInitListeners(), iSAdQualityInitError2, decrypt);
            return;
        }
        synchronized (this) {
            this.f3186.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
        }
        AbstractC0585.m4084(application, activity);
        AbstractC1026.m4316(new C1336(this, iSAdQualityConfig2, str, str2, application, activity));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4453(C1213 c1213) {
        synchronized (c1213) {
            c1213.f3200 = true;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C1213 m4452() {
        synchronized (C1213.class) {
            try {
                if (f3181 == null) {
                    f3181 = new C1213();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3181;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4469(boolean z) {
        String str;
        String str2;
        C1079 c1079;
        try {
        } catch (Exception e) {
            AbstractC0577.m4069(f3183, StringFog.decrypt("JedJw6FnabEV4U/FvSA6vQ/iVQ==\n", "YJU7rNNHGtk=\n"), e, true, false, true);
        }
        if (m4461()) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("oL16zaQMzJKAmkL6sTKNiYidG8iZC8ifjZcb2p0M2ZqGmVWH\n", "6e47qfV5rf4=\n"));
            return;
        }
        if (!m4462()) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("qb9W53dlLsGJmG7QYltv2oGfN+1DZirfwIV56lJ5LsGJlnLnBj1vw4/MeeZDdG/Zj8xk61NkK8KX\ngjk=\n", "4OwXgyYQT60=\n"));
            return;
        }
        String decrypt = StringFog.decrypt("y+xXe5Do4Ifry28/ktnKy/XeZT+y9fSf5tBhcQ==\n", "gr8WH8Gdges=\n");
        if (z) {
            decrypt = decrypt + StringFog.decrypt("JKuyBzvpSpVVuKEEP71y0XShoRwwpnmc\n", "BM3AaFbJC/E=\n");
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (z) {
            str = "Kzx5d5Da\n";
            str2 = "WFkLAfWoXF0=\n";
        } else {
            str = "JGm1\n";
            str2 = "Vw3e1Du40Dg=\n";
        }
        try {
            jsonObjectInit.put(StringFog.decrypt("gg==\n", "8SrhzBYh9iY=\n"), StringFog.decrypt(str, str2));
        } catch (JSONException unused) {
        }
        this.f3189.m4388(StringFog.decrypt("sEv3dvY=\n", "xDuoAoXXYWE=\n"), jsonObjectInit);
        AbstractC0590 m4087 = AbstractC0590.m4087();
        String str3 = f3182;
        C0600 c0600 = (C0600) m4087;
        if (str3 != null) {
            c1079 = (C1079) c0600.mo4096().get(str3);
        } else {
            c0600.getClass();
            c1079 = null;
        }
        String str4 = c1079 != null ? c1079.f2729 : null;
        if (!TextUtils.isEmpty(str4)) {
            decrypt = decrypt + StringFog.decrypt("5DSrC7NUa5alMK0R4VQ=\n", "xEPCf9t0GfM=\n") + str4;
        }
        AbstractC0580.m4078(f3183, decrypt);
        m4458(this.f3186, ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, decrypt);
        this.f3198 = true;
        AbstractC0590.m4087().mo4089();
        C1223.m4471(this.f3194).m4473();
        this.f3192.m4197();
        C1007 c1007 = this.f3190;
        C0951 c0951 = c1007.f2439;
        c0951.f2269.unregisterReceiver(c0951);
        c1007.f2438 = true;
        this.f3189.m4377();
        C0860.m4220();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4470(String str) {
        boolean z;
        synchronized (this) {
            z = this.f3198;
        }
        if (z) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("PSCy7YG8zJ4fL7uv1enckwxhta7VsY+/LQC4m4D9w58KOPyZsdePgR8y/Lmd6duSETay5A==\n", "fkHcyvWcr/Y=\n"));
            return false;
        }
        if (!m4462()) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("hXO2Gtyl7l/8da1Txbn8R7Vmphr4g9xPjWmiVtik5AuPWIga07X7RK5541nQvPFCsnvjHdK4/EW7\neZZJ1KLUT/s=\n", "3BzDOrHQnSs=\n"));
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        AbstractC0580.m4074(f3183, StringFog.decrypt("GURkbf2nJZB3SHdt67UuxSMBcSioujWOOwF8P6ixLZIjWA==\n", "VyETTYjUQOI=\n"));
        return false;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4468(Context context, String str, boolean z, boolean z2, boolean z3) {
        C0783 c0783;
        synchronized (this) {
            c0783 = this.f3202;
        }
        String m4177 = c0783.m4177();
        m4465().m4178(str);
        if (str == null) {
            AbstractC0580.m4074(f3183, StringFog.decrypt("C43rmA8Sw+Q9usv3FHfD+D3/16IxX82xHrPcti5Ww/wvtNz3LkaR9G6r1vctUpDibr6ZoTxfivVu\nsda5cF2W/SL/zKQ4QcPYCv/NuH16sNAqjsy2MVqX6G6M/Zxz\n", "Tt+5110z45E=\n"));
        } else if (str.equals(StringFog.decrypt("WsFPO7YbG6gW1lk68wUUoU8=\n", "O682T95ydc8=\n"))) {
            String str2 = f3183;
            StringBuilder m4006 = AbstractC0446.m4006("PDJmqfnSZ14WFROUztMydBAOU8bfmyInHQVSh96fMycME1GUi7oDJw==\n", "eWA05qvzRwc=\n", new StringBuilder(), str);
            m4006.append(StringFog.decrypt("m4XeOcIhpoeVyO8+wmCml8fAriHIYKWDxtauNIc1u4vE0Ot10jOwkJXsynXBL6fC0MTtPYc1pofH\nhfo6hwmGo9H0+zTLKaGblfbKHok=\n", "taWOVadA1eI=\n"));
            AbstractC0580.m4074(str2, m4006.toString());
        } else {
            String str3 = f3183;
            AbstractC0580.m4081(str3, str3, AbstractC0584.m4083("xkhl6mWJ64v7dmX5KanMs790VNNltcuv7QdZ3GWpy/C/\n", "nycQmEXAuMo=\n", new StringBuilder(), str), true);
        }
        AbstractC0590 m4087 = AbstractC0590.m4087();
        C1289 c1289 = new C1289(this, z, context, z2, m4177, z3);
        C0600 c0600 = (C0600) m4087;
        Handler handler = c0600.f1018;
        if (handler != null) {
            handler.post(new C0630(c0600, c1289));
        }
        JSONObject m4466 = m4466();
        if (m4466 != null) {
            C0600 c06002 = (C0600) AbstractC0590.m4087();
            c06002.f1003 = m4465();
            c06002.mo4109(m4466);
            c06002.m4106();
            return;
        }
        AbstractC0590.m4087().mo4099(context, m4465(), true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m4466() {
        C0783 c0783;
        synchronized (this) {
            c0783 = this.f3202;
        }
        ConcurrentHashMap concurrentHashMap = c0783.f1831;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(StringFog.decrypt("t4OOgj0PHs6JhZOyNg==\n", "1uf/3VRhd7o=\n"))) {
            return null;
        }
        try {
            return IronSourceNetworkBridge.jsonObjectInit((String) concurrentHashMap.get(StringFog.decrypt("a6xGF5xQATBVqlsnlw==\n", "Csg3SPU+aEQ=\n")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4456(C1213 c1213, Context context) {
        String m4242 = c1213.f3188.m4242(StringFog.decrypt("Npjhv4ucANcWkg==\n", "X/aVkfj5c6Q=\n"));
        if (TextUtils.isEmpty(m4242)) {
            return;
        }
        String decrypt = StringFog.decrypt("ozJFCwVWoHS8bk8eTlCjObYuRQQZQKh0pA==\n", "10AkaGA0wRc=\n");
        String decrypt2 = StringFog.decrypt("B1aZ+PFhdBERWoTw6S1tAxpYmuzpaToR\n", "dDn2lZ0AWWI=\n");
        Context applicationContext = context.getApplicationContext();
        C0987 c0987 = new C0987(applicationContext, decrypt);
        C1056 c1056 = new C1056(AbstractC1038.f2629, applicationContext.getPackageName(), AbstractC0983.m4278(applicationContext), decrypt2);
        try {
            c0987.m4282(StringFog.decrypt("sL9qKidf9sWQtQ==\n", "2dEeBFQ6hbY=\n"), c1056.m4329(m4242));
        } catch (Throwable unused) {
        }
        c1213.f3188.m4241(StringFog.decrypt("5vABLZ9CjhDG+g==\n", "j551A+wn/WM=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4458(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        if (set == null) {
            return;
        }
        AbstractC1026.m4312(new C1232(set, iSAdQualityInitError, str));
    }
}
