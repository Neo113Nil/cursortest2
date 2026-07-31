package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPercentageSizeJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPercentageSizeTemplate.kt */
/* loaded from: classes8.dex */
public final class DivPercentageSizeTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPercentageSizeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPercentageSizeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPercentageSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivPercentageSizeTemplate(Field field) {
        this.value = field;
    }

    public /* synthetic */ DivPercentageSizeTemplate(ParsingEnvironment parsingEnvironment, DivPercentageSizeTemplate divPercentageSizeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divPercentageSizeTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivPercentageSizeTemplate(ParsingEnvironment parsingEnvironment, DivPercentageSizeTemplate divPercentageSizeTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPercentageSize resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPercentageSizeJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPercentageSizeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPercentageSizeJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPercentageSizeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPercentageSizeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
