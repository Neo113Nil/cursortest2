package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionCopyToClipboardContent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivActionCopyToClipboardContentJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionCopyToClipboardContentJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionCopyToClipboardContent deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "text")) {
            return new DivActionCopyToClipboardContent.ContentTextCase(((ContentTextJsonParser$EntityParserImpl) this.component.getContentTextJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "url")) {
            return new DivActionCopyToClipboardContent.ContentUrlCase(((ContentUrlJsonParser$EntityParserImpl) this.component.getContentUrlJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate = orThrow instanceof DivActionCopyToClipboardContentTemplate ? (DivActionCopyToClipboardContentTemplate) orThrow : null;
        if (divActionCopyToClipboardContentTemplate != null) {
            return ((DivActionCopyToClipboardContentJsonParser$TemplateResolverImpl) this.component.getDivActionCopyToClipboardContentJsonTemplateResolver().getValue()).resolve(parsingContext, divActionCopyToClipboardContentTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionCopyToClipboardContent divActionCopyToClipboardContent) {
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.ContentTextCase) {
            return ((ContentTextJsonParser$EntityParserImpl) this.component.getContentTextJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionCopyToClipboardContent.ContentTextCase) divActionCopyToClipboardContent).getValue());
        }
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.ContentUrlCase) {
            return ((ContentUrlJsonParser$EntityParserImpl) this.component.getContentUrlJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionCopyToClipboardContent.ContentUrlCase) divActionCopyToClipboardContent).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
