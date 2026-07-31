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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes14.dex */
public final class a1 implements GeneratedSerializer {
    public static final a1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        a1 a1Var = new a1();
        a = a1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", a1Var, 7);
        pluginGeneratedSerialDescriptor.addElement("bidfloor", false);
        pluginGeneratedSerialDescriptor.addElement("phase", false);
        pluginGeneratedSerialDescriptor.addElement("is_vx_winner", false);
        pluginGeneratedSerialDescriptor.addElement("parent_auction_id", false);
        pluginGeneratedSerialDescriptor.addElement("creative_id", false);
        pluginGeneratedSerialDescriptor.addElement("ad_unit_id", false);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{DoubleSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        boolean z;
        int i2;
        Object obj;
        String str;
        String str2;
        String str3;
        double d;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            double decodeDoubleElement = beginStructure.decodeDoubleElement(pluginGeneratedSerialDescriptor, 0);
            int decodeIntElement = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 1);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
            String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
            String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, StringSerializer.INSTANCE, null);
            i = decodeIntElement;
            str3 = decodeStringElement3;
            str = decodeStringElement;
            str2 = decodeStringElement2;
            z = decodeBooleanElement;
            i2 = 127;
            d = decodeDoubleElement;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            double d2 = 0.0d;
            int i4 = 0;
            Object obj2 = null;
            boolean z3 = false;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        d2 = beginStructure.decodeDoubleElement(pluginGeneratedSerialDescriptor, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        i3 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        z3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, StringSerializer.INSTANCE, obj2);
                        i4 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            z = z3;
            i2 = i4;
            obj = obj2;
            str = str4;
            str2 = str5;
            str3 = str6;
            d = d2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new c1(i2, d, i, z, str, str2, str3, (String) obj);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        c1 value = (c1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        c1.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
