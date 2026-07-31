package yads;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes3.dex */
public final class nr1 implements GeneratedSerializer {
    public static final nr1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        nr1 nr1Var = new nr1();
        a = nr1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", nr1Var, 3);
        pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_FORMAT, false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("isIntegrated", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        int i;
        String str;
        String str2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            str2 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, null);
            z = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
            i = 7;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str3 = null;
            String str4 = null;
            int i2 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z2 = false;
                } else if (decodeElementIndex == 0) {
                    str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str4);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    z3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
                    i2 |= 4;
                }
            }
            z = z3;
            i = i2;
            str = str3;
            str2 = str4;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new pr1(i, str, str2, z);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        pr1 pr1Var = (pr1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, pr1Var.a);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, pr1Var.b);
        beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 2, pr1Var.c);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
