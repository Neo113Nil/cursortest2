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

/* compiled from: DivNinePatchBackgroundTemplate.kt */
/* loaded from: classes3.dex */
public final class DivNinePatchBackgroundTemplate implements JSONSerializable, JsonTemplate {
    public final Field imageUrl;
    public final Field insets;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivNinePatchBackgroundTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivNinePatchBackgroundTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivNinePatchBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivNinePatchBackgroundTemplate(Field field, Field field2) {
        this.imageUrl = field;
        this.insets = field2;
    }

    public /* synthetic */ DivNinePatchBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divNinePatchBackgroundTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivNinePatchBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivNinePatchBackground resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivNinePatchBackgroundJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNinePatchBackgroundJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivNinePatchBackgroundJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNinePatchBackgroundJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivNinePatchBackgroundTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
