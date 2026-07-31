package com.vungle.ads.internal.network;

import java.util.Map;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class b implements GeneratedSerializer {
    public static final b a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.network.FailedTpat", bVar, 6);
        pluginGeneratedSerialDescriptor.addElement("method", true);
        pluginGeneratedSerialDescriptor.addElement("headers", true);
        pluginGeneratedSerialDescriptor.addElement("body", true);
        pluginGeneratedSerialDescriptor.addElement("retryAttempt", true);
        pluginGeneratedSerialDescriptor.addElement("retryCount", false);
        pluginGeneratedSerialDescriptor.addElement("tpatKey", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(stringSerializer, stringSerializer));
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{e.a, nullable, nullable2, intSerializer, intSerializer, nullable3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        int i3;
        Object obj4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i4 = 5;
        if (beginStructure.decodeSequentially()) {
            obj4 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, e.a, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj3 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
            int decodeIntElement = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 3);
            int decodeIntElement2 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, stringSerializer, null);
            i3 = decodeIntElement;
            i2 = decodeIntElement2;
            i = 63;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i7 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        obj8 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, e.a, obj8);
                        i6 |= 1;
                        i4 = 5;
                        continue;
                    case 1:
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), obj7);
                        i6 |= 2;
                        i4 = 5;
                        break;
                    case 2:
                        obj6 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, obj6);
                        i6 |= 4;
                        break;
                    case 3:
                        i5 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        i7 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i4, StringSerializer.INSTANCE, obj5);
                        i6 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i6;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            i2 = i7;
            i3 = i5;
            obj4 = obj8;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new d(i, (g) obj4, (Map) obj3, (String) obj2, i3, i2, (String) obj);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        d value = (d) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        d.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
