package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBlurJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivBlurTemplate.kt */
/* loaded from: classes11.dex */
public final class DivBlurTemplate implements JSONSerializable, JsonTemplate {
    public final Field radius;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivBlurTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivBlurTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivBlurTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivBlurTemplate(Field field) {
        this.radius = field;
    }

    public /* synthetic */ DivBlurTemplate(ParsingEnvironment parsingEnvironment, DivBlurTemplate divBlurTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divBlurTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivBlurTemplate(ParsingEnvironment parsingEnvironment, DivBlurTemplate divBlurTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivBlur resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivBlurJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBlurJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivBlurJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBlurJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivBlurTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
