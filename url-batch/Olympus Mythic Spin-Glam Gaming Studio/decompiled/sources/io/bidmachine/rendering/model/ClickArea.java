package io.bidmachine.rendering.model;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\r¨\u0006#"}, d2 = {"Lio/bidmachine/rendering/model/ClickArea;", "", "Landroid/graphics/PointF;", "center", "spread", "", "seed", "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Ljava/lang/Long;)V", "component1", "()Landroid/graphics/PointF;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Ljava/lang/Long;)Lio/bidmachine/rendering/model/ClickArea;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/PointF;", "getCenter", "b", "getSpread", "c", "Ljava/lang/Long;", "getSeed", "Companion", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ClickArea {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final PointF d = new PointF(0.5f, 0.5f);
    private static final PointF e = new PointF(0.1f, 0.1f);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final PointF center;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final PointF spread;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final Long seed;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lio/bidmachine/rendering/model/ClickArea$Companion;", "", "()V", "DEFAULT_CENTER", "Landroid/graphics/PointF;", "getDEFAULT_CENTER$bidmachine_android_sdk_bb_3_7_1", "()Landroid/graphics/PointF;", "DEFAULT_SPREAD", "getDEFAULT_SPREAD$bidmachine_android_sdk_bb_3_7_1", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PointF getDEFAULT_CENTER$bidmachine_android_sdk_bb_3_7_1() {
            return ClickArea.d;
        }

        @NotNull
        public final PointF getDEFAULT_SPREAD$bidmachine_android_sdk_bb_3_7_1() {
            return ClickArea.e;
        }

        private Companion() {
        }
    }

    public ClickArea() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ClickArea copy$default(ClickArea clickArea, PointF pointF, PointF pointF2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            pointF = clickArea.center;
        }
        if ((i & 2) != 0) {
            pointF2 = clickArea.spread;
        }
        if ((i & 4) != 0) {
            l = clickArea.seed;
        }
        return clickArea.copy(pointF, pointF2, l);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PointF getCenter() {
        return this.center;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PointF getSpread() {
        return this.spread;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getSeed() {
        return this.seed;
    }

    @NotNull
    public final ClickArea copy(@NotNull PointF center, @NotNull PointF spread, @Nullable Long seed) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(spread, "spread");
        return new ClickArea(center, spread, seed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickArea)) {
            return false;
        }
        ClickArea clickArea = (ClickArea) other;
        return Intrinsics.areEqual(this.center, clickArea.center) && Intrinsics.areEqual(this.spread, clickArea.spread) && Intrinsics.areEqual(this.seed, clickArea.seed);
    }

    @NotNull
    public final PointF getCenter() {
        return this.center;
    }

    @Nullable
    public final Long getSeed() {
        return this.seed;
    }

    @NotNull
    public final PointF getSpread() {
        return this.spread;
    }

    public int hashCode() {
        int hashCode = ((this.center.hashCode() * 31) + this.spread.hashCode()) * 31;
        Long l = this.seed;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "ClickArea(center=" + this.center + ", spread=" + this.spread + ", seed=" + this.seed + ')';
    }

    public ClickArea(@NotNull PointF center, @NotNull PointF spread, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(spread, "spread");
        this.center = center;
        this.spread = spread;
        this.seed = l;
    }

    public /* synthetic */ ClickArea(PointF pointF, PointF pointF2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? d : pointF, (i & 2) != 0 ? e : pointF2, (i & 4) != 0 ? null : l);
    }
}
