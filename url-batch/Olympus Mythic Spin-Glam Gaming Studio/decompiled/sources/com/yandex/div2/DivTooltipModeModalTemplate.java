package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTooltipModeModalTemplate.kt */
/* loaded from: classes8.dex */
public final class DivTooltipModeModalTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTooltipModeModalTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTooltipModeModalTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTooltipModeModalTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivTooltipModeModalTemplate() {
    }

    public /* synthetic */ DivTooltipModeModalTemplate(ParsingEnvironment parsingEnvironment, DivTooltipModeModalTemplate divTooltipModeModalTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTooltipModeModalTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivTooltipModeModalTemplate(ParsingEnvironment parsingEnvironment, DivTooltipModeModalTemplate divTooltipModeModalTemplate, boolean z, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTooltipModeModal resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTooltipModeModalJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeModalJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTooltipModeModalJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeModalJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTooltipModeModalTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
