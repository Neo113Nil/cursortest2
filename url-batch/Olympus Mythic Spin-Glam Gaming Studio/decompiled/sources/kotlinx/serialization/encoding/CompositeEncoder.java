package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Encoding.kt */
/* loaded from: classes14.dex */
public interface CompositeEncoder {
    void encodeBooleanElement(SerialDescriptor serialDescriptor, int i, boolean z);

    void encodeByteElement(SerialDescriptor serialDescriptor, int i, byte b);

    void encodeCharElement(SerialDescriptor serialDescriptor, int i, char c);

    void encodeDoubleElement(SerialDescriptor serialDescriptor, int i, double d);

    void encodeFloatElement(SerialDescriptor serialDescriptor, int i, float f);

    Encoder encodeInlineElement(SerialDescriptor serialDescriptor, int i);

    void encodeIntElement(SerialDescriptor serialDescriptor, int i, int i2);

    void encodeLongElement(SerialDescriptor serialDescriptor, int i, long j);

    void encodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i, SerializationStrategy serializationStrategy, Object obj);

    void encodeSerializableElement(SerialDescriptor serialDescriptor, int i, SerializationStrategy serializationStrategy, Object obj);

    void encodeShortElement(SerialDescriptor serialDescriptor, int i, short s);

    void encodeStringElement(SerialDescriptor serialDescriptor, int i, String str);

    void endStructure(SerialDescriptor serialDescriptor);

    default boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }
}
