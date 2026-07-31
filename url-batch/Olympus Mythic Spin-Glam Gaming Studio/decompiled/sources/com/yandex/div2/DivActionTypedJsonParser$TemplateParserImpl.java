package com.yandex.div2;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionAnimatorStartJsonParser;
import com.yandex.div2.DivActionScrollByJsonParser;
import com.yandex.div2.DivActionScrollToJsonParser;
import com.yandex.div2.DivActionSetStateJsonParser;
import com.yandex.div2.DivActionTimerJsonParser;
import com.yandex.div2.DivActionTypedTemplate;
import com.yandex.div2.DivActionUpdateStructureJsonParser;
import com.yandex.div2.DivActionVideoJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivActionTypedJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivActionTypedJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionTypedJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivActionTypedTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivActionTypedTemplate divActionTypedTemplate = entityTemplate instanceof DivActionTypedTemplate ? (DivActionTypedTemplate) entityTemplate : null;
        if (divActionTypedTemplate != null && (type = divActionTypedTemplate.getType()) != null) {
            readString = type;
        }
        switch (readString.hashCode()) {
            case -1623648839:
                if (readString.equals("set_variable")) {
                    return new DivActionTypedTemplate.SetVariable(((DivActionSetVariableJsonParser$TemplateParserImpl) this.component.getDivActionSetVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionSetVariableTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case -1623635702:
                if (readString.equals("animator_start")) {
                    return new DivActionTypedTemplate.AnimatorStart(((DivActionAnimatorStartJsonParser.TemplateParserImpl) this.component.getDivActionAnimatorStartJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionAnimatorStartTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case -1254965146:
                if (readString.equals("clear_focus")) {
                    return new DivActionTypedTemplate.ClearFocus(((DivActionClearFocusJsonParser$TemplateParserImpl) this.component.getDivActionClearFocusJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionClearFocusTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case -1160753574:
                if (readString.equals("animator_stop")) {
                    return new DivActionTypedTemplate.AnimatorStop(((DivActionAnimatorStopJsonParser$TemplateParserImpl) this.component.getDivActionAnimatorStopJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionAnimatorStopTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case -891535336:
                if (readString.equals(DivActionHandler.DivActionReason.SUBMIT)) {
                    return new DivActionTypedTemplate.Submit(((DivActionSubmitJsonParser$TemplateParserImpl) this.component.getDivActionSubmitJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionSubmitTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case -796594542:
                if (readString.equals("set_stored_value")) {
                    return new DivActionTypedTemplate.SetStoredValue(((DivActionSetStoredValueJsonParser$TemplateParserImpl) this.component.getDivActionSetStoredValueJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionSetStoredValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case -404256420:
                if (readString.equals("copy_to_clipboard")) {
                    return new DivActionTypedTemplate.CopyToClipboard(((DivActionCopyToClipboardJsonParser$TemplateParserImpl) this.component.getDivActionCopyToClipboardJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionCopyToClipboardTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case -326583939:
                if (readString.equals("update_structure")) {
                    return new DivActionTypedTemplate.UpdateStructure(((DivActionUpdateStructureJsonParser.TemplateParserImpl) this.component.getDivActionUpdateStructureJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionUpdateStructureTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 10055918:
                if (readString.equals("array_set_value")) {
                    return new DivActionTypedTemplate.ArraySetValue(((DivActionArraySetValueJsonParser$TemplateParserImpl) this.component.getDivActionArraySetValueJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionArraySetValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 110364485:
                if (readString.equals(DivActionHandler.DivActionReason.TIMER)) {
                    return new DivActionTypedTemplate.Timer(((DivActionTimerJsonParser.TemplateParserImpl) this.component.getDivActionTimerJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionTimerTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new DivActionTypedTemplate.Video(((DivActionVideoJsonParser.TemplateParserImpl) this.component.getDivActionVideoJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionVideoTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 203934236:
                if (readString.equals("array_remove_value")) {
                    return new DivActionTypedTemplate.ArrayRemoveValue(((DivActionArrayRemoveValueJsonParser$TemplateParserImpl) this.component.getDivActionArrayRemoveValueJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionArrayRemoveValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 301532353:
                if (readString.equals("show_tooltip")) {
                    return new DivActionTypedTemplate.ShowTooltip(((DivActionShowTooltipJsonParser$TemplateParserImpl) this.component.getDivActionShowTooltipJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionShowTooltipTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 417790729:
                if (readString.equals("scroll_by")) {
                    return new DivActionTypedTemplate.ScrollBy(((DivActionScrollByJsonParser.TemplateParserImpl) this.component.getDivActionScrollByJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionScrollByTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 417791277:
                if (readString.equals("scroll_to")) {
                    return new DivActionTypedTemplate.ScrollTo(((DivActionScrollToJsonParser.TemplateParserImpl) this.component.getDivActionScrollToJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionScrollToTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 932090484:
                if (readString.equals("set_state")) {
                    return new DivActionTypedTemplate.SetState(((DivActionSetStateJsonParser.TemplateParserImpl) this.component.getDivActionSetStateJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionSetStateTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 1427818632:
                if (readString.equals("download")) {
                    return new DivActionTypedTemplate.Download(((DivActionDownloadJsonParser$TemplateParserImpl) this.component.getDivActionDownloadJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionDownloadTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 1550697109:
                if (readString.equals("focus_element")) {
                    return new DivActionTypedTemplate.FocusElement(((DivActionFocusElementJsonParser$TemplateParserImpl) this.component.getDivActionFocusElementJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionFocusElementTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 1587919371:
                if (readString.equals("dict_set_value")) {
                    return new DivActionTypedTemplate.DictSetValue(((DivActionDictSetValueJsonParser$TemplateParserImpl) this.component.getDivActionDictSetValueJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionDictSetValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 1715728902:
                if (readString.equals("hide_tooltip")) {
                    return new DivActionTypedTemplate.HideTooltip(((DivActionHideTooltipJsonParser$TemplateParserImpl) this.component.getDivActionHideTooltipJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionHideTooltipTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
            case 1811437713:
                if (readString.equals("array_insert_value")) {
                    return new DivActionTypedTemplate.ArrayInsertValue(((DivActionArrayInsertValueJsonParser$TemplateParserImpl) this.component.getDivActionArrayInsertValueJsonTemplateParser().getValue()).deserialize(parsingContext, (DivActionArrayInsertValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.value() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionTypedTemplate divActionTypedTemplate) {
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.AnimatorStart) {
            return ((DivActionAnimatorStartJsonParser.TemplateParserImpl) this.component.getDivActionAnimatorStartJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.AnimatorStart) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.AnimatorStop) {
            return ((DivActionAnimatorStopJsonParser$TemplateParserImpl) this.component.getDivActionAnimatorStopJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.AnimatorStop) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ArrayInsertValue) {
            return ((DivActionArrayInsertValueJsonParser$TemplateParserImpl) this.component.getDivActionArrayInsertValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.ArrayInsertValue) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ArrayRemoveValue) {
            return ((DivActionArrayRemoveValueJsonParser$TemplateParserImpl) this.component.getDivActionArrayRemoveValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.ArrayRemoveValue) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ArraySetValue) {
            return ((DivActionArraySetValueJsonParser$TemplateParserImpl) this.component.getDivActionArraySetValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.ArraySetValue) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ClearFocus) {
            return ((DivActionClearFocusJsonParser$TemplateParserImpl) this.component.getDivActionClearFocusJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.ClearFocus) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.CopyToClipboard) {
            return ((DivActionCopyToClipboardJsonParser$TemplateParserImpl) this.component.getDivActionCopyToClipboardJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.CopyToClipboard) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.DictSetValue) {
            return ((DivActionDictSetValueJsonParser$TemplateParserImpl) this.component.getDivActionDictSetValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.DictSetValue) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.Download) {
            return ((DivActionDownloadJsonParser$TemplateParserImpl) this.component.getDivActionDownloadJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.Download) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.FocusElement) {
            return ((DivActionFocusElementJsonParser$TemplateParserImpl) this.component.getDivActionFocusElementJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.FocusElement) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.HideTooltip) {
            return ((DivActionHideTooltipJsonParser$TemplateParserImpl) this.component.getDivActionHideTooltipJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.HideTooltip) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ScrollBy) {
            return ((DivActionScrollByJsonParser.TemplateParserImpl) this.component.getDivActionScrollByJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.ScrollBy) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ScrollTo) {
            return ((DivActionScrollToJsonParser.TemplateParserImpl) this.component.getDivActionScrollToJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.ScrollTo) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.SetState) {
            return ((DivActionSetStateJsonParser.TemplateParserImpl) this.component.getDivActionSetStateJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.SetState) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.SetStoredValue) {
            return ((DivActionSetStoredValueJsonParser$TemplateParserImpl) this.component.getDivActionSetStoredValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.SetStoredValue) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.SetVariable) {
            return ((DivActionSetVariableJsonParser$TemplateParserImpl) this.component.getDivActionSetVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.SetVariable) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ShowTooltip) {
            return ((DivActionShowTooltipJsonParser$TemplateParserImpl) this.component.getDivActionShowTooltipJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.ShowTooltip) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.Submit) {
            return ((DivActionSubmitJsonParser$TemplateParserImpl) this.component.getDivActionSubmitJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.Submit) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.Timer) {
            return ((DivActionTimerJsonParser.TemplateParserImpl) this.component.getDivActionTimerJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.Timer) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.UpdateStructure) {
            return ((DivActionUpdateStructureJsonParser.TemplateParserImpl) this.component.getDivActionUpdateStructureJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.UpdateStructure) divActionTypedTemplate).getValue());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.Video) {
            return ((DivActionVideoJsonParser.TemplateParserImpl) this.component.getDivActionVideoJsonTemplateParser().getValue()).serialize(parsingContext, ((DivActionTypedTemplate.Video) divActionTypedTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
