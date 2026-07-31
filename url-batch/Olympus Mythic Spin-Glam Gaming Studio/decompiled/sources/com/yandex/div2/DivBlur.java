package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBlurJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivBlur.kt */
/* loaded from: classes13.dex */
public final class DivBlur implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression radius;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivBlur$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivBlur invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivBlur.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivBlur(Expression expression) {
        this.radius = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivBlur.class).hashCode() + this.radius.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivBlur divBlur, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divBlur != null && ((Number) this.radius.evaluate(expressionResolver)).longValue() == ((Number) divBlur.radius.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivBlurJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBlurJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivBlur.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivBlur fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivBlurJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBlurJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
