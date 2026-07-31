package com.yandex.div.internal.parser;

import com.ironsource.B5;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonParserInternals.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a_\u0010\n\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0010\u0010\u0015\u001ai\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0000*\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\t\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001ak\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\b\b\u0000\u0010\u0000*\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\t\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0018H\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u001a#\u0010\u001e\u001a\u00020\u0012\"\b\b\u0000\u0010\u0000*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a*\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0081\b¢\u0006\u0004\b#\u0010$*:\u0010%\u001a\u0004\b\u0000\u0010\u0000\u001a\u0004\b\u0001\u0010\u0002\"\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003*6\b\u0000\u0010&\u001a\u0004\b\u0000\u0010\u0000\"\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u00032\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006'"}, d2 = {"T", "Lcom/yandex/div/json/JSONSerializable;", "R", "Lkotlin/Function2;", "Lcom/yandex/div/json/ParsingEnvironment;", "Lcom/yandex/div/internal/parser/Creator;", B5.o, "arg", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "tryCreate", "(Lkotlin/jvm/functions/Function2;Lcom/yandex/div/json/ParsingEnvironment;Ljava/lang/Object;Lcom/yandex/div/json/ParsingErrorLogger;)Lcom/yandex/div/json/JSONSerializable;", "Lorg/json/JSONObject;", "", "key", "", "optSafe", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "", "index", "(Lorg/json/JSONArray;I)Ljava/lang/Object;", "Lcom/yandex/div/internal/parser/ListValidator;", "validator", "Lcom/yandex/div/internal/parser/ItemReader;", "itemReader", "", "getList", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "optList", "toJsonArray", "(Ljava/util/List;)Lorg/json/JSONArray;", "Lkotlin/Function0;", "", "block", "onNull", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Creator", "ItemReader", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonParserInternalsKt {
    @Nullable
    public static final <T, R extends JSONSerializable> R tryCreate(@NotNull Function2 function2, @NotNull ParsingEnvironment parsingEnvironment, T t, @NotNull ParsingErrorLogger parsingErrorLogger) {
        try {
            return (R) function2.invoke(parsingEnvironment, t);
        } catch (ParsingException e) {
            parsingErrorLogger.logError(e);
            return null;
        }
    }

    @Nullable
    public static final Object optSafe(@NotNull JSONObject jSONObject, @NotNull String str) {
        Object opt = jSONObject.opt(str);
        if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
            return null;
        }
        return opt;
    }

    @Nullable
    public static final Object optSafe(@NotNull JSONArray jSONArray, int i) {
        Object opt = jSONArray.opt(i);
        if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
            return null;
        }
        return opt;
    }

    @NotNull
    public static final <T> List<T> getList(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ListValidator<T> listValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull Function2 function2) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object invoke = function2.invoke(optJSONArray, Integer.valueOf(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        if (listValidator.isValid(arrayList)) {
            return arrayList;
        }
        throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
    }

    @Nullable
    public static final <T> List<T> optList(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ListValidator<T> listValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull Function2 function2) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object invoke = function2.invoke(optJSONArray, Integer.valueOf(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        if (listValidator.isValid(arrayList)) {
            return arrayList;
        }
        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
        return null;
    }

    @NotNull
    public static final <T extends JSONSerializable> JSONArray toJsonArray(@NotNull List<? extends T> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((JSONSerializable) it.next()).writeToJSON());
        }
        return jSONArray;
    }

    @Nullable
    public static final <T> T onNull(T t, @NotNull Function0 function0) {
        if (t == null) {
            function0.mo4828invoke();
        }
        return t;
    }
}
