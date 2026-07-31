package com.vungle.ads.internal.signals;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.model.p3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes11.dex */
public final class a implements GeneratedSerializer {
    public static final a a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", aVar, 12);
        pluginGeneratedSerialDescriptor.addElement("103", false);
        pluginGeneratedSerialDescriptor.addElement(StatisticData.ERROR_CODE_IO_ERROR, true);
        pluginGeneratedSerialDescriptor.addElement(StatisticData.ERROR_CODE_NOT_FOUND, true);
        pluginGeneratedSerialDescriptor.addElement("106", true);
        pluginGeneratedSerialDescriptor.addElement("102", true);
        pluginGeneratedSerialDescriptor.addElement("104", true);
        pluginGeneratedSerialDescriptor.addElement("105", true);
        pluginGeneratedSerialDescriptor.addElement("112", true);
        pluginGeneratedSerialDescriptor.addElement("113", true);
        pluginGeneratedSerialDescriptor.addElement("114", true);
        pluginGeneratedSerialDescriptor.addElement("115", true);
        pluginGeneratedSerialDescriptor.addElement("116", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(k.a);
        ArrayListSerializer arrayListSerializer2 = new ArrayListSerializer(p3.a);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, StringSerializer.INSTANCE, longSerializer, arrayListSerializer, longSerializer, intSerializer, arrayListSerializer2, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        String str;
        long j2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i9 = 0;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            long decodeLongElement = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
            obj = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, new ArrayListSerializer(k.a), null);
            long decodeLongElement2 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
            int decodeIntElement2 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
            obj2 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, new ArrayListSerializer(p3.a), null);
            int decodeIntElement3 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 7);
            int decodeIntElement4 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 8);
            int decodeIntElement5 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 9);
            i = decodeIntElement;
            i3 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 10);
            i4 = decodeIntElement5;
            i5 = decodeIntElement3;
            i6 = decodeIntElement4;
            i7 = decodeIntElement2;
            i8 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 11);
            j = decodeLongElement2;
            str = decodeStringElement;
            i2 = 4095;
            j2 = decodeLongElement;
        } else {
            int i10 = 11;
            boolean z = true;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            Object obj3 = null;
            Object obj4 = null;
            String str2 = null;
            long j3 = 0;
            long j4 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i10 = 11;
                    case 0:
                        i9 |= 1;
                        i11 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                        i10 = 11;
                    case 1:
                        str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i9 |= 2;
                        i10 = 11;
                    case 2:
                        j4 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
                        i9 |= 4;
                        i10 = 11;
                    case 3:
                        obj3 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, new ArrayListSerializer(k.a), obj3);
                        i9 |= 8;
                        i10 = 11;
                    case 4:
                        j3 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
                        i9 |= 16;
                        i10 = 11;
                    case 5:
                        i13 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                        i9 |= 32;
                        i10 = 11;
                    case 6:
                        obj4 = beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, new ArrayListSerializer(p3.a), obj4);
                        i9 |= 64;
                        i10 = 11;
                    case 7:
                        i17 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 7);
                        i9 |= 128;
                    case 8:
                        i12 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 8);
                        i9 |= 256;
                    case 9:
                        i16 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 9);
                        i9 |= 512;
                    case 10:
                        i15 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 10);
                        i9 |= 1024;
                    case 11:
                        i14 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, i10);
                        i9 |= 2048;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i11;
            obj = obj3;
            obj2 = obj4;
            i2 = i9;
            i3 = i15;
            i4 = i16;
            i5 = i17;
            i6 = i12;
            i7 = i13;
            i8 = i14;
            j = j3;
            str = str2;
            j2 = j4;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new c(i2, i, str, j2, (List) obj, j, i7, (List) obj2, i5, i6, i4, i3, i8);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        c value = (c) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        c.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
