package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivIndicatorItemPlacementTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementTemplate.kt */
/* loaded from: classes10.dex */
public abstract class DivIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivIndicatorItemPlacementTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivIndicatorItemPlacementTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivIndicatorItemPlacementTemplate.Companion.invoke$default(DivIndicatorItemPlacementTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivIndicatorItemPlacementTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class Default extends DivIndicatorItemPlacementTemplate {
        private final DivDefaultIndicatorItemPlacementTemplate value;

        public Default(DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate) {
            super(null);
            this.value = divDefaultIndicatorItemPlacementTemplate;
        }

        public final DivDefaultIndicatorItemPlacementTemplate getValue() {
            return this.value;
        }
    }

    private DivIndicatorItemPlacementTemplate() {
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class Stretch extends DivIndicatorItemPlacementTemplate {
        private final DivStretchIndicatorItemPlacementTemplate value;

        public Stretch(DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate) {
            super(null);
            this.value = divStretchIndicatorItemPlacementTemplate;
        }

        public final DivStretchIndicatorItemPlacementTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Default) {
            return ((Default) this).getValue();
        }
        if (this instanceof Stretch) {
            return ((Stretch) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivIndicatorItemPlacementJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorItemPlacementJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivIndicatorItemPlacement resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivIndicatorItemPlacementJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorItemPlacementJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Default) {
            return "default";
        }
        if (this instanceof Stretch) {
            return "stretch";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivIndicatorItemPlacementTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivIndicatorItemPlacementTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivIndicatorItemPlacementJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorItemPlacementJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
