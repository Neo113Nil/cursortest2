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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class rv0 implements GeneratedSerializer {
    public static final rv0 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        rv0 rv0Var = new rv0();
        a = rv0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.fonts.FontParameters", rv0Var, 1);
        pluginGeneratedSerialDescriptor.addElement("urls", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(zv0.a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        bw0 bw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i = 1;
        bw0 bw0Var2 = null;
        if (beginStructure.decodeSequentially()) {
            bw0Var = (bw0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, zv0.a, null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else {
                    if (decodeElementIndex != 0) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    bw0Var2 = (bw0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, zv0.a, bw0Var2);
                    i2 = 1;
                }
            }
            bw0Var = bw0Var2;
            i = i2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new tv0(i, bw0Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, zv0.a, ((tv0) obj).a);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
