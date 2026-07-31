package com.my.target;

import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class o2 {
    final int a;
    final int b;
    final float c;
    final float d;
    private String e;
    boolean f = false;

    public o2(int i, float f, float f2) {
        this.a = i;
        this.b = g1.b(i);
        this.c = f;
        this.d = f2;
    }

    public static String a(o2 o2Var) {
        JSONObject d;
        if (o2Var == null || (d = o2Var.d()) == null || d.length() <= 0) {
            return null;
        }
        return d.toString();
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = this.a;
            if (i != -1) {
                jSONObject.put("clickArea", i);
            }
            float f = this.c;
            if (f != 1.0f) {
                jSONObject.put("xRelative", f);
            }
            float f2 = this.d;
            if (f2 != 1.0f) {
                jSONObject.put("yRelative", f2);
            }
            jSONObject.putOpt("message", this.e);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean a() {
        return this.f && this.b != -1;
    }
}
