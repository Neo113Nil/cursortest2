package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFocus;
import io.appmetrica.analytics.impl.M2;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivFocusJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivFocusJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivFocus deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivFocus(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser()), (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser()), (DivFocus.NextFocusIds) JsonPropertyParser.readOptional(parsingContext, jSONObject, "next_focus_ids", this.component.getDivFocusNextFocusIdsJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_blur", this.component.getDivActionJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_focus", this.component.getDivActionJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFocus divFocus) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divFocus.background, this.component.getDivBackgroundJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "border", divFocus.border, this.component.getDivBorderJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "next_focus_ids", divFocus.nextFocusIds, this.component.getDivFocusNextFocusIdsJsonEntityParser());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_blur", divFocus.onBlur, this.component.getDivActionJsonEntityParser());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_focus", divFocus.onFocus, this.component.getDivActionJsonEntityParser());
        return jSONObject;
    }
}
