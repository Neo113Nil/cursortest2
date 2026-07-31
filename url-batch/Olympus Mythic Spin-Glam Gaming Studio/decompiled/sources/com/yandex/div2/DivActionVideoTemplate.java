package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionVideoJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionVideoTemplate.kt */
/* loaded from: classes10.dex */
public final class DivActionVideoTemplate implements JSONSerializable, JsonTemplate {
    public final Field action;
    public final Field id;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionVideoTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionVideoTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionVideoTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionVideoTemplate(Field field, Field field2) {
        this.action = field;
        this.id = field2;
    }

    public /* synthetic */ DivActionVideoTemplate(ParsingEnvironment parsingEnvironment, DivActionVideoTemplate divActionVideoTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionVideoTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionVideoTemplate(ParsingEnvironment parsingEnvironment, DivActionVideoTemplate divActionVideoTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionVideo resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionVideoJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionVideoJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionVideoJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionVideoJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionVideoTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
