package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDefaultIndicatorItemPlacementJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
/* loaded from: classes13.dex */
public final class DivDefaultIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate {
    public final Field spaceBetweenCenters;
    public static final Companion Companion = new Companion(null);
    private static final DivFixedSize SPACE_BETWEEN_CENTERS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(Expression.INSTANCE, 15L, null, 2, null), 1, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacementTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivDefaultIndicatorItemPlacementTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivDefaultIndicatorItemPlacementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivDefaultIndicatorItemPlacementTemplate(Field field) {
        this.spaceBetweenCenters = field;
    }

    public /* synthetic */ DivDefaultIndicatorItemPlacementTemplate(ParsingEnvironment parsingEnvironment, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divDefaultIndicatorItemPlacementTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivDefaultIndicatorItemPlacementTemplate(ParsingEnvironment parsingEnvironment, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivDefaultIndicatorItemPlacement resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivDefaultIndicatorItemPlacementJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDefaultIndicatorItemPlacementJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDefaultIndicatorItemPlacementJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDefaultIndicatorItemPlacementJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
