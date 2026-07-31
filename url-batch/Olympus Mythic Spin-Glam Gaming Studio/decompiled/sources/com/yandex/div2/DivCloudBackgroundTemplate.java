package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCloudBackgroundJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCloudBackgroundTemplate.kt */
/* loaded from: classes13.dex */
public final class DivCloudBackgroundTemplate implements JSONSerializable, JsonTemplate {
    public final Field color;
    public final Field cornerRadius;
    public final Field paddings;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCloudBackgroundTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCloudBackgroundTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCloudBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivCloudBackgroundTemplate(Field field, Field field2, Field field3) {
        this.color = field;
        this.cornerRadius = field2;
        this.paddings = field3;
    }

    public /* synthetic */ DivCloudBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivCloudBackgroundTemplate divCloudBackgroundTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divCloudBackgroundTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivCloudBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivCloudBackgroundTemplate divCloudBackgroundTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivCloudBackground resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivCloudBackgroundJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCloudBackgroundJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCloudBackgroundJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCloudBackgroundJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCloudBackgroundTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
