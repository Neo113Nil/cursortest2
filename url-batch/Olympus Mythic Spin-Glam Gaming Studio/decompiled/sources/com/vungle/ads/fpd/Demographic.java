package com.vungle.ads.fpd;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0007¢\u0006\u0004\b\u0015\u0010\u0016B3\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0007¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/fpd/Demographic;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/vungle/ads/fpd/LiftoffGender;", "gender", "setGender", "", "age", "setAgeRange", "lengthOfResidence", "setLengthOfResidence", "homeValue", "setMedianHomeValueUSD", "housingCost", "setMonthlyHousingCosts", "<init>", "()V", "seen1", "ageRange", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@Serializable
/* loaded from: classes8.dex */
public final class Demographic {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public Integer a;
    public Integer b;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/fpd/Demographic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Demographic;", "serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Demographic$$serializer.INSTANCE;
        }
    }

    public Demographic() {
    }

    public static final void write$Self(@NotNull Demographic self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.b);
    }

    @NotNull
    public final Demographic setAgeRange(int age) {
        this.a = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    @NotNull
    public final Demographic setGender(@NotNull LiftoffGender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.b = Integer.valueOf(gender.getValue());
        return this;
    }

    @Deprecated
    @NotNull
    public final Demographic setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    @Deprecated
    @NotNull
    public final Demographic setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    @Deprecated
    @NotNull
    public final Demographic setMonthlyHousingCosts(int housingCost) {
        return this;
    }

    @Deprecated
    public /* synthetic */ Demographic(int i, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }
}
