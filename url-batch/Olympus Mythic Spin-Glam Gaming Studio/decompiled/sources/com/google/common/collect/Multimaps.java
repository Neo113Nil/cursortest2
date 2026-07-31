package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes9.dex */
public abstract class Multimaps {
    public static ListMultimap newListMultimap(Map map, Supplier supplier) {
        return new CustomListMultimap(map, supplier);
    }

    private static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Supplier factory;

        CustomListMultimap(Map<K, Collection<V>> map, Supplier supplier) {
            super(map);
            this.factory = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public List<V> createCollection() {
            return (List) this.factory.get();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            this.factory = (Supplier) readObject;
            Object readObject2 = objectInputStream.readObject();
            Objects.requireNonNull(readObject2);
            setMap((Map) readObject2);
        }
    }

    public static SetMultimap newSetMultimap(Map map, Supplier supplier) {
        return new CustomSetMultimap(map, supplier);
    }

    private static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Supplier factory;

        CustomSetMultimap(Map<K, Collection<V>> map, Supplier supplier) {
            super(map);
            this.factory = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Set<V> createCollection() {
            return (Set) this.factory.get();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.unmodifiableNavigableSet((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            return Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        Collection<V> wrapCollection(K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.WrappedNavigableSet(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.WrappedSortedSet(k, (SortedSet) collection, null);
            }
            return new AbstractMapBasedMultimap.WrappedSet(k, (Set) collection);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            this.factory = (Supplier) readObject;
            Object readObject2 = objectInputStream.readObject();
            Objects.requireNonNull(readObject2);
            setMap((Map) readObject2);
        }
    }

    static class Keys extends AbstractMultiset {
        final Multimap multimap;

        Keys(Multimap multimap) {
            this.multimap = multimap;
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator entryIterator() {
            return new TransformedIterator(this.multimap.asMap().entrySet().iterator()) { // from class: com.google.common.collect.Multimaps.Keys.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                public Multiset.Entry transform(final Map.Entry entry) {
                    return new Multisets.AbstractEntry(this) { // from class: com.google.common.collect.Multimaps.Keys.1.1
                        final /* synthetic */ AnonymousClass1 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public Object getElement() {
                            return entry.getKey();
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultiset
        int distinctElements() {
            return this.multimap.asMap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(Object obj) {
            return this.multimap.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Maps.keyIterator(this.multimap.entries().iterator());
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            Collection collection = (Collection) Maps.safeGet(this.multimap.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.safeGet(this.multimap.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.multimap.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public Set elementSet() {
            return this.multimap.keySet();
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator elementIterator() {
            throw new AssertionError("should never be called");
        }
    }

    static abstract class Entries extends AbstractCollection {
        abstract Multimap multimap();

        Entries() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return multimap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return multimap().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return multimap().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            multimap().clear();
        }
    }

    static boolean equalsImpl(Multimap multimap, Object obj) {
        if (obj == multimap) {
            return true;
        }
        if (obj instanceof Multimap) {
            return multimap.asMap().equals(((Multimap) obj).asMap());
        }
        return false;
    }
}
