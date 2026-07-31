package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final class wd2 implements GeneratedSerializer {
    public static final wd2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        wd2 wd2Var = new wd2();
        a = wd2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.configuration.model.PlayBackOptimizationConfig", wd2Var, 5);
        pluginGeneratedSerialDescriptor.addElement("minBufferMs", true);
        pluginGeneratedSerialDescriptor.addElement("maxBufferMs", true);
        pluginGeneratedSerialDescriptor.addElement("bufferForPlaybackMs", true);
        pluginGeneratedSerialDescriptor.addElement("bufferForPlaybackAfterRebufferMs", true);
        pluginGeneratedSerialDescriptor.addElement("targetBufferBytes", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Integer num6 = null;
        if (beginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num7 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, intSerializer, null);
            Integer num8 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, intSerializer, null);
            Integer num9 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, intSerializer, null);
            Integer num10 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, intSerializer, null);
            num5 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, intSerializer, null);
            num4 = num10;
            i = 31;
            num3 = num9;
            num2 = num8;
            num = num7;
        } else {
            boolean z = true;
            int i2 = 0;
            Integer num11 = null;
            Integer num12 = null;
            Integer num13 = null;
            Integer num14 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    num6 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, IntSerializer.INSTANCE, num6);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    num11 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, IntSerializer.INSTANCE, num11);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    num12 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, IntSerializer.INSTANCE, num12);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    num13 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, IntSerializer.INSTANCE, num13);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    num14 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, IntSerializer.INSTANCE, num14);
                    i2 |= 16;
                }
            }
            i = i2;
            num = num6;
            num2 = num11;
            num3 = num12;
            num4 = num13;
            num5 = num14;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new yd2(i, num, num2, num3, num4, num5);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        yd2 yd2Var = (yd2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || yd2Var.a != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, IntSerializer.INSTANCE, yd2Var.a);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || yd2Var.b != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, IntSerializer.INSTANCE, yd2Var.b);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || yd2Var.c != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, IntSerializer.INSTANCE, yd2Var.c);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || yd2Var.d != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, IntSerializer.INSTANCE, yd2Var.d);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || yd2Var.e != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, IntSerializer.INSTANCE, yd2Var.e);
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
