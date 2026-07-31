package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public abstract class Ordering implements Comparator {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    private static class ArbitraryOrderingHolder {
        static final Ordering ARBITRARY_ORDERING = new ArbitraryOrdering();
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public static <C extends Comparable> Ordering natural() {
        return NaturalOrdering.INSTANCE;
    }

    public static <T> Ordering from(Comparator<T> comparator) {
        if (comparator instanceof Ordering) {
            return (Ordering) comparator;
        }
        return new ComparatorOrdering(comparator);
    }

    @Deprecated
    public static <T> Ordering from(Ordering ordering) {
        return (Ordering) Preconditions.checkNotNull(ordering);
    }

    public static <T> Ordering explicit(List<T> list) {
        return new ExplicitOrdering(list);
    }

    public static <T> Ordering explicit(T t, T... tArr) {
        return explicit(Lists.asList(t, tArr));
    }

    public static Ordering allEqual() {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering usingToString() {
        return UsingToStringOrdering.INSTANCE;
    }

    public static Ordering arbitrary() {
        return ArbitraryOrderingHolder.ARBITRARY_ORDERING;
    }

    static class ArbitraryOrdering extends Ordering {
        private final AtomicInteger counter = new AtomicInteger(0);
        private final ConcurrentMap uids = Platform.tryWeakKeys(new MapMaker()).makeMap();

        ArbitraryOrdering() {
        }

        private Integer getUid(Object obj) {
            Integer num = (Integer) this.uids.get(obj);
            if (num != null) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.counter.getAndIncrement());
            Integer num2 = (Integer) this.uids.putIfAbsent(obj, valueOf);
            return num2 != null ? num2 : valueOf;
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int identityHashCode = identityHashCode(obj);
            int identityHashCode2 = identityHashCode(obj2);
            if (identityHashCode != identityHashCode2) {
                return identityHashCode < identityHashCode2 ? -1 : 1;
            }
            int compareTo = getUid(obj).compareTo(getUid(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }

        int identityHashCode(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Ordering() {
    }

    public <S> Ordering reverse() {
        return new ReverseOrdering(this);
    }

    public <S> Ordering nullsFirst() {
        return new NullsFirstOrdering(this);
    }

    public <S> Ordering nullsLast() {
        return new NullsLastOrdering(this);
    }

    public <F> Ordering onResultOf(Function function) {
        return new ByFunctionOrdering(function, this);
    }

    <T2> Ordering onKeys() {
        return onResultOf(Maps.keyFunction());
    }

    public <U> Ordering compound(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <T> Ordering compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    public <S> Ordering lexicographical() {
        return new LexicographicalOrdering(this);
    }

    public <E> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    public <E> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    public <E> E min(E e, E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E min(E e, E e2, E e3, E... eArr) {
        E e4 = (E) min(min(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) min(e4, e5);
        }
        return e4;
    }

    public <E> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    public <E> E max(E e, E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E max(E e, E e2, E e3, E... eArr) {
        E e4 = (E) max(max(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) max(e4, e5);
        }
        return e4;
    }

    public <E> List<E> leastOf(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= i * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    public <E> List<E> leastOf(Iterator<E> it, int i) {
        Preconditions.checkNotNull(it);
        CollectPreconditions.checkNonnegative(i, CampaignEx.JSON_KEY_AD_K);
        if (i == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i >= 1073741823) {
            ArrayList newArrayList = Lists.newArrayList(it);
            Collections.sort(newArrayList, this);
            if (newArrayList.size() > i) {
                newArrayList.subList(i, newArrayList.size()).clear();
            }
            newArrayList.trimToSize();
            return Collections.unmodifiableList(newArrayList);
        }
        TopKSelector least = TopKSelector.least(i, this);
        least.offerAll(it);
        return least.topK();
    }

    public <E> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E> List<E> greatestOf(Iterator<E> it, int i) {
        return reverse().leastOf(it, i);
    }

    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] array = Iterables.toArray(iterable);
        Arrays.sort(array, this);
        return Lists.newArrayList(Arrays.asList(array));
    }

    public <E> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @Deprecated
    public int binarySearch(List<Object> list, Object obj) {
        return Collections.binarySearch(list, obj, this);
    }

    static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
        final Object value;

        IncomparableValueException(Object obj) {
            super("Cannot compare value: " + obj);
            this.value = obj;
        }
    }
}
