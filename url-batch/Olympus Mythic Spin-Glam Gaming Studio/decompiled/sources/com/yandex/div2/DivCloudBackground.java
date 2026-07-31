package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCloudBackgroundJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCloudBackground.kt */
/* loaded from: classes.dex */
public final class DivCloudBackground implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression color;
    public final Expression cornerRadius;
    public final DivEdgeInsets paddings;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCloudBackground$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCloudBackground invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCloudBackground.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivCloudBackground(Expression expression, Expression expression2, DivEdgeInsets divEdgeInsets) {
        this.color = expression;
        this.cornerRadius = expression2;
        this.paddings = divEdgeInsets;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivCloudBackground.class).hashCode() + this.color.hashCode() + this.cornerRadius.hashCode();
        DivEdgeInsets divEdgeInsets = this.paddings;
        int hash = hashCode + (divEdgeInsets != null ? divEdgeInsets.hash() : 0);
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivCloudBackground divCloudBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCloudBackground == null || ((Number) this.color.evaluate(expressionResolver)).intValue() != ((Number) divCloudBackground.color.evaluate(expressionResolver2)).intValue() || ((Number) this.cornerRadius.evaluate(expressionResolver)).longValue() != ((Number) divCloudBackground.cornerRadius.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        DivEdgeInsets divEdgeInsets = this.paddings;
        DivEdgeInsets divEdgeInsets2 = divCloudBackground.paddings;
        return divEdgeInsets != null ? divEdgeInsets.equals(divEdgeInsets2, expressionResolver, expressionResolver2) : divEdgeInsets2 == null;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCloudBackgroundJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCloudBackgroundJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCloudBackground.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivCloudBackground fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivCloudBackgroundJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCloudBackgroundJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
