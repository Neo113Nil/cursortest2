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

/* compiled from: DivActionClearFocusTemplate.kt */
/* loaded from: classes3.dex */
public final class DivActionClearFocusTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionClearFocusTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionClearFocusTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionClearFocusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionClearFocusTemplate() {
    }

    public /* synthetic */ DivActionClearFocusTemplate(ParsingEnvironment parsingEnvironment, DivActionClearFocusTemplate divActionClearFocusTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionClearFocusTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivActionClearFocusTemplate(ParsingEnvironment parsingEnvironment, DivActionClearFocusTemplate divActionClearFocusTemplate, boolean z, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionClearFocus resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionClearFocusJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionClearFocusJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionClearFocusJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionClearFocusJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionClearFocusTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
