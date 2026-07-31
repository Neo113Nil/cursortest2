package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCircleShapeJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCircleShapeTemplate.kt */
/* loaded from: classes12.dex */
public final class DivCircleShapeTemplate implements JSONSerializable, JsonTemplate {
    public final Field backgroundColor;
    public final Field radius;
    public final Field stroke;
    public static final Companion Companion = new Companion(null);
    private static final DivFixedSize RADIUS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(Expression.INSTANCE, 10L, null, 2, null), 1, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCircleShapeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCircleShapeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCircleShapeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivCircleShapeTemplate(Field field, Field field2, Field field3) {
        this.backgroundColor = field;
        this.radius = field2;
        this.stroke = field3;
    }

    public /* synthetic */ DivCircleShapeTemplate(ParsingEnvironment parsingEnvironment, DivCircleShapeTemplate divCircleShapeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divCircleShapeTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivCircleShapeTemplate(ParsingEnvironment parsingEnvironment, DivCircleShapeTemplate divCircleShapeTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivCircleShape resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivCircleShapeJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCircleShapeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCircleShapeJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCircleShapeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCircleShapeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
