package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivAppearanceTransitionTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivAppearanceTransitionTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivAppearanceTransitionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAppearanceTransitionTemplate.Companion.invoke$default(DivAppearanceTransitionTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivAppearanceTransitionTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class Set extends DivAppearanceTransitionTemplate {
        private final DivAppearanceSetTransitionTemplate value;

        public Set(DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate) {
            super(null);
            this.value = divAppearanceSetTransitionTemplate;
        }

        public final DivAppearanceSetTransitionTemplate getValue() {
            return this.value;
        }
    }

    private DivAppearanceTransitionTemplate() {
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class Fade extends DivAppearanceTransitionTemplate {
        private final DivFadeTransitionTemplate value;

        public Fade(DivFadeTransitionTemplate divFadeTransitionTemplate) {
            super(null);
            this.value = divFadeTransitionTemplate;
        }

        public final DivFadeTransitionTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class Scale extends DivAppearanceTransitionTemplate {
        private final DivScaleTransitionTemplate value;

        public Scale(DivScaleTransitionTemplate divScaleTransitionTemplate) {
            super(null);
            this.value = divScaleTransitionTemplate;
        }

        public final DivScaleTransitionTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class Slide extends DivAppearanceTransitionTemplate {
        private final DivSlideTransitionTemplate value;

        public Slide(DivSlideTransitionTemplate divSlideTransitionTemplate) {
            super(null);
            this.value = divSlideTransitionTemplate;
        }

        public final DivSlideTransitionTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Set) {
            return ((Set) this).getValue();
        }
        if (this instanceof Fade) {
            return ((Fade) this).getValue();
        }
        if (this instanceof Scale) {
            return ((Scale) this).getValue();
        }
        if (this instanceof Slide) {
            return ((Slide) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAppearanceTransitionJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAppearanceTransitionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivAppearanceTransition resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivAppearanceTransitionJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAppearanceTransitionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Set) {
            return "set";
        }
        if (this instanceof Fade) {
            return "fade";
        }
        if (this instanceof Scale) {
            return "scale";
        }
        if (this instanceof Slide) {
            return "slide";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivAppearanceTransitionTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivAppearanceTransitionTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivAppearanceTransitionJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAppearanceTransitionJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
