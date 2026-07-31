package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputFilterTemplate.kt */
/* loaded from: classes14.dex */
public abstract class DivInputFilterTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputFilterTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputFilterTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputFilterTemplate.Companion.invoke$default(DivInputFilterTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivInputFilterTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivInputFilterTemplate.kt */
    public static final class Regex extends DivInputFilterTemplate {
        private final DivInputFilterRegexTemplate value;

        public Regex(DivInputFilterRegexTemplate divInputFilterRegexTemplate) {
            super(null);
            this.value = divInputFilterRegexTemplate;
        }

        public final DivInputFilterRegexTemplate getValue() {
            return this.value;
        }
    }

    private DivInputFilterTemplate() {
    }

    /* compiled from: DivInputFilterTemplate.kt */
    public static final class Expression extends DivInputFilterTemplate {
        private final DivInputFilterExpressionTemplate value;

        public Expression(DivInputFilterExpressionTemplate divInputFilterExpressionTemplate) {
            super(null);
            this.value = divInputFilterExpressionTemplate;
        }

        public final DivInputFilterExpressionTemplate getValue() {
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
        return ((DivInputFilterJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInputFilter resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInputFilterJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
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

    /* compiled from: DivInputFilterTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivInputFilterTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivInputFilterTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivInputFilterJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
