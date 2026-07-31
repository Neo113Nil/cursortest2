package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes10.dex */
public final class c extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BrokenCreativeAlgorithmParams algorithmParams) {
        super(algorithmParams);
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    private final float c(Bitmap bitmap) {
        float f;
        float f2;
        IntRange until = RangesKt.until(0, bitmap.getWidth());
        IntRange until2 = RangesKt.until(0, bitmap.getHeight());
        int count = CollectionsKt.count(until) * CollectionsKt.count(until2);
        int[] iArr = new int[bitmap.getWidth()];
        int first = until2.getFirst();
        int last = until2.getLast();
        if (first <= last) {
            int i = first;
            f = 0.0f;
            f2 = 0.0f;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i, bitmap.getWidth(), 1);
                int first2 = until.getFirst();
                int last2 = until.getLast();
                if (first2 <= last2) {
                    while (true) {
                        float a = a(iArr[first2]);
                        f += a;
                        f2 += a * a;
                        if (first2 == last2) {
                            break;
                        }
                        first2++;
                    }
                }
                if (i == last) {
                    break;
                }
                i++;
            }
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        float f3 = count;
        float f4 = f / f3;
        float f5 = (f2 / f3) - (f4 * f4);
        if (f5 < 0.0f) {
            return 0.0f;
        }
        return (float) Math.sqrt(f5);
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        float c = c(image);
        boolean z = c <= a().getThreshold();
        a(Float.valueOf(c), Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }
}
