package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionCopyToClipboardContentTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContentTemplate.kt */
/* loaded from: classes13.dex */
public abstract class DivActionCopyToClipboardContentTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionCopyToClipboardContentTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionCopyToClipboardContentTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionCopyToClipboardContentTemplate.Companion.invoke$default(DivActionCopyToClipboardContentTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivActionCopyToClipboardContentTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class ContentTextCase extends DivActionCopyToClipboardContentTemplate {
        private final ContentTextTemplate value;

        public ContentTextCase(ContentTextTemplate contentTextTemplate) {
            super(null);
            this.value = contentTextTemplate;
        }

        public final ContentTextTemplate getValue() {
            return this.value;
        }
    }

    private DivActionCopyToClipboardContentTemplate() {
    }

    /* compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class ContentUrlCase extends DivActionCopyToClipboardContentTemplate {
        private final ContentUrlTemplate value;

        public ContentUrlCase(ContentUrlTemplate contentUrlTemplate) {
            super(null);
            this.value = contentUrlTemplate;
        }

        public final ContentUrlTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof ContentTextCase) {
            return ((ContentTextCase) this).getValue();
        }
        if (this instanceof ContentUrlCase) {
            return ((ContentUrlCase) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionCopyToClipboardContentJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardContentJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionCopyToClipboardContent resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionCopyToClipboardContentJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardContentJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof ContentTextCase) {
            return "text";
        }
        if (this instanceof ContentUrlCase) {
            return "url";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivActionCopyToClipboardContentTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivActionCopyToClipboardContentTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivActionCopyToClipboardContentJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardContentJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
