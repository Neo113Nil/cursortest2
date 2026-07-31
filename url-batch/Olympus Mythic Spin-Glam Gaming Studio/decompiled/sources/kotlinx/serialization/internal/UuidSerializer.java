package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: BuiltInSerializers.kt */
/* loaded from: classes9.dex */
public final class UuidSerializer implements KSerializer {
    public static final UuidSerializer INSTANCE = new UuidSerializer();
    private static final SerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.uuid.Uuid", PrimitiveKind.STRING.INSTANCE);

    private UuidSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Uuid value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.toString());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Uuid deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Uuid.INSTANCE.parse(decoder.decodeString());
    }
}
