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

/* compiled from: ArrayVariableTemplate.kt */
/* loaded from: classes4.dex */
public final class ArrayVariableTemplate implements JSONSerializable, JsonTemplate {
    public final Field name;
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.ArrayVariableTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ArrayVariableTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new ArrayVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public ArrayVariableTemplate(Field field, Field field2) {
        this.name = field;
        this.value = field2;
    }

    public /* synthetic */ ArrayVariableTemplate(ParsingEnvironment parsingEnvironment, ArrayVariableTemplate arrayVariableTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : arrayVariableTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayVariableTemplate(ParsingEnvironment parsingEnvironment, ArrayVariableTemplate arrayVariableTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public ArrayVariable resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((ArrayVariableJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getArrayVariableJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ArrayVariableJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getArrayVariableJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: ArrayVariableTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
