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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltip.kt */
/* loaded from: classes11.dex */
public final class DivActionHideTooltip implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression id;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionHideTooltip$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionHideTooltip invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionHideTooltip.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionHideTooltip(Expression expression) {
        this.id = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionHideTooltip.class).hashCode() + this.id.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionHideTooltip divActionHideTooltip, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionHideTooltip == null) {
            return false;
        }
        return Intrinsics.areEqual(this.id.evaluate(expressionResolver), divActionHideTooltip.id.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionHideTooltipJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionHideTooltipJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionHideTooltip.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionHideTooltip fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionHideTooltipJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionHideTooltipJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
