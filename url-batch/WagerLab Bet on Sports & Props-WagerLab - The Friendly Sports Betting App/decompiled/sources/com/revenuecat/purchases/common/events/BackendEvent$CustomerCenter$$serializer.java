package com.revenuecat.purchases.common.events;

import com.facebook.hermes.intl.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode;
import com.revenuecat.purchases.customercenter.events.CustomerCenterEventType;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: BackendEvent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.CustomerCenter.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class BackendEvent$CustomerCenter$$serializer implements GeneratedSerializer<BackendEvent.CustomerCenter> {
    public static final BackendEvent$CustomerCenter$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BackendEvent$CustomerCenter$$serializer backendEvent$CustomerCenter$$serializer = new BackendEvent$CustomerCenter$$serializer();
        INSTANCE = backendEvent$CustomerCenter$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("customer_center", backendEvent$CustomerCenter$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("revision_id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("app_user_id", false);
        pluginGeneratedSerialDescriptor.addElement(DiagnosticsEntry.APP_SESSION_ID_KEY, false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("dark_mode", false);
        pluginGeneratedSerialDescriptor.addElement(Constants.LOCALE, false);
        pluginGeneratedSerialDescriptor.addElement("display_mode", false);
        pluginGeneratedSerialDescriptor.addElement("path", false);
        pluginGeneratedSerialDescriptor.addElement("url", false);
        pluginGeneratedSerialDescriptor.addElement("survey_option_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BackendEvent$CustomerCenter$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = BackendEvent.CustomerCenter.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, IntSerializer.INSTANCE, kSerializerArr[2], StringSerializer.INSTANCE, StringSerializer.INSTANCE, LongSerializer.INSTANCE, BooleanSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[8], BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BackendEvent.CustomerCenter deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        String str;
        String str2;
        String str3;
        CustomerCenterConfigData.HelpPath.PathType pathType;
        CustomerCenterDisplayMode customerCenterDisplayMode;
        CustomerCenterEventType customerCenterEventType;
        String str4;
        String str5;
        boolean z;
        int i;
        long j;
        String str6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = BackendEvent.CustomerCenter.$childSerializers;
        int i3 = 10;
        String str7 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            CustomerCenterEventType customerCenterEventType2 = (CustomerCenterEventType) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            j = beginStructure.decodeLongElement(descriptor2, 5);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 6);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 7);
            CustomerCenterDisplayMode customerCenterDisplayMode2 = (CustomerCenterDisplayMode) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            CustomerCenterConfigData.HelpPath.PathType pathType2 = (CustomerCenterConfigData.HelpPath.PathType) beginStructure.decodeNullableSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            String str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, null);
            pathType = pathType2;
            str3 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, null);
            str2 = str8;
            str = decodeStringElement4;
            z = decodeBooleanElement;
            customerCenterDisplayMode = customerCenterDisplayMode2;
            customerCenterEventType = customerCenterEventType2;
            str4 = decodeStringElement2;
            i2 = 4095;
            i = decodeIntElement;
            str5 = decodeStringElement3;
            str6 = decodeStringElement;
        } else {
            int i4 = 11;
            String str9 = null;
            String str10 = null;
            str = null;
            boolean z2 = true;
            int i5 = 0;
            boolean z3 = false;
            int i6 = 0;
            long j2 = 0;
            CustomerCenterConfigData.HelpPath.PathType pathType3 = null;
            CustomerCenterDisplayMode customerCenterDisplayMode3 = null;
            CustomerCenterEventType customerCenterEventType3 = null;
            String str11 = null;
            String str12 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 11;
                    case 0:
                        i5 |= 1;
                        str7 = beginStructure.decodeStringElement(descriptor2, 0);
                        i4 = 11;
                        i3 = 10;
                    case 1:
                        i6 = beginStructure.decodeIntElement(descriptor2, 1);
                        i5 |= 2;
                        i4 = 11;
                        i3 = 10;
                    case 2:
                        customerCenterEventType3 = (CustomerCenterEventType) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], customerCenterEventType3);
                        i5 |= 4;
                        i4 = 11;
                        i3 = 10;
                    case 3:
                        str11 = beginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                        i4 = 11;
                    case 4:
                        str12 = beginStructure.decodeStringElement(descriptor2, 4);
                        i5 |= 16;
                        i4 = 11;
                    case 5:
                        j2 = beginStructure.decodeLongElement(descriptor2, 5);
                        i5 |= 32;
                        i4 = 11;
                    case 6:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, 6);
                        i5 |= 64;
                    case 7:
                        str = beginStructure.decodeStringElement(descriptor2, 7);
                        i5 |= 128;
                    case 8:
                        customerCenterDisplayMode3 = (CustomerCenterDisplayMode) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], customerCenterDisplayMode3);
                        i5 |= 256;
                    case 9:
                        pathType3 = (CustomerCenterConfigData.HelpPath.PathType) beginStructure.decodeNullableSerializableElement(descriptor2, 9, kSerializerArr[9], pathType3);
                        i5 |= 512;
                    case 10:
                        str9 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, str9);
                        i5 |= 1024;
                    case 11:
                        str10 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i4, StringSerializer.INSTANCE, str10);
                        i5 |= 2048;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str9;
            str3 = str10;
            pathType = pathType3;
            customerCenterDisplayMode = customerCenterDisplayMode3;
            customerCenterEventType = customerCenterEventType3;
            str4 = str11;
            str5 = str12;
            z = z3;
            i = i6;
            j = j2;
            str6 = str7;
            i2 = i5;
        }
        beginStructure.endStructure(descriptor2);
        return new BackendEvent.CustomerCenter(i2, str6, i, customerCenterEventType, str4, str5, j, z, str, customerCenterDisplayMode, pathType, str2, str3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BackendEvent.CustomerCenter value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        BackendEvent.CustomerCenter.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
