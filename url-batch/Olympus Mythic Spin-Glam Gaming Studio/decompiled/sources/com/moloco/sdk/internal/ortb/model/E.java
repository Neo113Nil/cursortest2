package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.AnalyticsEvents;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 $2\u00020\u0001:\u0002\u0015\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/E;", "", "Lkotlin/UInt;", VastAttributes.PADDING, "Lcom/moloco/sdk/internal/ortb/model/u;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/F;", "verticalAlignment", "<init>", "(ILcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/internal/ortb/model/F;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlin/UInt;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/internal/ortb/model/F;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/E;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", "d", "()I", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()V", "b", "Lcom/moloco/sdk/internal/ortb/model/u;", "()Lcom/moloco/sdk/internal/ortb/model/u;", "c", "Lcom/moloco/sdk/internal/ortb/model/F;", InneractiveMediationDefs.GENDER_FEMALE, "()Lcom/moloco/sdk/internal/ortb/model/F;", "g", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes4.dex */
public final class E {
    public static final int d = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public final int padding;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u horizontalAlignment;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final F verticalAlignment;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final KSerializer[] e = {null, u.INSTANCE.serializer(), F.INSTANCE.serializer()};

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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.VastPrivacyIcon", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement(VastAttributes.PADDING, false);
            pluginGeneratedSerialDescriptor.addElement(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT, false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E deserialize(@NotNull Decoder decoder) {
            int i;
            UInt uInt;
            u uVar;
            F f;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = E.e;
            UInt uInt2 = null;
            if (beginStructure.decodeSequentially()) {
                UInt uInt3 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, null);
                u uVar2 = (u) beginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
                f = (F) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
                uInt = uInt3;
                i = 7;
                uVar = uVar2;
            } else {
                boolean z = true;
                int i2 = 0;
                u uVar3 = null;
                F f2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        uInt2 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, uInt2);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        uVar3 = (u) beginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], uVar3);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        f2 = (F) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], f2);
                        i2 |= 4;
                    }
                }
                i = i2;
                uInt = uInt2;
                uVar = uVar3;
                f = f2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new E(i, uInt, uVar, f, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = E.e;
            return new KSerializer[]{UIntSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2]};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull E value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            E.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.E$b, reason: from kotlin metadata */
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

    public /* synthetic */ E(int i, u uVar, F f, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, uVar, f);
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final u getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: d, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final F getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ E(int i, UInt uInt, u uVar, F f, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, uInt, uVar, f, serializationConstructorMarker);
    }

    public static final /* synthetic */ void a(E self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = e;
        output.encodeSerializableElement(serialDesc, 0, UIntSerializer.INSTANCE, UInt.m8054boximpl(self.padding));
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.horizontalAlignment);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.verticalAlignment);
    }

    public /* synthetic */ E(int i, UInt uInt, u uVar, F f, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, a.a.getDescriptor());
        }
        this.padding = uInt.m8059unboximpl();
        this.horizontalAlignment = uVar;
        this.verticalAlignment = f;
    }

    public E(int i, u horizontalAlignment, F verticalAlignment) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.padding = i;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
    }
}
