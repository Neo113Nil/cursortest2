package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Enums.kt */
/* loaded from: classes13.dex */
public final class EnumSerializer implements KSerializer {
    private final Lazy descriptor$delegate;
    private SerialDescriptor overriddenDescriptor;
    private final Enum[] values;

    public EnumSerializer(final String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.descriptor$delegate = LazyKt.lazy(new Function0() { // from class: kotlinx.serialization.internal.EnumSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor descriptor_delegate$lambda$0;
                descriptor_delegate$lambda$0 = EnumSerializer.descriptor_delegate$lambda$0(EnumSerializer.this, serialName);
                return descriptor_delegate$lambda$0;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String serialName, Enum[] values, SerialDescriptor descriptor) {
        this(serialName, values);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.overriddenDescriptor = descriptor;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor_delegate$lambda$0(EnumSerializer enumSerializer, String str) {
        SerialDescriptor serialDescriptor = enumSerializer.overriddenDescriptor;
        return serialDescriptor == null ? enumSerializer.createUnmarkedDescriptor(str) : serialDescriptor;
    }

    private final SerialDescriptor createUnmarkedDescriptor(String str) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, this.values.length);
        for (Enum r0 : this.values) {
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, r0.name(), false, 2, null);
        }
        return enumDescriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Enum value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int indexOf = ArraysKt.indexOf(this.values, value);
        if (indexOf == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            sb.append(" is not a valid enum ");
            sb.append(getDescriptor().getSerialName());
            sb.append(", must be one of ");
            String arrays = Arrays.toString(this.values);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
            sb.append(arrays);
            throw new SerializationException(sb.toString());
        }
        encoder.encodeEnum(getDescriptor(), indexOf);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Enum deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int decodeEnum = decoder.decodeEnum(getDescriptor());
        if (decodeEnum >= 0) {
            Enum[] enumArr = this.values;
            if (decodeEnum < enumArr.length) {
                return enumArr[decodeEnum];
            }
        }
        throw new SerializationException(decodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }
}
