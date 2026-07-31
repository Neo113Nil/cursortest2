package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ULongArray.kt */
/* loaded from: classes5.dex */
public final class ULongArray implements Collection, KMappedMarker {
    private final long[] storage;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULongArray m8082boximpl(long[] jArr) {
        return new ULongArray(jArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m8084constructorimpl(long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8087equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.areEqual(jArr, ((ULongArray) obj).m8096unboximpl());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8090hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8094toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        return m8087equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m8090hashCodeimpl(this.storage);
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
        return m8094toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long[] m8096unboximpl() {
        return this.storage;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m8095containsVKZWuLQ(((ULong) obj).m8081unboximpl());
        }
        return false;
    }

    private /* synthetic */ ULongArray(long[] jArr) {
        this.storage = jArr;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m8083constructorimpl(int i) {
        return m8084constructorimpl(new long[i]);
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m8088getsVKNKU(long[] jArr, int i) {
        return ULong.m8077constructorimpl(jArr[i]);
    }

    /* renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m8093setk8EXiF4(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m8089getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m8089getSizeimpl(this.storage);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator m8092iteratorimpl(long[] jArr) {
        return new Iterator(jArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return m8092iteratorimpl(this.storage);
    }

    /* compiled from: ULongArray.kt */
    private static final class Iterator implements java.util.Iterator, KMappedMarker {
        private final long[] array;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Iterator(long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return ULong.m8076boximpl(m8097nextsVKNKU());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        /* renamed from: next-s-VKNKU, reason: not valid java name */
        public long m8097nextsVKNKU() {
            int i = this.index;
            long[] jArr = this.array;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return ULong.m8077constructorimpl(jArr[i]);
        }
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m8095containsVKZWuLQ(long j) {
        return m8085containsVKZWuLQ(this.storage, j);
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m8085containsVKZWuLQ(long[] jArr, long j) {
        return ArraysKt.contains(jArr, j);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m8086containsAllimpl(this.storage, elements);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m8086containsAllimpl(long[] jArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof ULong) || !ArraysKt.contains(jArr, ((ULong) obj).m8081unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m8091isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m8091isEmptyimpl(this.storage);
    }
}
