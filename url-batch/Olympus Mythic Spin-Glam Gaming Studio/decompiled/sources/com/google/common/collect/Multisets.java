package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public abstract class Multisets {
    public static Multiset.Entry immutableEntry(Object obj, int i) {
        return new ImmutableEntry(obj, i);
    }

    static class ImmutableEntry<E> extends AbstractEntry implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }

        ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            CollectPreconditions.checkNonnegative(i, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final E getElement() {
            return this.element;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.count;
        }
    }

    static int inferDistinctElements(Iterable iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    static abstract class AbstractEntry implements Multiset.Entry {
        AbstractEntry() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return getCount() == entry.getCount() && Objects.equal(getElement(), entry.getElement());
        }

        public int hashCode() {
            Object element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            return valueOf + " x " + count;
        }
    }

    static boolean equalsImpl(Multiset multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static boolean addAllImpl(Multiset multiset, Collection collection) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            return addAllImpl(multiset, cast(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.addAll(multiset, collection.iterator());
    }

    private static boolean addAllImpl(Multiset multiset, Multiset multiset2) {
        if (multiset2 instanceof AbstractMapBasedMultiset) {
            return addAllImpl(multiset, (AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry entry : multiset2.entrySet()) {
            multiset.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    private static boolean addAllImpl(Multiset multiset, AbstractMapBasedMultiset abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(multiset);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean removeAllImpl(Multiset multiset, Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean retainAllImpl(Multiset multiset, Collection collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    static int setCountImpl(Multiset multiset, Object obj, int i) {
        CollectPreconditions.checkNonnegative(i, "count");
        int count = multiset.count(obj);
        int i2 = i - count;
        if (i2 > 0) {
            multiset.add(obj, i2);
        } else if (i2 < 0) {
            multiset.remove(obj, -i2);
        }
        return count;
    }

    static boolean setCountImpl(Multiset multiset, Object obj, int i, int i2) {
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(i2, "newCount");
        if (multiset.count(obj) != i) {
            return false;
        }
        multiset.setCount(obj, i2);
        return true;
    }

    static abstract class ElementSet extends Sets.ImprovedAbstractSet {
        abstract Multiset multiset();

        ElementSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return multiset().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return multiset().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return multiset().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return multiset().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return multiset().entrySet().size();
        }
    }

    static abstract class EntrySet extends Sets.ImprovedAbstractSet {
        abstract Multiset multiset();

        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && multiset().count(entry.getElement()) == entry.getCount();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return multiset().setCount(element, count, 0);
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }
    }

    static Iterator iteratorImpl(Multiset multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static final class MultisetIteratorImpl implements Iterator {
        private boolean canRemove;
        private Multiset.Entry currentEntry;
        private final Iterator entryIterator;
        private int laterCount;
        private final Multiset multiset;
        private int totalCount;

        MultisetIteratorImpl(Multiset multiset, Iterator it) {
            this.multiset = multiset;
            this.entryIterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.laterCount > 0 || this.entryIterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.laterCount == 0) {
                Multiset.Entry entry = (Multiset.Entry) this.entryIterator.next();
                this.currentEntry = entry;
                int count = entry.getCount();
                this.laterCount = count;
                this.totalCount = count;
            }
            this.laterCount--;
            this.canRemove = true;
            Multiset.Entry entry2 = this.currentEntry;
            java.util.Objects.requireNonNull(entry2);
            return entry2.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.canRemove);
            if (this.totalCount == 1) {
                this.entryIterator.remove();
            } else {
                Multiset multiset = this.multiset;
                Multiset.Entry entry = this.currentEntry;
                java.util.Objects.requireNonNull(entry);
                multiset.remove(entry.getElement());
            }
            this.totalCount--;
            this.canRemove = false;
        }
    }

    static Multiset cast(Iterable iterable) {
        return (Multiset) iterable;
    }
}
