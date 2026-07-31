package kotlinx.serialization.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Tuples.kt */
/* loaded from: classes4.dex */
public abstract class KeyValueSerializer implements KSerializer {
    private final KSerializer keySerializer;
    private final KSerializer valueSerializer;

    public /* synthetic */ KeyValueSerializer(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    protected abstract Object getKey(Object obj);

    protected abstract Object getValue(Object obj);

    protected abstract Object toResult(Object obj, Object obj2);

    private KeyValueSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }

    protected final KSerializer getKeySerializer() {
        return this.keySerializer;
    }

    protected final KSerializer getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        CompositeEncoder beginStructure = encoder.beginStructure(getDescriptor());
        beginStructure.encodeSerializableElement(getDescriptor(), 0, this.keySerializer, getKey(obj));
        beginStructure.encodeSerializableElement(getDescriptor(), 1, this.valueSerializer, getValue(obj));
        beginStructure.endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object result;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (!beginStructure.decodeSequentially()) {
            obj = TuplesKt.NULL;
            obj2 = TuplesKt.NULL;
            Object obj5 = obj;
            Object obj6 = obj2;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex == -1) {
                    obj3 = TuplesKt.NULL;
                    if (obj5 != obj3) {
                        obj4 = TuplesKt.NULL;
                        if (obj6 == obj4) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        result = toResult(obj5, obj6);
                    } else {
                        throw new SerializationException("Element 'key' is missing");
                    }
                } else if (decodeElementIndex == 0) {
                    obj5 = CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null);
                } else if (decodeElementIndex == 1) {
                    obj6 = CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null);
                } else {
                    throw new SerializationException("Invalid index: " + decodeElementIndex);
                }
            }
        } else {
            result = toResult(CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null), CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null));
        }
        beginStructure.endStructure(descriptor);
        return result;
    }
}
