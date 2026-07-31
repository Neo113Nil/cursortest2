package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFocus;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivFocusNextFocusIdsJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivFocusNextFocusIdsJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivFocus.NextFocusIds deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocus.NextFocusIds(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "down", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ToolBar.FORWARD, typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "up", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFocus.NextFocusIds nextFocusIds) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "down", nextFocusIds.down);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, ToolBar.FORWARD, nextFocusIds.forward);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", nextFocusIds.left);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", nextFocusIds.right);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "up", nextFocusIds.up);
        return jSONObject;
    }
}
