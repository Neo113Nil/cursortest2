package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeMaskSolidJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskSolid.kt */
/* loaded from: classes14.dex */
public final class DivTextRangeMaskSolid implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression color;
    public final Expression isEnabled;
    public static final Companion Companion = new Companion(null);
    private static final Expression IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeMaskSolid$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeMaskSolid invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeMaskSolid.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivTextRangeMaskSolid(Expression expression, Expression expression2) {
        this.color = expression;
        this.isEnabled = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivTextRangeMaskSolid.class).hashCode() + this.color.hashCode() + this.isEnabled.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivTextRangeMaskSolid divTextRangeMaskSolid, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divTextRangeMaskSolid != null && ((Number) this.color.evaluate(expressionResolver)).intValue() == ((Number) divTextRangeMaskSolid.color.evaluate(expressionResolver2)).intValue() && ((Boolean) this.isEnabled.evaluate(expressionResolver)).booleanValue() == ((Boolean) divTextRangeMaskSolid.isEnabled.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeMaskSolidJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskSolidJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeMaskSolid.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTextRangeMaskSolid fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextRangeMaskSolidJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskSolidJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
