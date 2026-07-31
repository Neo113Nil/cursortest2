package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.GradientColor;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002\u0013\u0015B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0018¨\u0006+"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/o;", "", "", "borderWidth", "", "Lcom/moloco/sdk/internal/ortb/model/t;", "gradient", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/o;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Ljava/lang/Integer;", "c", "()Ljava/util/List;", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/moloco/sdk/internal/ortb/model/o;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "d", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()V", "Ljava/util/List;", InneractiveMediationDefs.GENDER_FEMALE, "g", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.o, reason: from toString */
/* loaded from: classes13.dex */
public final /* data */ class DECBorderSerializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 8;

    @NotNull
    public static final KSerializer[] d = {null, new ArrayListSerializer(GradientColor.a.a)};

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer borderWidth;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<GradientColor> gradient;

    @StabilityInferred
    @Deprecated
    /* renamed from: com.moloco.sdk.internal.ortb.model.o$a */
    public /* synthetic */ class a implements GeneratedSerializer {

        @NotNull
        public static final a a;
        public static final int b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECBorderSerializable", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("border_width", true);
            pluginGeneratedSerialDescriptor.addElement("gradient", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECBorderSerializable deserialize(@NotNull Decoder decoder) {
            List list;
            Integer num;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = DECBorderSerializable.d;
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
                list = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                List list2 = null;
                Integer num2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num2);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list2);
                        i2 |= 2;
                    }
                }
                list = list2;
                num = num2;
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new DECBorderSerializable(i, num, list, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(DECBorderSerializable.d[1])};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
            return super.typeParametersSerializers();
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull DECBorderSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            DECBorderSerializable.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.o$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DECBorderSerializable() {
        this((Integer) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    @NotNull
    public final DECBorderSerializable a(@Nullable Integer borderWidth, @Nullable List<GradientColor> gradient) {
        return new DECBorderSerializable(borderWidth, gradient);
    }

    @Nullable
    /* renamed from: b, reason: from getter */
    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    public final List<GradientColor> c() {
        return this.gradient;
    }

    @Nullable
    public final Integer d() {
        return this.borderWidth;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECBorderSerializable)) {
            return false;
        }
        DECBorderSerializable dECBorderSerializable = (DECBorderSerializable) other;
        return Intrinsics.areEqual(this.borderWidth, dECBorderSerializable.borderWidth) && Intrinsics.areEqual(this.gradient, dECBorderSerializable.gradient);
    }

    @Nullable
    public final List<GradientColor> f() {
        return this.gradient;
    }

    public int hashCode() {
        Integer num = this.borderWidth;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<GradientColor> list = this.gradient;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECBorderSerializable(borderWidth=" + this.borderWidth + ", gradient=" + this.gradient + ')';
    }

    public /* synthetic */ DECBorderSerializable(int i, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.borderWidth = null;
        } else {
            this.borderWidth = num;
        }
        if ((i & 2) == 0) {
            this.gradient = null;
        } else {
            this.gradient = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DECBorderSerializable a(DECBorderSerializable dECBorderSerializable, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dECBorderSerializable.borderWidth;
        }
        if ((i & 2) != 0) {
            list = dECBorderSerializable.gradient;
        }
        return dECBorderSerializable.a(num, list);
    }

    public static final /* synthetic */ void a(DECBorderSerializable self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = d;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.borderWidth != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.borderWidth);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.gradient == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.gradient);
    }

    public DECBorderSerializable(@Nullable Integer num, @Nullable List<GradientColor> list) {
        this.borderWidth = num;
        this.gradient = list;
    }

    public /* synthetic */ DECBorderSerializable(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
