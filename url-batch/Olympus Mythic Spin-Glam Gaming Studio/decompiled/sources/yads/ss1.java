package yads;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes14.dex */
public final class ss1 implements GeneratedSerializer {
    public static final ss1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ss1 ss1Var = new ss1();
        a = ss1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", ss1Var, 2);
        pluginGeneratedSerialDescriptor.addElement("load_timeout_millis", true);
        pluginGeneratedSerialDescriptor.addElement("mediation_prefetch_ad_units", true);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{LongSerializer.INSTANCE, vs1.d[1].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        long j;
        int i;
        List list;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = vs1.d;
        List list2 = null;
        if (beginStructure.decodeSequentially()) {
            j = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
            list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            j = 0;
            boolean z = true;
            i = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    j = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list2);
                    i |= 2;
                }
            }
            list = list2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new vs1(i, j, list);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        vs1 vs1Var = (vs1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = vs1.d;
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || vs1Var.b != 30000) {
            beginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, vs1Var.b);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(vs1Var.c, CollectionsKt.emptyList())) {
            beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), vs1Var.c);
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
