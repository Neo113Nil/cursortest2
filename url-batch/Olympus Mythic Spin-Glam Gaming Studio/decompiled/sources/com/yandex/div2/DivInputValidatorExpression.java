package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidatorExpressionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorExpression.kt */
/* loaded from: classes10.dex */
public final class DivInputValidatorExpression implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression allowEmpty;
    public final Expression condition;
    public final Expression labelId;
    public final String variable;
    public static final Companion Companion = new Companion(null);
    private static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputValidatorExpression$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputValidatorExpression invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidatorExpression.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivInputValidatorExpression(Expression expression, Expression expression2, Expression expression3, String str) {
        this.allowEmpty = expression;
        this.condition = expression2;
        this.labelId = expression3;
        this.variable = str;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivInputValidatorExpression.class).hashCode() + this.allowEmpty.hashCode() + this.condition.hashCode() + this.labelId.hashCode() + this.variable.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivInputValidatorExpression divInputValidatorExpression, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divInputValidatorExpression != null && ((Boolean) this.allowEmpty.evaluate(expressionResolver)).booleanValue() == ((Boolean) divInputValidatorExpression.allowEmpty.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.condition.evaluate(expressionResolver)).booleanValue() == ((Boolean) divInputValidatorExpression.condition.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.labelId.evaluate(expressionResolver), divInputValidatorExpression.labelId.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.variable, divInputValidatorExpression.variable);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputValidatorExpressionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorExpressionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputValidatorExpression.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInputValidatorExpression fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputValidatorExpressionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorExpressionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
