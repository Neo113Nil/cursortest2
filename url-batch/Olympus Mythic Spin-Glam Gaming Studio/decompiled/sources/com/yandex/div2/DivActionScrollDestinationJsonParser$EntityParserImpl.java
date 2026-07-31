package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionScrollDestination;
import com.yandex.div2.IndexDestinationJsonParser;
import com.yandex.div2.OffsetDestinationJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivActionScrollDestinationJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionScrollDestinationJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivActionScrollDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (readString.hashCode()) {
            case -1019779949:
                if (readString.equals("offset")) {
                    return new DivActionScrollDestination.Offset(((OffsetDestinationJsonParser.EntityParserImpl) this.component.getOffsetDestinationJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100571:
                if (readString.equals("end")) {
                    return new DivActionScrollDestination.End(((EndDestinationJsonParser$EntityParserImpl) this.component.getEndDestinationJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100346066:
                if (readString.equals("index")) {
                    return new DivActionScrollDestination.Index(((IndexDestinationJsonParser.EntityParserImpl) this.component.getIndexDestinationJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757538:
                if (readString.equals("start")) {
                    return new DivActionScrollDestination.Start(((StartDestinationJsonParser$EntityParserImpl) this.component.getStartDestinationJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivActionScrollDestinationTemplate divActionScrollDestinationTemplate = orThrow instanceof DivActionScrollDestinationTemplate ? (DivActionScrollDestinationTemplate) orThrow : null;
        if (divActionScrollDestinationTemplate != null) {
            return ((DivActionScrollDestinationJsonParser$TemplateResolverImpl) this.component.getDivActionScrollDestinationJsonTemplateResolver().getValue()).resolve(parsingContext, divActionScrollDestinationTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionScrollDestination divActionScrollDestination) {
        if (divActionScrollDestination instanceof DivActionScrollDestination.Offset) {
            return ((OffsetDestinationJsonParser.EntityParserImpl) this.component.getOffsetDestinationJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionScrollDestination.Offset) divActionScrollDestination).getValue());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.Index) {
            return ((IndexDestinationJsonParser.EntityParserImpl) this.component.getIndexDestinationJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionScrollDestination.Index) divActionScrollDestination).getValue());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.Start) {
            return ((StartDestinationJsonParser$EntityParserImpl) this.component.getStartDestinationJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionScrollDestination.Start) divActionScrollDestination).getValue());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.End) {
            return ((EndDestinationJsonParser$EntityParserImpl) this.component.getEndDestinationJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionScrollDestination.End) divActionScrollDestination).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
