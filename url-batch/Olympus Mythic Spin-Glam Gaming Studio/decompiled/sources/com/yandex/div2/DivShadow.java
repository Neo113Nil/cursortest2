package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivShadowJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivShadow.kt */
/* loaded from: classes11.dex */
public final class DivShadow implements JSONSerializable, Hashable {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression BLUR_DEFAULT_VALUE;
    private static final Expression COLOR_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private Integer _hash;
    public final Expression alpha;
    public final Expression blur;
    public final Expression color;
    public final DivPoint offset;

    public DivShadow(Expression expression, Expression expression2, Expression expression3, DivPoint divPoint) {
        this.alpha = expression;
        this.blur = expression2;
        this.color = expression3;
        this.offset = divPoint;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivShadow.class).hashCode() + this.alpha.hashCode() + this.blur.hashCode() + this.color.hashCode() + this.offset.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivShadow divShadow, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divShadow != null && ((Number) this.alpha.evaluate(expressionResolver)).doubleValue() == ((Number) divShadow.alpha.evaluate(expressionResolver2)).doubleValue() && ((Number) this.blur.evaluate(expressionResolver)).longValue() == ((Number) divShadow.blur.evaluate(expressionResolver2)).longValue() && ((Number) this.color.evaluate(expressionResolver)).intValue() == ((Number) divShadow.color.evaluate(expressionResolver2)).intValue() && this.offset.equals(divShadow.offset, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivShadowJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShadowJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivShadow.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivShadow fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivShadowJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShadowJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        BLUR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivShadow$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivShadow invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivShadow.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
