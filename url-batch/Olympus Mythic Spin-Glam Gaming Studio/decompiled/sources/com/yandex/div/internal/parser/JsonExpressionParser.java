package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.MutableExpressionList;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class JsonExpressionParser {
    private static final ExpressionList<?> EMPTY_EXPRESSION_LIST = new ConstantExpressionList(Collections.emptyList());

    private JsonExpressionParser() {
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        if (Expression.mayBeExpression(optSafe)) {
            return new Expression.MutableExpression(str, optSafe.toString(), function1, valueValidator, parsingContext.getLogger(), typeHelper, null);
        }
        try {
            Object invoke = function1.invoke(optSafe);
            if (invoke == null) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            }
            if (!typeHelper.isTypeValid(invoke)) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
            }
            try {
                if (!valueValidator.isValid(invoke)) {
                    throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
                }
                return Expression.constant(invoke, parsingContext.getLogger());
            } catch (ClassCastException unused) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
            }
        } catch (ClassCastException unused2) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
        } catch (Exception e) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e);
        }
    }

    @Nullable
    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), null);
    }

    @Nullable
    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @Nullable Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), expression);
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid(), null);
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1, @Nullable Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid(), expression);
    }

    @Nullable
    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator, null);
    }

    @Nullable
    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator, @Nullable Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator, expression);
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1, @NonNull ValueValidator<V> valueValidator, @Nullable Expression<V> expression) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        if (Expression.mayBeExpression(optSafe)) {
            return new Expression.MutableExpression(str, optSafe.toString(), function1, valueValidator, parsingContext.getLogger(), typeHelper, expression);
        }
        try {
            Object invoke = function1.invoke(optSafe);
            if (invoke == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            }
            if (!typeHelper.isTypeValid(invoke)) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
            try {
                if (!valueValidator.isValid(invoke)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                    return null;
                }
                return Expression.constant(invoke, parsingContext.getLogger());
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

    @NonNull
    public static ExpressionList<String> readExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<String> listValidator) {
        return readExpressionList(parsingContext, jSONObject, str, TypeHelpersKt.TYPE_HELPER_STRING, JsonParsers.doNotConvert(), listValidator, JsonParsers.alwaysValidString());
    }

    @NonNull
    public static <R, V> ExpressionList<V> readExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1) {
        return readExpressionList(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValidList(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static ExpressionList<String> readExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<String> typeHelper, @NonNull ListValidator<String> listValidator) {
        return readExpressionList(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), listValidator, JsonParsers.alwaysValidString());
    }

    @NonNull
    public static <R, V> ExpressionList<V> readExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1, @NonNull ListValidator<V> listValidator) {
        return readExpressionList(parsingContext, jSONObject, str, typeHelper, function1, listValidator, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> ExpressionList<V> readExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        return readExpressionList(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), listValidator, valueValidator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> ExpressionList<V> readExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        Object invoke;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<? extends V> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                    return emptyExpressionList();
                }
                return emptyExpressionList();
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return emptyExpressionList();
            }
        }
        ArrayList arrayList = new ArrayList(length);
        ParsingErrorLogger parsingErrorLogger = null;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            Object optSafe = optSafe(optJSONArray, i);
            if (optSafe != null) {
                if (Expression.mayBeExpression(optSafe)) {
                    if (parsingErrorLogger == null) {
                        parsingErrorLogger = parsingContext.getLogger();
                    }
                    arrayList.add(new Expression.MutableExpression(str + X3.j.d + i + X3.j.e, optSafe.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, null));
                    z = true;
                } else {
                    try {
                        invoke = function1.invoke(optSafe);
                    } catch (ClassCastException unused2) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                    } catch (Exception e) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
                    }
                    if (invoke != null) {
                        if (!typeHelper.isTypeValid(invoke)) {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                        } else {
                            try {
                                if (!valueValidator.isValid(invoke)) {
                                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                                } else {
                                    arrayList.add(invoke);
                                }
                            } catch (ClassCastException unused3) {
                                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = arrayList.get(i2);
                if (!(obj instanceof Expression)) {
                    arrayList.set(i2, Expression.constant(obj, parsingContext.getLogger()));
                }
            }
            return new MutableExpressionList(str, arrayList, listValidator, parsingContext.getLogger());
        }
        try {
            if (!listValidator.isValid(arrayList)) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
            }
            return new ConstantExpressionList(arrayList);
        } catch (ClassCastException unused4) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
        }
    }

    @Nullable
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1) {
        return readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValidList(), JsonParsers.alwaysValid());
    }

    @Nullable
    public static <V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), listValidator, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, function1, listValidator, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), listValidator, valueValidator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1 function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        Object invoke;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<? extends V> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                    return emptyExpressionList();
                }
                return emptyExpressionList();
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return emptyExpressionList();
            }
        }
        ArrayList arrayList = new ArrayList(length);
        ParsingErrorLogger parsingErrorLogger = null;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            Object optSafe = optSafe(optJSONArray, i);
            if (optSafe != null) {
                if (Expression.mayBeExpression(optSafe)) {
                    if (parsingErrorLogger == null) {
                        parsingErrorLogger = parsingContext.getLogger();
                    }
                    arrayList.add(new Expression.MutableExpression(str + X3.j.d + i + X3.j.e, optSafe.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, null));
                    z = true;
                } else {
                    try {
                        invoke = function1.invoke(optSafe);
                    } catch (ClassCastException unused2) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                    } catch (Exception e) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
                    }
                    if (invoke != null) {
                        if (!typeHelper.isTypeValid(invoke)) {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                        } else {
                            try {
                                if (!valueValidator.isValid(invoke)) {
                                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                                } else {
                                    arrayList.add(invoke);
                                }
                            } catch (ClassCastException unused3) {
                                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = arrayList.get(i2);
                if (!(obj instanceof Expression)) {
                    arrayList.set(i2, Expression.constant(obj, parsingContext.getLogger()));
                }
            }
            return new MutableExpressionList(str, arrayList, listValidator, parsingContext.getLogger());
        }
        try {
            if (!listValidator.isValid(arrayList)) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
                return null;
            }
            return new ConstantExpressionList(arrayList);
        } catch (ClassCastException unused4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
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

    @NonNull
    private static <V> ExpressionList<V> emptyExpressionList() {
        return (ExpressionList<V>) EMPTY_EXPRESSION_LIST;
    }

    public static <V> void writeExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Expression<V> expression) {
        writeExpression(parsingContext, jSONObject, str, expression, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Expression<V> expression, @NonNull Function1 function1) {
        if (expression == null) {
            return;
        }
        Object rawValue = expression.getRawValue();
        try {
            if (!(expression instanceof Expression.MutableExpression)) {
                jSONObject.put(str, function1.invoke(rawValue));
            } else {
                jSONObject.put(str, rawValue);
            }
        } catch (JSONException e) {
            parsingContext.getLogger().logError(e);
        }
    }

    public static <V> void writeExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable ExpressionList<V> expressionList) {
        writeExpressionList(parsingContext, jSONObject, str, expressionList, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable ExpressionList<V> expressionList, @NonNull Function1 function1) {
        if (expressionList == null) {
            return;
        }
        int i = 0;
        if (expressionList instanceof ConstantExpressionList) {
            List<V> evaluate = expressionList.evaluate(ExpressionResolver.EMPTY);
            int size = evaluate.size();
            JSONArray jSONArray = new JSONArray();
            while (i < size) {
                jSONArray.put(function1.invoke(evaluate.get(i)));
                i++;
            }
            try {
                jSONObject.put(str, jSONArray);
                return;
            } catch (JSONException e) {
                parsingContext.getLogger().logError(e);
                return;
            }
        }
        if (expressionList instanceof MutableExpressionList) {
            List expressionsInternal = ((MutableExpressionList) expressionList).getExpressionsInternal();
            if (expressionsInternal.isEmpty()) {
                return;
            }
            int size2 = expressionsInternal.size();
            JSONArray jSONArray2 = new JSONArray();
            while (i < size2) {
                Expression expression = (Expression) expressionsInternal.get(i);
                if (expression instanceof Expression.ConstantExpression) {
                    jSONArray2.put(function1.invoke(expression.evaluate(ExpressionResolver.EMPTY)));
                } else {
                    jSONArray2.put(expression.getRawValue());
                }
                i++;
            }
            try {
                jSONObject.put(str, jSONArray2);
            } catch (JSONException e2) {
                parsingContext.getLogger().logError(e2);
            }
        }
    }
}
