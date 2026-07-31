package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPagerLayoutModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivPagerLayoutModeJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPagerLayoutModeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPagerLayoutModeTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivPagerLayoutModeTemplate divPagerLayoutModeTemplate = entityTemplate instanceof DivPagerLayoutModeTemplate ? (DivPagerLayoutModeTemplate) entityTemplate : null;
        if (divPagerLayoutModeTemplate != null && (type = divPagerLayoutModeTemplate.getType()) != null) {
            readString = type;
        }
        int hashCode = readString.hashCode();
        if (hashCode != -921832806) {
            if (hashCode != 97445748) {
                if (hashCode == 343327108 && readString.equals("wrap_content")) {
                    return new DivPagerLayoutModeTemplate.PageContentSize(((DivPageContentSizeJsonParser$TemplateParserImpl) this.component.getDivPageContentSizeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivPageContentSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.value() : null), jSONObject));
                }
            } else if (readString.equals("fixed")) {
                return new DivPagerLayoutModeTemplate.NeighbourPageSize(((DivNeighbourPageSizeJsonParser$TemplateParserImpl) this.component.getDivNeighbourPageSizeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivNeighbourPageSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.value() : null), jSONObject));
            }
        } else if (readString.equals("percentage")) {
            return new DivPagerLayoutModeTemplate.PageSize(((DivPageSizeJsonParser$TemplateParserImpl) this.component.getDivPageSizeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivPageSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPagerLayoutModeTemplate divPagerLayoutModeTemplate) {
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.PageSize) {
            return ((DivPageSizeJsonParser$TemplateParserImpl) this.component.getDivPageSizeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivPagerLayoutModeTemplate.PageSize) divPagerLayoutModeTemplate).getValue());
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.NeighbourPageSize) {
            return ((DivNeighbourPageSizeJsonParser$TemplateParserImpl) this.component.getDivNeighbourPageSizeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivPagerLayoutModeTemplate.NeighbourPageSize) divPagerLayoutModeTemplate).getValue());
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.PageContentSize) {
            return ((DivPageContentSizeJsonParser$TemplateParserImpl) this.component.getDivPageContentSizeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivPagerLayoutModeTemplate.PageContentSize) divPagerLayoutModeTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
