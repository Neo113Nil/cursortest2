package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidatorExpressionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorExpressionTemplate.kt */
/* loaded from: classes11.dex */
public final class DivInputValidatorExpressionTemplate implements JSONSerializable, JsonTemplate {
    public final Field allowEmpty;
    public final Field condition;
    public final Field labelId;
    public final Field variable;
    public static final Companion Companion = new Companion(null);
    private static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputValidatorExpressionTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputValidatorExpressionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivInputValidatorExpressionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivInputValidatorExpressionTemplate(Field field, Field field2, Field field3, Field field4) {
        this.allowEmpty = field;
        this.condition = field2;
        this.labelId = field3;
        this.variable = field4;
    }

    public /* synthetic */ DivInputValidatorExpressionTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divInputValidatorExpressionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivInputValidatorExpressionTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInputValidatorExpression resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInputValidatorExpressionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorExpressionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputValidatorExpressionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorExpressionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
