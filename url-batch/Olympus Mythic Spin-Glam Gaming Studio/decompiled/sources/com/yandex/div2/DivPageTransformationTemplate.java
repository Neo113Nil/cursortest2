package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPageTransformationTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPageTransformationTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivPageTransformationTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPageTransformationTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPageTransformationTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPageTransformationTemplate.Companion.invoke$default(DivPageTransformationTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivPageTransformationTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivPageTransformationTemplate.kt */
    public static final class Slide extends DivPageTransformationTemplate {
        private final DivPageTransformationSlideTemplate value;

        public Slide(DivPageTransformationSlideTemplate divPageTransformationSlideTemplate) {
            super(null);
            this.value = divPageTransformationSlideTemplate;
        }

        public final DivPageTransformationSlideTemplate getValue() {
            return this.value;
        }
    }

    private DivPageTransformationTemplate() {
    }

    /* compiled from: DivPageTransformationTemplate.kt */
    public static final class Overlap extends DivPageTransformationTemplate {
        private final DivPageTransformationOverlapTemplate value;

        public Overlap(DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate) {
            super(null);
            this.value = divPageTransformationOverlapTemplate;
        }

        public final DivPageTransformationOverlapTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Slide) {
            return ((Slide) this).getValue();
        }
        if (this instanceof Overlap) {
            return ((Overlap) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPageTransformationJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPageTransformation resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPageTransformationJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Slide) {
            return "slide";
        }
        if (this instanceof Overlap) {
            return "overlap";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivPageTransformationTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivPageTransformationTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivPageTransformationTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivPageTransformationJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
