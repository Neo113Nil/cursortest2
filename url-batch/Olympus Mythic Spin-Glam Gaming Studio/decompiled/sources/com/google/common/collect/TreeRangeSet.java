package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet implements Serializable {
    private transient Set asDescendingSetOfRanges;
    private transient Set asRanges;
    private transient RangeSet complement;
    final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    @Override // com.google.common.collect.AbstractRangeSet
    public /* bridge */ /* synthetic */ void addAll(RangeSet rangeSet) {
        super.addAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(RangeSet rangeSet) {
        super.removeAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(RangeSet rangeSet) {
        TreeRangeSet<C> create = create();
        create.addAll(rangeSet);
        return create;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> create = create();
        create.addAll(iterable);
        return create;
    }

    private TreeRangeSet(NavigableMap navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this.rangesByLowerBound.values());
        this.asRanges = asRanges;
        return asRanges;
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = asRanges;
        return asRanges;
    }

    final class AsRanges extends ForwardingCollection implements Set {
        final Collection delegate;

        AsRanges(Collection collection) {
            this.delegate = collection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingObject
        public Collection delegate() {
            return this.delegate;
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

    @Override // com.google.common.collect.AbstractRangeSet
    public Range<C> rangeContaining(C c) {
        Preconditions.checkNotNull(c);
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(c));
        if (floorEntry == null || !floorEntry.getValue().contains(c)) {
            return null;
        }
        return floorEntry.getValue();
    }

    public boolean intersects(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> ceilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (ceilingEntry != null && ceilingEntry.getValue().isConnected(range) && !ceilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (lowerEntry == null || !lowerEntry.getValue().isConnected(range) || lowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return floorEntry != null && floorEntry.getValue().encloses(range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Range rangeEnclosing(Range range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry == null || !floorEntry.getValue().encloses(range)) {
            return null;
        }
        return floorEntry.getValue();
    }

    public Range<C> span() {
        Map.Entry<Cut<C>, Range<C>> firstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<Cut<C>, Range<C>> lastEntry = this.rangesByLowerBound.lastEntry();
        if (firstEntry == null || lastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(firstEntry.getValue().lowerBound, lastEntry.getValue().upperBound);
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public void add(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        Cut<C> cut = range.lowerBound;
        Cut<C> cut2 = range.upperBound;
        Map.Entry<Cut<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(cut);
        if (lowerEntry != null) {
            Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(cut) >= 0) {
                if (value.upperBound.compareTo(cut2) >= 0) {
                    cut2 = value.upperBound;
                }
                cut = value.lowerBound;
            }
        }
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(cut2);
        if (floorEntry != null) {
            Range<C> value2 = floorEntry.getValue();
            if (value2.upperBound.compareTo(cut2) >= 0) {
                cut2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(cut, cut2).clear();
        replaceRangeWithSameLowerBound(Range.create(cut, cut2));
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public void remove(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<Cut<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (lowerEntry != null) {
            Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(range.lowerBound) >= 0) {
                if (range.hasUpperBound() && value.upperBound.compareTo(range.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(range.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(Range.create(value.lowerBound, range.lowerBound));
            }
        }
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
        if (floorEntry != null) {
            Range<C> value2 = floorEntry.getValue();
            if (range.hasUpperBound() && value2.upperBound.compareTo(range.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(Range.create(range.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    private void replaceRangeWithSameLowerBound(Range range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet complement() {
        RangeSet rangeSet = this.complement;
        if (rangeSet != null) {
            return rangeSet;
        }
        Complement complement = new Complement();
        this.complement = complement;
        return complement;
    }

    static final class RangesByUpperBound extends AbstractNavigableMap {
        private final NavigableMap rangesByLowerBound;
        private final Range upperBoundWindow;

        RangesByUpperBound(NavigableMap navigableMap) {
            this.rangesByLowerBound = navigableMap;
            this.upperBoundWindow = Range.all();
        }

        private RangesByUpperBound(NavigableMap navigableMap, Range range) {
            this.rangesByLowerBound = navigableMap;
            this.upperBoundWindow = range;
        }

        private NavigableMap subMap(Range range) {
            if (range.isConnected(this.upperBoundWindow)) {
                return new RangesByUpperBound(this.rangesByLowerBound, range.intersection(this.upperBoundWindow));
            }
            return ImmutableSortedMap.of();
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Cut cut, boolean z, Cut cut2, boolean z2) {
            return subMap(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Cut cut, boolean z) {
            return subMap(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Cut cut, boolean z) {
            return subMap(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Range get(Object obj) {
            Map.Entry lowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.upperBoundWindow.contains(cut) && (lowerEntry = this.rangesByLowerBound.lowerEntry(cut)) != null && ((Range) lowerEntry.getValue()).upperBound.equals(cut)) {
                        return (Range) lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator entryIterator() {
            final Iterator it;
            if (!this.upperBoundWindow.hasLowerBound()) {
                it = this.rangesByLowerBound.values().iterator();
            } else {
                Map.Entry lowerEntry = this.rangesByLowerBound.lowerEntry((Cut) this.upperBoundWindow.lowerEndpoint());
                if (lowerEntry == null) {
                    it = this.rangesByLowerBound.values().iterator();
                } else if (this.upperBoundWindow.lowerBound.isLessThan(((Range) lowerEntry.getValue()).upperBound)) {
                    it = this.rangesByLowerBound.tailMap((Cut) lowerEntry.getKey(), true).values().iterator();
                } else {
                    it = this.rangesByLowerBound.tailMap((Cut) this.upperBoundWindow.lowerEndpoint(), true).values().iterator();
                }
            }
            return new AbstractIterator(this) { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.1
                final /* synthetic */ RangesByUpperBound this$0;

                {
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry computeNext() {
                    if (!it.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    Range range = (Range) it.next();
                    if (this.this$0.upperBoundWindow.upperBound.isLessThan(range.upperBound)) {
                        return (Map.Entry) endOfData();
                    }
                    return Maps.immutableEntry(range.upperBound, range);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator descendingEntryIterator() {
            Collection values;
            if (this.upperBoundWindow.hasUpperBound()) {
                values = this.rangesByLowerBound.headMap((Cut) this.upperBoundWindow.upperEndpoint(), false).descendingMap().values();
            } else {
                values = this.rangesByLowerBound.descendingMap().values();
            }
            final PeekingIterator peekingIterator = Iterators.peekingIterator(values.iterator());
            if (peekingIterator.hasNext() && this.upperBoundWindow.upperBound.isLessThan(((Range) peekingIterator.peek()).upperBound)) {
                peekingIterator.next();
            }
            return new AbstractIterator(this) { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.2
                final /* synthetic */ RangesByUpperBound this$0;

                {
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry computeNext() {
                    if (!peekingIterator.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    Range range = (Range) peekingIterator.next();
                    if (this.this$0.upperBoundWindow.lowerBound.isLessThan(range.upperBound)) {
                        return Maps.immutableEntry(range.upperBound, range);
                    }
                    return (Map.Entry) endOfData();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            if (this.upperBoundWindow.equals(Range.all())) {
                return this.rangesByLowerBound.size();
            }
            return Iterators.size(entryIterator());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.upperBoundWindow.equals(Range.all())) {
                return this.rangesByLowerBound.isEmpty();
            }
            return !entryIterator().hasNext();
        }
    }

    private static final class ComplementRangesByLowerBound extends AbstractNavigableMap {
        private final Range complementLowerBoundWindow;
        private final NavigableMap positiveRangesByLowerBound;
        private final NavigableMap positiveRangesByUpperBound;

        ComplementRangesByLowerBound(NavigableMap navigableMap) {
            this(navigableMap, Range.all());
        }

        private ComplementRangesByLowerBound(NavigableMap navigableMap, Range range) {
            this.positiveRangesByLowerBound = navigableMap;
            this.positiveRangesByUpperBound = new RangesByUpperBound(navigableMap);
            this.complementLowerBoundWindow = range;
        }

        private NavigableMap subMap(Range range) {
            if (!this.complementLowerBoundWindow.isConnected(range)) {
                return ImmutableSortedMap.of();
            }
            return new ComplementRangesByLowerBound(this.positiveRangesByLowerBound, range.intersection(this.complementLowerBoundWindow));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Cut cut, boolean z, Cut cut2, boolean z2) {
            return subMap(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Cut cut, boolean z) {
            return subMap(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Cut cut, boolean z) {
            return subMap(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return Ordering.natural();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator entryIterator() {
            Collection values;
            Cut cut;
            if (this.complementLowerBoundWindow.hasLowerBound()) {
                values = this.positiveRangesByUpperBound.tailMap((Cut) this.complementLowerBoundWindow.lowerEndpoint(), this.complementLowerBoundWindow.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                values = this.positiveRangesByUpperBound.values();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(values.iterator());
            if (this.complementLowerBoundWindow.contains(Cut.belowAll()) && (!peekingIterator.hasNext() || ((Range) peekingIterator.peek()).lowerBound != Cut.belowAll())) {
                cut = Cut.belowAll();
            } else if (peekingIterator.hasNext()) {
                cut = ((Range) peekingIterator.next()).upperBound;
            } else {
                return Iterators.emptyIterator();
            }
            return new AbstractIterator(this, cut, peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1
                Cut nextComplementRangeLowerBound;
                final /* synthetic */ ComplementRangesByLowerBound this$0;
                final /* synthetic */ Cut val$firstComplementRangeLowerBound;
                final /* synthetic */ PeekingIterator val$positiveItr;

                {
                    this.val$firstComplementRangeLowerBound = cut;
                    this.val$positiveItr = peekingIterator;
                    this.this$0 = this;
                    this.nextComplementRangeLowerBound = cut;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry computeNext() {
                    Range create;
                    if (this.this$0.complementLowerBoundWindow.upperBound.isLessThan(this.nextComplementRangeLowerBound) || this.nextComplementRangeLowerBound == Cut.aboveAll()) {
                        return (Map.Entry) endOfData();
                    }
                    if (this.val$positiveItr.hasNext()) {
                        Range range = (Range) this.val$positiveItr.next();
                        create = Range.create(this.nextComplementRangeLowerBound, range.lowerBound);
                        this.nextComplementRangeLowerBound = range.upperBound;
                    } else {
                        create = Range.create(this.nextComplementRangeLowerBound, Cut.aboveAll());
                        this.nextComplementRangeLowerBound = Cut.aboveAll();
                    }
                    return Maps.immutableEntry(create.lowerBound, create);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator descendingEntryIterator() {
            Cut aboveAll;
            Object obj;
            if (this.complementLowerBoundWindow.hasUpperBound()) {
                aboveAll = (Cut) this.complementLowerBoundWindow.upperEndpoint();
            } else {
                aboveAll = Cut.aboveAll();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.positiveRangesByUpperBound.headMap(aboveAll, this.complementLowerBoundWindow.hasUpperBound() && this.complementLowerBoundWindow.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (peekingIterator.hasNext()) {
                if (((Range) peekingIterator.peek()).upperBound == Cut.aboveAll()) {
                    obj = ((Range) peekingIterator.next()).lowerBound;
                } else {
                    obj = (Cut) this.positiveRangesByLowerBound.higherKey(((Range) peekingIterator.peek()).upperBound);
                }
            } else {
                if (!this.complementLowerBoundWindow.contains(Cut.belowAll()) || this.positiveRangesByLowerBound.containsKey(Cut.belowAll())) {
                    return Iterators.emptyIterator();
                }
                obj = (Cut) this.positiveRangesByLowerBound.higherKey(Cut.belowAll());
            }
            return new AbstractIterator(this, (Cut) MoreObjects.firstNonNull(obj, Cut.aboveAll()), peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2
                Cut nextComplementRangeUpperBound;
                final /* synthetic */ ComplementRangesByLowerBound this$0;
                final /* synthetic */ Cut val$firstComplementRangeUpperBound;
                final /* synthetic */ PeekingIterator val$positiveItr;

                {
                    this.val$firstComplementRangeUpperBound = r2;
                    this.val$positiveItr = peekingIterator;
                    this.this$0 = this;
                    this.nextComplementRangeUpperBound = r2;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry computeNext() {
                    if (this.nextComplementRangeUpperBound == Cut.belowAll()) {
                        return (Map.Entry) endOfData();
                    }
                    if (!this.val$positiveItr.hasNext()) {
                        if (this.this$0.complementLowerBoundWindow.lowerBound.isLessThan(Cut.belowAll())) {
                            Range create = Range.create(Cut.belowAll(), this.nextComplementRangeUpperBound);
                            this.nextComplementRangeUpperBound = Cut.belowAll();
                            return Maps.immutableEntry(Cut.belowAll(), create);
                        }
                    } else {
                        Range range = (Range) this.val$positiveItr.next();
                        Range create2 = Range.create(range.upperBound, this.nextComplementRangeUpperBound);
                        this.nextComplementRangeUpperBound = range.lowerBound;
                        if (this.this$0.complementLowerBoundWindow.lowerBound.isLessThan(create2.lowerBound)) {
                            return Maps.immutableEntry(create2.lowerBound, create2);
                        }
                    }
                    return (Map.Entry) endOfData();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(entryIterator());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Range get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    Map.Entry firstEntry = tailMap(cut, true).firstEntry();
                    if (firstEntry != null && ((Cut) firstEntry.getKey()).equals(cut)) {
                        return (Range) firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }
    }

    private final class Complement extends TreeRangeSet<C> {
        Complement() {
            super(new ComplementRangesByLowerBound(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet
        public boolean contains(C c) {
            return !TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet complement() {
            return TreeRangeSet.this;
        }
    }

    private static final class SubRangeSetRangesByLowerBound extends AbstractNavigableMap {
        private final Range lowerBoundWindow;
        private final NavigableMap rangesByLowerBound;
        private final NavigableMap rangesByUpperBound;
        private final Range restriction;

        private SubRangeSetRangesByLowerBound(Range range, Range range2, NavigableMap navigableMap) {
            this.lowerBoundWindow = (Range) Preconditions.checkNotNull(range);
            this.restriction = (Range) Preconditions.checkNotNull(range2);
            this.rangesByLowerBound = (NavigableMap) Preconditions.checkNotNull(navigableMap);
            this.rangesByUpperBound = new RangesByUpperBound(navigableMap);
        }

        private NavigableMap subMap(Range range) {
            if (!range.isConnected(this.lowerBoundWindow)) {
                return ImmutableSortedMap.of();
            }
            return new SubRangeSetRangesByLowerBound(this.lowerBoundWindow.intersection(range), this.restriction, this.rangesByLowerBound);
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Cut cut, boolean z, Cut cut2, boolean z2) {
            return subMap(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Cut cut, boolean z) {
            return subMap(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Cut cut, boolean z) {
            return subMap(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Range get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.lowerBoundWindow.contains(cut) && cut.compareTo((Cut) this.restriction.lowerBound) >= 0 && cut.compareTo((Cut) this.restriction.upperBound) < 0) {
                        if (cut.equals(this.restriction.lowerBound)) {
                            Range range = (Range) Maps.valueOrNull(this.rangesByLowerBound.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((Cut) this.restriction.lowerBound) > 0) {
                                return range.intersection(this.restriction);
                            }
                        } else {
                            Range range2 = (Range) this.rangesByLowerBound.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.restriction);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator entryIterator() {
            final Iterator it;
            if (this.restriction.isEmpty()) {
                return Iterators.emptyIterator();
            }
            if (this.lowerBoundWindow.upperBound.isLessThan(this.restriction.lowerBound)) {
                return Iterators.emptyIterator();
            }
            if (this.lowerBoundWindow.lowerBound.isLessThan(this.restriction.lowerBound)) {
                it = this.rangesByUpperBound.tailMap(this.restriction.lowerBound, false).values().iterator();
            } else {
                it = this.rangesByLowerBound.tailMap((Cut) this.lowerBoundWindow.lowerBound.endpoint(), this.lowerBoundWindow.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            final Cut cut = (Cut) Ordering.natural().min(this.lowerBoundWindow.upperBound, Cut.belowValue(this.restriction.upperBound));
            return new AbstractIterator(this) { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.1
                final /* synthetic */ SubRangeSetRangesByLowerBound this$0;

                {
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry computeNext() {
                    if (!it.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    Range range = (Range) it.next();
                    if (!cut.isLessThan(range.lowerBound)) {
                        Range intersection = range.intersection(this.this$0.restriction);
                        return Maps.immutableEntry(intersection.lowerBound, intersection);
                    }
                    return (Map.Entry) endOfData();
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator descendingEntryIterator() {
            if (this.restriction.isEmpty()) {
                return Iterators.emptyIterator();
            }
            Cut cut = (Cut) Ordering.natural().min(this.lowerBoundWindow.upperBound, Cut.belowValue(this.restriction.upperBound));
            final Iterator it = this.rangesByLowerBound.headMap((Cut) cut.endpoint(), cut.typeAsUpperBound() == BoundType.CLOSED).descendingMap().values().iterator();
            return new AbstractIterator(this) { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.2
                final /* synthetic */ SubRangeSetRangesByLowerBound this$0;

                {
                    this.this$0 = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry computeNext() {
                    if (!it.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    Range range = (Range) it.next();
                    if (this.this$0.restriction.lowerBound.compareTo((Cut) range.upperBound) < 0) {
                        Range intersection = range.intersection(this.this$0.restriction);
                        if (this.this$0.lowerBoundWindow.contains(intersection.lowerBound)) {
                            return Maps.immutableEntry(intersection.lowerBound, intersection);
                        }
                        return (Map.Entry) endOfData();
                    }
                    return (Map.Entry) endOfData();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(entryIterator());
        }
    }

    public RangeSet subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new SubRangeSet(range);
    }

    private final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        SubRangeSet(Range<C> range) {
            super(new SubRangeSetRangesByLowerBound(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.restriction = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean encloses(Range<C> range) {
            Range rangeEnclosing;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeEnclosing = TreeRangeSet.this.rangeEnclosing(range)) == null || rangeEnclosing.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet
        public Range<C> rangeContaining(C c) {
            Range<C> rangeContaining;
            if (this.restriction.contains(c) && (rangeContaining = TreeRangeSet.this.rangeContaining(c)) != null) {
                return rangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet
        public void add(Range<C> range) {
            Preconditions.checkArgument(this.restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.restriction);
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet
        public void remove(Range<C> range) {
            if (range.isConnected(this.restriction)) {
                TreeRangeSet.this.remove(range.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet
        public boolean contains(C c) {
            return this.restriction.contains(c) && TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet
        public void clear() {
            TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet
        public RangeSet subRangeSet(Range<C> range) {
            if (range.encloses(this.restriction)) {
                return this;
            }
            if (range.isConnected(this.restriction)) {
                return new SubRangeSet(this.restriction.intersection(range));
            }
            return ImmutableRangeSet.of();
        }
    }
}
