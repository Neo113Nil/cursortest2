package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionAnimatorStartJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStart.kt */
/* loaded from: classes11.dex */
public final class DivActionAnimatorStart implements JSONSerializable, Hashable {
    private Integer _hash;
    public final String animatorId;
    public final Expression direction;
    public final Expression duration;
    public final DivTypedValue endValue;
    public final Expression interpolator;
    public final DivCount repeatCount;
    public final Expression startDelay;
    public final DivTypedValue startValue;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionAnimatorStart$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionAnimatorStart invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionAnimatorStart.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionAnimatorStart(String str, Expression expression, Expression expression2, DivTypedValue divTypedValue, Expression expression3, DivCount divCount, Expression expression4, DivTypedValue divTypedValue2) {
        this.animatorId = str;
        this.direction = expression;
        this.duration = expression2;
        this.endValue = divTypedValue;
        this.interpolator = expression3;
        this.repeatCount = divCount;
        this.startDelay = expression4;
        this.startValue = divTypedValue2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionAnimatorStart.class).hashCode() + this.animatorId.hashCode();
        Expression expression = this.direction;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.duration;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        DivTypedValue divTypedValue = this.endValue;
        int hash = hashCode3 + (divTypedValue != null ? divTypedValue.hash() : 0);
        Expression expression3 = this.interpolator;
        int hashCode4 = hash + (expression3 != null ? expression3.hashCode() : 0);
        DivCount divCount = this.repeatCount;
        int hash2 = hashCode4 + (divCount != null ? divCount.hash() : 0);
        Expression expression4 = this.startDelay;
        int hashCode5 = hash2 + (expression4 != null ? expression4.hashCode() : 0);
        DivTypedValue divTypedValue2 = this.startValue;
        int hash3 = hashCode5 + (divTypedValue2 != null ? divTypedValue2.hash() : 0);
        this._hash = Integer.valueOf(hash3);
        return hash3;
    }

    public final boolean equals(DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionAnimatorStart == null || !Intrinsics.areEqual(this.animatorId, divActionAnimatorStart.animatorId)) {
            return false;
        }
        Expression expression = this.direction;
        DivAnimationDirection divAnimationDirection = expression != null ? (DivAnimationDirection) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divActionAnimatorStart.direction;
        if (divAnimationDirection != (expression2 != null ? (DivAnimationDirection) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression3 = this.duration;
        Long l = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divActionAnimatorStart.duration;
        if (!Intrinsics.areEqual(l, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivTypedValue divTypedValue = this.endValue;
        if (!(divTypedValue != null ? divTypedValue.equals(divActionAnimatorStart.endValue, expressionResolver, expressionResolver2) : divActionAnimatorStart.endValue == null)) {
            return false;
        }
        Expression expression5 = this.interpolator;
        DivAnimationInterpolator divAnimationInterpolator = expression5 != null ? (DivAnimationInterpolator) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = divActionAnimatorStart.interpolator;
        if (divAnimationInterpolator != (expression6 != null ? (DivAnimationInterpolator) expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivCount divCount = this.repeatCount;
        if (!(divCount != null ? divCount.equals(divActionAnimatorStart.repeatCount, expressionResolver, expressionResolver2) : divActionAnimatorStart.repeatCount == null)) {
            return false;
        }
        Expression expression7 = this.startDelay;
        Long l2 = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = divActionAnimatorStart.startDelay;
        if (!Intrinsics.areEqual(l2, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivTypedValue divTypedValue2 = this.startValue;
        DivTypedValue divTypedValue3 = divActionAnimatorStart.startValue;
        return divTypedValue2 != null ? divTypedValue2.equals(divTypedValue3, expressionResolver, expressionResolver2) : divTypedValue3 == null;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionAnimatorStartJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionAnimatorStartJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionAnimatorStart.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionAnimatorStart fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionAnimatorStartJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionAnimatorStartJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
