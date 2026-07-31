package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class JsonTemplateParser {
    private static final ValueValidator<String> IS_NOT_EMPTY = new ValueValidator() { // from class: com.yandex.div.internal.parser.JsonTemplateParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean lambda$static$0;
            lambda$static$0 = JsonTemplateParser.lambda$static$0((String) obj);
            return lambda$static$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(String str) {
        return !str.isEmpty();
    }

    @NonNull
    public static <T> Field<T> readOptionalField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalField(jSONObject, str, z, field, JsonParser.doNotConvert(), JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> Field<T> readOptionalField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalField(jSONObject, str, z, field, JsonParser.doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Field<T> readOptionalField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalField(jSONObject, str, z, field, function1, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Field<T> readOptionalField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        Object readOptional = JsonParser.readOptional(jSONObject, str, function1, valueValidator, parsingErrorLogger, parsingEnvironment);
        if (readOptional != null) {
            return new Field.Value(z, readOptional);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <T> Field<T> readOptionalField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function2 function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalField(jSONObject, str, z, field, function2, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> Field<T> readOptionalField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function2 function2, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        Object readOptional = JsonParser.readOptional(jSONObject, str, function2, valueValidator, parsingErrorLogger, parsingEnvironment);
        if (readOptional != null) {
            return new Field.Value(z, readOptional);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <T> Field<T> readField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readField(jSONObject, str, z, field, JsonParser.doNotConvert(), JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> Field<T> readField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readField(jSONObject, str, z, field, JsonParser.doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Field<T> readField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readField(jSONObject, str, z, field, function1, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Field<T> readField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParser.read(jSONObject, str, function1, valueValidator, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<T> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NonNull
    public static <T> Field<T> readField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function2 function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readField(jSONObject, str, z, field, function2, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> Field<T> readField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<T> field, @NonNull Function2 function2, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParser.read(jSONObject, str, function2, valueValidator, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<T> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @Nullable
    public static String readReference(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (String) JsonParser.readOptional(jSONObject, '$' + str, IS_NOT_EMPTY, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Field<Expression<T>> readOptionalFieldWithExpression(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalFieldWithExpression(jSONObject, str, z, field, function1, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static Field<Expression<String>> readOptionalFieldWithExpression(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<String>> field, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<String> typeHelper) {
        return readOptionalFieldWithExpression(jSONObject, str, z, field, JsonParser.doNotConvert(), JsonParser.alwaysValidString(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> Field<Expression<T>> readOptionalFieldWithExpression(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalFieldWithExpression(jSONObject, str, z, field, JsonParser.doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <R, T> Field<Expression<T>> readOptionalFieldWithExpression(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        Expression readOptionalExpression = JsonParser.readOptionalExpression(jSONObject, str, function1, valueValidator, parsingErrorLogger, parsingEnvironment, null, typeHelper);
        if (readOptionalExpression != null) {
            return new Field.Value(z, readOptionalExpression);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <R, T> Field<List<T>> readListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParser.readList(jSONObject, str, function1, listValidator, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<List<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @NonNull
    public static <R, T> Field<ExpressionList<T>> readExpressionListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<ExpressionList<T>> field, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList readOptionalExpressionList = JsonParser.readOptionalExpressionList(jSONObject, str, function1, listValidator, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
        if (readOptionalExpressionList != null) {
            return new Field.Value(z, readOptionalExpressionList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <T> Field<ExpressionList<T>> readExpressionListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<ExpressionList<T>> field, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpressionListField(jSONObject, str, z, field, JsonParser.doNotConvert(), listValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> Field<ExpressionList<T>> readExpressionListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<ExpressionList<T>> field, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList readOptionalExpressionList = JsonParser.readOptionalExpressionList(jSONObject, str, JsonParser.doNotConvert(), listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
        if (readOptionalExpressionList != null) {
            return new Field.Value(z, readOptionalExpressionList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <R, T> Field<List<T>> readOptionalListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalListField(jSONObject, str, z, field, function1, JsonParser.alwaysValidList(), JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Field<List<T>> readOptionalListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalListField(jSONObject, str, z, field, function1, listValidator, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Field<List<T>> readOptionalListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        List readOptionalList = JsonParser.readOptionalList(jSONObject, str, function1, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment);
        if (readOptionalList != null) {
            return new Field.Value(z, readOptionalList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <R, T> Field<List<T>> readOptionalListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function2 function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalListField(jSONObject, str, z, field, function2, JsonParser.alwaysValidList(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Field<List<T>> readOptionalListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function2 function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        List readOptionalList = JsonParser.readOptionalList(jSONObject, str, function2, listValidator, parsingErrorLogger, parsingEnvironment);
        if (readOptionalList != null) {
            return new Field.Value(z, readOptionalList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <T> Field<List<T>> readOptionalListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        List readOptionalList = JsonParser.readOptionalList(jSONObject, str, JsonParser.doNotConvert(), listValidator, valueValidator, parsingErrorLogger, parsingEnvironment);
        if (readOptionalList != null) {
            return new Field.Value(z, readOptionalList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <R, T> Field<ExpressionList<T>> readOptionalExpressionListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<ExpressionList<T>> field, @NonNull Function1 function1, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpressionListField(jSONObject, str, z, field, function1, listValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> Field<ExpressionList<T>> readOptionalExpressionListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<ExpressionList<T>> field, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList readOptionalExpressionList = JsonParser.readOptionalExpressionList(jSONObject, str, JsonParser.doNotConvert(), listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
        if (readOptionalExpressionList != null) {
            return new Field.Value(z, readOptionalExpressionList);
        }
        String readReference = readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment);
        if (readReference != null) {
            return new Field.Reference(z, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        return Field.INSTANCE.nullField(z);
    }

    @NonNull
    public static <T> Field<List<T>> readListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function2 function2, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readListField(jSONObject, str, z, field, function2, JsonParser.alwaysValidList(), JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> Field<List<T>> readListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function2 function2, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readListField(jSONObject, str, z, field, function2, listValidator, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> Field<List<T>> readListField(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<List<T>> field, @NonNull Function2 function2, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        try {
            return new Field.Value(z, JsonParser.readList(jSONObject, str, function2, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<List<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }

    @Nullable
    public static <T> Field<T> referenceOrFallback(boolean z, @Nullable String str, @Nullable Field<T> field) {
        if (str != null) {
            return new Field.Reference(z, str);
        }
        if (field != null) {
            return FieldKt.clone(field, z);
        }
        if (z) {
            return Field.INSTANCE.nullField(z);
        }
        return null;
    }

    @NonNull
    public static <R, T> Field<Expression<T>> readFieldWithExpression(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull Function1 function1, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readFieldWithExpression(jSONObject, str, z, field, function1, JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> Field<Expression<T>> readFieldWithExpression(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readFieldWithExpression(jSONObject, str, z, field, JsonParser.doNotConvert(), JsonParser.alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> Field<Expression<T>> readFieldWithExpression(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readFieldWithExpression(jSONObject, str, z, field, JsonParser.doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <R, T> Field<Expression<T>> readFieldWithExpression(@NonNull JSONObject jSONObject, @NonNull String str, boolean z, @Nullable Field<Expression<T>> field, @NonNull Function1 function1, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        try {
            return new Field.Value(z, JsonParser.readExpression(jSONObject, str, function1, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper));
        } catch (ParsingException e) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e);
            Field<Expression<T>> referenceOrFallback = referenceOrFallback(z, readReference(jSONObject, str, parsingErrorLogger, parsingEnvironment), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e;
        }
    }
}
