package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u0011\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0013¨\u0006!"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/t;", "", "", "color", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/t;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "(Ljava/lang/String;)Lcom/moloco/sdk/internal/ortb/model/t;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "c", "()V", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.t, reason: from toString */
/* loaded from: classes6.dex */
public final /* data */ class GradientColor {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int b = 0;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String color;

    @StabilityInferred
    @Deprecated
    /* renamed from: com.moloco.sdk.internal.ortb.model.t$a */
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.GradientColor", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("color", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GradientColor deserialize(@NotNull Decoder decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i = 1;
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(serialDescriptor, 0);
            } else {
                boolean z = true;
                int i2 = 0;
                str = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new GradientColor(i, str, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull GradientColor value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            GradientColor.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.t$b, reason: from kotlin metadata */
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

    public /* synthetic */ GradientColor(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, a.a.getDescriptor());
        }
        this.color = str;
    }

    public static /* synthetic */ void c() {
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String b() {
        return this.color;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GradientColor) && Intrinsics.areEqual(this.color, ((GradientColor) other).color);
    }

    public int hashCode() {
        return this.color.hashCode();
    }

    @NotNull
    public String toString() {
        return "GradientColor(color=" + this.color + ')';
    }

    public GradientColor(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.color = color;
    }

    @NotNull
    public final GradientColor a(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new GradientColor(color);
    }

    public static /* synthetic */ GradientColor a(GradientColor gradientColor, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gradientColor.color;
        }
        return gradientColor.a(str);
    }

    public static final /* synthetic */ void a(GradientColor self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.color);
    }
}
