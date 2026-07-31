package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivState;
import com.yandex.div2.DivStateTemplate;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivStateStateJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivStateStateJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivState.State resolve(ParsingContext parsingContext, DivStateTemplate.StateTemplate stateTemplate, JSONObject jSONObject) {
        return new DivState.State((DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.animationIn, jSONObject, "animation_in", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser()), (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.animationOut, jSONObject, "animation_out", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser()), (Div) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.div, jSONObject, "div", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser()), (String) JsonFieldResolver.resolve(parsingContext, stateTemplate.stateId, jSONObject, StateEntry.COLUMN_STATE_ID), JsonFieldResolver.resolveOptionalList(parsingContext, stateTemplate.swipeOutActions, jSONObject, "swipe_out_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()));
    }
}
