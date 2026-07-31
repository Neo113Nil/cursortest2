package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivBackgroundTemplate.kt */
/* loaded from: classes10.dex */
public abstract class DivBackgroundTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivBackgroundTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivBackgroundTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivBackgroundTemplate.Companion.invoke$default(DivBackgroundTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivBackgroundTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class LinearGradient extends DivBackgroundTemplate {
        private final DivLinearGradientTemplate value;

        public LinearGradient(DivLinearGradientTemplate divLinearGradientTemplate) {
            super(null);
            this.value = divLinearGradientTemplate;
        }

        public final DivLinearGradientTemplate getValue() {
            return this.value;
        }
    }

    private DivBackgroundTemplate() {
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class RadialGradient extends DivBackgroundTemplate {
        private final DivRadialGradientTemplate value;

        public RadialGradient(DivRadialGradientTemplate divRadialGradientTemplate) {
            super(null);
            this.value = divRadialGradientTemplate;
        }

        public final DivRadialGradientTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class Image extends DivBackgroundTemplate {
        private final DivImageBackgroundTemplate value;

        public Image(DivImageBackgroundTemplate divImageBackgroundTemplate) {
            super(null);
            this.value = divImageBackgroundTemplate;
        }

        public final DivImageBackgroundTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class Solid extends DivBackgroundTemplate {
        private final DivSolidBackgroundTemplate value;

        public Solid(DivSolidBackgroundTemplate divSolidBackgroundTemplate) {
            super(null);
            this.value = divSolidBackgroundTemplate;
        }

        public final DivSolidBackgroundTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class NinePatch extends DivBackgroundTemplate {
        private final DivNinePatchBackgroundTemplate value;

        public NinePatch(DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate) {
            super(null);
            this.value = divNinePatchBackgroundTemplate;
        }

        public final DivNinePatchBackgroundTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof LinearGradient) {
            return ((LinearGradient) this).getValue();
        }
        if (this instanceof RadialGradient) {
            return ((RadialGradient) this).getValue();
        }
        if (this instanceof Image) {
            return ((Image) this).getValue();
        }
        if (this instanceof Solid) {
            return ((Solid) this).getValue();
        }
        if (this instanceof NinePatch) {
            return ((NinePatch) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivBackgroundJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBackgroundJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivBackground resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivBackgroundJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBackgroundJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof LinearGradient) {
            return "gradient";
        }
        if (this instanceof RadialGradient) {
            return "radial_gradient";
        }
        if (this instanceof Image) {
            return "image";
        }
        if (this instanceof Solid) {
            return "solid";
        }
        if (this instanceof NinePatch) {
            return "nine_patch_image";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivBackgroundTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivBackgroundTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivBackgroundJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBackgroundJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
