package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaywallEvent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallEvent.Data.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class PaywallEvent$Data$$serializer implements GeneratedSerializer<PaywallEvent.Data> {
    public static final PaywallEvent$Data$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallEvent$Data$$serializer paywallEvent$Data$$serializer = new PaywallEvent$Data$$serializer();
        INSTANCE = paywallEvent$Data$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.events.PaywallEvent.Data", paywallEvent$Data$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("offeringIdentifier", false);
        pluginGeneratedSerialDescriptor.addElement("paywallRevision", false);
        pluginGeneratedSerialDescriptor.addElement("sessionIdentifier", false);
        pluginGeneratedSerialDescriptor.addElement("displayMode", false);
        pluginGeneratedSerialDescriptor.addElement("localeIdentifier", false);
        pluginGeneratedSerialDescriptor.addElement("darkMode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallEvent$Data$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, IntSerializer.INSTANCE, UUIDSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PaywallEvent.Data deserialize(Decoder decoder) {
        int i;
        String str;
        boolean z;
        String str2;
        String str3;
        UUID uuid;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            UUID uuid2 = (UUID) beginStructure.decodeSerializableElement(descriptor2, 2, UUIDSerializer.INSTANCE, null);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            str = decodeStringElement;
            z = beginStructure.decodeBooleanElement(descriptor2, 5);
            str3 = decodeStringElement2;
            str2 = decodeStringElement3;
            uuid = uuid2;
            i2 = decodeIntElement;
            i = 63;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            i = 0;
            str = null;
            UUID uuid3 = null;
            String str4 = null;
            String str5 = null;
            int i3 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        str = beginStructure.decodeStringElement(descriptor2, 0);
                        i |= 1;
                        continue;
                    case 1:
                        i3 = beginStructure.decodeIntElement(descriptor2, 1);
                        i |= 2;
                        break;
                    case 2:
                        uuid3 = (UUID) beginStructure.decodeSerializableElement(descriptor2, 2, UUIDSerializer.INSTANCE, uuid3);
                        i |= 4;
                        break;
                    case 3:
                        str4 = beginStructure.decodeStringElement(descriptor2, 3);
                        i |= 8;
                        break;
                    case 4:
                        str5 = beginStructure.decodeStringElement(descriptor2, 4);
                        i |= 16;
                        break;
                    case 5:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, 5);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            z = z3;
            str2 = str5;
            str3 = str4;
            uuid = uuid3;
            i2 = i3;
        }
        beginStructure.endStructure(descriptor2);
        return new PaywallEvent.Data(i, str, i2, uuid, str3, str2, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, PaywallEvent.Data value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        PaywallEvent.Data.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
