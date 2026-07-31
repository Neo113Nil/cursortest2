package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.IndexDestinationJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: IndexDestination.kt */
/* loaded from: classes4.dex */
public final class IndexDestination implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.IndexDestination$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final IndexDestination invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return IndexDestination.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public IndexDestination(Expression expression) {
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(IndexDestination.class).hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(IndexDestination indexDestination, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return indexDestination != null && ((Number) this.value.evaluate(expressionResolver)).longValue() == ((Number) indexDestination.value.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((IndexDestinationJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getIndexDestinationJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: IndexDestination.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IndexDestination fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((IndexDestinationJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getIndexDestinationJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
