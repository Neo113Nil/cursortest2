package com.moloco.sdk.publisher.bidrequest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0007R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/moloco/sdk/publisher/bidrequest/Geo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes10.dex */
public /* synthetic */ class Geo$$serializer implements GeneratedSerializer {
    public static final int $stable;

    @NotNull
    public static final Geo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Geo$$serializer geo$$serializer = new Geo$$serializer();
        INSTANCE = geo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.publisher.bidrequest.Geo", geo$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_CITY, false);
        pluginGeneratedSerialDescriptor.addElement("country", false);
        pluginGeneratedSerialDescriptor.addElement("region", false);
        pluginGeneratedSerialDescriptor.addElement(InneractiveMediationDefs.KEY_ZIPCODE, false);
        pluginGeneratedSerialDescriptor.addElement("latitude", false);
        pluginGeneratedSerialDescriptor.addElement("longitude", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Geo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final Geo deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Float f;
        Float f2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        String str5 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, floatSerializer, null);
            str4 = str9;
            f2 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, floatSerializer, null);
            i = 63;
            f = f3;
            str3 = str8;
            str2 = str7;
            str = str6;
        } else {
            boolean z = true;
            int i3 = 0;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            Float f4 = null;
            Float f5 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str5);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str10);
                        i3 |= 2;
                    case 2:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str11);
                        i3 |= 4;
                    case 3:
                        str12 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        i3 |= 8;
                    case 4:
                        f4 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, f4);
                        i3 |= 16;
                    case 5:
                        f5 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f5);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            str = str5;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            f = f4;
            f2 = f5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new Geo(i, str, str2, str3, str4, f, f2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Geo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Geo.write$Self$moloco_sdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
