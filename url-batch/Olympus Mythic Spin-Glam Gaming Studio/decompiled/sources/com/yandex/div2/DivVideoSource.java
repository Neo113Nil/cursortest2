package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivVideoSource;
import com.yandex.div2.DivVideoSourceResolutionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVideoSource.kt */
/* loaded from: classes9.dex */
public final class DivVideoSource implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression bitrate;
    public final Expression mimeType;
    public final Resolution resolution;
    public final Expression url;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivVideoSource$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivVideoSource invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivVideoSource.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivVideoSource(Expression expression, Expression expression2, Resolution resolution, Expression expression3) {
        this.bitrate = expression;
        this.mimeType = expression2;
        this.resolution = resolution;
        this.url = expression3;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivVideoSource.class).hashCode();
        Expression expression = this.bitrate;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.mimeType.hashCode();
        Resolution resolution = this.resolution;
        int hash = hashCode2 + (resolution != null ? resolution.hash() : 0) + this.url.hashCode();
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivVideoSource divVideoSource, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divVideoSource == null) {
            return false;
        }
        Expression expression = this.bitrate;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divVideoSource.bitrate;
        if (!Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null) || !Intrinsics.areEqual(this.mimeType.evaluate(expressionResolver), divVideoSource.mimeType.evaluate(expressionResolver2))) {
            return false;
        }
        Resolution resolution = this.resolution;
        return (resolution != null ? resolution.equals(divVideoSource.resolution, expressionResolver, expressionResolver2) : divVideoSource.resolution == null) && Intrinsics.areEqual(this.url.evaluate(expressionResolver), divVideoSource.url.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivVideoSourceJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoSourceJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivVideoSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivVideoSource fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivVideoSourceJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoSourceJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivVideoSource.kt */
    public static final class Resolution implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Expression height;
        public final Expression width;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivVideoSource$Resolution$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivVideoSource.Resolution invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivVideoSource.Resolution.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public Resolution(Expression expression, Expression expression2) {
            this.height = expression;
            this.width = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Resolution.class).hashCode() + this.height.hashCode() + this.width.hashCode();
            this._hash = Integer.valueOf(hashCode);
            return hashCode;
        }

        public final boolean equals(Resolution resolution, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return resolution != null && ((Number) this.height.evaluate(expressionResolver)).longValue() == ((Number) resolution.height.evaluate(expressionResolver2)).longValue() && ((Number) this.width.evaluate(expressionResolver)).longValue() == ((Number) resolution.width.evaluate(expressionResolver2)).longValue();
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivVideoSourceResolutionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoSourceResolutionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivVideoSource.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Resolution fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivVideoSourceResolutionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoSourceResolutionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
