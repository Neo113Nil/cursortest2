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
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivActionUpdateStructureJsonParser;
import com.yandex.div2.DivActionVideoJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivActionTypedJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivActionTypedJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionTypedJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivActionTyped deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (readString.hashCode()) {
            case -1623648839:
                if (readString.equals("set_variable")) {
                    return new DivActionTyped.SetVariable(((DivActionSetVariableJsonParser$EntityParserImpl) this.component.getDivActionSetVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -1623635702:
                if (readString.equals("animator_start")) {
                    return new DivActionTyped.AnimatorStart(((DivActionAnimatorStartJsonParser.EntityParserImpl) this.component.getDivActionAnimatorStartJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -1254965146:
                if (readString.equals("clear_focus")) {
                    return new DivActionTyped.ClearFocus(((DivActionClearFocusJsonParser$EntityParserImpl) this.component.getDivActionClearFocusJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -1160753574:
                if (readString.equals("animator_stop")) {
                    return new DivActionTyped.AnimatorStop(((DivActionAnimatorStopJsonParser$EntityParserImpl) this.component.getDivActionAnimatorStopJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -891535336:
                if (readString.equals(DivActionHandler.DivActionReason.SUBMIT)) {
                    return new DivActionTyped.Submit(((DivActionSubmitJsonParser$EntityParserImpl) this.component.getDivActionSubmitJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -796594542:
                if (readString.equals("set_stored_value")) {
                    return new DivActionTyped.SetStoredValue(((DivActionSetStoredValueJsonParser$EntityParserImpl) this.component.getDivActionSetStoredValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -404256420:
                if (readString.equals("copy_to_clipboard")) {
                    return new DivActionTyped.CopyToClipboard(((DivActionCopyToClipboardJsonParser$EntityParserImpl) this.component.getDivActionCopyToClipboardJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -326583939:
                if (readString.equals("update_structure")) {
                    return new DivActionTyped.UpdateStructure(((DivActionUpdateStructureJsonParser.EntityParserImpl) this.component.getDivActionUpdateStructureJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 10055918:
                if (readString.equals("array_set_value")) {
                    return new DivActionTyped.ArraySetValue(((DivActionArraySetValueJsonParser$EntityParserImpl) this.component.getDivActionArraySetValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 110364485:
                if (readString.equals(DivActionHandler.DivActionReason.TIMER)) {
                    return new DivActionTyped.Timer(((DivActionTimerJsonParser.EntityParserImpl) this.component.getDivActionTimerJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new DivActionTyped.Video(((DivActionVideoJsonParser.EntityParserImpl) this.component.getDivActionVideoJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 203934236:
                if (readString.equals("array_remove_value")) {
                    return new DivActionTyped.ArrayRemoveValue(((DivActionArrayRemoveValueJsonParser$EntityParserImpl) this.component.getDivActionArrayRemoveValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 301532353:
                if (readString.equals("show_tooltip")) {
                    return new DivActionTyped.ShowTooltip(((DivActionShowTooltipJsonParser$EntityParserImpl) this.component.getDivActionShowTooltipJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 417790729:
                if (readString.equals("scroll_by")) {
                    return new DivActionTyped.ScrollBy(((DivActionScrollByJsonParser.EntityParserImpl) this.component.getDivActionScrollByJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 417791277:
                if (readString.equals("scroll_to")) {
                    return new DivActionTyped.ScrollTo(((DivActionScrollToJsonParser.EntityParserImpl) this.component.getDivActionScrollToJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 932090484:
                if (readString.equals("set_state")) {
                    return new DivActionTyped.SetState(((DivActionSetStateJsonParser.EntityParserImpl) this.component.getDivActionSetStateJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1427818632:
                if (readString.equals("download")) {
                    return new DivActionTyped.Download(((DivActionDownloadJsonParser$EntityParserImpl) this.component.getDivActionDownloadJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1550697109:
                if (readString.equals("focus_element")) {
                    return new DivActionTyped.FocusElement(((DivActionFocusElementJsonParser$EntityParserImpl) this.component.getDivActionFocusElementJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1587919371:
                if (readString.equals("dict_set_value")) {
                    return new DivActionTyped.DictSetValue(((DivActionDictSetValueJsonParser$EntityParserImpl) this.component.getDivActionDictSetValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1715728902:
                if (readString.equals("hide_tooltip")) {
                    return new DivActionTyped.HideTooltip(((DivActionHideTooltipJsonParser$EntityParserImpl) this.component.getDivActionHideTooltipJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1811437713:
                if (readString.equals("array_insert_value")) {
                    return new DivActionTyped.ArrayInsertValue(((DivActionArrayInsertValueJsonParser$EntityParserImpl) this.component.getDivActionArrayInsertValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivActionTypedTemplate divActionTypedTemplate = orThrow instanceof DivActionTypedTemplate ? (DivActionTypedTemplate) orThrow : null;
        if (divActionTypedTemplate != null) {
            return ((DivActionTypedJsonParser$TemplateResolverImpl) this.component.getDivActionTypedJsonTemplateResolver().getValue()).resolve(parsingContext, divActionTypedTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionTyped divActionTyped) {
        if (divActionTyped instanceof DivActionTyped.AnimatorStart) {
            return ((DivActionAnimatorStartJsonParser.EntityParserImpl) this.component.getDivActionAnimatorStartJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.AnimatorStart) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.AnimatorStop) {
            return ((DivActionAnimatorStopJsonParser$EntityParserImpl) this.component.getDivActionAnimatorStopJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.AnimatorStop) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.ArrayInsertValue) {
            return ((DivActionArrayInsertValueJsonParser$EntityParserImpl) this.component.getDivActionArrayInsertValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.ArrayInsertValue) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.ArrayRemoveValue) {
            return ((DivActionArrayRemoveValueJsonParser$EntityParserImpl) this.component.getDivActionArrayRemoveValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.ArrayRemoveValue) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.ArraySetValue) {
            return ((DivActionArraySetValueJsonParser$EntityParserImpl) this.component.getDivActionArraySetValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.ArraySetValue) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.ClearFocus) {
            return ((DivActionClearFocusJsonParser$EntityParserImpl) this.component.getDivActionClearFocusJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.ClearFocus) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.CopyToClipboard) {
            return ((DivActionCopyToClipboardJsonParser$EntityParserImpl) this.component.getDivActionCopyToClipboardJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.CopyToClipboard) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.DictSetValue) {
            return ((DivActionDictSetValueJsonParser$EntityParserImpl) this.component.getDivActionDictSetValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.DictSetValue) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.Download) {
            return ((DivActionDownloadJsonParser$EntityParserImpl) this.component.getDivActionDownloadJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.Download) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.FocusElement) {
            return ((DivActionFocusElementJsonParser$EntityParserImpl) this.component.getDivActionFocusElementJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.FocusElement) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.HideTooltip) {
            return ((DivActionHideTooltipJsonParser$EntityParserImpl) this.component.getDivActionHideTooltipJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.HideTooltip) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.ScrollBy) {
            return ((DivActionScrollByJsonParser.EntityParserImpl) this.component.getDivActionScrollByJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.ScrollBy) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.ScrollTo) {
            return ((DivActionScrollToJsonParser.EntityParserImpl) this.component.getDivActionScrollToJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.ScrollTo) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.SetState) {
            return ((DivActionSetStateJsonParser.EntityParserImpl) this.component.getDivActionSetStateJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.SetState) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.SetStoredValue) {
            return ((DivActionSetStoredValueJsonParser$EntityParserImpl) this.component.getDivActionSetStoredValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.SetStoredValue) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.SetVariable) {
            return ((DivActionSetVariableJsonParser$EntityParserImpl) this.component.getDivActionSetVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.SetVariable) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.ShowTooltip) {
            return ((DivActionShowTooltipJsonParser$EntityParserImpl) this.component.getDivActionShowTooltipJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.ShowTooltip) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.Submit) {
            return ((DivActionSubmitJsonParser$EntityParserImpl) this.component.getDivActionSubmitJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.Submit) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.Timer) {
            return ((DivActionTimerJsonParser.EntityParserImpl) this.component.getDivActionTimerJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.Timer) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.UpdateStructure) {
            return ((DivActionUpdateStructureJsonParser.EntityParserImpl) this.component.getDivActionUpdateStructureJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.UpdateStructure) divActionTyped).getValue());
        }
        if (divActionTyped instanceof DivActionTyped.Video) {
            return ((DivActionVideoJsonParser.EntityParserImpl) this.component.getDivActionVideoJsonEntityParser().getValue()).serialize(parsingContext, ((DivActionTyped.Video) divActionTyped).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
