package com.vungle.ads.internal.model;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class c implements GeneratedSerializer {
    public static final c a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload", cVar, 7);
        pluginGeneratedSerialDescriptor.addElement("ads", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("expiryWindowStart", true);
        pluginGeneratedSerialDescriptor.addElement("mraidFiles", true);
        pluginGeneratedSerialDescriptor.addElement("incentivizedTextSettings", true);
        pluginGeneratedSerialDescriptor.addElement("assetsFullyDownloaded", true);
        pluginGeneratedSerialDescriptor.addElement("indexFilePath", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(new ArrayListSerializer(q.a));
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(u1.a);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), new LinkedHashMapSerializer(stringSerializer, stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        if (beginStructure.decodeSequentially()) {
            obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, new ArrayListSerializer(q.a), null);
            obj4 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, u1.a, null);
            obj5 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, LongSerializer.INSTANCE, null);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj6 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), null);
            obj3 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 5);
            obj2 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, stringSerializer, null);
            z = decodeBooleanElement;
            i = 127;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            i = 0;
            obj = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                    case 0:
                        obj = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, new ArrayListSerializer(q.a), obj);
                        i |= 1;
                        i2 = 6;
                        i3 = 5;
                        i4 = 4;
                    case 1:
                        obj10 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, u1.a, obj10);
                        i |= 2;
                        i2 = 6;
                        i3 = 5;
                    case 2:
                        c = 3;
                        obj11 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, LongSerializer.INSTANCE, obj11);
                        i |= 4;
                        i2 = 6;
                        i3 = 5;
                    case 3:
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        c = 3;
                        obj8 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, new ContextualSerializer(orCreateKotlinClass2, null, new KSerializer[]{stringSerializer2, stringSerializer2}), obj8);
                        i |= 8;
                        i2 = 6;
                        i3 = 5;
                    case 4:
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        obj9 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, i4, new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), obj9);
                        i |= 16;
                        i2 = 6;
                    case 5:
                        z3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, i3);
                        i |= 32;
                    case 6:
                        obj7 = beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i2, StringSerializer.INSTANCE, obj7);
                        i |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            obj2 = obj7;
            z = z3;
            obj3 = obj9;
            obj4 = obj10;
            obj5 = obj11;
            obj6 = obj8;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new h0(i, (List) obj, (v2) obj4, (Long) obj5, (ConcurrentHashMap) obj6, (Map) obj3, z, (String) obj2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        h0 value = (h0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        h0.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
