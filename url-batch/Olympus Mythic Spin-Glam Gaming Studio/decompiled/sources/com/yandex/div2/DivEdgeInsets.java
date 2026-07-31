package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivEdgeInsetsJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivEdgeInsets.kt */
/* loaded from: classes9.dex */
public final class DivEdgeInsets implements JSONSerializable, Hashable {
    private static final Expression BOTTOM_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression LEFT_DEFAULT_VALUE;
    private static final Expression RIGHT_DEFAULT_VALUE;
    private static final Expression TOP_DEFAULT_VALUE;
    private static final Expression UNIT_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression bottom;
    public final Expression end;
    public final Expression left;
    public final Expression right;
    public final Expression start;
    public final Expression top;
    public final Expression unit;

    public DivEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7) {
        this.bottom = expression;
        this.end = expression2;
        this.left = expression3;
        this.right = expression4;
        this.start = expression5;
        this.top = expression6;
        this.unit = expression7;
    }

    public /* synthetic */ DivEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BOTTOM_DEFAULT_VALUE : expression, (i & 2) != 0 ? null : expression2, (i & 4) != 0 ? LEFT_DEFAULT_VALUE : expression3, (i & 8) != 0 ? RIGHT_DEFAULT_VALUE : expression4, (i & 16) == 0 ? expression5 : null, (i & 32) != 0 ? TOP_DEFAULT_VALUE : expression6, (i & 64) != 0 ? UNIT_DEFAULT_VALUE : expression7);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivEdgeInsets.class).hashCode() + this.bottom.hashCode();
        Expression expression = this.end;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.left.hashCode() + this.right.hashCode();
        Expression expression2 = this.start;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.top.hashCode() + this.unit.hashCode();
        this._hash = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    public final boolean equals(DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divEdgeInsets == null || ((Number) this.bottom.evaluate(expressionResolver)).longValue() != ((Number) divEdgeInsets.bottom.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        Expression expression = this.end;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divEdgeInsets.end;
        if (!Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null) || ((Number) this.left.evaluate(expressionResolver)).longValue() != ((Number) divEdgeInsets.left.evaluate(expressionResolver2)).longValue() || ((Number) this.right.evaluate(expressionResolver)).longValue() != ((Number) divEdgeInsets.right.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        Expression expression3 = this.start;
        Long l2 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divEdgeInsets.start;
        return Intrinsics.areEqual(l2, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null) && ((Number) this.top.evaluate(expressionResolver)).longValue() == ((Number) divEdgeInsets.top.evaluate(expressionResolver2)).longValue() && this.unit.evaluate(expressionResolver) == divEdgeInsets.unit.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivEdgeInsetsJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivEdgeInsetsJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivEdgeInsets.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivEdgeInsets fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivEdgeInsetsJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivEdgeInsetsJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        BOTTOM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        LEFT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        RIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TOP_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivEdgeInsets$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivEdgeInsets invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivEdgeInsets.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
