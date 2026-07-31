package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: StrVariableTemplate.kt */
/* loaded from: classes10.dex */
public final class StrVariableTemplate implements JSONSerializable, JsonTemplate {
    public final Field name;
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.StrVariableTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final StrVariableTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new StrVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public StrVariableTemplate(Field field, Field field2) {
        this.name = field;
        this.value = field2;
    }

    public /* synthetic */ StrVariableTemplate(ParsingEnvironment parsingEnvironment, StrVariableTemplate strVariableTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : strVariableTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StrVariableTemplate(ParsingEnvironment parsingEnvironment, StrVariableTemplate strVariableTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public StrVariable resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((StrVariableJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getStrVariableJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((StrVariableJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getStrVariableJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: StrVariableTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
