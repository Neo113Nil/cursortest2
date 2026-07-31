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

/* compiled from: DivExtensionTemplate.kt */
/* loaded from: classes13.dex */
public final class DivExtensionTemplate implements JSONSerializable, JsonTemplate {
    public final Field id;
    public final Field params;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivExtensionTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivExtensionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivExtensionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivExtensionTemplate(Field field, Field field2) {
        this.id = field;
        this.params = field2;
    }

    public /* synthetic */ DivExtensionTemplate(ParsingEnvironment parsingEnvironment, DivExtensionTemplate divExtensionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divExtensionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivExtensionTemplate(ParsingEnvironment parsingEnvironment, DivExtensionTemplate divExtensionTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivExtension resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivExtensionJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivExtensionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivExtensionJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivExtensionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivExtensionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
