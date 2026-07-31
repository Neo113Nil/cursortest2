package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: UIntArray.kt */
/* loaded from: classes14.dex */
public final class UIntArray implements Collection, KMappedMarker {
    private final int[] storage;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UIntArray m8060boximpl(int[] iArr) {
        return new UIntArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m8062constructorimpl(int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8065equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof UIntArray) && Intrinsics.areEqual(iArr, ((UIntArray) obj).m8074unboximpl());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8068hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8072toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m8065equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m8068hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    public String toString() {
        return m8072toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m8074unboximpl() {
        return this.storage;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m8073containsWZ4Q5Ns(((UInt) obj).m8059unboximpl());
        }
        return false;
    }

    private /* synthetic */ UIntArray(int[] iArr) {
        this.storage = iArr;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m8061constructorimpl(int i) {
        return m8062constructorimpl(new int[i]);
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m8066getpVg5ArA(int[] iArr, int i) {
        return UInt.m8055constructorimpl(iArr[i]);
    }

    /* renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m8071setVXSXFK8(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m8067getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m8067getSizeimpl(this.storage);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator m8070iteratorimpl(int[] iArr) {
        return new Iterator(iArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return m8070iteratorimpl(this.storage);
    }

    /* compiled from: UIntArray.kt */
    private static final class Iterator implements java.util.Iterator, KMappedMarker {
        private final int[] array;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Iterator(int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return UInt.m8054boximpl(m8075nextpVg5ArA());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        /* renamed from: next-pVg5ArA, reason: not valid java name */
        public int m8075nextpVg5ArA() {
            int i = this.index;
            int[] iArr = this.array;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UInt.m8055constructorimpl(iArr[i]);
        }
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m8073containsWZ4Q5Ns(int i) {
        return m8063containsWZ4Q5Ns(this.storage, i);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m8063containsWZ4Q5Ns(int[] iArr, int i) {
        return ArraysKt.contains(iArr, i);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m8064containsAllimpl(this.storage, elements);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m8064containsAllimpl(int[] iArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UInt) || !ArraysKt.contains(iArr, ((UInt) obj).m8059unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m8069isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m8069isEmptyimpl(this.storage);
    }
}
