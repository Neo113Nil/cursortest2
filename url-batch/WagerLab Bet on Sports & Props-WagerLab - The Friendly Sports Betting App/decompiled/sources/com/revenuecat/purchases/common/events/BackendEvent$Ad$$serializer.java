package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.BackendEvent;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: BackendEvent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.Ad.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class BackendEvent$Ad$$serializer implements GeneratedSerializer<BackendEvent.Ad> {
    public static final BackendEvent$Ad$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BackendEvent$Ad$$serializer backendEvent$Ad$$serializer = new BackendEvent$Ad$$serializer();
        INSTANCE = backendEvent$Ad$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ad", backendEvent$Ad$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp_ms", false);
        pluginGeneratedSerialDescriptor.addElement("network_name", false);
        pluginGeneratedSerialDescriptor.addElement("mediator_name", false);
        pluginGeneratedSerialDescriptor.addElement("placement", false);
        pluginGeneratedSerialDescriptor.addElement("ad_unit_id", false);
        pluginGeneratedSerialDescriptor.addElement("impression_id", false);
        pluginGeneratedSerialDescriptor.addElement("app_user_id", false);
        pluginGeneratedSerialDescriptor.addElement(DiagnosticsEntry.APP_SESSION_ID_KEY, false);
        pluginGeneratedSerialDescriptor.addElement("revenue_micros", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("precision", true);
        pluginGeneratedSerialDescriptor.addElement("mediator_error_code", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BackendEvent$Ad$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, LongSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BackendEvent.Ad deserialize(Decoder decoder) {
        int i;
        Integer num;
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        long j;
        String str11;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i3 = 11;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 3);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 5);
            String str12 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            String decodeStringElement5 = beginStructure.decodeStringElement(descriptor2, 7);
            String str13 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, null);
            String decodeStringElement6 = beginStructure.decodeStringElement(descriptor2, 9);
            String decodeStringElement7 = beginStructure.decodeStringElement(descriptor2, 10);
            Long l2 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 11, LongSerializer.INSTANCE, null);
            String str14 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, null);
            str2 = decodeStringElement3;
            str = decodeStringElement;
            str11 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, null);
            num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 14, IntSerializer.INSTANCE, null);
            l = l2;
            str10 = decodeStringElement7;
            str4 = decodeStringElement6;
            str9 = decodeStringElement5;
            str7 = str13;
            str6 = str14;
            str8 = decodeStringElement2;
            j = decodeLongElement;
            i = decodeIntElement;
            str5 = str12;
            str3 = decodeStringElement4;
            i2 = 32767;
        } else {
            int i4 = 0;
            int i5 = 14;
            boolean z = true;
            String str15 = null;
            Integer num2 = null;
            String str16 = null;
            Long l3 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            long j2 = 0;
            int i6 = 0;
            String str25 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 14;
                    case 0:
                        str25 = beginStructure.decodeStringElement(descriptor2, 0);
                        i4 |= 1;
                        i5 = 14;
                        i3 = 11;
                    case 1:
                        i4 |= 2;
                        i6 = beginStructure.decodeIntElement(descriptor2, 1);
                        i5 = 14;
                        i3 = 11;
                    case 2:
                        str19 = beginStructure.decodeStringElement(descriptor2, 2);
                        i4 |= 4;
                        i5 = 14;
                        i3 = 11;
                    case 3:
                        j2 = beginStructure.decodeLongElement(descriptor2, 3);
                        i4 |= 8;
                        i5 = 14;
                        i3 = 11;
                    case 4:
                        str20 = beginStructure.decodeStringElement(descriptor2, 4);
                        i4 |= 16;
                        i5 = 14;
                        i3 = 11;
                    case 5:
                        str21 = beginStructure.decodeStringElement(descriptor2, 5);
                        i4 |= 32;
                        i5 = 14;
                        i3 = 11;
                    case 6:
                        str15 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, str15);
                        i4 |= 64;
                        i5 = 14;
                        i3 = 11;
                    case 7:
                        str22 = beginStructure.decodeStringElement(descriptor2, 7);
                        i4 |= 128;
                        i5 = 14;
                    case 8:
                        str18 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, str18);
                        i4 |= 256;
                        i5 = 14;
                    case 9:
                        str23 = beginStructure.decodeStringElement(descriptor2, 9);
                        i4 |= 512;
                        i5 = 14;
                    case 10:
                        str24 = beginStructure.decodeStringElement(descriptor2, 10);
                        i4 |= 1024;
                        i5 = 14;
                    case 11:
                        l3 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, i3, LongSerializer.INSTANCE, l3);
                        i4 |= 2048;
                        i5 = 14;
                    case 12:
                        str17 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, str17);
                        i4 |= 4096;
                        i5 = 14;
                    case 13:
                        str16 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, str16);
                        i4 |= 8192;
                        i5 = 14;
                    case 14:
                        num2 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, i5, IntSerializer.INSTANCE, num2);
                        i4 |= 16384;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i6;
            num = num2;
            l = l3;
            str = str25;
            str2 = str20;
            str3 = str21;
            str4 = str23;
            str5 = str15;
            str6 = str17;
            str7 = str18;
            str8 = str19;
            str9 = str22;
            str10 = str24;
            j = j2;
            str11 = str16;
            i2 = i4;
        }
        beginStructure.endStructure(descriptor2);
        return new BackendEvent.Ad(i2, str, i, str8, j, str2, str3, str5, str9, str7, str4, str10, l, str6, str11, num, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BackendEvent.Ad value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        BackendEvent.Ad.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
