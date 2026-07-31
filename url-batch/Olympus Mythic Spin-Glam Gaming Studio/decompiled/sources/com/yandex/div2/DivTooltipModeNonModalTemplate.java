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

/* compiled from: DivTooltipModeNonModalTemplate.kt */
/* loaded from: classes13.dex */
public final class DivTooltipModeNonModalTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTooltipModeNonModalTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTooltipModeNonModalTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTooltipModeNonModalTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivTooltipModeNonModalTemplate() {
    }

    public /* synthetic */ DivTooltipModeNonModalTemplate(ParsingEnvironment parsingEnvironment, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTooltipModeNonModalTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivTooltipModeNonModalTemplate(ParsingEnvironment parsingEnvironment, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, boolean z, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTooltipModeNonModal resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTooltipModeNonModalJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeNonModalJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTooltipModeNonModalJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeNonModalJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTooltipModeNonModalTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
