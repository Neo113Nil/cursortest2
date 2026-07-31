package com.yandex.div.core.widget;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Collections.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u001a1\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0005H\u0080\b\u001a+\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0005H\u0080\b¨\u0006\r"}, d2 = {"iterate", "", "T", "", "action", "Lkotlin/Function1;", "update", "", "offset", "", "length", "indices", "Lkotlin/ranges/IntRange;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CollectionsKt {
    public static /* synthetic */ void update$default(int[] iArr, IntRange intRange, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            intRange = RangesKt.until(0, iArr.length);
        }
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            iArr[first] = ((Number) function1.invoke(Integer.valueOf(iArr[first]))).intValue();
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    public static final void update(@NotNull int[] iArr, @NotNull IntRange intRange, @NotNull Function1 function1) {
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            iArr[first] = ((Number) function1.invoke(Integer.valueOf(iArr[first]))).intValue();
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    public static final void update(@NotNull int[] iArr, int i, int i2, @NotNull Function1 function1) {
        int i3 = i2 + i;
        while (i < i3) {
            iArr[i] = ((Number) function1.invoke(Integer.valueOf(iArr[i]))).intValue();
            i++;
        }
    }

    public static final <T> void iterate(@NotNull List<? extends T> list, @NotNull Function1 function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }
}
