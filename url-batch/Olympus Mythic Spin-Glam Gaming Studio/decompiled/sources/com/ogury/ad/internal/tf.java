package com.ogury.ad.internal;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class tf {
    public final Long a;
    public final String b;
    public final t0 c;
    public final xg d;
    public final l2 e;
    public final qb f;
    public final mh g;
    public final v h;
    public final sb i;
    public final List j;

    public tf(Long l, String str, t0 t0Var, xg xgVar, l2 l2Var, qb qbVar, mh mhVar, v vVar, sb sbVar, ArrayList arrayList) {
        this.a = l;
        this.b = str;
        this.c = t0Var;
        this.d = xgVar;
        this.e = l2Var;
        this.f = qbVar;
        this.g = mhVar;
        this.h = vVar;
        this.i = sbVar;
        this.j = arrayList;
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        JSONObject jSONObject9;
        JSONObject jSONObject10;
        JSONObject jSONObject11;
        JSONObject jSONObject12;
        Intrinsics.checkNotNullParameter(this, "<this>");
        JSONObject jSONObject13 = new JSONObject();
        Long l = this.a;
        if (l != null) {
            jSONObject13.put("sent_at", l.longValue());
        }
        t0 t0Var = this.c;
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        JSONObject jSONObject14 = new JSONObject();
        n4.a(jSONObject14, "asset_key", t0Var.a);
        n4.a(jSONObject14, "asset_type", "android");
        n4.a(jSONObject14, "bundle_id", t0Var.b);
        n4.a(jSONObject14, "version", t0Var.c);
        n4.a(jSONObject14, "framework", t0Var.d);
        jSONObject14.put("target_api_level", t0Var.e.intValue());
        o4 o4Var = t0Var.f;
        JSONObject jSONObject15 = new JSONObject();
        n4.a(jSONObject15, "compile", o4Var.a);
        n4.a(jSONObject15, "runtime", o4Var.b);
        n4.a(jSONObject14, "kotlin_version", jSONObject15);
        n4.a(jSONObject14, "instance_token", t0Var.g);
        n4.a(jSONObject13, "app", jSONObject14);
        Intrinsics.checkNotNullParameter(this.d, "<this>");
        JSONObject jSONObject16 = new JSONObject();
        n4.a(jSONObject16, "module_version", "5.2.2");
        n4.a(jSONObject13, "sdk", jSONObject16);
        l2 l2Var = this.e;
        Intrinsics.checkNotNullParameter(l2Var, "<this>");
        JSONObject jSONObject17 = new JSONObject();
        n4.a(jSONObject17, "os", l2Var.a);
        n4.a(jSONObject17, CommonUrlParts.OS_VERSION, l2Var.b);
        n4.a(jSONObject17, CommonUrlParts.MANUFACTURER, l2Var.c);
        n4.a(jSONObject17, "model", l2Var.d);
        ug ugVar = l2Var.e;
        JSONArray jSONArray = null;
        if (ugVar != null) {
            jSONObject = new JSONObject();
            Integer num = ugVar.a;
            if (num != null) {
                jSONObject.put("height", num.intValue());
            }
            Integer num2 = ugVar.b;
            if (num2 != null) {
                jSONObject.put("width", num2.intValue());
            }
            Float f = ugVar.c;
            if (f != null) {
                jSONObject.put("density", f);
            }
            n4.a(jSONObject, X3.i.n, ugVar.d);
            n4.a(jSONObject, "layout_size", ugVar.e);
            n4.a(jSONObject, "ui_mode", ugVar.f);
        } else {
            jSONObject = null;
        }
        n4.a(jSONObject17, "screen", jSONObject);
        zg zgVar = l2Var.f;
        if (zgVar != null) {
            jSONObject2 = new JSONObject();
            n4.a(jSONObject2, "time_zone", zgVar.a);
            c5 c5Var = zgVar.b;
            if (c5Var != null) {
                jSONObject12 = new JSONObject();
                n4.a(jSONObject12, "country", c5Var.a);
                n4.a(jSONObject12, POBConstants.KEY_LANGUAGE, c5Var.b);
            } else {
                jSONObject12 = null;
            }
            n4.a(jSONObject2, CommonUrlParts.LOCALE, jSONObject12);
            n4.a(jSONObject2, "device_id", zgVar.c);
            Boolean bool = zgVar.d;
            if (bool != null) {
                jSONObject2.put("is_ad_tracking_enabled", bool.booleanValue());
            }
        } else {
            jSONObject2 = null;
        }
        n4.a(jSONObject17, "settings", jSONObject2);
        lh lhVar = l2Var.i;
        if (lhVar != null) {
            jSONObject3 = new JSONObject();
            n4.a(jSONObject3, "architecture", lhVar.a);
            Boolean bool2 = lhVar.b;
            if (bool2 != null) {
                jSONObject3.put("hpe_experience", bool2.booleanValue());
            }
        } else {
            jSONObject3 = null;
        }
        n4.a(jSONObject17, "system", jSONObject3);
        j8 j8Var = l2Var.g;
        if (j8Var != null) {
            jSONObject4 = new JSONObject();
            n4.a(jSONObject4, "mobile_country", j8Var.a);
            n4.a(jSONObject4, "connectivity", j8Var.b);
        } else {
            jSONObject4 = null;
        }
        n4.a(jSONObject17, "network", jSONObject4);
        aj ajVar = l2Var.h;
        if (ajVar != null) {
            jSONObject5 = new JSONObject();
            n4.a(jSONObject5, "user_agent", ajVar.a);
        } else {
            jSONObject5 = null;
        }
        n4.a(jSONObject17, X3.i.K, jSONObject5);
        n4.a(jSONObject13, "device", jSONObject17);
        qb qbVar = this.f;
        if (qbVar != null) {
            jSONObject6 = new JSONObject();
            n4.a(jSONObject6, "gpp", qbVar.b);
            n4.a(jSONObject6, POBConstants.KEY_GPP_SID, qbVar.c);
            n4.a(jSONObject6, "tcf", qbVar.a);
            Map map = qbVar.d;
            JSONObject jSONObject18 = new JSONObject();
            Intrinsics.checkNotNullParameter(jSONObject18, "<this>");
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject18.putOpt((String) entry.getKey(), entry.getValue());
                }
            }
            n4.a(jSONObject6, "publisher_data", jSONObject18);
            Boolean bool3 = qbVar.e;
            if (bool3 != null) {
                jSONObject6.put("is_child_under_coppa", bool3.booleanValue());
            }
            Boolean bool4 = qbVar.f;
            if (bool4 != null) {
                jSONObject6.put("is_under_age_of_gdpr_consent", bool4.booleanValue());
            }
        } else {
            jSONObject6 = null;
        }
        n4.a(jSONObject13, "privacy_compliancy", jSONObject6);
        mh mhVar = this.g;
        if (mhVar != null) {
            jSONObject7 = new JSONObject();
            n4.a(jSONObject7, "ad_content_threshold", mhVar.a);
        } else {
            jSONObject7 = null;
        }
        n4.a(jSONObject13, "targeting", jSONObject7);
        n4.a(jSONObject13, "request_id", this.b);
        v vVar = this.h;
        if (vVar != null) {
            jSONObject8 = new JSONObject();
            n4.a(jSONObject8, "name", vVar.a);
            n4.a(jSONObject8, "type", vVar.b);
            n4.a(jSONObject8, "ad", n4.a(vVar.c));
            sa saVar = vVar.e;
            if (saVar != null) {
                jSONObject10 = new JSONObject();
                za zaVar = saVar.a;
                JSONObject jSONObject19 = new JSONObject();
                jSONObject19.put("width", zaVar.b.intValue());
                jSONObject19.put("height", zaVar.a.intValue());
                jSONObject19.put("scaler", zaVar.c);
                n4.a(jSONObject10, "overlay_max_size", jSONObject19);
            } else {
                jSONObject10 = null;
            }
            n4.a(jSONObject8, "overlay", jSONObject10);
            s9 s9Var = vVar.f;
            JSONObject jSONObject20 = new JSONObject();
            jSONObject20.put("is_compliant", s9Var.a.booleanValue());
            jSONObject20.put("integration_version", 3);
            n4.a(jSONObject8, CampaignEx.KEY_OMID, jSONObject20);
            r rVar = vVar.d;
            if (rVar != null) {
                jSONObject11 = new JSONObject();
                jSONObject11.put("enabled", rVar.a);
                n4.a(jSONObject11, "disabling_reason", rVar.b);
            } else {
                jSONObject11 = null;
            }
            n4.a(jSONObject8, "ad_serving", jSONObject11);
        } else {
            jSONObject8 = null;
        }
        n4.a(jSONObject13, "ad_sync", jSONObject8);
        sb sbVar = this.i;
        if (sbVar != null) {
            jSONObject9 = new JSONObject();
            n4.a(jSONObject9, "name", sbVar.a);
            n4.a(jSONObject9, "version", sbVar.b);
        } else {
            jSONObject9 = null;
        }
        n4.a(jSONObject13, AppLovinEventTypes.USER_VIEWED_PRODUCT, jSONObject9);
        List list = this.j;
        if (list != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = list.iterator();
            jSONArray = jSONArray2;
            while (it.hasNext()) {
                jSONArray = jSONArray.put(n4.a((o5) it.next()));
                Intrinsics.checkNotNullExpressionValue(jSONArray, "put(...)");
            }
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            jSONObject13.put("events", jSONArray);
        }
        return jSONObject13;
    }
}
