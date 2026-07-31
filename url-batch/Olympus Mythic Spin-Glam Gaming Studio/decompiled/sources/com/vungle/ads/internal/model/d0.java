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

/* loaded from: classes14.dex */
public final class d0 implements GeneratedSerializer {
    public static final d0 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.WebViewSettings", d0Var, 2);
        pluginGeneratedSerialDescriptor.addElement("allow_file_access_from_file_urls", true);
        pluginGeneratedSerialDescriptor.addElement("allow_universal_access_from_file_urls", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Object obj3 = null;
        if (beginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, booleanSerializer, null);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, booleanSerializer, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, BooleanSerializer.INSTANCE, obj4);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, BooleanSerializer.INSTANCE, obj3);
                    i2 |= 2;
                }
            }
            i = i2;
            obj = obj3;
            obj2 = obj4;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new f0(i, (Boolean) obj2, (Boolean) obj);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        f0 value = (f0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        f0.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
