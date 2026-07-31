package com.yandex.div2;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionTypedTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionTypedTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivActionTypedTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionTypedTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionTypedTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionTypedTemplate.Companion.invoke$default(DivActionTypedTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivActionTypedTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class AnimatorStart extends DivActionTypedTemplate {
        private final DivActionAnimatorStartTemplate value;

        public AnimatorStart(DivActionAnimatorStartTemplate divActionAnimatorStartTemplate) {
            super(null);
            this.value = divActionAnimatorStartTemplate;
        }

        public final DivActionAnimatorStartTemplate getValue() {
            return this.value;
        }
    }

    private DivActionTypedTemplate() {
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class AnimatorStop extends DivActionTypedTemplate {
        private final DivActionAnimatorStopTemplate value;

        public AnimatorStop(DivActionAnimatorStopTemplate divActionAnimatorStopTemplate) {
            super(null);
            this.value = divActionAnimatorStopTemplate;
        }

        public final DivActionAnimatorStopTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class ArrayInsertValue extends DivActionTypedTemplate {
        private final DivActionArrayInsertValueTemplate value;

        public ArrayInsertValue(DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate) {
            super(null);
            this.value = divActionArrayInsertValueTemplate;
        }

        public final DivActionArrayInsertValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class ArrayRemoveValue extends DivActionTypedTemplate {
        private final DivActionArrayRemoveValueTemplate value;

        public ArrayRemoveValue(DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate) {
            super(null);
            this.value = divActionArrayRemoveValueTemplate;
        }

        public final DivActionArrayRemoveValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class ArraySetValue extends DivActionTypedTemplate {
        private final DivActionArraySetValueTemplate value;

        public ArraySetValue(DivActionArraySetValueTemplate divActionArraySetValueTemplate) {
            super(null);
            this.value = divActionArraySetValueTemplate;
        }

        public final DivActionArraySetValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class ClearFocus extends DivActionTypedTemplate {
        private final DivActionClearFocusTemplate value;

        public ClearFocus(DivActionClearFocusTemplate divActionClearFocusTemplate) {
            super(null);
            this.value = divActionClearFocusTemplate;
        }

        public final DivActionClearFocusTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class CopyToClipboard extends DivActionTypedTemplate {
        private final DivActionCopyToClipboardTemplate value;

        public CopyToClipboard(DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate) {
            super(null);
            this.value = divActionCopyToClipboardTemplate;
        }

        public final DivActionCopyToClipboardTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class DictSetValue extends DivActionTypedTemplate {
        private final DivActionDictSetValueTemplate value;

        public DictSetValue(DivActionDictSetValueTemplate divActionDictSetValueTemplate) {
            super(null);
            this.value = divActionDictSetValueTemplate;
        }

        public final DivActionDictSetValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class Download extends DivActionTypedTemplate {
        private final DivActionDownloadTemplate value;

        public Download(DivActionDownloadTemplate divActionDownloadTemplate) {
            super(null);
            this.value = divActionDownloadTemplate;
        }

        public final DivActionDownloadTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class FocusElement extends DivActionTypedTemplate {
        private final DivActionFocusElementTemplate value;

        public FocusElement(DivActionFocusElementTemplate divActionFocusElementTemplate) {
            super(null);
            this.value = divActionFocusElementTemplate;
        }

        public final DivActionFocusElementTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class HideTooltip extends DivActionTypedTemplate {
        private final DivActionHideTooltipTemplate value;

        public HideTooltip(DivActionHideTooltipTemplate divActionHideTooltipTemplate) {
            super(null);
            this.value = divActionHideTooltipTemplate;
        }

        public final DivActionHideTooltipTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class ScrollBy extends DivActionTypedTemplate {
        private final DivActionScrollByTemplate value;

        public ScrollBy(DivActionScrollByTemplate divActionScrollByTemplate) {
            super(null);
            this.value = divActionScrollByTemplate;
        }

        public final DivActionScrollByTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class ScrollTo extends DivActionTypedTemplate {
        private final DivActionScrollToTemplate value;

        public ScrollTo(DivActionScrollToTemplate divActionScrollToTemplate) {
            super(null);
            this.value = divActionScrollToTemplate;
        }

        public final DivActionScrollToTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class SetState extends DivActionTypedTemplate {
        private final DivActionSetStateTemplate value;

        public SetState(DivActionSetStateTemplate divActionSetStateTemplate) {
            super(null);
            this.value = divActionSetStateTemplate;
        }

        public final DivActionSetStateTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class SetStoredValue extends DivActionTypedTemplate {
        private final DivActionSetStoredValueTemplate value;

        public SetStoredValue(DivActionSetStoredValueTemplate divActionSetStoredValueTemplate) {
            super(null);
            this.value = divActionSetStoredValueTemplate;
        }

        public final DivActionSetStoredValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class SetVariable extends DivActionTypedTemplate {
        private final DivActionSetVariableTemplate value;

        public SetVariable(DivActionSetVariableTemplate divActionSetVariableTemplate) {
            super(null);
            this.value = divActionSetVariableTemplate;
        }

        public final DivActionSetVariableTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class ShowTooltip extends DivActionTypedTemplate {
        private final DivActionShowTooltipTemplate value;

        public ShowTooltip(DivActionShowTooltipTemplate divActionShowTooltipTemplate) {
            super(null);
            this.value = divActionShowTooltipTemplate;
        }

        public final DivActionShowTooltipTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class Submit extends DivActionTypedTemplate {
        private final DivActionSubmitTemplate value;

        public Submit(DivActionSubmitTemplate divActionSubmitTemplate) {
            super(null);
            this.value = divActionSubmitTemplate;
        }

        public final DivActionSubmitTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class Timer extends DivActionTypedTemplate {
        private final DivActionTimerTemplate value;

        public Timer(DivActionTimerTemplate divActionTimerTemplate) {
            super(null);
            this.value = divActionTimerTemplate;
        }

        public final DivActionTimerTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class UpdateStructure extends DivActionTypedTemplate {
        private final DivActionUpdateStructureTemplate value;

        public UpdateStructure(DivActionUpdateStructureTemplate divActionUpdateStructureTemplate) {
            super(null);
            this.value = divActionUpdateStructureTemplate;
        }

        public final DivActionUpdateStructureTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class Video extends DivActionTypedTemplate {
        private final DivActionVideoTemplate value;

        public Video(DivActionVideoTemplate divActionVideoTemplate) {
            super(null);
            this.value = divActionVideoTemplate;
        }

        public final DivActionVideoTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof AnimatorStart) {
            return ((AnimatorStart) this).getValue();
        }
        if (this instanceof AnimatorStop) {
            return ((AnimatorStop) this).getValue();
        }
        if (this instanceof ArrayInsertValue) {
            return ((ArrayInsertValue) this).getValue();
        }
        if (this instanceof ArrayRemoveValue) {
            return ((ArrayRemoveValue) this).getValue();
        }
        if (this instanceof ArraySetValue) {
            return ((ArraySetValue) this).getValue();
        }
        if (this instanceof ClearFocus) {
            return ((ClearFocus) this).getValue();
        }
        if (this instanceof CopyToClipboard) {
            return ((CopyToClipboard) this).getValue();
        }
        if (this instanceof DictSetValue) {
            return ((DictSetValue) this).getValue();
        }
        if (this instanceof Download) {
            return ((Download) this).getValue();
        }
        if (this instanceof FocusElement) {
            return ((FocusElement) this).getValue();
        }
        if (this instanceof HideTooltip) {
            return ((HideTooltip) this).getValue();
        }
        if (this instanceof ScrollBy) {
            return ((ScrollBy) this).getValue();
        }
        if (this instanceof ScrollTo) {
            return ((ScrollTo) this).getValue();
        }
        if (this instanceof SetState) {
            return ((SetState) this).getValue();
        }
        if (this instanceof SetStoredValue) {
            return ((SetStoredValue) this).getValue();
        }
        if (this instanceof SetVariable) {
            return ((SetVariable) this).getValue();
        }
        if (this instanceof ShowTooltip) {
            return ((ShowTooltip) this).getValue();
        }
        if (this instanceof Submit) {
            return ((Submit) this).getValue();
        }
        if (this instanceof Timer) {
            return ((Timer) this).getValue();
        }
        if (this instanceof UpdateStructure) {
            return ((UpdateStructure) this).getValue();
        }
        if (this instanceof Video) {
            return ((Video) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionTypedJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionTypedJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionTyped resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionTypedJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionTypedJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof AnimatorStart) {
            return "animator_start";
        }
        if (this instanceof AnimatorStop) {
            return "animator_stop";
        }
        if (this instanceof ArrayInsertValue) {
            return "array_insert_value";
        }
        if (this instanceof ArrayRemoveValue) {
            return "array_remove_value";
        }
        if (this instanceof ArraySetValue) {
            return "array_set_value";
        }
        if (this instanceof ClearFocus) {
            return "clear_focus";
        }
        if (this instanceof CopyToClipboard) {
            return "copy_to_clipboard";
        }
        if (this instanceof DictSetValue) {
            return "dict_set_value";
        }
        if (this instanceof Download) {
            return "download";
        }
        if (this instanceof FocusElement) {
            return "focus_element";
        }
        if (this instanceof HideTooltip) {
            return "hide_tooltip";
        }
        if (this instanceof ScrollBy) {
            return "scroll_by";
        }
        if (this instanceof ScrollTo) {
            return "scroll_to";
        }
        if (this instanceof SetState) {
            return "set_state";
        }
        if (this instanceof SetStoredValue) {
            return "set_stored_value";
        }
        if (this instanceof SetVariable) {
            return "set_variable";
        }
        if (this instanceof ShowTooltip) {
            return "show_tooltip";
        }
        if (this instanceof Submit) {
            return DivActionHandler.DivActionReason.SUBMIT;
        }
        if (this instanceof Timer) {
            return DivActionHandler.DivActionReason.TIMER;
        }
        if (this instanceof UpdateStructure) {
            return "update_structure";
        }
        if (this instanceof Video) {
            return "video";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivActionTypedTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivActionTypedTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivActionTypedTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivActionTypedJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionTypedJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
