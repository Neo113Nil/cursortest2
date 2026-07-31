package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientRadiusTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusTemplate.kt */
/* loaded from: classes10.dex */
public abstract class DivRadialGradientRadiusTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientRadiusTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientRadiusTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientRadiusTemplate.Companion.invoke$default(DivRadialGradientRadiusTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivRadialGradientRadiusTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class FixedSize extends DivRadialGradientRadiusTemplate {
        private final DivFixedSizeTemplate value;

        public FixedSize(DivFixedSizeTemplate divFixedSizeTemplate) {
            super(null);
            this.value = divFixedSizeTemplate;
        }

        public final DivFixedSizeTemplate getValue() {
            return this.value;
        }
    }

    private DivRadialGradientRadiusTemplate() {
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class Relative extends DivRadialGradientRadiusTemplate {
        private final DivRadialGradientRelativeRadiusTemplate value;

        public Relative(DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate) {
            super(null);
            this.value = divRadialGradientRelativeRadiusTemplate;
        }

        public final DivRadialGradientRelativeRadiusTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof FixedSize) {
            return ((FixedSize) this).getValue();
        }
        if (this instanceof Relative) {
            return ((Relative) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientRadiusJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRadiusJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivRadialGradientRadius resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivRadialGradientRadiusJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRadiusJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof FixedSize) {
            return "fixed";
        }
        if (this instanceof Relative) {
            return Constants.PATH_TYPE_RELATIVE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivRadialGradientRadiusTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivRadialGradientRadiusTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivRadialGradientRadiusJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRadiusJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
