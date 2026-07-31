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

/* compiled from: DivCurrencyInputMaskTemplate.kt */
/* loaded from: classes3.dex */
public final class DivCurrencyInputMaskTemplate implements JSONSerializable, JsonTemplate {
    public final Field locale;
    public final Field rawTextVariable;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCurrencyInputMaskTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCurrencyInputMaskTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCurrencyInputMaskTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivCurrencyInputMaskTemplate(Field field, Field field2) {
        this.locale = field;
        this.rawTextVariable = field2;
    }

    public /* synthetic */ DivCurrencyInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divCurrencyInputMaskTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivCurrencyInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivCurrencyInputMask resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivCurrencyInputMaskJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCurrencyInputMaskJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCurrencyInputMaskJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCurrencyInputMaskJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCurrencyInputMaskTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
