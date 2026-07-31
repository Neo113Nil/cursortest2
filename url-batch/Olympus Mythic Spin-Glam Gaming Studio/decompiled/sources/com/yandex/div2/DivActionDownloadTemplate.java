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

/* compiled from: DivActionDownloadTemplate.kt */
/* loaded from: classes15.dex */
public final class DivActionDownloadTemplate implements JSONSerializable, JsonTemplate {
    public final Field onFailActions;
    public final Field onSuccessActions;
    public final Field url;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionDownloadTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionDownloadTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionDownloadTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionDownloadTemplate(Field field, Field field2, Field field3) {
        this.onFailActions = field;
        this.onSuccessActions = field2;
        this.url = field3;
    }

    public /* synthetic */ DivActionDownloadTemplate(ParsingEnvironment parsingEnvironment, DivActionDownloadTemplate divActionDownloadTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionDownloadTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionDownloadTemplate(ParsingEnvironment parsingEnvironment, DivActionDownloadTemplate divActionDownloadTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionDownload resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionDownloadJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionDownloadJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionDownloadJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionDownloadJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionDownloadTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
