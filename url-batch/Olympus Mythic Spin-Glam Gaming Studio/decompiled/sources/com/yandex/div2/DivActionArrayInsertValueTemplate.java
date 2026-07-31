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

/* compiled from: DivActionArrayInsertValueTemplate.kt */
/* loaded from: classes8.dex */
public final class DivActionArrayInsertValueTemplate implements JSONSerializable, JsonTemplate {
    public final Field index;
    public final Field value;
    public final Field variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionArrayInsertValueTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionArrayInsertValueTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionArrayInsertValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionArrayInsertValueTemplate(Field field, Field field2, Field field3) {
        this.index = field;
        this.value = field2;
        this.variableName = field3;
    }

    public /* synthetic */ DivActionArrayInsertValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionArrayInsertValueTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionArrayInsertValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionArrayInsertValue resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionArrayInsertValueJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArrayInsertValueJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionArrayInsertValueJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArrayInsertValueJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionArrayInsertValueTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
