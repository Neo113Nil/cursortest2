package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.DECBorderSerializable;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0002\u0018\u001bB[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJd\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0018\u0010#J\u0010\u0010$\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010+\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010+\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010/\u0012\u0004\b:\u0010.\u001a\u0004\b9\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010/\u0012\u0004\b<\u0010.\u001a\u0004\b;\u0010\u001c¨\u0006>"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/p;", "", "", "verticalSpacing", "", "ctaText", "buttonWidth", "fontSize", "Lcom/moloco/sdk/internal/ortb/model/o;", "border", "foregroundColor", "backgroundColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/o;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/o;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/p;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "c", "d", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Lcom/moloco/sdk/internal/ortb/model/o;", InneractiveMediationDefs.GENDER_FEMALE, "g", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/o;Ljava/lang/String;Ljava/lang/String;)Lcom/moloco/sdk/internal/ortb/model/p;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "t", "u", "()V", "Ljava/lang/String;", "n", "o", "l", "m", "p", CampaignEx.JSON_KEY_AD_Q, "Lcom/moloco/sdk/internal/ortb/model/o;", com.mbridge.msdk.foundation.same.report.j.b, CampaignEx.JSON_KEY_AD_K, "r", "s", "h", "i", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.p, reason: from toString */
/* loaded from: classes6.dex */
public final /* data */ class DECCtaSerializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int h = 8;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer verticalSpacing;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String ctaText;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer buttonWidth;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer fontSize;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final DECBorderSerializable border;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String foregroundColor;

    /* renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final String backgroundColor;

    @StabilityInferred
    @Deprecated
    /* renamed from: com.moloco.sdk.internal.ortb.model.p$a */
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECCtaSerializable", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("vertical_spacing", true);
            pluginGeneratedSerialDescriptor.addElement("text", true);
            pluginGeneratedSerialDescriptor.addElement("button_width", true);
            pluginGeneratedSerialDescriptor.addElement(ViewHierarchyConstants.TEXT_SIZE, true);
            pluginGeneratedSerialDescriptor.addElement("border", true);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", true);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECCtaSerializable deserialize(@NotNull Decoder decoder) {
            int i;
            String str;
            Integer num;
            String str2;
            Integer num2;
            Integer num3;
            DECBorderSerializable dECBorderSerializable;
            String str3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i2 = 6;
            Integer num4 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
                Integer num6 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
                Integer num7 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
                DECBorderSerializable dECBorderSerializable2 = (DECBorderSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DECBorderSerializable.a.a, null);
                String str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
                num3 = num7;
                str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
                str3 = str5;
                dECBorderSerializable = dECBorderSerializable2;
                i = 127;
                num2 = num6;
                str2 = str4;
                num = num5;
            } else {
                boolean z = true;
                int i3 = 0;
                String str6 = null;
                String str7 = null;
                Integer num8 = null;
                Integer num9 = null;
                DECBorderSerializable dECBorderSerializable3 = null;
                String str8 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 6;
                        case 0:
                            num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num4);
                            i3 |= 1;
                            i2 = 6;
                        case 1:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str7);
                            i3 |= 2;
                            i2 = 6;
                        case 2:
                            num8 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num8);
                            i3 |= 4;
                        case 3:
                            num9 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num9);
                            i3 |= 8;
                        case 4:
                            dECBorderSerializable3 = (DECBorderSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DECBorderSerializable.a.a, dECBorderSerializable3);
                            i3 |= 16;
                        case 5:
                            str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str8);
                            i3 |= 32;
                        case 6:
                            str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str6);
                            i3 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i3;
                str = str6;
                num = num4;
                str2 = str7;
                num2 = num8;
                num3 = num9;
                dECBorderSerializable = dECBorderSerializable3;
                str3 = str8;
            }
            beginStructure.endStructure(serialDescriptor);
            return new DECCtaSerializable(i, num, str2, num2, num3, dECBorderSerializable, str3, str, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(DECBorderSerializable.a.a), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull DECCtaSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            DECCtaSerializable.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.p$b, reason: from kotlin metadata */
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

    public DECCtaSerializable() {
        this((Integer) null, (String) null, (Integer) null, (Integer) null, (DECBorderSerializable) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void u() {
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final Integer getVerticalSpacing() {
        return this.verticalSpacing;
    }

    @Nullable
    /* renamed from: b, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final Integer getButtonWidth() {
        return this.buttonWidth;
    }

    @Nullable
    /* renamed from: d, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    @Nullable
    /* renamed from: e, reason: from getter */
    public final DECBorderSerializable getBorder() {
        return this.border;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECCtaSerializable)) {
            return false;
        }
        DECCtaSerializable dECCtaSerializable = (DECCtaSerializable) other;
        return Intrinsics.areEqual(this.verticalSpacing, dECCtaSerializable.verticalSpacing) && Intrinsics.areEqual(this.ctaText, dECCtaSerializable.ctaText) && Intrinsics.areEqual(this.buttonWidth, dECCtaSerializable.buttonWidth) && Intrinsics.areEqual(this.fontSize, dECCtaSerializable.fontSize) && Intrinsics.areEqual(this.border, dECCtaSerializable.border) && Intrinsics.areEqual(this.foregroundColor, dECCtaSerializable.foregroundColor) && Intrinsics.areEqual(this.backgroundColor, dECCtaSerializable.backgroundColor);
    }

    @Nullable
    /* renamed from: f, reason: from getter */
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    @Nullable
    /* renamed from: g, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String h() {
        return this.backgroundColor;
    }

    public int hashCode() {
        Integer num = this.verticalSpacing;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ctaText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.buttonWidth;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fontSize;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DECBorderSerializable dECBorderSerializable = this.border;
        int hashCode5 = (hashCode4 + (dECBorderSerializable == null ? 0 : dECBorderSerializable.hashCode())) * 31;
        String str2 = this.foregroundColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final DECBorderSerializable j() {
        return this.border;
    }

    @Nullable
    public final Integer l() {
        return this.buttonWidth;
    }

    @Nullable
    public final String n() {
        return this.ctaText;
    }

    @Nullable
    public final Integer p() {
        return this.fontSize;
    }

    @Nullable
    public final String r() {
        return this.foregroundColor;
    }

    @Nullable
    public final Integer t() {
        return this.verticalSpacing;
    }

    @NotNull
    public String toString() {
        return "DECCtaSerializable(verticalSpacing=" + this.verticalSpacing + ", ctaText=" + this.ctaText + ", buttonWidth=" + this.buttonWidth + ", fontSize=" + this.fontSize + ", border=" + this.border + ", foregroundColor=" + this.foregroundColor + ", backgroundColor=" + this.backgroundColor + ')';
    }

    public /* synthetic */ DECCtaSerializable(int i, Integer num, String str, Integer num2, Integer num3, DECBorderSerializable dECBorderSerializable, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.verticalSpacing = null;
        } else {
            this.verticalSpacing = num;
        }
        if ((i & 2) == 0) {
            this.ctaText = null;
        } else {
            this.ctaText = str;
        }
        if ((i & 4) == 0) {
            this.buttonWidth = null;
        } else {
            this.buttonWidth = num2;
        }
        if ((i & 8) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num3;
        }
        if ((i & 16) == 0) {
            this.border = null;
        } else {
            this.border = dECBorderSerializable;
        }
        if ((i & 32) == 0) {
            this.foregroundColor = null;
        } else {
            this.foregroundColor = str2;
        }
        if ((i & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str3;
        }
    }

    @NotNull
    public final DECCtaSerializable a(@Nullable Integer verticalSpacing, @Nullable String ctaText, @Nullable Integer buttonWidth, @Nullable Integer fontSize, @Nullable DECBorderSerializable border, @Nullable String foregroundColor, @Nullable String backgroundColor) {
        return new DECCtaSerializable(verticalSpacing, ctaText, buttonWidth, fontSize, border, foregroundColor, backgroundColor);
    }

    public static /* synthetic */ DECCtaSerializable a(DECCtaSerializable dECCtaSerializable, Integer num, String str, Integer num2, Integer num3, DECBorderSerializable dECBorderSerializable, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dECCtaSerializable.verticalSpacing;
        }
        if ((i & 2) != 0) {
            str = dECCtaSerializable.ctaText;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            num2 = dECCtaSerializable.buttonWidth;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            num3 = dECCtaSerializable.fontSize;
        }
        Integer num5 = num3;
        if ((i & 16) != 0) {
            dECBorderSerializable = dECCtaSerializable.border;
        }
        DECBorderSerializable dECBorderSerializable2 = dECBorderSerializable;
        if ((i & 32) != 0) {
            str2 = dECCtaSerializable.foregroundColor;
        }
        String str5 = str2;
        if ((i & 64) != 0) {
            str3 = dECCtaSerializable.backgroundColor;
        }
        return dECCtaSerializable.a(num, str4, num4, num5, dECBorderSerializable2, str5, str3);
    }

    public static final /* synthetic */ void a(DECCtaSerializable self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.verticalSpacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.verticalSpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ctaText != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.ctaText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.buttonWidth != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.buttonWidth);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.fontSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.fontSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.border != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DECBorderSerializable.a.a, self.border);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.foregroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.foregroundColor);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.backgroundColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.backgroundColor);
    }

    public DECCtaSerializable(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable DECBorderSerializable dECBorderSerializable, @Nullable String str2, @Nullable String str3) {
        this.verticalSpacing = num;
        this.ctaText = str;
        this.buttonWidth = num2;
        this.fontSize = num3;
        this.border = dECBorderSerializable;
        this.foregroundColor = str2;
        this.backgroundColor = str3;
    }

    public /* synthetic */ DECCtaSerializable(Integer num, String str, Integer num2, Integer num3, DECBorderSerializable dECBorderSerializable, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : dECBorderSerializable, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }
}
