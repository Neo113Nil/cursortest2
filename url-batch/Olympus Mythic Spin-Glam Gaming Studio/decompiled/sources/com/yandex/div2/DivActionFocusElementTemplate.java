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

/* compiled from: DivActionFocusElementTemplate.kt */
/* loaded from: classes11.dex */
public final class DivActionFocusElementTemplate implements JSONSerializable, JsonTemplate {
    public final Field elementId;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionFocusElementTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionFocusElementTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionFocusElementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionFocusElementTemplate(Field field) {
        this.elementId = field;
    }

    public /* synthetic */ DivActionFocusElementTemplate(ParsingEnvironment parsingEnvironment, DivActionFocusElementTemplate divActionFocusElementTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionFocusElementTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivActionFocusElementTemplate(ParsingEnvironment parsingEnvironment, DivActionFocusElementTemplate divActionFocusElementTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionFocusElement resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionFocusElementJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionFocusElementJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionFocusElementJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionFocusElementJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionFocusElementTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
