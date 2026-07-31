package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivActionCopyToClipboardJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionCopyToClipboardJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionCopyToClipboard deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionCopyToClipboard((DivActionCopyToClipboardContent) JsonPropertyParser.read(parsingContext, jSONObject, "content", this.component.getDivActionCopyToClipboardContentJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionCopyToClipboard divActionCopyToClipboard) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "content", divActionCopyToClipboard.content, this.component.getDivActionCopyToClipboardContentJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
