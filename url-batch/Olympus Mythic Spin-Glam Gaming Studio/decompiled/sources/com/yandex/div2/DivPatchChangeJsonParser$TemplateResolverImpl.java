package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPatchTemplate;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivPatchChangeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPatchChangeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPatch.Change resolve(ParsingContext parsingContext, DivPatchTemplate.ChangeTemplate changeTemplate, JSONObject jSONObject) {
        return new DivPatch.Change((String) JsonFieldResolver.resolve(parsingContext, changeTemplate.id, jSONObject, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, changeTemplate.items, jSONObject, "items", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser()));
    }
}
