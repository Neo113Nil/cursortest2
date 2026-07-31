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

/* loaded from: classes5.dex */
public final class q implements GeneratedSerializer {
    public static final q a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        q qVar = new q();
        a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", qVar, 3);
        pluginGeneratedSerialDescriptor.addElement("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.addElement(com.safedk.android.analytics.brandsafety.creatives.discoveries.t.c, true);
        pluginGeneratedSerialDescriptor.addElement("csb", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(g.a), BuiltinSerializersKt.getNullable(j.a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Object obj4 = null;
        if (beginStructure.decodeSequentially()) {
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, g.a, null);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, j.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj5 = null;
            Object obj6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, obj6);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, g.a, obj5);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, j.a, obj4);
                    i2 |= 4;
                }
            }
            i = i2;
            obj = obj4;
            obj2 = obj5;
            obj3 = obj6;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new s(i, (String) obj3, (i) obj2, (l) obj);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        s value = (s) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        s.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
