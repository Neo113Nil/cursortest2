package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes9.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final int SPLITERATOR_CHARACTERISTICS = 1296;
    private static final long serialVersionUID = 912559;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    Object[] internalArray() {
        return null;
    }

    abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract UnmodifiableIterator iterator();

    ImmutableCollection() {
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, SPLITERATOR_CHARACTERISTICS);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return (T[]) Platform.copy(internalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) ObjectArrays.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.of() : ImmutableList.asImmutableList(toArray());
    }

    int copyIntoArray(Object[] objArr, int i) {
        UnmodifiableIterator it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static abstract class Builder {
        public abstract Builder add(Object obj);

        public abstract ImmutableCollection build();

        static int expandedCapacity(int i, int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        Builder() {
        }

        public Builder add(Object... objArr) {
            for (Object obj : objArr) {
                add(obj);
            }
            return this;
        }

        public Builder addAll(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public Builder addAll(Iterator it) {
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
    }

    static abstract class ArrayBasedBuilder extends Builder {
        Object[] contents;
        boolean forceCopy;
        int size;

        ArrayBasedBuilder(int i) {
            CollectPreconditions.checkNonnegative(i, "initialCapacity");
            this.contents = new Object[i];
            this.size = 0;
        }

        private void ensureRoomFor(int i) {
            Object[] objArr = this.contents;
            int expandedCapacity = Builder.expandedCapacity(objArr.length, this.size + i);
            if (expandedCapacity > objArr.length || this.forceCopy) {
                this.contents = Arrays.copyOf(this.contents, expandedCapacity);
                this.forceCopy = false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ArrayBasedBuilder add(Object obj) {
            Preconditions.checkNotNull(obj);
            ensureRoomFor(1);
            Object[] objArr = this.contents;
            int i = this.size;
            this.size = i + 1;
            objArr[i] = obj;
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder add(Object... objArr) {
            addAll(objArr, objArr.length);
            return this;
        }

        final void addAll(Object[] objArr, int i) {
            ObjectArrays.checkElementsNotNull(objArr, i);
            ensureRoomFor(i);
            System.arraycopy(objArr, 0, this.contents, this.size, i);
            this.size += i;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder addAll(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                ensureRoomFor(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.size = ((ImmutableCollection) collection).copyIntoArray(this.contents, this.size);
                    return this;
                }
            }
            super.addAll(iterable);
            return this;
        }
    }
}
