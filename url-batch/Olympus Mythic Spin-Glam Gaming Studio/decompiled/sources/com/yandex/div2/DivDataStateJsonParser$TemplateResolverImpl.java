package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDataTemplate;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivDataStateJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivDataStateJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivData.State resolve(ParsingContext parsingContext, DivDataTemplate.StateTemplate stateTemplate, JSONObject jSONObject) {
        return new DivData.State((Div) JsonFieldResolver.resolve(parsingContext, stateTemplate.div, jSONObject, "div", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser()), ((Number) JsonFieldResolver.resolve(parsingContext, stateTemplate.stateId, jSONObject, StateEntry.COLUMN_STATE_ID, ParsingConvertersKt.NUMBER_TO_INT)).longValue());
    }
}
