package io.bidmachine.util.gradient;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GradientDrawable.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001aO\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0006\u0018\u00010\u0005\"\u0006\b\u0000\u0010\u0006\u0018\u0001*\u0004\u0018\u00010\u00072\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0006\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00060\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a3\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0016\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\u0002\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"isOpaque", "", "color", "", "mapToArray", "", "T", "", "baseArray", "transform", "Lkotlin/Function1;", "([I[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapToIntArray", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)[I", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class GradientDrawableKt {
    public static final boolean isOpaque(int i) {
        return ((i >> 24) & 255) == 255;
    }

    @NotNull
    public static final <T> int[] mapToIntArray(@NotNull T[] tArr, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int[] iArr = new int[tArr.length];
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            Integer num = (Integer) transform.invoke(tArr[i]);
            if (num != null) {
                iArr[i] = num.intValue();
            }
        }
        return iArr;
    }

    public static final /* synthetic */ <T> T[] mapToArray(int[] iArr, T[] tArr, Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (iArr == null) {
            return null;
        }
        if (tArr == null || tArr.length != iArr.length) {
            int length = iArr.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            tArr = (T[]) new Object[length];
        }
        int length2 = iArr.length;
        for (int i = 0; i < length2; i++) {
            tArr[i] = transform.invoke(Integer.valueOf(iArr[i]));
        }
        return tArr;
    }
}
