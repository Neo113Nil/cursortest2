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

/* compiled from: DivFunctionArgumentTemplate.kt */
/* loaded from: classes15.dex */
public final class DivFunctionArgumentTemplate implements JSONSerializable, JsonTemplate {
    public final Field name;
    public final Field type;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFunctionArgumentTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFunctionArgumentTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFunctionArgumentTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivFunctionArgumentTemplate(Field field, Field field2) {
        this.name = field;
        this.type = field2;
    }

    public /* synthetic */ DivFunctionArgumentTemplate(ParsingEnvironment parsingEnvironment, DivFunctionArgumentTemplate divFunctionArgumentTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divFunctionArgumentTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivFunctionArgumentTemplate(ParsingEnvironment parsingEnvironment, DivFunctionArgumentTemplate divFunctionArgumentTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivFunctionArgument resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivFunctionArgumentJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFunctionArgumentJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFunctionArgumentJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFunctionArgumentJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFunctionArgumentTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
