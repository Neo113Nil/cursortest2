package yads;

import kotlin.Lazy;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
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
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes15.dex */
public final class sh2 implements GeneratedSerializer {
    public static final sh2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        sh2 sh2Var = new sh2();
        a = sh2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", sh2Var, 3);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("error_message", false);
        pluginGeneratedSerialDescriptor.addElement("status_code", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vh2.d[0].getValue(), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        yh2 yh2Var;
        String str;
        Integer num;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = vh2.d;
        yh2 yh2Var2 = null;
        if (beginStructure.decodeSequentially()) {
            yh2Var = (yh2) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            str = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, null);
            num = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, IntSerializer.INSTANCE, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            Integer num2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    yh2Var2 = (yh2) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), yh2Var2);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str2 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str2);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    num2 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, IntSerializer.INSTANCE, num2);
                    i2 |= 4;
                }
            }
            i = i2;
            yh2Var = yh2Var2;
            str = str2;
            num = num2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new vh2(i, yh2Var, str, num);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        vh2 vh2Var = (vh2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) vh2.d[0].getValue(), vh2Var.a);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, vh2Var.b);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, IntSerializer.INSTANCE, vh2Var.c);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
