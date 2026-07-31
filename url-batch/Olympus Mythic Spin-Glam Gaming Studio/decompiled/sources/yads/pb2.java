package yads;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class pb2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    public final int a(View view, Rect rect) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(view.getContext());
        if (a == null || !a.m) {
            return 0;
        }
        ArrayList a2 = rb2.a(view);
        ArrayList arrayList = new ArrayList();
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            Rect rect2 = new Rect();
            if (view2.getGlobalVisibleRect(rect2)) {
                arrayList.add(rect2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rect rect3 = (Rect) it2.next();
            rect3.left = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(rect3.left, rect.left), rect.right);
            rect3.top = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(rect3.top, rect.top), rect.bottom);
            rect3.right = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(rect3.right, rect.left), rect.right);
            rect3.bottom = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(rect3.bottom, rect.top), rect.bottom);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            Rect rect4 = (Rect) next;
            if (rect4.width() > 0 && rect4.height() > 0) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        ArrayList<Rect> arrayList3 = arrayList2;
        if (size > 100) {
            arrayList3 = arrayList2.subList(0, 100);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(Integer.valueOf(rect.left));
        treeSet.add(Integer.valueOf(rect.right));
        for (Rect rect5 : arrayList3) {
            treeSet.add(Integer.valueOf(rect5.left));
            treeSet.add(Integer.valueOf(rect5.right));
        }
        ArrayList arrayList4 = new ArrayList(treeSet);
        TreeSet treeSet2 = new TreeSet();
        treeSet2.add(Integer.valueOf(rect.top));
        treeSet2.add(Integer.valueOf(rect.bottom));
        for (Rect rect6 : arrayList3) {
            treeSet2.add(Integer.valueOf(rect6.top));
            treeSet2.add(Integer.valueOf(rect6.bottom));
        }
        ArrayList arrayList5 = new ArrayList(treeSet2);
        rect.left = Collections.binarySearch(arrayList4, Integer.valueOf(rect.left));
        rect.top = Collections.binarySearch(arrayList5, Integer.valueOf(rect.top));
        rect.right = Collections.binarySearch(arrayList4, Integer.valueOf(rect.right));
        rect.bottom = Collections.binarySearch(arrayList5, Integer.valueOf(rect.bottom));
        for (Rect rect7 : arrayList3) {
            rect7.left = Collections.binarySearch(arrayList4, Integer.valueOf(rect7.left));
            rect7.top = Collections.binarySearch(arrayList5, Integer.valueOf(rect7.top));
            rect7.right = Collections.binarySearch(arrayList4, Integer.valueOf(rect7.right));
            rect7.bottom = Collections.binarySearch(arrayList5, Integer.valueOf(rect7.bottom));
        }
        int size2 = arrayList4.size() - 1;
        byte[][] bArr = new byte[size2][];
        for (int i = 0; i < size2; i++) {
            bArr[i] = new byte[arrayList5.size() - 1];
        }
        for (Rect rect8 : arrayList3) {
            int i2 = rect8.right;
            for (int i3 = rect8.left; i3 < i2; i3++) {
                int i4 = rect8.bottom;
                for (int i5 = rect8.top; i5 < i4; i5++) {
                    bArr[i3][i5] = 1;
                }
            }
        }
        int size3 = arrayList4.size() - 1;
        int i6 = 0;
        for (int i7 = 0; i7 < size3; i7++) {
            int size4 = arrayList5.size() - 1;
            for (int i8 = 0; i8 < size4; i8++) {
                if (bArr[i7][i8] == 1) {
                    i6 = ((((Number) arrayList5.get(i8 + 1)).intValue() - ((Number) arrayList5.get(i8)).intValue()) * (((Number) arrayList4.get(i7 + 1)).intValue() - ((Number) arrayList4.get(i7)).intValue())) + i6;
                }
            }
        }
        return i6;
    }
}
