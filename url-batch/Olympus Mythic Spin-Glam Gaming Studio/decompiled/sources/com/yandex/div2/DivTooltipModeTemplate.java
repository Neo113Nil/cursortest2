package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTooltipModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTooltipModeTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivTooltipModeTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTooltipModeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTooltipModeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTooltipModeTemplate.Companion.invoke$default(DivTooltipModeTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivTooltipModeTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTooltipModeTemplate.kt */
    public static final class NonModal extends DivTooltipModeTemplate {
        private final DivTooltipModeNonModalTemplate value;

        public NonModal(DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate) {
            super(null);
            this.value = divTooltipModeNonModalTemplate;
        }

        public final DivTooltipModeNonModalTemplate getValue() {
            return this.value;
        }
    }

    private DivTooltipModeTemplate() {
    }

    /* compiled from: DivTooltipModeTemplate.kt */
    public static final class Modal extends DivTooltipModeTemplate {
        private final DivTooltipModeModalTemplate value;

        public Modal(DivTooltipModeModalTemplate divTooltipModeModalTemplate) {
            super(null);
            this.value = divTooltipModeModalTemplate;
        }

        public final DivTooltipModeModalTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof NonModal) {
            return ((NonModal) this).getValue();
        }
        if (this instanceof Modal) {
            return ((Modal) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTooltipModeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTooltipMode resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTooltipModeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof NonModal) {
            return "non_modal";
        }
        if (this instanceof Modal) {
            return "modal";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivTooltipModeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivTooltipModeTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivTooltipModeTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivTooltipModeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
