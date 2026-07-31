package com.vungle.ads.internal.model;

import com.ironsource.C4845qd;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes15.dex */
public final class n1 implements GeneratedSerializer {
    public static final n1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        n1 n1Var = new n1();
        a = n1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", n1Var, 7);
        pluginGeneratedSerialDescriptor.addElement(C4845qd.c, true);
        pluginGeneratedSerialDescriptor.addElement("ad_size", true);
        pluginGeneratedSerialDescriptor.addElement("ad_start_time", true);
        pluginGeneratedSerialDescriptor.addElement("app_id", true);
        pluginGeneratedSerialDescriptor.addElement("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_USER, true);
        pluginGeneratedSerialDescriptor.addElement("csb", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer)), BuiltinSerializersKt.getNullable(r0.a), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(a1.a)};
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
        Object obj7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i2 = 6;
        int i3 = 5;
        Object obj8 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, new ArrayListSerializer(stringSerializer), null);
            obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, r0.a, null);
            obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, LongSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, stringSerializer, null);
            obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, a1.a, null);
            i = 127;
        } else {
            boolean z = true;
            int i4 = 0;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 5;
                    case 0:
                        obj14 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, new ArrayListSerializer(StringSerializer.INSTANCE), obj14);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        obj13 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, r0.a, obj13);
                        i4 |= 2;
                    case 2:
                        obj12 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, LongSerializer.INSTANCE, obj12);
                        i4 |= 4;
                    case 3:
                        obj11 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, obj11);
                        i4 |= 8;
                    case 4:
                        obj10 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, obj10);
                        i4 |= 16;
                    case 5:
                        obj9 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i3, StringSerializer.INSTANCE, obj9);
                        i4 |= 32;
                    case 6:
                        obj8 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i2, a1.a, obj8);
                        i4 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj9;
            obj2 = obj10;
            obj3 = obj11;
            obj4 = obj12;
            obj5 = obj13;
            Object obj15 = obj8;
            i = i4;
            obj6 = obj14;
            obj7 = obj15;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new p1(i, (List) obj6, (t0) obj5, (Long) obj4, (String) obj3, (String) obj2, (String) obj, (c1) obj7);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        p1 value = (p1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        p1.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
