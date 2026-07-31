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

/* compiled from: DivWrapContentSizeTemplate.kt */
/* loaded from: classes9.dex */
public final class DivWrapContentSizeTemplate implements JSONSerializable, JsonTemplate {
    public final Field constrained;
    public final Field maxSize;
    public final Field minSize;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivWrapContentSizeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivWrapContentSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivWrapContentSizeTemplate(Field field, Field field2, Field field3) {
        this.constrained = field;
        this.maxSize = field2;
        this.minSize = field3;
    }

    public /* synthetic */ DivWrapContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivWrapContentSizeTemplate divWrapContentSizeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divWrapContentSizeTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivWrapContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivWrapContentSizeTemplate divWrapContentSizeTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivWrapContentSize resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivWrapContentSizeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivWrapContentSizeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivWrapContentSizeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivWrapContentSizeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivWrapContentSizeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
