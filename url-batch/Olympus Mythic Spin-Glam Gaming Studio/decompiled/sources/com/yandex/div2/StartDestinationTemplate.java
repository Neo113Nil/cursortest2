package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: StartDestinationTemplate.kt */
/* loaded from: classes.dex */
public final class StartDestinationTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.StartDestinationTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final StartDestinationTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new StartDestinationTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public StartDestinationTemplate() {
    }

    public /* synthetic */ StartDestinationTemplate(ParsingEnvironment parsingEnvironment, StartDestinationTemplate startDestinationTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : startDestinationTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public StartDestinationTemplate(ParsingEnvironment parsingEnvironment, StartDestinationTemplate startDestinationTemplate, boolean z, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public StartDestination resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((StartDestinationJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getStartDestinationJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((StartDestinationJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getStartDestinationJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: StartDestinationTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
