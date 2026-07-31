package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAppearanceSetTransitionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAppearanceSetTransitionTemplate.kt */
/* loaded from: classes11.dex */
public final class DivAppearanceSetTransitionTemplate implements JSONSerializable, JsonTemplate {
    public final Field items;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivAppearanceSetTransitionTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivAppearanceSetTransitionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivAppearanceSetTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivAppearanceSetTransitionTemplate(Field field) {
        this.items = field;
    }

    public /* synthetic */ DivAppearanceSetTransitionTemplate(ParsingEnvironment parsingEnvironment, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divAppearanceSetTransitionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivAppearanceSetTransitionTemplate(ParsingEnvironment parsingEnvironment, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivAppearanceSetTransition resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivAppearanceSetTransitionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAppearanceSetTransitionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAppearanceSetTransitionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAppearanceSetTransitionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAppearanceSetTransitionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
