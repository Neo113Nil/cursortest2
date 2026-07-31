package com.yandex.div.evaluable.function;

import com.ironsource.X3;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DictFunctions.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a*\u0010\b\u001a\u0004\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000\u001a&\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0000\u001a0\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0002\u001a8\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\u0015"}, d2 = {"evaluate", "", X3.g.b, "", "args", "", "isMethod", "", "evaluateSafe", "fallback", "defaultFallback", "throwDictException", "", "message", "throwException", "throwMissingPropertyException", "propName", "throwWrongTypeException", "expected", "Lcom/yandex/div/evaluable/EvaluableType;", "actual", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DictFunctionsKt {
    public static /* synthetic */ Object evaluate$default(String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return evaluate(str, list, z);
    }

    @NotNull
    public static final Object evaluate(@NotNull String functionName, @NotNull List<? extends Object> args, boolean z) {
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        JSONObject jSONObject = (JSONObject) CollectionsKt.first((List) args);
        int size = args.size() - 1;
        for (int i = 1; i < size; i++) {
            Object obj = args.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNull(jSONObject);
                Object opt = jSONObject.opt(str);
                jSONObject = opt instanceof JSONObject ? (JSONObject) opt : null;
                m8023constructorimpl2 = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8026exceptionOrNullimpl(m8023constructorimpl2) != null) {
                throwMissingPropertyException(functionName, args, str, z);
                throw new KotlinNothingValueException();
            }
        }
        Object last = CollectionsKt.last((List) args);
        Intrinsics.checkNotNull(last, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) last;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            Intrinsics.checkNotNull(jSONObject);
            m8023constructorimpl = Result.m8023constructorimpl(jSONObject.get(str2));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) == null) {
            Intrinsics.checkNotNullExpressionValue(m8023constructorimpl, "runCatching { dict!!.get…propName, isMethod)\n    }");
            return m8023constructorimpl;
        }
        throwMissingPropertyException(functionName, args, str2, z);
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ Void throwMissingPropertyException$default(String str, List list, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return throwMissingPropertyException(str, list, str2, z);
    }

    private static final Void throwMissingPropertyException(String str, List<? extends Object> list, String str2, boolean z) {
        throwException(str, list, "Missing property \"" + str2 + "\" in the dict.", z);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwWrongTypeException$default(String str, List list, EvaluableType evaluableType, Object obj, boolean z, int i, Object obj2) {
        if ((i & 16) != 0) {
            z = false;
        }
        return throwWrongTypeException(str, list, evaluableType, obj, z);
    }

    @NotNull
    public static final Void throwWrongTypeException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull EvaluableType expected, @NotNull Object actual, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(actual, "actual");
        if (Intrinsics.areEqual(actual, JSONObject.NULL)) {
            str = "Null";
        } else if (actual instanceof Number) {
            str = "Number";
        } else if (actual instanceof JSONObject) {
            str = "Dict";
        } else {
            str = actual instanceof JSONArray ? "Array" : actual.getClass().getSimpleName();
        }
        throwException(functionName, args, "Incorrect value type: expected " + expected.getTypeName() + ", got " + str + '.', z);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwException$default(String str, List list, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return throwException(str, list, str2, z);
    }

    @NotNull
    public static final Void throwException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message, boolean z) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = z ? "" : "<dict>, ";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(CollectionsKt.joinToString$default(args.subList(1, args.size()), null, functionName + '(' + str, ")", 0, null, new Function1() { // from class: com.yandex.div.evaluable.function.DictFunctionsKt$throwException$signature$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EvaluableExceptionKt.toMessageFormat(it);
            }
        }, 25, null), message, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Object evaluateSafe$default(List list, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        return evaluateSafe(list, obj, z);
    }

    @Nullable
    public static final Object evaluateSafe(@NotNull List<? extends Object> args, @NotNull Object fallback, boolean z) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        int i = !z ? 1 : 0;
        Object obj = args.get(i);
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject == null) {
            return fallback;
        }
        int size = args.size() - 1;
        for (int i2 = i + 1; i2 < size; i2++) {
            Object obj2 = args.get(i2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            jSONObject = jSONObject.optJSONObject((String) obj2);
            if (jSONObject == null) {
                return fallback;
            }
        }
        Object last = CollectionsKt.last((List) args);
        Intrinsics.checkNotNull(last, "null cannot be cast to non-null type kotlin.String");
        return jSONObject.opt((String) last);
    }

    @NotNull
    public static final Void throwDictException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        ArrayFunctionsKt.throwException$default("dict", functionName, args, message, false, 16, null);
        throw new KotlinNothingValueException();
    }
}
