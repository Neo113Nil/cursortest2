package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.NativeProtocol;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.DECAppIconSerializable;
import com.moloco.sdk.internal.ortb.model.DECAppNameSerializable;
import com.moloco.sdk.internal.ortb.model.DECCtaSerializable;
import com.moloco.sdk.internal.ortb.model.DECRatingSerializable;
import com.moloco.sdk.internal.ortb.model.r;
import io.bidmachine.protobuf.EventTypeExtended;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0001\u0018\u0000 >2\u00020\u0001:\u0002\u001e%Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010 \u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010 \u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010 \u0012\u0004\b-\u0010$\u001a\u0004\b,\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010.\u0012\u0004\b+\u0010$\u001a\u0004\b(\u0010/R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u00100\u0012\u0004\b3\u0010$\u001a\u0004\b1\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u00104\u0012\u0004\b7\u0010$\u001a\u0004\b5\u00106R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u00108\u0012\u0004\b;\u0010$\u001a\u0004\b9\u0010:R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010<\u0012\u0004\b%\u0010$\u001a\u0004\b\u001e\u0010=¨\u0006?"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/l;", "", "", "impressionTrackingUrl", "ctaUrl", "ctaTrackingUrl", "skipToDecTrackingUrl", "Lcom/moloco/sdk/internal/ortb/model/r;", "close", "Lcom/moloco/sdk/internal/ortb/model/p;", "decCta", "Lcom/moloco/sdk/internal/ortb/model/m;", "decAppIcon", "Lcom/moloco/sdk/internal/ortb/model/q;", "decRating", "Lcom/moloco/sdk/internal/ortb/model/n;", "appName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/r;Lcom/moloco/sdk/internal/ortb/model/p;Lcom/moloco/sdk/internal/ortb/model/m;Lcom/moloco/sdk/internal/ortb/model/q;Lcom/moloco/sdk/internal/ortb/model/n;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/r;Lcom/moloco/sdk/internal/ortb/model/p;Lcom/moloco/sdk/internal/ortb/model/m;Lcom/moloco/sdk/internal/ortb/model/q;Lcom/moloco/sdk/internal/ortb/model/n;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/l;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "p", "()V", "b", "g", "h", "c", EidRequestBuilder.REQUEST_FIELD_EMAIL, InneractiveMediationDefs.GENDER_FEMALE, "d", CampaignEx.JSON_KEY_AD_Q, "r", "Lcom/moloco/sdk/internal/ortb/model/r;", "()Lcom/moloco/sdk/internal/ortb/model/r;", "Lcom/moloco/sdk/internal/ortb/model/p;", CampaignEx.JSON_KEY_AD_K, "()Lcom/moloco/sdk/internal/ortb/model/p;", "l", "Lcom/moloco/sdk/internal/ortb/model/m;", "i", "()Lcom/moloco/sdk/internal/ortb/model/m;", com.mbridge.msdk.foundation.same.report.j.b, "Lcom/moloco/sdk/internal/ortb/model/q;", "m", "()Lcom/moloco/sdk/internal/ortb/model/q;", "n", "Lcom/moloco/sdk/internal/ortb/model/n;", "()Lcom/moloco/sdk/internal/ortb/model/n;", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int j = 8;

    /* renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String impressionTrackingUrl;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String ctaUrl;

    /* renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String ctaTrackingUrl;

    /* renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String skipToDecTrackingUrl;

    /* renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final r close;

    /* renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final DECCtaSerializable decCta;

    /* renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final DECAppIconSerializable decAppIcon;

    /* renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final DECRatingSerializable decRating;

    /* renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final DECAppNameSerializable appName;

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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DEC", aVar, 9);
            pluginGeneratedSerialDescriptor.addElement("imp_link", true);
            pluginGeneratedSerialDescriptor.addElement("click_through", true);
            pluginGeneratedSerialDescriptor.addElement("click_tracking", true);
            pluginGeneratedSerialDescriptor.addElement("skip_event", true);
            pluginGeneratedSerialDescriptor.addElement("close", true);
            pluginGeneratedSerialDescriptor.addElement("cta", true);
            pluginGeneratedSerialDescriptor.addElement("app_icon", true);
            pluginGeneratedSerialDescriptor.addElement("rating", true);
            pluginGeneratedSerialDescriptor.addElement(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l deserialize(@NotNull Decoder decoder) {
            int i;
            DECRatingSerializable dECRatingSerializable;
            DECAppNameSerializable dECAppNameSerializable;
            DECAppIconSerializable dECAppIconSerializable;
            DECCtaSerializable dECCtaSerializable;
            r rVar;
            String str;
            String str2;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i2 = 7;
            String str5 = null;
            if (beginStructure.decodeSequentially()) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
                String str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
                String str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                String str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
                r rVar2 = (r) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, r.a.a, null);
                DECCtaSerializable dECCtaSerializable2 = (DECCtaSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DECCtaSerializable.a.a, null);
                DECAppIconSerializable dECAppIconSerializable2 = (DECAppIconSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, DECAppIconSerializable.a.a, null);
                str4 = str9;
                dECRatingSerializable = (DECRatingSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, DECRatingSerializable.a.a, null);
                dECAppIconSerializable = dECAppIconSerializable2;
                dECCtaSerializable = dECCtaSerializable2;
                rVar = rVar2;
                dECAppNameSerializable = (DECAppNameSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, DECAppNameSerializable.a.a, null);
                i = 511;
                str3 = str8;
                str2 = str7;
                str = str6;
            } else {
                boolean z = true;
                int i3 = 0;
                DECRatingSerializable dECRatingSerializable2 = null;
                DECAppNameSerializable dECAppNameSerializable2 = null;
                DECAppIconSerializable dECAppIconSerializable3 = null;
                DECCtaSerializable dECCtaSerializable3 = null;
                r rVar3 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 7;
                        case 0:
                            str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str5);
                            i3 |= 1;
                            i2 = 7;
                        case 1:
                            str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str10);
                            i3 |= 2;
                            i2 = 7;
                        case 2:
                            str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str11);
                            i3 |= 4;
                            i2 = 7;
                        case 3:
                            str12 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                            i3 |= 8;
                            i2 = 7;
                        case 4:
                            rVar3 = (r) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, r.a.a, rVar3);
                            i3 |= 16;
                            i2 = 7;
                        case 5:
                            dECCtaSerializable3 = (DECCtaSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DECCtaSerializable.a.a, dECCtaSerializable3);
                            i3 |= 32;
                            i2 = 7;
                        case 6:
                            dECAppIconSerializable3 = (DECAppIconSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, DECAppIconSerializable.a.a, dECAppIconSerializable3);
                            i3 |= 64;
                        case 7:
                            dECRatingSerializable2 = (DECRatingSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, DECRatingSerializable.a.a, dECRatingSerializable2);
                            i3 |= 128;
                        case 8:
                            dECAppNameSerializable2 = (DECAppNameSerializable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, DECAppNameSerializable.a.a, dECAppNameSerializable2);
                            i3 |= 256;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i3;
                dECRatingSerializable = dECRatingSerializable2;
                dECAppNameSerializable = dECAppNameSerializable2;
                dECAppIconSerializable = dECAppIconSerializable3;
                dECCtaSerializable = dECCtaSerializable3;
                rVar = rVar3;
                str = str5;
                str2 = str10;
                str3 = str11;
                str4 = str12;
            }
            beginStructure.endStructure(serialDescriptor);
            return new l(i, str, str2, str3, str4, rVar, dECCtaSerializable, dECAppIconSerializable, dECRatingSerializable, dECAppNameSerializable, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public final KSerializer[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(r.a.a), BuiltinSerializersKt.getNullable(DECCtaSerializable.a.a), BuiltinSerializersKt.getNullable(DECAppIconSerializable.a.a), BuiltinSerializersKt.getNullable(DECRatingSerializable.a.a), BuiltinSerializersKt.getNullable(DECAppNameSerializable.a.a)};
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
        public final void serialize(@NotNull Encoder encoder, @NotNull l value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            l.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.l$b, reason: from kotlin metadata */
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

    public l() {
        this((String) null, (String) null, (String) null, (String) null, (r) null, (DECCtaSerializable) null, (DECAppIconSerializable) null, (DECRatingSerializable) null, (DECAppNameSerializable) null, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void a(l self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.impressionTrackingUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.impressionTrackingUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ctaUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.ctaUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.ctaTrackingUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.ctaTrackingUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.skipToDecTrackingUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.skipToDecTrackingUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.close != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, r.a.a, self.close);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.decCta != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, DECCtaSerializable.a.a, self.decCta);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.decAppIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DECAppIconSerializable.a.a, self.decAppIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.decRating != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, DECRatingSerializable.a.a, self.decRating);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.appName == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, DECAppNameSerializable.a.a, self.appName);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

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

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void r() {
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final r getClose() {
        return this.close;
    }

    @Nullable
    /* renamed from: e, reason: from getter */
    public final String getCtaTrackingUrl() {
        return this.ctaTrackingUrl;
    }

    @Nullable
    /* renamed from: g, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    @Nullable
    /* renamed from: i, reason: from getter */
    public final DECAppIconSerializable getDecAppIcon() {
        return this.decAppIcon;
    }

    @Nullable
    /* renamed from: k, reason: from getter */
    public final DECCtaSerializable getDecCta() {
        return this.decCta;
    }

    @Nullable
    /* renamed from: m, reason: from getter */
    public final DECRatingSerializable getDecRating() {
        return this.decRating;
    }

    @Nullable
    /* renamed from: o, reason: from getter */
    public final String getImpressionTrackingUrl() {
        return this.impressionTrackingUrl;
    }

    @Nullable
    /* renamed from: q, reason: from getter */
    public final String getSkipToDecTrackingUrl() {
        return this.skipToDecTrackingUrl;
    }

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, r rVar, DECCtaSerializable dECCtaSerializable, DECAppIconSerializable dECAppIconSerializable, DECRatingSerializable dECRatingSerializable, DECAppNameSerializable dECAppNameSerializable, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.impressionTrackingUrl = null;
        } else {
            this.impressionTrackingUrl = str;
        }
        if ((i & 2) == 0) {
            this.ctaUrl = null;
        } else {
            this.ctaUrl = str2;
        }
        if ((i & 4) == 0) {
            this.ctaTrackingUrl = null;
        } else {
            this.ctaTrackingUrl = str3;
        }
        if ((i & 8) == 0) {
            this.skipToDecTrackingUrl = null;
        } else {
            this.skipToDecTrackingUrl = str4;
        }
        if ((i & 16) == 0) {
            this.close = null;
        } else {
            this.close = rVar;
        }
        if ((i & 32) == 0) {
            this.decCta = null;
        } else {
            this.decCta = dECCtaSerializable;
        }
        if ((i & 64) == 0) {
            this.decAppIcon = null;
        } else {
            this.decAppIcon = dECAppIconSerializable;
        }
        if ((i & 128) == 0) {
            this.decRating = null;
        } else {
            this.decRating = dECRatingSerializable;
        }
        if ((i & 256) == 0) {
            this.appName = null;
        } else {
            this.appName = dECAppNameSerializable;
        }
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final DECAppNameSerializable getAppName() {
        return this.appName;
    }

    public l(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable r rVar, @Nullable DECCtaSerializable dECCtaSerializable, @Nullable DECAppIconSerializable dECAppIconSerializable, @Nullable DECRatingSerializable dECRatingSerializable, @Nullable DECAppNameSerializable dECAppNameSerializable) {
        this.impressionTrackingUrl = str;
        this.ctaUrl = str2;
        this.ctaTrackingUrl = str3;
        this.skipToDecTrackingUrl = str4;
        this.close = rVar;
        this.decCta = dECCtaSerializable;
        this.decAppIcon = dECAppIconSerializable;
        this.decRating = dECRatingSerializable;
        this.appName = dECAppNameSerializable;
    }

    public /* synthetic */ l(String str, String str2, String str3, String str4, r rVar, DECCtaSerializable dECCtaSerializable, DECAppIconSerializable dECAppIconSerializable, DECRatingSerializable dECRatingSerializable, DECAppNameSerializable dECAppNameSerializable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : rVar, (i & 32) != 0 ? null : dECCtaSerializable, (i & 64) != 0 ? null : dECAppIconSerializable, (i & 128) != 0 ? null : dECRatingSerializable, (i & 256) == 0 ? dECAppNameSerializable : null);
    }
}
