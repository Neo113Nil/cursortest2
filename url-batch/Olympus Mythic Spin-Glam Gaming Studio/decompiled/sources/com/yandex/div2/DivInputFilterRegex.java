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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputFilterRegex.kt */
/* loaded from: classes9.dex */
public final class DivInputFilterRegex implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression pattern;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputFilterRegex$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputFilterRegex invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputFilterRegex.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivInputFilterRegex(Expression expression) {
        this.pattern = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivInputFilterRegex.class).hashCode() + this.pattern.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivInputFilterRegex divInputFilterRegex, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divInputFilterRegex == null) {
            return false;
        }
        return Intrinsics.areEqual(this.pattern.evaluate(expressionResolver), divInputFilterRegex.pattern.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputFilterRegexJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterRegexJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputFilterRegex.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInputFilterRegex fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputFilterRegexJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterRegexJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
