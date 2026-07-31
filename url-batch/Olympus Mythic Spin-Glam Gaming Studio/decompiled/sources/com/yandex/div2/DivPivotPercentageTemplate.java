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

/* compiled from: DivPivotPercentageTemplate.kt */
/* loaded from: classes.dex */
public final class DivPivotPercentageTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPivotPercentageTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPivotPercentageTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPivotPercentageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivPivotPercentageTemplate(Field field) {
        this.value = field;
    }

    public /* synthetic */ DivPivotPercentageTemplate(ParsingEnvironment parsingEnvironment, DivPivotPercentageTemplate divPivotPercentageTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divPivotPercentageTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivPivotPercentageTemplate(ParsingEnvironment parsingEnvironment, DivPivotPercentageTemplate divPivotPercentageTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPivotPercentage resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPivotPercentageJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotPercentageJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPivotPercentageJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotPercentageJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPivotPercentageTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
