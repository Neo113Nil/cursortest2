package kotlinx.serialization.json;

import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes8.dex */
final class JsonLiteralSerializer implements KSerializer {
    public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", PrimitiveKind.STRING.INSTANCE);

    private JsonLiteralSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, JsonLiteral value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        if (value.isString()) {
            encoder.encodeString(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType$kotlinx_serialization_json() != null) {
            encoder.encodeInline(value.getCoerceToInlineType$kotlinx_serialization_json()).encodeString(value.getContent());
            return;
        }
        Long longOrNull = StringsKt.toLongOrNull(value.getContent());
        if (longOrNull != null) {
            encoder.encodeLong(longOrNull.longValue());
            return;
        }
        ULong uLongOrNull = UStringsKt.toULongOrNull(value.getContent());
        if (uLongOrNull != null) {
            encoder.encodeInline(BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor()).encodeLong(uLongOrNull.m8081unboximpl());
            return;
        }
        Double doubleOrNull = StringsKt.toDoubleOrNull(value.getContent());
        if (doubleOrNull != null) {
            encoder.encodeDouble(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(value.getContent());
        if (booleanStrictOrNull != null) {
            encoder.encodeBoolean(booleanStrictOrNull.booleanValue());
        } else {
            encoder.encodeString(value.getContent());
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonLiteral deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement decodeJsonElement = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (!(decodeJsonElement instanceof JsonLiteral)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()), decodeJsonElement.toString());
        }
        return (JsonLiteral) decodeJsonElement;
    }
}
