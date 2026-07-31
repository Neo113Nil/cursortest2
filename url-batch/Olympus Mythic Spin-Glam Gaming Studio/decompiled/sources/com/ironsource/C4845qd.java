package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.qd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4845qd {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "placements";

    @NotNull
    public static final String d = "placementName";

    @Nullable
    private final JSONArray a;

    /* renamed from: com.ironsource.qd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4845qd(@NotNull JSONObject configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = configuration.optJSONArray(c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull Function1 valueExtractor) {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i);
                String key = jsonObject.optString("placementName");
                Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                Object invoke = valueExtractor.invoke(jsonObject);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, invoke);
            }
        }
        return linkedHashMap;
    }
}
