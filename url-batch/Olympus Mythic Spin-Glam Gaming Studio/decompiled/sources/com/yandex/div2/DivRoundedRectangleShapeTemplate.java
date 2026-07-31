package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRoundedRectangleShapeJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRoundedRectangleShapeTemplate.kt */
/* loaded from: classes15.dex */
public final class DivRoundedRectangleShapeTemplate implements JSONSerializable, JsonTemplate {
    private static final DivFixedSize CORNER_RADIUS_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivFixedSize ITEM_HEIGHT_DEFAULT_VALUE;
    private static final DivFixedSize ITEM_WIDTH_DEFAULT_VALUE;
    public final Field backgroundColor;
    public final Field cornerRadius;
    public final Field itemHeight;
    public final Field itemWidth;
    public final Field stroke;

    public DivRoundedRectangleShapeTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.backgroundColor = field;
        this.cornerRadius = field2;
        this.itemHeight = field3;
        this.itemWidth = field4;
        this.stroke = field5;
    }

    public /* synthetic */ DivRoundedRectangleShapeTemplate(ParsingEnvironment parsingEnvironment, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divRoundedRectangleShapeTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivRoundedRectangleShapeTemplate(ParsingEnvironment parsingEnvironment, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivRoundedRectangleShape resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivRoundedRectangleShapeJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRoundedRectangleShapeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRoundedRectangleShapeJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRoundedRectangleShapeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRoundedRectangleShapeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        CORNER_RADIUS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        ITEM_HEIGHT_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        ITEM_WIDTH_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivRoundedRectangleShapeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivRoundedRectangleShapeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
