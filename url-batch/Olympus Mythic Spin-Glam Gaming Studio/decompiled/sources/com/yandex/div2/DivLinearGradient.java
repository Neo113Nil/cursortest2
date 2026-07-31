package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivLinearGradientColorPointJsonParser;
import com.yandex.div2.DivLinearGradientJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivLinearGradient.kt */
/* loaded from: classes11.dex */
public final class DivLinearGradient implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression angle;
    public final List colorMap;
    public final ExpressionList colors;
    public static final Companion Companion = new Companion(null);
    private static final Expression ANGLE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivLinearGradient$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivLinearGradient invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivLinearGradient.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivLinearGradient(Expression expression, List list, ExpressionList expressionList) {
        this.angle = expression;
        this.colorMap = list;
        this.colors = expressionList;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivLinearGradient.class).hashCode() + this.angle.hashCode();
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
        int hashCode2 = i2 + (expressionList != null ? expressionList.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivLinearGradient divLinearGradient, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        List evaluate;
        List evaluate2;
        if (divLinearGradient == null || ((Number) this.angle.evaluate(expressionResolver)).longValue() != ((Number) divLinearGradient.angle.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        List list = this.colorMap;
        if (list != null) {
            List list2 = divLinearGradient.colorMap;
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
        } else if (divLinearGradient.colorMap != null) {
            return false;
        }
        ExpressionList expressionList = this.colors;
        if (expressionList == null || (evaluate = expressionList.evaluate(expressionResolver)) == null) {
            if (divLinearGradient.colors != null) {
                return false;
            }
        } else {
            ExpressionList expressionList2 = divLinearGradient.colors;
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
        }
        return true;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivLinearGradientJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLinearGradientJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivLinearGradient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivLinearGradient fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivLinearGradientJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLinearGradientJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivLinearGradient.kt */
    public static final class ColorPoint implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Expression color;
        public final Expression position;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivLinearGradient$ColorPoint$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivLinearGradient.ColorPoint invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivLinearGradient.ColorPoint.Companion.fromJson(parsingEnvironment, jSONObject);
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
            return ((DivLinearGradientColorPointJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLinearGradientColorPointJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivLinearGradient.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ColorPoint fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivLinearGradientColorPointJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLinearGradientColorPointJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
