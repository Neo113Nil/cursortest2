package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

/* loaded from: classes6.dex */
final class NaturalOrdering extends Ordering implements Serializable {
    static final NaturalOrdering INSTANCE = new NaturalOrdering();
    private static final long serialVersionUID = 0;
    private transient Ordering nullsFirst;
    private transient Ordering nullsLast;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering nullsFirst() {
        Ordering ordering = this.nullsFirst;
        if (ordering != null) {
            return ordering;
        }
        Ordering nullsFirst = super.nullsFirst();
        this.nullsFirst = nullsFirst;
        return nullsFirst;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering nullsLast() {
        Ordering ordering = this.nullsLast;
        if (ordering != null) {
            return ordering;
        }
        Ordering nullsLast = super.nullsLast();
        this.nullsLast = nullsLast;
        return nullsLast;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering reverse() {
        return ReverseNaturalOrdering.INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private NaturalOrdering() {
    }
}
