package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b {
    public static final b a = new b();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokenCreativeAlgorithmType.values().length];
            try {
                iArr[BrokenCreativeAlgorithmType.ColorHistogram.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokenCreativeAlgorithmType.BrightnessVariance.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokenCreativeAlgorithmType.EdgeDetection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private b() {
    }

    public final io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a a(BrokenCreativeAlgorithmParams algorithmParams) {
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
        int i = a.$EnumSwitchMapping$0[algorithmParams.getType().ordinal()];
        if (i == 1) {
            return new d(algorithmParams);
        }
        if (i == 2) {
            return new c(algorithmParams);
        }
        if (i == 3) {
            return new e(algorithmParams);
        }
        throw new NoWhenBranchMatchedException();
    }
}
