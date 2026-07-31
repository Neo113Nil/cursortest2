package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002\u0012\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0014R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/n;", "", "", "text", "", "fontSize", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/n;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "()Ljava/lang/Integer;", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/moloco/sdk/internal/ortb/model/n;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", EidRequestBuilder.REQUEST_FIELD_EMAIL, InneractiveMediationDefs.GENDER_FEMALE, "()V", "Ljava/lang/Integer;", "c", "d", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.n, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class DECAppNameSerializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 0;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final String text;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer fontSize;

    @StabilityInferred
    @Deprecated
    /* renamed from: com.moloco.sdk.internal.ortb.model.n$a */
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECAppNameSerializable", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("text", true);
            pluginGeneratedSerialDescriptor.addElement(ViewHierarchyConstants.TEXT_SIZE, true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECAppNameSerializable deserialize(@NotNull Decoder decoder) {
            String str;
            Integer num;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
                num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                str = null;
                Integer num2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num2);
                        i2 |= 2;
                    }
                }
                num = num2;
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new DECAppNameSerializable(i, str, num, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull DECAppNameSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            DECAppNameSerializable.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.n$b, reason: from kotlin metadata */
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
    public DECAppNameSerializable() {
        this((String) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: b, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final Integer c() {
        return this.fontSize;
    }

    @Nullable
    public final String e() {
        return this.text;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECAppNameSerializable)) {
            return false;
        }
        DECAppNameSerializable dECAppNameSerializable = (DECAppNameSerializable) other;
        return Intrinsics.areEqual(this.text, dECAppNameSerializable.text) && Intrinsics.areEqual(this.fontSize, dECAppNameSerializable.fontSize);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.fontSize;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECAppNameSerializable(text=" + this.text + ", fontSize=" + this.fontSize + ')';
    }

    public /* synthetic */ DECAppNameSerializable(int i, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
    }

    @NotNull
    public final DECAppNameSerializable a(@Nullable String text, @Nullable Integer fontSize) {
        return new DECAppNameSerializable(text, fontSize);
    }

    public static /* synthetic */ DECAppNameSerializable a(DECAppNameSerializable dECAppNameSerializable, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dECAppNameSerializable.text;
        }
        if ((i & 2) != 0) {
            num = dECAppNameSerializable.fontSize;
        }
        return dECAppNameSerializable.a(str, num);
    }

    public static final /* synthetic */ void a(DECAppNameSerializable self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.text);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.fontSize == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.fontSize);
    }

    public DECAppNameSerializable(@Nullable String str, @Nullable Integer num) {
        this.text = str;
        this.fontSize = num;
    }

    public /* synthetic */ DECAppNameSerializable(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
