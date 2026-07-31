package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DictVariableJsonParser.kt */
/* loaded from: classes10.dex */
public final class DictVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DictVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DictVariable resolve(ParsingContext parsingContext, DictVariableTemplate dictVariableTemplate, JSONObject jSONObject) {
        return new DictVariable((String) JsonFieldResolver.resolve(parsingContext, dictVariableTemplate.name, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, dictVariableTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }
}
