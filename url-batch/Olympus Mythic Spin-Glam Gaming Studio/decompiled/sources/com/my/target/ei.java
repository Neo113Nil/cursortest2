package com.my.target;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class ei {
    private final y a;
    private final n b;
    private String c;
    private boolean d = true;
    int e = 1;

    protected ei(y yVar, n nVar) {
        this.a = yVar;
        this.b = nVar;
    }

    public static ei a(y yVar, n nVar) {
        return new ei(yVar, nVar);
    }

    protected void a(String str, int i, String str2) {
    }

    public void a(Boolean bool) {
        this.d = Boolean.TRUE.equals(bool);
    }

    public void a(th thVar, JSONObject jSONObject, String str, float f) {
        a(thVar, jSONObject, str, f, x0.e);
    }

    public void a(th thVar, JSONObject jSONObject, String str, float f, x0 x0Var) {
        int length;
        thVar.a(this.a.m(), f);
        JSONArray optJSONArray = jSONObject.optJSONArray("statistics");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            x0 a = x0Var.a("statistics");
            this.c = str;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                x0 b = a.b(i);
                if (optJSONObject == null) {
                    b.c(3007);
                } else {
                    rh a2 = a(optJSONObject, f, b);
                    if (a2 != null) {
                        thVar.a(a2);
                    }
                }
            }
        }
    }

    xe a(JSONObject jSONObject, String str, float f, x0 x0Var) {
        xe b = xe.b(str);
        if (jSONObject.has("pvalue")) {
            float optDouble = (float) jSONObject.optDouble("pvalue", b.g());
            if (optDouble >= 0.0f && optDouble <= 100.0f) {
                if (f > 0.0f) {
                    b.b((optDouble * f) / 100.0f);
                    return b;
                }
                b.a(optDouble);
                return b;
            }
            x0Var.a("pvalue").a(3007, Float.toString(optDouble));
        }
        if (jSONObject.has("value")) {
            float optDouble2 = (float) jSONObject.optDouble("value", b.h());
            if (optDouble2 >= 0.0f) {
                b.b(optDouble2);
                return b;
            }
            x0Var.a("value").a(3007, Float.toString(optDouble2));
        }
        x0Var.a(3007);
        return null;
    }

    protected rh a(JSONObject jSONObject, float f) {
        return a(jSONObject, f, x0.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r1.equals(com.ironsource.X3.i.n) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected rh a(JSONObject jSONObject, float f, x0 x0Var) {
        rh a;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("url");
        char c = 0;
        boolean optBoolean = jSONObject.optBoolean("isImpression", false);
        if (!ti.e(optString2)) {
            x0Var.a("url").a(3007, optString2);
            return null;
        }
        if (TextUtils.isEmpty(optString)) {
            x0Var.a("type").a(3006);
            return null;
        }
        optString.getClass();
        switch (optString.hashCode()) {
            case -1439500848:
                break;
            case 1669348544:
                if (optString.equals("playheadViewabilityValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1788134515:
                if (optString.equals("playheadReachedValue")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                a = a(jSONObject, optString2, x0Var);
                break;
            case 1:
                a = a(jSONObject, optString2, f, optBoolean, x0Var);
                break;
            case 2:
                a = a(jSONObject, optString2, f, x0Var);
                break;
            default:
                a = rh.a(optString, optString2, optBoolean);
                break;
        }
        if (a != null) {
            a.a(jSONObject.optBoolean("needDecodeUrl", a.e()));
            String optString3 = jSONObject.optString("adsLightType");
            if (!TextUtils.isEmpty(optString3)) {
                a.a(optString3);
            }
        }
        return a;
    }

    public void a(int i) {
        this.e = i;
    }

    private rh a(JSONObject jSONObject, String str, float f, boolean z, x0 x0Var) {
        int i;
        int optInt = jSONObject.optInt("viewablePercent", -1);
        if (optInt >= 0 && optInt <= 100) {
            String a = za.a(jSONObject, "target");
            if (TextUtils.isEmpty(a)) {
                i = this.e;
            } else if ("video".equals(a)) {
                i = 2;
            } else {
                if (!"banner".equals(a)) {
                    x0Var.a("target").c(3007, a);
                    return null;
                }
                i = 1;
            }
            if (jSONObject.has("ovv")) {
                ke a2 = ke.a(str, optInt, i, z);
                a2.b(jSONObject.optBoolean("ovv", false));
                if (jSONObject.has("pvalue")) {
                    float optDouble = (float) jSONObject.optDouble("pvalue", a2.h());
                    if (optDouble >= 0.0f && optDouble <= 100.0f) {
                        if (f > 0.0f) {
                            a2.b((optDouble * f) / 100.0f);
                            return a2;
                        }
                        a2.a(optDouble);
                        return a2;
                    }
                }
                if (jSONObject.has("value")) {
                    float optDouble2 = (float) jSONObject.optDouble("value", a2.i());
                    if (optDouble2 >= 0.0f) {
                        a2.b(optDouble2);
                        return a2;
                    }
                }
            }
            float optDouble3 = (float) jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, -1.0d);
            if (optDouble3 < 0.0f) {
                x0 a3 = x0Var.a(IronSourceConstants.EVENTS_DURATION);
                if (!jSONObject.has(IronSourceConstants.EVENTS_DURATION)) {
                    a3.c(3006);
                } else {
                    a3.c(3007, Float.toString(optDouble3));
                }
                return null;
            }
            return gc.a(str, optDouble3, optInt, jSONObject.optBoolean("mrc", true), i, z);
        }
        x0Var.a("viewablePercent").c(3007, Integer.toString(optInt));
        return null;
    }

    private je a(JSONObject jSONObject, String str, x0 x0Var) {
        if (jSONObject.has("view")) {
            return je.a(str, jSONObject.optString("view"));
        }
        x0Var.a("view").c(3006);
        return null;
    }
}
