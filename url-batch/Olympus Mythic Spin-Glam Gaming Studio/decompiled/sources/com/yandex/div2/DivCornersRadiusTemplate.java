package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCornersRadiusJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCornersRadiusTemplate.kt */
/* loaded from: classes13.dex */
public final class DivCornersRadiusTemplate implements JSONSerializable, JsonTemplate {
    public final Field bottomLeft;
    public final Field bottomRight;
    public final Field topLeft;
    public final Field topRight;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCornersRadiusTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCornersRadiusTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCornersRadiusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivCornersRadiusTemplate(Field field, Field field2, Field field3, Field field4) {
        this.bottomLeft = field;
        this.bottomRight = field2;
        this.topLeft = field3;
        this.topRight = field4;
    }

    public /* synthetic */ DivCornersRadiusTemplate(ParsingEnvironment parsingEnvironment, DivCornersRadiusTemplate divCornersRadiusTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divCornersRadiusTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivCornersRadiusTemplate(ParsingEnvironment parsingEnvironment, DivCornersRadiusTemplate divCornersRadiusTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivCornersRadius resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivCornersRadiusJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCornersRadiusJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCornersRadiusJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCornersRadiusJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCornersRadiusTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
