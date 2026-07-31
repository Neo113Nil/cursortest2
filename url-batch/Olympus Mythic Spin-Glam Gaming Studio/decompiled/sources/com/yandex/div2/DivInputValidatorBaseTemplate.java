package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidatorBaseJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorBaseTemplate.kt */
/* loaded from: classes10.dex */
public final class DivInputValidatorBaseTemplate implements JSONSerializable, JsonTemplate {
    public final Field allowEmpty;
    public final Field labelId;
    public final Field variable;
    public static final Companion Companion = new Companion(null);
    private static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputValidatorBaseTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputValidatorBaseTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivInputValidatorBaseTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivInputValidatorBaseTemplate(Field field, Field field2, Field field3) {
        this.allowEmpty = field;
        this.labelId = field2;
        this.variable = field3;
    }

    public /* synthetic */ DivInputValidatorBaseTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divInputValidatorBaseTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivInputValidatorBaseTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInputValidatorBase resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInputValidatorBaseJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorBaseJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputValidatorBaseJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorBaseJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputValidatorBaseTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
