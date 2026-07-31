package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientFixedCenterJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientFixedCenterTemplate.kt */
/* loaded from: classes12.dex */
public final class DivRadialGradientFixedCenterTemplate implements JSONSerializable, JsonTemplate {
    public final Field unit;
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Expression UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivSizeUnit.DP, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientFixedCenterTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientFixedCenterTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivRadialGradientFixedCenterTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivRadialGradientFixedCenterTemplate(Field field, Field field2) {
        this.unit = field;
        this.value = field2;
    }

    public /* synthetic */ DivRadialGradientFixedCenterTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divRadialGradientFixedCenterTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivRadialGradientFixedCenterTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivRadialGradientFixedCenter resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivRadialGradientFixedCenterJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientFixedCenterJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientFixedCenterJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientFixedCenterJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientFixedCenterTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
