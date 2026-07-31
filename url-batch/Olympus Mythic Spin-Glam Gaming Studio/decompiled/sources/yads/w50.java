package yads;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final class w50 implements GeneratedSerializer {
    public static final w50 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        w50 w50Var = new w50();
        a = w50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", w50Var, 4);
        pluginGeneratedSerialDescriptor.addElement("has_location_consent", false);
        pluginGeneratedSerialDescriptor.addElement("age_restricted_user", false);
        pluginGeneratedSerialDescriptor.addElement("has_user_consent", false);
        pluginGeneratedSerialDescriptor.addElement("has_cmp_value", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        int i;
        Boolean bool;
        Boolean bool2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 0);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, booleanSerializer, null);
            Boolean bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, booleanSerializer, null);
            z = decodeBooleanElement;
            z2 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
            bool2 = bool4;
            bool = bool3;
            i = 15;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i2 = 0;
            Boolean bool5 = null;
            Boolean bool6 = null;
            boolean z5 = false;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z3 = false;
                } else if (decodeElementIndex == 0) {
                    z4 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, BooleanSerializer.INSTANCE, bool5);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    bool6 = (Boolean) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, BooleanSerializer.INSTANCE, bool6);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    z5 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                    i2 |= 8;
                }
            }
            z = z4;
            z2 = z5;
            i = i2;
            bool = bool5;
            bool2 = bool6;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new y50(i, z, bool, bool2, z2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        y50 y50Var = (y50) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 0, y50Var.a);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, booleanSerializer, y50Var.b);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, booleanSerializer, y50Var.c);
        beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 3, y50Var.d);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
