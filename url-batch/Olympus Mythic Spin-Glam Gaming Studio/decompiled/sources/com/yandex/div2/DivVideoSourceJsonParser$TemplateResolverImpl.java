package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivVideoSource;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivVideoSourceJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivVideoSourceJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivVideoSourceJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivVideoSource resolve(ParsingContext parsingContext, DivVideoSourceTemplate divVideoSourceTemplate, JSONObject jSONObject) {
        return new DivVideoSource(JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoSourceTemplate.bitrate, jSONObject, VastAttributes.BITRATE, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, divVideoSourceTemplate.mimeType, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING), (DivVideoSource.Resolution) JsonFieldResolver.resolveOptional(parsingContext, divVideoSourceTemplate.resolution, jSONObject, "resolution", this.component.getDivVideoSourceResolutionJsonTemplateResolver(), this.component.getDivVideoSourceResolutionJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divVideoSourceTemplate.url, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
