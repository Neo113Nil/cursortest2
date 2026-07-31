package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorTemplate.kt */
/* loaded from: classes14.dex */
public abstract class DivInputValidatorTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputValidatorTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputValidatorTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidatorTemplate.Companion.invoke$default(DivInputValidatorTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivInputValidatorTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    public static final class Regex extends DivInputValidatorTemplate {
        private final DivInputValidatorRegexTemplate value;

        public Regex(DivInputValidatorRegexTemplate divInputValidatorRegexTemplate) {
            super(null);
            this.value = divInputValidatorRegexTemplate;
        }

        public final DivInputValidatorRegexTemplate getValue() {
            return this.value;
        }
    }

    private DivInputValidatorTemplate() {
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    public static final class Expression extends DivInputValidatorTemplate {
        private final DivInputValidatorExpressionTemplate value;

        public Expression(DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate) {
            super(null);
            this.value = divInputValidatorExpressionTemplate;
        }

        public final DivInputValidatorExpressionTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Regex) {
            return ((Regex) this).getValue();
        }
        if (this instanceof Expression) {
            return ((Expression) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputValidatorJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInputValidator resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInputValidatorJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Regex) {
            return "regex";
        }
        if (this instanceof Expression) {
            return "expression";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivInputValidatorTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivInputValidatorTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivInputValidatorJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
