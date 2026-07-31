package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Executable;
import com.apollographql.apollo.api.ObjectType;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0007¢\u0006\u0002\b\u0006\u001a \u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\n\u001a\b\u0018\u00010\bj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\n\u0010\u001c\u001a\u00020\u001d*\u00020\u001e\u001a\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u001e\"\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0011\"\u0016\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0011\"\u0016\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0011\"\u0016\u0010\u0018\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0011\"\u0016\u0010\u001a\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0011*\u000e\u0010\u0007\"\u0004\u0018\u00010\b2\u0004\u0018\u00010\b¨\u0006\""}, d2 = {"notNull", "Lcom/apollographql/apollo/api/CompiledNotNullType;", "Lcom/apollographql/apollo/api/CompiledType;", "-notNull", AttributeType.LIST, "Lcom/apollographql/apollo/api/CompiledListType;", "-list", "CompiledValue", "", "resolveVariables", "value", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "variables", "Lcom/apollographql/apollo/api/Executable$Variables;", "CompiledSchemaType", "Lcom/apollographql/apollo/api/ObjectType;", "getCompiledSchemaType$annotations", "()V", "CompiledTypeType", "getCompiledTypeType$annotations", "CompiledFieldType", "getCompiledFieldType$annotations", "CompiledInputValueType", "getCompiledInputValueType$annotations", "CompiledEnumValueType", "getCompiledEnumValueType$annotations", "CompiledDirectiveType", "getCompiledDirectiveType$annotations", "isComposite", "", "Lcom/apollographql/apollo/api/CompiledNamedType;", "keyFields", "", "", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompiledGraphQL {
    public static final ObjectType CompiledSchemaType = new ObjectType.Builder("__Schema").build();
    public static final ObjectType CompiledTypeType = new ObjectType.Builder("__Type").build();
    public static final ObjectType CompiledFieldType = new ObjectType.Builder("__Field").build();
    public static final ObjectType CompiledInputValueType = new ObjectType.Builder("__InputValue").build();
    public static final ObjectType CompiledEnumValueType = new ObjectType.Builder("__EnumValue").build();
    public static final ObjectType CompiledDirectiveType = new ObjectType.Builder("__Directive").build();

    @Deprecated(level = DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledDirectiveType$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledEnumValueType$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledFieldType$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledInputValueType$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledSchemaType$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledTypeType$annotations() {
    }

    /* renamed from: -notNull, reason: not valid java name */
    public static final CompiledNotNullType m9327notNull(CompiledType compiledType) {
        Intrinsics.checkNotNullParameter(compiledType, "<this>");
        return new CompiledNotNullType(compiledType);
    }

    /* renamed from: -list, reason: not valid java name */
    public static final CompiledListType m9326list(CompiledType compiledType) {
        Intrinsics.checkNotNullParameter(compiledType, "<this>");
        return new CompiledListType(compiledType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object resolveVariables(Object obj, Executable.Variables variables) {
        Object resolveVariables;
        Pair pair;
        if (obj == null) {
            return null;
        }
        if (obj instanceof CompiledVariable) {
            throw new IllegalStateException("must be checked by the caller".toString());
        }
        if (obj instanceof Map) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value instanceof CompiledVariable) {
                    CompiledVariable compiledVariable = (CompiledVariable) value;
                    pair = variables.getValueMap().containsKey(compiledVariable.getName()) ? TuplesKt.to(entry.getKey(), variables.getValueMap().get(compiledVariable.getName())) : null;
                } else {
                    pair = TuplesKt.to(entry.getKey(), resolveVariables(value, variables));
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return MapsKt.toMap(CollectionsKt.sortedWith(CollectionsKt.toList(arrayList), new Comparator() { // from class: com.apollographql.apollo.api.CompiledGraphQL$resolveVariables$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((String) ((Pair) t).getFirst(), (String) ((Pair) t2).getFirst());
                }
            }));
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Object obj2 : iterable) {
            if (obj2 instanceof CompiledVariable) {
                CompiledVariable compiledVariable2 = (CompiledVariable) obj2;
                resolveVariables = variables.getValueMap().containsKey(compiledVariable2.getName()) ? variables.getValueMap().get(compiledVariable2.getName()) : null;
            } else {
                resolveVariables = resolveVariables(obj2, variables);
            }
            arrayList2.add(resolveVariables);
        }
        return arrayList2;
    }

    public static final boolean isComposite(CompiledNamedType compiledNamedType) {
        Intrinsics.checkNotNullParameter(compiledNamedType, "<this>");
        return (compiledNamedType instanceof UnionType) || (compiledNamedType instanceof InterfaceType) || (compiledNamedType instanceof ObjectType);
    }

    public static final List<String> keyFields(CompiledNamedType compiledNamedType) {
        Intrinsics.checkNotNullParameter(compiledNamedType, "<this>");
        return compiledNamedType instanceof InterfaceType ? ((InterfaceType) compiledNamedType).getKeyFields() : compiledNamedType instanceof ObjectType ? ((ObjectType) compiledNamedType).getKeyFields() : CollectionsKt.emptyList();
    }
}
