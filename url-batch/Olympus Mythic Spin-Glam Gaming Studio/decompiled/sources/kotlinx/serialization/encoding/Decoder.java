package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: Decoding.kt */
/* loaded from: classes5.dex */
public interface Decoder {
    CompositeDecoder beginStructure(SerialDescriptor serialDescriptor);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(SerialDescriptor serialDescriptor);

    float decodeFloat();

    Decoder decodeInline(SerialDescriptor serialDescriptor);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    Void decodeNull();

    short decodeShort();

    String decodeString();

    SerializersModule getSerializersModule();

    default Object decodeSerializableValue(DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }
}
