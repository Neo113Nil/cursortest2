package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedSizeJsonParser;
import com.yandex.div2.DivMatchParentSizeJsonParser;
import com.yandex.div2.DivSize;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivSizeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivSizeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        if (hashCode != 97445748) {
            if (hashCode != 343327108) {
                if (hashCode == 1386124388 && readString.equals("match_parent")) {
                    return new DivSize.MatchParent(((DivMatchParentSizeJsonParser.EntityParserImpl) this.component.getDivMatchParentSizeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
            } else if (readString.equals("wrap_content")) {
                return new DivSize.WrapContent(((DivWrapContentSizeJsonParser$EntityParserImpl) this.component.getDivWrapContentSizeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
            }
        } else if (readString.equals("fixed")) {
            return new DivSize.Fixed(((DivFixedSizeJsonParser.EntityParserImpl) this.component.getDivFixedSizeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivSizeTemplate divSizeTemplate = orThrow instanceof DivSizeTemplate ? (DivSizeTemplate) orThrow : null;
        if (divSizeTemplate != null) {
            return ((DivSizeJsonParser$TemplateResolverImpl) this.component.getDivSizeJsonTemplateResolver().getValue()).resolve(parsingContext, divSizeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivSize divSize) {
        if (divSize instanceof DivSize.Fixed) {
            return ((DivFixedSizeJsonParser.EntityParserImpl) this.component.getDivFixedSizeJsonEntityParser().getValue()).serialize(parsingContext, ((DivSize.Fixed) divSize).getValue());
        }
        if (divSize instanceof DivSize.MatchParent) {
            return ((DivMatchParentSizeJsonParser.EntityParserImpl) this.component.getDivMatchParentSizeJsonEntityParser().getValue()).serialize(parsingContext, ((DivSize.MatchParent) divSize).getValue());
        }
        if (divSize instanceof DivSize.WrapContent) {
            return ((DivWrapContentSizeJsonParser$EntityParserImpl) this.component.getDivWrapContentSizeJsonEntityParser().getValue()).serialize(parsingContext, ((DivSize.WrapContent) divSize).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
