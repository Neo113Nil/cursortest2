package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedSizeJsonParser;
import com.yandex.div2.DivMatchParentSizeJsonParser;
import com.yandex.div2.DivSizeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivSizeJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivSizeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivSizeTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivSizeTemplate divSizeTemplate = entityTemplate instanceof DivSizeTemplate ? (DivSizeTemplate) entityTemplate : null;
        if (divSizeTemplate != null && (type = divSizeTemplate.getType()) != null) {
            readString = type;
        }
        int hashCode = readString.hashCode();
        if (hashCode != 97445748) {
            if (hashCode != 343327108) {
                if (hashCode == 1386124388 && readString.equals("match_parent")) {
                    return new DivSizeTemplate.MatchParent(((DivMatchParentSizeJsonParser.TemplateParserImpl) this.component.getDivMatchParentSizeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivMatchParentSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.value() : null), jSONObject));
                }
            } else if (readString.equals("wrap_content")) {
                return new DivSizeTemplate.WrapContent(((DivWrapContentSizeJsonParser$TemplateParserImpl) this.component.getDivWrapContentSizeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivWrapContentSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.value() : null), jSONObject));
            }
        } else if (readString.equals("fixed")) {
            return new DivSizeTemplate.Fixed(((DivFixedSizeJsonParser.TemplateParserImpl) this.component.getDivFixedSizeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivFixedSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivSizeTemplate divSizeTemplate) {
        if (divSizeTemplate instanceof DivSizeTemplate.Fixed) {
            return ((DivFixedSizeJsonParser.TemplateParserImpl) this.component.getDivFixedSizeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivSizeTemplate.Fixed) divSizeTemplate).getValue());
        }
        if (divSizeTemplate instanceof DivSizeTemplate.MatchParent) {
            return ((DivMatchParentSizeJsonParser.TemplateParserImpl) this.component.getDivMatchParentSizeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivSizeTemplate.MatchParent) divSizeTemplate).getValue());
        }
        if (divSizeTemplate instanceof DivSizeTemplate.WrapContent) {
            return ((DivWrapContentSizeJsonParser$TemplateParserImpl) this.component.getDivWrapContentSizeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivSizeTemplate.WrapContent) divSizeTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
