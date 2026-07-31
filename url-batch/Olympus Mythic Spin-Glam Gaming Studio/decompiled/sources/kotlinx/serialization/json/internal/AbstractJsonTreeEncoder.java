package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.PolymorphicKt;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes4.dex */
abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final Function1 nodeConsumer;
    private String polymorphicDiscriminator;
    private String polymorphicSerialName;

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    protected String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
    }

    public abstract JsonElement getCurrent();

    public abstract void putElement(String str, JsonElement jsonElement);

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.json;
    }

    protected final Function1 getNodeConsumer() {
        return this.nodeConsumer;
    }

    private AbstractJsonTreeEncoder(Json json, Function1 function1) {
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.getConfiguration();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final SerializersModule getSerializersModule() {
        return this.json.getSerializersModule();
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    protected String elementName(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return JsonNamesMapKt.getJsonElementName(descriptor, this.json, i);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.polymorphicDiscriminator != null && !(element instanceof JsonObject)) {
            PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
            throw new KotlinNothingValueException();
        }
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String str = (String) getCurrentTagOrNull();
        if (str == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(str);
        }
    }

    protected void encodeTaggedNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedInt(String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedByte(String tag, byte b) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(b)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedShort(String tag, short s) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Short.valueOf(s)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedLong(String tag, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Long.valueOf(j)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedFloat(String tag, float f) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Float.valueOf(f)));
        if (!this.configuration.getAllowSpecialFloatingPointValues() && Math.abs(f) > Float.MAX_VALUE) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(f), tag, getCurrent().toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L29;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void encodeSerializableValue(SerializationStrategy serializer, Object obj) {
        String classDiscriminator;
        boolean requiresTopLevelTag;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getCurrentTagOrNull() == null) {
            requiresTopLevelTag = TreeJsonEncoderKt.getRequiresTopLevelTag(WriteModeKt.carrierDescriptor(serializer.getDescriptor(), getSerializersModule()));
            if (requiresTopLevelTag) {
                new JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeSerializableValue(serializer, obj);
                return;
            }
        }
        if (getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, obj);
            return;
        }
        boolean z = serializer instanceof AbstractPolymorphicSerializer;
        if (!z) {
            int i = PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                SerialKind kind = serializer.getDescriptor().getKind();
                if (!Intrinsics.areEqual(kind, StructureKind.CLASS.INSTANCE)) {
                }
                classDiscriminator = PolymorphicKt.classDiscriminator(serializer.getDescriptor(), getJson());
            }
            classDiscriminator = null;
        }
        if (z) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + abstractPolymorphicSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            SerializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, this, obj);
            if (classDiscriminator != null) {
                PolymorphicKt.validateIfSealed(serializer, findPolymorphicSerializer, classDiscriminator);
                PolymorphicKt.checkKind(findPolymorphicSerializer.getDescriptor().getKind());
            }
            Intrinsics.checkNotNull(findPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = findPolymorphicSerializer;
        }
        if (classDiscriminator != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = classDiscriminator;
            this.polymorphicSerialName = serialName;
        }
        serializer.serialize(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedDouble(String tag, double d) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Double.valueOf(d)));
        if (!this.configuration.getAllowSpecialFloatingPointValues() && Math.abs(d) > Double.MAX_VALUE) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(d), tag, getCurrent().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedBoolean(String tag, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(z)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedChar(String tag, char c) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(String.valueOf(c)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedString(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        putElement(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public Encoder encodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? inlineUnsignedNumberEncoder(tag) : StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor) ? inlineUnquotedLiteralEncoder(tag, inlineDescriptor) : super.encodeTaggedInline((Object) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (getCurrentTagOrNull() != null) {
            if (this.polymorphicDiscriminator != null) {
                this.polymorphicSerialName = descriptor.getSerialName();
            }
            return super.encodeInline(descriptor);
        }
        return new JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeInline(descriptor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1] */
    private final AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 inlineUnsignedNumberEncoder(final String str) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1
            private final SerializersModule serializersModule;

            {
                this.serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.Encoder
            public SerializersModule getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(String s) {
                Intrinsics.checkNotNullParameter(s, "s");
                AbstractJsonTreeEncoder.this.putElement(str, new JsonLiteral(s, false, null, 4, null));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int i) {
                putUnquotedString(AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1$$ExternalSyntheticBackport0.m(UInt.m8055constructorimpl(i)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long j) {
                String m;
                m = AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1$$ExternalSyntheticBackport2.m(ULong.m8077constructorimpl(j), 10);
                putUnquotedString(m);
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte b) {
                putUnquotedString(UByte.m8036toStringimpl(UByte.m8033constructorimpl(b)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short s) {
                putUnquotedString(UShort.m8102toStringimpl(UShort.m8099constructorimpl(s)));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1] */
    private final AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1 inlineUnquotedLiteralEncoder(final String str, final SerialDescriptor serialDescriptor) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1
            @Override // kotlinx.serialization.encoding.Encoder
            public SerializersModule getSerializersModule() {
                return AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeString(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AbstractJsonTreeEncoder.this.putElement(str, new JsonLiteral(value, false, serialDescriptor));
            }
        };
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        AbstractJsonTreeEncoder jsonTreeListEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1 function1 = getCurrentTagOrNull() == null ? this.nodeConsumer : new Function1() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit beginStructure$lambda$2;
                beginStructure$lambda$2 = AbstractJsonTreeEncoder.beginStructure$lambda$2(AbstractJsonTreeEncoder.this, (JsonElement) obj);
                return beginStructure$lambda$2;
            }
        };
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) || (kind instanceof PolymorphicKind)) {
            jsonTreeListEncoder = new JsonTreeListEncoder(this.json, function1);
        } else if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json = this.json;
            SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            SerialKind kind2 = carrierDescriptor.getKind();
            if (!(kind2 instanceof PrimitiveKind) && !Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
                if (!json.getConfiguration().getAllowStructuredMapKeys()) {
                    throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
                }
                jsonTreeListEncoder = new JsonTreeListEncoder(this.json, function1);
            } else {
                jsonTreeListEncoder = new JsonTreeMapEncoder(this.json, function1);
            }
        } else {
            jsonTreeListEncoder = new JsonTreeEncoder(this.json, function1);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (jsonTreeListEncoder instanceof JsonTreeMapEncoder) {
                JsonTreeMapEncoder jsonTreeMapEncoder = (JsonTreeMapEncoder) jsonTreeListEncoder;
                jsonTreeMapEncoder.putElement("key", JsonElementKt.JsonPrimitive(str));
                String str2 = this.polymorphicSerialName;
                if (str2 == null) {
                    str2 = descriptor.getSerialName();
                }
                jsonTreeMapEncoder.putElement("value", JsonElementKt.JsonPrimitive(str2));
            } else {
                String str3 = this.polymorphicSerialName;
                if (str3 == null) {
                    str3 = descriptor.getSerialName();
                }
                jsonTreeListEncoder.putElement(str, JsonElementKt.JsonPrimitive(str3));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return jsonTreeListEncoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beginStructure$lambda$2(AbstractJsonTreeEncoder abstractJsonTreeEncoder, JsonElement node) {
        Intrinsics.checkNotNullParameter(node, "node");
        abstractJsonTreeEncoder.putElement((String) abstractJsonTreeEncoder.getCurrentTag(), node);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    protected void endEncode(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.nodeConsumer.invoke(getCurrent());
    }
}
