package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.util.ColorUtils;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes10.dex */
public final class e extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BrokenCreativeAlgorithmParams algorithmParams) {
        super(algorithmParams);
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap image) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(image, "image");
        Float a = a(image, a().getThreshold());
        if (a != null) {
            bool = Boolean.valueOf(a.floatValue() <= a().getThreshold());
        } else {
            bool = null;
        }
        a(a, bool);
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Float a(Bitmap bitmap, float f) {
        float f2;
        int i;
        float a;
        IntRange until = RangesKt.until(1, bitmap.getWidth() - 1);
        IntRange until2 = RangesKt.until(1, bitmap.getHeight() - 1);
        int count = CollectionsKt.count(until) * CollectionsKt.count(until2);
        if (count <= 0) {
            return null;
        }
        int[] iArr = new int[bitmap.getWidth()];
        float[] fArr = new float[bitmap.getWidth()];
        float f3 = count;
        float f4 = f * f3;
        int first = until2.getFirst();
        int last = until2.getLast();
        int i2 = 0;
        if (first <= last) {
            int i3 = 0;
            int i4 = first;
            while (true) {
                int i5 = i4;
                int i6 = last;
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i4, bitmap.getWidth(), 1);
                int first2 = until.getFirst();
                int last2 = until.getLast();
                if (first2 <= last2) {
                    Float f5 = null;
                    while (true) {
                        int b = b(iArr[first2]);
                        int a2 = a(bitmap, first2, i5 - 1);
                        int a3 = a(bitmap, first2, i5 + 1);
                        if (i5 == 1) {
                            f2 = a(b, a2);
                        } else {
                            f2 = fArr[first2];
                        }
                        fArr[first2] = a(b, a3);
                        if (f2 + r6 <= 0.2d) {
                            int a4 = a(bitmap, first2 - 1, i5);
                            int a5 = a(bitmap, first2 + 1, i5);
                            if (f5 != null) {
                                a = f5.floatValue();
                            } else {
                                a = a(b, a4);
                            }
                            Float valueOf = Float.valueOf(a(b, a5));
                            if (a + r4 <= 0.2d) {
                                f5 = valueOf;
                                i = i3;
                                if (i > f4) {
                                    if (first2 == last2) {
                                        i3 = i;
                                        break;
                                    }
                                    first2++;
                                    i3 = i;
                                } else {
                                    return Float.valueOf(1.0f);
                                }
                            } else {
                                f5 = valueOf;
                            }
                        }
                        i3++;
                        i = i3;
                        if (i > f4) {
                        }
                    }
                }
                if (i5 == i6) {
                    i2 = i3;
                    break;
                }
                i4 = i5 + 1;
                last = i6;
            }
        }
        return Float.valueOf(i2 / f3);
    }

    private final float a(int i, int i2) {
        float redToRatio = ColorUtils.redToRatio(i) - ColorUtils.redToRatio(i2);
        float greenToRatio = ColorUtils.greenToRatio(i) - ColorUtils.greenToRatio(i2);
        float blueToRatio = ColorUtils.blueToRatio(i) - ColorUtils.blueToRatio(i2);
        return (float) Math.sqrt((redToRatio * redToRatio) + (greenToRatio * greenToRatio) + (blueToRatio * blueToRatio));
    }
}
