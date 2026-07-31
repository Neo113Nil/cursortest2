package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.internal.UtilsKt;
import com.apollographql.apollo.exception.JsonDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.bm.Languages;

/* compiled from: MapJsonReader.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 >2\u00020\u0001:\u0001>B#\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\b\u0010\"\u001a\u00020\u0000H\u0016J\b\u0010#\u001a\u00020\u0000H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u000bH\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\b\u0010(\u001a\u00020\u0012H\u0016J\b\u0010)\u001a\u00020%H\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001aH\u0016J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000202H\u0016J\u0006\u00103\u001a\u00020\u0003J\b\u00104\u001a\u00020\u001eH\u0016J\b\u00105\u001a\u00020\u001eH\u0016J\u001e\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u00122\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0002J\u0016\u00109\u001a\u00020\u001a2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0016J\b\u0010;\u001a\u00020\u001eH\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\b\u0010=\u001a\u00020\u0012H\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR&\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00110\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonReader;", "Lcom/apollographql/apollo/api/json/JsonReader;", "root", "", "pathRoot", "", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "getRoot", "()Ljava/lang/Object;", "peekedToken", "Lcom/apollographql/apollo/api/json/JsonReader$Token;", "peekedData", "path", "", "[Ljava/lang/Object;", "containerStack", "", "", "[Ljava/util/Map;", "iteratorStack", "", "[Ljava/util/Iterator;", "nameIndexStack", "", "stackSize", "", "anyToToken", Languages.ANY, "advanceIterator", "", "increaseStack", "beginArray", "endArray", "beginObject", "endObject", "hasNext", "", "peek", "nextName", "nextString", "nextBoolean", "nextNull", "", "nextDouble", "", "nextInt", "nextLong", "", "nextNumber", "Lcom/apollographql/apollo/api/json/JsonNumber;", "nextValue", "skipValue", "close", "findName", "needle", "haystack", "selectName", "names", "rewind", "getPath", "getPathAsString", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapJsonReader implements JsonReader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Map<String, Object>[] containerStack;
    private Iterator<?>[] iteratorStack;
    private int[] nameIndexStack;
    private Object[] path;
    private final List<Object> pathRoot;
    private Object peekedData;
    private JsonReader.Token peekedToken;
    private final Object root;
    private int stackSize;

    /* compiled from: MapJsonReader.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.END_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonReader.Token.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapJsonReader(Object obj) {
        this(obj, null, 2, 0 == true ? 1 : 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public MapJsonReader(Object obj, List<? extends Object> pathRoot) {
        Intrinsics.checkNotNullParameter(pathRoot, "pathRoot");
        this.root = obj;
        this.pathRoot = pathRoot;
        this.path = new Object[64];
        this.containerStack = new Map[64];
        this.iteratorStack = new Iterator[64];
        this.nameIndexStack = new int[64];
        this.peekedToken = anyToToken(obj);
        this.peekedData = obj;
    }

    public final Object getRoot() {
        return this.root;
    }

    public /* synthetic */ MapJsonReader(Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    private final JsonReader.Token anyToToken(Object any) {
        if (any == null) {
            return JsonReader.Token.NULL;
        }
        if (any instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (any instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (any instanceof Integer) {
            return JsonReader.Token.NUMBER;
        }
        if (any instanceof Long) {
            return JsonReader.Token.LONG;
        }
        if (!(any instanceof Double) && !(any instanceof JsonNumber)) {
            return any instanceof String ? JsonReader.Token.STRING : any instanceof Boolean ? JsonReader.Token.BOOLEAN : JsonReader.Token.ANY;
        }
        return JsonReader.Token.NUMBER;
    }

    private final void advanceIterator() {
        JsonReader.Token token;
        int i = this.stackSize;
        if (i == 0) {
            this.peekedToken = JsonReader.Token.END_DOCUMENT;
            return;
        }
        Iterator<?> it = this.iteratorStack[i - 1];
        Intrinsics.checkNotNull(it);
        Object[] objArr = this.path;
        int i2 = this.stackSize;
        if (objArr[i2 - 1] instanceof Integer) {
            int i3 = i2 - 1;
            Object obj = objArr[i2 - 1];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i3] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (it.hasNext()) {
            Object next = it.next();
            this.peekedData = next;
            this.peekedToken = next instanceof Map.Entry ? JsonReader.Token.NAME : anyToToken(next);
        } else {
            if (this.path[this.stackSize - 1] instanceof Integer) {
                token = JsonReader.Token.END_ARRAY;
            } else {
                token = JsonReader.Token.END_OBJECT;
            }
            this.peekedToken = token;
        }
    }

    private final void increaseStack() {
        int i = this.stackSize;
        Object[] objArr = this.path;
        if (i == objArr.length) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.path = copyOf;
            Map<String, Object>[] mapArr = this.containerStack;
            Object[] copyOf2 = Arrays.copyOf(mapArr, mapArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.containerStack = (Map[]) copyOf2;
            int[] iArr = this.nameIndexStack;
            int[] copyOf3 = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(...)");
            this.nameIndexStack = copyOf3;
            Iterator<?>[] itArr = this.iteratorStack;
            Object[] copyOf4 = Arrays.copyOf(itArr, itArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf4, "copyOf(...)");
            this.iteratorStack = (Iterator[]) copyOf4;
        }
        this.stackSize++;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public MapJsonReader beginArray() {
        if (getPeekedToken() != JsonReader.Token.BEGIN_ARRAY) {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        Object obj = this.peekedData;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        increaseStack();
        this.path[this.stackSize - 1] = -1;
        this.iteratorStack[this.stackSize - 1] = ((List) obj).iterator();
        advanceIterator();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public MapJsonReader endArray() {
        if (getPeekedToken() != JsonReader.Token.END_ARRAY) {
            throw new JsonDataException("Expected END_ARRAY but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        int i = this.stackSize - 1;
        this.stackSize = i;
        this.iteratorStack[i] = null;
        this.path[i] = null;
        advanceIterator();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.apollographql.apollo.api.json.JsonReader
    public MapJsonReader beginObject() {
        if (getPeekedToken() != JsonReader.Token.BEGIN_OBJECT) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        increaseStack();
        Map<String, Object>[] mapArr = this.containerStack;
        int i = this.stackSize - 1;
        Object obj = this.peekedData;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        mapArr[i] = obj;
        rewind();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public MapJsonReader endObject() {
        int i = this.stackSize - 1;
        this.stackSize = i;
        this.iteratorStack[i] = null;
        this.path[i] = null;
        this.containerStack[i] = null;
        advanceIterator();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public boolean hasNext() {
        int i = WhenMappings.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        return (i == 1 || i == 2) ? false : true;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: peek, reason: from getter */
    public JsonReader.Token getPeekedToken() {
        return this.peekedToken;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public String nextName() {
        if (getPeekedToken() != JsonReader.Token.NAME) {
            throw new JsonDataException("Expected NAME but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        Object obj = this.peekedData;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
        Map.Entry entry = (Map.Entry) obj;
        this.path[this.stackSize - 1] = entry.getKey();
        this.peekedData = entry.getValue();
        this.peekedToken = anyToToken(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public String nextString() {
        String value;
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            value = String.valueOf(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            value = String.valueOf(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            value = String.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            value = (String) obj;
        } else if (obj == null) {
            value = "null";
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected a String but got " + obj + " instead").toString());
            }
            value = ((JsonNumber) obj).getValue();
        }
        advanceIterator();
        return value;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public boolean nextBoolean() {
        if (getPeekedToken() != JsonReader.Token.BOOLEAN) {
            throw new JsonDataException("Expected BOOLEAN but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        Object obj = this.peekedData;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        advanceIterator();
        return bool.booleanValue();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public Void nextNull() {
        if (getPeekedToken() != JsonReader.Token.NULL) {
            throw new JsonDataException("Expected NULL but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        advanceIterator();
        return null;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public double nextDouble() {
        double parseDouble;
        int i = WhenMappings.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Double but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            parseDouble = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseDouble = UtilsKt.m9333LongToDoubleExact(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            parseDouble = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
            }
            parseDouble = Double.parseDouble(((JsonNumber) obj).getValue());
        }
        advanceIterator();
        return parseDouble;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public int nextInt() {
        int parseInt;
        int i = WhenMappings.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected an Int but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            parseInt = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseInt = UtilsKt.m9334LongToIntExact(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseInt = UtilsKt.m9331DoubleToIntExact(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseInt = Integer.parseInt((String) obj);
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
            }
            parseInt = Integer.parseInt(((JsonNumber) obj).getValue());
        }
        advanceIterator();
        return parseInt;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public long nextLong() {
        long parseLong;
        int i = WhenMappings.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Long but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            parseLong = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            parseLong = UtilsKt.m9332DoubleToLongExact(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseLong = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
            }
            parseLong = Long.parseLong(((JsonNumber) obj).getValue());
        }
        advanceIterator();
        return parseLong;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonNumber nextNumber() {
        JsonNumber jsonNumber;
        int i = WhenMappings.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Number but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        Object obj = this.peekedData;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) {
            jsonNumber = new JsonNumber(obj.toString());
        } else if (obj instanceof String) {
            jsonNumber = new JsonNumber((String) obj);
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
            jsonNumber = (JsonNumber) obj;
        }
        advanceIterator();
        return jsonNumber;
    }

    public final Object nextValue() {
        Object obj = this.peekedData;
        if (obj == null) {
            throw new JsonDataException("Expected a non-null value at path " + getPathAsString());
        }
        advanceIterator();
        return obj;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public void skipValue() {
        advanceIterator();
    }

    private final int findName(String needle, List<String> haystack) {
        int i = this.nameIndexStack[this.stackSize - 1];
        if (i < haystack.size() && Intrinsics.areEqual(haystack.get(i), needle)) {
            int[] iArr = this.nameIndexStack;
            int i2 = this.stackSize;
            iArr[i2 - 1] = iArr[i2 - 1] + 1;
            return i;
        }
        int indexOf = haystack.indexOf(needle);
        if (indexOf != -1) {
            this.nameIndexStack[this.stackSize - 1] = indexOf + 1;
        }
        return indexOf;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public int selectName(List<String> names) {
        Intrinsics.checkNotNullParameter(names, "names");
        while (hasNext()) {
            int findName = findName(nextName(), names);
            if (findName != -1) {
                return findName;
            }
            skipValue();
        }
        return -1;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public void rewind() {
        Map<String, Object>[] mapArr = this.containerStack;
        int i = this.stackSize;
        Map<String, Object> map = mapArr[i - 1];
        this.path[i - 1] = null;
        Intrinsics.checkNotNull(map);
        this.iteratorStack[i - 1] = map.entrySet().iterator();
        this.nameIndexStack[this.stackSize - 1] = 0;
        advanceIterator();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public List<Object> getPath() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.pathRoot);
        int i = this.stackSize;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.path[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final String getPathAsString() {
        return CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null);
    }

    /* compiled from: MapJsonReader.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonReader$Companion;", "", "<init>", "()V", "buffer", "Lcom/apollographql/apollo/api/json/MapJsonReader;", "Lcom/apollographql/apollo/api/json/JsonReader;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MapJsonReader buffer(JsonReader jsonReader) {
            Intrinsics.checkNotNullParameter(jsonReader, "<this>");
            if (jsonReader instanceof MapJsonReader) {
                return (MapJsonReader) jsonReader;
            }
            JsonReader.Token peekedToken = jsonReader.getPeekedToken();
            if (peekedToken != JsonReader.Token.BEGIN_OBJECT) {
                throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + peekedToken + "` json token").toString());
            }
            List<Object> path = jsonReader.getPath();
            Object readAny = JsonReaders.readAny(jsonReader);
            Intrinsics.checkNotNull(readAny, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return new MapJsonReader((Map) readAny, path);
        }
    }
}
