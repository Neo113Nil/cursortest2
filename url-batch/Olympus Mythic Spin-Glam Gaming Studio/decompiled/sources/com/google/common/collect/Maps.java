package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.ironsource.B5;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public abstract class Maps {

    private enum EntryFunction implements Function {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.collect.Maps.EntryFunction, com.google.common.base.Function
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.collect.Maps.EntryFunction, com.google.common.base.Function
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        @Override // com.google.common.base.Function
        public abstract /* synthetic */ Object apply(Object obj);
    }

    static Function keyFunction() {
        return EntryFunction.KEY;
    }

    static Function valueFunction() {
        return EntryFunction.VALUE;
    }

    static Iterator keyIterator(Iterator it) {
        return new TransformedIterator(it) { // from class: com.google.common.collect.Maps.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public Object transform(Map.Entry entry) {
                return entry.getKey();
            }
        };
    }

    static Iterator valueIterator(Iterator it) {
        return new TransformedIterator(it) { // from class: com.google.common.collect.Maps.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public Object transform(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }

    public static HashMap newHashMapWithExpectedSize(int i) {
        return new HashMap(capacity(i));
    }

    static int capacity(int i) {
        if (i < 3) {
            CollectPreconditions.checkNonnegative(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap newLinkedHashMapWithExpectedSize(int i) {
        return new LinkedHashMap(capacity(i));
    }

    public static IdentityHashMap newIdentityHashMap() {
        return new IdentityHashMap();
    }

    public static Map.Entry immutableEntry(Object obj, Object obj2) {
        return new ImmutableEntry(obj, obj2);
    }

    static abstract class ViewCachingAbstractMap extends AbstractMap {
        private transient Set entrySet;
        private transient Collection values;

        abstract Set createEntrySet();

        ViewCachingAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection createValues = createValues();
            this.values = createValues;
            return createValues;
        }

        Collection createValues() {
            return new Values(this);
        }
    }

    static abstract class IteratorBasedAbstractMap extends AbstractMap {
        abstract Iterator entryIterator();

        IteratorBasedAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            return new EntrySet() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                @Override // com.google.common.collect.Maps.EntrySet
                Map map() {
                    return IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return IteratorBasedAbstractMap.this.entryIterator();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.clear(entryIterator());
        }
    }

    static Object safeGet(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean safeContainsKey(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object safeRemove(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean containsKeyImpl(Map map, Object obj) {
        return Iterators.contains(keyIterator(map.entrySet().iterator()), obj);
    }

    static boolean containsValueImpl(Map map, Object obj) {
        return Iterators.contains(valueIterator(map.entrySet().iterator()), obj);
    }

    static boolean equalsImpl(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String toStringImpl(Map map) {
        StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                newStringBuilderForCollection.append(", ");
            }
            newStringBuilderForCollection.append(entry.getKey());
            newStringBuilderForCollection.append(B5.U);
            newStringBuilderForCollection.append(entry.getValue());
            z = false;
        }
        newStringBuilderForCollection.append('}');
        return newStringBuilderForCollection.toString();
    }

    static void putAllImpl(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    static class KeySet extends Sets.ImprovedAbstractSet {
        final Map map;

        KeySet(Map map) {
            this.map = (Map) Preconditions.checkNotNull(map);
        }

        Map map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return Maps.keyIterator(map().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return map().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            map().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }
    }

    static Object keyOrNull(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static Object valueOrNull(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    static class SortedKeySet extends KeySet implements SortedSet {
        @Override // com.google.common.collect.Maps.KeySet
        abstract SortedMap map();

        SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return map().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return map().firstKey();
        }

        @Override // java.util.SortedSet
        public Object last() {
            return map().lastKey();
        }
    }

    static class NavigableKeySet extends SortedKeySet implements NavigableSet {
        NavigableKeySet(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public NavigableMap map() {
            return (NavigableMap) this.map;
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return map().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return map().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return map().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return map().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Maps.keyOrNull(map().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Maps.keyOrNull(map().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return map().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return map().subMap(obj, z, obj2, z2).navigableKeySet();
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return map().headMap(obj, z).navigableKeySet();
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return map().tailMap(obj, z).navigableKeySet();
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    static class Values extends AbstractCollection {
        final Map map;

        Values(Map map) {
            this.map = (Map) Preconditions.checkNotNull(map);
        }

        final Map map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Maps.valueIterator(map().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : map().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        map().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSet = Sets.newHashSet();
                for (Map.Entry entry : map().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return map().keySet().removeAll(newHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSet = Sets.newHashSet();
                for (Map.Entry entry : map().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return map().keySet().retainAll(newHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return map().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            map().clear();
        }
    }

    static abstract class EntrySet extends Sets.ImprovedAbstractSet {
        abstract Map map();

        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object safeGet = Maps.safeGet(map(), key);
            if (Objects.equal(safeGet, entry.getValue())) {
                return safeGet != null || map().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return map().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.removeAllImpl(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        newHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return map().keySet().retainAll(newHashSetWithExpectedSize);
            }
        }
    }

    static abstract class DescendingMap extends ForwardingMap implements NavigableMap {
        private transient Comparator comparator;
        private transient Set entrySet;
        private transient NavigableSet navigableKeySet;

        abstract Iterator entryIterator();

        abstract NavigableMap forward();

        DescendingMap() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingObject
        public final Map delegate() {
            return forward();
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            Comparator comparator = this.comparator;
            if (comparator != null) {
                return comparator;
            }
            Comparator comparator2 = forward().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering reverse = reverse(comparator2);
            this.comparator = reverse;
            return reverse;
        }

        private static Ordering reverse(Comparator comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return forward().lastKey();
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return forward().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            return forward().higherEntry(obj);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return forward().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            return forward().ceilingEntry(obj);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return forward().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            return forward().floorEntry(obj);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return forward().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            return forward().lowerEntry(obj);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return forward().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            return forward().lastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            return forward().firstEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return forward().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return forward().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return forward();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set entrySet() {
            Set set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }

        Set createEntrySet() {
            return new EntrySet() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                Map map() {
                    return DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return DescendingMap.this.entryIterator();
                }
            };
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            NavigableSet navigableSet = this.navigableKeySet;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.navigableKeySet = navigableKeySet;
            return navigableKeySet;
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return forward().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return forward().subMap(obj2, z2, obj, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return forward().tailMap(obj, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return forward().headMap(obj, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Collection values() {
            return new Values(this);
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }
    }

    static ImmutableMap indexMap(Collection collection) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            builder.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return builder.buildOrThrow();
    }
}
