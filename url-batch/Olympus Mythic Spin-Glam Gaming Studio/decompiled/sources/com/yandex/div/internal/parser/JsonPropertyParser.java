package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class JsonPropertyParser {
    private JsonPropertyParser() {
    }

    @NonNull
    public static String readString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            return (String) optSafe;
        } catch (ClassCastException unused) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
        } catch (Exception e) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e);
        }
    }

    @Nullable
    public static String readOptionalString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        try {
            return (String) optSafe;
        } catch (ClassCastException unused) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e));
            return null;
        }
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1) {
        return (V) read(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            V v = (V) function1.invoke(optSafe);
            if (v == null) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            }
            try {
                if (valueValidator.isValid(v)) {
                    return v;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, v);
            } catch (ClassCastException unused) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, v);
            }
        } catch (ClassCastException unused2) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
        } catch (Exception e) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e);
        }
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            V v = (V) ((Deserializer) lazy.getValue()).deserialize(parsingContext, optJSONObject);
            if (v != null) {
                return v;
            }
            throw ParsingExceptionKt.invalidValue(jSONObject, str, (Object) null);
        } catch (Exception e) {
            throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e);
        }
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1) {
        return (V) readOptional(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @Nullable
    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        try {
            V v = (V) function1.invoke(optSafe);
            if (v == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            }
            try {
                if (valueValidator.isValid(v)) {
                    return v;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e));
            return null;
        }
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (V) ((Deserializer) lazy.getValue()).deserialize(parsingContext, optJSONObject);
        } catch (Exception e) {
            parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONObject, str, e));
            return null;
        }
    }

    @NonNull
    public static <R, V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1) {
        return readList(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValidList(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static List<String> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<String> listValidator) {
        return readList(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), listValidator, JsonParsers.alwaysValidString());
    }

    @NonNull
    public static <R, V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<V> listValidator) {
        return readList(parsingContext, jSONObject, str, function1, listValidator, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<V> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                }
                return emptyList;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return emptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object optSafe = optSafe(optJSONArray, i);
            if (optSafe != null) {
                try {
                    Object invoke = function1.invoke(optSafe);
                    if (invoke != null) {
                        try {
                            if (!valueValidator.isValid(invoke)) {
                                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                            } else {
                                arrayList.add(invoke);
                            }
                        } catch (ClassCastException unused2) {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                } catch (Exception e) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
        } catch (ClassCastException unused4) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
        }
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i));
            if (nullable != null) {
                try {
                    Object deserialize = ((Deserializer) lazy.getValue()).deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i, e));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull ListValidator<V> listValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<V> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                }
                return emptyList;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return emptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i));
            if (nullable != null) {
                try {
                    Object deserialize = ((Deserializer) lazy.getValue()).deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i, e));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
        } catch (ClassCastException unused2) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
        }
    }

    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1) {
        return readOptionalList(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValidList(), JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalList(parsingContext, jSONObject, str, function1, listValidator, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<V> emptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(emptyList)) {
                    return emptyList;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object optSafe = optSafe(optJSONArray, i);
            if (optSafe != null) {
                try {
                    Object invoke = function1.invoke(optSafe);
                    if (invoke != null) {
                        try {
                            if (!valueValidator.isValid(invoke)) {
                                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                            } else {
                                arrayList.add(invoke);
                            }
                        } catch (ClassCastException unused2) {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                } catch (Exception e) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    @Nullable
    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i));
            if (nullable != null) {
                try {
                    Object deserialize = ((Deserializer) lazy.getValue()).deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i, e));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull ListValidator<V> listValidator) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<V> emptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(emptyList)) {
                    return emptyList;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject nullable = nullable(optJSONArray.optJSONObject(i));
            if (nullable != null) {
                try {
                    Object deserialize = ((Deserializer) lazy.getValue()).deserialize(parsingContext, nullable);
                    if (deserialize != null) {
                        arrayList.add(deserialize);
                    }
                } catch (Exception e) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(optJSONArray, str, i, e));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    @Nullable
    private static JSONObject nullable(@Nullable JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == JSONObject.NULL) {
            return null;
        }
        return jSONObject;
    }

    @Nullable
    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t = (T) jSONObject.opt(str);
        if (t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    @Nullable
    private static <T> T optSafe(JSONArray jSONArray, int i) {
        T t = (T) jSONArray.opt(i);
        if (t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v) {
        write(parsingContext, jSONObject, str, v, JsonParsers.doNotConvert());
    }

    public static <R, V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v, @NonNull Function1 function1) {
        if (v != null) {
            try {
                jSONObject.put(str, function1.invoke(v));
            } catch (JSONException e) {
                parsingContext.getLogger().logError(e);
            }
        }
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v, @NonNull Lazy lazy) {
        if (v != null) {
            try {
                jSONObject.put(str, ((Serializer) lazy.getValue()).serialize(parsingContext, v));
            } catch (JSONException e) {
                parsingContext.getLogger().logError(e);
            }
        }
    }

    public static <V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list) {
        writeList(parsingContext, jSONObject, str, list, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list, @NonNull Function1 function1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < size; i++) {
            jSONArray.put(function1.invoke(list.get(i)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e) {
            parsingContext.getLogger().logError(e);
        }
    }

    public static <V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list, @NonNull Lazy lazy) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < size; i++) {
            jSONArray.put(((Serializer) lazy.getValue()).serialize(parsingContext, list.get(i)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e) {
            parsingContext.getLogger().logError(e);
        }
    }
}
