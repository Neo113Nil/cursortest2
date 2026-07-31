package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionScrollDestinationTemplate;
import com.yandex.div2.IndexDestinationJsonParser;
import com.yandex.div2.OffsetDestinationJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivActionScrollDestinationJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionScrollDestinationJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.yandex.div.serialization.Deserializer
    public DivActionScrollDestinationTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivActionScrollDestinationTemplate divActionScrollDestinationTemplate = entityTemplate instanceof DivActionScrollDestinationTemplate ? (DivActionScrollDestinationTemplate) entityTemplate : null;
        if (divActionScrollDestinationTemplate != null && (type = divActionScrollDestinationTemplate.getType()) != null) {
            readString = type;
        }
        switch (readString.hashCode()) {
            case -1019779949:
                if (readString.equals("offset")) {
                    return new DivActionScrollDestinationTemplate.Offset(((OffsetDestinationJsonParser.TemplateParserImpl) this.component.getOffsetDestinationJsonTemplateParser().getValue()).deserialize(parsingContext, (OffsetDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.value() : null), jSONObject));
                }
                break;
            case 100571:
                if (readString.equals("end")) {
                    return new DivActionScrollDestinationTemplate.End(((EndDestinationJsonParser$TemplateParserImpl) this.component.getEndDestinationJsonTemplateParser().getValue()).deserialize(parsingContext, (EndDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.value() : null), jSONObject));
                }
                break;
            case 100346066:
                if (readString.equals("index")) {
                    return new DivActionScrollDestinationTemplate.Index(((IndexDestinationJsonParser.TemplateParserImpl) this.component.getIndexDestinationJsonTemplateParser().getValue()).deserialize(parsingContext, (IndexDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.value() : null), jSONObject));
                }
                break;
            case 109757538:
                if (readString.equals("start")) {
                    return new DivActionScrollDestinationTemplate.Start(((StartDestinationJsonParser$TemplateParserImpl) this.component.getStartDestinationJsonTemplateParser().getValue()).deserialize(parsingContext, (StartDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.value() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionScrollDestinationTemplate divActionScrollDestinationTemplate) {
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.Offset) {
            return ((OffsetDestinationJsonParser.TemplateParserImpl) this.component.getOffsetDestinationJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionScrollDestinationTemplate.Offset) divActionScrollDestinationTemplate).getValue());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.Index) {
            return ((IndexDestinationJsonParser.TemplateParserImpl) this.component.getIndexDestinationJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionScrollDestinationTemplate.Index) divActionScrollDestinationTemplate).getValue());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.Start) {
            return ((StartDestinationJsonParser$TemplateParserImpl) this.component.getStartDestinationJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionScrollDestinationTemplate.Start) divActionScrollDestinationTemplate).getValue());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.End) {
            return ((EndDestinationJsonParser$TemplateParserImpl) this.component.getEndDestinationJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionScrollDestinationTemplate.End) divActionScrollDestinationTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
