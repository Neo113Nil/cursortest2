package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAbsoluteEdgeInsetsJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAbsoluteEdgeInsets.kt */
/* loaded from: classes14.dex */
public final class DivAbsoluteEdgeInsets implements JSONSerializable, Hashable {
    private static final Expression BOTTOM_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression LEFT_DEFAULT_VALUE;
    private static final Expression RIGHT_DEFAULT_VALUE;
    private static final Expression TOP_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression bottom;
    public final Expression left;
    public final Expression right;
    public final Expression top;

    public DivAbsoluteEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.bottom = expression;
        this.left = expression2;
        this.right = expression3;
        this.top = expression4;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivAbsoluteEdgeInsets.class).hashCode() + this.bottom.hashCode() + this.left.hashCode() + this.right.hashCode() + this.top.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divAbsoluteEdgeInsets != null && ((Number) this.bottom.evaluate(expressionResolver)).longValue() == ((Number) divAbsoluteEdgeInsets.bottom.evaluate(expressionResolver2)).longValue() && ((Number) this.left.evaluate(expressionResolver)).longValue() == ((Number) divAbsoluteEdgeInsets.left.evaluate(expressionResolver2)).longValue() && ((Number) this.right.evaluate(expressionResolver)).longValue() == ((Number) divAbsoluteEdgeInsets.right.evaluate(expressionResolver2)).longValue() && ((Number) this.top.evaluate(expressionResolver)).longValue() == ((Number) divAbsoluteEdgeInsets.top.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAbsoluteEdgeInsetsJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAbsoluteEdgeInsetsJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAbsoluteEdgeInsets.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivAbsoluteEdgeInsets fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivAbsoluteEdgeInsetsJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAbsoluteEdgeInsetsJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        BOTTOM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        LEFT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        RIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TOP_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivAbsoluteEdgeInsets$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivAbsoluteEdgeInsets invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivAbsoluteEdgeInsets.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
