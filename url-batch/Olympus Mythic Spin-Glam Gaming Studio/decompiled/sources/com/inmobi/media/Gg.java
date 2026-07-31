package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class Gg {
    public static final ContentValues a(C4053hg c4053hg) {
        Intrinsics.checkNotNullParameter(c4053hg, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c4053hg.b);
        contentValues.put("url", c4053hg.a);
        Map map = c4053hg.c;
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(c4053hg.d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, c4053hg.e);
        contentValues.put("ack_required", String.valueOf(c4053hg.f));
        contentValues.put("time_created", Long.valueOf(c4053hg.i));
        contentValues.put("retry_count", Integer.valueOf(c4053hg.g));
        contentValues.put("owner", c4053hg.h);
        Long l = c4053hg.j;
        contentValues.put("retryAfter", Long.valueOf(l != null ? l.longValue() : 0L));
        Bi bi = c4053hg.k;
        if (bi != null) {
            String jSONObject2 = new JSONObject().put("plType", bi.a.f).put("plId", bi.a.a).put("adType", bi.a.e).put("markupType", bi.b).put("networkType", F5.g()).put("creativeType", bi.f).put("creativeId", bi.g).put("isRewarded", bi.h).put("adPosition", bi.i).put("metadataBlob", bi.d).put("impressionId", bi.c).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            contentValues.put("telemetry_metadata", jSONObject2);
        }
        return contentValues;
    }

    public static final C4053hg a(ContentValues contentValues) {
        long j;
        Long l;
        Bi bi;
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (true) {
            String str = "";
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            String string = jSONObject.getString(next);
            if (string != null) {
                str = string;
            }
            linkedHashMap.put(next, str);
        }
        boolean parseBoolean = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean parseBoolean2 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int intValue = asInteger != null ? asInteger.intValue() : 0;
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str2 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        Intrinsics.checkNotNull(asString2);
        Intrinsics.checkNotNull(asString);
        Intrinsics.checkNotNull(asString3);
        Intrinsics.checkNotNull(asLong2);
        long longValue = asLong2.longValue();
        String json = contentValues.getAsString("telemetry_metadata");
        if (json != null) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject2 = new JSONObject(json);
                l = asLong;
                try {
                    String string2 = jSONObject2.getString("adType");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    C4378u0 c4378u0 = new C4378u0(string2);
                    j = longValue;
                    try {
                        c4378u0.b = jSONObject2.getLong("plId");
                        C4431w0 a = c4378u0.a();
                        String string3 = jSONObject2.getString("markupType");
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        String string4 = jSONObject2.getString("impressionId");
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        String optString = jSONObject2.optString("metadataBlob", "");
                        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                        String string5 = jSONObject2.getString("creativeType");
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        String string6 = jSONObject2.getString("creativeId");
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        bi = new Bi(a, string3, string4, optString, 0, string5, string6, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null, null);
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    j = longValue;
                }
            } catch (JSONException unused3) {
            }
            return new C4053hg(asString2, asString, linkedHashMap, parseBoolean, asString3, parseBoolean2, intValue, str2, j, l, bi);
        }
        j = longValue;
        l = asLong;
        bi = null;
        return new C4053hg(asString2, asString, linkedHashMap, parseBoolean, asString3, parseBoolean2, intValue, str2, j, l, bi);
    }
}
