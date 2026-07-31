package com.monetization.ads.mediation.base.prefetch.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchRevenue;", "", "", "value", "<init>", "(D)V", "component1", "()D", "copy", "(D)Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchRevenue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getValue", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MediatedPrefetchRevenue {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final double value;

    public MediatedPrefetchRevenue(double d) {
        this.value = d;
    }

    public static /* synthetic */ MediatedPrefetchRevenue copy$default(MediatedPrefetchRevenue mediatedPrefetchRevenue, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = mediatedPrefetchRevenue.value;
        }
        return mediatedPrefetchRevenue.copy(d);
    }

    /* renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @NotNull
    public final MediatedPrefetchRevenue copy(double value) {
        return new MediatedPrefetchRevenue(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MediatedPrefetchRevenue) && Double.compare(this.value, ((MediatedPrefetchRevenue) other).value) == 0;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Double.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "MediatedPrefetchRevenue(value=" + this.value + ")";
    }
}
