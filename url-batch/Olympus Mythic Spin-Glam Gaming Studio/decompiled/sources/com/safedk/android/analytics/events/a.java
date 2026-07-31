package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a implements f, Comparable<a> {
    public static final String a = "event";
    public static final String b = "ts";
    public static final String c = "ad_format";
    public static final String d = "network";
    public static final String e = "creative_id";
    public static final String f = "dsp_name";
    private static final String g = "MaxEvent";
    private String h;
    private Long i;
    private String j;
    private String k;
    private String l;
    private String m;

    public String a() {
        return this.m;
    }

    public String b() {
        return this.h;
    }

    public void a(String str) {
        this.h = str;
    }

    public long c() {
        return this.i.longValue();
    }

    public String d() {
        return this.j;
    }

    public String e() {
        return this.k;
    }

    public String f() {
        return this.l;
    }

    public a() {
    }

    public a(String str, long j, String str2, String str3, String str4, String str5) {
        this.h = str;
        this.i = Long.valueOf(j);
        this.j = str2;
        this.k = str3;
        this.m = str4;
        this.l = str5;
        Logger.d(g, "New MaxEvent created , event=", str, ", timestamp=", Long.valueOf(j), ", adFormat=", str2, ", network=", str3, ", creativeId=", str4, ", dspName=", str5);
    }

    public a(a aVar) {
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.m = aVar.m;
        this.l = aVar.l;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("event", this.h);
        bundle.putLong("ts", this.i.longValue());
        bundle.putString("ad_format", this.j);
        bundle.putString("network", this.k);
        bundle.putString("creative_id", this.m);
        String str = this.l;
        if (str != null) {
            bundle.putString("dsp_name", str);
        }
        Logger.d(g, "MaxEvent toBundle : ", bundle.toString());
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("event:" + this.h + StringUtils.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ts:");
        sb2.append(this.i);
        sb.append(sb2.toString());
        sb.append("(" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.i.longValue() * 1000)) + "),");
        sb.append("ad_format:" + this.j + StringUtils.COMMA);
        sb.append("network:" + this.k + StringUtils.COMMA);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("creative_id:");
        sb3.append(this.m);
        sb.append(sb3.toString());
        if (this.l != null) {
            sb.append(",DSP_NAME:" + this.l);
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.i.compareTo(aVar.i);
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", this.i);
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("event", this.h);
        }
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put("adFormat", this.j);
        }
        if (!TextUtils.isEmpty(this.k)) {
            jSONObject.put("network", this.k);
        }
        if (!TextUtils.isEmpty(this.l)) {
            jSONObject.put("dspName", this.l);
        }
        if (!TextUtils.isEmpty(this.m)) {
            jSONObject.put("creativeId", this.m);
        }
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.i = Long.valueOf(jSONObject.optLong("timestamp", 0L));
            this.h = jSONObject.optString("event", "");
            this.j = jSONObject.optString("adFormat", "");
            this.k = jSONObject.optString("network", "");
            this.l = jSONObject.optString("dspName", "");
            this.m = jSONObject.optString("creativeId", "");
        }
    }
}
