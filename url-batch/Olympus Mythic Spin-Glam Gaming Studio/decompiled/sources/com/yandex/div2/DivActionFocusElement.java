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

/* compiled from: DivActionFocusElement.kt */
/* loaded from: classes13.dex */
public final class DivActionFocusElement implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression elementId;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionFocusElement$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionFocusElement invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionFocusElement.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionFocusElement(Expression expression) {
        this.elementId = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionFocusElement.class).hashCode() + this.elementId.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionFocusElement divActionFocusElement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionFocusElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.elementId.evaluate(expressionResolver), divActionFocusElement.elementId.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionFocusElementJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionFocusElementJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionFocusElement.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionFocusElement fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionFocusElementJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionFocusElementJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
