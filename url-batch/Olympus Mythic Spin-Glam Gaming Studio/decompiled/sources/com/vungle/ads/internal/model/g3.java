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
public final class g3 implements GeneratedSerializer {
    public static final g3 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        g3 g3Var = new g3();
        a = g3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.Placement", g3Var, 3);
        pluginGeneratedSerialDescriptor.addElement("placement_ref_id", false);
        pluginGeneratedSerialDescriptor.addElement("is_hb", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        int i;
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            z = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, null);
            i = 7;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            Object obj2 = null;
            String str2 = null;
            int i2 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z2 = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    z3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, obj2);
                    i2 |= 4;
                }
            }
            z = z3;
            i = i2;
            obj = obj2;
            str = str2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new i3(i, str, z, (String) obj);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        i3 value = (i3) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        i3.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
