package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0001\u0018\u0000 12\u00020\u0001:\u0002\u0019 B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001b\u0012\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u001f\u001a\u0004\b*\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010)\u0012\u0004\b \u0010\u001f\u001a\u0004\b\u0019\u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b(\u0010\u001f\u001a\u0004\b%\u0010.R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010-\u0012\u0004\b0\u0010\u001f\u001a\u0004\b/\u0010.¨\u00062"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/v;", "", "", "text", "", "useIcon", "textPosition", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "backgroundColor", "", "fontSize", "iconSize", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/v;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "i", "()Ljava/lang/String;", com.mbridge.msdk.foundation.same.report.j.b, "()V", "b", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "n", "c", CampaignEx.JSON_KEY_AD_K, "l", "d", "Landroidx/compose/ui/graphics/Color;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Landroidx/compose/ui/graphics/Color;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "h", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes14.dex */
public final class v {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int h = 0;

    /* renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String text;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Boolean useIcon;

    /* renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String textPosition;

    /* renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Color foregroundColor;

    /* renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final Color backgroundColor;

    /* renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Integer fontSize;

    /* renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final Integer iconSize;

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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.InlineTextButton", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("text", true);
            pluginGeneratedSerialDescriptor.addElement("use_icon", true);
            pluginGeneratedSerialDescriptor.addElement("text_position", true);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", true);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            pluginGeneratedSerialDescriptor.addElement(ViewHierarchyConstants.TEXT_SIZE, true);
            pluginGeneratedSerialDescriptor.addElement("icon_size", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v deserialize(@NotNull Decoder decoder) {
            int i;
            Integer num;
            String str;
            Boolean bool;
            String str2;
            Color color;
            Color color2;
            Integer num2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i2 = 6;
            String str3 = null;
            if (beginStructure.decodeSequentially()) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
                Boolean bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, null);
                String str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                j jVar = j.a;
                Color color3 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, jVar, null);
                Color color4 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, jVar, null);
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
                str2 = str5;
                num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
                num2 = num3;
                color = color3;
                color2 = color4;
                i = 127;
                bool = bool2;
                str = str4;
            } else {
                boolean z = true;
                int i3 = 0;
                Integer num4 = null;
                Boolean bool3 = null;
                String str6 = null;
                Color color5 = null;
                Color color6 = null;
                Integer num5 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 6;
                        case 0:
                            str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str3);
                            i3 |= 1;
                            i2 = 6;
                        case 1:
                            bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool3);
                            i3 |= 2;
                            i2 = 6;
                        case 2:
                            str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str6);
                            i3 |= 4;
                        case 3:
                            color5 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, j.a, color5);
                            i3 |= 8;
                        case 4:
                            color6 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, j.a, color6);
                            i3 |= 16;
                        case 5:
                            num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num5);
                            i3 |= 32;
                        case 6:
                            num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num4);
                            i3 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i3;
                num = num4;
                str = str3;
                bool = bool3;
                str2 = str6;
                color = color5;
                color2 = color6;
                num2 = num5;
            }
            beginStructure.endStructure(serialDescriptor);
            return new v(i, str, bool, str2, color, color2, num2, num, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE);
            KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
            j jVar = j.a;
            KSerializer nullable4 = BuiltinSerializersKt.getNullable(jVar);
            KSerializer nullable5 = BuiltinSerializersKt.getNullable(jVar);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull v value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            v.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.v$b, reason: from kotlin metadata */
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

    public /* synthetic */ v(int i, String str, Boolean bool, String str2, Color color, Color color2, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, bool, str2, color, color2, num, num2, serializationConstructorMarker);
    }

    public static final /* synthetic */ void a(v self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.useIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.useIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.textPosition != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.textPosition);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.foregroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, j.a, self.foregroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.backgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, j.a, self.backgroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.fontSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.fontSize);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.iconSize == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.iconSize);
    }

    @Serializable(with = j.class)
    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    @Serializable(with = j.class)
    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void n() {
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    @Nullable
    /* renamed from: e, reason: from getter */
    public final Color getForegroundColor() {
        return this.foregroundColor;
    }

    @Nullable
    /* renamed from: g, reason: from getter */
    public final Integer getIconSize() {
        return this.iconSize;
    }

    @Nullable
    /* renamed from: i, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: k, reason: from getter */
    public final String getTextPosition() {
        return this.textPosition;
    }

    @Nullable
    /* renamed from: m, reason: from getter */
    public final Boolean getUseIcon() {
        return this.useIcon;
    }

    public /* synthetic */ v(String str, Boolean bool, String str2, Color color, Color color2, Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, str2, color, color2, num, num2);
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public /* synthetic */ v(int i, String str, Boolean bool, String str2, Color color, Color color2, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.useIcon = null;
        } else {
            this.useIcon = bool;
        }
        if ((i & 4) == 0) {
            this.textPosition = null;
        } else {
            this.textPosition = str2;
        }
        if ((i & 8) == 0) {
            this.foregroundColor = null;
        } else {
            this.foregroundColor = color;
        }
        if ((i & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color2;
        }
        if ((i & 32) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
        if ((i & 64) == 0) {
            this.iconSize = null;
        } else {
            this.iconSize = num2;
        }
    }

    public v(String str, Boolean bool, String str2, Color color, Color color2, Integer num, Integer num2) {
        this.text = str;
        this.useIcon = bool;
        this.textPosition = str2;
        this.foregroundColor = color;
        this.backgroundColor = color2;
        this.fontSize = num;
        this.iconSize = num2;
    }

    public /* synthetic */ v(String str, Boolean bool, String str2, Color color, Color color2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : color, (i & 16) != 0 ? null : color2, (i & 32) != 0 ? null : num, (i & 64) == 0 ? num2 : null, null);
    }
}
