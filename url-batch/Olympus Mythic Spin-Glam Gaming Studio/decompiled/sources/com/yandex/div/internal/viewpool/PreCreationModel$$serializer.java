package com.yandex.div.internal.viewpool;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewPreCreationProfile.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/yandex/div/internal/viewpool/PreCreationModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/yandex/div/internal/viewpool/PreCreationModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class PreCreationModel$$serializer implements GeneratedSerializer {

    @NotNull
    public static final PreCreationModel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PreCreationModel$$serializer preCreationModel$$serializer = new PreCreationModel$$serializer();
        INSTANCE = preCreationModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.div.internal.viewpool.PreCreationModel", preCreationModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("capacity", false);
        pluginGeneratedSerialDescriptor.addElement("min", true);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PreCreationModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PreCreationModel deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        int i3;
        int i4;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 1);
            i = decodeIntElement;
            i2 = beginStructure.decodeIntElement(descriptor2, 2);
            i3 = decodeIntElement2;
            i4 = 7;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    i5 = beginStructure.decodeIntElement(descriptor2, 0);
                    i8 |= 1;
                } else if (decodeElementIndex == 1) {
                    i7 = beginStructure.decodeIntElement(descriptor2, 1);
                    i8 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    i6 = beginStructure.decodeIntElement(descriptor2, 2);
                    i8 |= 4;
                }
            }
            i = i5;
            i2 = i6;
            i3 = i7;
            i4 = i8;
        }
        beginStructure.endStructure(descriptor2);
        return new PreCreationModel(i4, i, i3, i2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PreCreationModel value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        PreCreationModel.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
