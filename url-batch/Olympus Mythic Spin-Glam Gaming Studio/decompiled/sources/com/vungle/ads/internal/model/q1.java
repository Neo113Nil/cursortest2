package com.vungle.ads.internal.model;

import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes3.dex */
public final class q1 implements GeneratedSerializer {
    public static final q1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        q1 q1Var = new q1();
        a = q1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.User", q1Var, 5);
        pluginGeneratedSerialDescriptor.addElement("gdpr", true);
        pluginGeneratedSerialDescriptor.addElement("ccpa", true);
        pluginGeneratedSerialDescriptor.addElement("coppa", true);
        pluginGeneratedSerialDescriptor.addElement("fpd", true);
        pluginGeneratedSerialDescriptor.addElement("iab", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(e1.a), BuiltinSerializersKt.getNullable(u0.a), BuiltinSerializersKt.getNullable(x0.a), BuiltinSerializersKt.getNullable(FirstPartyData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(h1.a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Object obj6 = null;
        if (beginStructure.decodeSequentially()) {
            obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, e1.a, null);
            obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, u0.a, null);
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, x0.a, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, FirstPartyData$$serializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, h1.a, null);
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj10 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, e1.a, obj10);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj9 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, u0.a, obj9);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj8 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, x0.a, obj8);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, FirstPartyData$$serializer.INSTANCE, obj7);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, h1.a, obj6);
                    i2 |= 16;
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            i = i2;
            obj5 = obj10;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new s1(i, (g1) obj5, (w0) obj4, (z0) obj3, (FirstPartyData) obj2, (j1) obj);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        s1 value = (s1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        s1.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
