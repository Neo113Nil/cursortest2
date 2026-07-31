package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o0 {
    private final JSONObject a;
    private final String b;
    private final String c;
    private final boolean d;
    private final long e;
    private JSONObject f;
    private Long g;

    o0(JSONObject jSONObject, String str, String str2, boolean z, long j) {
        this.b = str;
        this.a = jSONObject;
        this.c = str2;
        this.d = z;
        this.e = j;
    }

    public static o0 a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
                return a(jSONObject, str2, j);
            }
            x2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            x2.b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    public Long b() {
        return this.g;
    }

    public String c() {
        return this.c;
    }

    public JSONObject d() {
        return this.a;
    }

    public JSONObject e() {
        return this.f;
    }

    public long f() {
        return this.e;
    }

    public boolean g() {
        return this.d;
    }

    public static o0 a(JSONObject jSONObject, String str, long j) {
        return new o0(jSONObject, str, jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), jSONObject.has("autoRenewing"), j);
    }

    public String a() {
        return this.b;
    }

    public o0 a(Long l) {
        this.g = l;
        return this;
    }

    public o0 a(JSONObject jSONObject) {
        this.f = jSONObject;
        return this;
    }
}
