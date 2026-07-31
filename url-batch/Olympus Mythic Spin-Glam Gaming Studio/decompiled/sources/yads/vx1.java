package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;

/* loaded from: classes12.dex */
public abstract class vx1 {
    public static double a(List list) {
        Object next;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (true) {
            double d = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            int i = ((q31) it.next()).b;
            if (i != 0) {
                d = r2.a / i;
            }
            arrayList.add(Double.valueOf(d));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(MathKt.roundToInt(((Number) it2.next()).doubleValue() * 1000)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int i2 = 1;
            if (!it3.hasNext()) {
                break;
            }
            int intValue = ((Number) it3.next()).intValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(intValue));
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            linkedHashMap.put(valueOf, Integer.valueOf(i2));
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                int intValue2 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it4.next();
                    int intValue3 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue2 < intValue3) {
                        next = next2;
                        intValue2 = intValue3;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num2 = entry != null ? (Integer) entry.getValue() : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int intValue4 = ((Number) entry2.getValue()).intValue();
            if (num2 != null && intValue4 == num2.intValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it5 = linkedHashMap2.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) ((Map.Entry) it5.next()).getKey()).intValue() / 1000));
        }
        List sorted = CollectionsKt.sorted(arrayList3);
        int size = sorted.size();
        int i3 = size / 2;
        if (arrayList3.isEmpty()) {
            return 0.0d;
        }
        int i4 = size % 2;
        if (i4 + ((((i4 ^ 2) & ((-i4) | i4)) >> 31) & 2) == 1) {
            return ((Number) sorted.get(i3)).doubleValue();
        }
        return (((Number) sorted.get(i3 - 1)).doubleValue() + ((Number) sorted.get(i3)).doubleValue()) / 2;
    }
}
