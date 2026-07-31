package net.pubnative.lite.sdk.utils.json;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class JsonModel {
    private static final String TAG = "JsonModel";
    protected HashMap<String, JsonModelMetadata> fields;

    static class JsonModelMetadata {
        final Class<?> collectionType;
        final Class entityType;
        boolean isArray;
        final boolean isDescendantFromModel;
        boolean isMap;
        final String key;
        final Class<?> keyType;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        JsonModelMetadata(String str, Class cls) {
            this(str, r4, cls, r4, false, false);
            Class cls2 = Void.TYPE;
        }

        JsonModelMetadata(String str, Class cls, Class cls2) {
            this(str, Void.TYPE, cls, cls2, true, false);
        }

        JsonModelMetadata(String str, Class cls, Class cls2, Class cls3) {
            this(str, cls, cls2, cls3, false, true);
        }

        JsonModelMetadata(String str, Class cls, Class cls2, Class cls3, boolean z, boolean z2) {
            this.key = str;
            this.keyType = cls;
            this.entityType = cls2;
            this.collectionType = cls3;
            this.isArray = z;
            this.isMap = z2;
            this.isDescendantFromModel = JsonModel.class.isAssignableFrom(cls2);
        }
    }

    protected JsonModel() {
        bind(this);
    }

    private Object castNumber(Object obj, Class cls) {
        if (!(obj instanceof Number)) {
            return obj;
        }
        Number number = (Number) obj;
        return cls == Integer.class ? Integer.valueOf(number.intValue()) : cls == Long.class ? Long.valueOf(number.longValue()) : cls == Float.class ? Float.valueOf(number.floatValue()) : cls == Double.class ? Double.valueOf(number.doubleValue()) : cls == Short.class ? Short.valueOf(number.shortValue()) : cls == Byte.class ? Byte.valueOf(number.byteValue()) : obj;
    }

    void bind(JsonModel jsonModel) {
        if (JsonModelFieldCache.checkIfModelCached(jsonModel.getClass())) {
            this.fields = JsonModelFieldCache.getFields(jsonModel.getClass());
            return;
        }
        try {
            this.fields = new HashMap<>();
            for (Field field : jsonModel.getClass().getDeclaredFields()) {
                if (((BindField) field.getAnnotation(BindField.class)) != null) {
                    Class<?> type = field.getType();
                    if (Iterable.class.isAssignableFrom(type)) {
                        this.fields.put(field.getName(), parseArray(field, type));
                    } else if (Map.class.isAssignableFrom(type)) {
                        this.fields.put(field.getName(), parseMap(field, type));
                    } else {
                        this.fields.put(field.getName(), parseLiteral(field, type));
                    }
                }
            }
            JsonModelFieldCache.setFields(jsonModel.getClass(), this.fields);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected <T extends JsonModel> T castObject(JSONObject jSONObject, Class<T> cls) {
        if (jSONObject == null) {
            return null;
        }
        return cls.getConstructor(JSONObject.class).newInstance(jSONObject);
    }

    public void fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.e(TAG, "Couldn't parse JSON object because of null input");
            return;
        }
        for (Field field : getClass().getDeclaredFields()) {
            String name = field.getName();
            if (this.fields.containsKey(name)) {
                field.setAccessible(true);
                JsonModelMetadata jsonModelMetadata = this.fields.get(name);
                if (jSONObject.has(jsonModelMetadata.key)) {
                    JSONObject jSONObject2 = null;
                    JSONArray jSONArray = null;
                    if (jsonModelMetadata.isArray) {
                        try {
                            jSONArray = jSONObject.getJSONArray(jsonModelMetadata.key);
                        } catch (Exception unused) {
                        }
                        if (jSONArray != null) {
                            field.set(this, fromJsonArray(jsonModelMetadata, jSONArray));
                        }
                    } else if (jsonModelMetadata.isMap) {
                        try {
                            jSONObject2 = jSONObject.getJSONObject(jsonModelMetadata.key);
                        } catch (Exception unused2) {
                        }
                        if (jSONObject2 != null) {
                            field.set(this, fromJsonMap(jsonModelMetadata, jSONObject2));
                        }
                    } else {
                        field.set(this, castNumber(fromJsonLiteral(jsonModelMetadata, jSONObject), field.getType()));
                    }
                }
            }
        }
    }

    protected List fromJsonArray(JsonModelMetadata jsonModelMetadata, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (jsonModelMetadata.isDescendantFromModel) {
            while (i < jSONArray.length()) {
                arrayList.add(castObject(jSONArray.getJSONObject(i), jsonModelMetadata.entityType));
                i++;
            }
        } else {
            while (i < jSONArray.length()) {
                arrayList.add(jSONArray.get(i));
                i++;
            }
        }
        return arrayList;
    }

    protected Object fromJsonLiteral(JsonModelMetadata jsonModelMetadata, JSONObject jSONObject) {
        return jsonModelMetadata.isDescendantFromModel ? castObject(jSONObject.getJSONObject(jsonModelMetadata.key), jsonModelMetadata.entityType) : jSONObject.get(jsonModelMetadata.key);
    }

    protected Map fromJsonMap(JsonModelMetadata jsonModelMetadata, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        if (jsonModelMetadata.isDescendantFromModel) {
            while (keys.hasNext()) {
                String next = keys.next();
                linkedHashMap.put(next, castObject(jSONObject.getJSONObject(next), jsonModelMetadata.entityType));
            }
        } else {
            while (keys.hasNext()) {
                String next2 = keys.next();
                linkedHashMap.put(next2, jSONObject.get(next2));
            }
        }
        return linkedHashMap;
    }

    protected JsonModelMetadata parseArray(Field field, Class cls) {
        return new JsonModelMetadata(field.getName(), (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0], cls);
    }

    protected JsonModelMetadata parseLiteral(Field field, Class cls) {
        return new JsonModelMetadata(field.getName(), cls);
    }

    protected JsonModelMetadata parseMap(Field field, Class cls) {
        ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
        return new JsonModelMetadata(field.getName(), (Class) parameterizedType.getActualTypeArguments()[0], (Class) parameterizedType.getActualTypeArguments()[1], cls);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        for (Field field : getClass().getDeclaredFields()) {
            String name = field.getName();
            if (this.fields.containsKey(name)) {
                field.setAccessible(true);
                JsonModelMetadata jsonModelMetadata = this.fields.get(name);
                Object obj = field.get(this);
                if (obj != null) {
                    if (jsonModelMetadata.isArray) {
                        jSONObject.put(jsonModelMetadata.key, toJsonArray(jsonModelMetadata, obj));
                    } else if (jsonModelMetadata.isMap) {
                        jSONObject.put(jsonModelMetadata.key, toJsonMap(jsonModelMetadata, obj));
                    } else {
                        jSONObject.put(jsonModelMetadata.key, toJsonLiteral(jsonModelMetadata, obj));
                        if (jsonModelMetadata.isDescendantFromModel) {
                            jSONObject.put(jsonModelMetadata.key, ((JsonModel) obj).toJson());
                        } else {
                            jSONObject.put(jsonModelMetadata.key, obj);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    protected JSONArray toJsonArray(JsonModelMetadata jsonModelMetadata, Object obj) {
        Iterable iterable = (Iterable) obj;
        JSONArray jSONArray = new JSONArray();
        if (jsonModelMetadata.isDescendantFromModel) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                jSONArray.put(((JsonModel) it.next()).toJson());
            }
        } else {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
        }
        return jSONArray;
    }

    protected Object toJsonLiteral(JsonModelMetadata jsonModelMetadata, Object obj) {
        return jsonModelMetadata.isDescendantFromModel ? ((JsonModel) obj).toJson() : obj;
    }

    protected JSONObject toJsonMap(JsonModelMetadata jsonModelMetadata, Object obj) {
        Map map = (Map) obj;
        JSONObject jSONObject = new JSONObject();
        if (jsonModelMetadata.isDescendantFromModel) {
            for (String str : map.keySet()) {
                jSONObject.put(str, ((JsonModel) map.get(str)).toJson());
            }
        } else {
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
        }
        return jSONObject;
    }
}
