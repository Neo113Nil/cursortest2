package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidatorRegexJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorRegex.kt */
/* loaded from: classes15.dex */
public final class DivInputValidatorRegex implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression allowEmpty;
    public final Expression labelId;
    public final Expression pattern;
    public final String variable;
    public static final Companion Companion = new Companion(null);
    private static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputValidatorRegex$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputValidatorRegex invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidatorRegex.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivInputValidatorRegex(Expression expression, Expression expression2, Expression expression3, String str) {
        this.allowEmpty = expression;
        this.labelId = expression2;
        this.pattern = expression3;
        this.variable = str;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivInputValidatorRegex.class).hashCode() + this.allowEmpty.hashCode() + this.labelId.hashCode() + this.pattern.hashCode() + this.variable.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivInputValidatorRegex divInputValidatorRegex, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divInputValidatorRegex != null && ((Boolean) this.allowEmpty.evaluate(expressionResolver)).booleanValue() == ((Boolean) divInputValidatorRegex.allowEmpty.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.labelId.evaluate(expressionResolver), divInputValidatorRegex.labelId.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.pattern.evaluate(expressionResolver), divInputValidatorRegex.pattern.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.variable, divInputValidatorRegex.variable);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputValidatorRegexJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorRegexJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputValidatorRegex.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInputValidatorRegex fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputValidatorRegexJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorRegexJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
