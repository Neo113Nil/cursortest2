package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.facebook.internal.AnalyticsEvents;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.UInt;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0001\u0018\u0000 :2\u00020\u0001:\u0002\u001b\"BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010!\u001a\u0004\b)\u0010*R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010!\u001a\u0004\b.\u0010/R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010!\u001a\u0004\b3\u00104R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00106\u0012\u0004\b1\u0010!\u001a\u0004\b,\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00108\u0012\u0004\b'\u0010!\u001a\u0004\b\"\u00109¨\u0006;"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/y;", "", "", "mute", "Lkotlin/UInt;", VastAttributes.PADDING, "Lcom/moloco/sdk/internal/ortb/model/u;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/F;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "controlSize", "backgroundColor", "<init>", "(ZILcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/internal/ortb/model/F;JLkotlin/UInt;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlin/UInt;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/internal/ortb/model/F;Landroidx/compose/ui/graphics/Color;Lkotlin/UInt;Landroidx/compose/ui/graphics/Color;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/y;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", com.mbridge.msdk.foundation.same.report.j.b, "()Z", CampaignEx.JSON_KEY_AD_K, "()V", "b", "I", "l", "()I", "m", "c", "Lcom/moloco/sdk/internal/ortb/model/u;", "h", "()Lcom/moloco/sdk/internal/ortb/model/u;", "i", "d", "Lcom/moloco/sdk/internal/ortb/model/F;", "n", "()Lcom/moloco/sdk/internal/ortb/model/F;", "o", EidRequestBuilder.REQUEST_FIELD_EMAIL, "J", InneractiveMediationDefs.GENDER_FEMALE, "()J", "g", "Lkotlin/UInt;", "()Lkotlin/UInt;", "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes6.dex */
public final class y {
    public static final int h = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean mute;

    /* renamed from: b, reason: from kotlin metadata */
    public final int padding;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final u horizontalAlignment;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final F verticalAlignment;

    /* renamed from: e, reason: from kotlin metadata */
    public final long foregroundColor;

    /* renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final UInt controlSize;

    /* renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final Color backgroundColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final KSerializer[] i = {null, null, u.INSTANCE.serializer(), F.INSTANCE.serializer(), null, null, null};

    @StabilityInferred
    @Deprecated
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Mute", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("mute", false);
            pluginGeneratedSerialDescriptor.addElement(VastAttributes.PADDING, false);
            pluginGeneratedSerialDescriptor.addElement(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT, false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            pluginGeneratedSerialDescriptor.addElement("control_size", true);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y deserialize(@NotNull Decoder decoder) {
            boolean z;
            Color color;
            UInt uInt;
            int i;
            UInt uInt2;
            u uVar;
            F f;
            Color color2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = y.i;
            int i2 = 6;
            int i3 = 5;
            if (beginStructure.decodeSequentially()) {
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
                UInt uInt3 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 1, uIntSerializer, null);
                u uVar2 = (u) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
                F f2 = (F) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
                j jVar = j.a;
                Color color3 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 4, jVar, null);
                UInt uInt4 = (UInt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, uIntSerializer, null);
                f = f2;
                z = decodeBooleanElement;
                color = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, jVar, null);
                uInt = uInt4;
                color2 = color3;
                i = 127;
                uVar = uVar2;
                uInt2 = uInt3;
            } else {
                boolean z2 = true;
                boolean z3 = false;
                Color color4 = null;
                UInt uInt5 = null;
                u uVar3 = null;
                F f3 = null;
                Color color5 = null;
                UInt uInt6 = null;
                int i4 = 0;
                while (z2) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z2 = false;
                            i2 = 6;
                        case 0:
                            z3 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                            i4 |= 1;
                            i2 = 6;
                            i3 = 5;
                        case 1:
                            uInt5 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 1, UIntSerializer.INSTANCE, uInt5);
                            i4 |= 2;
                            i2 = 6;
                            i3 = 5;
                        case 2:
                            uVar3 = (u) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], uVar3);
                            i4 |= 4;
                            i2 = 6;
                        case 3:
                            f3 = (F) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], f3);
                            i4 |= 8;
                        case 4:
                            color5 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 4, j.a, color5);
                            i4 |= 16;
                        case 5:
                            uInt6 = (UInt) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, UIntSerializer.INSTANCE, uInt6);
                            i4 |= 32;
                        case 6:
                            color4 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, j.a, color4);
                            i4 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                z = z3;
                color = color4;
                uInt = uInt6;
                i = i4;
                uInt2 = uInt5;
                uVar = uVar3;
                f = f3;
                color2 = color5;
            }
            beginStructure.endStructure(serialDescriptor);
            return new y(i, z, uInt2, uVar, f, color2, uInt, color, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = y.i;
            UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
            KSerializer kSerializer = kSerializerArr[2];
            KSerializer kSerializer2 = kSerializerArr[3];
            j jVar = j.a;
            return new KSerializer[]{BooleanSerializer.INSTANCE, uIntSerializer, kSerializer, kSerializer2, jVar, BuiltinSerializersKt.getNullable(uIntSerializer), BuiltinSerializersKt.getNullable(jVar)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull y value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            y.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.y$b, reason: from kotlin metadata */
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

    public /* synthetic */ y(int i2, boolean z, UInt uInt, u uVar, F f, Color color, UInt uInt2, Color color2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z, uInt, uVar, f, color, uInt2, color2, serializationConstructorMarker);
    }

    @Serializable(with = j.class)
    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void e() {
    }

    @Serializable(with = j.class)
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
    /* renamed from: b, reason: from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: d, reason: from getter */
    public final UInt getControlSize() {
        return this.controlSize;
    }

    /* renamed from: f, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    @NotNull
    /* renamed from: h, reason: from getter */
    public final u getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getMute() {
        return this.mute;
    }

    /* renamed from: l, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    @NotNull
    /* renamed from: n, reason: from getter */
    public final F getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ y(boolean z, int i2, u uVar, F f, long j, UInt uInt, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i2, uVar, f, j, uInt, color);
    }

    public static final /* synthetic */ void a(y self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = i;
        output.encodeBooleanElement(serialDesc, 0, self.mute);
        UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, uIntSerializer, UInt.m8054boximpl(self.padding));
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.horizontalAlignment);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.verticalAlignment);
        j jVar = j.a;
        output.encodeSerializableElement(serialDesc, 4, jVar, Color.m1441boximpl(self.foregroundColor));
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.controlSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, uIntSerializer, self.controlSize);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.backgroundColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, jVar, self.backgroundColor);
    }

    public /* synthetic */ y(int i2, boolean z, UInt uInt, u uVar, F f, Color color, UInt uInt2, Color color2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i2 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 31, a.a.getDescriptor());
        }
        this.mute = z;
        this.padding = uInt.m8059unboximpl();
        this.horizontalAlignment = uVar;
        this.verticalAlignment = f;
        this.foregroundColor = color.getValue();
        if ((i2 & 32) == 0) {
            this.controlSize = null;
        } else {
            this.controlSize = uInt2;
        }
        if ((i2 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color2;
        }
    }

    public y(boolean z, int i2, u horizontalAlignment, F verticalAlignment, long j, UInt uInt, Color color) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.mute = z;
        this.padding = i2;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j;
        this.controlSize = uInt;
        this.backgroundColor = color;
    }

    public /* synthetic */ y(boolean z, int i2, u uVar, F f, long j, UInt uInt, Color color, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i2, uVar, f, j, (i3 & 32) != 0 ? null : uInt, (i3 & 64) != 0 ? null : color, null);
    }
}
