package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAnimatorTemplate.kt */
/* loaded from: classes13.dex */
public abstract class DivAnimatorTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivAnimatorTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivAnimatorTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAnimatorTemplate.Companion.invoke$default(DivAnimatorTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivAnimatorTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivAnimatorTemplate.kt */
    public static final class Color extends DivAnimatorTemplate {
        private final DivColorAnimatorTemplate value;

        public Color(DivColorAnimatorTemplate divColorAnimatorTemplate) {
            super(null);
            this.value = divColorAnimatorTemplate;
        }

        public final DivColorAnimatorTemplate getValue() {
            return this.value;
        }
    }

    private DivAnimatorTemplate() {
    }

    /* compiled from: DivAnimatorTemplate.kt */
    public static final class Number extends DivAnimatorTemplate {
        private final DivNumberAnimatorTemplate value;

        public Number(DivNumberAnimatorTemplate divNumberAnimatorTemplate) {
            super(null);
            this.value = divNumberAnimatorTemplate;
        }

        public final DivNumberAnimatorTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Color) {
            return ((Color) this).getValue();
        }
        if (this instanceof Number) {
            return ((Number) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAnimatorJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimatorJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivAnimator resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivAnimatorJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimatorJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Color) {
            return "color_animator";
        }
        if (this instanceof Number) {
            return "number_animator";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivAnimatorTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivAnimatorTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivAnimatorTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivAnimatorJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimatorJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
