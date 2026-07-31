package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivActionCopyToClipboardJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionCopyToClipboardJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionCopyToClipboard resolve(ParsingContext parsingContext, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, JSONObject jSONObject) {
        return new DivActionCopyToClipboard((DivActionCopyToClipboardContent) JsonFieldResolver.resolve(parsingContext, divActionCopyToClipboardTemplate.content, jSONObject, "content", this.component.getDivActionCopyToClipboardContentJsonTemplateResolver(), this.component.getDivActionCopyToClipboardContentJsonEntityParser()));
    }
}
