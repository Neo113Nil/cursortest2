package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBorderJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivBorderTemplate.kt */
/* loaded from: classes12.dex */
public final class DivBorderTemplate implements JSONSerializable, JsonTemplate {
    public final Field cornerRadius;
    public final Field cornersRadius;
    public final Field hasShadow;
    public final Field shadow;
    public final Field stroke;
    public static final Companion Companion = new Companion(null);
    private static final Expression HAS_SHADOW_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivBorderTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivBorderTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivBorderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivBorderTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.cornerRadius = field;
        this.cornersRadius = field2;
        this.hasShadow = field3;
        this.shadow = field4;
        this.stroke = field5;
    }

    public /* synthetic */ DivBorderTemplate(ParsingEnvironment parsingEnvironment, DivBorderTemplate divBorderTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divBorderTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivBorderTemplate(ParsingEnvironment parsingEnvironment, DivBorderTemplate divBorderTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivBorder resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivBorderJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBorderJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivBorderJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBorderJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivBorderTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
