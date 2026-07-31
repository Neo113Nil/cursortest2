package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionAnimatorStartJsonParser;
import com.yandex.div2.DivActionScrollByJsonParser;
import com.yandex.div2.DivActionScrollToJsonParser;
import com.yandex.div2.DivActionSetStateJsonParser;
import com.yandex.div2.DivActionTimerJsonParser;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivActionTypedTemplate;
import com.yandex.div2.DivActionUpdateStructureJsonParser;
import com.yandex.div2.DivActionVideoJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivActionTypedJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivActionTypedJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionTypedJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionTyped resolve(ParsingContext parsingContext, DivActionTypedTemplate divActionTypedTemplate, JSONObject jSONObject) {
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.AnimatorStart) {
            return new DivActionTyped.AnimatorStart(((DivActionAnimatorStartJsonParser.TemplateResolverImpl) this.component.getDivActionAnimatorStartJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.AnimatorStart) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.AnimatorStop) {
            return new DivActionTyped.AnimatorStop(((DivActionAnimatorStopJsonParser$TemplateResolverImpl) this.component.getDivActionAnimatorStopJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.AnimatorStop) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ArrayInsertValue) {
            return new DivActionTyped.ArrayInsertValue(((DivActionArrayInsertValueJsonParser$TemplateResolverImpl) this.component.getDivActionArrayInsertValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.ArrayInsertValue) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ArrayRemoveValue) {
            return new DivActionTyped.ArrayRemoveValue(((DivActionArrayRemoveValueJsonParser$TemplateResolverImpl) this.component.getDivActionArrayRemoveValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.ArrayRemoveValue) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ArraySetValue) {
            return new DivActionTyped.ArraySetValue(((DivActionArraySetValueJsonParser$TemplateResolverImpl) this.component.getDivActionArraySetValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.ArraySetValue) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ClearFocus) {
            return new DivActionTyped.ClearFocus(((DivActionClearFocusJsonParser$TemplateResolverImpl) this.component.getDivActionClearFocusJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.ClearFocus) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.CopyToClipboard) {
            return new DivActionTyped.CopyToClipboard(((DivActionCopyToClipboardJsonParser$TemplateResolverImpl) this.component.getDivActionCopyToClipboardJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.CopyToClipboard) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.DictSetValue) {
            return new DivActionTyped.DictSetValue(((DivActionDictSetValueJsonParser$TemplateResolverImpl) this.component.getDivActionDictSetValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.DictSetValue) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.Download) {
            return new DivActionTyped.Download(((DivActionDownloadJsonParser$TemplateResolverImpl) this.component.getDivActionDownloadJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.Download) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.FocusElement) {
            return new DivActionTyped.FocusElement(((DivActionFocusElementJsonParser$TemplateResolverImpl) this.component.getDivActionFocusElementJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.FocusElement) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.HideTooltip) {
            return new DivActionTyped.HideTooltip(((DivActionHideTooltipJsonParser$TemplateResolverImpl) this.component.getDivActionHideTooltipJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.HideTooltip) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ScrollBy) {
            return new DivActionTyped.ScrollBy(((DivActionScrollByJsonParser.TemplateResolverImpl) this.component.getDivActionScrollByJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.ScrollBy) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ScrollTo) {
            return new DivActionTyped.ScrollTo(((DivActionScrollToJsonParser.TemplateResolverImpl) this.component.getDivActionScrollToJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.ScrollTo) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.SetState) {
            return new DivActionTyped.SetState(((DivActionSetStateJsonParser.TemplateResolverImpl) this.component.getDivActionSetStateJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.SetState) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.SetStoredValue) {
            return new DivActionTyped.SetStoredValue(((DivActionSetStoredValueJsonParser$TemplateResolverImpl) this.component.getDivActionSetStoredValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.SetStoredValue) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.SetVariable) {
            return new DivActionTyped.SetVariable(((DivActionSetVariableJsonParser$TemplateResolverImpl) this.component.getDivActionSetVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.SetVariable) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.ShowTooltip) {
            return new DivActionTyped.ShowTooltip(((DivActionShowTooltipJsonParser$TemplateResolverImpl) this.component.getDivActionShowTooltipJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.ShowTooltip) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.Submit) {
            return new DivActionTyped.Submit(((DivActionSubmitJsonParser$TemplateResolverImpl) this.component.getDivActionSubmitJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.Submit) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.Timer) {
            return new DivActionTyped.Timer(((DivActionTimerJsonParser.TemplateResolverImpl) this.component.getDivActionTimerJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.Timer) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.UpdateStructure) {
            return new DivActionTyped.UpdateStructure(((DivActionUpdateStructureJsonParser.TemplateResolverImpl) this.component.getDivActionUpdateStructureJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.UpdateStructure) divActionTypedTemplate).getValue(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.Video) {
            return new DivActionTyped.Video(((DivActionVideoJsonParser.TemplateResolverImpl) this.component.getDivActionVideoJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionTypedTemplate.Video) divActionTypedTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
