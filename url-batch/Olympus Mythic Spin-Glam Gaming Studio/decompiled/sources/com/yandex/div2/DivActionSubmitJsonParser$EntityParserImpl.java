package com.yandex.div2;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionSubmit;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivActionSubmitJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionSubmitJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionSubmit deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionSubmit(JsonExpressionParser.readExpression(parsingContext, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.component.getDivActionJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.component.getDivActionJsonEntityParser()), (DivActionSubmit.Request) JsonPropertyParser.read(parsingContext, jSONObject, "request", this.component.getDivActionSubmitRequestJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionSubmit divActionSubmit) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "container_id", divActionSubmit.containerId);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", divActionSubmit.onFailActions, this.component.getDivActionJsonEntityParser());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divActionSubmit.onSuccessActions, this.component.getDivActionJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "request", divActionSubmit.request, this.component.getDivActionSubmitRequestJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", DivActionHandler.DivActionReason.SUBMIT);
        return jSONObject;
    }
}
