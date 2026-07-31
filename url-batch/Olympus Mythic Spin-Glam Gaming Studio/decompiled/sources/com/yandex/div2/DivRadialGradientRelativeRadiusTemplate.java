package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
/* loaded from: classes11.dex */
public final class DivRadialGradientRelativeRadiusTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientRelativeRadiusTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivRadialGradientRelativeRadiusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivRadialGradientRelativeRadiusTemplate(Field field) {
        this.value = field;
    }

    public /* synthetic */ DivRadialGradientRelativeRadiusTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divRadialGradientRelativeRadiusTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivRadialGradientRelativeRadiusTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivRadialGradientRelativeRadius resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivRadialGradientRelativeRadiusJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRelativeRadiusJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientRelativeRadiusJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRelativeRadiusJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
