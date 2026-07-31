package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputFilterExpression.kt */
/* loaded from: classes13.dex */
public final class DivInputFilterExpression implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression condition;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputFilterExpression$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputFilterExpression invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputFilterExpression.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivInputFilterExpression(Expression expression) {
        this.condition = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivInputFilterExpression.class).hashCode() + this.condition.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivInputFilterExpression divInputFilterExpression, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divInputFilterExpression != null && ((Boolean) this.condition.evaluate(expressionResolver)).booleanValue() == ((Boolean) divInputFilterExpression.condition.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputFilterExpressionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterExpressionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputFilterExpression.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInputFilterExpression fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputFilterExpressionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterExpressionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
