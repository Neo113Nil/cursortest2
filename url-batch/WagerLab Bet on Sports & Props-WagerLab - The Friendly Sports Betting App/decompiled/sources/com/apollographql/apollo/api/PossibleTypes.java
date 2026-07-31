package com.apollographql.apollo.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: possibleTypes.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"possibleTypesInternal", "", "Lcom/apollographql/apollo/api/ObjectType;", "allTypes", "Lcom/apollographql/apollo/api/CompiledType;", "type", "Lcom/apollographql/apollo/api/CompiledNamedType;", "possibleTypes", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PossibleTypes {
    private static final List<ObjectType> possibleTypesInternal(List<? extends CompiledType> list, CompiledNamedType compiledNamedType) {
        List<ObjectType> emptyList;
        if (compiledNamedType instanceof ObjectType) {
            return CollectionsKt.listOf(compiledNamedType);
        }
        if (compiledNamedType instanceof UnionType) {
            return ArraysKt.toList(((UnionType) compiledNamedType).getMembers());
        }
        if (compiledNamedType instanceof InterfaceType) {
            ArrayList arrayList = new ArrayList();
            for (CompiledType compiledType : list) {
                if (compiledType instanceof ObjectType) {
                    List<InterfaceType> list2 = ((ObjectType) compiledType).getImplements();
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((InterfaceType) it.next()).getName(), compiledNamedType.getName())) {
                                emptyList = possibleTypesInternal(list, (CompiledNamedType) compiledType);
                                break;
                            }
                        }
                    }
                    emptyList = CollectionsKt.emptyList();
                } else if (compiledType instanceof InterfaceType) {
                    List<InterfaceType> list3 = ((InterfaceType) compiledType).getImplements();
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(((InterfaceType) it2.next()).getName(), compiledNamedType.getName())) {
                                emptyList = possibleTypesInternal(list, (CompiledNamedType) compiledType);
                                break;
                            }
                        }
                    }
                    emptyList = CollectionsKt.emptyList();
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(arrayList, emptyList);
            }
            return arrayList;
        }
        throw new IllegalStateException(("Type '" + compiledNamedType + "' can only have one possible type").toString());
    }

    public static final List<ObjectType> possibleTypes(List<? extends CompiledType> allTypes, CompiledNamedType type) {
        Intrinsics.checkNotNullParameter(allTypes, "allTypes");
        Intrinsics.checkNotNullParameter(type, "type");
        List<ObjectType> possibleTypesInternal = possibleTypesInternal(allTypes, type);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : possibleTypesInternal) {
            if (hashSet.add(((ObjectType) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.apollographql.apollo.api.PossibleTypes$possibleTypes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((ObjectType) t).getName(), ((ObjectType) t2).getName());
            }
        });
    }
}
