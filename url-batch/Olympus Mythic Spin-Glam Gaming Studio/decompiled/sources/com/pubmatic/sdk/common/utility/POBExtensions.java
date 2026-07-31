package com.pubmatic.sdk.common.utility;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0007\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0001¨\u0006\t"}, d2 = {"putIfNotEmpty", "Lorg/json/JSONObject;", "key", "", "value", "putIfNotNullOrEmpty", "toTrimmedNonEmptyStringsArray", "Lorg/json/JSONArray;", "toValueJsonArray", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class POBExtensions {
    @NotNull
    public static final JSONObject putIfNotEmpty(@NotNull JSONObject jSONObject, @NotNull String key, @NotNull JSONObject value) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() > 0) {
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject putIfNotNullOrEmpty(@NotNull JSONObject jSONObject, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str != null && str.length() != 0) {
            jSONObject.put(key, str);
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONArray toTrimmedNonEmptyStringsArray(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = jSONArray.optString(i, "");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(i, \"\")");
            String obj = StringsKt.trim(optString).toString();
            if (obj.length() > 0) {
                jSONArray2.put(obj);
            }
        }
        return jSONArray2;
    }

    @Nullable
    public static final JSONArray toValueJsonArray(@NotNull JSONObject jSONObject) {
        JSONArray jSONArray;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject.length() == 0) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String scheme = keys.next();
            Intrinsics.checkNotNullExpressionValue(scheme, "scheme");
            if (!StringsKt.isBlank(scheme)) {
                JSONArray optJSONArray = jSONObject.optJSONArray(scheme);
                if (optJSONArray == null || (jSONArray = toTrimmedNonEmptyStringsArray(optJSONArray)) == null) {
                    jSONArray = new JSONArray();
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    linkedHashSet.add(jSONArray.getString(i));
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            jSONArray2.put((String) it.next());
        }
        return jSONArray2;
    }
}
