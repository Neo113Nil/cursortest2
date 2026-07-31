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

/* compiled from: DivDownloadCallbacksTemplate.kt */
/* loaded from: classes14.dex */
public final class DivDownloadCallbacksTemplate implements JSONSerializable, JsonTemplate {
    public final Field onFailActions;
    public final Field onSuccessActions;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDownloadCallbacksTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivDownloadCallbacksTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivDownloadCallbacksTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivDownloadCallbacksTemplate(Field field, Field field2) {
        this.onFailActions = field;
        this.onSuccessActions = field2;
    }

    public /* synthetic */ DivDownloadCallbacksTemplate(ParsingEnvironment parsingEnvironment, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divDownloadCallbacksTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivDownloadCallbacksTemplate(ParsingEnvironment parsingEnvironment, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivDownloadCallbacks resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivDownloadCallbacksJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDownloadCallbacksJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDownloadCallbacksJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDownloadCallbacksJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDownloadCallbacksTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
