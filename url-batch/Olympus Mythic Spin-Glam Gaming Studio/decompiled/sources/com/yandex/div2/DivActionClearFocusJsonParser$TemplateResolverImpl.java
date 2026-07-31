package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionClearFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class DivActionClearFocusJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionClearFocusJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionClearFocus resolve(ParsingContext parsingContext, DivActionClearFocusTemplate divActionClearFocusTemplate, JSONObject jSONObject) {
        return new DivActionClearFocus();
    }
}
