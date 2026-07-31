package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionScrollToJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionScrollTo.kt */
/* loaded from: classes11.dex */
public final class DivActionScrollTo implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression animated;
    public final DivActionScrollDestination destination;
    public final Expression id;
    public static final Companion Companion = new Companion(null);
    private static final Expression ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionScrollTo$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionScrollTo invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionScrollTo.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionScrollTo(Expression expression, DivActionScrollDestination divActionScrollDestination, Expression expression2) {
        this.animated = expression;
        this.destination = divActionScrollDestination;
        this.id = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionScrollTo.class).hashCode() + this.animated.hashCode() + this.destination.hash() + this.id.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionScrollTo divActionScrollTo, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionScrollTo != null && ((Boolean) this.animated.evaluate(expressionResolver)).booleanValue() == ((Boolean) divActionScrollTo.animated.evaluate(expressionResolver2)).booleanValue() && this.destination.equals(divActionScrollTo.destination, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.id.evaluate(expressionResolver), divActionScrollTo.id.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionScrollToJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollToJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionScrollTo.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionScrollTo fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionScrollToJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollToJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
