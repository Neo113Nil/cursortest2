package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes10.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BrokenCreativeAlgorithmParams algorithmParams) {
        super(algorithmParams);
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    private final float c(Bitmap bitmap) {
        IntRange until = RangesKt.until(0, bitmap.getWidth());
        IntRange until2 = RangesKt.until(0, bitmap.getHeight());
        int count = CollectionsKt.count(until) * CollectionsKt.count(until2);
        int[] iArr = new int[bitmap.getWidth()];
        HashMap hashMap = new HashMap();
        int first = until2.getFirst();
        int last = until2.getLast();
        if (first <= last) {
            int i = first;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i, bitmap.getWidth(), 1);
                int first2 = until.getFirst();
                int last2 = until.getLast();
                if (first2 <= last2) {
                    while (true) {
                        int i2 = iArr[first2];
                        Integer valueOf = Integer.valueOf(i2);
                        Integer num = (Integer) hashMap.get(Integer.valueOf(i2));
                        hashMap.put(valueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
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
        }
        return (((Integer) CollectionsKt.maxOrNull((Iterable) hashMap.values())) != null ? r0.intValue() : 0) / count;
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        float threshold = a().getThreshold();
        float a = threshold > 0.5f ? a(image, threshold) : c(image);
        boolean z = a >= threshold;
        a(Float.valueOf(a), Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }

    private final float a(Bitmap bitmap, float f) {
        int i;
        int i2;
        int i3 = 0;
        IntRange until = RangesKt.until(0, bitmap.getWidth());
        IntRange until2 = RangesKt.until(0, bitmap.getHeight());
        int count = CollectionsKt.count(until) * CollectionsKt.count(until2);
        int[] iArr = new int[bitmap.getWidth()];
        int first = until2.getFirst();
        int last = until2.getLast();
        if (first <= last) {
            int i4 = 0;
            int i5 = 0;
            int i6 = first;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i6, bitmap.getWidth(), 1);
                int first2 = until.getFirst();
                int last2 = until.getLast();
                if (first2 <= last2) {
                    int i7 = i5;
                    while (true) {
                        int i8 = iArr[first2];
                        if (i4 == 0) {
                            i7 = i8;
                            i4 = 1;
                        } else {
                            i4 = i8 == i7 ? i4 + 1 : i4 - 1;
                        }
                        if (first2 == last2) {
                            break;
                        }
                        first2++;
                    }
                    i5 = i7;
                }
                if (i6 == last) {
                    break;
                }
                i6++;
            }
            i = i4;
            i2 = i5;
        } else {
            i = 0;
            i2 = 0;
        }
        float f2 = count;
        if (i < ((2 * f) - 1) * f2) {
            return 0.0f;
        }
        int first3 = until2.getFirst();
        int last3 = until2.getLast();
        if (first3 <= last3) {
            int i9 = first3;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i9, bitmap.getWidth(), 1);
                int first4 = until.getFirst();
                int last4 = until.getLast();
                if (first4 <= last4) {
                    while (true) {
                        if (iArr[first4] == i2) {
                            i3++;
                        }
                        if (first4 == last4) {
                            break;
                        }
                        first4++;
                    }
                }
                if (i9 == last3) {
                    break;
                }
                i9++;
            }
        }
        return i3 / f2;
    }
}
