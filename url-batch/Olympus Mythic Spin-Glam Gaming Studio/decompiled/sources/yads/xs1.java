package yads;

import android.content.Context;
import android.os.StatFs;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public abstract class xs1 {
    public static long a(Context context, long j, long j2) {
        long j3;
        long coerceAtMost = RangesKt.coerceAtMost(j, j2);
        try {
            StatFs statFs = new StatFs(eh0.a(context, "").getAbsolutePath());
            j3 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException unused) {
            boolean z = ob1.a;
            j3 = coerceAtMost;
        }
        long j4 = 100;
        return RangesKt.coerceAtLeast(RangesKt.coerceAtMost((2 * j3) / j4, j2), RangesKt.coerceAtMost(coerceAtMost, (j3 * 50) / j4));
    }
}
