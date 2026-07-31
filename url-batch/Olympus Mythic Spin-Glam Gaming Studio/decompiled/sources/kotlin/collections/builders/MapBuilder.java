package kotlin.collections.builders;

import com.ironsource.B5;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0081\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\f\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001BG\b\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0013J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020!H\u0016J\u0015\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00020!2\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u0018\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010+\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010/J\u001f\u00100\u001a\u0004\u0018\u00018\u00012\u0006\u0010+\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00101J\u001e\u00102\u001a\u0002032\u0014\u00104\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0016J\u0017\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010+\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010/J\b\u00106\u001a\u000203H\u0016J\u0013\u0010B\u001a\u00020!2\b\u0010C\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010D\u001a\u00020\rH\u0016J\b\u0010E\u001a\u00020FH\u0016J\b\u0010K\u001a\u000203H\u0002J\r\u0010L\u001a\u000203H\u0000¢\u0006\u0002\bMJ\u0010\u0010N\u001a\u0002032\u0006\u0010O\u001a\u00020\rH\u0002J\u0010\u0010P\u001a\u00020!2\u0006\u0010Q\u001a\u00020\rH\u0002J\u0010\u0010R\u001a\u0002032\u0006\u0010S\u001a\u00020\rH\u0002J\u0013\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0002¢\u0006\u0002\u0010UJ\u0015\u0010V\u001a\u00020\r2\u0006\u0010+\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010WJ\u0010\u0010X\u001a\u0002032\u0006\u0010Y\u001a\u00020!H\u0002J\u0010\u0010Z\u001a\u0002032\u0006\u0010[\u001a\u00020\rH\u0002J\u0010\u0010\\\u001a\u00020!2\u0006\u0010]\u001a\u00020\rH\u0002J\u0015\u0010^\u001a\u00020\r2\u0006\u0010+\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010WJ\u0015\u0010_\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010WJ\u0017\u0010`\u001a\u00020\r2\u0006\u0010+\u001a\u00028\u0000H\u0000¢\u0006\u0004\ba\u0010WJ\u0017\u0010b\u001a\u00020!2\u0006\u0010+\u001a\u00028\u0000H\u0000¢\u0006\u0004\bc\u0010,J\u0010\u0010d\u001a\u0002032\u0006\u0010e\u001a\u00020\rH\u0002J\u0010\u0010f\u001a\u0002032\u0006\u0010g\u001a\u00020\rH\u0002J!\u0010h\u001a\u00020!2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010jH\u0000¢\u0006\u0002\bkJ\u0018\u0010l\u001a\u00020!2\u000e\u0010C\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&H\u0002J\u0019\u0010m\u001a\u00020!2\n\u0010n\u001a\u0006\u0012\u0002\b\u00030oH\u0000¢\u0006\u0002\bpJ\u001c\u0010q\u001a\u00020!2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010jH\u0002J\"\u0010r\u001a\u00020!2\u0018\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010j0oH\u0002J!\u0010s\u001a\u00020!2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010jH\u0000¢\u0006\u0002\btJ\u0017\u0010u\u001a\u00020!2\u0006\u0010v\u001a\u00028\u0001H\u0000¢\u0006\u0004\bw\u0010,J\u0019\u0010x\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010yH\u0000¢\u0006\u0002\bzJ\u0019\u0010{\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|H\u0000¢\u0006\u0002\b}J\u001a\u0010~\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u007fH\u0000¢\u0006\u0003\b\u0080\u0001R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R&\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010:R\u0014\u0010G\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u001aR\u0014\u0010I\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u001a¨\u0006\u0087\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "[Ljava/lang/Object;", "hashShift", "modCount", "value", "size", "getSize", "()I", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "build", "", "writeReplace", "", "isEmpty", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "", "from", "remove", "clear", "keys", "", "getKeys", "()Ljava/util/Set;", "values", "", "getValues", "()Ljava/util/Collection;", "entries", "", "getEntries", "equals", "other", "hashCode", "toString", "", "capacity", "getCapacity$kotlin_stdlib", "hashSize", "getHashSize", "registerModification", "checkIsMutable", "checkIsMutable$kotlin_stdlib", "ensureExtraCapacity", "n", "shouldCompact", "extraCapacity", "ensureCapacity", "minCapacity", "allocateValuesArray", "()[Ljava/lang/Object;", "hash", "(Ljava/lang/Object;)I", "compact", "updateHashArray", "rehash", "newHashSize", "putRehash", "i", "findKey", "findValue", "addKey", "addKey$kotlin_stdlib", "removeKey", "removeKey$kotlin_stdlib", "removeEntryAt", "index", "removeHashAt", "removedHash", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "contentEquals", "containsAllEntries", "m", "", "containsAllEntries$kotlin_stdlib", "putEntry", "putAllEntries", "removeEntry", "removeEntry$kotlin_stdlib", "removeValue", "element", "removeValue$kotlin_stdlib", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final MapBuilder Empty;

    @Nullable
    private MapBuilderEntries entriesView;

    @NotNull
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @NotNull
    private K[] keysArray;

    @Nullable
    private MapBuilderKeys keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;

    @NotNull
    private int[] presenceArray;
    private int size;

    @Nullable
    private V[] valuesArray;

    @Nullable
    private MapBuilderValues valuesView;

    /* JADX WARN: Multi-variable type inference failed */
    private MapBuilder(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = objArr;
        this.valuesArray = objArr2;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = INSTANCE.computeShift(getHashSize());
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public int getSize() {
        return this.size;
    }

    /* renamed from: isReadOnly$kotlin_stdlib, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(ListBuilderKt.arrayOfUninitializedElements(i), null, new int[i], new int[INSTANCE.computeHashSize(i)], 2, 0);
    }

    @NotNull
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = Empty;
        Intrinsics.checkNotNull(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return findKey(key) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return findValue(value) >= 0;
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        int findKey = findKey(key);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return vArr[findKey];
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(key);
        Object[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib < 0) {
            int i = (-addKey$kotlin_stdlib) - 1;
            V v = (V) allocateValuesArray[i];
            allocateValuesArray[i] = value;
            return v;
        }
        allocateValuesArray[addKey$kotlin_stdlib] = value;
        return null;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(from.entrySet());
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(key);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        V v = vArr[findKey];
        removeEntryAt(findKey);
        return v;
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ListBuilderKt.resetRange(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        registerModification();
    }

    @NotNull
    public Set<K> getKeys() {
        MapBuilderKeys mapBuilderKeys = this.keysView;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys mapBuilderKeys2 = new MapBuilderKeys(this);
        this.keysView = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    @NotNull
    public Collection<V> getValues() {
        MapBuilderValues mapBuilderValues = this.valuesView;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues mapBuilderValues2 = new MapBuilderValues(this);
        this.valuesView = mapBuilderValues2;
        return mapBuilderValues2;
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        MapBuilderEntries mapBuilderEntries = this.entriesView;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries mapBuilderEntries2 = new MapBuilderEntries(this);
        this.entriesView = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        return other == this || ((other instanceof Map) && contentEquals((Map) other));
    }

    @Override // java.util.Map
    public int hashCode() {
        EntriesItr entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i += entriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        EntriesItr entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.nextAppendString(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final void registerModification() {
        this.modCount++;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final void ensureExtraCapacity(int n) {
        if (shouldCompact(n)) {
            compact(true);
        } else {
            ensureCapacity(this.length + n);
        }
    }

    private final boolean shouldCompact(int extraCapacity) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i = this.length;
        int i2 = capacity$kotlin_stdlib - i;
        int size = i - size();
        return i2 < extraCapacity && i2 + size >= extraCapacity && size >= getCapacity$kotlin_stdlib() / 4;
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > getCapacity$kotlin_stdlib()) {
            int newCapacity$kotlin_stdlib = AbstractList.Companion.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), minCapacity);
            this.keysArray = (K[]) ListBuilderKt.copyOfUninitializedElements(this.keysArray, newCapacity$kotlin_stdlib);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) ListBuilderKt.copyOfUninitializedElements(vArr, newCapacity$kotlin_stdlib) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, newCapacity$kotlin_stdlib);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.presenceArray = copyOf;
            int computeHashSize = INSTANCE.computeHashSize(newCapacity$kotlin_stdlib);
            if (computeHashSize > getHashSize()) {
                rehash(computeHashSize);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final int hash(Object key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final void compact(boolean updateHashArray) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (updateHashArray) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ListBuilderKt.resetRange(this.keysArray, i3, i);
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, i3, this.length);
        }
        this.length = i3;
    }

    private final void rehash(int newHashSize) {
        registerModification();
        int i = 0;
        if (this.length > size()) {
            compact(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.computeShift(newHashSize);
        while (i < this.length) {
            int i2 = i + 1;
            if (!putRehash(i)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i = i2;
        }
    }

    private final boolean putRehash(int i) {
        int hash = hash(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i + 1;
                this.presenceArray[i] = hash;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final int findKey(Object key) {
        int hash = hash(key);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[hash];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.areEqual(this.keysArray[i3], key)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final int findValue(Object value) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.areEqual(vArr[i], value)) {
                    return i;
                }
            }
        }
    }

    public final int addKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(key);
            int coerceAtMost = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[hash];
                if (i2 <= 0) {
                    if (this.length >= getCapacity$kotlin_stdlib()) {
                        ensureExtraCapacity(1);
                    } else {
                        int i3 = this.length;
                        int i4 = i3 + 1;
                        this.length = i4;
                        this.keysArray[i3] = key;
                        this.presenceArray[i3] = hash;
                        this.hashArray[hash] = i4;
                        this.size = size() + 1;
                        registerModification();
                        if (i > this.maxProbeDistance) {
                            this.maxProbeDistance = i;
                        }
                        return i3;
                    }
                } else {
                    if (Intrinsics.areEqual(this.keysArray[i2 - 1], key)) {
                        return -i2;
                    }
                    i++;
                    if (i > coerceAtMost) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    hash = hash == 0 ? getHashSize() - 1 : hash - 1;
                }
            }
        }
    }

    public final boolean removeKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(key);
        if (findKey < 0) {
            return false;
        }
        removeEntryAt(findKey);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeEntryAt(int index) {
        ListBuilderKt.resetAt(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ListBuilderKt.resetAt(vArr, index);
        }
        removeHashAt(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        registerModification();
    }

    private final void removeHashAt(int removedHash) {
        int coerceAtMost = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
        int i = 0;
        int i2 = removedHash;
        do {
            removedHash = removedHash == 0 ? getHashSize() - 1 : removedHash - 1;
            i++;
            if (i > this.maxProbeDistance) {
                this.hashArray[i2] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i3 = iArr[removedHash];
            if (i3 == 0) {
                iArr[i2] = 0;
                return;
            }
            if (i3 < 0) {
                iArr[i2] = -1;
            } else {
                int i4 = i3 - 1;
                if (((hash(this.keysArray[i4]) - removedHash) & (getHashSize() - 1)) >= i) {
                    this.hashArray[i2] = i3;
                    this.presenceArray[i4] = i2;
                }
                coerceAtMost--;
            }
            i2 = removedHash;
            i = 0;
            coerceAtMost--;
        } while (coerceAtMost >= 0);
        this.hashArray[i2] = -1;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.areEqual(vArr[findKey], entry.getValue());
    }

    private final boolean contentEquals(Map other) {
        return size() == other.size() && containsAllEntries$kotlin_stdlib(other.entrySet());
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean putEntry(Map.Entry entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        Object[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        if (Intrinsics.areEqual(entry.getValue(), allocateValuesArray[i])) {
            return false;
        }
        allocateValuesArray[i] = entry.getValue();
        return true;
    }

    private final boolean putAllEntries(Collection from) {
        boolean z = false;
        if (from.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(from.size());
        Iterator it = from.iterator();
        while (it.hasNext()) {
            if (putEntry((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        if (!Intrinsics.areEqual(vArr[findKey], entry.getValue())) {
            return false;
        }
        removeEntryAt(findKey);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V element) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(element);
        if (findValue < 0) {
            return false;
        }
        removeEntryAt(findValue);
        return true;
    }

    @NotNull
    public final KeysItr keysIterator$kotlin_stdlib() {
        return new KeysItr(this);
    }

    @NotNull
    public final ValuesItr valuesIterator$kotlin_stdlib() {
        return new ValuesItr(this);
    }

    @NotNull
    public final EntriesItr entriesIterator$kotlin_stdlib() {
        return new EntriesItr(this);
    }

    /* compiled from: MapBuilder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MapBuilder getEmpty$kotlin_stdlib() {
            return MapBuilder.Empty;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeHashSize(int i) {
            return Integer.highestOneBit(RangesKt.coerceAtLeast(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeShift(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    /* compiled from: MapBuilder.kt */
    public static class Itr {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final MapBuilder map;

        public Itr(MapBuilder map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = map.modCount;
            initNext$kotlin_stdlib();
        }

        public final MapBuilder getMap$kotlin_stdlib() {
            return this.map;
        }

        public final int getIndex$kotlin_stdlib() {
            return this.index;
        }

        public final void setIndex$kotlin_stdlib(int i) {
            this.index = i;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.lastIndex;
        }

        public final void setLastIndex$kotlin_stdlib(int i) {
            this.lastIndex = i;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.index < this.map.length) {
                int[] iArr = this.map.presenceArray;
                int i = this.index;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.index = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.index < this.map.length;
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.map.checkIsMutable$kotlin_stdlib();
            this.map.removeEntryAt(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = this.map.modCount;
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (this.map.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class KeysItr extends Itr implements Iterator, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeysItr(MapBuilder map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().keysArray[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class ValuesItr extends Itr implements Iterator, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValuesItr(MapBuilder map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object[] objArr = getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj = objArr[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class EntriesItr extends Itr implements Iterator, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntriesItr(MapBuilder map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public EntryRef next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            EntryRef entryRef = new EntryRef(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return entryRef;
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().keysArray[getLastIndex$kotlin_stdlib()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return hashCode2;
        }

        public final void nextAppendString(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().keysArray[getLastIndex$kotlin_stdlib()];
            if (obj == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(B5.U);
            Object[] objArr = getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            if (obj2 == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            initNext$kotlin_stdlib();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class EntryRef implements Map.Entry, KMutableMap.Entry {
        private final int expectedModCount;
        private final int index;
        private final MapBuilder map;

        public EntryRef(MapBuilder map, int i) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = i;
            this.expectedModCount = map.modCount;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            checkForComodification();
            return this.map.keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            checkForComodification();
            Object[] objArr = this.map.valuesArray;
            Intrinsics.checkNotNull(objArr);
            return objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            checkForComodification();
            this.map.checkIsMutable$kotlin_stdlib();
            Object[] allocateValuesArray = this.map.allocateValuesArray();
            int i = this.index;
            Object obj2 = allocateValuesArray[i];
            allocateValuesArray[i] = obj;
            return obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(B5.U);
            sb.append(getValue());
            return sb.toString();
        }

        private final void checkForComodification() {
            if (this.map.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }
    }
}
