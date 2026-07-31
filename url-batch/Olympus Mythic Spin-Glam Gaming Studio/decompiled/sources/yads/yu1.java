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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class yu1 implements GeneratedSerializer {
    public static final yu1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        yu1 yu1Var = new yu1();
        a = yu1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", yu1Var, 5);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("method", false);
        pluginGeneratedSerialDescriptor.addElement("url", false);
        pluginGeneratedSerialDescriptor.addElement("headers", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = bv1.f;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable((KSerializer) lazyArr[3].getValue()), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        Map map;
        String str3;
        long j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = bv1.f;
        String str4 = null;
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            map = (Map) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            str = decodeStringElement;
            str3 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, null);
            str2 = decodeStringElement2;
            i = 31;
            j = decodeLongElement;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            long j2 = 0;
            String str6 = null;
            Map map2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    j2 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    map2 = (Map) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), map2);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str5);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            map = map2;
            str3 = str5;
            j = j2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new bv1(i, j, str, str2, map, str3);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        bv1 bv1Var = (bv1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = bv1.f;
        beginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, bv1Var.a);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, bv1Var.b);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, bv1Var.c);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), bv1Var.d);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, bv1Var.e);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
