package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public abstract class ForwardingSortedMap extends ForwardingMap implements SortedMap {
    static int unsafeCompare(Comparator comparator, Object obj, Object obj2) {
        if (comparator == null) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }
}
