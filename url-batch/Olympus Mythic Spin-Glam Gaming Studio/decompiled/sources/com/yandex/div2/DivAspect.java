package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAspectJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAspect.kt */
/* loaded from: classes3.dex */
public final class DivAspect implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression ratio;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivAspect$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivAspect invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAspect.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivAspect(Expression expression) {
        this.ratio = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivAspect.class).hashCode() + this.ratio.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivAspect divAspect, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divAspect != null && ((Number) this.ratio.evaluate(expressionResolver)).doubleValue() == ((Number) divAspect.ratio.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAspectJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAspectJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAspect.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivAspect fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivAspectJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAspectJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
