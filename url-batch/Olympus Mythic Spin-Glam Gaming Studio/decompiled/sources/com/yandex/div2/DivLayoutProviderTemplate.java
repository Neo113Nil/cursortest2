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

/* compiled from: DivLayoutProviderTemplate.kt */
/* loaded from: classes13.dex */
public final class DivLayoutProviderTemplate implements JSONSerializable, JsonTemplate {
    public final Field heightVariableName;
    public final Field widthVariableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivLayoutProviderTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivLayoutProviderTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivLayoutProviderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivLayoutProviderTemplate(Field field, Field field2) {
        this.heightVariableName = field;
        this.widthVariableName = field2;
    }

    public /* synthetic */ DivLayoutProviderTemplate(ParsingEnvironment parsingEnvironment, DivLayoutProviderTemplate divLayoutProviderTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divLayoutProviderTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivLayoutProviderTemplate(ParsingEnvironment parsingEnvironment, DivLayoutProviderTemplate divLayoutProviderTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivLayoutProvider resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivLayoutProviderJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLayoutProviderJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivLayoutProviderJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLayoutProviderJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivLayoutProviderTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
