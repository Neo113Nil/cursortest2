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

/* compiled from: ArrayValueTemplate.kt */
/* loaded from: classes13.dex */
public final class ArrayValueTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.ArrayValueTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ArrayValueTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new ArrayValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public ArrayValueTemplate(Field field) {
        this.value = field;
    }

    public /* synthetic */ ArrayValueTemplate(ParsingEnvironment parsingEnvironment, ArrayValueTemplate arrayValueTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : arrayValueTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public ArrayValueTemplate(ParsingEnvironment parsingEnvironment, ArrayValueTemplate arrayValueTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public ArrayValue resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((ArrayValueJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getArrayValueJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ArrayValueJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getArrayValueJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: ArrayValueTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
