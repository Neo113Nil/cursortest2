package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: Tagged.kt */
/* loaded from: classes5.dex */
public abstract class TaggedDecoder implements Decoder, CompositeDecoder {
    private boolean flag;
    private final ArrayList tagStack = new ArrayList();

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void decodeNull() {
        return null;
    }

    protected abstract boolean decodeTaggedBoolean(Object obj);

    protected abstract byte decodeTaggedByte(Object obj);

    protected abstract char decodeTaggedChar(Object obj);

    protected abstract double decodeTaggedDouble(Object obj);

    protected abstract int decodeTaggedEnum(Object obj, SerialDescriptor serialDescriptor);

    protected abstract float decodeTaggedFloat(Object obj);

    protected abstract int decodeTaggedInt(Object obj);

    protected abstract long decodeTaggedLong(Object obj);

    protected abstract short decodeTaggedShort(Object obj);

    protected abstract String decodeTaggedString(Object obj);

    protected abstract Object getTag(SerialDescriptor serialDescriptor, int i);

    protected Decoder decodeTaggedInline(Object obj, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        pushTag(obj);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object decodeSerializableValue(DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInline(popTag(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        return decodeTaggedBoolean(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        return decodeTaggedByte(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        return decodeTaggedShort(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        return decodeTaggedInt(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return decodeTaggedLong(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        return decodeTaggedFloat(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        return decodeTaggedDouble(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        return decodeTaggedChar(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String decodeString() {
        return decodeTaggedString(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return decodeTaggedEnum(popTag(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedBoolean(getTag(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedByte(getTag(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedShort(getTag(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInt(getTag(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedLong(getTag(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedFloat(getTag(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedDouble(getTag(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedChar(getTag(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final String decodeStringElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedString(getTag(descriptor, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object decodeNullableSerializableElement$lambda$3(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj) {
        return (deserializationStrategy.getDescriptor().isNullable() || taggedDecoder.decodeNotNullMark()) ? taggedDecoder.decodeSerializableValue(deserializationStrategy, obj) : taggedDecoder.decodeNull();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Decoder decodeInlineElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInline(getTag(descriptor, i), descriptor.getElementDescriptor(i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Object decodeSerializableElement(SerialDescriptor descriptor, int i, final DeserializationStrategy deserializer, final Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return tagBlock(getTag(descriptor, i), new Function0() { // from class: kotlinx.serialization.internal.TaggedDecoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Object decodeSerializableValue;
                decodeSerializableValue = TaggedDecoder.this.decodeSerializableValue(deserializer, obj);
                return decodeSerializableValue;
            }
        });
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Object decodeNullableSerializableElement(SerialDescriptor descriptor, int i, final DeserializationStrategy deserializer, final Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return tagBlock(getTag(descriptor, i), new Function0() { // from class: kotlinx.serialization.internal.TaggedDecoder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Object decodeNullableSerializableElement$lambda$3;
                decodeNullableSerializableElement$lambda$3 = TaggedDecoder.decodeNullableSerializableElement$lambda$3(TaggedDecoder.this, deserializer, obj);
                return decodeNullableSerializableElement$lambda$3;
            }
        });
    }

    private final Object tagBlock(Object obj, Function0 function0) {
        pushTag(obj);
        Object mo4828invoke = function0.mo4828invoke();
        if (!this.flag) {
            popTag();
        }
        this.flag = false;
        return mo4828invoke;
    }

    public final ArrayList getTagStack$kotlinx_serialization_core() {
        return this.tagStack;
    }

    protected final Object getCurrentTagOrNull() {
        return CollectionsKt.lastOrNull(this.tagStack);
    }

    protected final void pushTag(Object obj) {
        this.tagStack.add(obj);
    }

    protected final Object popTag() {
        ArrayList arrayList = this.tagStack;
        Object remove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.flag = true;
        return remove;
    }
}
