package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionUpdateStructureJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionUpdateStructureTemplate.kt */
/* loaded from: classes3.dex */
public final class DivActionUpdateStructureTemplate implements JSONSerializable, JsonTemplate {
    public final Field path;
    public final Field value;
    public final Field variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionUpdateStructureTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionUpdateStructureTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionUpdateStructureTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionUpdateStructureTemplate(Field field, Field field2, Field field3) {
        this.path = field;
        this.value = field2;
        this.variableName = field3;
    }

    public /* synthetic */ DivActionUpdateStructureTemplate(ParsingEnvironment parsingEnvironment, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionUpdateStructureTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionUpdateStructureTemplate(ParsingEnvironment parsingEnvironment, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionUpdateStructure resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionUpdateStructureJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionUpdateStructureJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionUpdateStructureJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionUpdateStructureJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionUpdateStructureTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
