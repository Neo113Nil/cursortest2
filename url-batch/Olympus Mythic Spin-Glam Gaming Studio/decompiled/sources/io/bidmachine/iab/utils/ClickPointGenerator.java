package io.bidmachine.iab.utils;

import android.graphics.PointF;
import io.bidmachine.rendering.model.ClickArea;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lio/bidmachine/iab/utils/ClickPointGenerator;", "", "()V", "generate", "Landroid/graphics/PointF;", "clickArea", "Lio/bidmachine/rendering/model/ClickArea;", "distribution", "Lio/bidmachine/iab/utils/ClickPointGenerator$Distribution;", "Companion", "Distribution", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class ClickPointGenerator {

    @NotNull
    public static final PointF Default = new PointF(0.5f, 0.7f);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u0082\u0001\u0002\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/iab/utils/ClickPointGenerator$Distribution;", "", "calculate", "Landroid/graphics/PointF;", "random", "Ljava/util/Random;", "clickArea", "Lio/bidmachine/rendering/model/ClickArea;", "Legacy", "Uniform", "Lio/bidmachine/iab/utils/ClickPointGenerator$Distribution$Legacy;", "Lio/bidmachine/iab/utils/ClickPointGenerator$Distribution$Uniform;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Distribution {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/iab/utils/ClickPointGenerator$Distribution$Legacy;", "Lio/bidmachine/iab/utils/ClickPointGenerator$Distribution;", "<init>", "()V", "Ljava/util/Random;", "random", "", "sigma", "average", "a", "(Ljava/util/Random;FF)F", "Lio/bidmachine/rendering/model/ClickArea;", "clickArea", "Landroid/graphics/PointF;", "calculate", "(Ljava/util/Random;Lio/bidmachine/rendering/model/ClickArea;)Landroid/graphics/PointF;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Legacy implements Distribution {

            @NotNull
            public static final Legacy INSTANCE = new Legacy();

            private Legacy() {
            }

            private final float a(Random random, float sigma, float average) {
                double d;
                long j = 100000;
                double sqrt = Math.sqrt((-2) * Math.log(Math.abs(((random.nextLong() % j) + 1) / 100000.0d))) * Math.sin(Math.abs(((random.nextLong() % j) + 1) / 100000.0d) * 6.283185307179586d);
                if (0.4f > average || average > 0.6f) {
                    double d2 = average;
                    d = average < 0.4f ? d2 + (sigma / (sqrt * sqrt)) : d2 - (sigma / (sqrt * sqrt));
                } else {
                    d = (sqrt * sigma) + average;
                }
                return (float) RangesKt.coerceIn(d, 0.0d, 1.0d);
            }

            @Override // io.bidmachine.iab.utils.ClickPointGenerator.Distribution
            @NotNull
            public PointF calculate(@NotNull Random random, @NotNull ClickArea clickArea) {
                Intrinsics.checkNotNullParameter(random, "random");
                Intrinsics.checkNotNullParameter(clickArea, "clickArea");
                return new PointF(a(random, clickArea.getSpread().x, clickArea.getCenter().x), a(random, clickArea.getSpread().y, clickArea.getCenter().y));
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/iab/utils/ClickPointGenerator$Distribution$Uniform;", "Lio/bidmachine/iab/utils/ClickPointGenerator$Distribution;", "<init>", "()V", "Ljava/util/Random;", "random", "", "center", "spread", "a", "(Ljava/util/Random;FF)F", "Lio/bidmachine/rendering/model/ClickArea;", "clickArea", "Landroid/graphics/PointF;", "calculate", "(Ljava/util/Random;Lio/bidmachine/rendering/model/ClickArea;)Landroid/graphics/PointF;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Uniform implements Distribution {

            @NotNull
            public static final Uniform INSTANCE = new Uniform();

            private Uniform() {
            }

            private final float a(Random random, float center, float spread) {
                return (float) ((center - spread) + (random.nextDouble() * spread * 2));
            }

            @Override // io.bidmachine.iab.utils.ClickPointGenerator.Distribution
            @NotNull
            public PointF calculate(@NotNull Random random, @NotNull ClickArea clickArea) {
                Intrinsics.checkNotNullParameter(random, "random");
                Intrinsics.checkNotNullParameter(clickArea, "clickArea");
                return new PointF(a(random, clickArea.getCenter().x, clickArea.getSpread().x), a(random, clickArea.getCenter().y, clickArea.getSpread().y));
            }
        }

        @NotNull
        PointF calculate(@NotNull Random random, @NotNull ClickArea clickArea);
    }

    public static /* synthetic */ PointF generate$default(ClickPointGenerator clickPointGenerator, ClickArea clickArea, Distribution distribution, int i, Object obj) {
        if ((i & 2) != 0) {
            distribution = Distribution.Uniform.INSTANCE;
        }
        return clickPointGenerator.generate(clickArea, distribution);
    }

    @NotNull
    public final PointF generate(@NotNull ClickArea clickArea, @NotNull Distribution distribution) {
        Intrinsics.checkNotNullParameter(clickArea, "clickArea");
        Intrinsics.checkNotNullParameter(distribution, "distribution");
        Long seed = clickArea.getSeed();
        return distribution.calculate(seed != null ? new Random(seed.longValue()) : new Random(), clickArea);
    }
}
