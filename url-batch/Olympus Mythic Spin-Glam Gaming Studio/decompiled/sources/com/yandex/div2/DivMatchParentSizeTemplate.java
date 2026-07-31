package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivMatchParentSizeJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivMatchParentSizeTemplate.kt */
/* loaded from: classes10.dex */
public final class DivMatchParentSizeTemplate implements JSONSerializable, JsonTemplate {
    public final Field maxSize;
    public final Field minSize;
    public final Field weight;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivMatchParentSizeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivMatchParentSizeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivMatchParentSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivMatchParentSizeTemplate(Field field, Field field2, Field field3) {
        this.maxSize = field;
        this.minSize = field2;
        this.weight = field3;
    }

    public /* synthetic */ DivMatchParentSizeTemplate(ParsingEnvironment parsingEnvironment, DivMatchParentSizeTemplate divMatchParentSizeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divMatchParentSizeTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivMatchParentSizeTemplate(ParsingEnvironment parsingEnvironment, DivMatchParentSizeTemplate divMatchParentSizeTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivMatchParentSize resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivMatchParentSizeJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivMatchParentSizeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivMatchParentSizeJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivMatchParentSizeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivMatchParentSizeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
