package com.ogury.ad.internal;

import com.ogury.ad.OguryAdError;
import com.ogury.ad.OguryLoadErrorCode;
import com.ogury.ad.async.Single;
import com.ogury.ad.common.OguryMediation;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class g0 extends Lambda implements Function1 {
    public final /* synthetic */ o0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o0 o0Var) {
        super(1);
        this.a = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pf profigResponse = (pf) obj;
        Intrinsics.checkNotNullParameter(profigResponse, "profigResponse");
        o0 o0Var = this.a;
        if (!profigResponse.a) {
            o0Var.c("Failed. Configuration not synced");
            u5 u5Var = o0Var.e;
            nb nbVar = nb.m;
            String str = o0Var.b.a;
            String str2 = o0Var.m;
            OguryMediation oguryMediation = o0Var.n;
            Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(o0Var.y != null));
            Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(o0Var.p));
            int i = o0Var.z;
            u5Var.a(nbVar, str, str2, oguryMediation, pb.a(pair, pair2, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null, o0Var.B);
            o0Var.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2100, "The load could not proceed due to an invalid SDK configuration."));
        } else if (profigResponse.d.a) {
            o0Var.b("Configuration successfully retrieved");
            g5 g5Var = o0Var.d;
            jb jbVar = new jb("LOAD", null);
            g5Var.getClass();
            g5.a(jbVar);
            o0Var.b("LOAD event");
            String adMarkup = o0Var.y;
            if (adMarkup != null) {
                Intrinsics.checkNotNull(adMarkup);
                o oVar = o0Var.h;
                x adType = o0Var.k;
                c adConfig = o0Var.b;
                String sessionId = o0Var.m;
                OguryMediation oguryMediation2 = o0Var.n;
                boolean z = o0Var.p;
                int i2 = o0Var.z;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
                Intrinsics.checkNotNullParameter(adType, "adType");
                Intrinsics.checkNotNullParameter(adConfig, "adConfig");
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                Single.INSTANCE.fromCallable(new n(oVar, adType, adConfig, sessionId, oguryMediation2, z, adMarkup, i2)).doOnError(new j0(o0Var)).subscribe(new k0(o0Var));
            } else {
                o0Var.b("Loading ads from servers...");
                o0Var.e.a(ob.d, o0Var.b.a, o0Var.m, o0Var.n, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(o0Var.y != null)), TuplesKt.to("reload", Boolean.valueOf(o0Var.p))), o0Var.B);
                o oVar2 = o0Var.h;
                x adType2 = o0Var.k;
                c adConfig2 = o0Var.b;
                da daVar = o0Var.w;
                String sessionId2 = o0Var.m;
                OguryMediation oguryMediation3 = o0Var.n;
                boolean z2 = o0Var.p;
                int i3 = o0Var.z;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(adType2, "adType");
                Intrinsics.checkNotNullParameter(adConfig2, "adConfig");
                Intrinsics.checkNotNullParameter(sessionId2, "sessionId");
                Single.INSTANCE.fromCallable(new m(oVar2, adType2, adConfig2, daVar, sessionId2, oguryMediation3, z2, i3)).doOnError(new h0(o0Var)).subscribe(new i0(o0Var));
            }
        } else {
            o0Var.c("Failed. Ad serving has been disabled");
            u5 u5Var2 = o0Var.e;
            nb nbVar2 = nb.f;
            String str3 = o0Var.b.a;
            String str4 = o0Var.m;
            OguryMediation oguryMediation4 = o0Var.n;
            Pair pair3 = TuplesKt.to("from_ad_markup", Boolean.valueOf(o0Var.y != null));
            Pair pair4 = TuplesKt.to("reload", Boolean.valueOf(o0Var.p));
            int i4 = o0Var.z;
            u5Var2.a(nbVar2, str3, str4, oguryMediation4, pb.a(pair3, pair4, TuplesKt.to("webview_termination", i4 > 0 ? Integer.valueOf(i4) : null)), pb.b(TuplesKt.to("disabling_reason", profigResponse.d.c)), o0Var.B);
            o0Var.q = false;
            String str5 = profigResponse.d.c;
            int hashCode = str5.hashCode();
            if (hashCode == -1984720000) {
                if (str5.equals("CONSENT_DENIED")) {
                    o0Var.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2102, " The load could not proceed because ads are disabled; the user has denied consent for advertising."));
                }
                o0Var.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, OguryLoadErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The load could not proceed because ads are disabled for an unspecified reason."));
            } else if (hashCode != -1879742975) {
                if (hashCode == 659206911 && str5.equals("COUNTRY_NOT_OPEN")) {
                    o0Var.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2101, "The load could not proceed because ads are disabled; the user’s country is not yet available for advertising."));
                }
                o0Var.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, OguryLoadErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The load could not proceed because ads are disabled for an unspecified reason."));
            } else {
                if (str5.equals("CONSENT_MISSING")) {
                    o0Var.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, OguryLoadErrorCode.AD_DISABLED_CONSENT_MISSING, "The load could not proceed because ads are disabled; the user consent is missing or has not been provided."));
                }
                o0Var.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, OguryLoadErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The load could not proceed because ads are disabled for an unspecified reason."));
            }
        }
        return Unit.INSTANCE;
    }
}
