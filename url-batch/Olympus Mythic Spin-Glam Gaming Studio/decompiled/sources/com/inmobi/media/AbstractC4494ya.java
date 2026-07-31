package com.inmobi.media;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4494ya {
    public static final /* synthetic */ int a = 0;

    public static JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            cls.getSimpleName();
            Class superclass = cls.getSuperclass();
            if (superclass == null || Intrinsics.areEqual(Object.class, superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                Intrinsics.checkNotNull(superclass2);
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator it = ArrayIteratorKt.iterator(cls.getDeclaredFields());
            while (it.hasNext()) {
                Field field = (Field) it.next();
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(I8.class)) {
                        Intrinsics.checkNotNull(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !Intrinsics.areEqual(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (!Intrinsics.areEqual(cls2, type) && !Intrinsics.areEqual(cls2, type) && !Intrinsics.areEqual(Integer.class, type)) {
                                Class cls3 = Boolean.TYPE;
                                if (!Intrinsics.areEqual(cls3, type) && !Intrinsics.areEqual(cls3, type) && !Intrinsics.areEqual(Boolean.class, type)) {
                                    Class cls4 = Double.TYPE;
                                    if (!Intrinsics.areEqual(cls4, type) && !Intrinsics.areEqual(cls4, type) && !Intrinsics.areEqual(Double.class, type)) {
                                        Class cls5 = Float.TYPE;
                                        if (!Intrinsics.areEqual(cls5, type) && !Intrinsics.areEqual(cls5, type) && !Intrinsics.areEqual(Float.class, type)) {
                                            Class cls6 = Long.TYPE;
                                            if (!Intrinsics.areEqual(cls6, type) && !Intrinsics.areEqual(cls6, type) && !Intrinsics.areEqual(Long.class, type)) {
                                                Class cls7 = Byte.TYPE;
                                                if (!Intrinsics.areEqual(cls7, type) && !Intrinsics.areEqual(cls7, type) && !Intrinsics.areEqual(Byte.class, type)) {
                                                    if (!Intrinsics.areEqual(String.class, type) && !Intrinsics.areEqual(JSONObject.class, type) && !Intrinsics.areEqual(JSONArray.class, type)) {
                                                        Class cls8 = Short.TYPE;
                                                        if (!Intrinsics.areEqual(cls8, type) && !Intrinsics.areEqual(cls8, type) && !Intrinsics.areEqual(Short.class, type)) {
                                                            if (Map.class.isAssignableFrom(type)) {
                                                                JSONObject jSONObject2 = new JSONObject();
                                                                Object obj2 = field.get(obj);
                                                                if (obj2 != null) {
                                                                    Map map = (Map) obj2;
                                                                    for (Object obj3 : map.keySet()) {
                                                                        Object obj4 = map.get(obj3);
                                                                        if (obj4 != null) {
                                                                            if (!a(obj4.getClass())) {
                                                                                obj4 = a(obj4, obj4.getClass());
                                                                            }
                                                                            jSONObject2.put(String.valueOf(obj3), obj4);
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONObject2);
                                                            } else if (List.class.isAssignableFrom(type)) {
                                                                JSONArray jSONArray = new JSONArray();
                                                                Object obj5 = field.get(obj);
                                                                if (obj5 != null) {
                                                                    for (Object obj6 : (List) obj5) {
                                                                        if (obj6 != null) {
                                                                            Object a2 = a(obj6.getClass()) ? obj6 : a(obj6, obj6.getClass());
                                                                            if (a2 == null) {
                                                                                obj6.getClass().toString();
                                                                            } else {
                                                                                jSONArray.put(a2);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONArray);
                                                            } else if (type.isArray()) {
                                                                JSONArray jSONArray2 = new JSONArray();
                                                                Object obj7 = field.get(obj);
                                                                if (obj7 != null) {
                                                                    int length = Array.getLength(obj7);
                                                                    for (int i = 0; i < length; i++) {
                                                                        Object obj8 = Array.get(obj7, i);
                                                                        if (obj8 != null) {
                                                                            Object a3 = a(obj8.getClass()) ? obj8 : a(obj8, obj8.getClass());
                                                                            if (a3 == null) {
                                                                                obj8.getClass().toString();
                                                                            } else {
                                                                                jSONArray2.put(a3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONArray2);
                                                            } else {
                                                                Object obj9 = field.get(obj);
                                                                if (obj9 != null) {
                                                                    jSONObject.put(name, a(obj9, obj9.getClass()));
                                                                } else {
                                                                    Unit unit = Unit.INSTANCE;
                                                                }
                                                            }
                                                        }
                                                        Object obj10 = field.get(obj);
                                                        Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Short");
                                                        jSONObject.put(name, (Short) obj10);
                                                    }
                                                    jSONObject.put(name, field.get(obj));
                                                }
                                                Object obj11 = field.get(obj);
                                                Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Byte");
                                                jSONObject.put(name, (Byte) obj11);
                                            }
                                            Object obj12 = field.get(obj);
                                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Long");
                                            jSONObject.put(name, ((Long) obj12).longValue());
                                        }
                                        Object obj13 = field.get(obj);
                                        Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Float");
                                        jSONObject.put(name, (Float) obj13);
                                    }
                                    Object obj14 = field.get(obj);
                                    Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Double");
                                    jSONObject.put(name, ((Double) obj14).doubleValue());
                                }
                                Object obj15 = field.get(obj);
                                Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                                jSONObject.put(name, ((Boolean) obj15).booleanValue());
                            }
                            Object obj16 = field.get(obj);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Int");
                            jSONObject.put(name, ((Integer) obj16).intValue());
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static void b(Field field, Object obj, JSONObject jSONObject) {
        double d = jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Double.TYPE) {
                field.getName();
                field.setDouble(obj, d);
            } else {
                field.getName();
                field.set(obj, Double.valueOf(d));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void c(Field field, Object obj, JSONObject jSONObject) {
        float f = (float) jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Float.TYPE) {
                field.getName();
                field.setFloat(obj, f);
            } else {
                field.getName();
                field.set(obj, Float.valueOf(f));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void d(Field field, Object obj, JSONObject jSONObject) {
        int i = jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Integer.TYPE) {
                field.getName();
                field.setInt(obj, i);
            } else {
                field.getName();
                field.set(obj, Integer.valueOf(i));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void e(Field field, Object obj, JSONObject jSONObject) {
        long j = jSONObject.getLong(field.getName());
        try {
            if (field.getType() == Long.TYPE) {
                field.getName();
                field.setLong(obj, j);
            } else {
                field.getName();
                field.set(obj, Long.valueOf(j));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void f(Field field, Object obj, JSONObject jSONObject) {
        short s = (short) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Short.TYPE) {
                field.getName();
                field.setShort(obj, s);
            } else {
                field.getName();
                field.set(obj, Short.valueOf(s));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static Object a(JSONObject jSONObject, Class cls, Object obj, Object obj2) {
        Constructor<?> constructor;
        Object obj3;
        Object obj4;
        List linkedList;
        cls.getSimpleName();
        cls.toString();
        Objects.toString(obj);
        if (obj2 == null) {
            try {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                Intrinsics.checkNotNull(declaredConstructors);
                if (declaredConstructors.length == 0) {
                    obj2 = cls.newInstance();
                } else {
                    int length = declaredConstructors.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = declaredConstructors[i];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            break;
                        }
                        i++;
                    }
                    if (constructor == null) {
                        constructor = declaredConstructors[0];
                    }
                    constructor.setAccessible(true);
                    int length2 = constructor.getParameterTypes().length;
                    if (length2 == 0) {
                        obj2 = constructor.newInstance(null);
                    } else {
                        Object[] objArr = new Object[length2];
                        Iterator it = ArrayIteratorKt.iterator(constructor.getParameterTypes());
                        int i2 = 0;
                        while (it.hasNext()) {
                            Class cls2 = (Class) it.next();
                            int i3 = i2 + 1;
                            Intrinsics.checkNotNull(cls2);
                            if (!Intrinsics.areEqual(Integer.TYPE, cls2) && !Intrinsics.areEqual(Long.TYPE, cls2)) {
                                if (Intrinsics.areEqual(Boolean.TYPE, cls2)) {
                                    obj3 = Boolean.FALSE;
                                } else {
                                    if (!Intrinsics.areEqual(Double.TYPE, cls2) && !Intrinsics.areEqual(Float.TYPE, cls2)) {
                                        obj3 = null;
                                    }
                                    obj3 = Double.valueOf(0.0d);
                                }
                                objArr[i2] = obj3;
                                i2 = i3;
                            }
                            obj3 = 0;
                            objArr[i2] = obj3;
                            i2 = i3;
                        }
                        obj2 = constructor.newInstance(Arrays.copyOf(objArr, length2));
                    }
                }
            } catch (Exception e) {
                e.getMessage();
                cls.toString();
                return null;
            }
        }
        if (cls.getSuperclass() != null) {
            Class superclass = cls.getSuperclass();
            superclass.getSimpleName();
            Intrinsics.checkNotNull(superclass);
            obj2 = a(jSONObject, superclass, obj, obj2);
        }
        Iterator it2 = ArrayIteratorKt.iterator(cls.getDeclaredFields());
        while (it2.hasNext()) {
            Field field = (Field) it2.next();
            field.setAccessible(true);
            String name = field.getName();
            if (!Intrinsics.areEqual(name, "shadow$_klass_") && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(I8.class)) {
                if (jSONObject.has(name) && !jSONObject.isNull(name)) {
                    Class<?> type = field.getType();
                    Class cls3 = Integer.TYPE;
                    if (!Intrinsics.areEqual(cls3, type) && !Intrinsics.areEqual(cls3, type) && !Intrinsics.areEqual(Integer.class, type)) {
                        Class cls4 = Boolean.TYPE;
                        if (!Intrinsics.areEqual(cls4, type) && !Intrinsics.areEqual(cls4, type) && !Intrinsics.areEqual(Boolean.class, type)) {
                            Class cls5 = Double.TYPE;
                            if (!Intrinsics.areEqual(cls5, type) && !Intrinsics.areEqual(cls5, type) && !Intrinsics.areEqual(Double.class, type)) {
                                Class cls6 = Float.TYPE;
                                if (!Intrinsics.areEqual(cls6, type) && !Intrinsics.areEqual(cls6, type) && !Intrinsics.areEqual(Float.class, type)) {
                                    Class cls7 = Long.TYPE;
                                    if (!Intrinsics.areEqual(cls7, type) && !Intrinsics.areEqual(cls7, type) && !Intrinsics.areEqual(Long.class, type)) {
                                        Class cls8 = Byte.TYPE;
                                        if (!Intrinsics.areEqual(cls8, type) && !Intrinsics.areEqual(cls8, type) && !Intrinsics.areEqual(Byte.class, type)) {
                                            if (Intrinsics.areEqual(String.class, type)) {
                                                field.set(obj2, jSONObject.getString(name));
                                            } else {
                                                Class cls9 = Short.TYPE;
                                                if (!Intrinsics.areEqual(cls9, type) && !Intrinsics.areEqual(cls9, type) && !Intrinsics.areEqual(Short.class, type)) {
                                                    if (Intrinsics.areEqual(JSONObject.class, type)) {
                                                        Intrinsics.checkNotNull(field);
                                                        JSONObject jSONObject2 = jSONObject.getJSONObject(field.getName());
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        Intrinsics.checkNotNullParameter(field, "<this>");
                                                        if (jSONObject2 == null) {
                                                            jSONObject2 = jSONObject3;
                                                        }
                                                        field.set(obj2, jSONObject2);
                                                    } else if (Intrinsics.areEqual(JSONArray.class, type)) {
                                                        field.set(obj2, jSONObject.getJSONArray(name));
                                                    } else if (Map.class.isAssignableFrom(type)) {
                                                        JSONObject jSONObject4 = jSONObject.getJSONObject(name);
                                                        Objects.toString(jSONObject4);
                                                        HashMap hashMap = new HashMap();
                                                        Iterator<String> keys = jSONObject4.keys();
                                                        while (keys.hasNext()) {
                                                            String next = keys.next();
                                                            Intrinsics.checkNotNull(jSONObject4);
                                                            Intrinsics.checkNotNull(next);
                                                            Type genericType = field.getGenericType();
                                                            Intrinsics.checkNotNull(genericType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                            Type type2 = ((ParameterizedType) genericType).getActualTypeArguments()[1];
                                                            Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type java.lang.Class<*>");
                                                            Class cls10 = (Class) type2;
                                                            if (Intrinsics.areEqual(Integer.TYPE, cls10)) {
                                                                obj4 = Integer.valueOf(jSONObject4.getInt(next));
                                                            } else if (Intrinsics.areEqual(Double.TYPE, cls10)) {
                                                                obj4 = Double.valueOf(jSONObject4.getDouble(next));
                                                            } else if (Intrinsics.areEqual(Float.TYPE, cls10)) {
                                                                obj4 = Float.valueOf((float) jSONObject4.getDouble(next));
                                                            } else if (Intrinsics.areEqual(Long.TYPE, cls10)) {
                                                                obj4 = Long.valueOf(jSONObject4.getLong(next));
                                                            } else if (Intrinsics.areEqual(Byte.TYPE, cls10)) {
                                                                obj4 = Byte.valueOf((byte) jSONObject4.getInt(next));
                                                            } else if (Intrinsics.areEqual(Short.TYPE, cls10)) {
                                                                obj4 = Short.valueOf((short) jSONObject4.getInt(next));
                                                            } else {
                                                                obj4 = jSONObject4.get(next);
                                                            }
                                                            Intrinsics.checkNotNull(obj4);
                                                            if (obj4 == null || !a(obj4.getClass())) {
                                                                JSONObject jSONObject5 = jSONObject4.getJSONObject(next);
                                                                Intrinsics.checkNotNullExpressionValue(jSONObject5, "getJSONObject(...)");
                                                                Type genericType2 = field.getGenericType();
                                                                Intrinsics.checkNotNull(genericType2, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                Type type3 = ((ParameterizedType) genericType2).getActualTypeArguments()[1];
                                                                Intrinsics.checkNotNull(type3, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                obj4 = a(jSONObject5, (Class) type3, null, null);
                                                            }
                                                            if (obj4 != null) {
                                                                hashMap.put(next, obj4);
                                                            }
                                                        }
                                                        field.set(obj2, hashMap);
                                                    } else if (List.class.isAssignableFrom(type)) {
                                                        JSONArray jSONArray = jSONObject.getJSONArray(name);
                                                        Intrinsics.checkNotNull(field);
                                                        if (!Intrinsics.areEqual(field.getType(), LinkedList.class) && !Intrinsics.areEqual(field.getType(), LinkedList.class)) {
                                                            linkedList = new ArrayList();
                                                        } else {
                                                            linkedList = new LinkedList();
                                                        }
                                                        int length3 = jSONArray.length();
                                                        for (int i4 = 0; i4 < length3; i4++) {
                                                            Intrinsics.checkNotNull(jSONArray);
                                                            Type genericType3 = field.getGenericType();
                                                            Intrinsics.checkNotNull(genericType3, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                            Type type4 = ((ParameterizedType) genericType3).getActualTypeArguments()[0];
                                                            Intrinsics.checkNotNull(type4, "null cannot be cast to non-null type java.lang.Class<*>");
                                                            Object a2 = a(jSONArray, i4, (Class) type4);
                                                            if (a2 == null || !a(a2.getClass())) {
                                                                JSONObject jSONObject6 = jSONArray.getJSONObject(i4);
                                                                Intrinsics.checkNotNullExpressionValue(jSONObject6, "getJSONObject(...)");
                                                                Type genericType4 = field.getGenericType();
                                                                Intrinsics.checkNotNull(genericType4, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                Type type5 = ((ParameterizedType) genericType4).getActualTypeArguments()[0];
                                                                Intrinsics.checkNotNull(type5, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                a2 = a(jSONObject6, (Class) type5, null, null);
                                                            }
                                                            if (a2 != null) {
                                                                linkedList.add(a2);
                                                            }
                                                        }
                                                        field.set(obj2, linkedList);
                                                    } else if (type.isArray()) {
                                                        JSONArray jSONArray2 = jSONObject.getJSONArray(name);
                                                        Class<?> componentType = type.getComponentType();
                                                        int length4 = jSONArray2.length();
                                                        Object newInstance = Array.newInstance(componentType, length4);
                                                        for (int i5 = 0; i5 < length4; i5++) {
                                                            Intrinsics.checkNotNull(jSONArray2);
                                                            Intrinsics.checkNotNull(componentType);
                                                            Object a3 = a(jSONArray2, i5, componentType);
                                                            if (a3 == null || !a(a3.getClass())) {
                                                                JSONObject jSONObject7 = jSONArray2.getJSONObject(i5);
                                                                Intrinsics.checkNotNullExpressionValue(jSONObject7, "getJSONObject(...)");
                                                                a3 = a(jSONObject7, componentType, null, null);
                                                            }
                                                            if (a3 != null) {
                                                                Array.set(newInstance, i5, a3);
                                                            }
                                                        }
                                                        field.set(obj2, newInstance);
                                                    } else {
                                                        JSONObject jSONObject8 = jSONObject.getJSONObject(name);
                                                        Objects.toString(obj2);
                                                        Intrinsics.checkNotNull(jSONObject8);
                                                        Intrinsics.checkNotNull(type);
                                                        field.set(obj2, a(jSONObject8, type, obj2, null));
                                                    }
                                                } else {
                                                    Intrinsics.checkNotNull(field);
                                                    f(field, obj2, jSONObject);
                                                }
                                            }
                                        } else {
                                            Intrinsics.checkNotNull(field);
                                            a(field, obj2, jSONObject);
                                        }
                                    } else {
                                        Intrinsics.checkNotNull(field);
                                        e(field, obj2, jSONObject);
                                    }
                                } else {
                                    Intrinsics.checkNotNull(field);
                                    c(field, obj2, jSONObject);
                                }
                            } else {
                                Intrinsics.checkNotNull(field);
                                b(field, obj2, jSONObject);
                            }
                        } else {
                            Intrinsics.checkNotNull(field);
                            a(field, obj2, a(jSONObject, field));
                        }
                    } else {
                        Intrinsics.checkNotNull(field);
                        d(field, obj2, jSONObject);
                    }
                } else if (field.isAnnotationPresent(Cif.class)) {
                    throw new JSONException("NonNullable field " + name + " is not present or null in the JSONObject");
                }
            }
        }
        return obj2;
    }

    public static Boolean a(JSONObject jSONObject, Field field) {
        boolean z;
        String name = field.getName();
        try {
            z = jSONObject.getBoolean(name);
        } catch (JSONException unused) {
            z = jSONObject.getInt(name) != 0 && jSONObject.getInt(name) == 1;
        }
        return Boolean.valueOf(z);
    }

    public static void a(Field field, Object obj, Boolean bool) {
        try {
            if (field.getType() == Boolean.TYPE) {
                field.setBoolean(obj, bool.booleanValue());
            } else {
                field.set(obj, bool);
            }
        } catch (Exception unused) {
            field.getName();
        }
    }

    public static void a(Field field, Object obj, JSONObject jSONObject) {
        byte b = (byte) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Byte.TYPE) {
                field.getName();
                field.setByte(obj, b);
            } else {
                field.getName();
                field.set(obj, Byte.valueOf(b));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static boolean a(Class cls) {
        Class cls2 = Integer.TYPE;
        if (Intrinsics.areEqual(cls2, cls) || Intrinsics.areEqual(cls2, cls) || Intrinsics.areEqual(Integer.class, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (Intrinsics.areEqual(cls3, cls) || Intrinsics.areEqual(cls3, cls) || Intrinsics.areEqual(Boolean.class, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (Intrinsics.areEqual(cls4, cls) || Intrinsics.areEqual(cls4, cls) || Intrinsics.areEqual(Double.class, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (Intrinsics.areEqual(cls5, cls) || Intrinsics.areEqual(cls5, cls) || Intrinsics.areEqual(Float.class, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (Intrinsics.areEqual(cls6, cls) || Intrinsics.areEqual(cls6, cls) || Intrinsics.areEqual(Long.class, cls) || Intrinsics.areEqual(String.class, cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (Intrinsics.areEqual(cls7, cls) || Intrinsics.areEqual(cls7, cls) || Intrinsics.areEqual(Byte.class, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return Intrinsics.areEqual(cls8, cls) || Intrinsics.areEqual(cls8, cls) || Intrinsics.areEqual(Short.class, cls);
    }

    public static Object a(JSONArray jSONArray, int i, Class cls) {
        Object obj;
        if (Intrinsics.areEqual(Integer.TYPE, cls)) {
            obj = Integer.valueOf(jSONArray.getInt(i));
        } else if (Intrinsics.areEqual(Double.TYPE, cls)) {
            obj = Double.valueOf(jSONArray.getDouble(i));
        } else if (Intrinsics.areEqual(Float.TYPE, cls)) {
            obj = Float.valueOf((float) jSONArray.getDouble(i));
        } else if (Intrinsics.areEqual(Long.TYPE, cls)) {
            obj = Long.valueOf(jSONArray.getLong(i));
        } else if (Intrinsics.areEqual(Byte.TYPE, cls)) {
            obj = Byte.valueOf((byte) jSONArray.getInt(i));
        } else if (Intrinsics.areEqual(Short.TYPE, cls)) {
            obj = Short.valueOf((short) jSONArray.getInt(i));
        } else {
            obj = jSONArray.get(i);
        }
        Intrinsics.checkNotNull(obj);
        return obj;
    }
}
