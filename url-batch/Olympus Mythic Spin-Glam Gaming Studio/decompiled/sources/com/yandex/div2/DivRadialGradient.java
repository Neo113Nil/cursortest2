package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientColorPointJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradient.kt */
/* loaded from: classes14.dex */
public final class DivRadialGradient implements JSONSerializable, Hashable {
    private static final DivRadialGradientCenter.Relative CENTER_X_DEFAULT_VALUE;
    private static final DivRadialGradientCenter.Relative CENTER_Y_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivRadialGradientRadius.Relative RADIUS_DEFAULT_VALUE;
    private Integer _hash;
    public final DivRadialGradientCenter centerX;
    public final DivRadialGradientCenter centerY;
    public final List colorMap;
    public final ExpressionList colors;
    public final DivRadialGradientRadius radius;

    public DivRadialGradient(DivRadialGradientCenter divRadialGradientCenter, DivRadialGradientCenter divRadialGradientCenter2, List list, ExpressionList expressionList, DivRadialGradientRadius divRadialGradientRadius) {
        this.centerX = divRadialGradientCenter;
        this.centerY = divRadialGradientCenter2;
        this.colorMap = list;
        this.colors = expressionList;
        this.radius = divRadialGradientRadius;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivRadialGradient.class).hashCode() + this.centerX.hash() + this.centerY.hash();
        List list = this.colorMap;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((ColorPoint) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i2 = hashCode + i;
        ExpressionList expressionList = this.colors;
        int hashCode2 = i2 + (expressionList != null ? expressionList.hashCode() : 0) + this.radius.hash();
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivRadialGradient divRadialGradient, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        List evaluate;
        List evaluate2;
        if (divRadialGradient == null || !this.centerX.equals(divRadialGradient.centerX, expressionResolver, expressionResolver2) || !this.centerY.equals(divRadialGradient.centerY, expressionResolver, expressionResolver2)) {
            return false;
        }
        List list = this.colorMap;
        if (list != null) {
            List list2 = divRadialGradient.colorMap;
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((ColorPoint) obj).equals((ColorPoint) list2.get(i), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i = i2;
            }
        } else if (divRadialGradient.colorMap != null) {
            return false;
        }
        ExpressionList expressionList = this.colors;
        if (expressionList != null && (evaluate = expressionList.evaluate(expressionResolver)) != null) {
            ExpressionList expressionList2 = divRadialGradient.colors;
            if (expressionList2 == null || (evaluate2 = expressionList2.evaluate(expressionResolver2)) == null || evaluate.size() != evaluate2.size()) {
                return false;
            }
            int i3 = 0;
            for (Object obj2 : evaluate) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((Number) obj2).intValue() != ((Number) evaluate2.get(i3)).intValue()) {
                    return false;
                }
                i3 = i4;
            }
        } else if (divRadialGradient.colors != null) {
            return false;
        }
        return this.radius.equals(divRadialGradient.radius, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivRadialGradient fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivRadialGradientJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double valueOf = Double.valueOf(0.5d);
        CENTER_X_DEFAULT_VALUE = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        CENTER_Y_DEFAULT_VALUE = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        RADIUS_DEFAULT_VALUE = new DivRadialGradientRadius.Relative(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradient$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivRadialGradient invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivRadialGradient.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivRadialGradient.kt */
    public static final class ColorPoint implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Expression color;
        public final Expression position;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradient$ColorPoint$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivRadialGradient.ColorPoint invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivRadialGradient.ColorPoint.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public ColorPoint(Expression expression, Expression expression2) {
            this.color = expression;
            this.position = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(ColorPoint.class).hashCode() + this.color.hashCode() + this.position.hashCode();
            this._hash = Integer.valueOf(hashCode);
            return hashCode;
        }

        public final boolean equals(ColorPoint colorPoint, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return colorPoint != null && ((Number) this.color.evaluate(expressionResolver)).intValue() == ((Number) colorPoint.color.evaluate(expressionResolver2)).intValue() && ((Number) this.position.evaluate(expressionResolver)).doubleValue() == ((Number) colorPoint.position.evaluate(expressionResolver2)).doubleValue();
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivRadialGradientColorPointJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientColorPointJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivRadialGradient.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ColorPoint fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivRadialGradientColorPointJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientColorPointJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
