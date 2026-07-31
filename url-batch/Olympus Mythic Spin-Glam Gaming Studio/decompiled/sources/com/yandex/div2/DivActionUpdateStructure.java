package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionUpdateStructureJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionUpdateStructure.kt */
/* loaded from: classes14.dex */
public final class DivActionUpdateStructure implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression path;
    public final DivTypedValue value;
    public final Expression variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionUpdateStructure$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionUpdateStructure invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionUpdateStructure.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionUpdateStructure(Expression expression, DivTypedValue divTypedValue, Expression expression2) {
        this.path = expression;
        this.value = divTypedValue;
        this.variableName = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionUpdateStructure.class).hashCode() + this.path.hashCode() + this.value.hash() + this.variableName.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionUpdateStructure divActionUpdateStructure, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionUpdateStructure != null && Intrinsics.areEqual(this.path.evaluate(expressionResolver), divActionUpdateStructure.path.evaluate(expressionResolver2)) && this.value.equals(divActionUpdateStructure.value, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.variableName.evaluate(expressionResolver), divActionUpdateStructure.variableName.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionUpdateStructureJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionUpdateStructureJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionUpdateStructure.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionUpdateStructure fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionUpdateStructureJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionUpdateStructureJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
