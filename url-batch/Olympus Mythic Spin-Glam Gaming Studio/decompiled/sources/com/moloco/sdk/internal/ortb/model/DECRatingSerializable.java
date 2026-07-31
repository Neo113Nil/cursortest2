package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0002\u0016\u0019BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H×\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00100\u0012\u0004\b4\u0010*\u001a\u0004\b3\u0010\u001d¨\u00066"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/q;", "", "", "ratingValue", "", "foregroundColor", "backgroundColor", "", "size", "fontSize", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/q;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/Float;", "b", "()Ljava/lang/String;", "c", "d", "()Ljava/lang/Integer;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/moloco/sdk/internal/ortb/model/q;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "l", "m", "()V", "Ljava/lang/String;", com.mbridge.msdk.foundation.same.report.j.b, CampaignEx.JSON_KEY_AD_K, InneractiveMediationDefs.GENDER_FEMALE, "g", "Ljava/lang/Integer;", "n", "o", "h", "i", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.q, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class DECRatingSerializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 0;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Float ratingValue;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String foregroundColor;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String backgroundColor;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer size;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer fontSize;

    @StabilityInferred
    @Deprecated
    /* renamed from: com.moloco.sdk.internal.ortb.model.q$a */
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECRatingSerializable", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("rating_value", true);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", true);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            pluginGeneratedSerialDescriptor.addElement("rating_size", true);
            pluginGeneratedSerialDescriptor.addElement(ViewHierarchyConstants.TEXT_SIZE, true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECRatingSerializable deserialize(@NotNull Decoder decoder) {
            int i;
            Float f;
            String str;
            String str2;
            Integer num;
            Integer num2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            Float f2 = null;
            if (beginStructure.decodeSequentially()) {
                Float f3 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, FloatSerializer.INSTANCE, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
                String str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                f = f3;
                num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
                num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
                str2 = str4;
                str = str3;
                i = 31;
            } else {
                boolean z = true;
                int i2 = 0;
                String str5 = null;
                String str6 = null;
                Integer num3 = null;
                Integer num4 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        f2 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, FloatSerializer.INSTANCE, f2);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str6);
                        i2 |= 4;
                    } else if (decodeElementIndex == 3) {
                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num3);
                        i2 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num4);
                        i2 |= 16;
                    }
                }
                i = i2;
                f = f2;
                str = str5;
                str2 = str6;
                num = num3;
                num2 = num4;
            }
            beginStructure.endStructure(serialDescriptor);
            return new DECRatingSerializable(i, f, str, str2, num, num2, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            KSerializer nullable = BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
            KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull DECRatingSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            DECRatingSerializable.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.q$b, reason: from kotlin metadata */
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

    public DECRatingSerializable() {
        this((Float) null, (String) null, (String) null, (Integer) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void o() {
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final Float getRatingValue() {
        return this.ratingValue;
    }

    @Nullable
    /* renamed from: b, reason: from getter */
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: d, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    @Nullable
    /* renamed from: e, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECRatingSerializable)) {
            return false;
        }
        DECRatingSerializable dECRatingSerializable = (DECRatingSerializable) other;
        return Intrinsics.areEqual((Object) this.ratingValue, (Object) dECRatingSerializable.ratingValue) && Intrinsics.areEqual(this.foregroundColor, dECRatingSerializable.foregroundColor) && Intrinsics.areEqual(this.backgroundColor, dECRatingSerializable.backgroundColor) && Intrinsics.areEqual(this.size, dECRatingSerializable.size) && Intrinsics.areEqual(this.fontSize, dECRatingSerializable.fontSize);
    }

    @Nullable
    public final String f() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer h() {
        return this.fontSize;
    }

    public int hashCode() {
        Float f2 = this.ratingValue;
        int hashCode = (f2 == null ? 0 : f2.hashCode()) * 31;
        String str = this.foregroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.size;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fontSize;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Nullable
    public final String j() {
        return this.foregroundColor;
    }

    @Nullable
    public final Float l() {
        return this.ratingValue;
    }

    @Nullable
    public final Integer n() {
        return this.size;
    }

    @NotNull
    public String toString() {
        return "DECRatingSerializable(ratingValue=" + this.ratingValue + ", foregroundColor=" + this.foregroundColor + ", backgroundColor=" + this.backgroundColor + ", size=" + this.size + ", fontSize=" + this.fontSize + ')';
    }

    public /* synthetic */ DECRatingSerializable(int i, Float f2, String str, String str2, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ratingValue = null;
        } else {
            this.ratingValue = f2;
        }
        if ((i & 2) == 0) {
            this.foregroundColor = null;
        } else {
            this.foregroundColor = str;
        }
        if ((i & 4) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str2;
        }
        if ((i & 8) == 0) {
            this.size = null;
        } else {
            this.size = num;
        }
        if ((i & 16) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num2;
        }
    }

    @NotNull
    public final DECRatingSerializable a(@Nullable Float ratingValue, @Nullable String foregroundColor, @Nullable String backgroundColor, @Nullable Integer size, @Nullable Integer fontSize) {
        return new DECRatingSerializable(ratingValue, foregroundColor, backgroundColor, size, fontSize);
    }

    public static /* synthetic */ DECRatingSerializable a(DECRatingSerializable dECRatingSerializable, Float f2, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = dECRatingSerializable.ratingValue;
        }
        if ((i & 2) != 0) {
            str = dECRatingSerializable.foregroundColor;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = dECRatingSerializable.backgroundColor;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num = dECRatingSerializable.size;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = dECRatingSerializable.fontSize;
        }
        return dECRatingSerializable.a(f2, str3, str4, num3, num2);
    }

    public static final /* synthetic */ void a(DECRatingSerializable self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ratingValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.ratingValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.foregroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.foregroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.backgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.backgroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.size != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.size);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.fontSize == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.fontSize);
    }

    public DECRatingSerializable(@Nullable Float f2, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        this.ratingValue = f2;
        this.foregroundColor = str;
        this.backgroundColor = str2;
        this.size = num;
        this.fontSize = num2;
    }

    public /* synthetic */ DECRatingSerializable(Float f2, String str, String str2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
