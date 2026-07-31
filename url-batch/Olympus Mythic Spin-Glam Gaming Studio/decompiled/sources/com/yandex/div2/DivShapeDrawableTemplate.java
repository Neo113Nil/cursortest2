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

/* compiled from: DivShapeDrawableTemplate.kt */
/* loaded from: classes8.dex */
public final class DivShapeDrawableTemplate implements JSONSerializable, JsonTemplate {
    public final Field color;
    public final Field shape;
    public final Field stroke;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivShapeDrawableTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivShapeDrawableTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivShapeDrawableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivShapeDrawableTemplate(Field field, Field field2, Field field3) {
        this.color = field;
        this.shape = field2;
        this.stroke = field3;
    }

    public /* synthetic */ DivShapeDrawableTemplate(ParsingEnvironment parsingEnvironment, DivShapeDrawableTemplate divShapeDrawableTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divShapeDrawableTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivShapeDrawableTemplate(ParsingEnvironment parsingEnvironment, DivShapeDrawableTemplate divShapeDrawableTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivShapeDrawable resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivShapeDrawableJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeDrawableJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivShapeDrawableJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeDrawableJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivShapeDrawableTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
