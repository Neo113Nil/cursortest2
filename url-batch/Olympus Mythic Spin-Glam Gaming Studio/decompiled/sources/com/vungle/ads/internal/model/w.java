package com.vungle.ads.internal.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonTransformingSerializer;

/* loaded from: classes5.dex */
public final class w extends JsonTransformingSerializer {
    public static final w a = new w();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w() {
        super(BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(r0), BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(r0))));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
    }

    @Override // kotlinx.serialization.json.JsonTransformingSerializer
    public final JsonElement transformDeserialize(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        JsonObject jsonObject = JsonElementKt.getJsonObject(element);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "moat")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new JsonObject(linkedHashMap);
    }
}
