package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionCopyToClipboardContent;
import com.yandex.div2.DivActionCopyToClipboardContentTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivActionCopyToClipboardContentJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionCopyToClipboardContentJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionCopyToClipboardContent resolve(ParsingContext parsingContext, DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate, JSONObject jSONObject) {
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.ContentTextCase) {
            return new DivActionCopyToClipboardContent.ContentTextCase(((ContentTextJsonParser$TemplateResolverImpl) this.component.getContentTextJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionCopyToClipboardContentTemplate.ContentTextCase) divActionCopyToClipboardContentTemplate).getValue(), jSONObject));
        }
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.ContentUrlCase) {
            return new DivActionCopyToClipboardContent.ContentUrlCase(((ContentUrlJsonParser$TemplateResolverImpl) this.component.getContentUrlJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionCopyToClipboardContentTemplate.ContentUrlCase) divActionCopyToClipboardContentTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
