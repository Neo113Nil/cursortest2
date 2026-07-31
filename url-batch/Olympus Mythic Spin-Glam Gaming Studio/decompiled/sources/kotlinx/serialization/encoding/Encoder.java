package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: Encoding.kt */
/* loaded from: classes14.dex */
public interface Encoder {
    CompositeEncoder beginStructure(SerialDescriptor serialDescriptor);

    void encodeBoolean(boolean z);

    void encodeByte(byte b);

    void encodeChar(char c);

    void encodeDouble(double d);

    void encodeEnum(SerialDescriptor serialDescriptor, int i);

    void encodeFloat(float f);

    Encoder encodeInline(SerialDescriptor serialDescriptor);

    void encodeInt(int i);

    void encodeLong(long j);

    default void encodeNotNullMark() {
    }

    void encodeNull();

    void encodeShort(short s);

    void encodeString(String str);

    SerializersModule getSerializersModule();

    default CompositeEncoder beginCollection(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    default void encodeSerializableValue(SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    default void encodeNullableSerializableValue(SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.getDescriptor().isNullable()) {
            encodeSerializableValue(serializer, obj);
        } else if (obj == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(serializer, obj);
        }
    }
}
