package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0012\u0019B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u0012\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/s;", "", "", "serverRenderingIgnoreNetErrFailed", "composeRemovalEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/s;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "d", "()V", "b", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes11.dex */
public final class s {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 0;

    /* renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Boolean serverRenderingIgnoreNetErrFailed;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Boolean composeRemovalEnabled;

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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.ExperimentalConfigs", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("server_rendering_ignore_net_err_failed", true);
            pluginGeneratedSerialDescriptor.addElement("compose_removal_enabled", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s deserialize(@NotNull Decoder decoder) {
            Boolean bool;
            int i;
            Boolean bool2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
                bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
                bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                bool = null;
                Boolean bool3 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool3);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool);
                        i2 |= 2;
                    }
                }
                i = i2;
                bool2 = bool3;
            }
            beginStructure.endStructure(serialDescriptor);
            return new s(i, bool2, bool, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull s value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            s.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.s$b, reason: from kotlin metadata */
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
    public s() {
        this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void a(s self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.serverRenderingIgnoreNetErrFailed != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.serverRenderingIgnoreNetErrFailed);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.composeRemovalEnabled == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.composeRemovalEnabled);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final Boolean getServerRenderingIgnoreNetErrFailed() {
        return this.serverRenderingIgnoreNetErrFailed;
    }

    public /* synthetic */ s(int i, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serverRenderingIgnoreNetErrFailed = null;
        } else {
            this.serverRenderingIgnoreNetErrFailed = bool;
        }
        if ((i & 2) == 0) {
            this.composeRemovalEnabled = null;
        } else {
            this.composeRemovalEnabled = bool2;
        }
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final Boolean getComposeRemovalEnabled() {
        return this.composeRemovalEnabled;
    }

    public s(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.serverRenderingIgnoreNetErrFailed = bool;
        this.composeRemovalEnabled = bool2;
    }

    public /* synthetic */ s(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
