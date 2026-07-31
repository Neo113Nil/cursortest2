package kotlinx.serialization.json.internal;

import com.adjust.sdk.Constants;
import com.safedk.android.analytics.brandsafety.m;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes9.dex */
abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final String polymorphicDiscriminator;
    private final JsonElement value;

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, str);
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    protected String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract JsonElement currentElement(String str);

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public abstract JsonElement getValue();

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i & 4) != 0 ? null : str, null);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public Json getJson() {
        return this.json;
    }

    protected final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    private AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str) {
        this.json = json;
        this.value = jsonElement;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    protected final JsonElement currentObject() {
        JsonElement currentElement;
        String str = (String) getCurrentTagOrNull();
        return (str == null || (currentElement = currentElement(str)) == null) ? getValue() : currentElement;
    }

    public final String renderTagStack(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return renderTagStack() + '.' + currentTag;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return currentObject();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement currentObject = currentObject();
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) || (kind instanceof PolymorphicKind)) {
            Json json = getJson();
            String serialName = descriptor.getSerialName();
            if (currentObject instanceof JsonArray) {
                return new JsonTreeListDecoder(json, (JsonArray) currentObject);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), currentObject.toString());
        }
        if (!Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json2 = getJson();
            String serialName2 = descriptor.getSerialName();
            if (currentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json2, (JsonObject) currentObject, this.polymorphicDiscriminator, null, 8, null);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName2 + " at element: " + renderTagStack(), currentObject.toString());
        }
        Json json3 = getJson();
        SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json3.getSerializersModule());
        SerialKind kind2 = carrierDescriptor.getKind();
        if ((kind2 instanceof PrimitiveKind) || Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
            Json json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (currentObject instanceof JsonObject) {
                return new JsonTreeMapDecoder(json4, (JsonObject) currentObject);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName3 + " at element: " + renderTagStack(), currentObject.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
        }
        Json json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (currentObject instanceof JsonArray) {
            return new JsonTreeListDecoder(json5, (JsonArray) currentObject);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName4 + " at element: " + renderTagStack(), currentObject.toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object decodeSerializableValue(DeserializationStrategy deserializer) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractPolymorphicSerializer) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(this);
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializer;
        String classDiscriminator = PolymorphicKt.classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), getJson());
        JsonElement decodeJsonElement = decodeJsonElement();
        String serialName = abstractPolymorphicSerializer.getDescriptor().getSerialName();
        if (decodeJsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) decodeJsonElement;
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) classDiscriminator);
            try {
                DeserializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, this, (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
                Intrinsics.checkNotNull(findPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return TreeJsonDecoderKt.readPolymorphicJson(getJson(), classDiscriminator, jsonObject, findPolymorphicSerializer);
            } catch (SerializationException e) {
                String message = e.getMessage();
                Intrinsics.checkNotNull(message);
                throw JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), decodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof JsonNull);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedBoolean(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive);
                if (booleanOrNull == null) {
                    unparsedPrimitive(jsonPrimitive, "boolean", tag);
                    throw new KotlinNothingValueException();
                }
                return booleanOrNull.booleanValue();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public byte decodeTaggedByte(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                long parseLongImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                Byte valueOf = (-128 > parseLongImpl || parseLongImpl > 127) ? null : Byte.valueOf((byte) parseLongImpl);
                if (valueOf == null) {
                    unparsedPrimitive(jsonPrimitive, "byte", tag);
                    throw new KotlinNothingValueException();
                }
                return valueOf.byteValue();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of byte at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public char decodeTaggedChar(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                return StringsKt.single(jsonPrimitive.getContent());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of char at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public double decodeTaggedDouble(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                double d = JsonElementKt.getDouble(jsonPrimitive);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || Math.abs(d) <= Double.MAX_VALUE) {
                    return d;
                }
                throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(d), tag, currentObject().toString());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of double at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public float decodeTaggedFloat(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                float f = JsonElementKt.getFloat(jsonPrimitive);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || Math.abs(f) <= Float.MAX_VALUE) {
                    return f;
                }
                throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(f), tag, currentObject().toString());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of float at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedInt(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                long parseLongImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                Integer valueOf = (-2147483648L > parseLongImpl || parseLongImpl > 2147483647L) ? null : Integer.valueOf((int) parseLongImpl);
                if (valueOf == null) {
                    unparsedPrimitive(jsonPrimitive, m.w, tag);
                    throw new KotlinNothingValueException();
                }
                return valueOf.intValue();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, m.w, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of " + m.w + " at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public long decodeTaggedLong(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                return JsonElementKt.parseLongImpl(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, Constants.LONG, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of " + Constants.LONG + " at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public short decodeTaggedShort(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                long parseLongImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                Short valueOf = (-32768 > parseLongImpl || parseLongImpl > 32767) ? null : Short.valueOf((short) parseLongImpl);
                if (valueOf == null) {
                    unparsedPrimitive(jsonPrimitive, "short", tag);
                    throw new KotlinNothingValueException();
                }
                return valueOf.shortValue();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of short at element: " + renderTagStack(tag), currentElement.toString());
    }

    private final Void unparsedPrimitive(JsonPrimitive jsonPrimitive, String str, String str2) {
        StringBuilder sb;
        String str3;
        if (StringsKt.startsWith$default(str, "i", false, 2, (Object) null)) {
            sb = new StringBuilder();
            str3 = "an ";
        } else {
            sb = new StringBuilder();
            str3 = "a ";
        }
        sb.append(str3);
        sb.append(str);
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + sb.toString() + " value at element: " + renderTagStack(str2), currentObject().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedEnum(String tag, SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Json json = getJson();
        JsonElement currentElement = currentElement(tag);
        String serialName = enumDescriptor.getSerialName();
        if (currentElement instanceof JsonPrimitive) {
            return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, json, ((JsonPrimitive) currentElement).getContent(), null, 4, null);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public String decodeTaggedString(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            if (!(jsonPrimitive instanceof JsonLiteral)) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + renderTagStack(tag), currentObject().toString());
            }
            JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
            if (!jsonLiteral.isString() && !getJson().getConfiguration().isLenient()) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted at element: " + renderTagStack(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", currentObject().toString());
            }
            return jsonLiteral.getContent();
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of string at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public Decoder decodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            Json json = getJson();
            JsonElement currentElement = currentElement(tag);
            String serialName = inlineDescriptor.getSerialName();
            if (currentElement instanceof JsonPrimitive) {
                return new JsonDecoderForUnsignedTypes(StringJsonLexerKt.StringJsonLexer(json, ((JsonPrimitive) currentElement).getContent()), getJson());
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), currentElement.toString());
        }
        return super.decodeTaggedInline((Object) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return getCurrentTagOrNull() != null ? super.decodeInline(descriptor) : new JsonPrimitiveDecoder(getJson(), getValue(), this.polymorphicDiscriminator).decodeInline(descriptor);
    }
}
