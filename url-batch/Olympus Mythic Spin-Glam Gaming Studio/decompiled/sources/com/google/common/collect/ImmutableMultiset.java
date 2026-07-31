package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/* loaded from: classes.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset {
    private static final long serialVersionUID = 912559;
    private transient ImmutableList asList;
    private transient ImmutableSet entrySet;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$toImmutableMultiset$0(Object obj) {
        return 1;
    }

    public abstract /* synthetic */ int count(Object obj);

    @Override // com.google.common.collect.Multiset
    public abstract ImmutableSet<E> elementSet();

    abstract Multiset.Entry getEntry(int i);

    @Override // com.google.common.collect.ImmutableCollection
    abstract Object writeReplace();

    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        return CollectCollectors.toImmutableMultiset(Function.identity(), new ToIntFunction() { // from class: com.google.common.collect.ImmutableMultiset$$ExternalSyntheticLambda0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int lambda$toImmutableMultiset$0;
                lambda$toImmutableMultiset$0 = ImmutableMultiset.lambda$toImmutableMultiset$0(obj);
                return lambda$toImmutableMultiset$0;
            }
        });
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        return CollectCollectors.toImmutableMultiset(function, toIntFunction);
    }

    public static <E> ImmutableMultiset<E> of() {
        return RegularImmutableMultiset.EMPTY;
    }

    public static <E> ImmutableMultiset<E> of(E e) {
        return copyFromElements(e);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new Builder().add((Object) e).add((Object) e2).add((Object) e3).add((Object) e4).add((Object) e5).add((Object) e6).add((Object[]) eArr).build();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        Builder builder = new Builder(Multisets.inferDistinctElements(iterable));
        builder.addAll((Iterable) iterable);
        return builder.build();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new Builder().addAll((Iterator) it).build();
    }

    private static ImmutableMultiset copyFromElements(Object... objArr) {
        return new Builder().add(objArr).build();
    }

    static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends Multiset.Entry> collection) {
        Builder builder = new Builder(collection.size());
        for (Multiset.Entry entry : collection) {
            builder.addCopies(entry.getElement(), entry.getCount());
        }
        return builder.build();
    }

    ImmutableMultiset() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public UnmodifiableIterator iterator() {
        final UnmodifiableIterator it = entrySet().iterator();
        return new UnmodifiableIterator(this) { // from class: com.google.common.collect.ImmutableMultiset.1
            Object element;
            int remaining;
            final /* synthetic */ ImmutableMultiset this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.remaining > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.remaining <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.element = entry.getElement();
                    this.remaining = entry.getCount();
                }
                this.remaining--;
                Object obj = this.element;
                Objects.requireNonNull(obj);
                return obj;
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> asList = super.asList();
        this.asList = asList;
        return asList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(Object[] objArr, int i) {
        UnmodifiableIterator it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            Arrays.fill(objArr, i, entry.getCount() + i, entry.getElement());
            i += entry.getCount();
        }
        return i;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    public ImmutableSet<Multiset.Entry> entrySet() {
        ImmutableSet<Multiset.Entry> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Multiset.Entry> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    private ImmutableSet createEntrySet() {
        return isEmpty() ? ImmutableSet.of() : new EntrySet();
    }

    private final class EntrySet extends IndexedImmutableSet<Multiset.Entry> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.IndexedImmutableSet
        public Multiset.Entry get(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && ImmutableMultiset.this.count(entry.getElement()) == entry.getCount();
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }
    }

    static class EntrySetSerializedForm<E> implements Serializable {
        final ImmutableMultiset<E> multiset;

        EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> Builder builder() {
        return new Builder();
    }

    public static class Builder extends ImmutableCollection.Builder {
        boolean buildInvoked;
        ObjectCountHashMap contents;
        boolean isLinkedHash;

        public Builder() {
            this(4);
        }

        Builder(int i) {
            this.buildInvoked = false;
            this.isLinkedHash = false;
            this.contents = ObjectCountHashMap.createWithExpectedSize(i);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder add(Object obj) {
            return addCopies(obj, 1);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder add(Object... objArr) {
            super.add(objArr);
            return this;
        }

        public Builder addCopies(Object obj, int i) {
            Objects.requireNonNull(this.contents);
            if (i == 0) {
                return this;
            }
            if (this.buildInvoked) {
                this.contents = new ObjectCountHashMap(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = false;
            Preconditions.checkNotNull(obj);
            ObjectCountHashMap objectCountHashMap = this.contents;
            objectCountHashMap.put(obj, i + objectCountHashMap.get(obj));
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder addAll(Iterable iterable) {
            Objects.requireNonNull(this.contents);
            if (iterable instanceof Multiset) {
                Multiset cast = Multisets.cast(iterable);
                ObjectCountHashMap tryGetMap = tryGetMap(cast);
                if (tryGetMap != null) {
                    ObjectCountHashMap objectCountHashMap = this.contents;
                    objectCountHashMap.ensureCapacity(Math.max(objectCountHashMap.size(), tryGetMap.size()));
                    for (int firstIndex = tryGetMap.firstIndex(); firstIndex >= 0; firstIndex = tryGetMap.nextIndex(firstIndex)) {
                        addCopies(tryGetMap.getKey(firstIndex), tryGetMap.getValue(firstIndex));
                    }
                } else {
                    Set entrySet = cast.entrySet();
                    ObjectCountHashMap objectCountHashMap2 = this.contents;
                    objectCountHashMap2.ensureCapacity(Math.max(objectCountHashMap2.size(), entrySet.size()));
                    for (Multiset.Entry entry : cast.entrySet()) {
                        addCopies(entry.getElement(), entry.getCount());
                    }
                }
            } else {
                super.addAll(iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder addAll(Iterator it) {
            super.addAll(it);
            return this;
        }

        static ObjectCountHashMap tryGetMap(Iterable iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).contents;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableMultiset build() {
            Objects.requireNonNull(this.contents);
            if (this.contents.size() == 0) {
                return ImmutableMultiset.of();
            }
            if (this.isLinkedHash) {
                this.contents = new ObjectCountHashMap(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = true;
            return new RegularImmutableMultiset(this.contents);
        }
    }
}
