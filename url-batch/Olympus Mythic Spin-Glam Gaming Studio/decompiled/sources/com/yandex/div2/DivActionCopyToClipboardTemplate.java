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

/* compiled from: DivActionCopyToClipboardTemplate.kt */
/* loaded from: classes14.dex */
public final class DivActionCopyToClipboardTemplate implements JSONSerializable, JsonTemplate {
    public final Field content;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionCopyToClipboardTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionCopyToClipboardTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionCopyToClipboardTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionCopyToClipboardTemplate(Field field) {
        this.content = field;
    }

    public /* synthetic */ DivActionCopyToClipboardTemplate(ParsingEnvironment parsingEnvironment, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionCopyToClipboardTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivActionCopyToClipboardTemplate(ParsingEnvironment parsingEnvironment, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionCopyToClipboard resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionCopyToClipboardJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionCopyToClipboardJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionCopyToClipboardTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
