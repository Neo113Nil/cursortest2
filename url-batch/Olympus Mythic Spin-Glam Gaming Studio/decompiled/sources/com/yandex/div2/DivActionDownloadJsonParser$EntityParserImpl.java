package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivActionDownloadJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionDownloadJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionDownload deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionDownload(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.component.getDivActionJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.component.getDivActionJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionDownload divActionDownload) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", divActionDownload.onFailActions, this.component.getDivActionJsonEntityParser());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divActionDownload.onSuccessActions, this.component.getDivActionJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "download");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divActionDownload.url, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
