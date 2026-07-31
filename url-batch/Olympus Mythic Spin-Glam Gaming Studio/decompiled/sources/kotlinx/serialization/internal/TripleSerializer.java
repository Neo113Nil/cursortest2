package kotlinx.serialization.internal;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Tuples.kt */
/* loaded from: classes14.dex */
public final class TripleSerializer implements KSerializer {
    private final KSerializer aSerializer;
    private final KSerializer bSerializer;
    private final KSerializer cSerializer;
    private final SerialDescriptor descriptor;

    public TripleSerializer(KSerializer aSerializer, KSerializer bSerializer, KSerializer cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Triple", new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.TripleSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit descriptor$lambda$0;
                descriptor$lambda$0 = TripleSerializer.descriptor$lambda$0(TripleSerializer.this, (ClassSerialDescriptorBuilder) obj);
                return descriptor$lambda$0;
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$0(TripleSerializer tripleSerializer, ClassSerialDescriptorBuilder buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "first", tripleSerializer.aSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "second", tripleSerializer.bSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "third", tripleSerializer.cSerializer.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Triple value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        CompositeEncoder beginStructure = encoder.beginStructure(getDescriptor());
        beginStructure.encodeSerializableElement(getDescriptor(), 0, this.aSerializer, value.getFirst());
        beginStructure.encodeSerializableElement(getDescriptor(), 1, this.bSerializer, value.getSecond());
        beginStructure.encodeSerializableElement(getDescriptor(), 2, this.cSerializer, value.getThird());
        beginStructure.endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Triple deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        CompositeDecoder beginStructure = decoder.beginStructure(getDescriptor());
        if (beginStructure.decodeSequentially()) {
            return decodeSequentially(beginStructure);
        }
        return decodeStructure(beginStructure);
    }

    private final Triple decodeSequentially(CompositeDecoder compositeDecoder) {
        Object decodeSerializableElement$default = CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 0, this.aSerializer, null, 8, null);
        Object decodeSerializableElement$default2 = CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 1, this.bSerializer, null, 8, null);
        Object decodeSerializableElement$default3 = CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 2, this.cSerializer, null, 8, null);
        compositeDecoder.endStructure(getDescriptor());
        return new Triple(decodeSerializableElement$default, decodeSerializableElement$default2, decodeSerializableElement$default3);
    }

    private final Triple decodeStructure(CompositeDecoder compositeDecoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = TuplesKt.NULL;
        obj2 = TuplesKt.NULL;
        obj3 = TuplesKt.NULL;
        while (true) {
            int decodeElementIndex = compositeDecoder.decodeElementIndex(getDescriptor());
            if (decodeElementIndex == -1) {
                compositeDecoder.endStructure(getDescriptor());
                obj4 = TuplesKt.NULL;
                if (obj != obj4) {
                    obj5 = TuplesKt.NULL;
                    if (obj2 != obj5) {
                        obj6 = TuplesKt.NULL;
                        if (obj3 == obj6) {
                            throw new SerializationException("Element 'third' is missing");
                        }
                        return new Triple(obj, obj2, obj3);
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            }
            if (decodeElementIndex == 0) {
                obj = CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 0, this.aSerializer, null, 8, null);
            } else if (decodeElementIndex == 1) {
                obj2 = CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 1, this.bSerializer, null, 8, null);
            } else if (decodeElementIndex == 2) {
                obj3 = CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 2, this.cSerializer, null, 8, null);
            } else {
                throw new SerializationException("Unexpected index " + decodeElementIndex);
            }
        }
    }
}
