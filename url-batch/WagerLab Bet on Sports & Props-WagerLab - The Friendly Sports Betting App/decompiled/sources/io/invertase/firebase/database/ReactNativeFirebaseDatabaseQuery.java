package io.invertase.firebase.database;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import io.intercom.android.sdk.models.AttributeType;
import io.invertase.firebase.common.RCTConvertFirebase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseDatabaseQuery {
    public Query query;
    private HashMap<String, ChildEventListener> childEventListeners = new HashMap<>();
    private HashMap<String, ValueEventListener> valueEventListeners = new HashMap<>();

    ReactNativeFirebaseDatabaseQuery(DatabaseReference databaseReference, ReadableArray readableArray) {
        this.query = databaseReference;
        Iterator<Object> it = RCTConvertFirebase.toArrayList(readableArray).iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String str = (String) map.get("type");
            String str2 = (String) map.get("name");
            if ("orderBy".equals(str)) {
                applyOrderByModifier(str2, map);
            } else if ("limit".equals(str)) {
                applyLimitModifier(str2, map);
            } else if (ViewProps.FILTER.equals(str)) {
                applyFilterModifier(str2, map);
            }
        }
    }

    public void addSingleValueEventListener(ValueEventListener valueEventListener) {
        this.query.addListenerForSingleValueEvent(valueEventListener);
    }

    public void addSingleChildEventListener(ChildEventListener childEventListener) {
        this.query.addChildEventListener(childEventListener);
    }

    public void addEventListener(String str, ValueEventListener valueEventListener) {
        this.valueEventListeners.put(str, valueEventListener);
        this.query.addValueEventListener(valueEventListener);
    }

    public void addEventListener(String str, ChildEventListener childEventListener) {
        this.childEventListeners.put(str, childEventListener);
        this.query.addChildEventListener(childEventListener);
    }

    public void removeEventListener(ValueEventListener valueEventListener) {
        this.query.removeEventListener(valueEventListener);
    }

    public void removeEventListener(ChildEventListener childEventListener) {
        this.query.removeEventListener(childEventListener);
    }

    public void removeEventListener(String str) {
        if (this.valueEventListeners.containsKey(str)) {
            this.query.removeEventListener(this.valueEventListeners.get(str));
            this.valueEventListeners.remove(str);
        }
        if (this.childEventListeners.containsKey(str)) {
            this.query.removeEventListener(this.childEventListeners.get(str));
            this.childEventListeners.remove(str);
        }
    }

    public void removeAllEventListeners() {
        if (hasListeners().booleanValue()) {
            Iterator<Map.Entry<String, ValueEventListener>> it = this.valueEventListeners.entrySet().iterator();
            while (it.hasNext()) {
                this.query.removeEventListener(it.next().getValue());
                it.remove();
            }
            Iterator<Map.Entry<String, ChildEventListener>> it2 = this.childEventListeners.entrySet().iterator();
            while (it2.hasNext()) {
                this.query.removeEventListener(it2.next().getValue());
                it2.remove();
            }
        }
    }

    public Boolean hasEventListener(String str) {
        return Boolean.valueOf(this.valueEventListeners.containsKey(str) || this.childEventListeners.containsKey(str));
    }

    public Boolean hasListeners() {
        return Boolean.valueOf(this.valueEventListeners.size() > 0 || this.childEventListeners.size() > 0);
    }

    private void applyOrderByModifier(String str, Map map) {
        str.hashCode();
        switch (str) {
            case "orderByPriority":
                this.query = this.query.orderByPriority();
                break;
            case "orderByKey":
                this.query = this.query.orderByKey();
                break;
            case "orderByChild":
                this.query = this.query.orderByChild((String) map.get("key"));
                break;
            case "orderByValue":
                this.query = this.query.orderByValue();
                break;
        }
    }

    private Query applyLimitModifier(String str, Map map) {
        int intValue = ((Double) map.get("value")).intValue();
        if ("limitToLast".equals(str)) {
            this.query = this.query.limitToLast(intValue);
        } else if ("limitToFirst".equals(str)) {
            this.query = this.query.limitToFirst(intValue);
        }
        return this.query;
    }

    private void applyFilterModifier(String str, Map map) {
        String str2 = (String) map.get("valueType");
        String str3 = (String) map.get("key");
        if ("endAt".equals(str)) {
            applyEndAtFilter(str3, str2, map);
        } else if ("startAt".equals(str)) {
            applyStartAtFilter(str3, str2, map);
        }
    }

    private void applyEndAtFilter(String str, String str2, Map map) {
        if (AttributeType.NUMBER.equals(str2)) {
            double doubleValue = ((Double) map.get("value")).doubleValue();
            if (str == null) {
                this.query = this.query.endAt(doubleValue);
                return;
            } else {
                this.query = this.query.endAt(doubleValue, str);
                return;
            }
        }
        if ("boolean".equals(str2)) {
            boolean booleanValue = ((Boolean) map.get("value")).booleanValue();
            if (str == null) {
                this.query = this.query.endAt(booleanValue);
                return;
            } else {
                this.query = this.query.endAt(booleanValue, str);
                return;
            }
        }
        if (TypedValues.Custom.S_STRING.equals(str2)) {
            String str3 = (String) map.get("value");
            if (str == null) {
                this.query = this.query.endAt(str3);
                return;
            } else {
                this.query = this.query.endAt(str3, str);
                return;
            }
        }
        if ("null".equals(str2)) {
            if (str == null) {
                this.query = this.query.endAt((String) null);
            } else {
                this.query = this.query.endAt((String) null, str);
            }
        }
    }

    private void applyStartAtFilter(String str, String str2, Map map) {
        if (AttributeType.NUMBER.equals(str2)) {
            double doubleValue = ((Double) map.get("value")).doubleValue();
            if (str == null) {
                this.query = this.query.startAt(doubleValue);
                return;
            } else {
                this.query = this.query.startAt(doubleValue, str);
                return;
            }
        }
        if ("boolean".equals(str2)) {
            boolean booleanValue = ((Boolean) map.get("value")).booleanValue();
            if (str == null) {
                this.query = this.query.startAt(booleanValue);
                return;
            } else {
                this.query = this.query.startAt(booleanValue, str);
                return;
            }
        }
        if (TypedValues.Custom.S_STRING.equals(str2)) {
            String str3 = (String) map.get("value");
            if (str == null) {
                this.query = this.query.startAt(str3);
                return;
            } else {
                this.query = this.query.startAt(str3, str);
                return;
            }
        }
        if ("null".equals(str2)) {
            if (str == null) {
                this.query = this.query.startAt((String) null);
            } else {
                this.query = this.query.startAt((String) null, str);
            }
        }
    }
}
