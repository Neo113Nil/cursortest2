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

/* compiled from: DivActionSetStoredValueTemplate.kt */
/* loaded from: classes15.dex */
public final class DivActionSetStoredValueTemplate implements JSONSerializable, JsonTemplate {
    public final Field lifetime;
    public final Field name;
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSetStoredValueTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionSetStoredValueTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionSetStoredValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionSetStoredValueTemplate(Field field, Field field2, Field field3) {
        this.lifetime = field;
        this.name = field2;
        this.value = field3;
    }

    public /* synthetic */ DivActionSetStoredValueTemplate(ParsingEnvironment parsingEnvironment, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionSetStoredValueTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionSetStoredValueTemplate(ParsingEnvironment parsingEnvironment, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionSetStoredValue resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionSetStoredValueJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetStoredValueJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionSetStoredValueJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetStoredValueJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionSetStoredValueTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
