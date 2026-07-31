package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFunctionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFunctionTemplate.kt */
/* loaded from: classes11.dex */
public final class DivFunctionTemplate implements JSONSerializable, JsonTemplate {
    public final Field arguments;
    public final Field body;
    public final Field name;
    public final Field returnType;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFunctionTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFunctionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFunctionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivFunctionTemplate(Field field, Field field2, Field field3, Field field4) {
        this.arguments = field;
        this.body = field2;
        this.name = field3;
        this.returnType = field4;
    }

    public /* synthetic */ DivFunctionTemplate(ParsingEnvironment parsingEnvironment, DivFunctionTemplate divFunctionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divFunctionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivFunctionTemplate(ParsingEnvironment parsingEnvironment, DivFunctionTemplate divFunctionTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivFunction resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivFunctionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFunctionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFunctionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFunctionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFunctionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
