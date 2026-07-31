package com.ogury.ad.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ogury.ad.common.OguryMediation;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class n4 {
    public static final void a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
            if (jSONObject2.length() == 0) {
                return;
            }
            jSONObject.put(str, jSONObject2);
        }
    }

    public static final JSONObject a(o5 o5Var) {
        qg qgVar;
        j2 j2Var;
        v2 v2Var;
        v2 v2Var2;
        Intrinsics.checkNotNullParameter(o5Var, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(POBConstants.KEY_AT, o5Var.a);
        a(jSONObject, SDKAnalyticsEvents.PARAMETER_SESSION_ID, o5Var.b);
        a(jSONObject, "event_id", o5Var.c);
        a(jSONObject, "event", o5Var.d);
        JSONObject jSONObject2 = o5Var.e;
        a(jSONObject, "details", jSONObject2 != null ? jSONObject2.toString() : null);
        w2 w2Var = o5Var.f;
        String str = w2Var != null ? w2Var.a : null;
        JSONObject jSONObject3 = w2Var != null ? w2Var.b : null;
        String jSONObject4 = jSONObject3 != null ? jSONObject3.toString() : null;
        JSONObject jSONObject5 = new JSONObject();
        a(jSONObject5, "type", str);
        a(jSONObject5, "content", jSONObject4);
        a(jSONObject, "error", jSONObject5);
        u2 u2Var = o5Var.h;
        String str2 = u2Var != null ? u2Var.a : null;
        String str3 = u2Var != null ? u2Var.b : null;
        JSONArray jSONArray = u2Var != null ? u2Var.c : null;
        hh hhVar = (u2Var == null || (v2Var2 = u2Var.d) == null) ? null : v2Var2.a;
        hh hhVar2 = (u2Var == null || (v2Var = u2Var.d) == null) ? null : v2Var.b;
        if (hhVar != null) {
            pg factory = pg.a;
            Intrinsics.checkNotNullParameter(factory, "factory");
            Integer valueOf = Integer.valueOf(hhVar.a);
            Integer valueOf2 = Integer.valueOf(hhVar.b);
            factory.getClass();
            qgVar = new qg(valueOf, valueOf2);
        } else {
            qgVar = null;
        }
        if (hhVar2 != null) {
            i2 factory2 = i2.a;
            Intrinsics.checkNotNullParameter(factory2, "factory");
            Integer valueOf3 = Integer.valueOf(hhVar2.a);
            Integer valueOf4 = Integer.valueOf(hhVar2.b);
            factory2.getClass();
            j2Var = new j2(valueOf3, valueOf4);
        } else {
            j2Var = null;
        }
        a(jSONObject, "ad", a(new p(null, str2, str3, jSONArray, null, null, new n1(qgVar, j2Var))));
        OguryMediation oguryMediation = o5Var.j;
        String name = oguryMediation != null ? oguryMediation.getName() : null;
        OguryMediation oguryMediation2 = o5Var.j;
        String version = oguryMediation2 != null ? oguryMediation2.getVersion() : null;
        OguryMediation oguryMediation3 = o5Var.j;
        String adapterVersion = oguryMediation3 != null ? oguryMediation3.getAdapterVersion() : null;
        JSONObject jSONObject6 = new JSONObject();
        a(jSONObject6, "name", name);
        a(jSONObject6, "version", version);
        a(jSONObject6, "adapter_version", adapterVersion);
        a(jSONObject, "mediation", jSONObject6);
        String str4 = o5Var.g;
        JSONObject jSONObject7 = new JSONObject();
        a(jSONObject7, "id", str4);
        a(jSONObject, "ad_unit", jSONObject7);
        a(jSONObject, "dispatch", o5Var.i.a);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JSONObject a(p pVar) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        n1 n1Var;
        JSONObject jSONObject2;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        JSONObject jSONObject3 = new JSONObject();
        a(jSONObject3, "ad_unit_id", pVar.a);
        a(jSONObject3, "campaign_id", pVar.b);
        a(jSONObject3, "creative_id", pVar.c);
        JSONArray jSONArray2 = pVar.d;
        if (jSONArray2 != null && jSONArray2.length() != 0) {
            jSONObject3.put("extras", jSONArray2);
        }
        q2 q2Var = pVar.e;
        JSONObject jSONObject4 = null;
        if (q2Var != null) {
            jSONObject = new JSONObject();
            a(jSONObject, "creative_id", q2Var.a);
            a(jSONObject, "region", q2Var.b);
        } else {
            jSONObject = null;
        }
        a(jSONObject3, "dsp", jSONObject);
        t tVar = pVar.f;
        if (tVar != null) {
            JSONObject jSONObject5 = new JSONObject();
            Integer num = tVar.a;
            if (num != null) {
                jSONObject5.put("w", num.intValue());
            }
            Integer num2 = tVar.b;
            if (num2 != null) {
                jSONObject5.put("h", num2.intValue());
            }
            Intrinsics.checkNotNullParameter(jSONObject5, "<this>");
            if (jSONObject5.length() == 0) {
                jSONObject5 = null;
            }
            if (jSONObject5 != null) {
                jSONArray = new JSONArray().put(jSONObject5);
                if (jSONArray != null && jSONArray.length() != 0) {
                    jSONObject3.put("sizes", jSONArray);
                }
                n1Var = pVar.g;
                if (n1Var != null) {
                    JSONObject jSONObject6 = new JSONObject();
                    qg qgVar = n1Var.a;
                    if (qgVar != null) {
                        jSONObject2 = new JSONObject();
                        Integer num3 = qgVar.a;
                        if (num3 != null) {
                            jSONObject2.put("w", num3.intValue());
                        }
                        Integer num4 = qgVar.b;
                        if (num4 != null) {
                            jSONObject2.put("h", num4.intValue());
                        }
                    } else {
                        jSONObject2 = null;
                    }
                    a(jSONObject6, "requested_size", jSONObject2);
                    j2 j2Var = n1Var.b;
                    if (j2Var != null) {
                        jSONObject4 = new JSONObject();
                        Integer num5 = j2Var.a;
                        if (num5 != null) {
                            jSONObject4.put("w", num5.intValue());
                        }
                        Integer num6 = j2Var.b;
                        if (num6 != null) {
                            jSONObject4.put("h", num6.intValue());
                        }
                    }
                    a(jSONObject6, "creative_size", jSONObject4);
                    jSONObject4 = jSONObject6;
                }
                a(jSONObject3, "banner", jSONObject4);
                return jSONObject3;
            }
        }
        jSONArray = null;
        if (jSONArray != null) {
            jSONObject3.put("sizes", jSONArray);
        }
        n1Var = pVar.g;
        if (n1Var != null) {
        }
        a(jSONObject3, "banner", jSONObject4);
        return jSONObject3;
    }

    public static final void a(JSONObject jSONObject, String str, String str2) {
        if (str2 == null || StringsKt.isBlank(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
