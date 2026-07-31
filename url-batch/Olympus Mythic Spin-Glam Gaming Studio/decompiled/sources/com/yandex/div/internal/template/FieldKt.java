package com.yandex.div.internal.template;

import com.ironsource.B5;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: Field.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a_\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062(\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\u000b\u0010\f\u001ae\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062,\u0010\n\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\t¢\u0006\u0004\b\r\u0010\f\u001a\u0089\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f24\u0010\n\u001a0\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e`\t¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008f\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\u0004\b\u0000\u0010\u0000*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f28\u0010\n\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\bj\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e`\t¢\u0006\u0004\b\u0013\u0010\u0012\u001ak\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0014*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062(\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\u0016\u0010\u0017\u001aq\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0014*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062,\u0010\n\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\t¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u0093\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\b\b\u0000\u0010\u0000*\u00020\u0014*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u000e0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f24\u0010\n\u001a0\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e`\t¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0099\u0001\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0000*\u00020\u0014*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u000e0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f28\u0010\n\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\bj\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e`\t¢\u0006\u0004\b\u001a\u0010\u0012\u001a;\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a5\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a{\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\b\b\u0000\u0010\u0000*\u00020#*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000624\u0010\n\u001a0\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$`\t¢\u0006\u0004\b%\u0010&\u001a{\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\b\b\u0000\u0010\u0000*\u00020#*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000624\u0010\n\u001a0\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'`\t¢\u0006\u0004\b(\u0010)\u001a\u0081\u0001\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$\"\b\b\u0000\u0010\u0000*\u00020#*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000628\u0010\n\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$0\bj\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$`\t¢\u0006\u0004\b*\u0010&\u001a\u0081\u0001\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'\"\b\b\u0000\u0010\u0000*\u00020#*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000628\u0010\n\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'0\bj\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'`\t¢\u0006\u0004\b+\u0010)*@\u0010,\u001a\u0004\b\u0000\u0010\u0000\"\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\b2\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\b¨\u0006-"}, d2 = {"T", "Lcom/yandex/div/internal/template/Field;", "Lcom/yandex/div/json/ParsingEnvironment;", B5.o, "", "key", "Lorg/json/JSONObject;", "data", "Lkotlin/Function3;", "Lcom/yandex/div/internal/template/Reader;", "reader", "resolve", "(Lcom/yandex/div/internal/template/Field;Lcom/yandex/div/json/ParsingEnvironment;Ljava/lang/String;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "resolveOptional", "", "Lcom/yandex/div/internal/parser/ListValidator;", "validator", "resolveList", "(Lcom/yandex/div/internal/template/Field;Lcom/yandex/div/json/ParsingEnvironment;Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/internal/parser/ListValidator;Lkotlin/jvm/functions/Function3;)Ljava/util/List;", "resolveOptionalList", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "resolveTemplate", "(Lcom/yandex/div/internal/template/Field;Lcom/yandex/div/json/ParsingEnvironment;Ljava/lang/String;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function3;)Lcom/yandex/div/json/JSONSerializable;", "resolveOptionalTemplate", "resolveTemplateList", "resolveOptionalTemplateList", "resolveDependency", "(Lcom/yandex/div/json/JsonTemplate;Lcom/yandex/div/json/ParsingEnvironment;Ljava/lang/String;Lorg/json/JSONObject;)Lcom/yandex/div/json/JSONSerializable;", "resolveOptionalDependency", "(Lcom/yandex/div/json/JsonTemplate;Lcom/yandex/div/json/ParsingEnvironment;Lorg/json/JSONObject;)Lcom/yandex/div/json/JSONSerializable;", "", "overridable", "clone", "(Lcom/yandex/div/internal/template/Field;Z)Lcom/yandex/div/internal/template/Field;", "", "Lcom/yandex/div/json/expressions/Expression;", "resolveExpression", "(Lcom/yandex/div/internal/template/Field;Lcom/yandex/div/json/ParsingEnvironment;Ljava/lang/String;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function3;)Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/json/expressions/ExpressionList;", "resolveExpressionList", "(Lcom/yandex/div/internal/template/Field;Lcom/yandex/div/json/ParsingEnvironment;Ljava/lang/String;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function3;)Lcom/yandex/div/json/expressions/ExpressionList;", "resolveOptionalExpression", "resolveOptionalExpressionList", "Reader", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FieldKt {
    public static final <T> T resolve(@NotNull Field<T> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3 function3) {
        if (field.overridable && jSONObject.has(str)) {
            return (T) function3.invoke(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return ((Field.Value) field).value;
        }
        if (field instanceof Field.Reference) {
            return (T) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static final <T> T resolveOptional(@NotNull Field<T> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3 function3) {
        if (field.overridable && jSONObject.has(str)) {
            return (T) function3.invoke(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return ((Field.Value) field).value;
        }
        if (field instanceof Field.Reference) {
            return (T) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        return null;
    }

    public static /* synthetic */ List resolveList$default(Field field, ParsingEnvironment parsingEnvironment, String str, JSONObject jSONObject, ListValidator listValidator, Function3 function3, int i, Object obj) {
        if ((i & 8) != 0) {
            listValidator = JsonParser.alwaysValidList();
        }
        return resolveList(field, parsingEnvironment, str, jSONObject, listValidator, function3);
    }

    @NotNull
    public static final <T> List<T> resolveList(@NotNull Field<? extends List<? extends T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull ListValidator<T> listValidator, @NotNull Function3 function3) {
        List<T> list;
        if (field.overridable && jSONObject.has(str)) {
            list = (List) function3.invoke(str, jSONObject, parsingEnvironment);
        } else if (field instanceof Field.Value) {
            list = (List) ((Field.Value) field).value;
        } else {
            if (!(field instanceof Field.Reference)) {
                throw ParsingExceptionKt.missingValue(jSONObject, str);
            }
            list = (List) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        if (listValidator.isValid(list)) {
            return list;
        }
        throw ParsingExceptionKt.invalidValue(jSONObject, str, list);
    }

    public static /* synthetic */ List resolveOptionalList$default(Field field, ParsingEnvironment parsingEnvironment, String str, JSONObject jSONObject, ListValidator listValidator, Function3 function3, int i, Object obj) {
        if ((i & 8) != 0) {
            listValidator = JsonParser.alwaysValidList();
        }
        return resolveOptionalList(field, parsingEnvironment, str, jSONObject, listValidator, function3);
    }

    @Nullable
    public static final <T> List<T> resolveOptionalList(@NotNull Field<? extends List<? extends T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull ListValidator<T> listValidator, @NotNull Function3 function3) {
        List<? extends T> list;
        if (field.overridable && jSONObject.has(str)) {
            list = (List) function3.invoke(str, jSONObject, parsingEnvironment);
        } else if (field instanceof Field.Value) {
            list = (List) ((Field.Value) field).value;
        } else {
            list = field instanceof Field.Reference ? (List) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment) : null;
        }
        if (list == null) {
            return null;
        }
        if (listValidator.isValid(list)) {
            return (List<T>) list;
        }
        parsingEnvironment.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
        return null;
    }

    @NotNull
    public static final <T extends JSONSerializable> T resolveTemplate(@NotNull Field<? extends JsonTemplate<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3 function3) {
        if (field.overridable && jSONObject.has(str)) {
            return (T) function3.invoke(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return (T) resolveDependency((JsonTemplate) ((Field.Value) field).value, parsingEnvironment, str, jSONObject);
        }
        if (field instanceof Field.Reference) {
            return (T) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static final <T extends JSONSerializable> T resolveOptionalTemplate(@NotNull Field<? extends JsonTemplate<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3 function3) {
        if (field.overridable && jSONObject.has(str)) {
            return (T) function3.invoke(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return (T) resolveOptionalDependency((JsonTemplate) ((Field.Value) field).value, parsingEnvironment, jSONObject);
        }
        if (field instanceof Field.Reference) {
            return (T) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        return null;
    }

    public static /* synthetic */ List resolveTemplateList$default(Field field, ParsingEnvironment parsingEnvironment, String str, JSONObject jSONObject, ListValidator listValidator, Function3 function3, int i, Object obj) {
        if ((i & 8) != 0) {
            listValidator = JsonParser.alwaysValidList();
        }
        return resolveTemplateList(field, parsingEnvironment, str, jSONObject, listValidator, function3);
    }

    @NotNull
    public static final <T extends JSONSerializable> List<T> resolveTemplateList(@NotNull Field<? extends List<? extends JsonTemplate<T>>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull ListValidator<T> listValidator, @NotNull Function3 function3) {
        List<T> list;
        if (field.overridable && jSONObject.has(str)) {
            list = (List) function3.invoke(str, jSONObject, parsingEnvironment);
        } else if (!(field instanceof Field.Value)) {
            if (!(field instanceof Field.Reference)) {
                throw ParsingExceptionKt.missingValue(jSONObject, str);
            }
            list = (List) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        } else {
            Iterable iterable = (Iterable) ((Field.Value) field).value;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                JSONSerializable resolveOptionalDependency = resolveOptionalDependency((JsonTemplate) it.next(), parsingEnvironment, jSONObject);
                if (resolveOptionalDependency != null) {
                    arrayList.add(resolveOptionalDependency);
                }
            }
            list = arrayList;
        }
        if (listValidator.isValid(list)) {
            return list;
        }
        throw ParsingExceptionKt.invalidValue(jSONObject, str, list);
    }

    public static /* synthetic */ List resolveOptionalTemplateList$default(Field field, ParsingEnvironment parsingEnvironment, String str, JSONObject jSONObject, ListValidator listValidator, Function3 function3, int i, Object obj) {
        if ((i & 8) != 0) {
            listValidator = JsonParser.alwaysValidList();
        }
        return resolveOptionalTemplateList(field, parsingEnvironment, str, jSONObject, listValidator, function3);
    }

    @Nullable
    public static final <T extends JSONSerializable> List<T> resolveOptionalTemplateList(@NotNull Field<? extends List<? extends JsonTemplate<T>>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull ListValidator<T> listValidator, @NotNull Function3 function3) {
        List<? extends T> list;
        if (field.overridable && jSONObject.has(str)) {
            list = (List) function3.invoke(str, jSONObject, parsingEnvironment);
        } else if (!(field instanceof Field.Value)) {
            list = field instanceof Field.Reference ? (List) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment) : null;
        } else {
            Iterable iterable = (Iterable) ((Field.Value) field).value;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                JSONSerializable resolveOptionalDependency = resolveOptionalDependency((JsonTemplate) it.next(), parsingEnvironment, jSONObject);
                if (resolveOptionalDependency != null) {
                    arrayList.add(resolveOptionalDependency);
                }
            }
            list = arrayList;
        }
        if (list == null) {
            return null;
        }
        if (listValidator.isValid(list)) {
            return (List<T>) list;
        }
        parsingEnvironment.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
        return null;
    }

    @NotNull
    public static final <T extends JSONSerializable> T resolveDependency(@NotNull JsonTemplate<T> jsonTemplate, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject) {
        try {
            return jsonTemplate.resolve(parsingEnvironment, jSONObject);
        } catch (ParsingException e) {
            throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e);
        }
    }

    @Nullable
    public static final <T extends JSONSerializable> T resolveOptionalDependency(@NotNull JsonTemplate<T> jsonTemplate, @NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
        try {
            return jsonTemplate.resolve(parsingEnvironment, jSONObject);
        } catch (ParsingException e) {
            parsingEnvironment.getLogger().logError(e);
            return null;
        }
    }

    @NotNull
    public static final <T> Field<T> clone(@Nullable Field<T> field, boolean z) {
        if (field == null || Intrinsics.areEqual(field, Field.Null.INSTANCE) || Intrinsics.areEqual(field, Field.Placeholder.INSTANCE)) {
            return Field.INSTANCE.nullField(z);
        }
        if (field instanceof Field.Value) {
            return new Field.Value(z, ((Field.Value) field).value);
        }
        if (field instanceof Field.Reference) {
            return new Field.Reference(z, ((Field.Reference) field).reference);
        }
        throw new IllegalStateException("Unknown field type");
    }

    @NotNull
    public static final <T> Expression<T> resolveExpression(@NotNull Field<Expression<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3 function3) {
        if (field.overridable && jSONObject.has(str)) {
            return (Expression) function3.invoke(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return (Expression) ((Field.Value) field).value;
        }
        if (field instanceof Field.Reference) {
            return (Expression) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @NotNull
    public static final <T> ExpressionList<T> resolveExpressionList(@NotNull Field<ExpressionList<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3 function3) {
        if (field.overridable && jSONObject.has(str)) {
            return (ExpressionList) function3.invoke(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return (ExpressionList) ((Field.Value) field).value;
        }
        if (field instanceof Field.Reference) {
            return (ExpressionList) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static final <T> Expression<T> resolveOptionalExpression(@NotNull Field<Expression<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3 function3) {
        if (field.overridable && jSONObject.has(str)) {
            return (Expression) function3.invoke(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return (Expression) ((Field.Value) field).value;
        }
        if (field instanceof Field.Reference) {
            return (Expression) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        return null;
    }

    @Nullable
    public static final <T> ExpressionList<T> resolveOptionalExpressionList(@NotNull Field<ExpressionList<T>> field, @NotNull ParsingEnvironment parsingEnvironment, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull Function3 function3) {
        if (field.overridable && jSONObject.has(str)) {
            return (ExpressionList) function3.invoke(str, jSONObject, parsingEnvironment);
        }
        if (field instanceof Field.Value) {
            return (ExpressionList) ((Field.Value) field).value;
        }
        if (field instanceof Field.Reference) {
            return (ExpressionList) function3.invoke(((Field.Reference) field).reference, jSONObject, parsingEnvironment);
        }
        return null;
    }
}
