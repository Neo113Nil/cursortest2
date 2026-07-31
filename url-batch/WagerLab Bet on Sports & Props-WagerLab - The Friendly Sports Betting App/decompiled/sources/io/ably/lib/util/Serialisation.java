package io.ably.lib.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Annotation;
import io.ably.lib.types.AnnotationAction;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageAnnotations;
import io.ably.lib.types.MessageExtras;
import io.ably.lib.types.MessageVersion;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.Summary;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;

/* loaded from: classes7.dex */
public class Serialisation {
    public static final Gson gson;
    public static final GsonBuilder gsonBuilder;
    public static final JsonParser gsonParser = new JsonParser();
    public static HttpBodyHandler<JsonElement> httpBodyHandler;
    public static HttpResponseHandler<JsonElement> httpResponseHandler;
    public static final MessagePack.PackerConfig msgpackPackerConfig;
    public static final MessagePack.UnpackerConfig msgpackUnpackerConfig;

    public interface FromJsonElement<T> {
        T fromJsonElement(JsonElement jsonElement);
    }

    static {
        MessagePack.PackerConfig packerConfig;
        GsonBuilder gsonBuilder2 = new GsonBuilder();
        gsonBuilder = gsonBuilder2;
        gsonBuilder2.registerTypeAdapter(Message.class, new Message.Serializer());
        gsonBuilder2.registerTypeAdapter(MessageExtras.class, new MessageExtras.Serializer());
        gsonBuilder2.registerTypeAdapter(PresenceMessage.class, new PresenceMessage.Serializer());
        gsonBuilder2.registerTypeAdapter(PresenceMessage.Action.class, new PresenceMessage.ActionSerializer());
        gsonBuilder2.registerTypeAdapter(ProtocolMessage.Action.class, new ProtocolMessage.ActionSerializer());
        gsonBuilder2.registerTypeAdapter(MessageVersion.class, new MessageVersion.Serializer());
        gsonBuilder2.registerTypeAdapter(Annotation.class, new Annotation.Serializer());
        gsonBuilder2.registerTypeAdapter(AnnotationAction.class, new Annotation.ActionSerializer());
        gsonBuilder2.registerTypeAdapter(MessageAnnotations.class, new MessageAnnotations.Serializer());
        gsonBuilder2.registerTypeAdapter(Summary.class, new Summary.Serializer());
        gson = gsonBuilder2.create();
        if ("android".equals("android")) {
            packerConfig = new MessagePack.PackerConfig().withSmallStringOptimizationThreshold(Integer.MAX_VALUE);
        } else {
            packerConfig = MessagePack.DEFAULT_PACKER_CONFIG;
        }
        msgpackPackerConfig = packerConfig;
        msgpackUnpackerConfig = MessagePack.DEFAULT_UNPACKER_CONFIG;
        httpResponseHandler = new HttpResponseHandler<>();
        httpBodyHandler = new HttpBodyHandler<>();
    }

    public static byte[] gsonToMsgpack(JsonElement jsonElement) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker newPacker = msgpackPackerConfig.newPacker(byteArrayOutputStream);
            gsonToMsgpack(jsonElement, newPacker);
            newPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static JsonElement msgpackToGson(byte[] bArr) {
        try {
            return msgpackToGson(msgpackUnpackerConfig.newUnpacker(bArr).unpackValue());
        } catch (IOException unused) {
            return null;
        }
    }

    public static class HttpResponseHandler<T> implements HttpCore.ResponseHandler<T> {
        private final FromJsonElement<T> converter;
        private final Class<T> klass;

        public HttpResponseHandler(Class<T> cls, FromJsonElement<T> fromJsonElement) {
            this.klass = cls;
            this.converter = fromJsonElement;
        }

        public <U extends JsonElement> HttpResponseHandler() {
            this(null, null);
        }

