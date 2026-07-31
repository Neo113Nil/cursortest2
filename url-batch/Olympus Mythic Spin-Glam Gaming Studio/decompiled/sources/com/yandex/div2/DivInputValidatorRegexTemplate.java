package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidatorRegexJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorRegexTemplate.kt */
/* loaded from: classes9.dex */
public final class DivInputValidatorRegexTemplate implements JSONSerializable, JsonTemplate {
    public final Field allowEmpty;
    public final Field labelId;
    public final Field pattern;
    public final Field variable;
    public static final Companion Companion = new Companion(null);
    private static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputValidatorRegexTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputValidatorRegexTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivInputValidatorRegexTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivInputValidatorRegexTemplate(Field field, Field field2, Field field3, Field field4) {
        this.allowEmpty = field;
        this.labelId = field2;
        this.pattern = field3;
        this.variable = field4;
    }

    public /* synthetic */ DivInputValidatorRegexTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divInputValidatorRegexTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivInputValidatorRegexTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInputValidatorRegex resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInputValidatorRegexJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorRegexJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputValidatorRegexJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorRegexJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputValidatorRegexTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
