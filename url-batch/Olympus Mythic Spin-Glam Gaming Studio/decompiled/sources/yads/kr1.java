package yads;

import java.util.List;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class kr1 implements GeneratedSerializer {
    public static final kr1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        kr1 kr1Var = new kr1();
        a = kr1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", kr1Var, 4);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("adapters", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = qr1.e;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), lazyArr[3].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        List list;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = qr1.e;
        String str4 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, null);
            list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            str = decodeStringElement;
            str3 = str5;
            i = 15;
            str2 = decodeStringElement2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            List list2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str7 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str7);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
            list = list2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new qr1(i, str, str2, str3, list);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        qr1 qr1Var = (qr1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = qr1.e;
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, qr1Var.a);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, qr1Var.b);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, qr1Var.c);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), qr1Var.d);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
