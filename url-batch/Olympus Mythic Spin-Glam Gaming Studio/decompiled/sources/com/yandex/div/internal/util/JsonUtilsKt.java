package com.yandex.div.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\u001a/\u0010\u0005\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\tH\u0086\b\u001a/\u0010\u0005\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u000b2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\tH\u0086\b\u001a1\u0010\r\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00042\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0007\u0012\u0004\u0012\u00020\u00060\tH\u0086\b\u001a1\u0010\r\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u000b2\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0007\u0012\u0004\u0012\u00020\u00060\tH\u0086\b\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\f\u001a\u0014\u0010\u0010\u001a\u0004\u0018\u00010\f*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\f\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0004\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u000b\u001a-\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00020\u0016H\u0086\b\u001a5\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00042\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\tH\u0086\b\u001a/\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00042\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0016H\u0086\b\u001a\u0014\u0010\u0019\u001a\u00020\f*\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\n\u001a\u0014\u0010\u0019\u001a\u00020\f*\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\n¨\u0006\u001b"}, d2 = {"asList", "", "R", "", "Lorg/json/JSONArray;", "forEach", "", "T", "action", "Lkotlin/Function2;", "", "Lorg/json/JSONObject;", "", "forEachNullable", "getStringOrEmpty", "name", "getStringOrNull", "key", "isEmpty", "", "map", "mapping", "Lkotlin/Function1;", "mapIndexedNotNull", "mapNotNull", "summary", "indentSpaces", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonUtilsKt {
    public static final /* synthetic */ <T> void forEach(JSONObject jSONObject, Function2 function2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            Intrinsics.reifiedOperationMarker(3, "T");
            if (obj != null) {
                function2.invoke(next, obj);
            }
        }
    }

    public static final /* synthetic */ <T> void forEach(JSONArray jSONArray, Function2 function2) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            Intrinsics.reifiedOperationMarker(3, "T");
            if (obj != null) {
                function2.invoke(Integer.valueOf(i), obj);
            }
        }
    }

    public static final /* synthetic */ <T> void forEachNullable(JSONObject jSONObject, Function2 function2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Intrinsics.reifiedOperationMarker(3, "T?");
            if (opt != null) {
                function2.invoke(next, opt);
            }
        }
    }

    public static final /* synthetic */ <T> void forEachNullable(JSONArray jSONArray, Function2 function2) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            Intrinsics.reifiedOperationMarker(3, "T?");
            if (opt != null) {
                function2.invoke(Integer.valueOf(i), opt);
            }
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull JSONArray jSONArray, @NotNull Function1 function1) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(function1.invoke(jSONArray.get(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> asList(@NotNull JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexedNotNull(@NotNull JSONArray jSONArray, @NotNull Function2 function2) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object invoke = function2.invoke(Integer.valueOf(i), jSONArray.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapNotNull(@NotNull JSONArray jSONArray, @NotNull Function1 function1) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object invoke = function1.invoke(jSONArray.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final String getStringOrEmpty(@NotNull JSONObject jSONObject, @NotNull String str) {
        Object opt = jSONObject.opt(str);
        return opt instanceof String ? (String) opt : "";
    }

    @Nullable
    public static final String getStringOrNull(@NotNull JSONObject jSONObject, @NotNull String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }

    public static /* synthetic */ String summary$default(JSONObject jSONObject, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return summary(jSONObject, i);
    }

    @NotNull
    public static final String summary(@NotNull JSONObject jSONObject, int i) {
        return new JsonPrinter(i, 1).print(jSONObject);
    }

    public static /* synthetic */ String summary$default(JSONArray jSONArray, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return summary(jSONArray, i);
    }

    @NotNull
    public static final String summary(@NotNull JSONArray jSONArray, int i) {
        return new JsonPrinter(i, 1).print(jSONArray);
    }

    public static final boolean isEmpty(@NotNull JSONObject jSONObject) {
        return jSONObject.length() == 0;
    }

    public static final boolean isEmpty(@NotNull JSONArray jSONArray) {
        return jSONArray.length() == 0;
    }
}
