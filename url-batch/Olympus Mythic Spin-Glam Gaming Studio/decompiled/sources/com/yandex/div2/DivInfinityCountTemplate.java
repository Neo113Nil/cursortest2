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

/* compiled from: DivInfinityCountTemplate.kt */
/* loaded from: classes3.dex */
public final class DivInfinityCountTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInfinityCountTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInfinityCountTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivInfinityCountTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivInfinityCountTemplate() {
    }

    public /* synthetic */ DivInfinityCountTemplate(ParsingEnvironment parsingEnvironment, DivInfinityCountTemplate divInfinityCountTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divInfinityCountTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivInfinityCountTemplate(ParsingEnvironment parsingEnvironment, DivInfinityCountTemplate divInfinityCountTemplate, boolean z, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInfinityCount resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInfinityCountJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInfinityCountJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInfinityCountJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInfinityCountJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInfinityCountTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
