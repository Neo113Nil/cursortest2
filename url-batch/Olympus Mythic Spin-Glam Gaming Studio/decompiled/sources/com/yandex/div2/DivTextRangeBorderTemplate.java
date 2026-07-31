package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeBorderJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeBorderTemplate.kt */
/* loaded from: classes13.dex */
public final class DivTextRangeBorderTemplate implements JSONSerializable, JsonTemplate {
    public final Field cornerRadius;
    public final Field stroke;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeBorderTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeBorderTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTextRangeBorderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivTextRangeBorderTemplate(Field field, Field field2) {
        this.cornerRadius = field;
        this.stroke = field2;
    }

    public /* synthetic */ DivTextRangeBorderTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeBorderTemplate divTextRangeBorderTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTextRangeBorderTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivTextRangeBorderTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeBorderTemplate divTextRangeBorderTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTextRangeBorder resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTextRangeBorderJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBorderJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeBorderJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBorderJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeBorderTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
