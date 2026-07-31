package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.View;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.util.inputfilter.BaseInputFilter;
import com.yandex.div.core.util.inputfilter.ExpressionInputFilter;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.inputfilter.RegexInputFilter;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.CurrencyInputMask;
import com.yandex.div.core.util.mask.FixedLengthInputMask;
import com.yandex.div.core.util.mask.PhoneInputMask;
import com.yandex.div.core.util.mask.PhoneInputMaskKt;
import com.yandex.div.core.util.validator.ExpressionValidator;
import com.yandex.div.core.util.validator.RegexValidator;
import com.yandex.div.core.util.validator.ValidatorItemData;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivCurrencyInputMask;
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputFilter;
import com.yandex.div2.DivInputMask;
import com.yandex.div2.DivInputMaskBase;
import com.yandex.div2.DivInputValidator;
import com.yandex.div2.DivInputValidatorExpression;
import com.yandex.div2.DivInputValidatorRegex;
import com.yandex.div2.DivPhoneInputMask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000Ç\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00012\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B7\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J&\u0010\u001c\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0002J\u001e\u0010\"\u001a\u00020\u001d*\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010'\u001a\u00020\u001d*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020-H\u0002J.\u0010.\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u000200H\u0014J?\u00101\u001a\u000202*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001062\u0006\u0010)\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0002\u00109J.\u0010:\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010;\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J$\u0010<\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J2\u0010=\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0014\u0010>\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020\u001d0?H\u0002J\u001c\u0010@\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010A\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010B\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010C\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010D\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J:\u0010E\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*2\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u001d0?H\u0002J\u001c\u0010G\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010H\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010I\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J$\u0010J\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010/\u001a\u000200H\u0002J0\u0010K\u001a\u00020\u001d*\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0L2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0L2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J$\u0010M\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002J\u001e\u0010N\u001a\u0004\u0018\u00010(*\u00020O2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010P\u001a\u00020QH\u0002J,\u0010R\u001a\u00020\u001d*\u00020(2\u0006\u0010S\u001a\u0002082\u0006\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivInputBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Input;", "Lcom/yandex/div2/DivInput;", "Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "typefaceResolver", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "variableBinder", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "actionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "accessibilityStateProvider", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/util/AccessibilityStateProvider;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "getCapitalization", "", "div", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "getImeAction", "type", "Lcom/yandex/div2/DivInput$EnterKeyType;", "getKeyboardType", "Lcom/yandex/div2/DivInput$KeyboardType;", "applyNativeBackgroundColor", "", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "newDiv", "oldDiv", "applyTextAlignment", "horizontalAlignment", "Lcom/yandex/div2/DivAlignmentHorizontal;", "verticalAlignment", "Lcom/yandex/div2/DivAlignmentVertical;", "attachAccessibility", "Lcom/yandex/div/core/util/validator/ValidatorItemData;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "view", "isValid", "", "bind", "path", "Lcom/yandex/div/core/state/DivStatePath;", "createCallbacks", "com/yandex/div/core/view2/divs/DivInputBinder$createCallbacks$1", "inputMask", "Lcom/yandex/div/core/util/mask/BaseInputMask;", "filters", "Lcom/yandex/div/core/util/inputfilter/InputFiltersHolder;", "secondaryVariable", "", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/util/mask/BaseInputMask;Lcom/yandex/div/core/util/inputfilter/InputFiltersHolder;Lcom/yandex/div/core/view2/Div2View;Ljava/lang/String;)Lcom/yandex/div/core/view2/divs/DivInputBinder$createCallbacks$1;", "observeBackground", "observeBaseTextProperties", "observeEnterTypeAndActions", "observeFilters", "onFiltersUpdate", "Lkotlin/Function1;", "observeHighlightColor", "observeHintColor", "observeHintText", "observeIsEnabled", "observeKeyboardTypeAndCapitalization", "observeMask", "onMaskUpdate", "observeMaxLength", "observeMaxVisibleLines", "observeSelectAllOnFocus", "observeText", "observeTextAlignment", "Lcom/yandex/div/json/expressions/Expression;", "observeValidators", "toValidatorDataItem", "Lcom/yandex/div2/DivInputValidator;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "validate", "newValue", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes9.dex */
public final class DivInputBinder extends DivViewBinder<Div.Input, DivInput, DivInputView> {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    /* compiled from: DivInputBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivInput.KeyboardType.values().length];
            try {
                iArr2[DivInput.KeyboardType.SINGLE_LINE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DivInput.KeyboardType.MULTI_LINE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DivInput.KeyboardType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DivInput.KeyboardType.URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DivInput.KeyboardType.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DivInput.KeyboardType.PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DivInput.KeyboardType.PASSWORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivInput.EnterKeyType.values().length];
            try {
                iArr3[DivInput.EnterKeyType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[DivInput.EnterKeyType.SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[DivInput.EnterKeyType.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[DivInput.EnterKeyType.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[DivInput.EnterKeyType.GO.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivInput.Autocapitalization.values().length];
            try {
                iArr4[DivInput.Autocapitalization.SENTENCES.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[DivInput.Autocapitalization.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[DivInput.Autocapitalization.ALL_CHARACTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public DivInputBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull TwoWayStringVariableBinder twoWayStringVariableBinder, @NotNull DivActionBinder divActionBinder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayStringVariableBinder;
        this.actionBinder = divActionBinder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivInputView divInputView, @NotNull BindingContext bindingContext, @NotNull DivInput divInput, @Nullable DivInput divInput2, @NotNull DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divInputView.setTextAlignment(5);
        divInputView.setAccessibilityEnabled$div_release(this.accessibilityStateProvider.isAccessibilityEnabled(divInputView.getContext()));
        observeBackground(divInputView, bindingContext, divInput, divInput2, expressionResolver);
        observeBaseTextProperties(divInputView, divInput, divInput2, expressionResolver);
        observeTextAlignment(divInputView, divInput.textAlignmentHorizontal, divInput.textAlignmentVertical, expressionResolver);
        observeMaxVisibleLines(divInputView, divInput, expressionResolver);
        observeMaxLength(divInputView, divInput, expressionResolver);
        observeHintText(divInputView, divInput, expressionResolver);
        observeHintColor(divInputView, divInput, expressionResolver);
        observeHighlightColor(divInputView, divInput, expressionResolver);
        observeKeyboardTypeAndCapitalization(divInputView, divInput, expressionResolver);
        observeEnterTypeAndActions(divInputView, divInput, bindingContext, expressionResolver);
        observeSelectAllOnFocus(divInputView, divInput, expressionResolver);
        observeIsEnabled(divInputView, divInput, expressionResolver);
        observeText(divInputView, divInput, bindingContext, divStatePath);
        divInputView.setFocusTracker$div_release(bindingContext.getDivView().getInputFocusTracker());
        InputFocusTracker focusTracker = divInputView.getFocusTracker();
        if (focusTracker != null) {
            focusTracker.requestFocusIfNeeded(divInputView);
        }
    }

    private final void observeTextAlignment(final DivInputView divInputView, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2, final ExpressionResolver expressionResolver) {
        applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeTextAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7210invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7210invoke(@NotNull Object obj) {
                DivInputBinder.this.applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
            }
        };
        divInputView.addSubscription(expression.observe(expressionResolver, function1));
        divInputView.addSubscription(expression2.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextAlignment(DivInputView divInputView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        divInputView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        int i = divAlignmentHorizontal == null ? -1 : WhenMappings.$EnumSwitchMapping$0[divAlignmentHorizontal.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i2 = 6;
            }
        }
        divInputView.setTextAlignment(i2);
    }

    private final void observeBackground(final DivInputView divInputView, final BindingContext bindingContext, final DivInput divInput, final DivInput divInput2, ExpressionResolver expressionResolver) {
        Expression expression;
        Disposable disposable = null;
        if (DivDataExtensionsKt.equalsToConstant(divInput.nativeInterface, divInput2 != null ? divInput2.nativeInterface : null)) {
            return;
        }
        applyNativeBackgroundColor(divInputView, bindingContext, divInput, divInput2);
        if (DivDataExtensionsKt.isConstant(divInput.nativeInterface)) {
            return;
        }
        DivInput.NativeInterface nativeInterface = divInput.nativeInterface;
        if (nativeInterface != null && (expression = nativeInterface.color) != null) {
            disposable = expression.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeBackground$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    DivInputBinder.this.applyNativeBackgroundColor(divInputView, bindingContext, divInput, divInput2);
                }
            });
        }
        divInputView.addSubscription(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyNativeBackgroundColor(DivInputView divInputView, BindingContext bindingContext, DivInput divInput, DivInput divInput2) {
        Drawable nativeBackground;
        Drawable drawable;
        Expression expression;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivInput.NativeInterface nativeInterface = divInput.nativeInterface;
        int intValue = (nativeInterface == null || (expression = nativeInterface.color) == null) ? 0 : ((Number) expression.evaluate(expressionResolver)).intValue();
        if (intValue == 0 || (nativeBackground = divInputView.getNativeBackground()) == null) {
            drawable = null;
        } else {
            nativeBackground.setTint(intValue);
            drawable = nativeBackground;
        }
        this.baseBinder.bindBackground$div_release(bindingContext, divInputView, divInput, divInput2, ReleasablesKt.getExpressionSubscriber(divInputView), drawable);
    }

    private final void observeBaseTextProperties(DivInputView divInputView, DivInput divInput, DivInput divInput2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeBaseTextProperties(divInputView, divInput.fontSize, divInput.fontSizeUnit, divInput.letterSpacing, divInput.textColor, divInput.lineHeight, divInput.fontFamily, divInput.fontWeight, divInput.fontWeightValue, divInput.fontVariationSettings, divInput2 != null ? divInput2.fontSize : null, divInput2 != null ? divInput2.fontSizeUnit : null, divInput2 != null ? divInput2.letterSpacing : null, divInput2 != null ? divInput2.textColor : null, divInput2 != null ? divInput2.lineHeight : null, divInput2 != null ? divInput2.fontFamily : null, divInput2 != null ? divInput2.fontWeight : null, divInput2 != null ? divInput2.fontWeightValue : null, divInput2 != null ? divInput2.fontVariationSettings : null, divInput2, this.typefaceResolver, expressionResolver);
    }

    private final void observeMaxVisibleLines(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression expression = divInput.maxVisibleLines;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxVisibleLines$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7208invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7208invoke(@NotNull Object obj) {
                int i;
                DivInputView divInputView2 = DivInputView.this;
                long longValue = expression.evaluate(expressionResolver).longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divInputView2.setMaxLines(i);
            }
        }));
    }

    private final void observeMaxLength(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression expression = divInput.maxLength;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxLength$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7207invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7207invoke(@NotNull Object obj) {
                int i;
                DivInputView divInputView2 = DivInputView.this;
                long longValue = expression.evaluate(expressionResolver).longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divInputView2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
            }
        }));
    }

    private final void observeHintText(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression expression = divInput.hintText;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7204invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7204invoke(@NotNull Object obj) {
                DivInputView.this.setInputHint(expression.evaluate(expressionResolver));
            }
        }));
    }

    private final void observeHintColor(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.hintColor.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7203invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7203invoke(@NotNull Object obj) {
                DivInputView.this.setHintTextColor(((Number) divInput.hintColor.evaluate(expressionResolver)).intValue());
            }
        }));
    }

    private final void observeHighlightColor(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression expression = divInput.highlightColor;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHighlightColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7202invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7202invoke(@NotNull Object obj) {
                DivInputView.this.setHighlightColor(expression.evaluate(expressionResolver).intValue());
            }
        }));
    }

    private final void observeKeyboardTypeAndCapitalization(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7205invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7205invoke(@NotNull Object obj) {
                int keyboardType;
                int capitalization;
                DivInput.KeyboardType keyboardType2 = (DivInput.KeyboardType) DivInput.this.keyboardType.evaluate(expressionResolver);
                DivInputView divInputView2 = divInputView;
                keyboardType = this.getKeyboardType(keyboardType2);
                capitalization = this.getCapitalization(DivInput.this, expressionResolver);
                divInputView2.setInputType(keyboardType | capitalization);
                divInputView.setHorizontallyScrolling(keyboardType2 != DivInput.KeyboardType.MULTI_LINE_TEXT);
            }
        };
        divInputView.addSubscription(divInput.keyboardType.observe(expressionResolver, function1));
        divInputView.addSubscription(divInput.autocapitalization.observeAndGet(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyboardType(DivInput.KeyboardType type) {
        switch (WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 131073;
            case 3:
                return 33;
            case 4:
                return 17;
            case 5:
                return 12290;
            case 6:
                return 3;
            case 7:
                return 129;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void observeEnterTypeAndActions(DivInputView divInputView, DivInput divInput, BindingContext bindingContext, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.enterKeyType.observeAndGet(expressionResolver, new DivInputBinder$observeEnterTypeAndActions$callback$1(divInput, expressionResolver, divInputView, this, bindingContext)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImeAction(DivInput.EnterKeyType type) {
        int i = WhenMappings.$EnumSwitchMapping$2[type.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 6;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void observeSelectAllOnFocus(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.selectAllOnFocus.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeSelectAllOnFocus$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7209invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7209invoke(@NotNull Object obj) {
                DivInputView.this.setSelectAllOnFocus(((Boolean) divInput.selectAllOnFocus.evaluate(expressionResolver)).booleanValue());
            }
        }));
    }

    private final void observeIsEnabled(final DivInputView divInputView, DivInput divInput, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.isEnabled.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeIsEnabled$callback$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (!z && DivInputView.this.isFocused()) {
                    DivActionTypedUtilsKt.closeKeyboard(DivInputView.this);
                }
                DivInputView.this.setEnabled$div_release(z);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void observeText(final DivInputView divInputView, DivInput divInput, BindingContext bindingContext, DivStatePath divStatePath) {
        String str;
        String str2;
        DivInputMaskBase value;
        Div2View divView = bindingContext.getDivView();
        divInputView.removeAfterTextChangeListener();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        observeMask(divInputView, divInput, bindingContext.getExpressionResolver(), divView, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BaseInputMask) obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(@Nullable BaseInputMask baseInputMask) {
                ref$ObjectRef.element = baseInputMask;
                if (baseInputMask != 0) {
                    DivInputView divInputView2 = divInputView;
                    divInputView2.setText(baseInputMask.getValue());
                    divInputView2.setSelection(baseInputMask.getCursorPosition());
                }
            }
        });
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        observeFilters(divInputView, divInput, bindingContext, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InputFiltersHolder) obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(@Nullable InputFiltersHolder inputFiltersHolder) {
                String str3;
                ref$ObjectRef2.element = inputFiltersHolder;
                if (inputFiltersHolder != 0) {
                    DivInputView divInputView2 = divInputView;
                    Editable editableText = divInputView2.getEditableText();
                    if (editableText == null || (str3 = editableText.toString()) == null) {
                        str3 = "";
                    }
                    inputFiltersHolder.setCurrentValue(str3);
                    inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
                }
            }
        });
        DivInputMask divInputMask = divInput.mask;
        if (divInputMask == null) {
            str = divInput.textVariable;
            str2 = null;
        } else if (divInputMask == null || (value = divInputMask.value()) == null || (str = value.getRawTextVariable()) == null) {
            return;
        } else {
            str2 = divInput.textVariable;
        }
        divInputView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, createCallbacks(divInputView, bindingContext, (BaseInputMask) ref$ObjectRef.element, (InputFiltersHolder) ref$ObjectRef2.element, divView, str2), divStatePath));
        observeValidators(divInputView, divInput, bindingContext.getExpressionResolver(), divView);
    }

    private final DivInputBinder$createCallbacks$1 createCallbacks(DivInputView divInputView, BindingContext bindingContext, BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, Div2View div2View, String str) {
        return new DivInputBinder$createCallbacks$1(baseInputMask, inputFiltersHolder, divInputView, bindingContext, str);
    }

    private final void observeValidators(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver, final Div2View div2View) {
        final ArrayList arrayList = new ArrayList();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$revalidateExpressionValidator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                DivInputBinder.this.validate(arrayList.get(i), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
            }
        };
        divInputView.addTextChangedListener(new TextWatcher() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                if (s != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.validate((ValidatorItemData) it.next(), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
                    }
                }
            }
        });
        Function1 function12 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7211invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7211invoke(@NotNull Object obj) {
                ValidatorItemData validatorDataItem;
                arrayList.clear();
                List list = divInput.validators;
                if (list != null) {
                    DivInputBinder divInputBinder = this;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ErrorCollector errorCollector = orCreate;
                    List<ValidatorItemData> list2 = arrayList;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        validatorDataItem = divInputBinder.toValidatorDataItem((DivInputValidator) it.next(), expressionResolver2, errorCollector);
                        if (validatorDataItem != null) {
                            list2.add(validatorDataItem);
                        }
                    }
                    List<ValidatorItemData> list3 = arrayList;
                    DivInputBinder divInputBinder2 = this;
                    DivInputView divInputView2 = divInputView;
                    Div2View div2View2 = div2View;
                    ExpressionResolver expressionResolver3 = expressionResolver;
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        divInputBinder2.validate((ValidatorItemData) it2.next(), String.valueOf(divInputView2.getText()), divInputView2, div2View2, expressionResolver3);
                    }
                }
            }
        };
        List list = divInput.validators;
        if (list != null) {
            final int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DivInputValidator divInputValidator = (DivInputValidator) obj;
                if (divInputValidator instanceof DivInputValidator.Regex) {
                    DivInputValidator.Regex regex = (DivInputValidator.Regex) divInputValidator;
                    divInputView.addSubscription(regex.getValue().pattern.observe(expressionResolver, function12));
                    divInputView.addSubscription(regex.getValue().labelId.observe(expressionResolver, function12));
                    divInputView.addSubscription(regex.getValue().allowEmpty.observe(expressionResolver, function12));
                } else {
                    if (!(divInputValidator instanceof DivInputValidator.Expression)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DivInputValidator.Expression expression = (DivInputValidator.Expression) divInputValidator;
                    divInputView.addSubscription(expression.getValue().condition.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke(((Boolean) obj2).booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            Function1.this.invoke(Integer.valueOf(i));
                        }
                    }));
                    divInputView.addSubscription(expression.getValue().labelId.observe(expressionResolver, function12));
                    divInputView.addSubscription(expression.getValue().allowEmpty.observe(expressionResolver, function12));
                }
                i = i2;
            }
        }
        function12.invoke(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValidatorItemData toValidatorDataItem(DivInputValidator divInputValidator, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (divInputValidator instanceof DivInputValidator.Regex) {
            DivInputValidatorRegex value = ((DivInputValidator.Regex) divInputValidator).getValue();
            try {
                return new ValidatorItemData(new RegexValidator(new Regex((String) value.pattern.evaluate(expressionResolver)), ((Boolean) value.allowEmpty.evaluate(expressionResolver)).booleanValue()), value.variable, (String) value.labelId.evaluate(expressionResolver));
            } catch (PatternSyntaxException e) {
                errorCollector.logError(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + '\'', e));
                return null;
            }
        }
        if (!(divInputValidator instanceof DivInputValidator.Expression)) {
            throw new NoWhenBranchMatchedException();
        }
        final DivInputValidatorExpression value2 = ((DivInputValidator.Expression) divInputValidator).getValue();
        return new ValidatorItemData(new ExpressionValidator(((Boolean) value2.allowEmpty.evaluate(expressionResolver)).booleanValue(), new Function0() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$toValidatorDataItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                return (Boolean) DivInputValidatorExpression.this.condition.evaluate(expressionResolver);
            }
        }), value2.variable, (String) value2.labelId.evaluate(expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validate(ValidatorItemData validatorItemData, String str, DivInputView divInputView, Div2View div2View, ExpressionResolver expressionResolver) {
        boolean validate = validatorItemData.getValidator().validate(str);
        VariableMutationHandler.INSTANCE.setVariable(div2View, validatorItemData.getVariableName(), String.valueOf(validate), expressionResolver);
        attachAccessibility(validatorItemData, div2View, divInputView, validate);
    }

    private final void attachAccessibility(final ValidatorItemData validatorItemData, Div2View div2View, final DivInputView divInputView, final boolean z) {
        final IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't find label with id '" + validatorItemData.getLabelId() + '\'');
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent().getViewIdProvider();
        if (!divInputView.isLaidOut() || divInputView.isLayoutRequested()) {
            divInputView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$attachAccessibility$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int viewId = DivViewIdProvider.this.getViewId(validatorItemData.getLabelId());
                    if (viewId != -1) {
                        View findViewById = divInputView.getRootView().findViewById(viewId);
                        if (findViewById != null) {
                            findViewById.setLabelFor(z ? -1 : divInputView.getId());
                            return;
                        } else {
                            orCreate.logError(illegalArgumentException);
                            return;
                        }
                    }
                    orCreate.logError(illegalArgumentException);
                }
            });
            return;
        }
        int viewId = viewIdProvider.getViewId(validatorItemData.getLabelId());
        if (viewId != -1) {
            View findViewById = divInputView.getRootView().findViewById(viewId);
            if (findViewById != null) {
                findViewById.setLabelFor(z ? -1 : divInputView.getId());
                return;
            } else {
                orCreate.logError(illegalArgumentException);
                return;
            }
        }
        orCreate.logError(illegalArgumentException);
    }

    private final void observeMask(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver, Div2View div2View, final Function1 function1) {
        Expression expression;
        Disposable observe;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final KeyListener keyListener = divInputView.getKeyListener();
        final Function2 function2 = new Function2() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$catchCommonMaskException$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Exception) obj, (Function0) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Exception exc, @NotNull Function0 function0) {
                if (exc instanceof PatternSyntaxException) {
                    ErrorCollector.this.logError(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
                    return;
                }
                function0.mo4828invoke();
            }
        };
        Function1 function12 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7206invoke(obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7206invoke(@NotNull Object obj) {
                BaseInputMask baseInputMask;
                Locale locale;
                DivInputMask divInputMask = DivInput.this.mask;
                T t = 0;
                DivInputMaskBase value = divInputMask != null ? divInputMask.value() : null;
                Ref$ObjectRef<BaseInputMask> ref$ObjectRef2 = ref$ObjectRef;
                if (value instanceof DivFixedLengthInputMask) {
                    divInputView.setKeyListener(keyListener);
                    DivFixedLengthInputMask divFixedLengthInputMask = (DivFixedLengthInputMask) value;
                    String str = (String) divFixedLengthInputMask.pattern.evaluate(expressionResolver);
                    List<DivFixedLengthInputMask.PatternElement> list = divFixedLengthInputMask.patternElements;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (DivFixedLengthInputMask.PatternElement patternElement : list) {
                        char first = StringsKt.first((CharSequence) patternElement.key.evaluate(expressionResolver2));
                        Expression expression2 = patternElement.regex;
                        String str2 = expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null;
                        Character firstOrNull = StringsKt.firstOrNull((CharSequence) patternElement.placeholder.evaluate(expressionResolver2));
                        arrayList.add(new BaseInputMask.MaskKey(first, str2, firstOrNull != null ? firstOrNull.charValue() : (char) 0));
                    }
                    BaseInputMask.MaskData maskData = new BaseInputMask.MaskData(str, arrayList, ((Boolean) divFixedLengthInputMask.alwaysVisible.evaluate(expressionResolver)).booleanValue());
                    baseInputMask = ref$ObjectRef.element;
                    if (baseInputMask != null) {
                        BaseInputMask.updateMaskData$default(baseInputMask, maskData, false, 2, null);
                        t = baseInputMask;
                    } else {
                        final Function2 function22 = function2;
                        t = new FixedLengthInputMask(maskData, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Exception) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Exception exc) {
                                Function2.this.invoke(exc, new Function0() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.2.1
                                    public final void invoke() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                        invoke();
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        });
                    }
                } else if (value instanceof DivCurrencyInputMask) {
                    Expression expression3 = ((DivCurrencyInputMask) value).locale;
                    String str3 = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
                    if (str3 != null) {
                        locale = Locale.forLanguageTag(str3);
                        ErrorCollector errorCollector = orCreate;
                        String languageTag = locale.toLanguageTag();
                        if (!Intrinsics.areEqual(languageTag, str3)) {
                            errorCollector.logWarning(new IllegalArgumentException("Original locale tag '" + str3 + "' is not equals to final one '" + languageTag + '\''));
                        }
                    } else {
                        locale = Locale.getDefault();
                    }
                    divInputView.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
                    BaseInputMask baseInputMask2 = ref$ObjectRef.element;
                    BaseInputMask baseInputMask3 = baseInputMask2;
                    if (baseInputMask3 != null) {
                        Intrinsics.checkNotNull(baseInputMask2, "null cannot be cast to non-null type com.yandex.div.core.util.mask.CurrencyInputMask");
                        ((CurrencyInputMask) baseInputMask2).updateCurrencyParams(locale);
                        t = baseInputMask3;
                    } else {
                        final Function2 function23 = function2;
                        t = new CurrencyInputMask(locale, new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Exception) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Exception exc) {
                                Function2.this.invoke(exc, new Function0() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.4.1
                                    public final void invoke() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                        invoke();
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        });
                    }
                } else if (value instanceof DivPhoneInputMask) {
                    divInputView.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
                    baseInputMask = ref$ObjectRef.element;
                    if (baseInputMask != null) {
                        BaseInputMask.updateMaskData$default(baseInputMask, PhoneInputMaskKt.getDEFAULT_MASK_DATA(), false, 2, null);
                        t = baseInputMask;
                    } else {
                        final Function2 function24 = function2;
                        t = new PhoneInputMask(new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.6
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Exception) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Exception exc) {
                                Function2.this.invoke(exc, new Function0() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.6.1
                                    public final void invoke() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                        invoke();
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        });
                    }
                } else {
                    divInputView.setKeyListener(keyListener);
                }
                ref$ObjectRef2.element = t;
                function1.invoke(ref$ObjectRef.element);
            }
        };
        DivInputMask divInputMask = divInput.mask;
        DivInputMaskBase value = divInputMask != null ? divInputMask.value() : null;
        if (value instanceof DivFixedLengthInputMask) {
            DivFixedLengthInputMask divFixedLengthInputMask = (DivFixedLengthInputMask) value;
            divInputView.addSubscription(divFixedLengthInputMask.pattern.observe(expressionResolver, function12));
            for (DivFixedLengthInputMask.PatternElement patternElement : divFixedLengthInputMask.patternElements) {
                divInputView.addSubscription(patternElement.key.observe(expressionResolver, function12));
                Expression expression2 = patternElement.regex;
                if (expression2 != null) {
                    divInputView.addSubscription(expression2.observe(expressionResolver, function12));
                }
                divInputView.addSubscription(patternElement.placeholder.observe(expressionResolver, function12));
            }
            divInputView.addSubscription(divFixedLengthInputMask.alwaysVisible.observe(expressionResolver, function12));
        } else if ((value instanceof DivCurrencyInputMask) && (expression = ((DivCurrencyInputMask) value).locale) != null && (observe = expression.observe(expressionResolver, function12)) != null) {
            divInputView.addSubscription(observe);
        }
        function12.invoke(Unit.INSTANCE);
    }

    private final void observeFilters(DivInputView divInputView, DivInput divInput, final BindingContext bindingContext, final Function1 function1) {
        if (divInput.mask != null) {
            return;
        }
        final List<DivInputFilter> list = divInput.filters;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Function1 function12 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeFilters$updateFiltersData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7201invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7201invoke(@NotNull Object obj) {
                ErrorCollectors errorCollectors;
                BaseInputFilter baseInputFilter;
                List<DivInputFilter> list3 = list;
                ExpressionResolver expressionResolver2 = expressionResolver;
                DivInputBinder divInputBinder = this;
                BindingContext bindingContext2 = bindingContext;
                ArrayList arrayList = new ArrayList();
                for (DivInputFilter divInputFilter : list3) {
                    if (divInputFilter instanceof DivInputFilter.Regex) {
                        try {
                            baseInputFilter = new RegexInputFilter((String) ((DivInputFilter.Regex) divInputFilter).getValue().pattern.evaluate(expressionResolver2));
                        } catch (PatternSyntaxException e) {
                            errorCollectors = divInputBinder.errorCollectors;
                            errorCollectors.getOrCreate(bindingContext2.getDivView().getDataTag(), bindingContext2.getDivView().getDivData()).logError(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + "'.", e));
                            baseInputFilter = null;
                        }
                    } else {
                        if (!(divInputFilter instanceof DivInputFilter.Expression)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        baseInputFilter = new ExpressionInputFilter(((DivInputFilter.Expression) divInputFilter).getValue().condition, expressionResolver2);
                    }
                    if (baseInputFilter != null) {
                        arrayList.add(baseInputFilter);
                    }
                }
                function1.invoke(new InputFiltersHolder(arrayList));
            }
        };
        for (DivInputFilter divInputFilter : list) {
            if (divInputFilter instanceof DivInputFilter.Regex) {
                divInputView.addSubscription(((DivInputFilter.Regex) divInputFilter).getValue().pattern.observe(expressionResolver, function12));
            } else {
                boolean z = divInputFilter instanceof DivInputFilter.Expression;
            }
        }
        function12.invoke(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCapitalization(DivInput div, ExpressionResolver resolver) {
        int i = WhenMappings.$EnumSwitchMapping$3[((DivInput.Autocapitalization) div.autocapitalization.evaluate(resolver)).ordinal()];
        if (i == 1) {
            return 16384;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4096;
        }
        return 8192;
    }
}