        @Override // io.ably.lib.http.HttpCore.ResponseHandler
        public T handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
            if (errorInfo != null) {
                throw AblyException.fromErrorInfo(errorInfo);
            }
            if (HttpConstants.ContentTypes.JSON.equals(response.contentType)) {
                if (this.klass != null) {
                    return (T) Serialisation.jsonBytesToGson(response.body, this.klass);
                }
                return (T) Serialisation.jsonBytesToGson(response.body);
            }
            if ("application/x-msgpack".equals(response.contentType)) {
                FromJsonElement<T> fromJsonElement = this.converter;
                if (fromJsonElement != null) {
                    return fromJsonElement.fromJsonElement(Serialisation.msgpackToGson(response.body));
                }
                return (T) Serialisation.msgpackToGson(response.body);
            }
            throw AblyException.fromThrowable(new Exception("unknown content type " + response.contentType));
        }
    }

    public static class HttpBodyHandler<T> implements HttpCore.BodyHandler<T> {
        private final FromJsonElement<T> converter;
        private final Class<T[]> klass;

        public HttpBodyHandler(Class<T[]> cls, FromJsonElement<T> fromJsonElement) {
            this.klass = cls;
            this.converter = fromJsonElement;
        }

        public <U extends JsonElement> HttpBodyHandler() {
            this(null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public T[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            JsonArray jsonArray;
            if (HttpConstants.ContentTypes.JSON.equals(str)) {
                Class<T[]> cls = this.klass;
                if (cls != null) {
                    return (T[]) ((Object[]) Serialisation.jsonBytesToGson(bArr, cls));
                }
                jsonArray = (JsonArray) Serialisation.jsonBytesToGson(bArr, JsonArray.class);
            } else if ("application/x-msgpack".equals(str)) {
                jsonArray = (JsonArray) Serialisation.msgpackToGson(bArr);
            } else {
                throw AblyException.fromThrowable(new Exception("unknown content type " + str));
            }
            Class<T[]> cls2 = this.klass;
            T[] cast = cls2.cast(Array.newInstance(cls2.getComponentType(), jsonArray.size()));
            Iterator<JsonElement> it = jsonArray.iterator();
            int i = 0;
            while (it.hasNext()) {
                JsonElement next = it.next();
                FromJsonElement<T> fromJsonElement = this.converter;
                if (fromJsonElement != null) {
                    cast[i] = fromJsonElement.fromJsonElement(next);
                } else {
                    cast[i] = next;
                }
                i++;
            }
            return cast;
        }
    }

    public static JsonElement jsonBytesToGson(byte[] bArr) {
        return (JsonElement) jsonBytesToGson(bArr, JsonElement.class);
    }

    public static <T> T jsonBytesToGson(byte[] bArr, Class<T> cls) {
        try {
            return (T) gson.fromJson(new String(bArr, "UTF-8"), (Class) cls);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static void gsonToMsgpack(JsonElement jsonElement, MessagePacker messagePacker) {
        if (jsonElement.isJsonArray()) {
            gsonToMsgpack((JsonArray) jsonElement, messagePacker);
            return;
        }
        if (jsonElement.isJsonObject()) {
            gsonToMsgpack((JsonObject) jsonElement, messagePacker);
        } else if (jsonElement.isJsonNull()) {
            gsonToMsgpack((JsonNull) jsonElement, messagePacker);
        } else {
            if (jsonElement.isJsonPrimitive()) {
                gsonToMsgpack((JsonPrimitive) jsonElement, messagePacker);
                return;
            }
            throw new RuntimeException("unreachable");
        }
    }

    private static void gsonToMsgpack(JsonArray jsonArray, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(jsonArray.size());
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                gsonToMsgpack(it.next(), messagePacker);
            }
        } catch (IOException unused) {
        }
    }

    private static void gsonToMsgpack(JsonObject jsonObject, MessagePacker messagePacker) {
        try {
            Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
            messagePacker.packMapHeader(entrySet.size());
            for (Map.Entry<String, JsonElement> entry : entrySet) {
                messagePacker.packString(entry.getKey());
                gsonToMsgpack(entry.getValue(), messagePacker);
            }
        } catch (IOException unused) {
        }
    }

    private static void gsonToMsgpack(JsonNull jsonNull, MessagePacker messagePacker) {
        try {
            messagePacker.packNil();
        } catch (IOException unused) {
        }
    }

    private static void gsonToMsgpack(JsonPrimitive jsonPrimitive, MessagePacker messagePacker) {
        try {
            if (jsonPrimitive.isBoolean()) {
                messagePacker.packBoolean(jsonPrimitive.getAsBoolean());
                return;
            }
            if (jsonPrimitive.isNumber()) {
                Number asNumber = jsonPrimitive.getAsNumber();
                if (!(asNumber instanceof BigDecimal) && !(asNumber instanceof Double)) {
                    if (asNumber instanceof Float) {
                        messagePacker.packFloat(asNumber.floatValue());
                        return;
                    }
                    if (!(asNumber instanceof BigInteger) && !(asNumber instanceof Long)) {
                        if (asNumber instanceof Integer) {
                            messagePacker.packInt(asNumber.intValue());
                            return;
                        }
                        if (asNumber instanceof Short) {
                            messagePacker.packShort(asNumber.shortValue());
                            return;
                        } else if (asNumber instanceof Byte) {
                            messagePacker.packByte(asNumber.byteValue());
                            return;
                        } else {
                            messagePacker.packString(jsonPrimitive.getAsString());
                            return;
                        }
                    }
                    messagePacker.packLong(asNumber.longValue());
                    return;
                }
                messagePacker.packDouble(asNumber.doubleValue());
                return;
            }
            messagePacker.packString(jsonPrimitive.getAsString());
        } catch (IOException unused) {
        }
    }

    /* renamed from: io.ably.lib.util.Serialisation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$value$ValueType;

        static {
            int[] iArr = new int[ValueType.values().length];
            $SwitchMap$org$msgpack$value$ValueType = iArr;
            try {
                iArr[ValueType.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static JsonElement msgpackToGson(Value value) {
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[value.getValueType().ordinal()]) {
            case 1:
                return JsonNull.INSTANCE;
            case 2:
                return new JsonPrimitive(Boolean.valueOf(value.asBooleanValue().getBoolean()));
            case 3:
                return new JsonPrimitive(Long.valueOf(value.asIntegerValue().asLong()));
            case 4:
                return new JsonPrimitive(Double.valueOf(value.asFloatValue().toDouble()));
            case 5:
                return new JsonPrimitive(value.asStringValue().asString());
            case 6:
                return new JsonPrimitive(Base64Coder.encodeToString(value.asBinaryValue().asByteArray()));
            case 7:
                JsonArray jsonArray = new JsonArray();
                Iterator<Value> it = value.asArrayValue().iterator();
                while (it.hasNext()) {
                    jsonArray.add(msgpackToGson(it.next()));
                }
                return jsonArray;
            case 8:
                JsonObject jsonObject = new JsonObject();
                for (Map.Entry<Value, Value> entry : value.asMapValue().entrySet()) {
                    jsonObject.add(entry.getKey().asStringValue().asString(), msgpackToGson(entry.getValue()));
                }
                return jsonObject;
            default:
                return null;
        }
    }
}
