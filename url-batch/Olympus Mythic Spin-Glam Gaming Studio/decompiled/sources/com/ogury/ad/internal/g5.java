package com.ogury.ad.internal;

import com.ironsource.X3;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.ogury.ad.async.Completable;
import com.ogury.core.internal.network.NetworkRequest;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class g5 {
    public static n5 b;
    public static final g5 a = new g5();
    public static final le c = le.a;

    public static void a(f5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof th;
        if (z) {
            c.getClass();
            if (!le.b.e.b.a) {
                return;
            }
        }
        boolean z2 = event instanceof jb;
        if (z2) {
            c.getClass();
            if (!le.b.e.c.a) {
                return;
            }
        }
        n5 n5Var = b;
        if (n5Var != null) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (z2) {
                jb jbVar = (jb) event;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", jbVar.a);
                jSONObject.put("timestamp_diff", 0);
                JSONObject requestBody = new JSONObject();
                requestBody.put("content", jSONObject);
                z8 z8Var = n5Var.a;
                String str = jbVar.b;
                z8Var.getClass();
                Intrinsics.checkNotNullParameter(requestBody, "requestBody");
                if (str == null || str.length() == 0) {
                    str = fi.a("pl", "pl", com.moloco.sdk.internal.services.bidtoken.s.a);
                }
                String jSONObject2 = requestBody.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                Completable.INSTANCE.fromAction(new w8(z8Var, new NetworkRequest(str, "POST", jSONObject2, z8Var.a.a))).doOnError(j5.a).subscribe(k5.a);
                return;
            }
            if (z) {
                th thVar = (th) event;
                b bVar = thVar.b;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("event", thVar.a);
                jSONObject3.put(MBInterstitialActivity.INTENT_CAMAPIGN, bVar.g);
                jSONObject3.put(X3.i.F0, bVar.f);
                jSONObject3.put("advert", bVar.b);
                jSONObject3.put("ad_unit_id", bVar.n.a);
                jSONObject3.put("version_publisher_app", String.valueOf(n5Var.c.getPackageManager().getPackageInfo(n5Var.c.getPackageName(), 0).versionName));
                JSONObject requestBody2 = n5Var.b.a();
                requestBody2.put("content", jSONObject3);
                z8 z8Var2 = n5Var.a;
                String str2 = thVar.b.C;
                z8Var2.getClass();
                Intrinsics.checkNotNullParameter(requestBody2, "requestBody");
                if (str2 == null || str2.length() == 0) {
                    str2 = fi.a("track", "tr", com.moloco.sdk.internal.services.init.i.a);
                }
                String jSONObject4 = requestBody2.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
                Completable.INSTANCE.fromAction(new y8(z8Var2, new NetworkRequest(str2, "POST", jSONObject4, z8Var2.a.b))).doOnError(l5.a).subscribe(m5.a);
                return;
            }
            if (event instanceof e) {
                e eVar = (e) event;
                b bVar2 = eVar.b;
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("campaign_id", bVar2.g);
                jSONObject5.put("advert_id", bVar2.b);
                jSONObject5.put("advertiser_id", bVar2.f);
                jSONObject5.put("ad_unit_id", bVar2.n.a);
                jSONObject5.put("url", eVar.c);
                jSONObject5.put("source", POBConstants.KEY_FORMAT);
                String str3 = eVar.d;
                if (str3 != null) {
                    jSONObject5.put("tracker_pattern", str3);
                }
                String str4 = eVar.e;
                if (str4 != null) {
                    jSONObject5.put("tracker_url", str4);
                }
                JSONObject requestBody3 = n5Var.b.a();
                requestBody3.put("content", jSONObject5);
                z8 z8Var3 = n5Var.a;
                String str5 = eVar.b.E;
                z8Var3.getClass();
                Intrinsics.checkNotNullParameter(requestBody3, "requestBody");
                if (str5 == null || str5.length() == 0) {
                    str5 = fi.a("ad_history", "ah", com.moloco.sdk.internal.services.init.i.a);
                }
                String jSONObject6 = requestBody3.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject6, "toString(...)");
                Completable.INSTANCE.fromAction(new x8(z8Var3, new NetworkRequest(str5, "POST", jSONObject6, z8Var3.a.b))).doOnError(h5.a).subscribe(i5.a);
            }
        }
    }
}
