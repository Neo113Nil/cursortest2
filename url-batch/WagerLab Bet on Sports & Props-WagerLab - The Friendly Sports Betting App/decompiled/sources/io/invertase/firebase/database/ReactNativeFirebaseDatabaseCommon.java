package io.invertase.firebase.database;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.MutableData;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.common.SharedUtils;
import java.util.HashMap;
import java.util.Iterator;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseDatabaseCommon {
    private static final String TAG = "DatabaseCommon";
    private static final String childKeysKey = "childKeys";
    private static final String childPrioritiesKey = "childPriorities";

    public static void rejectPromiseDatabaseException(Promise promise, @Nullable Exception exc) {
        UniversalDatabaseException universalDatabaseException = (UniversalDatabaseException) exc;
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, universalDatabaseException.getCode(), universalDatabaseException.getMessage());
    }

    public static WritableMap snapshotWithPreviousChildToMap(DataSnapshot dataSnapshot, @Nullable String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("snapshot", snapshotToMap(dataSnapshot));
        createMap.putString("previousChildName", str);
        return createMap;
    }

    public static WritableMap snapshotToMap(DataSnapshot dataSnapshot) {
        WritableMap createMap = Arguments.createMap();
        HashMap<String, Object> childProperties = getChildProperties(dataSnapshot);
        createMap.putString("key", dataSnapshot.getKey());
        createMap.putBoolean("exists", dataSnapshot.exists());
        createMap.putBoolean("hasChildren", dataSnapshot.hasChildren());
        createMap.putDouble("childrenCount", dataSnapshot.getChildrenCount());
        createMap.putArray(childKeysKey, (ReadableArray) childProperties.get(childKeysKey));
        createMap.putMap(childPrioritiesKey, (WritableMap) childProperties.get(childPrioritiesKey));
        SharedUtils.mapPutValue("priority", dataSnapshot.getPriority(), createMap);
        if (!dataSnapshot.hasChildren()) {
            SharedUtils.mapPutValue("value", dataSnapshot.getValue(), createMap);
            return createMap;
        }
        Object castValue = castValue(dataSnapshot);
        if (castValue instanceof WritableNativeArray) {
            createMap.putArray("value", (WritableArray) castValue);
            return createMap;
        }
        createMap.putMap("value", (WritableMap) castValue);
        return createMap;
    }

    public static <Any> Any castValue(DataSnapshot dataSnapshot) {
        String name;
        if (dataSnapshot.hasChildren()) {
            if (isArray(dataSnapshot)) {
                return (Any) buildArray(dataSnapshot);
            }
            return (Any) buildMap(dataSnapshot);
        }
        if (dataSnapshot.getValue() == null) {
            return null;
        }
        name = dataSnapshot.getValue().getClass().getName();
        name.hashCode();
        switch (name) {
            case "java.lang.Boolean":
            case "java.lang.Long":
            case "java.lang.Double":
            case "java.lang.String":
                return (Any) dataSnapshot.getValue();
            default:
                Log.w(TAG, "Invalid type: " + name);
                return null;
        }
    }

    public static <Any> Any castValue(MutableData mutableData) {
        String name;
        if (mutableData.hasChildren()) {
            if (isArray(mutableData)) {
                return (Any) buildArray(mutableData);
            }
            return (Any) buildMap(mutableData);
        }
        if (mutableData.getValue() == null) {
            return null;
        }
        name = mutableData.getValue().getClass().getName();
        name.hashCode();
        switch (name) {
            case "java.lang.Boolean":
            case "java.lang.Long":
            case "java.lang.Double":
            case "java.lang.String":
                return (Any) mutableData.getValue();
            default:
                Log.w(TAG, "Invalid type: " + name);
                return null;
        }
    }

    private static boolean isArray(DataSnapshot dataSnapshot) {
        long childrenCount = (dataSnapshot.getChildrenCount() * 2) - 1;
        Iterator<DataSnapshot> it = dataSnapshot.getChildren().iterator();
        while (it.hasNext()) {
            try {
                long parseLong = Long.parseLong(it.next().getKey());
                long j = (parseLong > j && parseLong <= childrenCount) ? parseLong : -1L;
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return true;
    }

    private static boolean isArray(MutableData mutableData) {
        long childrenCount = (mutableData.getChildrenCount() * 2) - 1;
        Iterator<MutableData> it = mutableData.getChildren().iterator();
        while (it.hasNext()) {
            try {
                long parseLong = Long.parseLong(it.next().getKey());
                long j = (parseLong > j && parseLong <= childrenCount) ? j + 1 : -1L;
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return true;
    }

    private static <Any> WritableArray buildArray(DataSnapshot dataSnapshot) {
        Object castValue;
        WritableArray createArray = Arguments.createArray();
        long j = 0;
        for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
            long parseLong = Long.parseLong(dataSnapshot2.getKey());
            if (parseLong > j) {
                while (j < parseLong) {
                    createArray.pushNull();
                    j++;
                }
                j = parseLong;
            }
            castValue = castValue(dataSnapshot2);
            String name = castValue.getClass().getName();
            name.hashCode();
            switch (name) {
                case "com.facebook.react.bridge.WritableNativeMap":
                    createArray.pushMap((WritableMap) castValue);
                    break;
                case "com.facebook.react.bridge.WritableNativeArray":
                    createArray.pushArray((WritableArray) castValue);
                    break;
                case "java.lang.Boolean":
                    createArray.pushBoolean(((Boolean) castValue).booleanValue());
                    break;
                case "java.lang.Long":
                    createArray.pushDouble(((Long) castValue).longValue());
                    break;
                case "java.lang.Double":
                    createArray.pushDouble(((Double) castValue).doubleValue());
                    break;
                case "java.lang.String":
                    createArray.pushString((String) castValue);
                    break;
                default:
                    Log.w(TAG, "Invalid type: " + castValue.getClass().getName());
                    break;
            }
            j++;
        }
        return createArray;
    }

    private static <Any> WritableArray buildArray(MutableData mutableData) {
        Object castValue;
        WritableArray createArray = Arguments.createArray();
        long j = 0;
        for (MutableData mutableData2 : mutableData.getChildren()) {
            long parseLong = Long.parseLong(mutableData2.getKey());
            if (parseLong > j) {
                while (j < parseLong) {
                    createArray.pushNull();
                    j++;
                }
                j = parseLong;
            }
            castValue = castValue(mutableData2);
            String name = castValue.getClass().getName();
            name.hashCode();
            switch (name) {
                case "com.facebook.react.bridge.WritableNativeMap":
                    createArray.pushMap((WritableMap) castValue);
                    break;
                case "com.facebook.react.bridge.WritableNativeArray":
                    createArray.pushArray((WritableArray) castValue);
                    break;
                case "java.lang.Boolean":
                    createArray.pushBoolean(((Boolean) castValue).booleanValue());
                    break;
                case "java.lang.Long":
                    createArray.pushDouble(((Long) castValue).longValue());
                    break;
                case "java.lang.Double":
                    createArray.pushDouble(((Double) castValue).doubleValue());
                    break;
                case "java.lang.String":
                    createArray.pushString((String) castValue);
                    break;
                default:
                    Log.w(TAG, "Invalid type: " + castValue.getClass().getName());
                    break;
            }
            j++;
        }
        return createArray;
    }

    private static <Any> WritableMap buildMap(DataSnapshot dataSnapshot) {
        Object castValue;
        WritableMap createMap = Arguments.createMap();
        for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
            castValue = castValue(dataSnapshot2);
            String name = castValue.getClass().getName();
            name.hashCode();
            switch (name) {
                case "com.facebook.react.bridge.WritableNativeMap":
                    createMap.putMap(dataSnapshot2.getKey(), (WritableMap) castValue);
                    break;
                case "com.facebook.react.bridge.WritableNativeArray":
                    createMap.putArray(dataSnapshot2.getKey(), (WritableArray) castValue);
                    break;
                case "java.lang.Boolean":
                    createMap.putBoolean(dataSnapshot2.getKey(), ((Boolean) castValue).booleanValue());
                    break;
                case "java.lang.Long":
                    createMap.putDouble(dataSnapshot2.getKey(), ((Long) castValue).longValue());
                    break;
                case "java.lang.Double":
                    createMap.putDouble(dataSnapshot2.getKey(), ((Double) castValue).doubleValue());
                    break;
                case "java.lang.String":
                    createMap.putString(dataSnapshot2.getKey(), (String) castValue);
                    break;
                default:
                    Log.w(TAG, "Invalid type: " + castValue.getClass().getName());
                    break;
            }
        }
        return createMap;
    }

    private static <Any> WritableMap buildMap(MutableData mutableData) {
        Object castValue;
        WritableMap createMap = Arguments.createMap();
        for (MutableData mutableData2 : mutableData.getChildren()) {
            castValue = castValue(mutableData2);
            String name = castValue.getClass().getName();
            name.hashCode();
            switch (name) {
                case "com.facebook.react.bridge.WritableNativeMap":
                    createMap.putMap(mutableData2.getKey(), (WritableMap) castValue);
                    break;
                case "com.facebook.react.bridge.WritableNativeArray":
                    createMap.putArray(mutableData2.getKey(), (WritableArray) castValue);
                    break;
                case "java.lang.Boolean":
                    createMap.putBoolean(mutableData2.getKey(), ((Boolean) castValue).booleanValue());
                    break;
                case "java.lang.Long":
                    createMap.putDouble(mutableData2.getKey(), ((Long) castValue).longValue());
                    break;
                case "java.lang.Double":
                    createMap.putDouble(mutableData2.getKey(), ((Double) castValue).doubleValue());
                    break;
                case "java.lang.String":
                    createMap.putString(mutableData2.getKey(), (String) castValue);
                    break;
                default:
                    Log.w(TAG, "Invalid type: " + castValue.getClass().getName());
                    break;
            }
        }
        return createMap;
    }

    public static HashMap<String, Object> getChildProperties(DataSnapshot dataSnapshot) {
        WritableArray createArray = Arguments.createArray();
        WritableMap createMap = Arguments.createMap();
        HashMap<String, Object> hashMap = new HashMap<>();
        if (dataSnapshot.hasChildren()) {
            for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
                createArray.pushString(dataSnapshot2.getKey());
                Object priority = dataSnapshot2.getPriority();
                if (priority instanceof String) {
                    createMap.putString(dataSnapshot2.getKey(), (String) priority);
                } else if (priority instanceof Double) {
                    createMap.putDouble(dataSnapshot2.getKey(), ((Double) priority).doubleValue());
                } else if (priority == null) {
                    createMap.putNull(dataSnapshot2.getKey());
                }
            }
        }
        hashMap.put(childKeysKey, createArray);
        hashMap.put(childPrioritiesKey, createMap);
        return hashMap;
    }
}
