package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴭ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0972 extends AbstractC1173 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2330 = StringFog.decrypt("/aES\n", "jtVhYzGaV44=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2329 = StringFog.decrypt("R9U=\n", "M6Y0RQ4OQz8=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2328 = StringFog.decrypt("pxE=\n", "0mW8Ahv1OP8=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int f2333 = (int) TimeUnit.SECONDS.toMillis(120);

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f2332 = StringFog.decrypt("BeVJwm+Tcg==\n", "dZcmtgD9AYk=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f2331 = StringFog.decrypt("tFw2x6+iIN2i\n", "0TBTpNvQT7M=\n");

    public C0972(C0839 c0839) {
        this.f2997 = c0839;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String m4267() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("MV9G\n", "RC0qR4rUK9s=\n"));
        return optJSONObject != null ? optJSONObject.optString(StringFog.decrypt("AA==\n", "ZaXRMcTTupY=\n"), this.f2331) : this.f2331;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final long m4268() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optLong(f2328, 0L);
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final long m4269() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optLong(f2329, 0L);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m4270() {
        JSONObject jSONObject;
        if (((C0600) AbstractC0590.m4087()).f1007) {
            synchronized (this) {
                jSONObject = this.f2998;
            }
            if (jSONObject.optBoolean(StringFog.decrypt("4AaCgA==\n", "hG/j5+iKNZ0=\n"), false)) {
                return m4273();
            }
        }
        return m4447().optInt(StringFog.decrypt("oK1t\n", "zdseBbwIGQ8=\n"), 9850);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m4271() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optInt(StringFog.decrypt("gov6\n", "7+6KvW+Bh0c=\n"), 40);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List m4272() {
        JSONObject jSONObject;
        C0839 c0839 = this.f2997;
        JSONObject jSONObject2 = c0839.f2054;
        String str = c0839.f2055;
        List arrayList = new ArrayList();
        String str2 = AbstractC1006.f2436;
        JSONArray optJSONArray = jSONObject2.optJSONArray(str);
        if (optJSONArray != null) {
            arrayList = AbstractC1006.m4289(optJSONArray);
        }
        synchronized (this) {
            jSONObject = this.f2998;
        }
        String decrypt = StringFog.decrypt("XhPt\n", "O2eVrWcctz4=\n");
        List arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray(decrypt);
        if (optJSONArray2 != null) {
            arrayList2 = AbstractC1006.m4289(optJSONArray2);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int m4273() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optInt(StringFog.decrypt("aMzdTgNZeQ==\n", "DKW8KW4vCiA=\n"), 1000000);
    }
}
