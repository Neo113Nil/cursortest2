package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.OffsetDestinationJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: OffsetDestinationTemplate.kt */
/* loaded from: classes11.dex */
public final class OffsetDestinationTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.OffsetDestinationTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final OffsetDestinationTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new OffsetDestinationTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public OffsetDestinationTemplate(Field field) {
        this.value = field;
    }

    public /* synthetic */ OffsetDestinationTemplate(ParsingEnvironment parsingEnvironment, OffsetDestinationTemplate offsetDestinationTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : offsetDestinationTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public OffsetDestinationTemplate(ParsingEnvironment parsingEnvironment, OffsetDestinationTemplate offsetDestinationTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public OffsetDestination resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((OffsetDestinationJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getOffsetDestinationJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((OffsetDestinationJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getOffsetDestinationJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: OffsetDestinationTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
