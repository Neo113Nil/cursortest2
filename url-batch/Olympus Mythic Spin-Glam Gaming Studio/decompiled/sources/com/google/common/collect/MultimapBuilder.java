package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes13.dex */
public abstract class MultimapBuilder {
    private MultimapBuilder() {
    }

    public static MultimapBuilderWithKeys hashKeys() {
        return hashKeys(8);
    }

    public static MultimapBuilderWithKeys hashKeys(final int i) {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new MultimapBuilderWithKeys() { // from class: com.google.common.collect.MultimapBuilder.1
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map createMap() {
                return Platform.newHashMapWithExpectedSize(i);
            }
        };
    }

    public static MultimapBuilderWithKeys linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static MultimapBuilderWithKeys linkedHashKeys(final int i) {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new MultimapBuilderWithKeys() { // from class: com.google.common.collect.MultimapBuilder.2
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map createMap() {
                return Platform.newLinkedHashMapWithExpectedSize(i);
            }
        };
    }

    public static MultimapBuilderWithKeys treeKeys() {
        return treeKeys(Ordering.natural());
    }

    public static MultimapBuilderWithKeys treeKeys(final Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new MultimapBuilderWithKeys() { // from class: com.google.common.collect.MultimapBuilder.3
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map createMap() {
                return new TreeMap(comparator);
            }
        };
    }

    private static final class ArrayListSupplier<V> implements Supplier, Serializable {
        private final int expectedValuesPerKey;

        ArrayListSupplier(int i) {
            this.expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    private static final class LinkedHashSetSupplier<V> implements Supplier, Serializable {
        private final int expectedValuesPerKey;

        LinkedHashSetSupplier(int i) {
            this.expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return Platform.newLinkedHashSetWithExpectedSize(this.expectedValuesPerKey);
        }
    }

    public static abstract class MultimapBuilderWithKeys {
        abstract Map createMap();

        MultimapBuilderWithKeys() {
        }

        public ListMultimapBuilder arrayListValues() {
            return arrayListValues(2);
        }

        public ListMultimapBuilder arrayListValues(final int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return new ListMultimapBuilder(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.1
                final /* synthetic */ MultimapBuilderWithKeys this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder
                public ListMultimap build() {
                    return Multimaps.newListMultimap(this.this$0.createMap(), new ArrayListSupplier(i));
                }
            };
        }

        public SetMultimapBuilder linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public SetMultimapBuilder linkedHashSetValues(final int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return new SetMultimapBuilder(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.4
                final /* synthetic */ MultimapBuilderWithKeys this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder
                public SetMultimap build() {
                    return Multimaps.newSetMultimap(this.this$0.createMap(), new LinkedHashSetSupplier(i));
                }
            };
        }
    }

    public static abstract class ListMultimapBuilder extends MultimapBuilder {
        public abstract ListMultimap build();

        ListMultimapBuilder() {
            super();
        }
    }

    public static abstract class SetMultimapBuilder extends MultimapBuilder {
        public abstract SetMultimap build();

        SetMultimapBuilder() {
            super();
        }
    }
}
