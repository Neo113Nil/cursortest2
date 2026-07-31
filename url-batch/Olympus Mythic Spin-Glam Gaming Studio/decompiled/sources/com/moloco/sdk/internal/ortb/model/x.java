package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.s;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0013\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/x;", "", "", "serverRenderingEnabled", "Lcom/moloco/sdk/internal/ortb/model/s;", "experimental", "<init>", "(Ljava/lang/Boolean;Lcom/moloco/sdk/internal/ortb/model/s;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/moloco/sdk/internal/ortb/model/s;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/x;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "d", "()V", "b", "Lcom/moloco/sdk/internal/ortb/model/s;", "()Lcom/moloco/sdk/internal/ortb/model/s;", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 0;

    /* renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Boolean serverRenderingEnabled;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final s experimental;

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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.MolocoSDKConfigs", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("server_rendering_enabled", true);
            pluginGeneratedSerialDescriptor.addElement("experimental", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x deserialize(@NotNull Decoder decoder) {
            Boolean bool;
            s sVar;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, null);
                sVar = (s) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s.a.a, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                bool = null;
                s sVar2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        sVar2 = (s) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s.a.a, sVar2);
                        i2 |= 2;
                    }
                }
                sVar = sVar2;
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new x(i, bool, sVar, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(s.a.a)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull x value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            x.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.x$b, reason: from kotlin metadata */
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
    public x() {
        this((Boolean) null, (s) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void a(x self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.serverRenderingEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.serverRenderingEnabled);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.experimental == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, s.a.a, self.experimental);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final Boolean getServerRenderingEnabled() {
        return this.serverRenderingEnabled;
    }

    public /* synthetic */ x(int i, Boolean bool, s sVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serverRenderingEnabled = null;
        } else {
            this.serverRenderingEnabled = bool;
        }
        if ((i & 2) == 0) {
            this.experimental = null;
        } else {
            this.experimental = sVar;
        }
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final s getExperimental() {
        return this.experimental;
    }

    public x(@Nullable Boolean bool, @Nullable s sVar) {
        this.serverRenderingEnabled = bool;
        this.experimental = sVar;
    }

    public /* synthetic */ x(Boolean bool, s sVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : sVar);
    }
}
