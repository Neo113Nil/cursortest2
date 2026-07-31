package com.ogury.ad.internal;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class vi {
    public vi(wi rectHelper) {
        Intrinsics.checkNotNullParameter(rectHelper, "rectHelper");
    }

    public final ArrayList a(List viewsAfterOverlay, Rect webViewOnScreenRect) {
        Intrinsics.checkNotNullParameter(viewsAfterOverlay, "viewsAfterOverlay");
        Intrinsics.checkNotNullParameter(webViewOnScreenRect, "webViewOnScreenRect");
        ArrayList arrayList = new ArrayList();
        Iterator it = viewsAfterOverlay.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.getVisibility() == 0) {
                Rect a = wi.a(view);
                Rect rect = new Rect(webViewOnScreenRect);
                if (rect.intersect(a)) {
                    arrayList.add(rect);
                }
            }
        }
        return arrayList;
    }

    public static int a(Rect webViewRect, ArrayList rectangles) {
        int i;
        Intrinsics.checkNotNullParameter(webViewRect, "webViewRect");
        Intrinsics.checkNotNullParameter(rectangles, "overlappingRects");
        if (rectangles.isEmpty()) {
            return 0;
        }
        Intrinsics.checkNotNullParameter(webViewRect, "<this>");
        Intrinsics.checkNotNullParameter(rectangles, "rectangles");
        if (rectangles.contains(webViewRect)) {
            Intrinsics.checkNotNullParameter(webViewRect, "<this>");
            return webViewRect.height() * webViewRect.width();
        }
        if (rectangles.size() <= 2) {
            int size = rectangles.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                Object obj = rectangles.get(i2);
                i2++;
                Rect rect = (Rect) obj;
                Intrinsics.checkNotNullParameter(rect, "<this>");
                i3 += rect.height() * rect.width();
            }
            int size2 = rectangles.size() - 2;
            if (size2 >= 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    int size3 = rectangles.size();
                    for (int i6 = i5; i6 < size3; i6++) {
                        Rect rect2 = (Rect) rectangles.get(i4);
                        Rect rect22 = (Rect) rectangles.get(i6);
                        Intrinsics.checkNotNullParameter(rect2, "<this>");
                        Intrinsics.checkNotNullParameter(rect22, "rect2");
                        int i7 = rect2.left;
                        i3 -= (i7 >= rect22.right || (i = rect22.left) >= rect2.right || rect2.top >= rect22.bottom || rect22.top >= rect2.bottom) ? 0 : (Math.min(rect2.bottom, rect22.bottom) - Math.max(rect2.top, rect22.top)) * (Math.min(rect2.right, rect22.right) - Math.max(i7, i));
                    }
                    if (i4 == size2) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return i3;
        }
        int i8 = webViewRect.right;
        int i9 = 0;
        for (int i10 = webViewRect.left; i10 < i8; i10++) {
            int i11 = webViewRect.bottom;
            for (int i12 = webViewRect.top; i12 < i11; i12++) {
                Intrinsics.checkNotNullParameter(rectangles, "<this>");
                int size4 = rectangles.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size4) {
                        Object obj2 = rectangles.get(i13);
                        i13++;
                        if (((Rect) obj2).contains(i10, i12)) {
                            i9++;
                            break;
                        }
                    }
                }
            }
        }
        return i9;
    }
}
