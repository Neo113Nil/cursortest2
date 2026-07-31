package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.MutableExpressionList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class JsonParser {

    @NonNull
    private static final ValueValidator<?> ALWAYS_VALID = new ValueValidator() { // from class: com.yandex.div.internal.parser.JsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean lambda$static$0;
            lambda$static$0 = JsonParser.lambda$static$0(obj);
            return lambda$static$0;
        }
    };

    @NonNull
    private static final ValueValidator<String> ALWAYS_VALID_STRING = new ValueValidator() { // from class: com.yandex.div.internal.parser.JsonParser$$ExternalSyntheticLambda1
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean lambda$static$1;
            lambda$static$1 = JsonParser.lambda$static$1((String) obj);
            return lambda$static$1;
        }
    };

    @NonNull
    private static final ListValidator<?> ALWAYS_VALID_LIST = new ListValidator() { // from class: com.yandex.div.internal.parser.JsonParser$$ExternalSyntheticLambda2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean lambda$static$2;
            lambda$static$2 = JsonParser.lambda$static$2(list);
            return lambda$static$2;
        }
    };

    @NonNull
    private static final Function1 AS_IS = new Function1() { // from class: com.yandex.div.internal.parser.JsonParser$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object lambda$static$3;
            lambda$static$3 = JsonParser.lambda$static$3(obj);
            return lambda$static$3;
        }
    };
    private static final ExpressionList<?> EMPTY_EXPRESSION_LIST = new ConstantExpressionList(Collections.emptyList());

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$2(List list) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$3(Object obj) {
        return obj;
    }

    @Nullable
    public static <T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, doNotConvert(), alwaysValid(), parsingErrorLogger, parsingEnvironment, expression, typeHelper);
    }

    @Nullable
    public static Expression<String> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<String> typeHelper) {
        return readOptionalExpression(jSONObject, str, doNotConvert(), ALWAYS_VALID_STRING, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <R, T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, function1, alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> Expression<T> readExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpression(jSONObject, str, doNotConvert(), alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> Expression<T> readExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpression(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <R, T> Expression<T> readExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpression(jSONObject, str, function1, alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <R, T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, function1, valueValidator, parsingErrorLogger, parsingEnvironment, null, typeHelper);
    }

    @Nullable
    public static <R, T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, function1, alwaysValid(), parsingErrorLogger, parsingEnvironment, expression, typeHelper);
    }

    @Nullable
    public static <T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment, expression, typeHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        if (Expression.mayBeExpression(optSafe)) {
            return new Expression.MutableExpression(str, optSafe.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, expression);
        }
        try {
            Object invoke = function1.invoke(optSafe);
            if (invoke == null) {
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            }
            if (!typeHelper.isTypeValid(invoke)) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
            try {
                if (!valueValidator.isValid(invoke)) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                    return null;
                }
                return Expression.constant(invoke, parsingErrorLogger);
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e) {
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, T> Expression<T> readExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        if (Expression.mayBeExpression(optSafe)) {
            return new Expression.MutableExpression(str, optSafe.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, null);
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
                return Expression.constant(invoke, parsingErrorLogger);
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
    public static <T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) readOptional(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) readOptional(jSONObject, str, doNotConvert(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <R, T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) readOptional(jSONObject, str, function1, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <T extends JSONSerializable> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (T) function2.invoke(parsingEnvironment, optJSONObject);
        } catch (ParsingException e) {
            parsingErrorLogger.logError(e);
            return null;
        }
    }

    @Nullable
    public static <R, T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        try {
            T t = (T) function1.invoke(optSafe);
            if (t == null) {
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            }
            try {
                if (valueValidator.isValid(t)) {
                    return t;
                }
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e) {
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e));
            return null;
        }
    }

    @Nullable
    public static <T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            T t = (T) function2.invoke(parsingEnvironment, optJSONObject);
            if (t == null) {
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optJSONObject));
                return null;
            }
            try {
                if (valueValidator.isValid(t)) {
                    return t;
                }
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optJSONObject));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optJSONObject));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optJSONObject));
            return null;
        } catch (Exception e) {
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optJSONObject, e));
            return null;
        }
    }

    @NonNull
    public static <T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) read(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) read(jSONObject, str, doNotConvert(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) read(jSONObject, str, function1, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) read(jSONObject, str, function2, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            T t = (T) function2.invoke(parsingEnvironment, optJSONObject);
            if (t == null) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, (Object) null);
            }
            try {
                if (valueValidator.isValid(t)) {
                    return t;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, t);
            } catch (ClassCastException unused) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, t);
            }
        } catch (ParsingException e) {
            throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e);
        }
    }

    @NonNull
    public static <R, T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            T t = (T) function1.invoke(optSafe);
            if (t == null) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            }
            try {
                if (valueValidator.isValid(t)) {
                    return t;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, t);
            } catch (ClassCastException unused) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, t);
            }
        } catch (ClassCastException unused2) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
        } catch (Exception e) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e);
        }
    }

    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalList(jSONObject, str, function2, alwaysValidList(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalList(jSONObject, str, function2, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalList(jSONObject, str, function1, alwaysValidList(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalList(jSONObject, str, function1, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<T> emptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(emptyList)) {
                    return emptyList;
                }
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object opt = optJSONArray.opt(i);
            if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
                opt = null;
            }
            if (opt != null) {
                try {
                    Object invoke = function1.invoke(opt);
                    if (invoke != null) {
                        try {
                            if (!valueValidator.isValid(invoke)) {
                                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                            } else {
                                arrayList.add(invoke);
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, opt));
                } catch (Exception e) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, opt, e));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<T> emptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(emptyList)) {
                    return emptyList;
                }
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object optSafe = optSafe(optJSONArray.optJSONObject(i));
            if (optSafe != null) {
                try {
                    Object invoke = function2.invoke(parsingEnvironment, optSafe);
                    if (invoke != null) {
                        try {
                            if (!valueValidator.isValid(invoke)) {
                                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                            } else {
                                arrayList.add(invoke);
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                } catch (Exception e) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    @NonNull
    public static <T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readList(jSONObject, str, function2, alwaysValidList(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readList(jSONObject, str, function2, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function2 function2, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<T> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                }
                return emptyList;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return emptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = (JSONObject) optSafe(optJSONArray.optJSONObject(i));
            if (jSONObject2 != null) {
                try {
                    Object invoke = function2.invoke(parsingEnvironment, jSONObject2);
                    if (invoke != null) {
                        try {
                            if (!valueValidator.isValid(invoke)) {
                                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                            } else {
                                arrayList.add(invoke);
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, jSONObject2));
                } catch (Exception e) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, jSONObject2, e));
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
    public static List<String> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<String> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readList(jSONObject, str, doNotConvert(), listValidator, ALWAYS_VALID_STRING, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readList(jSONObject, str, function1, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<T> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                }
                return emptyList;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return emptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object optSafe = optSafe(optJSONArray.opt(i));
            if (optSafe != null) {
                try {
                    Object invoke = function1.invoke(optSafe);
                    if (invoke != null) {
                        try {
                            if (!valueValidator.isValid(invoke)) {
                                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                            } else {
                                arrayList.add(invoke);
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                } catch (Exception e) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
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
    public static ExpressionList<String> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<String> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<String> typeHelper) {
        return readExpressionList(jSONObject, str, doNotConvert(), listValidator, ALWAYS_VALID_STRING, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static ExpressionList<String> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<String> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readExpressionList(jSONObject, str, doNotConvert(), listValidator, ALWAYS_VALID_STRING, parsingErrorLogger, parsingEnvironment, TypeHelpersKt.TYPE_HELPER_STRING);
    }

    @NonNull
    public static <R, T> ExpressionList<T> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpressionList(jSONObject, str, function1, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> ExpressionList<T> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpressionList(jSONObject, str, doNotConvert(), listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <T> ExpressionList<T> readOptionalExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpressionList(jSONObject, str, doNotConvert(), listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <R, T> ExpressionList<T> readOptionalExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpressionList(jSONObject, str, function1, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper, ErrorHandler.IGNORE);
    }

    @NonNull
    public static <R, T> ExpressionList<T> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<T> readExpressionList = readExpressionList(jSONObject, str, function1, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper, ErrorHandler.FAIL_FAST);
        if (readExpressionList != null) {
            return readExpressionList;
        }
        throw ParsingExceptionKt.invalidValue(str, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private static <R, T> ExpressionList readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper, @NonNull ErrorHandler errorHandler) {
        ErrorHandler errorHandler2;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            errorHandler.process(ParsingExceptionKt.missingValue(jSONObject, str));
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<? extends T> emptyList = Collections.emptyList();
            try {
                if (!listValidator.isValid(emptyList)) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, emptyList));
                    return EMPTY_EXPRESSION_LIST;
                }
                return EMPTY_EXPRESSION_LIST;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, emptyList));
                return EMPTY_EXPRESSION_LIST;
            }
        }
        ArrayList arrayList3 = new ArrayList(length);
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            Object optSafe = optSafe(optJSONArray.opt(i3));
            if (optSafe == null) {
                i = i3;
                arrayList2 = arrayList3;
                i2 = length;
            } else if (Expression.mayBeExpression(optSafe)) {
                i = i3;
                arrayList2 = arrayList3;
                i2 = length;
                arrayList2.add(new Expression.MutableExpression(str + X3.j.d + i3 + X3.j.e, optSafe.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, null));
                z = true;
            } else {
                i = i3;
                arrayList2 = arrayList3;
                i2 = length;
                try {
                    Object invoke = function1.invoke(optSafe);
                    if (invoke != null) {
                        if (!typeHelper.isTypeValid(invoke)) {
                            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                        } else {
                            try {
                                if (!valueValidator.isValid(invoke)) {
                                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                                } else {
                                    arrayList2.add(invoke);
                                }
                            } catch (ClassCastException unused2) {
                                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                            }
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                } catch (Exception e) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
                }
            }
            i3 = i + 1;
            arrayList3 = arrayList2;
            length = i2;
        }
        ArrayList arrayList4 = arrayList3;
        if (z) {
            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                Object obj = arrayList4.get(i4);
                if (!(obj instanceof Expression)) {
                    arrayList4.set(i4, Expression.constant(obj, parsingErrorLogger));
                }
            }
            return new MutableExpressionList(str, arrayList4, listValidator, parsingEnvironment.getLogger());
        }
        try {
            if (!listValidator.isValid(arrayList4)) {
                errorHandler2 = errorHandler;
                arrayList = arrayList4;
                try {
                    errorHandler2.process(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList4));
                    return null;
                } catch (ClassCastException unused4) {
                    errorHandler2.process(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                    return null;
                }
            }
            return new ConstantExpressionList(arrayList4);
        } catch (ClassCastException unused5) {
            errorHandler2 = errorHandler;
            arrayList = arrayList4;
        }
    }

    @NonNull
    public static <T> ValueValidator<T> alwaysValid() {
        return (ValueValidator<T>) ALWAYS_VALID;
    }

    @NonNull
    static ValueValidator<String> alwaysValidString() {
        return ALWAYS_VALID_STRING;
    }

    @NonNull
    public static <T> ListValidator<T> alwaysValidList() {
        return (ListValidator<T>) ALWAYS_VALID_LIST;
    }

    @NonNull
    static <T> Function1 doNotConvert() {
        return AS_IS;
    }

    @Nullable
    private static <T> T optSafe(@Nullable T t) {
        if (t == null || t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    @Nullable
    private static Object optSafe(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            return null;
        }
        return opt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface ErrorHandler {
        public static final ErrorHandler FAIL_FAST = new ErrorHandler() { // from class: com.yandex.div.internal.parser.JsonParser$ErrorHandler$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.JsonParser.ErrorHandler
            public final void process(ParsingException parsingException) {
                JsonParser.ErrorHandler.lambda$static$0(parsingException);
            }
        };
        public static final ErrorHandler IGNORE = new ErrorHandler() { // from class: com.yandex.div.internal.parser.JsonParser$ErrorHandler$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.JsonParser.ErrorHandler
            public final void process(ParsingException parsingException) {
                JsonParser.ErrorHandler.lambda$static$1(parsingException);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$static$1(ParsingException parsingException) {
        }

        void process(ParsingException parsingException);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$static$0(ParsingException parsingException) {
            throw parsingException;
        }
    }
}
