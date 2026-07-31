package com.vungle.ads.internal.model;

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
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes15.dex */
public final class f2 implements GeneratedSerializer {
    public static final f2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        f2 f2Var = new f2();
        a = f2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.Endpoints", f2Var, 5);
        pluginGeneratedSerialDescriptor.addElement("ads", true);
        pluginGeneratedSerialDescriptor.addElement("ri", true);
        pluginGeneratedSerialDescriptor.addElement("error_logs", true);
        pluginGeneratedSerialDescriptor.addElement("metrics", true);
        pluginGeneratedSerialDescriptor.addElement("csb", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Object obj6 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
            obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
            obj = decodeNullableSerializableElement;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj7 = null;
            obj = null;
            Object obj8 = null;
            Object obj9 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj9 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, obj9);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj8 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, obj8);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, obj);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, obj7);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, obj6);
                    i2 |= 16;
                }
            }
            i = i2;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            obj5 = obj9;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new h2(i, (String) obj5, (String) obj4, (String) obj, (String) obj3, (String) obj2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        h2 value = (h2) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        h2.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
