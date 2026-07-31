package kotlinx.serialization.json;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonElementBuilders.kt */
/* loaded from: classes3.dex */
public abstract class JsonElementBuildersKt {
    public static final JsonElement putJsonObject(JsonObjectBuilder jsonObjectBuilder, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        builderAction.invoke(jsonObjectBuilder2);
        return jsonObjectBuilder.put(key, jsonObjectBuilder2.build());
    }

    public static final JsonElement putJsonArray(JsonObjectBuilder jsonObjectBuilder, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        builderAction.invoke(jsonArrayBuilder);
        return jsonObjectBuilder.put(key, jsonArrayBuilder.build());
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive(bool));
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String key, Number number) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive(number));
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String key, String str) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive(str));
    }

    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, String str) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(str));
    }
}
