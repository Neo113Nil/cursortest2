package com.vungle.ads.internal.model;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.jvm.internal.Intrinsics;
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

/* loaded from: classes15.dex */
public final class m3 implements GeneratedSerializer {
    public static final m3 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        m3 m3Var = new m3();
        a = m3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbToken", m3Var, 5);
        pluginGeneratedSerialDescriptor.addElement("device", false);
        pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_USER, true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        pluginGeneratedSerialDescriptor.addElement("request", true);
        pluginGeneratedSerialDescriptor.addElement("ordinal_view", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w2.a, BuiltinSerializersKt.getNullable(q1.a), BuiltinSerializersKt.getNullable(k1.a), BuiltinSerializersKt.getNullable(j3.a), IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        Object obj4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            obj4 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, w2.a, null);
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, q1.a, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, k1.a, null);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, j3.a, null);
            i = 31;
            i2 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i4 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj8 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, w2.a, obj8);
                    i4 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, q1.a, obj7);
                    i4 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, k1.a, obj6);
                    i4 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, j3.a, obj5);
                    i4 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    i3 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                    i4 |= 16;
                }
            }
            i = i4;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            i2 = i3;
            obj4 = obj8;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new o3(i, (b3) obj4, (s1) obj3, (m1) obj2, (l3) obj, i2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        o3 value = (o3) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        o3.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
