package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4537a1 {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "adUnits";

    @Nullable
    private final JSONObject a;

    /* renamed from: com.ironsource.a1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4537a1(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.a = configurations.optJSONObject(c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull Function1 valueExtractor) {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return MapsKt.emptyMap();
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "adUnits.keys()");
        Sequence asSequence = SequencesKt.asSequence(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : asSequence) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) obj);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(obj, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
