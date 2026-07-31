package com.yandex.div.internal.viewpool.optimization;

import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession;
import kotlin.Deprecated;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: PerformanceDependentSession.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/yandex/div/internal/viewpool/optimization/PerformanceDependentSession.Detailed.ViewObtainment.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSession$Detailed$ViewObtainment;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
/* loaded from: classes8.dex */
public final class PerformanceDependentSession$Detailed$ViewObtainment$$serializer implements GeneratedSerializer {

    @NotNull
    public static final PerformanceDependentSession$Detailed$ViewObtainment$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PerformanceDependentSession$Detailed$ViewObtainment$$serializer performanceDependentSession$Detailed$ViewObtainment$$serializer = new PerformanceDependentSession$Detailed$ViewObtainment$$serializer();
        INSTANCE = performanceDependentSession$Detailed$ViewObtainment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession.Detailed.ViewObtainment", performanceDependentSession$Detailed$ViewObtainment$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("obtainmentTime", false);
        pluginGeneratedSerialDescriptor.addElement("obtainmentDuration", false);
        pluginGeneratedSerialDescriptor.addElement("availableViews", false);
        pluginGeneratedSerialDescriptor.addElement("isObtainedWithBlock", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PerformanceDependentSession$Detailed$ViewObtainment$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, longSerializer, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PerformanceDependentSession.Detailed.ViewObtainment deserialize(@NotNull Decoder decoder) {
        int i;
        boolean z;
        int i2;
        long j;
        long j2;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 0);
            long decodeLongElement2 = beginStructure.decodeLongElement(descriptor2, 1);
            i = beginStructure.decodeIntElement(descriptor2, 2);
            z = beginStructure.decodeBooleanElement(descriptor2, 3);
            i2 = 15;
            j = decodeLongElement;
            j2 = decodeLongElement2;
        } else {
            boolean z2 = true;
            int i3 = 0;
            long j3 = 0;
            long j4 = 0;
            boolean z3 = false;
            int i4 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z2 = false;
                } else if (decodeElementIndex == 0) {
                    j3 = beginStructure.decodeLongElement(descriptor2, 0);
                    i4 |= 1;
                } else if (decodeElementIndex == 1) {
                    j4 = beginStructure.decodeLongElement(descriptor2, 1);
                    i4 |= 2;
                } else if (decodeElementIndex == 2) {
                    i3 = beginStructure.decodeIntElement(descriptor2, 2);
                    i4 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    z3 = beginStructure.decodeBooleanElement(descriptor2, 3);
                    i4 |= 8;
                }
            }
            i = i3;
            z = z3;
            i2 = i4;
            j = j3;
            j2 = j4;
        }
        beginStructure.endStructure(descriptor2);
        return new PerformanceDependentSession.Detailed.ViewObtainment(i2, j, j2, i, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PerformanceDependentSession.Detailed.ViewObtainment value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        PerformanceDependentSession.Detailed.ViewObtainment.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
