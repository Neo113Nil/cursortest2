package kotlin.collections.builders;

import com.safedk.android.analytics.brandsafety.m;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0000\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0003QRSB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0015\u0010'\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u001d\u0010'\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u0010+\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\b\u0010.\u001a\u00020)H\u0016J\u0015\u0010/\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u00100\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u0016\u00101\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u0016\u00102\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0016J'\u00106\u001a\b\u0012\u0004\u0012\u0002H70\r\"\u0004\b\u0001\u001072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H70\rH\u0016¢\u0006\u0002\u00109J\u0015\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\rH\u0016¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010=\u001a\u00020\tH\u0016J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\tH\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\tH\u0002J\u0014\u0010F\u001a\u00020\u00112\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0018\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0002J\u001d\u0010I\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010*J&\u0010J\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010C\u001a\u00020\tH\u0002J\u0015\u0010K\u001a\u00028\u00002\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u001cJ\u0018\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0002J.\u0010O\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010P\u001a\u00020\u0011H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006T"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initialCapacity", "", "<init>", "(I)V", "backing", "", "[Ljava/lang/Object;", "length", "isReadOnly", "", "build", "", "writeReplace", "", "size", "getSize", "()I", "isEmpty", "get", "index", "(I)Ljava/lang/Object;", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", m.l, "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "removeAt", "remove", "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "registerModification", "checkIsMutable", "ensureExtraCapacity", "n", "ensureCapacityInternal", "minCapacity", "contentEquals", "insertAtInternal", "i", "addAtInternal", "addAllInternal", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Companion", "Itr", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ListBuilder<E> extends AbstractMutableList implements List<E>, RandomAccess, Serializable, KMutableList {
    private static final Companion Companion = new Companion(null);
    private static final ListBuilder Empty;

    @NotNull
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    public ListBuilder() {
        this(0, 1, null);
    }

    public ListBuilder(int i) {
        this.backing = (E[]) ListBuilderKt.arrayOfUninitializedElements(i);
    }

    public /* synthetic */ ListBuilder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* compiled from: ListBuilder.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    @NotNull
    public final List<E> build() {
        checkIsMutable();
        this.isReadOnly = true;
        return this.length > 0 ? this : Empty;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: getSize, reason: from getter */
    public int getLength() {
        return this.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        return this.backing[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        E[] eArr = this.backing;
        E e = eArr[index];
        eArr[index] = element;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.areEqual(this.backing[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(this.backing[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        return new Itr(this, index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        checkIsMutable();
        addAtInternal(this.length, element);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        addAtInternal(index, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.length, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        int size = elements.size();
        addAllInternal(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.length);
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        return (E) removeAtInternal(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        checkIsMutable();
        int indexOf = indexOf(element);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
        return new BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.length;
        if (length < i) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i, array.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }
        ArraysKt.copyInto(this.backing, array, 0, 0, i);
        return (T[]) CollectionsKt.terminateCollectionToArray(this.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return ArraysKt.copyOfRange(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object other) {
        return other == this || ((other instanceof List) && contentEquals((List) other));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int subarrayContentHashCode;
        subarrayContentHashCode = ListBuilderKt.subarrayContentHashCode(this.backing, 0, this.length);
        return subarrayContentHashCode;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        String subarrayContentToString;
        subarrayContentToString = ListBuilderKt.subarrayContentToString(this.backing, 0, this.length, this);
        return subarrayContentToString;
    }

    private final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    private final void checkIsMutable() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final void ensureExtraCapacity(int n) {
        ensureCapacityInternal(this.length + n);
    }

    private final void ensureCapacityInternal(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) ListBuilderKt.copyOfUninitializedElements(this.backing, AbstractList.Companion.newCapacity$kotlin_stdlib(eArr.length, minCapacity));
        }
    }

    private final boolean contentEquals(List other) {
        boolean subarrayContentEquals;
        subarrayContentEquals = ListBuilderKt.subarrayContentEquals(this.backing, 0, this.length, other);
        return subarrayContentEquals;
    }

    private final void insertAtInternal(int i, int n) {
        ensureExtraCapacity(n);
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, i + n, i, this.length);
        this.length += n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAtInternal(int i, Object element) {
        registerModification();
        insertAtInternal(i, 1);
        ((E[]) this.backing)[i] = element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAllInternal(int i, Collection elements, int n) {
        registerModification();
        insertAtInternal(i, n);
        Iterator<E> it = elements.iterator();
        for (int i2 = 0; i2 < n; i2++) {
            this.backing[i + i2] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeAtInternal(int i) {
        registerModification();
        E[] eArr = this.backing;
        E e = eArr[i];
        ArraysKt.copyInto(eArr, eArr, i, i + 1, this.length);
        ListBuilderKt.resetAt(this.backing, this.length - 1);
        this.length--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRangeInternal(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            registerModification();
        }
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i = this.length;
        ListBuilderKt.resetRange(eArr2, i - rangeLength, i);
        this.length -= rangeLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection elements, boolean retain) {
        int i = 0;
        int i2 = 0;
        while (i < rangeLength) {
            int i3 = rangeOffset + i;
            if (elements.contains(this.backing[i3]) == retain) {
                E[] eArr = this.backing;
                i++;
                eArr[i2 + rangeOffset] = eArr[i3];
                i2++;
            } else {
                i++;
            }
        }
        int i4 = rangeLength - i2;
        E[] eArr2 = this.backing;
        ArraysKt.copyInto(eArr2, eArr2, rangeOffset + i2, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i5 = this.length;
        ListBuilderKt.resetRange(eArr3, i5 - i4, i5);
        if (i4 > 0) {
            registerModification();
        }
        this.length -= i4;
        return i4;
    }

    /* compiled from: ListBuilder.kt */
    private static final class Itr implements ListIterator, KMappedMarker {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final ListBuilder list;

        public Itr(ListBuilder list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i;
            this.lastIndex = -1;
            this.expectedModCount = ((java.util.AbstractList) list).modCount;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.length;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            checkForComodification();
            int i = this.index;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.index = i2;
            this.lastIndex = i2;
            return this.list.backing[this.lastIndex];
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            checkForComodification();
            if (this.index >= this.list.length) {
                throw new NoSuchElementException();
            }
            int i = this.index;
            this.index = i + 1;
            this.lastIndex = i;
            return this.list.backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            checkForComodification();
            int i = this.lastIndex;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i, obj);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            checkForComodification();
            ListBuilder listBuilder = this.list;
            int i = this.index;
            this.index = i + 1;
            listBuilder.add(i, obj);
            this.lastIndex = -1;
            this.expectedModCount = ((java.util.AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForComodification();
            int i = this.lastIndex;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.remove(i);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((java.util.AbstractList) this.list).modCount;
        }

        private final void checkForComodification() {
            if (((java.util.AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001QBC\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010!J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010$H\u0096\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010&H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010&2\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\u0015\u0010'\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010(J\u001d\u0010'\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-H\u0016J\u001e\u0010+\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-H\u0016J\b\u0010.\u001a\u00020)H\u0016J\u0015\u0010/\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u00100\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010(J\u0016\u00101\u001a\u00020\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-H\u0016J\u0016\u00102\u001a\u00020\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-H\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000bH\u0016J'\u00106\u001a\b\u0012\u0004\u0012\u0002H70\t\"\u0004\b\u0002\u001072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H70\tH\u0016¢\u0006\u0002\u00109J\u0015\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\tH\u0016¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00192\b\u0010<\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010=\u001a\u00020\u000bH\u0016J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020)H\u0002J\b\u0010B\u001a\u00020)H\u0002J\u0014\u0010E\u001a\u00020\u00192\n\u0010<\u001a\u0006\u0012\u0002\b\u00030FH\u0002J\u001d\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010*J&\u0010I\u001a\u00020)2\u0006\u0010H\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-2\u0006\u0010J\u001a\u00020\u000bH\u0002J\u0015\u0010K\u001a\u00028\u00012\u0006\u0010H\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u001cJ\u0018\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000bH\u0002J.\u0010O\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-2\u0006\u0010P\u001a\u00020\u0019H\u0002R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010C\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006R"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "backing", "", "offset", "", "length", "parent", "root", "Lkotlin/collections/builders/ListBuilder;", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "writeReplace", "", "size", "getSize", "()I", "isEmpty", "", "get", "index", "(I)Ljava/lang/Object;", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", m.l, "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "removeAt", "remove", "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "registerModification", "checkForComodification", "checkIsMutable", "isReadOnly", "()Z", "contentEquals", "", "addAtInternal", "i", "addAllInternal", "n", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Itr", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuilderSubList<E> extends AbstractMutableList implements List<E>, RandomAccess, Serializable, KMutableList {

        @NotNull
        private E[] backing;
        private int length;
        private final int offset;

        @Nullable
        private final BuilderSubList<E> parent;

        @NotNull
        private final ListBuilder<E> root;

        public BuilderSubList(@NotNull E[] backing, int i, int i2, @Nullable BuilderSubList<E> builderSubList, @NotNull ListBuilder<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.backing = backing;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = root;
            ((java.util.AbstractList) this).modCount = ((java.util.AbstractList) root).modCount;
        }

        private final Object writeReplace() {
            if (isReadOnly()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // kotlin.collections.AbstractMutableList
        /* renamed from: getSize */
        public int getLength() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            checkForComodification();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            checkIsMutable();
            checkForComodification();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
            E[] eArr = this.backing;
            int i = this.offset;
            E e = eArr[i + index];
            eArr[i + index] = element;
            return e;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            checkForComodification();
            for (int i = 0; i < this.length; i++) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            checkForComodification();
            for (int i = this.length - 1; i >= 0; i--) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int index) {
            checkForComodification();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
            return new Itr(this, index);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            checkIsMutable();
            checkForComodification();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
            addAtInternal(this.offset + index, element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            int size = elements.size();
            addAllInternal(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
            int size = elements.size();
            addAllInternal(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // kotlin.collections.AbstractMutableList
        public E removeAt(int index) {
            checkIsMutable();
            checkForComodification();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
            return (E) removeAtInternal(this.offset + index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            checkIsMutable();
            checkForComodification();
            int indexOf = indexOf(element);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            return indexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int fromIndex, int toIndex) {
            AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
            return new BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            checkForComodification();
            int length = array.length;
            int i = this.length;
            if (length < i) {
                E[] eArr = this.backing;
                int i2 = this.offset;
                T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, array.getClass());
                Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
                return tArr;
            }
            E[] eArr2 = this.backing;
            int i3 = this.offset;
            ArraysKt.copyInto(eArr2, array, 0, i3, i + i3);
            return (T[]) CollectionsKt.terminateCollectionToArray(this.length, array);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            checkForComodification();
            E[] eArr = this.backing;
            int i = this.offset;
            return ArraysKt.copyOfRange(eArr, i, this.length + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object other) {
            checkForComodification();
            return other == this || ((other instanceof List) && contentEquals((List) other));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int subarrayContentHashCode;
            checkForComodification();
            subarrayContentHashCode = ListBuilderKt.subarrayContentHashCode(this.backing, this.offset, this.length);
            return subarrayContentHashCode;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public String toString() {
            String subarrayContentToString;
            checkForComodification();
            subarrayContentToString = ListBuilderKt.subarrayContentToString(this.backing, this.offset, this.length, this);
            return subarrayContentToString;
        }

        private final void registerModification() {
            ((java.util.AbstractList) this).modCount++;
        }

        private final void checkForComodification() {
            if (((java.util.AbstractList) this.root).modCount != ((java.util.AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void checkIsMutable() {
            if (isReadOnly()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean isReadOnly() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final boolean contentEquals(List other) {
            boolean subarrayContentEquals;
            subarrayContentEquals = ListBuilderKt.subarrayContentEquals(this.backing, this.offset, this.length, other);
            return subarrayContentEquals;
        }

        private final void addAtInternal(int i, Object element) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.addAtInternal(i, element);
            } else {
                builderSubList.addAtInternal(i, element);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void addAllInternal(int i, Collection elements, int n) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.addAllInternal(i, elements, n);
            } else {
                builderSubList.addAllInternal(i, elements, n);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += n;
        }

        private final Object removeAtInternal(int i) {
            Object removeAtInternal;
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                removeAtInternal = this.root.removeAtInternal(i);
            } else {
                removeAtInternal = builderSubList.removeAtInternal(i);
            }
            this.length--;
            return removeAtInternal;
        }

        private final void removeRangeInternal(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                registerModification();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.removeRangeInternal(rangeOffset, rangeLength);
            } else {
                builderSubList.removeRangeInternal(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        private final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection elements, boolean retain) {
            int retainOrRemoveAllInternal;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                retainOrRemoveAllInternal = this.root.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain);
            } else {
                retainOrRemoveAllInternal = builderSubList.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain);
            }
            if (retainOrRemoveAllInternal > 0) {
                registerModification();
            }
            this.length -= retainOrRemoveAllInternal;
            return retainOrRemoveAllInternal;
        }

        /* compiled from: ListBuilder.kt */
        private static final class Itr implements ListIterator, KMappedMarker {
            private int expectedModCount;
            private int index;
            private int lastIndex;
            private final BuilderSubList list;

            public Itr(BuilderSubList list, int i) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.list = list;
                this.index = i;
                this.lastIndex = -1;
                this.expectedModCount = ((java.util.AbstractList) list).modCount;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < this.list.length;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                checkForComodification();
                int i = this.index;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.index = i2;
                this.lastIndex = i2;
                return this.list.backing[this.list.offset + this.lastIndex];
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                checkForComodification();
                if (this.index >= this.list.length) {
                    throw new NoSuchElementException();
                }
                int i = this.index;
                this.index = i + 1;
                this.lastIndex = i;
                return this.list.backing[this.list.offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                checkForComodification();
                int i = this.lastIndex;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i, obj);
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                checkForComodification();
                BuilderSubList builderSubList = this.list;
                int i = this.index;
                this.index = i + 1;
                builderSubList.add(i, obj);
                this.lastIndex = -1;
                this.expectedModCount = ((java.util.AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                checkForComodification();
                int i = this.lastIndex;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.remove(i);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((java.util.AbstractList) this.list).modCount;
            }

            private final void checkForComodification() {
                if (((java.util.AbstractList) this.list.root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }
}
