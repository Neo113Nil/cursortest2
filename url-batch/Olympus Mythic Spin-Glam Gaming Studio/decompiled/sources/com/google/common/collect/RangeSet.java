package com.google.common.collect;

import java.util.Set;

/* loaded from: classes15.dex */
public interface RangeSet {
    Set asRanges();

    RangeSet complement();

    boolean encloses(Range range);

    boolean isEmpty();

    void removeAll(RangeSet rangeSet);
}
