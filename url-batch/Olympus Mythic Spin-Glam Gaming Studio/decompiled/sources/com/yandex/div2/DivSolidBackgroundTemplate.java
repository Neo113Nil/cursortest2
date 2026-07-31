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

/* compiled from: DivSolidBackgroundTemplate.kt */
/* loaded from: classes14.dex */
public final class DivSolidBackgroundTemplate implements JSONSerializable, JsonTemplate {
    public final Field color;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSolidBackgroundTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivSolidBackgroundTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivSolidBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivSolidBackgroundTemplate(Field field) {
        this.color = field;
    }

    public /* synthetic */ DivSolidBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivSolidBackgroundTemplate divSolidBackgroundTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divSolidBackgroundTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivSolidBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivSolidBackgroundTemplate divSolidBackgroundTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivSolidBackground resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivSolidBackgroundJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSolidBackgroundJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSolidBackgroundJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSolidBackgroundJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSolidBackgroundTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
