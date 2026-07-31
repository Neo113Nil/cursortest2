package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* loaded from: classes9.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap {
    private static final long serialVersionUID = 0;
    private transient ImmutableListMultimap inverse;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ ImmutableCollection get(Object obj) {
        return get((ImmutableListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((ImmutableListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return get((ImmutableListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap
    @Deprecated
    public /* bridge */ /* synthetic */ ImmutableCollection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((ImmutableListMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap
    @Deprecated
    /* renamed from: replaceValues */
    public /* bridge */ /* synthetic */ Collection mo3708replaceValues(Object obj, Iterable iterable) {
        return replaceValues((ImmutableListMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap
    @Deprecated
    /* renamed from: replaceValues */
    public /* bridge */ /* synthetic */ List mo3708replaceValues(Object obj, Iterable iterable) {
        return replaceValues((ImmutableListMultimap<K, V>) obj, iterable);
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableListMultimap(function, function2);
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return CollectCollectors.flatteningToImmutableListMultimap(function, function2);
    }

    public static <K, V> ImmutableListMultimap<K, V> of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        builder.put((Object) k2, (Object) v2);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        builder.put((Object) k2, (Object) v2);
        builder.put((Object) k3, (Object) v3);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        builder.put((Object) k2, (Object) v2);
        builder.put((Object) k3, (Object) v3);
        builder.put((Object) k4, (Object) v4);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        builder.put((Object) k2, (Object) v2);
        builder.put((Object) k3, (Object) v3);
        builder.put((Object) k4, (Object) v4);
        builder.put((Object) k5, (Object) v5);
        return builder.build();
    }

    public static <K, V> Builder builder() {
        return new Builder();
    }

    public static <K, V> Builder builderWithExpectedKeys(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new Builder(i);
    }

    public static final class Builder extends ImmutableMultimap.Builder {
        public Builder() {
        }

        Builder(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder put(Object obj, Object obj2) {
            super.put(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder put(Map.Entry entry) {
            super.put(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder putAll(Iterable iterable) {
            super.putAll(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public Builder putAll(Object obj, Iterable iterable) {
            super.putAll(obj, iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        Builder combine(ImmutableMultimap.Builder builder) {
            super.combine(builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableListMultimap build() {
            return (ImmutableListMultimap) super.build();
        }
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Multimap multimap) {
        if (multimap.isEmpty()) {
            return of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder().putAll((Iterable) iterable).build();
    }

    static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        ImmutableList sortedCopyOf;
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                sortedCopyOf = ImmutableList.copyOf((Collection) value);
            } else {
                sortedCopyOf = ImmutableList.sortedCopyOf(comparator, value);
            }
            if (!sortedCopyOf.isEmpty()) {
                builder.put(key, sortedCopyOf);
                i += sortedCopyOf.size();
            }
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), i);
    }

    static <K, V> ImmutableListMultimap<K, V> fromMapBuilderEntries(Collection<? extends Map.Entry<K, ImmutableCollection.Builder>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        for (Map.Entry<K, ImmutableCollection.Builder> entry : collection) {
            K key = entry.getKey();
            ImmutableList.Builder builder2 = (ImmutableList.Builder) entry.getValue();
            ImmutableList build = comparator == null ? builder2.build() : builder2.buildSorted(comparator);
            builder.put(key, build);
            i += build.size();
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), i);
    }

    ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    private ImmutableListMultimap invert() {
        Builder builder = builder();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap build = builder.build();
        build.inverse = this;
        return build;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    @Deprecated
    /* renamed from: removeAll */
    public final ImmutableList<V> mo3707removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    @Deprecated
    public final ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (int i3 = 0; i3 < readInt2; i3++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                builder2.add(readObject2);
            }
            builder.put(readObject, builder2.build());
            i += readInt2;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, builder.buildOrThrow());
            ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, i);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
