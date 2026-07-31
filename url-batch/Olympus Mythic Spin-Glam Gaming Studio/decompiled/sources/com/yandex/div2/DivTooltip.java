package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipJsonParser;
import com.yandex.div2.DivTooltipMode;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivTooltip.kt */
/* loaded from: classes9.dex */
public final class DivTooltip implements JSONSerializable, Hashable {
    private static final Expression CLOSE_BY_TAP_OUTSIDE_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final DivTooltipMode.Modal MODE_DEFAULT_VALUE;
    private Integer _hash;
    public final DivAnimation animationIn;
    public final DivAnimation animationOut;
    public final Expression backgroundAccessibilityDescription;
    public final Expression closeByTapOutside;
    public final Div div;
    public final Expression duration;
    public final String id;
    public final DivTooltipMode mode;
    public final DivPoint offset;
    public final Expression position;
    public final List tapOutsideActions;

    public DivTooltip(DivAnimation divAnimation, DivAnimation divAnimation2, Expression expression, Expression expression2, Div div, Expression expression3, String str, DivTooltipMode divTooltipMode, DivPoint divPoint, Expression expression4, List list) {
        this.animationIn = divAnimation;
        this.animationOut = divAnimation2;
        this.backgroundAccessibilityDescription = expression;
        this.closeByTapOutside = expression2;
        this.div = div;
        this.duration = expression3;
        this.id = str;
        this.mode = divTooltipMode;
        this.offset = divPoint;
        this.position = expression4;
        this.tapOutsideActions = list;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivTooltip.class).hashCode();
        DivAnimation divAnimation = this.animationIn;
        int i = 0;
        int hash = hashCode + (divAnimation != null ? divAnimation.hash() : 0);
        DivAnimation divAnimation2 = this.animationOut;
        int hash2 = hash + (divAnimation2 != null ? divAnimation2.hash() : 0);
        Expression expression = this.backgroundAccessibilityDescription;
        int hashCode2 = hash2 + (expression != null ? expression.hashCode() : 0) + this.closeByTapOutside.hashCode() + this.div.hash() + this.duration.hashCode() + this.id.hashCode() + this.mode.hash();
        DivPoint divPoint = this.offset;
        int hash3 = hashCode2 + (divPoint != null ? divPoint.hash() : 0) + this.position.hashCode();
        List list = this.tapOutsideActions;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        }
        int i2 = hash3 + i;
        this._hash = Integer.valueOf(i2);
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
    
        if (r8 == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivTooltip divTooltip, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z;
        if (divTooltip == null) {
            return false;
        }
        DivAnimation divAnimation = this.animationIn;
        if (!(divAnimation != null ? divAnimation.equals(divTooltip.animationIn, expressionResolver, expressionResolver2) : divTooltip.animationIn == null)) {
            return false;
        }
        DivAnimation divAnimation2 = this.animationOut;
        if (!(divAnimation2 != null ? divAnimation2.equals(divTooltip.animationOut, expressionResolver, expressionResolver2) : divTooltip.animationOut == null)) {
            return false;
        }
        Expression expression = this.backgroundAccessibilityDescription;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divTooltip.backgroundAccessibilityDescription;
        if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) || ((Boolean) this.closeByTapOutside.evaluate(expressionResolver)).booleanValue() != ((Boolean) divTooltip.closeByTapOutside.evaluate(expressionResolver2)).booleanValue() || !this.div.equals(divTooltip.div, expressionResolver, expressionResolver2) || ((Number) this.duration.evaluate(expressionResolver)).longValue() != ((Number) divTooltip.duration.evaluate(expressionResolver2)).longValue() || !Intrinsics.areEqual(this.id, divTooltip.id) || !this.mode.equals(divTooltip.mode, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivPoint divPoint = this.offset;
        if (!(divPoint != null ? divPoint.equals(divTooltip.offset, expressionResolver, expressionResolver2) : divTooltip.offset == null) || this.position.evaluate(expressionResolver) != divTooltip.position.evaluate(expressionResolver2)) {
            return false;
        }
        List list = this.tapOutsideActions;
        List list2 = divTooltip.tapOutsideActions;
        if (list != null) {
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj).equals((DivAction) list2.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                        }
                    }
                    z = true;
                }
                z = false;
                break;
            }
            return false;
        }
        return z;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTooltipJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTooltip.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTooltip fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTooltipJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        CLOSE_BY_TAP_OUTSIDE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        MODE_DEFAULT_VALUE = new DivTooltipMode.Modal(new DivTooltipModeModal());
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTooltip$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTooltip invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTooltip.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivTooltip.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/DivTooltip$Position;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "LEFT", "TOP_LEFT", "TOP", "TOP_RIGHT", "RIGHT", "BOTTOM_RIGHT", "BOTTOM", "BOTTOM_LEFT", "CENTER", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Position {
        LEFT("left"),
        TOP_LEFT(X3.e.c),
        TOP(ViewHierarchyConstants.DIMENSION_TOP_KEY),
        TOP_RIGHT(X3.e.b),
        RIGHT("right"),
        BOTTOM_RIGHT(X3.e.d),
        BOTTOM("bottom"),
        BOTTOM_LEFT(X3.e.e),
        CENTER("center");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivTooltip$Position$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivTooltip.Position position) {
                return DivTooltip.Position.INSTANCE.toString(position);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivTooltip$Position$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivTooltip.Position invoke(@NotNull String str) {
                return DivTooltip.Position.INSTANCE.fromString(str);
            }
        };

        Position(String str) {
            this.value = str;
        }

        /* compiled from: DivTooltip.kt */
        /* renamed from: com.yandex.div2.DivTooltip$Position$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Position position) {
                return position.value;
            }

            public final Position fromString(String str) {
                Position position = Position.LEFT;
                if (Intrinsics.areEqual(str, position.value)) {
                    return position;
                }
                Position position2 = Position.TOP_LEFT;
                if (Intrinsics.areEqual(str, position2.value)) {
                    return position2;
                }
                Position position3 = Position.TOP;
                if (Intrinsics.areEqual(str, position3.value)) {
                    return position3;
                }
                Position position4 = Position.TOP_RIGHT;
                if (Intrinsics.areEqual(str, position4.value)) {
                    return position4;
                }
                Position position5 = Position.RIGHT;
                if (Intrinsics.areEqual(str, position5.value)) {
                    return position5;
                }
                Position position6 = Position.BOTTOM_RIGHT;
                if (Intrinsics.areEqual(str, position6.value)) {
                    return position6;
                }
                Position position7 = Position.BOTTOM;
                if (Intrinsics.areEqual(str, position7.value)) {
                    return position7;
                }
                Position position8 = Position.BOTTOM_LEFT;
                if (Intrinsics.areEqual(str, position8.value)) {
                    return position8;
                }
                Position position9 = Position.CENTER;
                if (Intrinsics.areEqual(str, position9.value)) {
                    return position9;
                }
                return null;
            }
        }
    }
}
