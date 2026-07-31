package com.apollographql.apollo.api;

import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.MapJsonReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: fakeResolver.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001aR\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a*\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002\u001aP\u0010\u0013\u001a\u0004\u0018\u00010\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001aP\u0010\u001a\u001a\u0004\u0018\u00010\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a[\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010 \u001az\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c\"\f\b\u0001\u0010!*\u0006\u0012\u0002\b\u00030\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u00020'0&¢\u0006\u0002\b(2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010)¨\u0006*"}, d2 = {"collect", "", "Lcom/apollographql/apollo/api/CompiledField;", "selections", "Lcom/apollographql/apollo/api/CompiledSelection;", "typename", "", "collectAndMerge", "buildFakeObject", "", "", "base", "resolver", "Lcom/apollographql/apollo/api/FakeResolver;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "getOrAbsent", "Lcom/apollographql/apollo/api/Optional;", "key", "buildFieldOfType", "path", "id", "mergedField", "value", "type", "Lcom/apollographql/apollo/api/CompiledType;", "buildFieldOfNonNullType", "buildData", "T", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "map", "(Lcom/apollographql/apollo/api/Adapter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lcom/apollographql/apollo/api/FakeResolver;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "Builder", "Lcom/apollographql/apollo/api/ObjectBuilder;", "builderFactory", "Lcom/apollographql/apollo/api/BuilderFactory;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/apollographql/apollo/api/BuilderFactory;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/api/Adapter;Ljava/util/List;Ljava/lang/String;Lcom/apollographql/apollo/api/FakeResolver;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FakeResolverKt {
    private static final List<CompiledField> collect(List<? extends CompiledSelection> list, String str) {
        List<CompiledField> emptyList;
        ArrayList arrayList = new ArrayList();
        for (CompiledSelection compiledSelection : list) {
            if (compiledSelection instanceof CompiledField) {
                emptyList = CollectionsKt.listOf(compiledSelection);
            } else {
                if (!(compiledSelection instanceof CompiledFragment)) {
                    throw new NoWhenBranchMatchedException();
                }
                CompiledFragment compiledFragment = (CompiledFragment) compiledSelection;
                if (compiledFragment.getPossibleTypes().contains(str)) {
                    emptyList = collect(compiledFragment.getSelections(), str);
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
            }
            CollectionsKt.addAll(arrayList, emptyList);
        }
        return arrayList;
    }

    private static final List<CompiledField> collectAndMerge(List<? extends CompiledSelection> list, String str) {
        List<CompiledField> collect = collect(list, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : collect) {
            String responseName = ((CompiledField) obj).getResponseName();
            Object obj2 = linkedHashMap.get(responseName);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(responseName, obj2);
            }
            ((List) obj2).add(obj);
        }
        Collection<List> values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        for (List list2 : values) {
            CompiledField compiledField = (CompiledField) CollectionsKt.first(list2);
            CompiledField.Builder alias = new CompiledField.Builder(compiledField.getName(), compiledField.getType()).alias(compiledField.getAlias());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((CompiledField) it.next()).getSelections());
            }
            arrayList.add(alias.selections(arrayList2).build());
        }
        return arrayList;
    }

    private static final Map<String, Object> buildFakeObject(List<? extends CompiledSelection> list, String str, Map<String, ? extends Object> map, FakeResolver fakeResolver, CustomScalarAdapters customScalarAdapters) {
        Object buildFieldOfType = buildFieldOfType(CollectionsKt.emptyList(), "", new CompiledField.Builder("data", new CompiledNotNullType(new ObjectType.Builder(str).build())).selections(list).build(), fakeResolver, new Optional.Present(map), new CompiledNotNullType(new ObjectType.Builder(str).build()), customScalarAdapters);
        Intrinsics.checkNotNull(buildFieldOfType, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return (Map) buildFieldOfType;
    }

    private static final Optional<Object> getOrAbsent(Map<String, ? extends Object> map, String str) {
        if (map.containsKey(str)) {
            return new Optional.Present(map.get(str));
        }
        return Optional.Absent.INSTANCE;
    }

    private static final Object buildFieldOfType(List<? extends Object> list, String str, CompiledField compiledField, FakeResolver fakeResolver, Optional<? extends Object> optional, CompiledType compiledType, CustomScalarAdapters customScalarAdapters) {
        boolean z = optional instanceof Optional.Present;
        if (z && (((Optional.Present) optional).getValue() instanceof Optional.Absent)) {
            return Optional.Absent.INSTANCE;
        }
        if (compiledType instanceof CompiledNotNullType) {
            return buildFieldOfNonNullType(list, str, compiledField, fakeResolver, optional, ((CompiledNotNullType) compiledType).getOfType(), customScalarAdapters);
        }
        if (z) {
            if (((Optional.Present) optional).getValue() == null) {
                return null;
            }
            return buildFieldOfType(list, str, compiledField, fakeResolver, optional, new CompiledNotNullType(compiledType), customScalarAdapters);
        }
        if (fakeResolver.resolveMaybeNull(new FakeResolverContext(list, str, compiledField))) {
            return null;
        }
        return buildFieldOfType(list, str, compiledField, fakeResolver, optional, new CompiledNotNullType(compiledType), customScalarAdapters);
    }

    private static final Object buildFieldOfNonNullType(List<? extends Object> list, String str, CompiledField compiledField, FakeResolver fakeResolver, Optional<? extends Object> optional, CompiledType compiledType, CustomScalarAdapters customScalarAdapters) {
        Adapter adapter = null;
        if (compiledType instanceof CompiledListType) {
            int i = 0;
            if (optional instanceof Optional.Present) {
                Object value = ((Optional.Present) optional).getValue();
                List list2 = value instanceof List ? (List) value : null;
                if (list2 == null) {
                    throw new IllegalStateException("".toString());
                }
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (Object obj : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(buildFieldOfType(CollectionsKt.plus((Collection<? extends Integer>) list, Integer.valueOf(i)), str, compiledField, fakeResolver, new Optional.Present(obj), ((CompiledListType) compiledType).getOfType(), customScalarAdapters));
                    i = i2;
                }
                return arrayList;
            }
            FakeResolver fakeResolver2 = fakeResolver;
            IntRange until = RangesKt.until(0, fakeResolver2.resolveListSize(new FakeResolverContext(list, str, compiledField)));
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                FakeResolver fakeResolver3 = fakeResolver2;
                arrayList2.add(buildFieldOfType(CollectionsKt.plus((Collection<? extends Integer>) list, Integer.valueOf(nextInt)), str + nextInt, compiledField, fakeResolver3, Optional.Absent.INSTANCE, ((CompiledListType) compiledType).getOfType(), customScalarAdapters));
                fakeResolver2 = fakeResolver3;
            }
            return arrayList2;
        }
        String str2 = str;
        FakeResolver fakeResolver4 = fakeResolver;
        if (compiledType instanceof CompiledNamedType) {
            if (optional instanceof Optional.Present) {
                if (!compiledField.getSelections().isEmpty()) {
                    Object value2 = ((Optional.Present) optional).getValue();
                    Map<String, ? extends Object> map = value2 instanceof Map ? (Map) value2 : null;
                    if (map == null) {
                        throw new IllegalStateException("".toString());
                    }
                    Object obj2 = map.get("__typename");
                    String str3 = obj2 instanceof String ? (String) obj2 : null;
                    if (str3 == null) {
                        throw new IllegalStateException("When building fallback types, you must specify '__typename'".toString());
                    }
                    String stableIdForObject = fakeResolver4.stableIdForObject(map, compiledField);
                    if (stableIdForObject != null) {
                        str2 = stableIdForObject;
                    }
                    List<CompiledField> collectAndMerge = collectAndMerge(compiledField.getSelections(), str3);
                    ArrayList arrayList3 = new ArrayList();
                    for (CompiledField compiledField2 : collectAndMerge) {
                        FakeResolver fakeResolver5 = fakeResolver4;
                        Object buildFieldOfType = buildFieldOfType(CollectionsKt.plus((Collection<? extends String>) list, compiledField2.getResponseName()), str2 + compiledField2.getResponseName(), compiledField2, fakeResolver5, getOrAbsent(map, compiledField2.getResponseName()), compiledField2.getType(), customScalarAdapters);
                        fakeResolver4 = fakeResolver5;
                        Pair pair = buildFieldOfType instanceof Optional.Absent ? null : TuplesKt.to(compiledField2.getResponseName(), buildFieldOfType);
                        if (pair != null) {
                            arrayList3.add(pair);
                        }
                    }
                    return MapsKt.toMap(arrayList3);
                }
                return ((Optional.Present) optional).getValue();
            }
            if (!compiledField.getSelections().isEmpty()) {
                String resolveTypename = fakeResolver4.resolveTypename(new FakeResolverContext(list, str2, compiledField));
                Map mapOf = MapsKt.mapOf(TuplesKt.to("__typename", resolveTypename));
                List<CompiledField> collectAndMerge2 = collectAndMerge(compiledField.getSelections(), resolveTypename);
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(collectAndMerge2, 10)), 16));
                for (CompiledField compiledField3 : collectAndMerge2) {
                    List plus = CollectionsKt.plus((Collection<? extends String>) list, compiledField3.getResponseName());
                    FakeResolver fakeResolver6 = fakeResolver4;
                    Pair pair2 = TuplesKt.to(compiledField3.getResponseName(), buildFieldOfType(plus, CollectionsKt.joinToString$default(plus, null, null, null, 0, null, null, 63, null), compiledField3, fakeResolver6, getOrAbsent(mapOf, compiledField3.getResponseName()), compiledField3.getType(), customScalarAdapters));
                    linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                    fakeResolver4 = fakeResolver6;
                }
                return linkedHashMap;
            }
            Object resolveLeaf = fakeResolver4.resolveLeaf(new FakeResolverContext(list, str2, compiledField));
            if (!(compiledType instanceof CustomScalarType)) {
                return resolveLeaf;
            }
            try {
                adapter = customScalarAdapters.responseAdapterFor((CustomScalarType) compiledType);
            } catch (Exception unused) {
            }
            return adapter != null ? ObjectBuilderKt.adaptValue(adapter, resolveLeaf) : resolveLeaf;
        }
        if (compiledType instanceof CompiledNotNullType) {
            throw new IllegalStateException("".toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> T buildData(Adapter<T> adapter, List<? extends CompiledSelection> selections, String typename, Map<String, ? extends Object> map, FakeResolver resolver, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(selections, "selections");
        Intrinsics.checkNotNullParameter(typename, "typename");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return (T) Adapters.m9318obj(adapter, false).fromJson(new MapJsonReader(buildFakeObject(selections, typename, map, resolver, customScalarAdapters), null, 2, null), CustomScalarAdapters.PassThrough);
    }

    public static final <T, Builder extends ObjectBuilder<?>> T buildData(BuilderFactory<? extends Builder> builderFactory, Function1<? super Builder, Unit> block, Adapter<T> adapter, List<? extends CompiledSelection> selections, String typename, FakeResolver resolver, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(builderFactory, "builderFactory");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(selections, "selections");
        Intrinsics.checkNotNullParameter(typename, "typename");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        ObjectBuilder newBuilder = builderFactory.newBuilder(CustomScalarAdapters.PassThrough);
        block.invoke(newBuilder);
        return (T) buildData(adapter, selections, typename, newBuilder.build(), resolver, customScalarAdapters);
    }
}
