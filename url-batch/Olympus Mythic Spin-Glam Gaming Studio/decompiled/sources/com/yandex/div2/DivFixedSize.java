package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedSizeJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFixedSize.kt */
/* loaded from: classes13.dex */
public final class DivFixedSize implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression unit;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Expression UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivSizeUnit.DP, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFixedSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFixedSize invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFixedSize.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivFixedSize(Expression expression, Expression expression2) {
        this.unit = expression;
        this.value = expression2;
    }

    public /* synthetic */ DivFixedSize(Expression expression, Expression expression2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UNIT_DEFAULT_VALUE : expression, expression2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivFixedSize.class).hashCode() + this.unit.hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivFixedSize divFixedSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divFixedSize != null && this.unit.evaluate(expressionResolver) == divFixedSize.unit.evaluate(expressionResolver2) && ((Number) this.value.evaluate(expressionResolver)).longValue() == ((Number) divFixedSize.value.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFixedSizeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedSizeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFixedSize.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivFixedSize fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFixedSizeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedSizeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
