package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeMaskBaseJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskBaseTemplate.kt */
/* loaded from: classes11.dex */
public final class DivTextRangeMaskBaseTemplate implements JSONSerializable, JsonTemplate {
    public final Field isEnabled;
    public static final Companion Companion = new Companion(null);
    private static final Expression IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeMaskBaseTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeMaskBaseTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTextRangeMaskBaseTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivTextRangeMaskBaseTemplate(Field field) {
        this.isEnabled = field;
    }

    public /* synthetic */ DivTextRangeMaskBaseTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTextRangeMaskBaseTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivTextRangeMaskBaseTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTextRangeMaskBase resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTextRangeMaskBaseJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskBaseJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeMaskBaseJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskBaseJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeMaskBaseTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
