package com.moloco.sdk.internal.publisher.nativead.parser;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes5.dex */
public final class a {
    public static final int a = 0;

    @NotNull
    public final Object a(@NotNull String nativeOrtbString) {
        Intrinsics.checkNotNullParameter(nativeOrtbString, "nativeOrtbString");
        try {
            JSONObject jSONObject = new JSONObject(nativeOrtbString);
            JSONObject optJSONObject = jSONObject.optJSONObject("native");
            if (optJSONObject != null) {
                jSONObject = optJSONObject;
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(new com.moloco.sdk.internal.publisher.nativead.model.b(jSONObject.has("ver") ? jSONObject.getString("ver") : null, a(jSONObject.optJSONArray("assets")), a(jSONObject.optJSONObject("link")), c(jSONObject.optJSONArray("imptrackers")), b(jSONObject.optJSONArray("eventtrackers")), jSONObject.has("privacy") ? jSONObject.getString("privacy") : null));
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(e));
        }
    }

    public final b.a.C1548b b(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        String string = jSONObject.getString("url");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b.a.C1548b(i, z, valueOf, string, jSONObject.has("w") ? Integer.valueOf(jSONObject.getInt("w")) : null, jSONObject.has("h") ? Integer.valueOf(jSONObject.getInt("h")) : null);
    }

    public final b.a.c c(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("text");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b.a.c(i, z, string, jSONObject.has("len") ? Integer.valueOf(jSONObject.getInt("len")) : null);
    }

    public final b.a.d d(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString(POBNativeConstants.NATIVE_VAST_AD_TAG);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b.a.d(i, z, string);
    }

    public final List<String> c(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public final List<b.C1549b> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new b.C1549b(jSONObject.getInt("event"), jSONObject.getInt("method"), jSONObject.has("url") ? jSONObject.getString("url") : null));
        }
        return arrayList;
    }

    public final List<b.a> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("id")) {
                int i2 = jSONObject.getInt("id");
                boolean z = jSONObject.optInt("required", 0) == 1;
                Object c = c(jSONObject.optJSONObject("title"), i2, z);
                if (c == null && (c = b(jSONObject.optJSONObject("img"), i2, z)) == null && (c = d(jSONObject.optJSONObject("video"), i2, z)) == null) {
                    c = a(jSONObject.optJSONObject("data"), i2, z);
                }
                if (c != null) {
                    arrayList.add(c);
                }
            }
        }
        return arrayList;
    }

    public final b.a.C1547a a(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        Integer valueOf2 = jSONObject.has("len") ? Integer.valueOf(jSONObject.getInt("len")) : null;
        String string = jSONObject.getString("value");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b.a.C1547a(i, z, valueOf, valueOf2, string);
    }

    public final b.c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("url");
        String string2 = jSONObject.has("fallback") ? jSONObject.getString("fallback") : null;
        List<String> c = c(jSONObject.optJSONArray("clicktrackers"));
        Intrinsics.checkNotNull(string);
        return new b.c(string, c, string2);
    }
}
