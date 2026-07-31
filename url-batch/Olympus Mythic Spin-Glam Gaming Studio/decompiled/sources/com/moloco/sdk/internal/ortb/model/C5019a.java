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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0013\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/a;", "", "", "enabled", "", "url", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/a;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "()Z", "b", "()V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5019a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String url;

    @StabilityInferred
    @Deprecated
    /* renamed from: com.moloco.sdk.internal.ortb.model.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1537a implements GeneratedSerializer {

        @NotNull
        public static final C1537a a;
        public static final int b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1537a c1537a = new C1537a();
            a = c1537a;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.AndroidInline", c1537a, 2);
            pluginGeneratedSerialDescriptor.addElement("enabled", false);
            pluginGeneratedSerialDescriptor.addElement("url", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5019a deserialize(@NotNull Decoder decoder) {
            boolean z;
            String str;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                str = beginStructure.decodeStringElement(serialDescriptor, 1);
                i = 3;
            } else {
                boolean z2 = true;
                z = false;
                int i2 = 0;
                String str2 = null;
                while (z2) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z2 = false;
                    } else if (decodeElementIndex == 0) {
                        z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                    }
                }
                str = str2;
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new C5019a(i, z, str, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{BooleanSerializer.INSTANCE, StringSerializer.INSTANCE};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull C5019a value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            C5019a.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1537a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C5019a(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, C1537a.a.getDescriptor());
        }
        this.enabled = z;
        this.url = str;
    }

    public static final /* synthetic */ void a(C5019a self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
        output.encodeStringElement(serialDesc, 1, self.url);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public C5019a(boolean z, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.enabled = z;
        this.url = url;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }
}
