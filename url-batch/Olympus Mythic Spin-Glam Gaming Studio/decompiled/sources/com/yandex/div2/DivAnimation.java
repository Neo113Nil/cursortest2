package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationJsonParser;
import com.yandex.div2.DivCount;
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

/* compiled from: DivAnimation.kt */
/* loaded from: classes13.dex */
public final class DivAnimation implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final DivCount.Infinity REPEAT_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    private Integer _hash;
    private Integer _propertiesHash;
    public final Expression duration;
    public final Expression endValue;
    public final Expression interpolator;
    public final List items;
    public final Expression name;
    public final DivCount repeat;
    public final Expression startDelay;
    public final Expression startValue;

    public DivAnimation(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, DivCount divCount, Expression expression5, Expression expression6) {
        this.duration = expression;
        this.endValue = expression2;
        this.interpolator = expression3;
        this.items = list;
        this.name = expression4;
        this.repeat = divCount;
        this.startDelay = expression5;
        this.startValue = expression6;
    }

    public /* synthetic */ DivAnimation(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, DivCount divCount, Expression expression5, Expression expression6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DURATION_DEFAULT_VALUE : expression, (i & 2) != 0 ? null : expression2, (i & 4) != 0 ? INTERPOLATOR_DEFAULT_VALUE : expression3, (i & 8) != 0 ? null : list, expression4, (i & 32) != 0 ? REPEAT_DEFAULT_VALUE : divCount, (i & 64) != 0 ? START_DELAY_DEFAULT_VALUE : expression5, (i & 128) != 0 ? null : expression6);
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivAnimation.class).hashCode() + this.duration.hashCode();
        Expression expression = this.endValue;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.interpolator.hashCode() + this.name.hashCode() + this.repeat.hash() + this.startDelay.hashCode();
        Expression expression2 = this.startValue;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        this._propertiesHash = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        List list = this.items;
        int i = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((DivAnimation) it.next()).hash();
            }
        }
        int i2 = propertiesHash + i;
        this._hash = Integer.valueOf(i2);
        return i2;
    }

    public final boolean equals(DivAnimation divAnimation, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAnimation == null || ((Number) this.duration.evaluate(expressionResolver)).longValue() != ((Number) divAnimation.duration.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        Expression expression = this.endValue;
        Double d = expression != null ? (Double) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divAnimation.endValue;
        if (!Intrinsics.areEqual(d, expression2 != null ? (Double) expression2.evaluate(expressionResolver2) : null) || this.interpolator.evaluate(expressionResolver) != divAnimation.interpolator.evaluate(expressionResolver2)) {
            return false;
        }
        List list = this.items;
        if (list != null) {
            List list2 = divAnimation.items;
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivAnimation) obj).equals((DivAnimation) list2.get(i), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i = i2;
            }
        } else if (divAnimation.items != null) {
            return false;
        }
        if (this.name.evaluate(expressionResolver) != divAnimation.name.evaluate(expressionResolver2) || !this.repeat.equals(divAnimation.repeat, expressionResolver, expressionResolver2) || ((Number) this.startDelay.evaluate(expressionResolver)).longValue() != ((Number) divAnimation.startDelay.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        Expression expression3 = this.startValue;
        Double d2 = expression3 != null ? (Double) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divAnimation.startValue;
        return Intrinsics.areEqual(d2, expression4 != null ? (Double) expression4.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAnimationJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimationJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAnimation.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivAnimation fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivAnimationJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimationJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.SPRING, null, 2, null);
        REPEAT_DEFAULT_VALUE = new DivCount.Infinity(new DivInfinityCount());
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivAnimation$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivAnimation invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivAnimation.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivAnimation.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/yandex/div2/DivAnimation$Name;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "FADE", "TRANSLATE", "SCALE", "NATIVE", "SET", "NO_ANIMATION", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Name {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE("native"),
        SET("set"),
        NO_ANIMATION("no_animation");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivAnimation$Name$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivAnimation.Name name) {
                return DivAnimation.Name.INSTANCE.toString(name);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivAnimation$Name$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivAnimation.Name invoke(@NotNull String str) {
                return DivAnimation.Name.INSTANCE.fromString(str);
            }
        };

        Name(String str) {
            this.value = str;
        }

        /* compiled from: DivAnimation.kt */
        /* renamed from: com.yandex.div2.DivAnimation$Name$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Name name) {
                return name.value;
            }

            public final Name fromString(String str) {
                Name name = Name.FADE;
                if (Intrinsics.areEqual(str, name.value)) {
                    return name;
                }
                Name name2 = Name.TRANSLATE;
                if (Intrinsics.areEqual(str, name2.value)) {
                    return name2;
                }
                Name name3 = Name.SCALE;
                if (Intrinsics.areEqual(str, name3.value)) {
                    return name3;
                }
                Name name4 = Name.NATIVE;
                if (Intrinsics.areEqual(str, name4.value)) {
                    return name4;
                }
                Name name5 = Name.SET;
                if (Intrinsics.areEqual(str, name5.value)) {
                    return name5;
                }
                Name name6 = Name.NO_ANIMATION;
                if (Intrinsics.areEqual(str, name6.value)) {
                    return name6;
                }
                return null;
            }
        }
    }
}
