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

/* compiled from: DivActionShowTooltipTemplate.kt */
/* loaded from: classes9.dex */
public final class DivActionShowTooltipTemplate implements JSONSerializable, JsonTemplate {
    public final Field id;
    public final Field multiple;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionShowTooltipTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionShowTooltipTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionShowTooltipTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionShowTooltipTemplate(Field field, Field field2) {
        this.id = field;
        this.multiple = field2;
    }

    public /* synthetic */ DivActionShowTooltipTemplate(ParsingEnvironment parsingEnvironment, DivActionShowTooltipTemplate divActionShowTooltipTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionShowTooltipTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionShowTooltipTemplate(ParsingEnvironment parsingEnvironment, DivActionShowTooltipTemplate divActionShowTooltipTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionShowTooltip resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionShowTooltipJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionShowTooltipJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionShowTooltipJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionShowTooltipJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionShowTooltipTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
