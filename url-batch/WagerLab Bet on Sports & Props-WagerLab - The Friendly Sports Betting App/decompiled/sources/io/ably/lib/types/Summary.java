package io.ably.lib.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes7.dex */
public class Summary {
    private static final String CLIENT_IDS = "clientIds";
    private static final String CLIPPED = "clipped";
    private static final String TAG = "io.ably.lib.types.Summary";
    private static final String TOTAL = "total";
    private static final String TOTAL_CLIENT_IDS = "totalClientIds";
    private static final String TOTAL_UNIDENTIFIED = "totalUnidentified";
    private final Map<String, JsonObject> typeToSummaryJson;

    public Summary(Map<String, JsonObject> map) {
        this.typeToSummaryJson = map;
    }

    public static Map<String, SummaryClientIdList> asSummaryDistinctV1(JsonObject jsonObject) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            hashMap.put(entry.getKey(), asSummaryFlagV1(entry.getValue().getAsJsonObject()));
        }
        return hashMap;
    }

    public static Map<String, SummaryClientIdList> asSummaryUniqueV1(JsonObject jsonObject) {
        return asSummaryDistinctV1(jsonObject);
    }

    public static Map<String, SummaryClientIdCounts> asSummaryMultipleV1(JsonObject jsonObject) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonObject asJsonObject = entry.getValue().getAsJsonObject();
            int asInt = asJsonObject.get(TOTAL).getAsInt();
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, JsonElement> entry2 : asJsonObject.get(CLIENT_IDS).getAsJsonObject().entrySet()) {
                hashMap2.put(entry2.getKey(), Integer.valueOf(entry2.getValue().getAsInt()));
            }
            Integer tryReadIntField = tryReadIntField(asJsonObject, TOTAL_UNIDENTIFIED);
            Integer tryReadIntField2 = tryReadIntField(asJsonObject, TOTAL_CLIENT_IDS);
            hashMap.put(key, new SummaryClientIdCounts(asInt, hashMap2, tryReadIntField == null ? 0 : tryReadIntField.intValue(), tryReadBooleanField(asJsonObject, CLIPPED), tryReadIntField2 == null ? asInt : tryReadIntField2.intValue()));
        }
        return hashMap;
    }

    public static SummaryClientIdList asSummaryFlagV1(JsonObject jsonObject) {
        return new SummaryClientIdList(jsonObject.get(TOTAL).getAsInt(), (List) Serialisation.gson.fromJson(jsonObject.get(CLIENT_IDS), List.class), tryReadBooleanField(jsonObject, CLIPPED));
    }

    public static SummaryTotal asSummaryTotalV1(JsonObject jsonObject) {
        return new SummaryTotal(jsonObject.get(TOTAL).getAsInt());
    }

    private static boolean tryReadBooleanField(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
            return jsonElement.getAsBoolean();
        }
        return false;
    }

    private static Integer tryReadIntField(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return Integer.valueOf(jsonElement.getAsInt());
        }
        return null;
    }

    static Summary read(MessageUnpacker messageUnpacker) {
        try {
            return read(Serialisation.msgpackToGson(messageUnpacker.unpackValue()));
        } catch (Exception e) {
            Log.e(TAG, "Failed to read summary from MessagePack", e);
            return null;
        }
    }

    static Summary read(JsonElement jsonElement) {
        if (!jsonElement.isJsonObject()) {
            throw new JsonParseException("Expected an object but got \"" + jsonElement.getClass() + "\".");
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            if (!entry.getValue().isJsonObject()) {
                throw new JsonParseException("Expected an object but got \"" + jsonElement.getClass() + "\".");
            }
            hashMap.put(entry.getKey(), entry.getValue().getAsJsonObject());
        }
        return new Summary(hashMap);
    }

    public JsonObject get(String str) {
        return this.typeToSummaryJson.get(str);
    }

    void write(MessagePacker messagePacker) {
        Serialisation.gsonToMsgpack(toJsonTree(), messagePacker);
    }

    JsonElement toJsonTree() {
        return Serialisation.gson.toJsonTree(this);
    }

    public static class Serializer implements JsonSerializer<Summary>, JsonDeserializer<Summary> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Summary summary, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry entry : summary.typeToSummaryJson.entrySet()) {
                jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
            }
            return jsonObject;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Summary deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return Summary.read(jsonElement);
        }
    }
}
