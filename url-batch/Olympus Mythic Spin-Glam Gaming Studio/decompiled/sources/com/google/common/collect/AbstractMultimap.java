package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
abstract class AbstractMultimap implements Multimap {
    private transient Map asMap;
    private transient Collection entries;
    private transient Set keySet;
    private transient Multiset keys;
    private transient Collection values;

    abstract Map createAsMap();

    abstract Collection createEntries();

    abstract Set createKeySet();

    abstract Multiset createKeys();

    abstract Collection createValues();

    abstract Iterator entryIterator();

    @Override // com.google.common.collect.Multimap
    public abstract boolean put(Object obj, Object obj2);

    abstract Iterator valueIterator();

    AbstractMultimap() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsValue(Object obj) {
        Iterator<Collection<Object>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public boolean putAll(Object obj, Iterable<Object> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator<Object> it = iterable.iterator();
        return it.hasNext() && Iterators.addAll(get(obj), it);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(Multimap multimap) {
        boolean z = false;
        for (Map.Entry entry : multimap.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    @Override // com.google.common.collect.Multimap
    public Collection entries() {
        Collection collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection createEntries = createEntries();
        this.entries = createEntries;
        return createEntries;
    }

    class Entries extends Multimaps.Entries {
        Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        Multimap multimap() {
            return AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractMultimap.this.entryIterator();
        }
    }

    class EntrySet extends Entries implements Set {
        EntrySet() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }
    }

    @Override // com.google.common.collect.Multimap
    public Set<Object> keySet() {
        Set<Object> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<Object> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public Multiset keys() {
        Multiset multiset = this.keys;
        if (multiset != null) {
            return multiset;
        }
        Multiset createKeys = createKeys();
        this.keys = createKeys;
        return createKeys;
    }

    @Override // com.google.common.collect.Multimap
    public Collection values() {
        Collection collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    class Values extends AbstractCollection {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractMultimap.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractMultimap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractMultimap.this.clear();
        }
    }

    @Override // com.google.common.collect.Multimap
    public Map<Object, Collection<Object>> asMap() {
        Map<Object, Collection<Object>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<Object, Collection<Object>> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public boolean equals(Object obj) {
        return Multimaps.equalsImpl(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public String toString() {
        return asMap().toString();
    }
}
