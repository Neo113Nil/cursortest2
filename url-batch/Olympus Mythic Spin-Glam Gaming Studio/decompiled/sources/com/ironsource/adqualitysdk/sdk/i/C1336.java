package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾅ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1336 extends AbstractRunnableC0913 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f3683;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3684;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ Application f3685;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f3686;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f3687;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityConfig f3688;

    public C1336(C1213 c1213, ISAdQualityConfig iSAdQualityConfig, String str, String str2, Application application, Activity activity) {
        this.f3683 = c1213;
        this.f3688 = iSAdQualityConfig;
        this.f3687 = str;
        this.f3686 = str2;
        this.f3685 = application;
        this.f3684 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        String str;
        try {
            String userId = this.f3688.getUserId();
            C1213 c1213 = this.f3683;
            ISAdQualityLogLevel logLevel = this.f3688.getLogLevel();
            synchronized (c1213) {
                c1213.f3195 = logLevel;
            }
            this.f3683.m4459();
            if (TextUtils.isEmpty(this.f3687)) {
                String decrypt = StringFog.decrypt("trT4EyPIW1aOg+0t\n", "99CpZkKkMiI=\n");
                AbstractC0580.m4081(decrypt, decrypt, StringFog.decrypt("PrxhAXeKphYNu2YSPpyjCx/ybxRzjuoWE/I=\n", "d9IIdR7ryn8=\n") + this.f3686, true);
            } else {
                String decrypt2 = StringFog.decrypt("TcAR8ij9hup19wTM\n", "DKRAh0mR754=\n");
                AbstractC0580.m4081(decrypt2, decrypt2, StringFog.decrypt("NuJsmDbcnfgF5WuLf8qY5ResZJwvnZr0Bqw=\n", "f4wF7F+98ZE=\n") + this.f3687, true);
            }
            C1223.m4471(this.f3685.getApplicationContext()).m4474();
            C1213.m4457(this.f3683, this.f3688.isTestMode());
            if (this.f3688.isTestMode()) {
                AbstractC0580.m4074(StringFog.decrypt("nhGTZhZZ2symJoZY\n", "33XCE3c1s7g=\n"), StringFog.decrypt("pN2+ds4m7zfSvcx86EjGeYe8i1enBMFglrybUfMAiGKW75h16AzNK4fumV2mSYk2tuqJVvMbiGGa\n6IQY8w3bYr7ziF26HNpjlrybUesEiHSWvIhR9AvJZJf5iBmmSQ==\n", "85zsOIdoqBY=\n"));
            }
            try {
                Class.forName(StringFog.decrypt("Z6u9TdaP1wtptvd+yp/dRlKkqlQ=\n", "BsXZP7nmsyU=\n"));
            } catch (Throwable unused) {
            }
            Activity activity = this.f3684;
            if (activity != null) {
                AbstractC0608.m4114(activity);
            } else {
                Application application = this.f3685;
                String str2 = AbstractC0608.f1070;
                if (application != null) {
                    AbstractC0608.m4115(application.getApplicationContext());
                }
            }
            if (TextUtils.isEmpty(this.f3687)) {
                C1213.m4455(this.f3683).f1837 = this.f3686;
            } else {
                C1213.m4455(this.f3683).f1838 = this.f3687;
            }
            C1213.m4455(this.f3683).f1834 = this.f3688.getInitializationSource();
            C1213.m4455(this.f3683).f1833 = this.f3688.getCoppa();
            C1213.m4455(this.f3683).f1832 = this.f3688.getDeviceIdType();
            if (this.f3688.getMetaData() != null) {
                C0783 m4455 = C1213.m4455(this.f3683);
                Map<String, String> metaData = this.f3688.getMetaData();
                m4455.f1831.clear();
                if (metaData != null) {
                    m4455.f1831.putAll(metaData);
                }
                if (this.f3688.getMetaData().containsKey(StringFog.decrypt("Y51U7b8lp7hllV/wvyKtoHOS\n", "FvwwnuBWwss=\n"))) {
                    C1213.m4455(this.f3683).f1829 = this.f3688.getMetaData().get(StringFog.decrypt("6Sgb0MkhcHXvIBDNySZ6bfkn\n", "nEl/o5ZSFQY=\n"));
                }
            }
            Context applicationContext = this.f3685.getApplicationContext();
            C1213 c12132 = this.f3683;
            c12132.f3194 = applicationContext;
            c12132.f3190 = new C1007(applicationContext);
            C1213 c12133 = this.f3683;
            c12133.f3188 = new C0916(applicationContext, c12133.f3193.f437, "B0r1sW@sH3re");
            AbstractC0590 m4087 = AbstractC0590.m4087();
            C1213 c12134 = this.f3683;
            m4087.mo4100(applicationContext, c12134.f3190, c12134.f3193, new C0433(this), C1213.m4450(c12134));
            C1213 c12135 = this.f3683;
            C1213 c12136 = this.f3683;
            c12135.f3187 = new C0545(applicationContext, c12136.f3190, c12136.f3193.f438);
            String m4157 = AbstractC0758.m4157(applicationContext);
            AbstractC0590 m40872 = AbstractC0590.m4087();
            C0412 c0412 = new C0412(this, m4157);
            C0600 c0600 = (C0600) m40872;
            Handler handler = c0600.f1018;
            if (handler != null) {
                handler.post(new C0601(c0600, c0412));
            }
            AbstractC0590 m40873 = AbstractC0590.m4087();
            C0388 c0388 = new C0388(this);
            C0600 c06002 = (C0600) m40873;
            Handler handler2 = c06002.f1018;
            if (handler2 != null) {
                handler2.post(new C0617(c06002, c0388));
            }
            C1213.m4456(this.f3683, applicationContext);
            this.f3683.f3189 = new C1086(applicationContext, C1213.m4455(this.f3683), this.f3683.f3193, this.f3684 != null, m4157, new C0377(this));
            if (this.f3688.isUserIdSet()) {
                str = userId;
            } else {
                C1213.m4455(this.f3683).f1830 = true;
                C0916 c0916 = new C0916(this.f3683.f3189.f2761, C1086.f2753, C1086.f2752);
                String str3 = C1086.f2750;
                String m4242 = c0916.m4242(str3);
                if (TextUtils.isEmpty(m4242)) {
                    m4242 = UUID.randomUUID().toString();
                    c0916.m4243(str3, m4242);
                }
                str = m4242;
            }
            if (this.f3683.m4463()) {
                this.f3683.f3189.m4387(new C0375(this));
            }
            this.f3683.f3189.m4386(new C0374(this));
            C0696 c0696 = new C0696();
            C1213 c12137 = this.f3683;
            C1213 c12138 = this.f3683;
            c12137.f3192 = new C0791(c12138.f3187, c12138.f3189, m4157, c0696, new C0373(this));
            C1213 c12139 = this.f3683;
            c12139.f3192.f1863.f627 = new C1353(this);
            c12139.f3185 = new C0654(this.f3683.f3192);
            C1213 c121310 = this.f3683;
            c121310.f3184 = new C0672(c121310.f3189);
            AbstractC0580.m4078(StringFog.decrypt("HJRBeAGbyBYko1RG\n", "XfAQDWD3oWI=\n"), StringFog.decrypt("borz9K9vExpOrcvDulFSBVO4wOSXdBVWQbbAsItoHkwH\n", "J9mykP4acnY=\n") + this.f3683.f3193.f440);
            C1213 c121311 = this.f3683;
            Activity activity2 = this.f3684;
            c121311.m4468(activity2 != null ? activity2 : applicationContext, str, true, false, true);
            C1213.m4454(this.f3683, applicationContext);
            C1213.m4453(this.f3683);
            C1213.m4451(this.f3683);
        } catch (Throwable th) {
            String decrypt3 = StringFog.decrypt("FWjZDFpkjhA5bsICRC2dFz59iyp7BYMvJXvHClw9xy0UUQ==\n", "UBqrYyhE534=\n");
            AbstractC0577.m4069(StringFog.decrypt("TBWeOZl2hWZ0IosH\n", "DXHPTPga7BI=\n"), decrypt3, th, true, false, true);
            C1213.m4458(this.f3683.f3186, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt3);
        }
    }
}
