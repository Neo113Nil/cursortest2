package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: UByteArray.kt */
/* loaded from: classes15.dex */
public final class UByteArray implements Collection, KMappedMarker {
    private final byte[] storage;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByteArray m8038boximpl(byte[] bArr) {
        return new UByteArray(bArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m8040constructorimpl(byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8043equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.areEqual(bArr, ((UByteArray) obj).m8052unboximpl());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8046hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8050toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        return m8043equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m8046hashCodeimpl(this.storage);
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
        return m8050toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte[] m8052unboximpl() {
        return this.storage;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m8051contains7apg3OU(((UByte) obj).m8037unboximpl());
        }
        return false;
    }

    private /* synthetic */ UByteArray(byte[] bArr) {
        this.storage = bArr;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m8039constructorimpl(int i) {
        return m8040constructorimpl(new byte[i]);
    }

    /* renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m8044getw2LRezQ(byte[] bArr, int i) {
        return UByte.m8033constructorimpl(bArr[i]);
    }

    /* renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m8049setVurrAj0(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m8045getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m8045getSizeimpl(this.storage);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator m8048iteratorimpl(byte[] bArr) {
        return new Iterator(bArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return m8048iteratorimpl(this.storage);
    }

    /* compiled from: UByteArray.kt */
    private static final class Iterator implements java.util.Iterator, KMappedMarker {
        private final byte[] array;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Iterator(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return UByte.m8032boximpl(m8053nextw2LRezQ());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        /* renamed from: next-w2LRezQ, reason: not valid java name */
        public byte m8053nextw2LRezQ() {
            int i = this.index;
            byte[] bArr = this.array;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UByte.m8033constructorimpl(bArr[i]);
        }
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m8051contains7apg3OU(byte b) {
        return m8041contains7apg3OU(this.storage, b);
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m8041contains7apg3OU(byte[] bArr, byte b) {
        return ArraysKt.contains(bArr, b);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m8042containsAllimpl(this.storage, elements);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m8042containsAllimpl(byte[] bArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UByte) || !ArraysKt.contains(bArr, ((UByte) obj).m8037unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m8047isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m8047isEmptyimpl(this.storage);
    }
}
