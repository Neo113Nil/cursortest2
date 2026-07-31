package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPatch;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivPatchChangeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPatchChangeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPatch.Change deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivPatch.Change((String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.component.getDivJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPatch.Change change) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "id", change.id);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "items", change.items, this.component.getDivJsonEntityParser());
        return jSONObject;
    }
}
