package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSlideTransition;
import com.yandex.div2.DivSlideTransitionJsonParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivSlideTransition.kt */
/* loaded from: classes8.dex */
public final class DivSlideTransition implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression EDGE_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    private Integer _hash;
    public final DivDimension distance;
    private final Expression duration;
    public final Expression edge;
    private final Expression interpolator;
    private final Expression startDelay;

    public DivSlideTransition(DivDimension divDimension, Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.distance = divDimension;
        this.duration = expression;
        this.edge = expression2;
        this.interpolator = expression3;
        this.startDelay = expression4;
    }

    public Expression getDuration() {
        return this.duration;
    }

    public Expression getInterpolator() {
        return this.interpolator;
    }

    public Expression getStartDelay() {
        return this.startDelay;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivSlideTransition.class).hashCode();
        DivDimension divDimension = this.distance;
        int hash = hashCode + (divDimension != null ? divDimension.hash() : 0) + getDuration().hashCode() + this.edge.hashCode() + getInterpolator().hashCode() + getStartDelay().hashCode();
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivSlideTransition divSlideTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divSlideTransition == null) {
            return false;
        }
        DivDimension divDimension = this.distance;
        return (divDimension != null ? divDimension.equals(divSlideTransition.distance, expressionResolver, expressionResolver2) : divSlideTransition.distance == null) && ((Number) getDuration().evaluate(expressionResolver)).longValue() == ((Number) divSlideTransition.getDuration().evaluate(expressionResolver2)).longValue() && this.edge.evaluate(expressionResolver) == divSlideTransition.edge.evaluate(expressionResolver2) && getInterpolator().evaluate(expressionResolver) == divSlideTransition.getInterpolator().evaluate(expressionResolver2) && ((Number) getStartDelay().evaluate(expressionResolver)).longValue() == ((Number) divSlideTransition.getStartDelay().evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSlideTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSlideTransitionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSlideTransition.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivSlideTransition fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSlideTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSlideTransitionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        EDGE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Edge.BOTTOM, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSlideTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSlideTransition invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSlideTransition.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivSlideTransition.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivSlideTransition$Edge;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "LEFT", "TOP", "RIGHT", "BOTTOM", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Edge {
        LEFT("left"),
        TOP(ViewHierarchyConstants.DIMENSION_TOP_KEY),
        RIGHT("right"),
        BOTTOM("bottom");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivSlideTransition$Edge$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivSlideTransition.Edge edge) {
                return DivSlideTransition.Edge.INSTANCE.toString(edge);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivSlideTransition$Edge$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivSlideTransition.Edge invoke(@NotNull String str) {
                return DivSlideTransition.Edge.INSTANCE.fromString(str);
            }
        };

        Edge(String str) {
            this.value = str;
        }

        /* compiled from: DivSlideTransition.kt */
        /* renamed from: com.yandex.div2.DivSlideTransition$Edge$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Edge edge) {
                return edge.value;
            }

            public final Edge fromString(String str) {
                Edge edge = Edge.LEFT;
                if (Intrinsics.areEqual(str, edge.value)) {
                    return edge;
                }
                Edge edge2 = Edge.TOP;
                if (Intrinsics.areEqual(str, edge2.value)) {
                    return edge2;
                }
                Edge edge3 = Edge.RIGHT;
                if (Intrinsics.areEqual(str, edge3.value)) {
                    return edge3;
                }
                Edge edge4 = Edge.BOTTOM;
                if (Intrinsics.areEqual(str, edge4.value)) {
                    return edge4;
                }
                return null;
            }
        }
    }
}
