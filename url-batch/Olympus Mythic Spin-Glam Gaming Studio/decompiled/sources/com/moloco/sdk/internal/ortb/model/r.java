package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0011\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/r;", "", "Lkotlin/UInt;", "delaySeconds", "<init>", "(Lkotlin/UInt;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlin/UInt;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/r;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlin/UInt;", "()Lkotlin/UInt;", "b", "()V", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes15.dex */
public final class r {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int b = 0;

    /* renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final UInt delaySeconds;

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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECSkipClose", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("delay_seconds", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r deserialize(@NotNull Decoder decoder) {
            UInt uInt;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i = 1;
            SerializationConstructorMarker serializationConstructorMarker = null;
            Object[] objArr = 0;
            if (beginStructure.decodeSequentially()) {
                uInt = (UInt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, null);
            } else {
                Object[] objArr2 = true;
                int i2 = 0;
                uInt = null;
                while (objArr2 != false) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        objArr2 = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        uInt = (UInt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, uInt);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new r(i, uInt, serializationConstructorMarker, objArr == true ? 1 : 0);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(UIntSerializer.INSTANCE)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull r value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            r.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.r$b, reason: from kotlin metadata */
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

    public /* synthetic */ r(int i, UInt uInt, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, uInt, serializationConstructorMarker);
    }

    public static final /* synthetic */ void a(r self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.delaySeconds == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, UIntSerializer.INSTANCE, self.delaySeconds);
    }

    public static /* synthetic */ void b() {
    }

    public /* synthetic */ r(UInt uInt, DefaultConstructorMarker defaultConstructorMarker) {
        this(uInt);
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final UInt getDelaySeconds() {
        return this.delaySeconds;
    }

    public /* synthetic */ r(int i, UInt uInt, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.delaySeconds = null;
        } else {
            this.delaySeconds = uInt;
        }
    }

    public r(UInt uInt) {
        this.delaySeconds = uInt;
    }

    public /* synthetic */ r(UInt uInt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uInt, null);
    }
}
