package yads;

import java.util.Map;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class cv1 implements GeneratedSerializer {
    public static final cv1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        cv1 cv1Var = new cv1();
        a = cv1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", cv1Var, 4);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("code", false);
        pluginGeneratedSerialDescriptor.addElement("headers", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) fv1.e[2].getValue()), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Integer num;
        Map map;
        String str;
        long j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = fv1.e;
        Integer num2 = null;
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
            Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, IntSerializer.INSTANCE, null);
            map = (Map) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            num = num3;
            str = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, null);
            i = 15;
            j = decodeLongElement;
        } else {
            boolean z = true;
            int i2 = 0;
            long j2 = 0;
            Map map2 = null;
            String str2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    j2 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    num2 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, IntSerializer.INSTANCE, num2);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    map2 = (Map) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), map2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str2 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str2);
                    i2 |= 8;
                }
            }
            i = i2;
            num = num2;
            map = map2;
            str = str2;
            j = j2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new fv1(i, j, num, map, str);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        fv1 fv1Var = (fv1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = fv1.e;
        beginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, fv1Var.a);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, IntSerializer.INSTANCE, fv1Var.b);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), fv1Var.c);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, fv1Var.d);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
