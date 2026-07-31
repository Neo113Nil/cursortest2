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

/* compiled from: DivNinePatchBackground.kt */
/* loaded from: classes10.dex */
public final class DivNinePatchBackground implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression imageUrl;
    public final DivAbsoluteEdgeInsets insets;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivNinePatchBackground$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivNinePatchBackground invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivNinePatchBackground.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivNinePatchBackground(Expression expression, DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) {
        this.imageUrl = expression;
        this.insets = divAbsoluteEdgeInsets;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivNinePatchBackground.class).hashCode() + this.imageUrl.hashCode() + this.insets.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivNinePatchBackground divNinePatchBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divNinePatchBackground != null && Intrinsics.areEqual(this.imageUrl.evaluate(expressionResolver), divNinePatchBackground.imageUrl.evaluate(expressionResolver2)) && this.insets.equals(divNinePatchBackground.insets, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivNinePatchBackgroundJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNinePatchBackgroundJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivNinePatchBackground.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivNinePatchBackground fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivNinePatchBackgroundJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNinePatchBackgroundJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
