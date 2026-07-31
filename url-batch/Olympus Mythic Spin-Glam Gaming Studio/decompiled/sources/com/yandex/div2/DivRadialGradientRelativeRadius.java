package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeRadius.kt */
/* loaded from: classes10.dex */
public final class DivRadialGradientRelativeRadius implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientRelativeRadius invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientRelativeRadius.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivRadialGradientRelativeRadius(Expression expression) {
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivRadialGradientRelativeRadius.class).hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivRadialGradientRelativeRadius divRadialGradientRelativeRadius, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divRadialGradientRelativeRadius != null && this.value.evaluate(expressionResolver) == divRadialGradientRelativeRadius.value.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientRelativeRadiusJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRelativeRadiusJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivRadialGradientRelativeRadius fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivRadialGradientRelativeRadiusJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRelativeRadiusJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NEAREST_CORNER", "FARTHEST_CORNER", "NEAREST_SIDE", "FARTHEST_SIDE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Value {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Value$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivRadialGradientRelativeRadius.Value value) {
                return DivRadialGradientRelativeRadius.Value.INSTANCE.toString(value);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Value$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivRadialGradientRelativeRadius.Value invoke(@NotNull String str) {
                return DivRadialGradientRelativeRadius.Value.INSTANCE.fromString(str);
            }
        };

        Value(String str) {
            this.value = str;
        }

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        /* renamed from: com.yandex.div2.DivRadialGradientRelativeRadius$Value$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Value value) {
                return value.value;
            }

            public final Value fromString(String str) {
                Value value = Value.NEAREST_CORNER;
                if (Intrinsics.areEqual(str, value.value)) {
                    return value;
                }
                Value value2 = Value.FARTHEST_CORNER;
                if (Intrinsics.areEqual(str, value2.value)) {
                    return value2;
                }
                Value value3 = Value.NEAREST_SIDE;
                if (Intrinsics.areEqual(str, value3.value)) {
                    return value3;
                }
                Value value4 = Value.FARTHEST_SIDE;
                if (Intrinsics.areEqual(str, value4.value)) {
                    return value4;
                }
                return null;
            }
        }
    }
}
