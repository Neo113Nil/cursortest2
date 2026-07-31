package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPoint.kt */
/* loaded from: classes10.dex */
public final class DivPoint implements JSONSerializable, Hashable {
    private Integer _hash;
    public final DivDimension x;
    public final DivDimension y;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPoint$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPoint invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPoint.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivPoint(DivDimension divDimension, DivDimension divDimension2) {
        this.x = divDimension;
        this.y = divDimension2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPoint.class).hashCode() + this.x.hash() + this.y.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivPoint divPoint, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPoint != null && this.x.equals(divPoint.x, expressionResolver, expressionResolver2) && this.y.equals(divPoint.y, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPointJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPointJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPoint.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPoint fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPointJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPointJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
