package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: StreamingJsonDecoder.kt */
/* loaded from: classes11.dex */
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder {
    private final JsonConfiguration configuration;
    private int currentIndex;
    private DiscriminatorHolder discriminatorHolder;
    private final JsonElementMarker elementMarker;
    private final Json json;
    public final AbstractJsonLexer lexer;
    private final WriteMode mode;
    private final SerializersModule serializersModule;

    /* compiled from: StreamingJsonDecoder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final Json getJson() {
        return this.json;
    }

    public StreamingJsonDecoder(Json json, WriteMode mode, AbstractJsonLexer lexer, SerialDescriptor descriptor, DiscriminatorHolder discriminatorHolder) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = discriminatorHolder;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
    }

    /* compiled from: StreamingJsonDecoder.kt */
    public static final class DiscriminatorHolder {
        public String discriminatorToSkip;

        public DiscriminatorHolder(String str) {
            this.discriminatorToSkip = str;
        }
    }

    private final boolean trySkip(DiscriminatorHolder discriminatorHolder, String str) {
        if (discriminatorHolder == null || !Intrinsics.areEqual(discriminatorHolder.discriminatorToSkip, str)) {
            return false;
        }
        discriminatorHolder.discriminatorToSkip = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decodeSerializableValue(DeserializationStrategy deserializer) {
        String message;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
        } catch (MissingFieldException e) {
            message = e.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
            }
        }
        if ((deserializer instanceof AbstractPolymorphicSerializer) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
            String classDiscriminator = PolymorphicKt.classDiscriminator(((AbstractPolymorphicSerializer) deserializer).getDescriptor(), this.json);
            String peekLeadingMatchingValue = this.lexer.peekLeadingMatchingValue(classDiscriminator, this.configuration.isLenient());
            if (peekLeadingMatchingValue == null) {
                if ((deserializer instanceof AbstractPolymorphicSerializer) && !getJson().getConfiguration().getUseArrayPolymorphism()) {
                    String classDiscriminator2 = PolymorphicKt.classDiscriminator(((AbstractPolymorphicSerializer) deserializer).getDescriptor(), getJson());
                    JsonElement decodeJsonElement = decodeJsonElement();
                    String serialName = ((AbstractPolymorphicSerializer) deserializer).getDescriptor().getSerialName();
                    if (decodeJsonElement instanceof JsonObject) {
                        JsonObject jsonObject = (JsonObject) decodeJsonElement;
                        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) classDiscriminator2);
                        try {
                            DeserializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, this, (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
                            Intrinsics.checkNotNull(findPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                            return TreeJsonDecoderKt.readPolymorphicJson(getJson(), classDiscriminator2, jsonObject, findPolymorphicSerializer);
                        } catch (SerializationException e2) {
                            String message2 = e2.getMessage();
                            Intrinsics.checkNotNull(message2);
                            throw JsonExceptionsKt.JsonDecodingException(-1, message2, jsonObject.toString());
                        }
                    }
                    throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + this.lexer.path.getPath(), decodeJsonElement.toString());
                }
                return deserializer.deserialize(this);
            }
            try {
                DeserializationStrategy findPolymorphicSerializer2 = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, this, peekLeadingMatchingValue);
                Intrinsics.checkNotNull(findPolymorphicSerializer2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                this.discriminatorHolder = new DiscriminatorHolder(classDiscriminator);
                return findPolymorphicSerializer2.deserialize(this);
            } catch (SerializationException e3) {
                String message3 = e3.getMessage();
                Intrinsics.checkNotNull(message3);
                String removeSuffix = StringsKt.removeSuffix(StringsKt.substringBefore$default(message3, '\n', (String) null, 2, (Object) null), ".");
                String message4 = e3.getMessage();
                Intrinsics.checkNotNull(message4);
                AbstractJsonLexer.fail$default(this.lexer, removeSuffix, 0, StringsKt.substringAfter(message4, '\n', ""), 2, null);
                throw new KotlinNothingValueException();
            }
            message = e.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
                throw e;
            }
            throw new MissingFieldException(e.getMissingFields(), e.getMessage() + " at path: " + this.lexer.path.getPath(), e);
        }
        return deserializer.deserialize(this);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode switchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(switchMode.begin);
        checkLeadingComma();
        int i = WhenMappings.$EnumSwitchMapping$0[switchMode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.discriminatorHolder);
        }
        return (this.mode == switchMode && this.json.getConfiguration().getExplicitNulls()) ? this : new StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor.getElementsCount() == 0 && JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json)) {
            skipLeftoverElements(descriptor);
        }
        if (this.lexer.tryConsumeComma() && !this.json.getConfiguration().getAllowTrailingComma()) {
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
            throw new KotlinNothingValueException();
        }
        this.lexer.consumeNextToken(this.mode.end);
        this.lexer.path.popDescriptor();
    }

    private final void skipLeftoverElements(SerialDescriptor serialDescriptor) {
        while (decodeElementIndex(serialDescriptor) != -1) {
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return ((jsonElementMarker != null ? jsonElementMarker.isUnmarkedNull$kotlinx_serialization_json() : false) || AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null)) ? false : true;
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeSerializableElement(SerialDescriptor descriptor, int i, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z = this.mode == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            this.lexer.path.resetCurrentMapKey();
        }
        Object decodeSerializableElement = super.decodeSerializableElement(descriptor, i, deserializer, obj);
        if (z) {
            this.lexer.path.updateCurrentMapKey(decodeSerializableElement);
        }
        return decodeSerializableElement;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        int decodeMapIndex;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i == 2) {
            decodeMapIndex = decodeMapIndex();
        } else if (i == 4) {
            decodeMapIndex = decodeObjectIndex(descriptor);
        } else {
            decodeMapIndex = decodeListIndex();
        }
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(decodeMapIndex);
        }
        return decodeMapIndex;
    }

    private final int decodeMapIndex() {
        int i = this.currentIndex;
        boolean z = false;
        boolean z2 = i % 2 != 0;
        if (!z2) {
            this.lexer.consumeNextToken(':');
        } else if (i != -1) {
            z = this.lexer.tryConsumeComma();
        }
        if (this.lexer.canConsumeValue()) {
            if (z2) {
                if (this.currentIndex != -1) {
                    AbstractJsonLexer abstractJsonLexer = this.lexer;
                    int i2 = abstractJsonLexer.currentPosition;
                    if (!z) {
                        AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected comma after the key-value pair", i2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                    int i3 = abstractJsonLexer2.currentPosition;
                    if (z) {
                        AbstractJsonLexer.fail$default(abstractJsonLexer2, "Unexpected leading comma", i3, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            int i4 = this.currentIndex + 1;
            this.currentIndex = i4;
            return i4;
        }
        if (!z || this.json.getConfiguration().getAllowTrailingComma()) {
            return -1;
        }
        JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
        throw new KotlinNothingValueException();
    }

    private final boolean coerceInputValue(SerialDescriptor serialDescriptor, int i) {
        String peekString;
        Json json = this.json;
        boolean isElementOptional = serialDescriptor.isElementOptional(i);
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i);
        if (isElementOptional && !elementDescriptor.isNullable() && this.lexer.tryConsumeNull(true)) {
            return true;
        }
        if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) && ((!elementDescriptor.isNullable() || !this.lexer.tryConsumeNull(false)) && (peekString = this.lexer.peekString(this.configuration.isLenient())) != null)) {
            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, peekString);
            boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
            if (jsonNameIndex == -3 && (isElementOptional || z)) {
                this.lexer.consumeString();
                return true;
            }
        }
        return false;
    }

    private final int decodeObjectIndex(SerialDescriptor serialDescriptor) {
        int jsonNameIndex;
        boolean z;
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        while (true) {
            boolean z2 = true;
            if (this.lexer.canConsumeValue()) {
                String decodeStringKey = decodeStringKey();
                this.lexer.consumeNextToken(':');
                jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(serialDescriptor, this.json, decodeStringKey);
                if (jsonNameIndex == -3) {
                    z = false;
                } else {
                    if (!this.configuration.getCoerceInputValues() || !coerceInputValue(serialDescriptor, jsonNameIndex)) {
                        break;
                    }
                    z = this.lexer.tryConsumeComma();
                    z2 = false;
                }
                tryConsumeComma = z2 ? handleUnknown(serialDescriptor, decodeStringKey) : z;
            } else {
                if (tryConsumeComma && !this.json.getConfiguration().getAllowTrailingComma()) {
                    JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.nextUnmarkedIndex$kotlinx_serialization_json();
                }
                return -1;
            }
        }
        JsonElementMarker jsonElementMarker2 = this.elementMarker;
        if (jsonElementMarker2 != null) {
            jsonElementMarker2.mark$kotlinx_serialization_json(jsonNameIndex);
        }
        return jsonNameIndex;
    }

    private final boolean handleUnknown(SerialDescriptor serialDescriptor, String str) {
        if (JsonNamesMapKt.ignoreUnknownKeys(serialDescriptor, this.json) || trySkip(this.discriminatorHolder, str)) {
            this.lexer.skipElement(this.configuration.isLenient());
        } else {
            this.lexer.path.popDescriptor();
            this.lexer.failOnUnknownKey(str);
        }
        return this.lexer.tryConsumeComma();
    }

    private final int decodeListIndex() {
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        if (this.lexer.canConsumeValue()) {
            int i = this.currentIndex;
            if (i != -1 && !tryConsumeComma) {
                AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            int i2 = i + 1;
            this.currentIndex = i2;
            return i2;
        }
        if (!tryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
            return -1;
        }
        JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.lexer.consumeBooleanLenient();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b = (byte) consumeNumericLiteral;
        if (consumeNumericLiteral == b) {
            return b;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s = (short) consumeNumericLiteral;
        if (consumeNumericLiteral == s) {
            return s;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i = (int) consumeNumericLiteral;
        if (consumeNumericLiteral == i) {
            return i;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float parseFloat = Float.parseFloat(consumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(parseFloat));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'float' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double parseDouble = Double.parseDouble(consumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(parseDouble));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'double' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String consumeStringLenient = this.lexer.consumeStringLenient();
        if (consumeStringLenient.length() != 1) {
            AbstractJsonLexer.fail$default(this.lexer, "Expected single char, but got '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return consumeStringLenient.charAt(0);
    }

    private final String decodeStringKey() {
        if (this.configuration.isLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeKeyString();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        if (this.configuration.isLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? new JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.getPath());
    }
}
