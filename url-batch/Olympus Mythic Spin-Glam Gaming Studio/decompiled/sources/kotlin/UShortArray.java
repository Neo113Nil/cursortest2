package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: UShortArray.kt */
/* loaded from: classes15.dex */
public final class UShortArray implements Collection, KMappedMarker {
    private final short[] storage;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShortArray m8104boximpl(short[] sArr) {
        return new UShortArray(sArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m8106constructorimpl(short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8109equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.areEqual(sArr, ((UShortArray) obj).m8118unboximpl());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8112hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8116toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
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
        return m8109equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m8112hashCodeimpl(this.storage);
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
        return m8116toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short[] m8118unboximpl() {
        return this.storage;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m8117containsxj2QHRw(((UShort) obj).m8103unboximpl());
        }
        return false;
    }

    private /* synthetic */ UShortArray(short[] sArr) {
        this.storage = sArr;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m8105constructorimpl(int i) {
        return m8106constructorimpl(new short[i]);
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m8110getMh2AYeg(short[] sArr, int i) {
        return UShort.m8099constructorimpl(sArr[i]);
    }

    /* renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m8115set01HTLdE(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m8111getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m8111getSizeimpl(this.storage);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator m8114iteratorimpl(short[] sArr) {
        return new Iterator(sArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return m8114iteratorimpl(this.storage);
    }

    /* compiled from: UShortArray.kt */
    private static final class Iterator implements java.util.Iterator, KMappedMarker {
        private final short[] array;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Iterator(short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return UShort.m8098boximpl(m8119nextMh2AYeg());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        /* renamed from: next-Mh2AYeg, reason: not valid java name */
        public short m8119nextMh2AYeg() {
            int i = this.index;
            short[] sArr = this.array;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UShort.m8099constructorimpl(sArr[i]);
        }
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m8117containsxj2QHRw(short s) {
        return m8107containsxj2QHRw(this.storage, s);
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m8107containsxj2QHRw(short[] sArr, short s) {
        return ArraysKt.contains(sArr, s);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m8108containsAllimpl(this.storage, elements);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m8108containsAllimpl(short[] sArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UShort) || !ArraysKt.contains(sArr, ((UShort) obj).m8103unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m8113isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m8113isEmptyimpl(this.storage);
    }
}
