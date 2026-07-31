package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPagerLayoutMode;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivPagerLayoutModeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPagerLayoutModeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPagerLayoutMode deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        if (hashCode != -921832806) {
            if (hashCode != 97445748) {
                if (hashCode == 343327108 && readString.equals("wrap_content")) {
                    return new DivPagerLayoutMode.PageContentSize(((DivPageContentSizeJsonParser$EntityParserImpl) this.component.getDivPageContentSizeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
            } else if (readString.equals("fixed")) {
                return new DivPagerLayoutMode.NeighbourPageSize(((DivNeighbourPageSizeJsonParser$EntityParserImpl) this.component.getDivNeighbourPageSizeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
            }
        } else if (readString.equals("percentage")) {
            return new DivPagerLayoutMode.PageSize(((DivPageSizeJsonParser$EntityParserImpl) this.component.getDivPageSizeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivPagerLayoutModeTemplate divPagerLayoutModeTemplate = orThrow instanceof DivPagerLayoutModeTemplate ? (DivPagerLayoutModeTemplate) orThrow : null;
        if (divPagerLayoutModeTemplate != null) {
            return ((DivPagerLayoutModeJsonParser$TemplateResolverImpl) this.component.getDivPagerLayoutModeJsonTemplateResolver().getValue()).resolve(parsingContext, divPagerLayoutModeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPagerLayoutMode divPagerLayoutMode) {
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.PageSize) {
            return ((DivPageSizeJsonParser$EntityParserImpl) this.component.getDivPageSizeJsonEntityParser().getValue()).serialize(parsingContext, ((DivPagerLayoutMode.PageSize) divPagerLayoutMode).getValue());
        }
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.NeighbourPageSize) {
            return ((DivNeighbourPageSizeJsonParser$EntityParserImpl) this.component.getDivNeighbourPageSizeJsonEntityParser().getValue()).serialize(parsingContext, ((DivPagerLayoutMode.NeighbourPageSize) divPagerLayoutMode).getValue());
        }
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.PageContentSize) {
            return ((DivPageContentSizeJsonParser$EntityParserImpl) this.component.getDivPageContentSizeJsonEntityParser().getValue()).serialize(parsingContext, ((DivPagerLayoutMode.PageContentSize) divPagerLayoutMode).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
