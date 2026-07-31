package com.apollographql.apollo.api;

import com.apollographql.apollo.api.ExecutionContext;
import com.facebook.FacebookActivity;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomScalarAdapters.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0002#$BY\b\u0002\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\n\u0012\u0004\u0012\u0002H\u0013\u0018\u00010\u0005\"\b\b\u0000\u0010\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0005\"\b\b\u0000\u0010\u0013*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0007J \u0010\u001f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00140\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0002J\u0006\u0010!\u001a\u00020\"R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "customScalarAdapters", "", "", "Lcom/apollographql/apollo/api/Adapter;", "falseVariables", "", "deferredFragmentIdentifiers", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "errors", "", "Lcom/apollographql/apollo/api/Error;", "unsafe", "", "<init>", "(Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Z)V", "adaptersMap", "adapterFor", "T", "", "name", "responseAdapterFor", "customScalar", "Lcom/apollographql/apollo/api/CustomScalarType;", "key", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "firstErrorStartingWith", "path", "startsWith", "responsePath", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "Key", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomScalarAdapters implements ExecutionContext.Element {
    private final Map<String, Adapter<?>> adaptersMap;
    public final Set<DeferredFragmentIdentifier> deferredFragmentIdentifiers;
    public final List<Error> errors;
    public final Set<String> falseVariables;
    private final boolean unsafe;

    /* renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CustomScalarAdapters Empty = new Builder().build();
    public static final CustomScalarAdapters PassThrough = new Builder().unsafe(true).build();

    public /* synthetic */ CustomScalarAdapters(Map map, Set set, Set set2, List list, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, set, set2, list, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CustomScalarAdapters(Map<String, ? extends Adapter<?>> map, Set<String> set, Set<DeferredFragmentIdentifier> set2, List<Error> list, boolean z) {
        this.falseVariables = set;
        this.deferredFragmentIdentifiers = set2;
        this.errors = list;
        this.unsafe = z;
        this.adaptersMap = map;
    }

    public final <T> Adapter<T> adapterFor(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (Adapter) this.adaptersMap.get(name);
    }

    public final <T> Adapter<T> responseAdapterFor(CustomScalarType customScalar) {
        PassThroughAdapter passThroughAdapter;
        Intrinsics.checkNotNullParameter(customScalar, "customScalar");
        if (this.adaptersMap.get(customScalar.getName()) != null) {
            passThroughAdapter = (Adapter<T>) this.adaptersMap.get(customScalar.getName());
        } else if (Intrinsics.areEqual(customScalar.getClassName(), "com.apollographql.apollo.api.Upload")) {
            passThroughAdapter = (Adapter<T>) Adapters.UploadAdapter;
        } else if (CollectionsKt.listOf((Object[]) new String[]{"kotlin.String", "java.lang.String"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (Adapter<T>) Adapters.StringAdapter;
        } else if (CollectionsKt.listOf((Object[]) new String[]{"kotlin.Boolean", "java.lang.Boolean"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (Adapter<T>) Adapters.BooleanAdapter;
        } else if (CollectionsKt.listOf((Object[]) new String[]{"kotlin.Int", "java.lang.Int"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (Adapter<T>) Adapters.IntAdapter;
        } else if (CollectionsKt.listOf((Object[]) new String[]{"kotlin.Double", "java.lang.Double"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (Adapter<T>) Adapters.DoubleAdapter;
        } else if (CollectionsKt.listOf((Object[]) new String[]{"kotlin.Long", "java.lang.Long"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (Adapter<T>) Adapters.LongAdapter;
        } else if (CollectionsKt.listOf((Object[]) new String[]{"kotlin.Float", "java.lang.Float"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (Adapter<T>) Adapters.FloatAdapter;
        } else if (CollectionsKt.listOf((Object[]) new String[]{"kotlin.Any", "java.lang.Object"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (Adapter<T>) Adapters.AnyAdapter;
        } else {
            if (!this.unsafe) {
                throw new IllegalStateException(("Can't map GraphQL type: `" + customScalar.getName() + "` to: `" + customScalar.getClassName() + "`. Did you forget to add a scalar Adapter?").toString());
            }
            passThroughAdapter = new PassThroughAdapter();
        }
        Intrinsics.checkNotNull(passThroughAdapter, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
        return passThroughAdapter;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    /* compiled from: CustomScalarAdapters.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0010\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "<init>", "()V", "Empty", FacebookActivity.PASS_THROUGH_CANCEL_ACTION, "getPassThrough$annotations", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.api.CustomScalarAdapters$Key, reason: from kotlin metadata */
    public static final class Companion implements ExecutionContext.Key<CustomScalarAdapters> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPassThrough$annotations() {
        }

        private Companion() {
        }
    }

    public final Error firstErrorStartingWith(List<? extends Object> path) {
        Intrinsics.checkNotNullParameter(path, "path");
        List<Error> list = this.errors;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<Object> path2 = ((Error) next).getPath();
            if (path2 != null && startsWith(path2, path)) {
                obj = next;
                break;
            }
        }
        return (Error) obj;
    }

    private final boolean startsWith(List<? extends Object> list, List<? extends Object> list2) {
        int size = list2.size();
        for (int i = 1; i < size; i++) {
            int i2 = i - 1;
            if (i2 >= list.size() || !Intrinsics.areEqual(list2.get(i), list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final Builder newBuilder() {
        return new Builder().addAll(this).falseVariables(this.falseVariables).deferredFragmentIdentifiers(this.deferredFragmentIdentifiers);
    }

    /* compiled from: CustomScalarAdapters.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00002\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bJ\u0016\u0010\f\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bJ\u0016\u0010\u000e\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ\"\u0010\u0011\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0007J\"\u0010\u0011\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0007J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0007J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001aR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "", "<init>", "()V", "adaptersMap", "", "", "Lcom/apollographql/apollo/api/Adapter;", "unsafe", "", "falseVariables", "", "deferredFragmentIdentifiers", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "errors", "", "Lcom/apollographql/apollo/api/Error;", "add", "T", "name", "adapter", "customScalarType", "Lcom/apollographql/apollo/api/CustomScalarType;", "customScalarAdapter", "addAll", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "clear", "", InAppPurchaseConstants.METHOD_BUILD, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private final Map<String, Adapter<?>> adaptersMap = new LinkedHashMap();
        private Set<DeferredFragmentIdentifier> deferredFragmentIdentifiers;
        private List<Error> errors;
        private Set<String> falseVariables;
        private boolean unsafe;

        public final Builder falseVariables(Set<String> falseVariables) {
            this.falseVariables = falseVariables;
            return this;
        }

        public final Builder deferredFragmentIdentifiers(Set<DeferredFragmentIdentifier> deferredFragmentIdentifiers) {
            this.deferredFragmentIdentifiers = deferredFragmentIdentifiers;
            return this;
        }

        public final Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        public final <T> Builder add(String name, Adapter<T> adapter) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.adaptersMap.put(name, adapter);
            return this;
        }

        public final <T> Builder add(CustomScalarType customScalarType, Adapter<T> customScalarAdapter) {
            Intrinsics.checkNotNullParameter(customScalarType, "customScalarType");
            Intrinsics.checkNotNullParameter(customScalarAdapter, "customScalarAdapter");
            this.adaptersMap.put(customScalarType.getName(), customScalarAdapter);
            return this;
        }

        public final Builder addAll(CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            this.adaptersMap.putAll(customScalarAdapters.adaptersMap);
            return this;
        }

        public final Builder unsafe(boolean unsafe) {
            this.unsafe = unsafe;
            return this;
        }

        public final void clear() {
            this.adaptersMap.clear();
        }

        public final CustomScalarAdapters build() {
            return new CustomScalarAdapters(this.adaptersMap, this.falseVariables, this.deferredFragmentIdentifiers, this.errors, this.unsafe, null);
        }
    }
}
