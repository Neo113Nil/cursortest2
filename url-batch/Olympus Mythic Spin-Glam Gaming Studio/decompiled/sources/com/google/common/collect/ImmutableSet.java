package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;

/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;
    private transient ImmutableList asList;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract UnmodifiableIterator iterator();

    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return CollectCollectors.toImmutableSet();
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.EMPTY;
    }

    public static <E> ImmutableSet<E> of(E e) {
        return new SingletonImmutableSet(e);
    }

    public static <E> ImmutableSet<E> of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableSet construct(int i, Object... objArr) {
        if (i == 0) {
            return of();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int chooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[chooseTableSize];
        int i2 = chooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object checkElementNotNull = ObjectArrays.checkElementNotNull(objArr[i5], i5);
            int hashCode = checkElementNotNull.hashCode();
            int smear = Hashing.smear(hashCode);
            while (true) {
                int i6 = smear & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = checkElementNotNull;
                    objArr2[i6] = checkElementNotNull;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(checkElementNotNull)) {
                    break;
                }
                smear++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (chooseTableSize(i4) < chooseTableSize / 2) {
            return construct(i4, objArr);
        }
        if (shouldTrim(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        Preconditions.checkArgument(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new Builder().add((Object) next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length == 1) {
            return of((Object) eArr[0]);
        }
        return construct(eArr.length, (Object[]) eArr.clone());
    }

    ImmutableSet() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    private static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> Builder builder() {
        return new Builder();
    }

    public static <E> Builder builderWithExpectedSize(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new Builder(i, true);
    }

    public static class Builder extends ImmutableCollection.ArrayBasedBuilder {
        private int hashCode;
        Object[] hashTable;

        public Builder() {
            super(4);
        }

        Builder(int i, boolean z) {
            super(i);
            if (z) {
                this.hashTable = new Object[ImmutableSet.chooseTableSize(i)];
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder add(Object obj) {
            Preconditions.checkNotNull(obj);
            if (this.hashTable != null && ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(obj);
                return this;
            }
            this.hashTable = null;
            super.add(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder add(Object... objArr) {
            if (this.hashTable != null) {
                for (Object obj : objArr) {
                    add(obj);
                }
            } else {
                super.add(objArr);
            }
            return this;
        }

        private void addDeduping(Object obj) {
            Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length - 1;
            int hashCode = obj.hashCode();
            int smear = Hashing.smear(hashCode);
            while (true) {
                int i = smear & length;
                Object[] objArr = this.hashTable;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    objArr[i] = obj;
                    this.hashCode += hashCode;
                    super.add(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    smear = i + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder addAll(Iterable iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.hashTable != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
            } else {
                super.addAll(iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder addAll(Iterator it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        Builder combine(Builder builder) {
            if (this.hashTable != null) {
                for (int i = 0; i < builder.size; i++) {
                    Object obj = builder.contents[i];
                    Objects.requireNonNull(obj);
                    add(obj);
                }
            } else {
                addAll(builder.contents, builder.size);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet build() {
            ImmutableSet construct;
            int i = this.size;
            if (i == 0) {
                return ImmutableSet.of();
            }
            if (i == 1) {
                Object obj = this.contents[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (this.hashTable == null || ImmutableSet.chooseTableSize(i) != this.hashTable.length) {
                construct = ImmutableSet.construct(this.size, this.contents);
                this.size = construct.size();
            } else {
                Object[] copyOf = ImmutableSet.shouldTrim(this.size, this.contents.length) ? Arrays.copyOf(this.contents, this.size) : this.contents;
                construct = new RegularImmutableSet(copyOf, this.hashCode, this.hashTable, r5.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return construct;
        }
    }
}
