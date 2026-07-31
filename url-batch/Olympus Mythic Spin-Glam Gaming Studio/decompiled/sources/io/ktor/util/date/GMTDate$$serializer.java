package io.ktor.util.date;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: Date.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class GMTDate$$serializer implements GeneratedSerializer {
    public static final GMTDate$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    private GMTDate$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GMTDate$$serializer gMTDate$$serializer = new GMTDate$$serializer();
        INSTANCE = gMTDate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.util.date.GMTDate", gMTDate$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("seconds", false);
        pluginGeneratedSerialDescriptor.addElement("minutes", false);
        pluginGeneratedSerialDescriptor.addElement("hours", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfMonth", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfYear", false);
        pluginGeneratedSerialDescriptor.addElement("month", false);
        pluginGeneratedSerialDescriptor.addElement("year", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr;
        lazyArr = GMTDate.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, lazyArr[3].getValue(), intSerializer, intSerializer, lazyArr[6].getValue(), intSerializer, LongSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final GMTDate deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        int i;
        Month month;
        WeekDay weekDay;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = GMTDate.$childSerializers;
        int i8 = 7;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 0);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 1);
            int decodeIntElement3 = beginStructure.decodeIntElement(serialDescriptor, 2);
            WeekDay weekDay2 = (WeekDay) beginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            int decodeIntElement4 = beginStructure.decodeIntElement(serialDescriptor, 4);
            int decodeIntElement5 = beginStructure.decodeIntElement(serialDescriptor, 5);
            month = (Month) beginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            i = decodeIntElement;
            i2 = beginStructure.decodeIntElement(serialDescriptor, 7);
            i3 = decodeIntElement5;
            i4 = 511;
            i5 = decodeIntElement4;
            i6 = decodeIntElement3;
            weekDay = weekDay2;
            i7 = decodeIntElement2;
            j = beginStructure.decodeLongElement(serialDescriptor, 8);
        } else {
            boolean z = true;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            Month month2 = null;
            long j2 = 0;
            int i13 = 0;
            int i14 = 0;
            WeekDay weekDay3 = null;
            int i15 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i8 = 7;
                    case 0:
                        i14 |= 1;
                        i9 = beginStructure.decodeIntElement(serialDescriptor, 0);
                        i8 = 7;
                    case 1:
                        i12 = beginStructure.decodeIntElement(serialDescriptor, 1);
                        i14 |= 2;
                        i8 = 7;
                    case 2:
                        i11 = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i14 |= 4;
                    case 3:
                        weekDay3 = (WeekDay) beginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), weekDay3);
                        i14 |= 8;
                    case 4:
                        i10 = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i14 |= 16;
                    case 5:
                        i13 = beginStructure.decodeIntElement(serialDescriptor, 5);
                        i14 |= 32;
                    case 6:
                        month2 = (Month) beginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), month2);
                        i14 |= 64;
                    case 7:
                        i15 = beginStructure.decodeIntElement(serialDescriptor, i8);
                        i14 |= 128;
                    case 8:
                        j2 = beginStructure.decodeLongElement(serialDescriptor, 8);
                        i14 |= 256;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i9;
            month = month2;
            weekDay = weekDay3;
            i2 = i15;
            i3 = i13;
            i4 = i14;
            i5 = i10;
            i6 = i11;
            i7 = i12;
            j = j2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new GMTDate(i4, i, i7, i6, weekDay, i5, i3, month, i2, j, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, GMTDate value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        GMTDate.write$Self$ktor_utils(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }
}
