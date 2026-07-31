package io.intercom.android.sdk.lightcompressor.utils;

import androidx.collection.SieveCacheKt;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* compiled from: NumbersUtils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\r"}, d2 = {"uInt32ToLong", "", "int32", "", "uInt32ToInt", "uInt32", "uInt64ToLong", "uInt64", "roundEven", "value", "generateWidthHeightValue", "", "factor", "intercom-sdk-lightcompressor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NumbersUtilsKt {
    private static final int roundEven(int i) {
        return (i + 1) & (-2);
    }

    public static final long uInt32ToLong(int i) {
        return i;
    }

    public static final int uInt32ToInt(long j) {
        if (j > SieveCacheKt.NodeLinkMask || j < 0) {
            throw new Exception("uInt32 value is too large");
        }
        return (int) j;
    }

    public static final long uInt64ToLong(long j) {
        if (j >= 0) {
            return j;
        }
        throw new Exception("uInt64 value is too large");
    }

    public static final int uInt32ToInt(int i) {
        if (i >= 0) {
            return i;
        }
        throw new Exception("uInt32 value is too large");
    }

    public static final int generateWidthHeightValue(double d, double d2) {
        return roundEven(MathKt.roundToInt((d * d2) / 16) * 16);
    }
}
