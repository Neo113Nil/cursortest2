package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextTemplate;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivTextEllipsisJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTextEllipsisJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivText.Ellipsis resolve(ParsingContext parsingContext, DivTextTemplate.EllipsisTemplate ellipsisTemplate, JSONObject jSONObject) {
        return new DivText.Ellipsis(JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.images, jSONObject, "images", this.component.getDivTextImageJsonTemplateResolver(), this.component.getDivTextImageJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.ranges, jSONObject, "ranges", this.component.getDivTextRangeJsonTemplateResolver(), this.component.getDivTextRangeJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, ellipsisTemplate.text, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
