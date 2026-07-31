package io.bidmachine.rendering.model;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0003\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001e¨\u0006/"}, d2 = {"Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "", "", "isBroken", "", "adPhaseSequence", "", "adElementName", "", "durationMs", "", "Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmResult;", "algorithmResults", "<init>", "(DILjava/lang/String;JLjava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "component1", "()D", "component2", "component3", "component4", "()J", "component5", "()Ljava/util/List;", "copy", "(DILjava/lang/String;JLjava/util/List;)Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "a", "D", "b", "I", "getAdPhaseSequence", "c", "Ljava/lang/String;", "getAdElementName", "d", "J", "getDurationMs", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/List;", "getAlgorithmResults", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BrokenCreativeEvent {

    /* renamed from: a, reason: from kotlin metadata */
    private final double isBroken;

    /* renamed from: b, reason: from kotlin metadata */
    private final int adPhaseSequence;

    /* renamed from: c, reason: from kotlin metadata */
    private final String adElementName;

    /* renamed from: d, reason: from kotlin metadata */
    private final long durationMs;

    /* renamed from: e, reason: from kotlin metadata */
    private final List algorithmResults;

    public BrokenCreativeEvent(double d, int i, @NotNull String adElementName, long j, @NotNull List<BrokenCreativeAlgorithmResult> algorithmResults) {
        Intrinsics.checkNotNullParameter(adElementName, "adElementName");
        Intrinsics.checkNotNullParameter(algorithmResults, "algorithmResults");
        this.isBroken = d;
        this.adPhaseSequence = i;
        this.adElementName = adElementName;
        this.durationMs = j;
        this.algorithmResults = algorithmResults;
    }

    /* renamed from: component1, reason: from getter */
    public final double getIsBroken() {
        return this.isBroken;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAdPhaseSequence() {
        return this.adPhaseSequence;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAdElementName() {
        return this.adElementName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    @NotNull
    public final List<BrokenCreativeAlgorithmResult> component5() {
        return this.algorithmResults;
    }

    @NotNull
    public final BrokenCreativeEvent copy(double isBroken, int adPhaseSequence, @NotNull String adElementName, long durationMs, @NotNull List<BrokenCreativeAlgorithmResult> algorithmResults) {
        Intrinsics.checkNotNullParameter(adElementName, "adElementName");
        Intrinsics.checkNotNullParameter(algorithmResults, "algorithmResults");
        return new BrokenCreativeEvent(isBroken, adPhaseSequence, adElementName, durationMs, algorithmResults);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BrokenCreativeEvent.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type io.bidmachine.rendering.model.BrokenCreativeEvent");
        BrokenCreativeEvent brokenCreativeEvent = (BrokenCreativeEvent) other;
        return this.isBroken == brokenCreativeEvent.isBroken && this.adPhaseSequence == brokenCreativeEvent.adPhaseSequence && Intrinsics.areEqual(this.adElementName, brokenCreativeEvent.adElementName);
    }

    @NotNull
    public final String getAdElementName() {
        return this.adElementName;
    }

    public final int getAdPhaseSequence() {
        return this.adPhaseSequence;
    }

    @NotNull
    public final List<BrokenCreativeAlgorithmResult> getAlgorithmResults() {
        return this.algorithmResults;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public int hashCode() {
        return (((Double.hashCode(this.isBroken) * 31) + this.adPhaseSequence) * 31) + this.adElementName.hashCode();
    }

    public final double isBroken() {
        return this.isBroken;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("isBroken - ");
        sb.append(this.isBroken);
        sb.append(" (");
        sb.append(this.isBroken == 1.0d);
        sb.append("), adPhaseSequence - ");
        sb.append(this.adPhaseSequence);
        sb.append(", adElementName - ");
        sb.append(this.adElementName);
        sb.append(", durationMs - ");
        sb.append(this.durationMs);
        return sb.toString();
    }
}
