package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFunctionArgument.kt */
/* loaded from: classes6.dex */
public final class DivFunctionArgument implements JSONSerializable, Hashable {
    private Integer _hash;
    public final String name;
    public final DivEvaluableType type;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFunctionArgument$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFunctionArgument invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFunctionArgument.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivFunctionArgument(String str, DivEvaluableType divEvaluableType) {
        this.name = str;
        this.type = divEvaluableType;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivFunctionArgument.class).hashCode() + this.name.hashCode() + this.type.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivFunctionArgument divFunctionArgument, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divFunctionArgument != null && Intrinsics.areEqual(this.name, divFunctionArgument.name) && this.type == divFunctionArgument.type;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFunctionArgumentJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFunctionArgumentJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFunctionArgument.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivFunctionArgument fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFunctionArgumentJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFunctionArgumentJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
