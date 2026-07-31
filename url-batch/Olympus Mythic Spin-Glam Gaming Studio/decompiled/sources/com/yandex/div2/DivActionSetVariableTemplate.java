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

/* compiled from: DivActionSetVariableTemplate.kt */
/* loaded from: classes3.dex */
public final class DivActionSetVariableTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public final Field variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSetVariableTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionSetVariableTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionSetVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionSetVariableTemplate(Field field, Field field2) {
        this.value = field;
        this.variableName = field2;
    }

    public /* synthetic */ DivActionSetVariableTemplate(ParsingEnvironment parsingEnvironment, DivActionSetVariableTemplate divActionSetVariableTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionSetVariableTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionSetVariableTemplate(ParsingEnvironment parsingEnvironment, DivActionSetVariableTemplate divActionSetVariableTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionSetVariable resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionSetVariableJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetVariableJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionSetVariableJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetVariableJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionSetVariableTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
