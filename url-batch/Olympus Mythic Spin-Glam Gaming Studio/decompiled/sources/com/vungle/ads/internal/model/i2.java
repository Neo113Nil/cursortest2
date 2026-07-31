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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes15.dex */
public final class i2 implements GeneratedSerializer {
    public static final i2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        i2 i2Var = new i2();
        a = i2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", i2Var, 6);
        pluginGeneratedSerialDescriptor.addElement("is_country_data_protected", true);
        pluginGeneratedSerialDescriptor.addElement("consent_title", true);
        pluginGeneratedSerialDescriptor.addElement("consent_message", true);
        pluginGeneratedSerialDescriptor.addElement("consent_message_version", true);
        pluginGeneratedSerialDescriptor.addElement("button_accept", true);
        pluginGeneratedSerialDescriptor.addElement("button_deny", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i2 = 5;
        Object obj7 = null;
        if (beginStructure.decodeSequentially()) {
            obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, BooleanSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
            obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, stringSerializer, null);
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        obj12 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, BooleanSerializer.INSTANCE, obj12);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        obj11 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, obj11);
                        i3 |= 2;
                    case 2:
                        obj10 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, obj10);
                        i3 |= 4;
                    case 3:
                        obj9 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, obj9);
                        i3 |= 8;
                    case 4:
                        obj8 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, obj8);
                        i3 |= 16;
                    case 5:
                        obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i2, StringSerializer.INSTANCE, obj7);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj7;
            obj2 = obj8;
            obj3 = obj9;
            obj4 = obj10;
            obj5 = obj11;
            i = i3;
            obj6 = obj12;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new k2(i, (Boolean) obj6, (String) obj5, (String) obj4, (String) obj3, (String) obj2, (String) obj);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        k2 value = (k2) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        k2.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
