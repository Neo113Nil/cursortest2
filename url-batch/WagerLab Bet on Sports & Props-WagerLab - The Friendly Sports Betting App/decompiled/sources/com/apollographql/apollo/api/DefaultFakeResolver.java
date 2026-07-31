package com.apollographql.apollo.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: fakeResolver.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/apollographql/apollo/api/DefaultFakeResolver;", "Lcom/apollographql/apollo/api/FakeResolver;", "types", "", "Lcom/apollographql/apollo/api/CompiledNamedType;", "<init>", "(Ljava/util/List;)V", "enumTypes", "Lcom/apollographql/apollo/api/EnumType;", "allTypes", "resolveLeaf", "", "context", "Lcom/apollographql/apollo/api/FakeResolverContext;", "toPathComponent", "", "resolveListSize", "", "resolveMaybeNull", "", "resolveTypename", "stableIdForObject", "obj", "", "mergedField", "Lcom/apollographql/apollo/api/CompiledField;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DefaultFakeResolver implements FakeResolver {
    private final List<CompiledNamedType> allTypes;
    private final List<EnumType> enumTypes;

    @Override // com.apollographql.apollo.api.FakeResolver
    public int resolveListSize(FakeResolverContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 3;
    }

    @Override // com.apollographql.apollo.api.FakeResolver
    public boolean resolveMaybeNull(FakeResolverContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultFakeResolver(List<? extends CompiledNamedType> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        ArrayList arrayList = new ArrayList();
        for (Object obj : types) {
            if (obj instanceof EnumType) {
                arrayList.add(obj);
            }
        }
        this.enumTypes = arrayList;
        this.allTypes = types;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.apollographql.apollo.api.FakeResolver
    public Object resolveLeaf(FakeResolverContext context) {
        Object obj;
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        String name = context.getMergedField().getType().rawType().getName();
        switch (name.hashCode()) {
            case -1808118735:
                if (name.equals("String")) {
                    List<Object> path = context.getPath();
                    ListIterator<Object> listIterator = path.listIterator(path.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i = -1;
                        } else if (listIterator.previous() instanceof String) {
                            i = listIterator.nextIndex();
                        }
                    }
                    return CollectionsKt.joinToString$default(context.getPath().subList(i, context.getPath().size()), "", null, null, 0, null, new Function1() { // from class: com.apollographql.apollo.api.DefaultFakeResolver$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            CharSequence resolveLeaf$lambda$1;
                            resolveLeaf$lambda$1 = DefaultFakeResolver.resolveLeaf$lambda$1(DefaultFakeResolver.this, obj2);
                            return resolveLeaf$lambda$1;
                        }
                    }, 30, null);
                }
                break;
            case 2331:
                if (name.equals("ID")) {
                    return String.valueOf(Math.abs(context.getId().hashCode()));
                }
                break;
            case 73679:
                if (name.equals("Int")) {
                    return Integer.valueOf(context.getId().hashCode() % 100);
                }
                break;
            case 67973692:
                if (name.equals("Float")) {
                    return Double.valueOf((context.getId().hashCode() % 100000) / 100.0d);
                }
                break;
            case 1729365000:
                if (name.equals("Boolean")) {
                    return Boolean.valueOf(context.getId().hashCode() % 2 == 0);
                }
                break;
        }
        Iterator<T> it = this.enumTypes.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((EnumType) obj).getName(), name)) {
                }
            } else {
                obj = null;
            }
        }
        EnumType enumType = (EnumType) obj;
        if (enumType == null) {
            throw new IllegalStateException(("Don't know how to instantiate leaf " + name).toString());
        }
        List<String> values = enumType.getValues();
        int hashCode = context.getId().hashCode();
        int size = enumType.getValues().size();
        int i2 = hashCode % size;
        return values.get(i2 + (size & (((i2 ^ size) & ((-i2) | i2)) >> 31)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence resolveLeaf$lambda$1(DefaultFakeResolver defaultFakeResolver, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return defaultFakeResolver.toPathComponent(it);
    }

    private final String toPathComponent(Object obj) {
        return obj instanceof Integer ? "[" + ((Number) obj).intValue() + AbstractJsonLexerKt.END_LIST : obj.toString();
    }

    @Override // com.apollographql.apollo.api.FakeResolver
    public String resolveTypename(FakeResolverContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<ObjectType> possibleTypes = PossibleTypes.possibleTypes(this.allTypes, context.getMergedField().getType().rawType());
        int hashCode = context.getId().hashCode();
        int size = possibleTypes.size();
        int i = hashCode % size;
        return possibleTypes.get(i + (size & (((i ^ size) & ((-i) | i)) >> 31))).getName();
    }

    @Override // com.apollographql.apollo.api.FakeResolver
    public String stableIdForObject(Map<String, ? extends Object> obj, CompiledField mergedField) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(mergedField, "mergedField");
        List<String> keyFields = CompiledGraphQL.keyFields(mergedField.getType().rawType());
        if (obj.containsKey("__stableId")) {
            return String.valueOf(obj.get("__stableId"));
        }
        if (keyFields.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(obj.get("__typename")));
        Iterator<T> it = keyFields.iterator();
        while (it.hasNext()) {
            sb.append(String.valueOf(obj.get((String) it.next())));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
