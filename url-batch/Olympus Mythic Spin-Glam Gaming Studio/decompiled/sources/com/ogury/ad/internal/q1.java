package com.ogury.ad.internal;

import android.content.Context;
import com.iab.omid.library.ogury.Omid;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.KotlinVersionDetector;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class q1 {
    public final le a;
    public final h2 b;
    public final r0 c;
    public final q0 d;
    public final c3 e;
    public final og f;
    public final u9 g;

    public q1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        le leVar = le.a;
        h2 h2Var = new h2(context);
        r0 r0Var = new r0(context);
        q0 q0Var = new q0(context);
        c3 c3Var = c3.a;
        og ogVar = new og(context, hb.b);
        this.a = leVar;
        this.b = h2Var;
        this.c = r0Var;
        this.d = q0Var;
        this.e = c3Var;
        this.f = ogVar;
        this.g = u9.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tf a(String campaignId, String creativeId, String dspCreativeId, String dspAwsRegion) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(dspCreativeId, "dspCreativeId");
        Intrinsics.checkNotNullParameter(dspAwsRegion, "dspAwsRegion");
        r0 app = this.c;
        og permissionsHandler = this.f;
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(permissionsHandler, "permissionsHandler");
        String a = app.b.a();
        String packageName = app.a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        Context context = app.a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        String valueOf = String.valueOf(str);
        permissionsHandler.getClass();
        String str2 = (String) permissionsHandler.a(g2.d, new dg(permissionsHandler));
        Intrinsics.checkNotNullParameter(app, "app");
        KotlinVersionDetector kotlinVersionDetector = KotlinVersionDetector.INSTANCE;
        t0 app2 = new t0(a, packageName, valueOf, null, Integer.valueOf(app.d()), new o4(kotlinVersionDetector.getVersionInfo(app.a).getCompileVersion(), kotlinVersionDetector.getVersionInfo(app.a).getRuntimeVersion()), str2);
        xg sdk = new xg();
        og permissionsHandler2 = this.f;
        Intrinsics.checkNotNullParameter(permissionsHandler2, "permissionsHandler");
        permissionsHandler2.getClass();
        ug screen = new ug(null, null, null, (String) permissionsHandler2.a(g2.g, new ag(permissionsHandler2)), (String) permissionsHandler2.a(g2.h, new eg(permissionsHandler2)), (String) permissionsHandler2.a(g2.i, new mg(permissionsHandler2)));
        og permissionsHandler3 = this.f;
        Intrinsics.checkNotNullParameter(permissionsHandler3, "permissionsHandler");
        permissionsHandler3.getClass();
        zg settings = new zg((String) permissionsHandler3.a(g2.j, new lg(permissionsHandler3)), null, (String) permissionsHandler3.a(g2.b, new xf(permissionsHandler3)), null);
        og permissionsHandler4 = this.f;
        Intrinsics.checkNotNullParameter(permissionsHandler4, "permissionsHandler");
        permissionsHandler4.getClass();
        lh system = new lh((String) permissionsHandler4.a(g2.q, new vf(permissionsHandler4)), (Boolean) permissionsHandler4.a(g2.r, new cg(permissionsHandler4)));
        q0 androidDevice = this.d;
        og permissionsHandler5 = this.f;
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        Intrinsics.checkNotNullParameter(permissionsHandler5, "permissionsHandler");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(system, "system");
        permissionsHandler5.getClass();
        g2 g2Var = g2.e;
        l2 device = new l2(null, null, (String) permissionsHandler5.a(g2Var, new yf(permissionsHandler5)), (String) permissionsHandler5.a(g2Var, new zf(permissionsHandler5)), screen, settings, null, null, system);
        mh targeting = new mh(this.e != null ? c3.a() : null);
        p adRequest = new p(null, campaignId, creativeId, null, new q2(dspCreativeId, dspAwsRegion), null, null);
        le profigGateway = this.a;
        u9 omidSdkChecker = this.g;
        Intrinsics.checkNotNullParameter(profigGateway, "profigGateway");
        Intrinsics.checkNotNullParameter(omidSdkChecker, "omidSdkChecker");
        profigGateway.getClass();
        if (le.b.f.a) {
            omidSdkChecker.getClass();
            try {
                int i = Omid.$r8$clinit;
                z = true;
            } catch (Exception unused2) {
            }
            s9 omidRequest = new s9(Boolean.valueOf(z));
            le profigGateway2 = this.a;
            Intrinsics.checkNotNullParameter(profigGateway2, "profigGateway");
            profigGateway2.getClass();
            te teVar = le.b.d;
            r adServing = new r(teVar.c, teVar.a);
            Intrinsics.checkNotNullParameter(adServing, "adServing");
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            Intrinsics.checkNotNullParameter(omidRequest, "omidRequest");
            v adSync = new v(null, null, adRequest, adServing, null, omidRequest);
            h2 coreWrapper = this.b;
            c3 c3Var = this.e;
            Intrinsics.checkNotNullParameter(coreWrapper, "coreWrapper");
            qb privacyCompliance = new qb(InternalCore.retrieveTcfConsentString(coreWrapper.a), InternalCore.retrieveGppConsentString(coreWrapper.a), InternalCore.retrieveGppSectionIdsString(coreWrapper.a), InternalCore.getAllPublisherData(coreWrapper.a), c3Var == null ? c3.a("IS_CHILD_UNDER_COPPA") : null, c3Var == null ? c3.a("IS_UNDER_AGE_OF_GDPR_CONSENT") : null);
            q0 androidDevice2 = this.d;
            Intrinsics.checkNotNullParameter(androidDevice2, "androidDevice");
            Intrinsics.checkNotNullParameter(app2, "app");
            Intrinsics.checkNotNullParameter(sdk, "sdk");
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(privacyCompliance, "privacyCompliance");
            Intrinsics.checkNotNullParameter(targeting, "targeting");
            Intrinsics.checkNotNullParameter(adSync, "adSync");
            return new tf(null, null, app2, sdk, device, privacyCompliance, targeting, adSync, null, null);
        }
        z = false;
        s9 omidRequest2 = new s9(Boolean.valueOf(z));
        le profigGateway22 = this.a;
        Intrinsics.checkNotNullParameter(profigGateway22, "profigGateway");
        profigGateway22.getClass();
        te teVar2 = le.b.d;
        r adServing2 = new r(teVar2.c, teVar2.a);
        Intrinsics.checkNotNullParameter(adServing2, "adServing");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(omidRequest2, "omidRequest");
        v adSync2 = new v(null, null, adRequest, adServing2, null, omidRequest2);
        h2 coreWrapper2 = this.b;
        c3 c3Var2 = this.e;
        Intrinsics.checkNotNullParameter(coreWrapper2, "coreWrapper");
        qb privacyCompliance2 = new qb(InternalCore.retrieveTcfConsentString(coreWrapper2.a), InternalCore.retrieveGppConsentString(coreWrapper2.a), InternalCore.retrieveGppSectionIdsString(coreWrapper2.a), InternalCore.getAllPublisherData(coreWrapper2.a), c3Var2 == null ? c3.a("IS_CHILD_UNDER_COPPA") : null, c3Var2 == null ? c3.a("IS_UNDER_AGE_OF_GDPR_CONSENT") : null);
        q0 androidDevice22 = this.d;
        Intrinsics.checkNotNullParameter(androidDevice22, "androidDevice");
        Intrinsics.checkNotNullParameter(app2, "app");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(privacyCompliance2, "privacyCompliance");
        Intrinsics.checkNotNullParameter(targeting, "targeting");
        Intrinsics.checkNotNullParameter(adSync2, "adSync");
        return new tf(null, null, app2, sdk, device, privacyCompliance2, targeting, adSync2, null, null);
    }
}
