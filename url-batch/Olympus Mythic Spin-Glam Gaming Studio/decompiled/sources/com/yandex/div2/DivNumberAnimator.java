package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivNumberAnimatorJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivNumberAnimator.kt */
/* loaded from: classes3.dex */
public final class DivNumberAnimator implements JSONSerializable, Hashable, DivAnimatorBase {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DIRECTION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final DivCount.Fixed REPEAT_COUNT_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    private Integer _hash;
    private final List cancelActions;
    private final Expression direction;
    private final Expression duration;
    private final List endActions;
    public final Expression endValue;
    private final String id;
    private final Expression interpolator;
    private final DivCount repeatCount;
    private final Expression startDelay;
    public final Expression startValue;
    private final String variableName;

    public DivNumberAnimator(List list, Expression expression, Expression expression2, List list2, Expression expression3, String str, Expression expression4, DivCount divCount, Expression expression5, Expression expression6, String str2) {
        this.cancelActions = list;
        this.direction = expression;
        this.duration = expression2;
        this.endActions = list2;
        this.endValue = expression3;
        this.id = str;
        this.interpolator = expression4;
        this.repeatCount = divCount;
        this.startDelay = expression5;
        this.startValue = expression6;
        this.variableName = str2;
    }

    @Override // com.yandex.div2.DivAnimatorBase
    public List getCancelActions() {
        return this.cancelActions;
    }

    @Override // com.yandex.div2.DivAnimatorBase
    public Expression getDirection() {
        return this.direction;
    }

    @Override // com.yandex.div2.DivAnimatorBase
    public Expression getDuration() {
        return this.duration;
    }

    @Override // com.yandex.div2.DivAnimatorBase
    public List getEndActions() {
        return this.endActions;
    }

    @Override // com.yandex.div2.DivAnimatorBase
    public String getId() {
        return this.id;
    }

    @Override // com.yandex.div2.DivAnimatorBase
    public Expression getInterpolator() {
        return this.interpolator;
    }

    @Override // com.yandex.div2.DivAnimatorBase
    public DivCount getRepeatCount() {
        return this.repeatCount;
    }

    @Override // com.yandex.div2.DivAnimatorBase
    public Expression getStartDelay() {
        return this.startDelay;
    }

    public String getVariableName() {
        return this.variableName;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        int i2;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivNumberAnimator.class).hashCode();
        List cancelActions = getCancelActions();
        if (cancelActions != null) {
            Iterator it = cancelActions.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int hashCode2 = hashCode + i + getDirection().hashCode() + getDuration().hashCode();
        List endActions = getEndActions();
        if (endActions != null) {
            Iterator it2 = endActions.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int hashCode3 = hashCode2 + i2 + this.endValue.hashCode() + getId().hashCode() + getInterpolator().hashCode() + getRepeatCount().hash() + getStartDelay().hashCode();
        Expression expression = this.startValue;
        int hashCode4 = hashCode3 + (expression != null ? expression.hashCode() : 0) + getVariableName().hashCode();
        this._hash = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    public final boolean equals(DivNumberAnimator divNumberAnimator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divNumberAnimator == null) {
            return false;
        }
        List cancelActions = getCancelActions();
        if (cancelActions != null) {
            List cancelActions2 = divNumberAnimator.getCancelActions();
            if (cancelActions2 == null || cancelActions.size() != cancelActions2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : cancelActions) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivAction) obj).equals((DivAction) cancelActions2.get(i), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i = i2;
            }
        } else if (divNumberAnimator.getCancelActions() != null) {
            return false;
        }
        if (getDirection().evaluate(expressionResolver) != divNumberAnimator.getDirection().evaluate(expressionResolver2) || ((Number) getDuration().evaluate(expressionResolver)).longValue() != ((Number) divNumberAnimator.getDuration().evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        List endActions = getEndActions();
        if (endActions != null) {
            List endActions2 = divNumberAnimator.getEndActions();
            if (endActions2 == null || endActions.size() != endActions2.size()) {
                return false;
            }
            int i3 = 0;
            for (Object obj2 : endActions) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivAction) obj2).equals((DivAction) endActions2.get(i3), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i3 = i4;
            }
        } else if (divNumberAnimator.getEndActions() != null) {
            return false;
        }
        if (((Number) this.endValue.evaluate(expressionResolver)).doubleValue() != ((Number) divNumberAnimator.endValue.evaluate(expressionResolver2)).doubleValue() || !Intrinsics.areEqual(getId(), divNumberAnimator.getId()) || getInterpolator().evaluate(expressionResolver) != divNumberAnimator.getInterpolator().evaluate(expressionResolver2) || !getRepeatCount().equals(divNumberAnimator.getRepeatCount(), expressionResolver, expressionResolver2) || ((Number) getStartDelay().evaluate(expressionResolver)).longValue() != ((Number) divNumberAnimator.getStartDelay().evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        Expression expression = this.startValue;
        Double d = expression != null ? (Double) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divNumberAnimator.startValue;
        return Intrinsics.areEqual(d, expression2 != null ? (Double) expression2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(getVariableName(), divNumberAnimator.getVariableName());
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivNumberAnimatorJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNumberAnimatorJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivNumberAnimator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivNumberAnimator fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivNumberAnimatorJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNumberAnimatorJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DIRECTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        REPEAT_COUNT_DEFAULT_VALUE = new DivCount.Fixed(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivNumberAnimator$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivNumberAnimator invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivNumberAnimator.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
