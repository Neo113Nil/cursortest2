package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskTemplate.kt */
/* loaded from: classes15.dex */
public abstract class DivTextRangeMaskTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeMaskTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeMaskTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeMaskTemplate.Companion.invoke$default(DivTextRangeMaskTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivTextRangeMaskTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTextRangeMaskTemplate.kt */
    public static final class Particles extends DivTextRangeMaskTemplate {
        private final DivTextRangeMaskParticlesTemplate value;

        public Particles(DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate) {
            super(null);
            this.value = divTextRangeMaskParticlesTemplate;
        }

        public final DivTextRangeMaskParticlesTemplate getValue() {
            return this.value;
        }
    }

    private DivTextRangeMaskTemplate() {
    }

    /* compiled from: DivTextRangeMaskTemplate.kt */
    public static final class Solid extends DivTextRangeMaskTemplate {
        private final DivTextRangeMaskSolidTemplate value;

        public Solid(DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate) {
            super(null);
            this.value = divTextRangeMaskSolidTemplate;
        }

        public final DivTextRangeMaskSolidTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Particles) {
            return ((Particles) this).getValue();
        }
        if (this instanceof Solid) {
            return ((Solid) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeMaskJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTextRangeMask resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTextRangeMaskJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Particles) {
            return "particles";
        }
        if (this instanceof Solid) {
            return "solid";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivTextRangeMaskTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivTextRangeMaskTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivTextRangeMaskTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivTextRangeMaskJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
