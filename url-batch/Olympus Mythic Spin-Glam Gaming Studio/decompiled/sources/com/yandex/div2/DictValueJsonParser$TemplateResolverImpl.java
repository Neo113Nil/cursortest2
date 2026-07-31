package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DictValueJsonParser.kt */
/* loaded from: classes5.dex */
public final class DictValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DictValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DictValue resolve(ParsingContext parsingContext, DictValueTemplate dictValueTemplate, JSONObject jSONObject) {
        return new DictValue(JsonFieldResolver.resolveExpression(parsingContext, dictValueTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }
}
