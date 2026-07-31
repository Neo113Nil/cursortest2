package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionScrollBy;
import com.yandex.div2.DivActionScrollByJsonParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivActionScrollBy.kt */
/* loaded from: classes.dex */
public final class DivActionScrollBy implements JSONSerializable, Hashable {
    private static final Expression ANIMATED_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression ITEM_COUNT_DEFAULT_VALUE;
    private static final Expression OFFSET_DEFAULT_VALUE;
    private static final Expression OVERFLOW_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression animated;
    public final Expression id;
    public final Expression itemCount;
    public final Expression offset;
    public final Expression overflow;

    public DivActionScrollBy(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
        this.animated = expression;
        this.id = expression2;
        this.itemCount = expression3;
        this.offset = expression4;
        this.overflow = expression5;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionScrollBy.class).hashCode() + this.animated.hashCode() + this.id.hashCode() + this.itemCount.hashCode() + this.offset.hashCode() + this.overflow.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionScrollBy divActionScrollBy, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionScrollBy != null && ((Boolean) this.animated.evaluate(expressionResolver)).booleanValue() == ((Boolean) divActionScrollBy.animated.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.id.evaluate(expressionResolver), divActionScrollBy.id.evaluate(expressionResolver2)) && ((Number) this.itemCount.evaluate(expressionResolver)).longValue() == ((Number) divActionScrollBy.itemCount.evaluate(expressionResolver2)).longValue() && ((Number) this.offset.evaluate(expressionResolver)).longValue() == ((Number) divActionScrollBy.offset.evaluate(expressionResolver2)).longValue() && this.overflow.evaluate(expressionResolver) == divActionScrollBy.overflow.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionScrollByJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollByJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionScrollBy.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionScrollBy fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionScrollByJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollByJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        ITEM_COUNT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        OFFSET_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        OVERFLOW_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Overflow.CLAMP, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivActionScrollBy$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivActionScrollBy invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivActionScrollBy.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivActionScrollBy.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivActionScrollBy$Overflow;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "CLAMP", "RING", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Overflow {
        CLAMP("clamp"),
        RING("ring");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivActionScrollBy$Overflow$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivActionScrollBy.Overflow overflow) {
                return DivActionScrollBy.Overflow.INSTANCE.toString(overflow);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivActionScrollBy$Overflow$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivActionScrollBy.Overflow invoke(@NotNull String str) {
                return DivActionScrollBy.Overflow.INSTANCE.fromString(str);
            }
        };

        Overflow(String str) {
            this.value = str;
        }

        /* compiled from: DivActionScrollBy.kt */
        /* renamed from: com.yandex.div2.DivActionScrollBy$Overflow$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Overflow overflow) {
                return overflow.value;
            }

            public final Overflow fromString(String str) {
                Overflow overflow = Overflow.CLAMP;
                if (Intrinsics.areEqual(str, overflow.value)) {
                    return overflow;
                }
                Overflow overflow2 = Overflow.RING;
                if (Intrinsics.areEqual(str, overflow2.value)) {
                    return overflow2;
                }
                return null;
            }
        }
    }
}
