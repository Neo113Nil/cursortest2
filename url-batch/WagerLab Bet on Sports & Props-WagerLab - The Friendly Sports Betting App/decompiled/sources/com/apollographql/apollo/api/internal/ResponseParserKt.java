package com.apollographql.apollo.api.internal;

import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonReaders;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResponseParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004*\u00020\u0002H\u0002\u001a\u0014\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004*\u00020\u0002H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0002\u001a\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"readError", "Lcom/apollographql/apollo/api/Error;", "Lcom/apollographql/apollo/api/json/JsonReader;", "readPath", "", "", "readErrorLocations", "Lcom/apollographql/apollo/api/Error$Location;", "readErrorLocation", "readErrors", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResponseParserKt {

    /* compiled from: ResponseParser.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Error readError(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = "";
        List<Error.Location> list = null;
        List<Object> list2 = null;
        Map map = null;
        LinkedHashMap linkedHashMap = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -1809421292:
                    if (!nextName.equals("extensions")) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(nextName, JsonReaders.readAny(jsonReader));
                        break;
                    } else {
                        Object readAny = JsonReaders.readAny(jsonReader);
                        if (!(readAny instanceof Map)) {
                            map = null;
                            break;
                        } else {
                            map = (Map) readAny;
                            break;
                        }
                    }
                case -1197189282:
                    if (!nextName.equals("locations")) {
                        if (linkedHashMap == null) {
                        }
                        linkedHashMap.put(nextName, JsonReaders.readAny(jsonReader));
                        break;
                    } else {
                        list = readErrorLocations(jsonReader);
                        break;
                    }
                    break;
                case 3433509:
                    if (!nextName.equals("path")) {
                        if (linkedHashMap == null) {
                        }
                        linkedHashMap.put(nextName, JsonReaders.readAny(jsonReader));
                        break;
                    } else {
                        list2 = readPath(jsonReader);
                        break;
                    }
                    break;
                case 954925063:
                    if (!nextName.equals("message")) {
                        if (linkedHashMap == null) {
                        }
                        linkedHashMap.put(nextName, JsonReaders.readAny(jsonReader));
                        break;
                    } else {
                        String nextString = jsonReader.nextString();
                        if (nextString != null) {
                            str = nextString;
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    }
                    break;
                default:
                    if (linkedHashMap == null) {
                    }
                    linkedHashMap.put(nextName, JsonReaders.readAny(jsonReader));
                    break;
            }
        }
        jsonReader.endObject();
        return new Error(str, list, list2, map, linkedHashMap);
    }

    private static final List<Object> readPath(JsonReader jsonReader) {
        if (jsonReader.getPeekedToken() == JsonReader.Token.NULL) {
            return (List) jsonReader.nextNull();
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[jsonReader.getPeekedToken().ordinal()];
            if (i == 1 || i == 2) {
                arrayList.add(Integer.valueOf(jsonReader.nextInt()));
            } else {
                String nextString = jsonReader.nextString();
                Intrinsics.checkNotNull(nextString);
                arrayList.add(nextString);
            }
        }
        jsonReader.endArray();
        return arrayList;
    }

    private static final List<Error.Location> readErrorLocations(JsonReader jsonReader) {
        if (jsonReader.getPeekedToken() == JsonReader.Token.NULL) {
            return (List) jsonReader.nextNull();
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(readErrorLocation(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    private static final Error.Location readErrorLocation(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        int i2 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Intrinsics.areEqual(nextName, "line")) {
                i = jsonReader.nextInt();
            } else if (Intrinsics.areEqual(nextName, "column")) {
                i2 = jsonReader.nextInt();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new Error.Location(i, i2);
    }

    public static final List<Error> readErrors(JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        if (jsonReader.getPeekedToken() == JsonReader.Token.NULL) {
            jsonReader.nextNull();
            return CollectionsKt.emptyList();
        }
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            arrayList.add(readError(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
