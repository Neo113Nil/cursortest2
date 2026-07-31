package com.ogury.ad.internal;

import android.content.Context;
import android.os.Build;
import com.iab.omid.library.ogury.Omid;
import com.ogury.ad.common.OguryMediation;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.KotlinVersionDetector;
import com.ogury.core.internal.network.NetworkRequest;
import com.ogury.core.internal.network.NetworkResponse;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m extends Lambda implements Function0 {
    public final /* synthetic */ o a;
    public final /* synthetic */ x b;
    public final /* synthetic */ c c;
    public final /* synthetic */ da d;
    public final /* synthetic */ String e;
    public final /* synthetic */ OguryMediation f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, x xVar, c cVar, da daVar, String str, OguryMediation oguryMediation, boolean z, int i) {
        super(0);
        this.a = oVar;
        this.b = xVar;
        this.c = cVar;
        this.d = daVar;
        this.e = str;
        this.f = oguryMediation;
        this.g = z;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        String str;
        sa saVar;
        o oVar = this.a;
        z8 z8Var = oVar.a;
        u uVar = oVar.f;
        x adType = this.b;
        c adConfig = this.c;
        da daVar = this.d;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        r0 app = uVar.c;
        og permissionsHandler = uVar.g;
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
        boolean z = false;
        t0 app2 = new t0(a, packageName, valueOf, null, Integer.valueOf(app.d()), new o4(kotlinVersionDetector.getVersionInfo(app.a).getCompileVersion(), kotlinVersionDetector.getVersionInfo(app.a).getRuntimeVersion()), str2);
        xg sdk = new xg();
        og permissionsHandler2 = uVar.g;
        Intrinsics.checkNotNullParameter(permissionsHandler2, "permissionsHandler");
        permissionsHandler2.getClass();
        g2 g2Var = g2.f;
        ug screen = new ug((Integer) permissionsHandler2.a(g2Var, new jg(permissionsHandler2)), (Integer) permissionsHandler2.a(g2Var, new kg(permissionsHandler2)), (Float) permissionsHandler2.a(g2Var, new ig(permissionsHandler2)), (String) permissionsHandler2.a(g2.g, new ag(permissionsHandler2)), (String) permissionsHandler2.a(g2.h, new eg(permissionsHandler2)), (String) permissionsHandler2.a(g2.i, new mg(permissionsHandler2)));
        og permissionsHandler3 = uVar.g;
        Intrinsics.checkNotNullParameter(permissionsHandler3, "permissionsHandler");
        permissionsHandler3.getClass();
        c5 locale = new c5((String) permissionsHandler3.a(g2.l, new fg(permissionsHandler3)), (String) permissionsHandler3.a(g2.k, new gg(permissionsHandler3)));
        og permissionsHandler4 = uVar.g;
        Intrinsics.checkNotNullParameter(permissionsHandler4, "permissionsHandler");
        permissionsHandler4.getClass();
        String str3 = (String) permissionsHandler4.a(g2.j, new lg(permissionsHandler4));
        Intrinsics.checkNotNullParameter(locale, "locale");
        zg settings = new zg(str3, locale, (String) permissionsHandler4.a(g2.b, new xf(permissionsHandler4)), (Boolean) permissionsHandler4.a(g2.c, new uf(permissionsHandler4)));
        og permissionsHandler5 = uVar.g;
        Intrinsics.checkNotNullParameter(permissionsHandler5, "permissionsHandler");
        permissionsHandler5.getClass();
        j8 network = new j8((String) permissionsHandler5.a(g2.m, new hg(permissionsHandler5)), (String) permissionsHandler5.a(g2.n, new wf(permissionsHandler5)));
        og permissionsHandler6 = uVar.g;
        Intrinsics.checkNotNullParameter(permissionsHandler6, "permissionsHandler");
        permissionsHandler6.getClass();
        lh system = new lh((String) permissionsHandler6.a(g2.q, new vf(permissionsHandler6)), (Boolean) permissionsHandler6.a(g2.r, new cg(permissionsHandler6)));
        og permissionsHandler7 = uVar.g;
        Intrinsics.checkNotNullParameter(permissionsHandler7, "permissionsHandler");
        permissionsHandler7.getClass();
        aj webview = new aj((String) permissionsHandler7.a(g2.o, new ng(permissionsHandler7)));
        q0 androidDevice = uVar.d;
        og permissionsHandler8 = uVar.g;
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        Intrinsics.checkNotNullParameter(permissionsHandler8, "permissionsHandler");
        androidDevice.getClass();
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        permissionsHandler8.getClass();
        g2 g2Var2 = g2.e;
        String str4 = (String) permissionsHandler8.a(g2Var2, new yf(permissionsHandler8));
        String str5 = (String) permissionsHandler8.a(g2Var2, new zf(permissionsHandler8));
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(webview, "webview");
        Intrinsics.checkNotNullParameter(system, "system");
        l2 device = new l2("android", RELEASE, str4, str5, screen, settings, network, webview, system);
        q2 q2Var = new q2(adConfig.d, adConfig.e);
        String str6 = adConfig.a;
        String str7 = adConfig.b;
        String str8 = adConfig.c;
        hh hhVar = adConfig.f;
        s factory = s.a;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Integer valueOf2 = hhVar != null ? Integer.valueOf(hhVar.a) : null;
        Integer valueOf3 = hhVar != null ? Integer.valueOf(hhVar.b) : null;
        factory.getClass();
        p adRequest = new p(str6, str7, str8, null, q2Var, new t(valueOf2, valueOf3), null);
        if (daVar != null) {
            q0 androidDevice2 = uVar.d;
            Intrinsics.checkNotNullParameter(androidDevice2, "androidDevice");
            saVar = new sa(new za(Integer.valueOf(daVar.b), Integer.valueOf(daVar.a), Float.valueOf(androidDevice2.c.density)));
        } else {
            saVar = null;
        }
        mh targeting = new mh(uVar.f != null ? c3.a() : null);
        le profigGateway = uVar.a;
        u9 omidSdkChecker = uVar.h;
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
        }
        s9 omidRequest = new s9(Boolean.valueOf(z));
        Intrinsics.checkNotNullParameter(adType, "adType");
        String str9 = adType.a;
        Intrinsics.checkNotNullParameter("load", "type");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(omidRequest, "omidRequest");
        v adSync = new v(str9, "load", adRequest, null, saVar, omidRequest);
        h2 coreWrapper = uVar.b;
        c3 c3Var = uVar.f;
        Intrinsics.checkNotNullParameter(coreWrapper, "coreWrapper");
        qb privacyCompliance = new qb(InternalCore.retrieveTcfConsentString(coreWrapper.a), InternalCore.retrieveGppConsentString(coreWrapper.a), InternalCore.retrieveGppSectionIdsString(coreWrapper.a), InternalCore.getAllPublisherData(coreWrapper.a), c3Var != null ? c3.a("IS_CHILD_UNDER_COPPA") : null, c3Var != null ? c3.a("IS_UNDER_AGE_OF_GDPR_CONSENT") : null);
        q0 androidDevice3 = uVar.d;
        Intrinsics.checkNotNullParameter(androidDevice3, "androidDevice");
        androidDevice3.b.getClass();
        Long valueOf4 = Long.valueOf(System.currentTimeMillis());
        wh uuidUtils = uVar.e;
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        uuidUtils.getClass();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        Intrinsics.checkNotNullParameter(app2, "app");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(privacyCompliance, "privacyCompliance");
        Intrinsics.checkNotNullParameter(targeting, "targeting");
        Intrinsics.checkNotNullParameter(adSync, "adSync");
        JSONObject body = new tf(valueOf4, uuid, app2, sdk, device, privacyCompliance, targeting, adSync, null, null).a();
        z8Var.getClass();
        Intrinsics.checkNotNullParameter(body, "body");
        String b = ei.a[fi.b().ordinal()] == 1 ? fi.b("ad_sync", "sy", com.moloco.sdk.internal.services.bidtoken.s.a) : fi.b("ad_sync", "ms-bidder-adsync", com.moloco.sdk.internal.services.bidtoken.s.a);
        String jSONObject = body.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        NetworkRequest networkRequest = new NetworkRequest(b, "POST", jSONObject, z8Var.a.c);
        z8.a("loadAd", networkRequest);
        NetworkResponse execute = z8Var.b.newCall(networkRequest).execute();
        z8.a("loadAd", networkRequest, execute);
        if (!(execute instanceof NetworkResponse.Success)) {
            if (!(execute instanceof NetworkResponse.Failure)) {
                IllegalStateException illegalStateException = new IllegalStateException();
                o.a(this.a, this.c, this.e, this.f, illegalStateException, false, this.g, this.h);
                throw new ph(illegalStateException, nh.d);
            }
            u5 u5Var = this.a.e;
            nb nbVar = nb.g;
            String str10 = this.c.a;
            NetworkResponse.Failure failure = (NetworkResponse.Failure) execute;
            JSONObject put = new JSONObject().put("stacktrace", failure.getCom.mobilefuse.sdk.telemetry.TelemetryCategory.EXCEPTION java.lang.String().getMessage());
            Pair pair = TuplesKt.to("from_ad_markup", Boolean.FALSE);
            Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(this.g));
            int i2 = this.h;
            u5Var.a(nbVar, str10, this.e, this.f, pb.a(pair, pair2, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), put, new v2(this.c.f));
            throw new ph(failure.getCom.mobilefuse.sdk.telemetry.TelemetryCategory.EXCEPTION java.lang.String(), nh.a);
        }
        if (!StringsKt.isBlank(((NetworkResponse.Success) execute).getResponseBody())) {
            this.a.e.a(ob.e, this.c.a, this.e, this.f, pb.a(TuplesKt.to("from_ad_markup", Boolean.FALSE), TuplesKt.to("reload", Boolean.valueOf(this.g))), new v2(this.c.f));
            try {
                return o.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, false, ((NetworkResponse.Success) execute).getResponseBody());
            } catch (Throwable th) {
                o.a(this.a, this.c, this.e, this.f, th, false, this.g, this.h);
                throw new ph(th, nh.b);
            }
        }
        u5 u5Var2 = this.a.e;
        nb nbVar2 = nb.h;
        String str11 = this.c.a;
        String str12 = this.e;
        OguryMediation oguryMediation = this.f;
        Pair pair3 = TuplesKt.to("from_ad_markup", Boolean.FALSE);
        Pair pair4 = TuplesKt.to("reload", Boolean.valueOf(this.g));
        int i3 = this.h;
        u5Var2.a(nbVar2, str11, str12, oguryMediation, pb.a(pair3, pair4, TuplesKt.to("webview_termination", i3 > 0 ? Integer.valueOf(i3) : null)), null, new v2(this.c.f));
        throw new ph(new Exception("onAdNotAvailable"), nh.c);
    }
}
