package com.moloco.sdk.internal.ilrd;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.services.I;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class a {

    @NotNull
    public static final C1528a g = new C1528a(null);
    public static final int h = 8;

    @NotNull
    public static final String i = "IlrdActiveSession";

    @NotNull
    public final I a;

    @Nullable
    public final SessionData b;

    @NotNull
    public final Lazy c;
    public final long d;

    @NotNull
    public final AtomicReference<ImpressionCounts> e;
    public boolean f;

    /* renamed from: com.moloco.sdk.internal.ilrd.a$a, reason: collision with other inner class name */
    public static final class C1528a {
        public /* synthetic */ C1528a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1528a() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u0016\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u001fJ\u0010\u0010!\u001a\u00020 H×\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b/\u0010\u001a¨\u00061"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/a$b;", "", "", "lastEventReceivedTs", "", "banner", "mrec", "native", "interstitial", "rewarded", "<init>", "(JIIIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ilrd/a$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()J", "b", "()I", "c", "d", EidRequestBuilder.REQUEST_FIELD_EMAIL, InneractiveMediationDefs.GENDER_FEMALE, "(JIIIII)Lcom/moloco/sdk/internal/ilrd/a$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "i", "I", "g", j.b, CampaignEx.JSON_KEY_AD_K, "h", "l", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
    @Serializable
    /* renamed from: com.moloco.sdk.internal.ilrd.a$b, reason: from toString */
    public static final /* data */ class ImpressionCounts {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int g = 0;

        /* renamed from: a, reason: from kotlin metadata and from toString */
        public final long lastEventReceivedTs;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final int banner;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        public final int mrec;

        /* renamed from: d, reason: from kotlin metadata */
        public final int native;

        /* renamed from: e, reason: from kotlin metadata and from toString */
        public final int interstitial;

        /* renamed from: f, reason: from kotlin metadata and from toString */
        public final int rewarded;

        @StabilityInferred
        @Deprecated
        /* renamed from: com.moloco.sdk.internal.ilrd.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C1529a implements GeneratedSerializer {

            @NotNull
            public static final C1529a a;
            public static final int b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1529a c1529a = new C1529a();
                a = c1529a;
                b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", c1529a, 6);
                pluginGeneratedSerialDescriptor.addElement("lastEventReceivedTs", false);
                pluginGeneratedSerialDescriptor.addElement("banner", false);
                pluginGeneratedSerialDescriptor.addElement("mrec", false);
                pluginGeneratedSerialDescriptor.addElement("native", false);
                pluginGeneratedSerialDescriptor.addElement("interstitial", false);
                pluginGeneratedSerialDescriptor.addElement("rewarded", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImpressionCounts deserialize(@NotNull Decoder decoder) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                long j;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    long decodeLongElement = beginStructure.decodeLongElement(serialDescriptor, 0);
                    int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 1);
                    int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 2);
                    int decodeIntElement3 = beginStructure.decodeIntElement(serialDescriptor, 3);
                    int decodeIntElement4 = beginStructure.decodeIntElement(serialDescriptor, 4);
                    i = decodeIntElement;
                    i2 = beginStructure.decodeIntElement(serialDescriptor, 5);
                    i3 = decodeIntElement3;
                    i4 = decodeIntElement4;
                    i5 = decodeIntElement2;
                    i6 = 63;
                    j = decodeLongElement;
                } else {
                    boolean z = true;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    long j2 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                        switch (decodeElementIndex) {
                            case -1:
                                z = false;
                                continue;
                            case 0:
                                j2 = beginStructure.decodeLongElement(serialDescriptor, 0);
                                i10 |= 1;
                                continue;
                            case 1:
                                i7 = beginStructure.decodeIntElement(serialDescriptor, 1);
                                i10 |= 2;
                                break;
                            case 2:
                                i9 = beginStructure.decodeIntElement(serialDescriptor, 2);
                                i10 |= 4;
                                break;
                            case 3:
                                i12 = beginStructure.decodeIntElement(serialDescriptor, 3);
                                i10 |= 8;
                                break;
                            case 4:
                                i8 = beginStructure.decodeIntElement(serialDescriptor, 4);
                                i10 |= 16;
                                break;
                            case 5:
                                i11 = beginStructure.decodeIntElement(serialDescriptor, 5);
                                i10 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i = i7;
                    i2 = i11;
                    i3 = i12;
                    i4 = i8;
                    i5 = i9;
                    i6 = i10;
                    j = j2;
                }
                beginStructure.endStructure(serialDescriptor);
                return new ImpressionCounts(i6, j, i, i5, i3, i4, i2, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public final KSerializer[] childSerializers() {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{LongSerializer.INSTANCE, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
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
            public final void serialize(@NotNull Encoder encoder, @NotNull ImpressionCounts value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
                ImpressionCounts.a(value, beginStructure, serialDescriptor);
                beginStructure.endStructure(serialDescriptor);
            }
        }

        /* renamed from: com.moloco.sdk.internal.ilrd.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1529a.a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ImpressionCounts(int i, long j, int i2, int i3, int i4, int i5, int i6, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                PluginExceptionsKt.throwMissingFieldException(i, 63, C1529a.a.getDescriptor());
            }
            this.lastEventReceivedTs = j;
            this.banner = i2;
            this.mrec = i3;
            this.native = i4;
            this.interstitial = i5;
            this.rewarded = i6;
        }

        /* renamed from: a, reason: from getter */
        public final long getLastEventReceivedTs() {
            return this.lastEventReceivedTs;
        }

        /* renamed from: b, reason: from getter */
        public final int getBanner() {
            return this.banner;
        }

        /* renamed from: c, reason: from getter */
        public final int getMrec() {
            return this.mrec;
        }

        /* renamed from: d, reason: from getter */
        public final int getNative() {
            return this.native;
        }

        /* renamed from: e, reason: from getter */
        public final int getInterstitial() {
            return this.interstitial;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImpressionCounts)) {
                return false;
            }
            ImpressionCounts impressionCounts = (ImpressionCounts) other;
            return this.lastEventReceivedTs == impressionCounts.lastEventReceivedTs && this.banner == impressionCounts.banner && this.mrec == impressionCounts.mrec && this.native == impressionCounts.native && this.interstitial == impressionCounts.interstitial && this.rewarded == impressionCounts.rewarded;
        }

        /* renamed from: f, reason: from getter */
        public final int getRewarded() {
            return this.rewarded;
        }

        public final int g() {
            return this.banner;
        }

        public final int h() {
            return this.interstitial;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.lastEventReceivedTs) * 31) + Integer.hashCode(this.banner)) * 31) + Integer.hashCode(this.mrec)) * 31) + Integer.hashCode(this.native)) * 31) + Integer.hashCode(this.interstitial)) * 31) + Integer.hashCode(this.rewarded);
        }

        public final long i() {
            return this.lastEventReceivedTs;
        }

        public final int j() {
            return this.mrec;
        }

        public final int k() {
            return this.native;
        }

        public final int l() {
            return this.rewarded;
        }

        @NotNull
        public String toString() {
            return "ImpressionCounts(lastEventReceivedTs=" + this.lastEventReceivedTs + ", banner=" + this.banner + ", mrec=" + this.mrec + ", native=" + this.native + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ')';
        }

        public ImpressionCounts(long j, int i, int i2, int i3, int i4, int i5) {
            this.lastEventReceivedTs = j;
            this.banner = i;
            this.mrec = i2;
            this.native = i3;
            this.interstitial = i4;
            this.rewarded = i5;
        }

        @NotNull
        public final ImpressionCounts a(long lastEventReceivedTs, int banner, int mrec, int r14, int interstitial, int rewarded) {
            return new ImpressionCounts(lastEventReceivedTs, banner, mrec, r14, interstitial, rewarded);
        }

        public static /* synthetic */ ImpressionCounts a(ImpressionCounts impressionCounts, long j, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            return impressionCounts.a((i6 & 1) != 0 ? impressionCounts.lastEventReceivedTs : j, (i6 & 2) != 0 ? impressionCounts.banner : i, (i6 & 4) != 0 ? impressionCounts.mrec : i2, (i6 & 8) != 0 ? impressionCounts.native : i3, (i6 & 16) != 0 ? impressionCounts.interstitial : i4, (i6 & 32) != 0 ? impressionCounts.rewarded : i5);
        }

        public static final /* synthetic */ void a(ImpressionCounts self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeLongElement(serialDesc, 0, self.lastEventReceivedTs);
            output.encodeIntElement(serialDesc, 1, self.banner);
            output.encodeIntElement(serialDesc, 2, self.mrec);
            output.encodeIntElement(serialDesc, 3, self.native);
            output.encodeIntElement(serialDesc, 4, self.interstitial);
            output.encodeIntElement(serialDesc, 5, self.rewarded);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0017\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0017\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\fH×\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010\u001f¨\u00060"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/a$c;", "", "", "sessionId", "Lcom/moloco/sdk/internal/ilrd/a$b;", "impressionCounts", "", "isExpired", "", "sessionStartTs", "<init>", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ilrd/a$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "()Lcom/moloco/sdk/internal/ilrd/a$b;", "c", "()Z", "d", "()J", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJ)Lcom/moloco/sdk/internal/ilrd/a$c;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/moloco/sdk/internal/ilrd/a$b;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Z", "h", "J", "g", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
    @Serializable
    @VisibleForTesting
    /* renamed from: com.moloco.sdk.internal.ilrd.a$c, reason: from toString */
    public static final /* data */ class SessionData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int e = 0;

        /* renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final ImpressionCounts impressionCounts;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        public final boolean isExpired;

        /* renamed from: d, reason: from kotlin metadata and from toString */
        public final long sessionStartTs;

        @StabilityInferred
        @Deprecated
        /* renamed from: com.moloco.sdk.internal.ilrd.a$c$a, reason: collision with other inner class name */
        public /* synthetic */ class C1531a implements GeneratedSerializer {

            @NotNull
            public static final C1531a a;
            public static final int b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1531a c1531a = new C1531a();
                a = c1531a;
                b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", c1531a, 4);
                pluginGeneratedSerialDescriptor.addElement("sessionId", false);
                pluginGeneratedSerialDescriptor.addElement("impressionCounts", false);
                pluginGeneratedSerialDescriptor.addElement("isExpired", false);
                pluginGeneratedSerialDescriptor.addElement("sessionStartTs", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SessionData deserialize(@NotNull Decoder decoder) {
                int i;
                boolean z;
                long j;
                String str;
                ImpressionCounts impressionCounts;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
                    ImpressionCounts impressionCounts2 = (ImpressionCounts) beginStructure.decodeSerializableElement(serialDescriptor, 1, ImpressionCounts.C1529a.a, null);
                    str = decodeStringElement;
                    i = 15;
                    z = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    impressionCounts = impressionCounts2;
                    j = beginStructure.decodeLongElement(serialDescriptor, 3);
                } else {
                    long j2 = 0;
                    boolean z2 = true;
                    int i2 = 0;
                    String str2 = null;
                    ImpressionCounts impressionCounts3 = null;
                    boolean z3 = false;
                    while (z2) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                        if (decodeElementIndex == -1) {
                            z2 = false;
                        } else if (decodeElementIndex == 0) {
                            str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                            i2 |= 1;
                        } else if (decodeElementIndex == 1) {
                            impressionCounts3 = (ImpressionCounts) beginStructure.decodeSerializableElement(serialDescriptor, 1, ImpressionCounts.C1529a.a, impressionCounts3);
                            i2 |= 2;
                        } else if (decodeElementIndex == 2) {
                            z3 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                            i2 |= 4;
                        } else {
                            if (decodeElementIndex != 3) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            j2 = beginStructure.decodeLongElement(serialDescriptor, 3);
                            i2 |= 8;
                        }
                    }
                    i = i2;
                    z = z3;
                    j = j2;
                    str = str2;
                    impressionCounts = impressionCounts3;
                }
                beginStructure.endStructure(serialDescriptor);
                return new SessionData(i, str, impressionCounts, z, j, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{StringSerializer.INSTANCE, ImpressionCounts.C1529a.a, BooleanSerializer.INSTANCE, LongSerializer.INSTANCE};
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
            public final void serialize(@NotNull Encoder encoder, @NotNull SessionData value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
                SessionData.a(value, beginStructure, serialDescriptor);
                beginStructure.endStructure(serialDescriptor);
            }
        }

        /* renamed from: com.moloco.sdk.internal.ilrd.a$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1531a.a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ SessionData(int i, String str, ImpressionCounts impressionCounts, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, C1531a.a.getDescriptor());
            }
            this.sessionId = str;
            this.impressionCounts = impressionCounts;
            this.isExpired = z;
            this.sessionStartTs = j;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final ImpressionCounts getImpressionCounts() {
            return this.impressionCounts;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsExpired() {
            return this.isExpired;
        }

        /* renamed from: d, reason: from getter */
        public final long getSessionStartTs() {
            return this.sessionStartTs;
        }

        @NotNull
        public final ImpressionCounts e() {
            return this.impressionCounts;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionData)) {
                return false;
            }
            SessionData sessionData = (SessionData) other;
            return Intrinsics.areEqual(this.sessionId, sessionData.sessionId) && Intrinsics.areEqual(this.impressionCounts, sessionData.impressionCounts) && this.isExpired == sessionData.isExpired && this.sessionStartTs == sessionData.sessionStartTs;
        }

        @NotNull
        public final String f() {
            return this.sessionId;
        }

        public final long g() {
            return this.sessionStartTs;
        }

        public final boolean h() {
            return this.isExpired;
        }

        public int hashCode() {
            return (((((this.sessionId.hashCode() * 31) + this.impressionCounts.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31) + Long.hashCode(this.sessionStartTs);
        }

        @NotNull
        public String toString() {
            return "SessionData(sessionId=" + this.sessionId + ", impressionCounts=" + this.impressionCounts + ", isExpired=" + this.isExpired + ", sessionStartTs=" + this.sessionStartTs + ')';
        }

        public SessionData(@NotNull String sessionId, @NotNull ImpressionCounts impressionCounts, boolean z, long j) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(impressionCounts, "impressionCounts");
            this.sessionId = sessionId;
            this.impressionCounts = impressionCounts;
            this.isExpired = z;
            this.sessionStartTs = j;
        }

        @NotNull
        public final SessionData a(@NotNull String sessionId, @NotNull ImpressionCounts impressionCounts, boolean isExpired, long sessionStartTs) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(impressionCounts, "impressionCounts");
            return new SessionData(sessionId, impressionCounts, isExpired, sessionStartTs);
        }

        public static /* synthetic */ SessionData a(SessionData sessionData, String str, ImpressionCounts impressionCounts, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionData.sessionId;
            }
            if ((i & 2) != 0) {
                impressionCounts = sessionData.impressionCounts;
            }
            ImpressionCounts impressionCounts2 = impressionCounts;
            if ((i & 4) != 0) {
                z = sessionData.isExpired;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                j = sessionData.sessionStartTs;
            }
            return sessionData.a(str, impressionCounts2, z2, j);
        }

        public static final /* synthetic */ void a(SessionData self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.sessionId);
            output.encodeSerializableElement(serialDesc, 1, ImpressionCounts.C1529a.a, self.impressionCounts);
            output.encodeBooleanElement(serialDesc, 2, self.isExpired);
            output.encodeLongElement(serialDesc, 3, self.sessionStartTs);
        }
    }

    public a(@NotNull I timeProvider, @Nullable String str) {
        ImpressionCounts e;
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.a = timeProvider;
        SessionData sessionData = null;
        if (str != null) {
            try {
                Json.Default r0 = Json.Default;
                r0.getSerializersModule();
                sessionData = (SessionData) r0.decodeFromString(SessionData.INSTANCE.serializer(), str);
            } catch (Exception e2) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Error deserializing session data", e2, false, 8, null);
            }
        }
        this.b = sessionData;
        this.c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.a(a.this);
            }
        });
        this.d = sessionData != null ? sessionData.g() : this.a.a();
        this.e = new AtomicReference<>((sessionData == null || (e = sessionData.e()) == null) ? new ImpressionCounts(-1L, 0, 0, 0, 0, 0) : e);
        this.f = sessionData != null ? sessionData.h() : false;
    }

    public static final String a(a aVar) {
        String f;
        SessionData sessionData = aVar.b;
        if (sessionData != null && (f = sessionData.f()) != null) {
            return f;
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }

    @NotNull
    public final ImpressionCounts b() {
        ImpressionCounts impressionCounts = this.e.get();
        Intrinsics.checkNotNullExpressionValue(impressionCounts, "get(...)");
        return impressionCounts;
    }

    @NotNull
    public final String c() {
        return (String) this.c.getValue();
    }

    public final long d() {
        return this.d;
    }

    public final boolean e() {
        return this.f;
    }

    @NotNull
    public final String f() {
        return Json.Default.encodeToString(SessionData.INSTANCE.serializer(), new SessionData(c(), b(), e(), this.d));
    }

    @NotNull
    public String toString() {
        ImpressionCounts b = b();
        return "IlrdActiveSession(id=" + c() + ", startTs=" + this.d + ", expired=" + e() + ", impressions=" + (b.g() + b.j() + b.k() + b.h() + b.l()) + " [banner=" + b.g() + ", mrec=" + b.j() + ", native=" + b.k() + ", interstitial=" + b.h() + ", rewarded=" + b.l() + "])";
    }

    public final void a(@NotNull c.a ilrdData) {
        Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        if (ilrdData instanceof c.a.b) {
            String adFormat = ((c.a.b) ilrdData).b().getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "getAdFormat(...)");
            String upperCase = adFormat.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            a(upperCase, "Applovin");
            return;
        }
        if (!(ilrdData instanceof c.a.C1532a)) {
            throw new NoWhenBranchMatchedException();
        }
        String adFormat2 = ((c.a.C1532a) ilrdData).b().getAdFormat();
        Intrinsics.checkNotNullExpressionValue(adFormat2, "getAdFormat(...)");
        String upperCase2 = adFormat2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        a(upperCase2, "Ironsource");
    }

    public final boolean a(String str, String str2) {
        ImpressionCounts a;
        long a2 = this.a.a();
        ImpressionCounts impressionCounts = this.e.get();
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "BANNER", false, 2, (Object) null)) {
            a = ImpressionCounts.a(impressionCounts, a2, impressionCounts.g() + 1, 0, 0, 0, 0, 60, null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) BrandSafetyUtils.o, false, 2, (Object) null)) {
            a = ImpressionCounts.a(impressionCounts, a2, 0, impressionCounts.j() + 1, 0, 0, 0, 58, null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "NATIVE", false, 2, (Object) null)) {
            a = ImpressionCounts.a(impressionCounts, a2, 0, 0, impressionCounts.k() + 1, 0, 0, 54, null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) BrandSafetyUtils.j, false, 2, (Object) null)) {
            a = ImpressionCounts.a(impressionCounts, a2, 0, 0, 0, impressionCounts.h() + 1, 0, 46, null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "REWARD", false, 2, (Object) null)) {
            a = ImpressionCounts.a(impressionCounts, a2, 0, 0, 0, 0, impressionCounts.l() + 1, 30, null);
        } else {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, i, "Unknown ad format for " + str2 + ": " + str, null, false, 12, null);
            return false;
        }
        this.e.set(a);
        return true;
    }

    public final void a() {
        this.f = true;
    }

    public /* synthetic */ a(I i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : str);
    }
}
