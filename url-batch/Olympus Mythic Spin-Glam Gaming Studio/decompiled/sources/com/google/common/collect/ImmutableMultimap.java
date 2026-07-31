package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap implements Serializable {
    private static final long serialVersionUID = 0;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;

    static class FieldSettersHolder {
        static final Serialization.FieldSetter MAP_FIELD_SETTER = Serialization.getFieldSetter(ImmutableMultimap.class, "map");
        static final Serialization.FieldSetter SIZE_FIELD_SETTER = Serialization.getFieldSetter(ImmutableMultimap.class, "size");
    }

    @Override // com.google.common.collect.Multimap
    public abstract ImmutableCollection<V> get(K k);

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((ImmutableMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    /* renamed from: replaceValues, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Collection mo3708replaceValues(Object obj, Iterable iterable) {
        return replaceValues((ImmutableMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> ImmutableMultimap<K, V> of() {
        return ImmutableListMultimap.of();
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v) {
        return ImmutableListMultimap.of((Object) k, (Object) v);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v, K k2, V v2) {
        return ImmutableListMultimap.of((Object) k, (Object) v, (Object) k2, (Object) v2);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        return ImmutableListMultimap.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ImmutableListMultimap.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ImmutableListMultimap.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v5);
    }

    public static <K, V> Builder builder() {
        return new Builder();
    }

    public static <K, V> Builder builderWithExpectedKeys(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new Builder(i);
    }

    public static class Builder {
        Map builderMap;
        int expectedValuesPerKey = 4;
        Comparator keyComparator;
        Comparator valueComparator;

        public Builder() {
        }

        Builder(int i) {
            if (i > 0) {
                this.builderMap = Platform.preservesInsertionOrderOnPutsMapWithExpectedSize(i);
            }
        }

        Map ensureBuilderMapNonNull() {
            Map map = this.builderMap;
            if (map != null) {
                return map;
            }
            Map preservesInsertionOrderOnPutsMap = Platform.preservesInsertionOrderOnPutsMap();
            this.builderMap = preservesInsertionOrderOnPutsMap;
            return preservesInsertionOrderOnPutsMap;
        }

        ImmutableCollection.Builder newValueCollectionBuilderWithExpectedSize(int i) {
            return ImmutableList.builderWithExpectedSize(i);
        }

        int expectedValueCollectionSize(int i, Iterable iterable) {
            return iterable instanceof Collection ? Math.max(i, ((Collection) iterable).size()) : i;
        }

        public Builder put(Object obj, Object obj2) {
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            ImmutableCollection.Builder builder = (ImmutableCollection.Builder) ensureBuilderMapNonNull().get(obj);
            if (builder == null) {
                builder = newValueCollectionBuilderWithExpectedSize(this.expectedValuesPerKey);
                ensureBuilderMapNonNull().put(obj, builder);
            }
            builder.add(obj2);
            return this;
        }

        public Builder put(Map.Entry entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public Builder putAll(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                put((Map.Entry) it.next());
            }
            return this;
        }

        public Builder putAll(Object obj, Iterable iterable) {
            if (obj == null) {
                throw new NullPointerException("null key in entry: null=" + Iterables.toString(iterable));
            }
            Iterator it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            ImmutableCollection.Builder builder = (ImmutableCollection.Builder) ensureBuilderMapNonNull().get(obj);
            if (builder == null) {
                builder = newValueCollectionBuilderWithExpectedSize(expectedValueCollectionSize(this.expectedValuesPerKey, iterable));
                ensureBuilderMapNonNull().put(obj, builder);
            }
            while (it.hasNext()) {
                Object next = it.next();
                CollectPreconditions.checkEntryNotNull(obj, next);
                builder.add(next);
            }
            return this;
        }

        Builder combine(Builder builder) {
            Map map = builder.builderMap;
            if (map != null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    putAll(entry.getKey(), ((ImmutableCollection.Builder) entry.getValue()).build());
                }
            }
            return this;
        }

        public ImmutableMultimap build() {
            Map map = this.builderMap;
            if (map == null) {
                return ImmutableListMultimap.of();
            }
            Collection entrySet = map.entrySet();
            Comparator comparator = this.keyComparator;
            if (comparator != null) {
                entrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(entrySet);
            }
            return ImmutableListMultimap.fromMapBuilderEntries(entrySet, this.valueComparator);
        }
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Multimap multimap) {
        if (multimap instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) multimap;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf(multimap);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf((Iterable) iterable);
    }

    ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    @Override // 
    @Deprecated
    /* renamed from: removeAll, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> mo3707removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap
    @Deprecated
    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final boolean putAll(Multimap multimap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new EntryCollection(this);
    }

    private static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final ImmutableMultimap<K, V> multimap;

        EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public UnmodifiableIterator iterator() {
            return this.multimap.entryIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public UnmodifiableIterator entryIterator() {
        return new UnmodifiableIterator() { // from class: com.google.common.collect.ImmutableMultimap.1
            final Iterator asMapItr;
            Object currentKey = null;
            Iterator valueItr = Iterators.emptyIterator();

            {
                this.asMapItr = ImmutableMultimap.this.map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.valueItr.hasNext() || this.asMapItr.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry next() {
                if (!this.valueItr.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.asMapItr.next();
                    this.currentKey = entry.getKey();
                    this.valueItr = ((ImmutableCollection) entry.getValue()).iterator();
                }
                Object obj = this.currentKey;
                Objects.requireNonNull(obj);
                return Maps.immutableEntry(obj, this.valueItr.next());
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public ImmutableMultiset<K> createKeys() {
        return new Keys();
    }

    class Keys extends ImmutableMultiset<K> {
        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        Keys() {
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public int count(Object obj) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.map.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        Multiset.Entry getEntry(int i) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.map.entrySet().asList().get(i);
            return Multisets.immutableEntry(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }
    }

    private static final class KeysSerializedForm implements Serializable {
        final ImmutableMultimap<?, ?> multimap;

        KeysSerializedForm(ImmutableMultimap<?, ?> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        Object readResolve() {
            return this.multimap.keys();
        }
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public ImmutableCollection<V> createValues() {
        return new Values(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public UnmodifiableIterator valueIterator() {
        return new UnmodifiableIterator() { // from class: com.google.common.collect.ImmutableMultimap.2
            Iterator valueCollectionItr;
            Iterator valueItr = Iterators.emptyIterator();

            {
                this.valueCollectionItr = ImmutableMultimap.this.map.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.valueItr.hasNext() || this.valueCollectionItr.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!this.valueItr.hasNext()) {
                    this.valueItr = ((ImmutableCollection) this.valueCollectionItr.next()).iterator();
                }
                return this.valueItr.next();
            }
        };
    }

    private static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        private final transient ImmutableMultimap multimap;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.multimap.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public UnmodifiableIterator iterator() {
            return this.multimap.valueIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(Object[] objArr, int i) {
            UnmodifiableIterator it = this.multimap.map.values().iterator();
            while (it.hasNext()) {
                i = ((ImmutableCollection) it.next()).copyIntoArray(objArr, i);
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        Object writeReplace() {
            return super.writeReplace();
        }
    }
}
