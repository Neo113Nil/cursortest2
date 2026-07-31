package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivStrokeStyleTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleTemplate.kt */
/* loaded from: classes13.dex */
public abstract class DivStrokeStyleTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivStrokeStyleTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivStrokeStyleTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivStrokeStyleTemplate.Companion.invoke$default(DivStrokeStyleTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivStrokeStyleTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivStrokeStyleTemplate.kt */
    public static final class Solid extends DivStrokeStyleTemplate {
        private final DivStrokeStyleSolidTemplate value;

        public Solid(DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate) {
            super(null);
            this.value = divStrokeStyleSolidTemplate;
        }

        public final DivStrokeStyleSolidTemplate getValue() {
            return this.value;
        }
    }

    private DivStrokeStyleTemplate() {
    }

    /* compiled from: DivStrokeStyleTemplate.kt */
    public static final class Dashed extends DivStrokeStyleTemplate {
        private final DivStrokeStyleDashedTemplate value;

        public Dashed(DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate) {
            super(null);
            this.value = divStrokeStyleDashedTemplate;
        }

        public final DivStrokeStyleDashedTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Solid) {
            return ((Solid) this).getValue();
        }
        if (this instanceof Dashed) {
            return ((Dashed) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivStrokeStyleJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeStyleJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivStrokeStyle resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivStrokeStyleJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeStyleJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Solid) {
            return "solid";
        }
        if (this instanceof Dashed) {
            return "dashed";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivStrokeStyleTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivStrokeStyleTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivStrokeStyleTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivStrokeStyleJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeStyleJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
