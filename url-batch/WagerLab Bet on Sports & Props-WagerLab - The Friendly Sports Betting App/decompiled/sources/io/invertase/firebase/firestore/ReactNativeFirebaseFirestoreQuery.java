package io.invertase.firebase.firestore;

import com.amazon.a.a.o.b;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.Filter;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.Source;
import io.invertase.firebase.common.RCTConvertFirebase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseFirestoreQuery {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    String appName;
    String databaseId;
    Query query;

    ReactNativeFirebaseFirestoreQuery(String str, String str2, Query query, ReadableArray readableArray, ReadableArray readableArray2, ReadableMap readableMap) {
        this.appName = str;
        this.query = query;
        applyFilters(readableArray);
        applyOrders(readableArray2);
        applyOptions(readableMap);
    }

    public Task<WritableMap> get(Executor executor, final Source source) {
        return Tasks.call(executor, new Callable() { // from class: io.invertase.firebase.firestore.ReactNativeFirebaseFirestoreQuery$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WritableMap lambda$get$0;
                lambda$get$0 = ReactNativeFirebaseFirestoreQuery.this.lambda$get$0(source);
                return lambda$get$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WritableMap lambda$get$0(Source source) throws Exception {
        return ReactNativeFirebaseFirestoreSerialize.snapshotToWritableMap(this.appName, this.databaseId, b.au, (QuerySnapshot) Tasks.await(this.query.get(source)), null);
    }

    private void applyFilters(ReadableArray readableArray) {
        FieldPath of;
        Object parseTypeMap;
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            if (map.hasKey("fieldPath")) {
                of = FieldPath.of((String[]) Objects.requireNonNull((String[]) ((ReadableArray) Objects.requireNonNull(((ReadableMap) Objects.requireNonNull(map)).getArray("fieldPath"))).toArrayList().toArray(new String[0])));
                String string = map.getString("operator");
                parseTypeMap = ReactNativeFirebaseFirestoreSerialize.parseTypeMap(this.query.getFirestore(), (ReadableArray) Objects.requireNonNull(map.getArray("value")));
                String str = (String) Objects.requireNonNull(string);
                str.hashCode();
                switch (str) {
                    case "LESS_THAN_OR_EQUAL":
                        this.query = this.query.whereLessThanOrEqualTo((FieldPath) Objects.requireNonNull(of), Objects.requireNonNull(parseTypeMap));
                        break;
                    case "NOT_IN":
                        this.query = this.query.whereNotIn((FieldPath) Objects.requireNonNull(of), (List<? extends Object>) Objects.requireNonNull((List) parseTypeMap));
                        break;
                    case "LESS_THAN":
                        this.query = this.query.whereLessThan((FieldPath) Objects.requireNonNull(of), Objects.requireNonNull(parseTypeMap));
                        break;
                    case "ARRAY_CONTAINS_ANY":
                        this.query = this.query.whereArrayContainsAny((FieldPath) Objects.requireNonNull(of), (List<? extends Object>) Objects.requireNonNull((List) parseTypeMap));
                        break;
                    case "IN":
                        this.query = this.query.whereIn((FieldPath) Objects.requireNonNull(of), (List<? extends Object>) Objects.requireNonNull((List) parseTypeMap));
                        break;
                    case "EQUAL":
                        this.query = this.query.whereEqualTo((FieldPath) Objects.requireNonNull(of), parseTypeMap);
                        break;
                    case "ARRAY_CONTAINS":
                        this.query = this.query.whereArrayContains((FieldPath) Objects.requireNonNull(of), Objects.requireNonNull(parseTypeMap));
                        break;
                    case "GREATER_THAN":
                        this.query = this.query.whereGreaterThan((FieldPath) Objects.requireNonNull(of), Objects.requireNonNull(parseTypeMap));
                        break;
                    case "GREATER_THAN_OR_EQUAL":
                        this.query = this.query.whereGreaterThanOrEqualTo((FieldPath) Objects.requireNonNull(of), Objects.requireNonNull(parseTypeMap));
                        break;
                    case "NOT_EQUAL":
                        this.query = this.query.whereNotEqualTo((FieldPath) Objects.requireNonNull(of), parseTypeMap);
                        break;
                }
            } else if (map.hasKey("operator") && map.hasKey("queries")) {
                this.query = this.query.where(applyFilterQueries(map));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d7, code lost:
    
        if (r1.equals("LESS_THAN_OR_EQUAL") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Filter applyFilterQueries(ReadableMap readableMap) {
        char c = 0;
        if (readableMap.hasKey("fieldPath")) {
            String str = (String) Objects.requireNonNull(((ReadableMap) Objects.requireNonNull(readableMap)).getString("operator"));
            ReadableArray readableArray = (ReadableArray) Objects.requireNonNull(((ReadableMap) Objects.requireNonNull(readableMap.getMap("fieldPath"))).getArray("_segments"));
            int size = readableArray.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = readableArray.getString(i);
            }
            FieldPath of = FieldPath.of(strArr);
            Object parseTypeMap = ReactNativeFirebaseFirestoreSerialize.parseTypeMap(this.query.getFirestore(), (ReadableArray) Objects.requireNonNull(readableMap.getArray("value")));
            str.hashCode();
            switch (str.hashCode()) {
                case -2081783184:
                    break;
                case -1986339279:
                    if (str.equals("NOT_IN")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1112834937:
                    if (str.equals("LESS_THAN")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -466714638:
                    if (str.equals("ARRAY_CONTAINS_ANY")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 66219796:
                    if (str.equals("EQUAL")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 67210597:
                    if (str.equals("ARRAY_CONTAINS")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 972152550:
                    if (str.equals("GREATER_THAN")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 989027057:
                    if (str.equals("GREATER_THAN_OR_EQUAL")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1022422664:
                    if (str.equals("NOT_EQUAL")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return Filter.lessThanOrEqualTo(of, parseTypeMap);
                case 1:
                    return Filter.notInArray(of, (List<? extends Object>) parseTypeMap);
                case 2:
                    return Filter.lessThan(of, parseTypeMap);
                case 3:
                    return Filter.arrayContainsAny(of, (List<? extends Object>) parseTypeMap);
                case 4:
                    return Filter.inArray(of, (List<? extends Object>) parseTypeMap);
                case 5:
                    return Filter.equalTo(of, parseTypeMap);
                case 6:
                    return Filter.arrayContains(of, parseTypeMap);
                case 7:
                    return Filter.greaterThan(of, parseTypeMap);
                case '\b':
                    return Filter.greaterThanOrEqualTo(of, parseTypeMap);
                case '\t':
                    return Filter.notEqualTo(of, parseTypeMap);
                default:
                    throw new Error("Invalid operator");
            }
        }
        String string = ((ReadableMap) Objects.requireNonNull(readableMap)).getString("operator");
        ReadableArray readableArray2 = (ReadableArray) Objects.requireNonNull(((ReadableMap) Objects.requireNonNull(readableMap)).getArray("queries"));
        ArrayList arrayList = new ArrayList();
        int size2 = readableArray2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(applyFilterQueries(readableArray2.getMap(i2)));
        }
        if (string.equals("AND")) {
            return Filter.and((Filter[]) arrayList.toArray(new Filter[0]));
        }
        if (string.equals("OR")) {
            return Filter.or((Filter[]) arrayList.toArray(new Filter[0]));
        }
        throw new Error("Missing 'Filter' instance return");
    }

    private void applyOrders(ReadableArray readableArray) {
        Iterator<Object> it = RCTConvertFirebase.toArrayList(readableArray).iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.get("fieldPath") instanceof List) {
                this.query = this.query.orderBy((FieldPath) Objects.requireNonNull(FieldPath.of((String[]) ((ArrayList) map.get("fieldPath")).toArray(new String[0]))), Query.Direction.valueOf((String) map.get("direction")));
            } else {
                this.query = this.query.orderBy((String) Objects.requireNonNull((String) map.get("fieldPath")), Query.Direction.valueOf((String) map.get("direction")));
            }
        }
    }

    private void applyOptions(ReadableMap readableMap) {
        if (readableMap.hasKey("limit")) {
            this.query = this.query.limit(readableMap.getInt("limit"));
        }
        if (readableMap.hasKey("limitToLast")) {
            this.query = this.query.limitToLast(readableMap.getInt("limitToLast"));
        }
        if (readableMap.hasKey("startAt")) {
            this.query = this.query.startAt((Object[]) Objects.requireNonNull(ReactNativeFirebaseFirestoreSerialize.parseReadableArray(this.query.getFirestore(), readableMap.getArray("startAt")).toArray()));
        }
        if (readableMap.hasKey("startAfter")) {
            this.query = this.query.startAfter((Object[]) Objects.requireNonNull(ReactNativeFirebaseFirestoreSerialize.parseReadableArray(this.query.getFirestore(), readableMap.getArray("startAfter")).toArray()));
        }
        if (readableMap.hasKey("endAt")) {
            this.query = this.query.endAt((Object[]) Objects.requireNonNull(ReactNativeFirebaseFirestoreSerialize.parseReadableArray(this.query.getFirestore(), readableMap.getArray("endAt")).toArray()));
        }
        if (readableMap.hasKey("endBefore")) {
            this.query = this.query.endBefore((Object[]) Objects.requireNonNull(ReactNativeFirebaseFirestoreSerialize.parseReadableArray(this.query.getFirestore(), readableMap.getArray("endBefore")).toArray()));
        }
    }
}
