package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionTyped.kt */
/* loaded from: classes.dex */
public abstract class DivActionTyped implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionTyped$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionTyped invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionTyped.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivActionTyped(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivActionTyped.kt */
    public static final class AnimatorStart extends DivActionTyped {
        private final DivActionAnimatorStart value;

        public AnimatorStart(DivActionAnimatorStart divActionAnimatorStart) {
            super(null);
            this.value = divActionAnimatorStart;
        }

        public final DivActionAnimatorStart getValue() {
            return this.value;
        }
    }

    private DivActionTyped() {
    }

    /* compiled from: DivActionTyped.kt */
    public static final class AnimatorStop extends DivActionTyped {
        private final DivActionAnimatorStop value;

        public AnimatorStop(DivActionAnimatorStop divActionAnimatorStop) {
            super(null);
            this.value = divActionAnimatorStop;
        }

        public final DivActionAnimatorStop getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class ArrayInsertValue extends DivActionTyped {
        private final DivActionArrayInsertValue value;

        public ArrayInsertValue(DivActionArrayInsertValue divActionArrayInsertValue) {
            super(null);
            this.value = divActionArrayInsertValue;
        }

        public final DivActionArrayInsertValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class ArrayRemoveValue extends DivActionTyped {
        private final DivActionArrayRemoveValue value;

        public ArrayRemoveValue(DivActionArrayRemoveValue divActionArrayRemoveValue) {
            super(null);
            this.value = divActionArrayRemoveValue;
        }

        public final DivActionArrayRemoveValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class ArraySetValue extends DivActionTyped {
        private final DivActionArraySetValue value;

        public ArraySetValue(DivActionArraySetValue divActionArraySetValue) {
            super(null);
            this.value = divActionArraySetValue;
        }

        public final DivActionArraySetValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class ClearFocus extends DivActionTyped {
        private final DivActionClearFocus value;

        public ClearFocus(DivActionClearFocus divActionClearFocus) {
            super(null);
            this.value = divActionClearFocus;
        }

        public final DivActionClearFocus getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class CopyToClipboard extends DivActionTyped {
        private final DivActionCopyToClipboard value;

        public CopyToClipboard(DivActionCopyToClipboard divActionCopyToClipboard) {
            super(null);
            this.value = divActionCopyToClipboard;
        }

        public final DivActionCopyToClipboard getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class DictSetValue extends DivActionTyped {
        private final DivActionDictSetValue value;

        public DictSetValue(DivActionDictSetValue divActionDictSetValue) {
            super(null);
            this.value = divActionDictSetValue;
        }

        public final DivActionDictSetValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class Download extends DivActionTyped {
        private final DivActionDownload value;

        public Download(DivActionDownload divActionDownload) {
            super(null);
            this.value = divActionDownload;
        }

        public final DivActionDownload getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class FocusElement extends DivActionTyped {
        private final DivActionFocusElement value;

        public FocusElement(DivActionFocusElement divActionFocusElement) {
            super(null);
            this.value = divActionFocusElement;
        }

        public final DivActionFocusElement getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class HideTooltip extends DivActionTyped {
        private final DivActionHideTooltip value;

        public HideTooltip(DivActionHideTooltip divActionHideTooltip) {
            super(null);
            this.value = divActionHideTooltip;
        }

        public final DivActionHideTooltip getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class ScrollBy extends DivActionTyped {
        private final DivActionScrollBy value;

        public ScrollBy(DivActionScrollBy divActionScrollBy) {
            super(null);
            this.value = divActionScrollBy;
        }

        public final DivActionScrollBy getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class ScrollTo extends DivActionTyped {
        private final DivActionScrollTo value;

        public ScrollTo(DivActionScrollTo divActionScrollTo) {
            super(null);
            this.value = divActionScrollTo;
        }

        public final DivActionScrollTo getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class SetState extends DivActionTyped {
        private final DivActionSetState value;

        public SetState(DivActionSetState divActionSetState) {
            super(null);
            this.value = divActionSetState;
        }

        public final DivActionSetState getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class SetStoredValue extends DivActionTyped {
        private final DivActionSetStoredValue value;

        public SetStoredValue(DivActionSetStoredValue divActionSetStoredValue) {
            super(null);
            this.value = divActionSetStoredValue;
        }

        public final DivActionSetStoredValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class SetVariable extends DivActionTyped {
        private final DivActionSetVariable value;

        public SetVariable(DivActionSetVariable divActionSetVariable) {
            super(null);
            this.value = divActionSetVariable;
        }

        public final DivActionSetVariable getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class ShowTooltip extends DivActionTyped {
        private final DivActionShowTooltip value;

        public ShowTooltip(DivActionShowTooltip divActionShowTooltip) {
            super(null);
            this.value = divActionShowTooltip;
        }

        public final DivActionShowTooltip getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class Submit extends DivActionTyped {
        private final DivActionSubmit value;

        public Submit(DivActionSubmit divActionSubmit) {
            super(null);
            this.value = divActionSubmit;
        }

        public final DivActionSubmit getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class Timer extends DivActionTyped {
        private final DivActionTimer value;

        public Timer(DivActionTimer divActionTimer) {
            super(null);
            this.value = divActionTimer;
        }

        public final DivActionTimer getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class UpdateStructure extends DivActionTyped {
        private final DivActionUpdateStructure value;

        public UpdateStructure(DivActionUpdateStructure divActionUpdateStructure) {
            super(null);
            this.value = divActionUpdateStructure;
        }

        public final DivActionUpdateStructure getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionTyped.kt */
    public static final class Video extends DivActionTyped {
        private final DivActionVideo value;

        public Video(DivActionVideo divActionVideo) {
            super(null);
            this.value = divActionVideo;
        }

        public final DivActionVideo getValue() {
            return this.value;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int propertiesHash;
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof AnimatorStart) {
            propertiesHash = ((AnimatorStart) this).getValue().propertiesHash();
        } else if (this instanceof AnimatorStop) {
            propertiesHash = ((AnimatorStop) this).getValue().propertiesHash();
        } else if (this instanceof ArrayInsertValue) {
            propertiesHash = ((ArrayInsertValue) this).getValue().propertiesHash();
        } else if (this instanceof ArrayRemoveValue) {
            propertiesHash = ((ArrayRemoveValue) this).getValue().propertiesHash();
        } else if (this instanceof ArraySetValue) {
            propertiesHash = ((ArraySetValue) this).getValue().propertiesHash();
        } else if (this instanceof ClearFocus) {
            propertiesHash = ((ClearFocus) this).getValue().propertiesHash();
        } else if (this instanceof CopyToClipboard) {
            propertiesHash = ((CopyToClipboard) this).getValue().propertiesHash();
        } else if (this instanceof DictSetValue) {
            propertiesHash = ((DictSetValue) this).getValue().propertiesHash();
        } else if (this instanceof Download) {
            propertiesHash = ((Download) this).getValue().propertiesHash();
        } else if (this instanceof FocusElement) {
            propertiesHash = ((FocusElement) this).getValue().propertiesHash();
        } else if (this instanceof HideTooltip) {
            propertiesHash = ((HideTooltip) this).getValue().propertiesHash();
        } else if (this instanceof ScrollBy) {
            propertiesHash = ((ScrollBy) this).getValue().propertiesHash();
        } else if (this instanceof ScrollTo) {
            propertiesHash = ((ScrollTo) this).getValue().propertiesHash();
        } else if (this instanceof SetState) {
            propertiesHash = ((SetState) this).getValue().propertiesHash();
        } else if (this instanceof SetStoredValue) {
            propertiesHash = ((SetStoredValue) this).getValue().propertiesHash();
        } else if (this instanceof SetVariable) {
            propertiesHash = ((SetVariable) this).getValue().propertiesHash();
        } else if (this instanceof ShowTooltip) {
            propertiesHash = ((ShowTooltip) this).getValue().propertiesHash();
        } else if (this instanceof Submit) {
            propertiesHash = ((Submit) this).getValue().propertiesHash();
        } else if (this instanceof Timer) {
            propertiesHash = ((Timer) this).getValue().propertiesHash();
        } else if (this instanceof UpdateStructure) {
            propertiesHash = ((UpdateStructure) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Video)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Video) this).getValue().propertiesHash();
        }
        int i = hashCode + propertiesHash;
        this._propertiesHash = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof AnimatorStart) {
            hash = ((AnimatorStart) this).getValue().hash();
        } else if (this instanceof AnimatorStop) {
            hash = ((AnimatorStop) this).getValue().hash();
        } else if (this instanceof ArrayInsertValue) {
            hash = ((ArrayInsertValue) this).getValue().hash();
        } else if (this instanceof ArrayRemoveValue) {
            hash = ((ArrayRemoveValue) this).getValue().hash();
        } else if (this instanceof ArraySetValue) {
            hash = ((ArraySetValue) this).getValue().hash();
        } else if (this instanceof ClearFocus) {
            hash = ((ClearFocus) this).getValue().hash();
        } else if (this instanceof CopyToClipboard) {
            hash = ((CopyToClipboard) this).getValue().hash();
        } else if (this instanceof DictSetValue) {
            hash = ((DictSetValue) this).getValue().hash();
        } else if (this instanceof Download) {
            hash = ((Download) this).getValue().hash();
        } else if (this instanceof FocusElement) {
            hash = ((FocusElement) this).getValue().hash();
        } else if (this instanceof HideTooltip) {
            hash = ((HideTooltip) this).getValue().hash();
        } else if (this instanceof ScrollBy) {
            hash = ((ScrollBy) this).getValue().hash();
        } else if (this instanceof ScrollTo) {
            hash = ((ScrollTo) this).getValue().hash();
        } else if (this instanceof SetState) {
            hash = ((SetState) this).getValue().hash();
        } else if (this instanceof SetStoredValue) {
            hash = ((SetStoredValue) this).getValue().hash();
        } else if (this instanceof SetVariable) {
            hash = ((SetVariable) this).getValue().hash();
        } else if (this instanceof ShowTooltip) {
            hash = ((ShowTooltip) this).getValue().hash();
        } else if (this instanceof Submit) {
            hash = ((Submit) this).getValue().hash();
        } else if (this instanceof Timer) {
            hash = ((Timer) this).getValue().hash();
        } else if (this instanceof UpdateStructure) {
            hash = ((UpdateStructure) this).getValue().hash();
        } else {
            if (!(this instanceof Video)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Video) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivActionTyped divActionTyped, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionTyped == null) {
            return false;
        }
        if (this instanceof AnimatorStart) {
            DivActionAnimatorStart value = ((AnimatorStart) this).getValue();
            Object value2 = divActionTyped.value();
            return value.equals(value2 instanceof DivActionAnimatorStart ? (DivActionAnimatorStart) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof AnimatorStop) {
            DivActionAnimatorStop value3 = ((AnimatorStop) this).getValue();
            Object value4 = divActionTyped.value();
            return value3.equals(value4 instanceof DivActionAnimatorStop ? (DivActionAnimatorStop) value4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof ArrayInsertValue) {
            DivActionArrayInsertValue value5 = ((ArrayInsertValue) this).getValue();
            Object value6 = divActionTyped.value();
            return value5.equals(value6 instanceof DivActionArrayInsertValue ? (DivActionArrayInsertValue) value6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof ArrayRemoveValue) {
            DivActionArrayRemoveValue value7 = ((ArrayRemoveValue) this).getValue();
            Object value8 = divActionTyped.value();
            return value7.equals(value8 instanceof DivActionArrayRemoveValue ? (DivActionArrayRemoveValue) value8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof ArraySetValue) {
            DivActionArraySetValue value9 = ((ArraySetValue) this).getValue();
            Object value10 = divActionTyped.value();
            return value9.equals(value10 instanceof DivActionArraySetValue ? (DivActionArraySetValue) value10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof ClearFocus) {
            DivActionClearFocus value11 = ((ClearFocus) this).getValue();
            Object value12 = divActionTyped.value();
            return value11.equals(value12 instanceof DivActionClearFocus ? (DivActionClearFocus) value12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof CopyToClipboard) {
            DivActionCopyToClipboard value13 = ((CopyToClipboard) this).getValue();
            Object value14 = divActionTyped.value();
            return value13.equals(value14 instanceof DivActionCopyToClipboard ? (DivActionCopyToClipboard) value14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof DictSetValue) {
            DivActionDictSetValue value15 = ((DictSetValue) this).getValue();
            Object value16 = divActionTyped.value();
            return value15.equals(value16 instanceof DivActionDictSetValue ? (DivActionDictSetValue) value16 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Download) {
            DivActionDownload value17 = ((Download) this).getValue();
            Object value18 = divActionTyped.value();
            return value17.equals(value18 instanceof DivActionDownload ? (DivActionDownload) value18 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof FocusElement) {
            DivActionFocusElement value19 = ((FocusElement) this).getValue();
            Object value20 = divActionTyped.value();
            return value19.equals(value20 instanceof DivActionFocusElement ? (DivActionFocusElement) value20 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof HideTooltip) {
            DivActionHideTooltip value21 = ((HideTooltip) this).getValue();
            Object value22 = divActionTyped.value();
            return value21.equals(value22 instanceof DivActionHideTooltip ? (DivActionHideTooltip) value22 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof ScrollBy) {
            DivActionScrollBy value23 = ((ScrollBy) this).getValue();
            Object value24 = divActionTyped.value();
            return value23.equals(value24 instanceof DivActionScrollBy ? (DivActionScrollBy) value24 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof ScrollTo) {
            DivActionScrollTo value25 = ((ScrollTo) this).getValue();
            Object value26 = divActionTyped.value();
            return value25.equals(value26 instanceof DivActionScrollTo ? (DivActionScrollTo) value26 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof SetState) {
            DivActionSetState value27 = ((SetState) this).getValue();
            Object value28 = divActionTyped.value();
            return value27.equals(value28 instanceof DivActionSetState ? (DivActionSetState) value28 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof SetStoredValue) {
            DivActionSetStoredValue value29 = ((SetStoredValue) this).getValue();
            Object value30 = divActionTyped.value();
            return value29.equals(value30 instanceof DivActionSetStoredValue ? (DivActionSetStoredValue) value30 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof SetVariable) {
            DivActionSetVariable value31 = ((SetVariable) this).getValue();
            Object value32 = divActionTyped.value();
            return value31.equals(value32 instanceof DivActionSetVariable ? (DivActionSetVariable) value32 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof ShowTooltip) {
            DivActionShowTooltip value33 = ((ShowTooltip) this).getValue();
            Object value34 = divActionTyped.value();
            return value33.equals(value34 instanceof DivActionShowTooltip ? (DivActionShowTooltip) value34 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Submit) {
            DivActionSubmit value35 = ((Submit) this).getValue();
            Object value36 = divActionTyped.value();
            return value35.equals(value36 instanceof DivActionSubmit ? (DivActionSubmit) value36 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Timer) {
            DivActionTimer value37 = ((Timer) this).getValue();
            Object value38 = divActionTyped.value();
            return value37.equals(value38 instanceof DivActionTimer ? (DivActionTimer) value38 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof UpdateStructure) {
            DivActionUpdateStructure value39 = ((UpdateStructure) this).getValue();
            Object value40 = divActionTyped.value();
            return value39.equals(value40 instanceof DivActionUpdateStructure ? (DivActionUpdateStructure) value40 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Video)) {
            throw new NoWhenBranchMatchedException();
        }
        DivActionVideo value41 = ((Video) this).getValue();
        Object value42 = divActionTyped.value();
        return value41.equals(value42 instanceof DivActionVideo ? (DivActionVideo) value42 : null, expressionResolver, expressionResolver2);
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
        return ((DivActionTypedJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionTypedJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionTyped.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionTyped fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionTypedJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionTypedJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
