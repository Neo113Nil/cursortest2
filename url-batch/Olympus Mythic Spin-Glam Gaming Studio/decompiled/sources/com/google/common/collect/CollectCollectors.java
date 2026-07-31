package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.MultimapBuilder;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes4.dex */
abstract class CollectCollectors {
    private static final Collector TO_IMMUTABLE_LIST = Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda0
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableList.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda3
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableList.Builder) obj).add(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda4
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableList.Builder) obj).combine((ImmutableList.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableList.Builder) obj).build();
        }
    }, new Collector.Characteristics[0]);
    private static final Collector TO_IMMUTABLE_SET = Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda6
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda7
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableSet.Builder) obj).add(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda8
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableSet.Builder) obj).combine((ImmutableSet.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda9
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableSet.Builder) obj).build();
        }
    }, new Collector.Characteristics[0]);
    private static final Collector TO_IMMUTABLE_RANGE_SET = Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda10
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableRangeSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda11
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableRangeSet.Builder) obj).add((Range) obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda1
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableRangeSet.Builder) obj).combine((ImmutableRangeSet.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableRangeSet.Builder) obj).build();
        }
    }, new Collector.Characteristics[0]);

    static Collector toImmutableList() {
        return TO_IMMUTABLE_LIST;
    }

    static Collector toImmutableSet() {
        return TO_IMMUTABLE_SET;
    }

    static Collector toImmutableSortedSet(final Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda28
            @Override // java.util.function.Supplier
            public final Object get() {
                ImmutableSortedSet.Builder lambda$toImmutableSortedSet$0;
                lambda$toImmutableSortedSet$0 = CollectCollectors.lambda$toImmutableSortedSet$0(comparator);
                return lambda$toImmutableSortedSet$0;
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda29
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.Builder) obj).add(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda30
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedSet.Builder) obj).combine((ImmutableSet.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda31
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ImmutableSortedSet.Builder lambda$toImmutableSortedSet$0(Comparator comparator) {
        return new ImmutableSortedSet.Builder(comparator);
    }

    static Collector toImmutableRangeSet() {
        return TO_IMMUTABLE_RANGE_SET;
    }

    static Collector toImmutableMultiset(final Function function, final ToIntFunction toIntFunction) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda16
            @Override // java.util.function.Supplier
            public final Object get() {
                return LinkedHashMultiset.create();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda17
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$toImmutableMultiset$2(function, toIntFunction, (Multiset) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda18
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Multiset lambda$toImmutableMultiset$3;
                lambda$toImmutableMultiset$3 = CollectCollectors.lambda$toImmutableMultiset$3((Multiset) obj, (Multiset) obj2);
                return lambda$toImmutableMultiset$3;
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda19
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ImmutableMultiset lambda$toImmutableMultiset$4;
                lambda$toImmutableMultiset$4 = CollectCollectors.lambda$toImmutableMultiset$4((Multiset) obj);
                return lambda$toImmutableMultiset$4;
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toImmutableMultiset$2(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        multiset.add(Preconditions.checkNotNull(function.apply(obj)), toIntFunction.applyAsInt(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Multiset lambda$toImmutableMultiset$3(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ImmutableMultiset lambda$toImmutableMultiset$4(Multiset multiset) {
        return ImmutableMultiset.copyFromEntries(multiset.entrySet());
    }

    static Collector toImmutableMap(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda24
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda25
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$toImmutableMap$7(function, function2, (ImmutableMap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda26
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.Builder) obj).combine((ImmutableMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda27
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.Builder) obj).buildOrThrow();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toImmutableMap$7(Function function, Function function2, ImmutableMap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    static Collector toImmutableMap(Function function, Function function2, BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda40
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda41
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((Map) obj);
            }
        });
    }

    static Collector toImmutableSortedMap(final Comparator comparator, final Function function, final Function function2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda42
            @Override // java.util.function.Supplier
            public final Object get() {
                ImmutableSortedMap.Builder lambda$toImmutableSortedMap$8;
                lambda$toImmutableSortedMap$8 = CollectCollectors.lambda$toImmutableSortedMap$8(comparator);
                return lambda$toImmutableSortedMap$8;
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda43
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$toImmutableSortedMap$9(function, function2, (ImmutableSortedMap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda44
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedMap.Builder) obj).combine((ImmutableSortedMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda45
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedMap.Builder) obj).buildOrThrow();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ImmutableSortedMap.Builder lambda$toImmutableSortedMap$8(Comparator comparator) {
        return new ImmutableSortedMap.Builder(comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toImmutableSortedMap$9(Function function, Function function2, ImmutableSortedMap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    static Collector toImmutableSortedMap(final Comparator comparator, Function function, Function function2, BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda48
            @Override // java.util.function.Supplier
            public final Object get() {
                TreeMap lambda$toImmutableSortedMap$10;
                lambda$toImmutableSortedMap$10 = CollectCollectors.lambda$toImmutableSortedMap$10(comparator);
                return lambda$toImmutableSortedMap$10;
            }
        }), new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda49
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TreeMap lambda$toImmutableSortedMap$10(Comparator comparator) {
        return new TreeMap(comparator);
    }

    static Collector toImmutableListMultimap(final Function function, final Function function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda32
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableListMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda33
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$toImmutableListMultimap$18(function, function2, (ImmutableListMultimap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda34
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableListMultimap.Builder) obj).combine((ImmutableMultimap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda35
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableListMultimap.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toImmutableListMultimap$18(Function function, Function function2, ImmutableListMultimap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    static Collector flatteningToImmutableListMultimap(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda12
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$flatteningToImmutableListMultimap$19;
                lambda$flatteningToImmutableListMultimap$19 = CollectCollectors.lambda$flatteningToImmutableListMultimap$19(function, obj);
                return lambda$flatteningToImmutableListMultimap$19;
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda13
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream lambda$flatteningToImmutableListMultimap$20;
                lambda$flatteningToImmutableListMultimap$20 = CollectCollectors.lambda$flatteningToImmutableListMultimap$20(function2, obj);
                return lambda$flatteningToImmutableListMultimap$20;
            }
        };
        final MultimapBuilder.ListMultimapBuilder arrayListValues = MultimapBuilder.linkedHashKeys().arrayListValues();
        Objects.requireNonNull(arrayListValues);
        return Collectors.collectingAndThen(flatteningToMultimap(function3, function4, new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda14
            @Override // java.util.function.Supplier
            public final Object get() {
                return MultimapBuilder.ListMultimapBuilder.this.build();
            }
        }), new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda15
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableListMultimap.copyOf((Multimap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$flatteningToImmutableListMultimap$19(Function function, Object obj) {
        return Preconditions.checkNotNull(function.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stream lambda$flatteningToImmutableListMultimap$20(Function function, Object obj) {
        return ((Stream) function.apply(obj)).peek(new CollectCollectors$$ExternalSyntheticLambda50());
    }

    static Collector toImmutableSetMultimap(final Function function, final Function function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda36
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSetMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda37
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$toImmutableSetMultimap$21(function, function2, (ImmutableSetMultimap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda38
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSetMultimap.Builder) obj).combine((ImmutableMultimap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda39
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSetMultimap.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toImmutableSetMultimap$21(Function function, Function function2, ImmutableSetMultimap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    static Collector flatteningToImmutableSetMultimap(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda20
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$flatteningToImmutableSetMultimap$22;
                lambda$flatteningToImmutableSetMultimap$22 = CollectCollectors.lambda$flatteningToImmutableSetMultimap$22(function, obj);
                return lambda$flatteningToImmutableSetMultimap$22;
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda21
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream lambda$flatteningToImmutableSetMultimap$23;
                lambda$flatteningToImmutableSetMultimap$23 = CollectCollectors.lambda$flatteningToImmutableSetMultimap$23(function2, obj);
                return lambda$flatteningToImmutableSetMultimap$23;
            }
        };
        final MultimapBuilder.SetMultimapBuilder linkedHashSetValues = MultimapBuilder.linkedHashKeys().linkedHashSetValues();
        Objects.requireNonNull(linkedHashSetValues);
        return Collectors.collectingAndThen(flatteningToMultimap(function3, function4, new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda22
            @Override // java.util.function.Supplier
            public final Object get() {
                return MultimapBuilder.SetMultimapBuilder.this.build();
            }
        }), new Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda23
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSetMultimap.copyOf((Multimap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$flatteningToImmutableSetMultimap$22(Function function, Object obj) {
        return Preconditions.checkNotNull(function.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stream lambda$flatteningToImmutableSetMultimap$23(Function function, Object obj) {
        return ((Stream) function.apply(obj)).peek(new CollectCollectors$$ExternalSyntheticLambda50());
    }

    static Collector flatteningToMultimap(final Function function, final Function function2, Supplier supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda46
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.lambda$flatteningToMultimap$26(function, function2, (Multimap) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda47
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Multimap lambda$flatteningToMultimap$27;
                lambda$flatteningToMultimap$27 = CollectCollectors.lambda$flatteningToMultimap$27((Multimap) obj, (Multimap) obj2);
                return lambda$flatteningToMultimap$27;
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$flatteningToMultimap$26(Function function, Function function2, Multimap multimap, Object obj) {
        final Collection collection = multimap.get(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        Objects.requireNonNull(collection);
        stream.forEachOrdered(new Consumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda51
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                collection.add(obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Multimap lambda$flatteningToMultimap$27(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }
}
