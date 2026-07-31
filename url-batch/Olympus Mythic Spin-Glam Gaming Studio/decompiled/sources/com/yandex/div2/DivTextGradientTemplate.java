package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextGradientTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextGradientTemplate.kt */
/* loaded from: classes14.dex */
public abstract class DivTextGradientTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextGradientTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextGradientTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextGradientTemplate.Companion.invoke$default(DivTextGradientTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivTextGradientTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTextGradientTemplate.kt */
    public static final class Linear extends DivTextGradientTemplate {
        private final DivLinearGradientTemplate value;

        public Linear(DivLinearGradientTemplate divLinearGradientTemplate) {
            super(null);
            this.value = divLinearGradientTemplate;
        }

        public final DivLinearGradientTemplate getValue() {
            return this.value;
        }
    }

    private DivTextGradientTemplate() {
    }

    /* compiled from: DivTextGradientTemplate.kt */
    public static final class Radial extends DivTextGradientTemplate {
        private final DivRadialGradientTemplate value;

        public Radial(DivRadialGradientTemplate divRadialGradientTemplate) {
            super(null);
            this.value = divRadialGradientTemplate;
        }

        public final DivRadialGradientTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Linear) {
            return ((Linear) this).getValue();
        }
        if (this instanceof Radial) {
            return ((Radial) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextGradientJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextGradientJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTextGradient resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTextGradientJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextGradientJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Linear) {
            return "gradient";
        }
        if (this instanceof Radial) {
            return "radial_gradient";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivTextGradientTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivTextGradientTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivTextGradientTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivTextGradientJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextGradientJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
