package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivFocusTemplate;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivFocusNextFocusIdsJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivFocusNextFocusIdsJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivFocusTemplate.NextFocusIdsTemplate deserialize(ParsingContext parsingContext, DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocusTemplate.NextFocusIdsTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "down", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.down : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ToolBar.FORWARD, typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.forward : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.left : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.right : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "up", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.up : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "down", nextFocusIdsTemplate.down);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ToolBar.FORWARD, nextFocusIdsTemplate.forward);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", nextFocusIdsTemplate.left);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", nextFocusIdsTemplate.right);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "up", nextFocusIdsTemplate.up);
        return jSONObject;
    }
}
