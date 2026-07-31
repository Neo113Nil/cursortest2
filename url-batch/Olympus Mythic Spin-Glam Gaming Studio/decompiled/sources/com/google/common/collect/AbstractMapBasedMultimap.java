package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map map;
    private transient int totalSize;

    abstract Collection<V> createCollection();

    static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i + 1;
        return i;
    }

    static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i - 1;
        return i;
    }

    static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize + i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize - i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.map = map;
    }

    final void setMap(Map<K, Collection<V>> map) {
        this.map = map;
        this.totalSize = 0;
        for (Collection<V> collection : map.values()) {
            Preconditions.checkArgument(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    Collection<V> createCollection(K k) {
        return createCollection();
    }

    Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.totalSize;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        Collection collection = (Collection) this.map.get(k);
        if (collection == null) {
            Collection<V> createCollection = createCollection(k);
            if (createCollection.add(v)) {
                this.totalSize++;
                this.map.put(k, createCollection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(v)) {
            return false;
        }
        this.totalSize++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Collection getOrCreateCollection(Object obj) {
        Collection collection = (Collection) this.map.get(obj);
        if (collection != null) {
            return collection;
        }
        Collection<V> createCollection = createCollection(obj);
        this.map.put(obj, createCollection);
        return createCollection;
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection orCreateCollection = getOrCreateCollection(k);
        Collection createCollection = createCollection();
        createCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection);
    }

    public Collection<V> removeAll(Object obj) {
        Collection collection = (Collection) this.map.remove(obj);
        if (collection == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection createCollection = createCollection();
        createCollection.addAll(collection);
        this.totalSize -= collection.size();
        collection.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection);
    }

    <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator<V> it = this.map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(K k) {
        Collection<V> collection = (Collection) this.map.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new WrappedCollection(k, collection, null);
    }

    final List<V> wrapList(K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        if (list instanceof RandomAccess) {
            return new RandomAccessWrappedList(k, list, wrappedCollection);
        }
        return new WrappedList(k, list, wrappedCollection);
    }

    class WrappedCollection extends AbstractCollection {
        final WrappedCollection ancestor;
        final Collection ancestorDelegate;
        Collection delegate;
        final Object key;

        WrappedCollection(Object obj, Collection collection, WrappedCollection wrappedCollection) {
            this.key = obj;
            this.delegate = collection;
            this.ancestor = wrappedCollection;
            this.ancestorDelegate = wrappedCollection == null ? null : wrappedCollection.getDelegate();
        }

        void refreshIfEmpty() {
            Collection collection;
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.refreshIfEmpty();
                if (this.ancestor.getDelegate() != this.ancestorDelegate) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.delegate.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.map.get(this.key)) == null) {
                    return;
                }
                this.delegate = collection;
            }
        }

        void removeIfEmpty() {
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.removeIfEmpty();
            } else if (this.delegate.isEmpty()) {
                AbstractMapBasedMultimap.this.map.remove(this.key);
            }
        }

        Object getKey() {
            return this.key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void addToMap() {
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection == null) {
                AbstractMapBasedMultimap.this.map.put(this.key, this.delegate);
            } else {
                wrappedCollection.addToMap();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            refreshIfEmpty();
            return this.delegate.size();
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            refreshIfEmpty();
            return this.delegate.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            refreshIfEmpty();
            return this.delegate.hashCode();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            refreshIfEmpty();
            return this.delegate.toString();
        }

        Collection getDelegate() {
            return this.delegate;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            refreshIfEmpty();
            return new WrappedIterator();
        }

        class WrappedIterator implements Iterator {
            final Iterator delegateIterator;
            final Collection originalDelegate;

            WrappedIterator() {
                Collection collection = WrappedCollection.this.delegate;
                this.originalDelegate = collection;
                this.delegateIterator = AbstractMapBasedMultimap.iteratorOrListIterator(collection);
            }

            WrappedIterator(Iterator it) {
                this.originalDelegate = WrappedCollection.this.delegate;
                this.delegateIterator = it;
            }

            void validateIterator() {
                WrappedCollection.this.refreshIfEmpty();
                if (WrappedCollection.this.delegate != this.originalDelegate) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                validateIterator();
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                validateIterator();
                return this.delegateIterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.delegateIterator.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                WrappedCollection.this.removeIfEmpty();
            }

            Iterator getDelegateIterator() {
                validateIterator();
                return this.delegateIterator;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            refreshIfEmpty();
            boolean isEmpty = this.delegate.isEmpty();
            boolean add = this.delegate.add(obj);
            if (add) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    addToMap();
                }
            }
            return add;
        }

        WrappedCollection getAncestor() {
            return this.ancestor;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.delegate.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            refreshIfEmpty();
            return this.delegate.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            refreshIfEmpty();
            return this.delegate.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.delegate.clear();
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            removeIfEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            refreshIfEmpty();
            boolean remove = this.delegate.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                removeIfEmpty();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.delegate.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.delegate.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return retainAll;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator iteratorOrListIterator(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    class WrappedSet extends WrappedCollection implements Set {
        WrappedSet(Object obj, Set set) {
            super(obj, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAllImpl = Sets.removeAllImpl((Set) this.delegate, collection);
            if (removeAllImpl) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAllImpl;
        }
    }

    class WrappedSortedSet extends WrappedCollection implements SortedSet {
        WrappedSortedSet(Object obj, SortedSet sortedSet, WrappedCollection wrappedCollection) {
            super(obj, sortedSet, wrappedCollection);
        }

        SortedSet getSortedSetDelegate() {
            return (SortedSet) getDelegate();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return getSortedSetDelegate().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            refreshIfEmpty();
            return getSortedSetDelegate().first();
        }

        @Override // java.util.SortedSet
        public Object last() {
            refreshIfEmpty();
            return getSortedSetDelegate().last();
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            refreshIfEmpty();
            return new WrappedSortedSet(getKey(), getSortedSetDelegate().headSet(obj), getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            refreshIfEmpty();
            return new WrappedSortedSet(getKey(), getSortedSetDelegate().subSet(obj, obj2), getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            refreshIfEmpty();
            return new WrappedSortedSet(getKey(), getSortedSetDelegate().tailSet(obj), getAncestor() == null ? this : getAncestor());
        }
    }

    class WrappedNavigableSet extends WrappedSortedSet implements NavigableSet {
        WrappedNavigableSet(Object obj, NavigableSet navigableSet, WrappedCollection wrappedCollection) {
            super(obj, navigableSet, wrappedCollection);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        public NavigableSet getSortedSetDelegate() {
            return (NavigableSet) super.getSortedSetDelegate();
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return getSortedSetDelegate().lower(obj);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return getSortedSetDelegate().floor(obj);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return getSortedSetDelegate().ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return getSortedSetDelegate().higher(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterators.pollNext(descendingIterator());
        }

        private NavigableSet wrap(NavigableSet navigableSet) {
            return new WrappedNavigableSet(this.key, navigableSet, getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return wrap(getSortedSetDelegate().descendingSet());
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return new WrappedCollection.WrappedIterator(getSortedSetDelegate().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return wrap(getSortedSetDelegate().subSet(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return wrap(getSortedSetDelegate().headSet(obj, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return wrap(getSortedSetDelegate().tailSet(obj, z));
        }
    }

    class WrappedList extends WrappedCollection implements List {
        WrappedList(Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }

        List getListDelegate() {
            return (List) getDelegate();
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = getListDelegate().addAll(i, collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, getDelegate().size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public Object get(int i) {
            refreshIfEmpty();
            return getListDelegate().get(i);
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            refreshIfEmpty();
            return getListDelegate().set(i, obj);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            refreshIfEmpty();
            boolean isEmpty = getDelegate().isEmpty();
            getListDelegate().add(i, obj);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                addToMap();
            }
        }

        @Override // java.util.List
        public Object remove(int i) {
            refreshIfEmpty();
            Object remove = getListDelegate().remove(i);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            removeIfEmpty();
            return remove;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            refreshIfEmpty();
            return new WrappedListIterator();
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            refreshIfEmpty();
            return new WrappedListIterator(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List subList(int i, int i2) {
            refreshIfEmpty();
            return AbstractMapBasedMultimap.this.wrapList(getKey(), getListDelegate().subList(i, i2), getAncestor() == null ? this : getAncestor());
        }

        private class WrappedListIterator extends WrappedCollection.WrappedIterator implements ListIterator {
            WrappedListIterator() {
                super();
            }

            public WrappedListIterator(int i) {
                super(WrappedList.this.getListDelegate().listIterator(i));
            }

            private ListIterator getDelegateListIterator() {
                return (ListIterator) getDelegateIterator();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return getDelegateListIterator().hasPrevious();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return getDelegateListIterator().previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return getDelegateListIterator().nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return getDelegateListIterator().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                getDelegateListIterator().set(obj);
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = WrappedList.this.isEmpty();
                getDelegateListIterator().add(obj);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    WrappedList.this.addToMap();
                }
            }
        }
    }

    private class RandomAccessWrappedList extends WrappedList implements RandomAccess {
        RandomAccessWrappedList(Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set<K> createKeySet() {
        return new KeySet(this.map);
    }

    final Set<K> createMaybeNavigableKeySet() {
        Map map = this.map;
        if (map instanceof NavigableMap) {
            return new NavigableKeySet((NavigableMap) this.map);
        }
        if (map instanceof SortedMap) {
            return new SortedKeySet((SortedMap) this.map);
        }
        return new KeySet(this.map);
    }

    private class KeySet extends Maps.KeySet {
        KeySet(Map map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            final Iterator<Map.Entry<K, V>> it = map().entrySet().iterator();
            return new Iterator(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1
                Map.Entry entry;
                final /* synthetic */ KeySet this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public Object next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.entry = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    Preconditions.checkState(this.entry != null, "no calls to next() since the last call to remove()");
                    Collection collection = (Collection) this.entry.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, collection.size());
                    collection.clear();
                    this.entry = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) map().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, i);
            } else {
                i = 0;
            }
            return i > 0;
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.clear(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return map().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || map().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return map().keySet().hashCode();
        }
    }

    private class SortedKeySet extends KeySet implements SortedSet {
        SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap sortedMap() {
            return (SortedMap) super.map();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return sortedMap().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(sortedMap().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return sortedMap().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(sortedMap().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(sortedMap().tailMap(obj));
        }
    }

    private final class NavigableKeySet extends SortedKeySet implements NavigableSet {
        NavigableKeySet(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public NavigableMap sortedMap() {
            return (NavigableMap) super.sortedMap();
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return sortedMap().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return sortedMap().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return sortedMap().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return sortedMap().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterators.pollNext(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new NavigableKeySet(sortedMap().descendingMap());
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return new NavigableKeySet(sortedMap().headMap(obj, z));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new NavigableKeySet(sortedMap().subMap(obj, z, obj2, z2));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return new NavigableKeySet(sortedMap().tailMap(obj, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) Maps.safeRemove(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    private abstract class Itr implements Iterator {
        final Iterator keyIterator;
        Object key = null;
        Collection collection = null;
        Iterator valueIterator = Iterators.emptyModifiableIterator();

        abstract Object output(Object obj, Object obj2);

        Itr() {
            this.keyIterator = AbstractMapBasedMultimap.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.keyIterator.hasNext() || this.valueIterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.valueIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) this.keyIterator.next();
                this.key = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.collection = collection;
                this.valueIterator = collection.iterator();
            }
            return output(NullnessCasts.uncheckedCastNullableTToT(this.key), this.valueIterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.valueIterator.remove();
            Collection collection = this.collection;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.keyIterator.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection<V> createValues() {
        return new AbstractMultimap.Values();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator<V> valueIterator() {
        return new Itr() { // from class: com.google.common.collect.AbstractMapBasedMultimap.1
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            Object output(Object obj, Object obj2) {
                return obj2;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    Multiset createKeys() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection<Map.Entry<K, V>> createEntries() {
        if (this instanceof SetMultimap) {
            return new AbstractMultimap.EntrySet();
        }
        return new AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator<Map.Entry<K, V>> entryIterator() {
        return new Itr() { // from class: com.google.common.collect.AbstractMapBasedMultimap.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            public Map.Entry output(Object obj, Object obj2) {
                return Maps.immutableEntry(obj, obj2);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map<K, Collection<V>> createAsMap() {
        return new AsMap(this.map);
    }

    final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map map = this.map;
        if (map instanceof NavigableMap) {
            return new NavigableAsMap((NavigableMap) this.map);
        }
        if (map instanceof SortedMap) {
            return new SortedAsMap((SortedMap) this.map);
        }
        return new AsMap(this.map);
    }

    private class AsMap extends Maps.ViewCachingAbstractMap {
        final transient Map submap;

        AsMap(Map map) {
            this.submap = map;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set createEntrySet() {
            return new AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.safeContainsKey(this.submap, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection get(Object obj) {
            Collection<V> collection = (Collection) Maps.safeGet(this.submap, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.submap.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection remove(Object obj) {
            Collection<? extends V> collection = (Collection) this.submap.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll(collection);
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, collection.size());
            collection.clear();
            return createCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.submap.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.submap.hashCode();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.submap.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.submap == AbstractMapBasedMultimap.this.map) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.clear(new AsMapIterator());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Map.Entry wrapEntry(Map.Entry entry) {
            Object key = entry.getKey();
            return Maps.immutableEntry(key, AbstractMapBasedMultimap.this.wrapCollection(key, (Collection) entry.getValue()));
        }

        class AsMapEntries extends Maps.EntrySet {
            AsMapEntries() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map map() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return AsMap.this.new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Collections2.safeContains(AsMap.this.submap.entrySet(), obj);
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.removeValuesForKey(entry.getKey());
                return true;
            }
        }

        class AsMapIterator implements Iterator {
            Collection collection;
            final Iterator delegateIterator;

            AsMapIterator() {
                this.delegateIterator = AsMap.this.submap.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.delegateIterator.next();
                this.collection = (Collection) entry.getValue();
                return AsMap.this.wrapEntry(entry);
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.collection != null, "no calls to next() since the last call to remove()");
                this.delegateIterator.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, this.collection.size());
                this.collection.clear();
                this.collection = null;
            }
        }
    }

    private class SortedAsMap extends AsMap implements SortedMap {
        SortedSet sortedKeySet;

        SortedAsMap(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap sortedMap() {
            return (SortedMap) this.submap;
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return sortedMap().firstKey();
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return sortedMap().lastKey();
        }

        public SortedMap headMap(Object obj) {
            return new SortedAsMap(sortedMap().headMap(obj));
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMap(sortedMap().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new SortedAsMap(sortedMap().tailMap(obj));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, java.util.AbstractMap, java.util.Map
        public SortedSet keySet() {
            SortedSet sortedSet = this.sortedKeySet;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet createKeySet = createKeySet();
            this.sortedKeySet = createKeySet;
            return createKeySet;
        }

        SortedSet createKeySet() {
            return new SortedKeySet(sortedMap());
        }
    }

    private final class NavigableAsMap extends SortedAsMap implements NavigableMap {
        NavigableAsMap(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public NavigableMap sortedMap() {
            return (NavigableMap) super.sortedMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry<K, V> lowerEntry = sortedMap().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return wrapEntry(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return sortedMap().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry<K, V> floorEntry = sortedMap().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return wrapEntry(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return sortedMap().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry<K, V> ceilingEntry = sortedMap().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return wrapEntry(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return sortedMap().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry<K, V> higherEntry = sortedMap().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return wrapEntry(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return sortedMap().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry<K, V> firstEntry = sortedMap().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return wrapEntry(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry<K, V> lastEntry = sortedMap().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return wrapEntry(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return pollAsMapEntry(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return pollAsMapEntry(descendingMap().entrySet().iterator());
        }

        Map.Entry pollAsMapEntry(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection<V> createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll((Collection) entry.getValue());
            it.remove();
            return Maps.immutableEntry(entry.getKey(), AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(createCollection));
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return new NavigableAsMap(sortedMap().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, java.util.AbstractMap, java.util.Map
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public NavigableSet createKeySet() {
            return new NavigableKeySet(sortedMap());
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return new NavigableAsMap(sortedMap().subMap(obj, z, obj2, z2));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return new NavigableAsMap(sortedMap().headMap(obj, z));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return new NavigableAsMap(sortedMap().tailMap(obj, z));
        }
    }
}
