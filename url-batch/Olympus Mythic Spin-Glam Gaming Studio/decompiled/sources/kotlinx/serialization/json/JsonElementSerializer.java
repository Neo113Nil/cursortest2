package kotlinx.serialization.json;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes4.dex */
public final class JsonElementSerializer implements KSerializer {
    public static final JsonElementSerializer INSTANCE = new JsonElementSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit descriptor$lambda$5;
            descriptor$lambda$5 = JsonElementSerializer.descriptor$lambda$5((ClassSerialDescriptorBuilder) obj);
            return descriptor$lambda$5;
        }
    });

    private JsonElementSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$5(ClassSerialDescriptorBuilder buildSerialDescriptor) {
        SerialDescriptor defer;
        SerialDescriptor defer2;
        SerialDescriptor defer3;
        SerialDescriptor defer4;
        SerialDescriptor defer5;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        defer = JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor descriptor$lambda$5$lambda$0;
                descriptor$lambda$5$lambda$0 = JsonElementSerializer.descriptor$lambda$5$lambda$0();
                return descriptor$lambda$5$lambda$0;
            }
        });
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonPrimitive", defer, null, false, 12, null);
        defer2 = JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor descriptor$lambda$5$lambda$1;
                descriptor$lambda$5$lambda$1 = JsonElementSerializer.descriptor$lambda$5$lambda$1();
                return descriptor$lambda$5$lambda$1;
            }
        });
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonNull", defer2, null, false, 12, null);
        defer3 = JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor descriptor$lambda$5$lambda$2;
                descriptor$lambda$5$lambda$2 = JsonElementSerializer.descriptor$lambda$5$lambda$2();
                return descriptor$lambda$5$lambda$2;
            }
        });
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonLiteral", defer3, null, false, 12, null);
        defer4 = JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor descriptor$lambda$5$lambda$3;
                descriptor$lambda$5$lambda$3 = JsonElementSerializer.descriptor$lambda$5$lambda$3();
                return descriptor$lambda$5$lambda$3;
            }
        });
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonObject", defer4, null, false, 12, null);
        defer5 = JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor descriptor$lambda$5$lambda$4;
                descriptor$lambda$5$lambda$4 = JsonElementSerializer.descriptor$lambda$5$lambda$4();
                return descriptor$lambda$5$lambda$4;
            }
        });
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonArray", defer5, null, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$0() {
        return JsonPrimitiveSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$1() {
        return JsonNullSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$2() {
        return JsonLiteralSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$3() {
        return JsonObjectSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$4() {
        return JsonArraySerializer.INSTANCE.getDescriptor();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, JsonElement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.encodeSerializableValue(JsonPrimitiveSerializer.INSTANCE, value);
        } else if (value instanceof JsonObject) {
            encoder.encodeSerializableValue(JsonObjectSerializer.INSTANCE, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeSerializableValue(JsonArraySerializer.INSTANCE, value);
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonElement deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
    }
}
