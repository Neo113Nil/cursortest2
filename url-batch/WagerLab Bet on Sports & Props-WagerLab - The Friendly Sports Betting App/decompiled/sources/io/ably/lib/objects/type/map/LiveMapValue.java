package io.ably.lib.objects.type.map;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.ably.lib.objects.type.counter.LiveCounter;

/* loaded from: classes7.dex */
public abstract class LiveMapValue {
    public abstract Object getValue();

    public boolean isBinary() {
        return false;
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean isJsonArray() {
        return false;
    }

    public boolean isJsonObject() {
        return false;
    }

    public boolean isLiveCounter() {
        return false;
    }

    public boolean isLiveMap() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public Boolean getAsBoolean() {
        throw new IllegalStateException("Not a Boolean value");
    }

    public byte[] getAsBinary() {
        throw new IllegalStateException("Not a Binary value");
    }

    public Number getAsNumber() {
        throw new IllegalStateException("Not a Number value");
    }

    public String getAsString() {
        throw new IllegalStateException("Not a String value");
    }

    public JsonArray getAsJsonArray() {
        throw new IllegalStateException("Not a JsonArray value");
    }

    public JsonObject getAsJsonObject() {
        throw new IllegalStateException("Not a JsonObject value");
    }

    public LiveCounter getAsLiveCounter() {
        throw new IllegalStateException("Not a LiveCounter value");
    }

    public LiveMap getAsLiveMap() {
        throw new IllegalStateException("Not a LiveMap value");
    }

    public static LiveMapValue of(Boolean bool) {
        return new BooleanValue(bool);
    }

    public static LiveMapValue of(byte[] bArr) {
        return new BinaryValue(bArr);
    }

    public static LiveMapValue of(Number number) {
        return new NumberValue(number);
    }

    public static LiveMapValue of(String str) {
        return new StringValue(str);
    }

    public static LiveMapValue of(JsonArray jsonArray) {
        return new JsonArrayValue(jsonArray);
    }

    public static LiveMapValue of(JsonObject jsonObject) {
        return new JsonObjectValue(jsonObject);
    }

    public static LiveMapValue of(LiveCounter liveCounter) {
        return new LiveCounterValue(liveCounter);
    }

    public static LiveMapValue of(LiveMap liveMap) {
        return new LiveMapValueWrapper(liveMap);
    }

    private static final class BooleanValue extends LiveMapValue {
        private final Boolean value;

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isBoolean() {
            return true;
        }

        BooleanValue(Boolean bool) {
            this.value = bool;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Boolean getAsBoolean() {
            return this.value;
        }
    }

    private static final class BinaryValue extends LiveMapValue {
        private final byte[] value;

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isBinary() {
            return true;
        }

        BinaryValue(byte[] bArr) {
            this.value = bArr;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public byte[] getAsBinary() {
            return this.value;
        }
    }

    private static final class NumberValue extends LiveMapValue {
        private final Number value;

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isNumber() {
            return true;
        }

        NumberValue(Number number) {
            this.value = number;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Number getAsNumber() {
            return this.value;
        }
    }

    private static final class StringValue extends LiveMapValue {
        private final String value;

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isString() {
            return true;
        }

        StringValue(String str) {
            this.value = str;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public String getAsString() {
            return this.value;
        }
    }

    private static final class JsonArrayValue extends LiveMapValue {
        private final JsonArray value;

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isJsonArray() {
            return true;
        }

        JsonArrayValue(JsonArray jsonArray) {
            this.value = jsonArray;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public JsonArray getAsJsonArray() {
            return this.value;
        }
    }

    private static final class JsonObjectValue extends LiveMapValue {
        private final JsonObject value;

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isJsonObject() {
            return true;
        }

        JsonObjectValue(JsonObject jsonObject) {
            this.value = jsonObject;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public JsonObject getAsJsonObject() {
            return this.value;
        }
    }

    private static final class LiveCounterValue extends LiveMapValue {
        private final LiveCounter value;

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isLiveCounter() {
            return true;
        }

        LiveCounterValue(LiveCounter liveCounter) {
            this.value = liveCounter;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public LiveCounter getAsLiveCounter() {
            return this.value;
        }
    }

    private static final class LiveMapValueWrapper extends LiveMapValue {
        private final LiveMap value;

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isLiveMap() {
            return true;
        }

        LiveMapValueWrapper(LiveMap liveMap) {
            this.value = liveMap;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public LiveMap getAsLiveMap() {
            return this.value;
        }
    }
}
