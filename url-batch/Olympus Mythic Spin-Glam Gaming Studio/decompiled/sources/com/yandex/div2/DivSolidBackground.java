package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSolidBackground.kt */
/* loaded from: classes10.dex */
public final class DivSolidBackground implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression color;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSolidBackground$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivSolidBackground invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivSolidBackground.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivSolidBackground(Expression expression) {
        this.color = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivSolidBackground.class).hashCode() + this.color.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivSolidBackground divSolidBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divSolidBackground != null && ((Number) this.color.evaluate(expressionResolver)).intValue() == ((Number) divSolidBackground.color.evaluate(expressionResolver2)).intValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSolidBackgroundJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSolidBackgroundJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSolidBackground.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivSolidBackground fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSolidBackgroundJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSolidBackgroundJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
