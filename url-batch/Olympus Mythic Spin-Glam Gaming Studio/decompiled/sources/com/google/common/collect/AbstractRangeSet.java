package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes5.dex */
abstract class AbstractRangeSet implements RangeSet {
    public abstract void add(Range range);

    @Override // com.google.common.collect.RangeSet
    public abstract boolean encloses(Range range);

    public abstract Range rangeContaining(Comparable comparable);

    public abstract void remove(Range range);

    AbstractRangeSet() {
    }

    public boolean contains(Comparable comparable) {
        return rangeContaining(comparable) != null;
    }

    @Override // com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    public void clear() {
        remove(Range.all());
    }

    public boolean enclosesAll(RangeSet rangeSet) {
        return enclosesAll(rangeSet.asRanges());
    }

    public boolean enclosesAll(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses((Range) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void addAll(RangeSet rangeSet) {
        addAll(rangeSet.asRanges());
    }

    public void addAll(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            add((Range) it.next());
        }
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(RangeSet rangeSet) {
        removeAll(rangeSet.asRanges());
    }

    public void removeAll(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            remove((Range) it.next());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RangeSet) {
            return asRanges().equals(((RangeSet) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public final String toString() {
        return asRanges().toString();
    }
}
