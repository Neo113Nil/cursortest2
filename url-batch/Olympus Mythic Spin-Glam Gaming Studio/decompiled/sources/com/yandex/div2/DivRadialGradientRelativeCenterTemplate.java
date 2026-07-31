package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenterTemplate.kt */
/* loaded from: classes10.dex */
public final class DivRadialGradientRelativeCenterTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientRelativeCenterTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientRelativeCenterTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivRadialGradientRelativeCenterTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivRadialGradientRelativeCenterTemplate(Field field) {
        this.value = field;
    }

    public /* synthetic */ DivRadialGradientRelativeCenterTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divRadialGradientRelativeCenterTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivRadialGradientRelativeCenterTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivRadialGradientRelativeCenter resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivRadialGradientRelativeCenterJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRelativeCenterJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientRelativeCenterJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRelativeCenterJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientRelativeCenterTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
