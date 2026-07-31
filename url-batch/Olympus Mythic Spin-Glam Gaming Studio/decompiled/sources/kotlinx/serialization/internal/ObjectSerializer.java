package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ObjectSerializer.kt */
/* loaded from: classes14.dex */
public final class ObjectSerializer implements KSerializer {
    private List _annotations;
    private final Lazy descriptor$delegate;
    private final Object objectInstance;

    public ObjectSerializer(final String serialName, Object objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: kotlinx.serialization.internal.ObjectSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor descriptor_delegate$lambda$1;
                descriptor_delegate$lambda$1 = ObjectSerializer.descriptor_delegate$lambda$1(serialName, this);
                return descriptor_delegate$lambda$1;
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor_delegate$lambda$1(String str, final ObjectSerializer objectSerializer) {
        return SerialDescriptorsKt.buildSerialDescriptor(str, StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.ObjectSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit descriptor_delegate$lambda$1$lambda$0;
                descriptor_delegate$lambda$1$lambda$0 = ObjectSerializer.descriptor_delegate$lambda$1$lambda$0(ObjectSerializer.this, (ClassSerialDescriptorBuilder) obj);
                return descriptor_delegate$lambda$1$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor_delegate$lambda$1$lambda$0(ObjectSerializer objectSerializer, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.setAnnotations(objectSerializer._annotations);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder) {
        int decodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (!beginStructure.decodeSequentially() && (decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor())) != -1) {
            throw new SerializationException("Unexpected index " + decodeElementIndex);
        }
        Unit unit = Unit.INSTANCE;
        beginStructure.endStructure(descriptor);
        return this.objectInstance;
    }
}
