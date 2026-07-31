package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: AbstractDecoder.kt */
/* loaded from: classes8.dex */
public abstract class AbstractDecoder implements Decoder, CompositeDecoder {
    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public Object decodeValue() {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) decodeValue).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) decodeValue).byteValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) decodeValue).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) decodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) decodeValue).longValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) decodeValue).floatValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) decodeValue).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) decodeValue).charValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) decodeValue;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object decodeValue = decodeValue();
        Intrinsics.checkNotNull(decodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) decodeValue).intValue();
    }

    public Object decodeSerializableValue(DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final String decodeStringElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeString();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Decoder decodeInlineElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeInline(descriptor.getElementDescriptor(i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeSerializableElement(SerialDescriptor descriptor, int i, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return decodeSerializableValue(deserializer, obj);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Object decodeNullableSerializableElement(SerialDescriptor descriptor, int i, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().isNullable() || decodeNotNullMark()) ? decodeSerializableValue(deserializer, obj) : decodeNull();
    }
}
