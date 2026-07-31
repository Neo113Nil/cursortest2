package io.ably.lib.objects;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.ably.lib.util.Log;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public class ObjectsJsonSerializer implements JsonSerializer<Object[]>, JsonDeserializer<Object[]> {
    private static final String TAG = "io.ably.lib.objects.ObjectsJsonSerializer";

    @Override // com.google.gson.JsonDeserializer
    public Object[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        ObjectsSerializer serializer = ObjectsHelper.getSerializer();
        if (serializer == null) {
            Log.w(TAG, "Skipping 'state' field json deserialization because ObjectsSerializer not found.");
            return null;
        }
        if (!jsonElement.isJsonArray()) {
            throw new JsonParseException("Expected a JSON array for 'state' field, but got: " + jsonElement);
        }
        return serializer.readFromJsonArray(jsonElement.getAsJsonArray());
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Object[] objArr, Type type, JsonSerializationContext jsonSerializationContext) {
        ObjectsSerializer serializer = ObjectsHelper.getSerializer();
        if (serializer == null) {
            Log.w(TAG, "Skipping 'state' field json serialization because ObjectsSerializer not found.");
            return JsonNull.INSTANCE;
        }
        return serializer.asJsonArray(objArr);
    }
}
