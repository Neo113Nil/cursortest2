package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.Upload;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.devsupport.StackTraceHelper;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: MapJsonWriter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016J\b\u0010\r\u001a\u00020\u0001H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u0010\u0013\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00142\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0014H\u0002¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001aH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001dH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001eH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonWriter;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "<init>", "()V", "root", "", "rootSet", "", StackTraceHelper.STACK_KEY, "", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State;", "beginArray", "endArray", "beginObject", "mergeWith", "other", "endObject", "name", "", "valueInternal", "T", "value", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/json/MapJsonWriter;", "path", "getPath", "()Ljava/lang/String;", "", "", "", "Lcom/apollographql/apollo/api/json/JsonNumber;", "Lcom/apollographql/apollo/api/Upload;", "nullValue", "close", "", "flush", "State", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapJsonWriter implements JsonWriter {
    private Object root;
    private boolean rootSet;
    private final List<State> stack = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public void flush() {
    }

    /* compiled from: MapJsonWriter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonWriter$State;", "", "<init>", "()V", "List", "Map", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State$List;", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State$Map;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class State {
        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: MapJsonWriter.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonWriter$State$List;", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State;", AttributeType.LIST, "", "", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", InAppPurchaseConstants.METHOD_TO_STRING, "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class List extends State {
            private final java.util.List<Object> list;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public List(java.util.List<Object> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "list");
                this.list = list;
            }

            public final java.util.List<Object> getList() {
                return this.list;
            }

            public String toString() {
                return "List (" + this.list.size() + ')';
            }
        }

        private State() {
        }

        /* compiled from: MapJsonWriter.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonWriter$State$Map;", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State;", "map", "", "", "", "name", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getMap", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", InAppPurchaseConstants.METHOD_TO_STRING, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Map extends State {
            private final java.util.Map<String, Object> map;
            private String name;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Map(java.util.Map<String, Object> map, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(map, "map");
                this.map = map;
                this.name = str;
            }

            public final java.util.Map<String, Object> getMap() {
                return this.map;
            }

            public final String getName() {
                return this.name;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public String toString() {
                return "Map (" + this.name + ')';
            }
        }
    }

    public final Object root() {
        if (!this.rootSet) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return this.root;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginArray() {
        this.stack.add(new State.List(new ArrayList()));
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endArray() {
        State remove = this.stack.remove(r0.size() - 1);
        if (!(remove instanceof State.List)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        valueInternal(((State.List) remove).getList());
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginObject() {
        this.stack.add(new State.Map(new LinkedHashMap(), null));
        return this;
    }

    private final Object mergeWith(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                IntRange indices = CollectionsKt.getIndices((Collection) obj);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
                Iterator<Integer> it = indices.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    arrayList.add(mergeWith(list.get(nextInt), list2.get(nextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                Set<String> plus = SetsKt.plus(map.keySet(), (Iterable) map2.keySet());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
                for (String str : plus) {
                    arrayList2.add(TuplesKt.to(str, mergeWith(map.get(str), map2.get(str))));
                }
                return MapsKt.toMap(arrayList2);
            }
            if (!Intrinsics.areEqual(obj, obj2)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
        }
        return obj;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endObject() {
        State remove = this.stack.remove(r0.size() - 1);
        if (!(remove instanceof State.Map)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        valueInternal(((State.Map) remove).getMap());
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter name(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        State state = (State) CollectionsKt.last((List) this.stack);
        if (!(state instanceof State.Map)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        State.Map map = (State.Map) state;
        if (map.getName() != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        map.setName(name);
        return this;
    }

    private final <T> MapJsonWriter valueInternal(T value) {
        State state = (State) CollectionsKt.lastOrNull((List) this.stack);
        if (state instanceof State.Map) {
            State.Map map = (State.Map) state;
            String name = map.getName();
            if (name == null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (map.getMap().containsKey(name)) {
                map.getMap().put(name, mergeWith(map.getMap().get(name), value));
            } else {
                map.getMap().put(name, value);
            }
            map.setName(null);
            return this;
        }
        if (state instanceof State.List) {
            ((State.List) state).getList().add(value);
            return this;
        }
        this.root = value;
        this.rootSet = true;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public String getPath() {
        String name;
        List<State> list = this.stack;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (State state : list) {
            if (state instanceof State.List) {
                name = String.valueOf(((State.List) state).getList().size());
            } else {
                if (!(state instanceof State.Map)) {
                    throw new NoWhenBranchMatchedException();
                }
                name = ((State.Map) state).getName();
                if (name == null) {
                    name = "?";
                }
            }
            arrayList.add(name);
        }
        return CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public MapJsonWriter value(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return valueInternal(value);
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public MapJsonWriter value(boolean value) {
        return valueInternal(Boolean.valueOf(value));
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public MapJsonWriter value(double value) {
        return valueInternal(Double.valueOf(value));
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public MapJsonWriter value(int value) {
        return valueInternal(Integer.valueOf(value));
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public MapJsonWriter value(long value) {
        return valueInternal(Long.valueOf(value));
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public MapJsonWriter value(JsonNumber value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return valueInternal(value);
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public MapJsonWriter value(Upload value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return valueInternal(null);
    }

    public final MapJsonWriter value(Object value) {
        return valueInternal(value);
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public MapJsonWriter nullValue() {
        return valueInternal(null);
    }
}
