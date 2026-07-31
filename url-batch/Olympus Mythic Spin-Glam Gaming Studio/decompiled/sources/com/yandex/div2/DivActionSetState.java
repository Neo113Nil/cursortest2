package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionSetStateJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionSetState.kt */
/* loaded from: classes14.dex */
public final class DivActionSetState implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression stateId;
    public final Expression temporary;
    public static final Companion Companion = new Companion(null);
    private static final Expression TEMPORARY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSetState$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionSetState invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionSetState.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionSetState(Expression expression, Expression expression2) {
        this.stateId = expression;
        this.temporary = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionSetState.class).hashCode() + this.stateId.hashCode() + this.temporary.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionSetState divActionSetState, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionSetState != null && Intrinsics.areEqual(this.stateId.evaluate(expressionResolver), divActionSetState.stateId.evaluate(expressionResolver2)) && ((Boolean) this.temporary.evaluate(expressionResolver)).booleanValue() == ((Boolean) divActionSetState.temporary.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionSetStateJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetStateJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionSetState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionSetState fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionSetStateJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetStateJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
