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

/* compiled from: DivActionArraySetValueTemplate.kt */
/* loaded from: classes10.dex */
public final class DivActionArraySetValueTemplate implements JSONSerializable, JsonTemplate {
    public final Field index;
    public final Field value;
    public final Field variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionArraySetValueTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionArraySetValueTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionArraySetValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionArraySetValueTemplate(Field field, Field field2, Field field3) {
        this.index = field;
        this.value = field2;
        this.variableName = field3;
    }

    public /* synthetic */ DivActionArraySetValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArraySetValueTemplate divActionArraySetValueTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionArraySetValueTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionArraySetValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArraySetValueTemplate divActionArraySetValueTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionArraySetValue resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionArraySetValueJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArraySetValueJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionArraySetValueJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArraySetValueJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionArraySetValueTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
