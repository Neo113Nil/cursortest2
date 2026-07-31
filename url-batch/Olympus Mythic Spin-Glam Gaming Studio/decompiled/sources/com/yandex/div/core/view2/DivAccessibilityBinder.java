package com.yandex.div.core.view2;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.X3;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGifImage;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivAccessibilityBinder.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u0001:\u00012B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000bH\u0012J#\u0010\u001c\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0012¢\u0006\u0002\u0010\u001fJ \u0010 \u001a\u00020\u000f*\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0012J\u0018\u0010#\u001a\u00020\u000f*\u00020\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0012J\u0016\u0010&\u001a\u00020\u000f*\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010\nH\u0012J \u0010(\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0012J.\u0010+\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J.\u0010,\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J.\u0010-\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J.\u0010.\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J\u001e\u0010/\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0012J\u0014\u00100\u001a\u00020\u000b*\u00020*2\u0006\u00101\u001a\u00020\u0013H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u00063"}, d2 = {"Lcom/yandex/div/core/view2/DivAccessibilityBinder;", "", "enabled", "", "accessibilityStateProvider", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "(ZLcom/yandex/div/core/util/AccessibilityStateProvider;)V", "getEnabled", "()Z", "toClassName", "", "Lcom/yandex/div/core/view2/DivAccessibilityBinder$AccessibilityType;", "getToClassName", "(Lcom/yandex/div/core/view2/DivAccessibilityBinder$AccessibilityType;)Ljava/lang/String;", "bind", "", "view", "Landroid/view/View;", "newDiv", "Lcom/yandex/div2/DivBase;", "oldDiv", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "subscriber", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "getAccessibilityDelegate", "Landroidx/core/view/AccessibilityDelegateCompat;", "type", "applyCheckedState", "divBase", "isChecked", "(Landroid/view/View;Lcom/yandex/div2/DivBase;Ljava/lang/Boolean;)V", "applyDescriptionAndHint", "description", ViewHierarchyConstants.HINT_KEY, "applyMode", X3.a.t, "Lcom/yandex/div2/DivAccessibility$Mode;", "applyStateDescription", "stateDescription", "applyType", "accessibilityType", "Lcom/yandex/div2/DivAccessibility$Type;", "bindCheckedState", "bindDescriptionAndHint", "bindMode", "bindStateDescription", "bindType", "toAccessibilityType", "div", "AccessibilityType", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes.dex */
public class DivAccessibilityBinder {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final boolean enabled;

    /* compiled from: DivAccessibilityBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/DivAccessibilityBinder$AccessibilityType;", "", "(Ljava/lang/String;I)V", "NONE", "BUTTON", "EDIT_TEXT", "HEADER", ShareConstants.IMAGE_URL, "LIST", "SLIDER", "SELECT", "TAB_WIDGET", "PAGER", "TEXT", "RADIO_BUTTON", "CHECK_BOX", "CONTAINER", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum AccessibilityType {
        NONE,
        BUTTON,
        EDIT_TEXT,
        HEADER,
        IMAGE,
        LIST,
        SLIDER,
        SELECT,
        TAB_WIDGET,
        PAGER,
        TEXT,
        RADIO_BUTTON,
        CHECK_BOX,
        CONTAINER
    }

    /* compiled from: DivAccessibilityBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DivAccessibility.Type.values().length];
            try {
                iArr[DivAccessibility.Type.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAccessibility.Type.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAccessibility.Type.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAccessibility.Type.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAccessibility.Type.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAccessibility.Type.EDIT_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivAccessibility.Type.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivAccessibility.Type.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivAccessibility.Type.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DivAccessibility.Type.TAB_BAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DivAccessibility.Type.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DivAccessibility.Type.CHECKBOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccessibilityType.values().length];
            try {
                iArr2[AccessibilityType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AccessibilityType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AccessibilityType.EDIT_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[AccessibilityType.HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[AccessibilityType.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[AccessibilityType.LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[AccessibilityType.PAGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[AccessibilityType.SLIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[AccessibilityType.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[AccessibilityType.TAB_WIDGET.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[AccessibilityType.TEXT.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[AccessibilityType.CHECK_BOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[AccessibilityType.RADIO_BUTTON.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[AccessibilityType.CONTAINER.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DivAccessibilityBinder(@ExperimentFlag(experiment = Experiment.ACCESSIBILITY_ENABLED) boolean z, @NotNull AccessibilityStateProvider accessibilityStateProvider) {
        this.enabled = z;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void bind(@NotNull View view, @NotNull DivBase newDiv, @Nullable DivBase oldDiv, @NotNull ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber) {
        if (newDiv.getAccessibility() == null) {
            if ((oldDiv != null ? oldDiv.getAccessibility() : null) == null) {
                if (getEnabled()) {
                    applyMode$default(this, view, null, 1, null);
                    return;
                }
                return;
            }
        }
        bindType(view, newDiv, oldDiv);
        bindDescriptionAndHint(view, newDiv, oldDiv, resolver, subscriber);
        bindMode(view, newDiv, oldDiv, resolver, subscriber);
        bindStateDescription(view, newDiv, oldDiv, resolver, subscriber);
        bindCheckedState(view, newDiv, oldDiv, resolver, subscriber);
    }

    private void bindType(View view, DivBase divBase, DivBase divBase2) {
        if (this.accessibilityStateProvider.isAccessibilityEnabled(view.getContext())) {
            if (divBase2 != null) {
                DivAccessibility accessibility = divBase.getAccessibility();
                DivAccessibility.Type type = accessibility != null ? accessibility.type : null;
                DivAccessibility accessibility2 = divBase2.getAccessibility();
                if (type == (accessibility2 != null ? accessibility2.type : null)) {
                    return;
                }
            }
            DivAccessibility accessibility3 = divBase.getAccessibility();
            applyType(view, divBase, accessibility3 != null ? accessibility3.type : null);
        }
    }

    static /* synthetic */ void applyType$default(DivAccessibilityBinder divAccessibilityBinder, View view, DivBase divBase, DivAccessibility.Type type, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyType");
        }
        if ((i & 2) != 0) {
            type = null;
        }
        divAccessibilityBinder.applyType(view, divBase, type);
    }

    private void applyType(View view, DivBase divBase, DivAccessibility.Type type) {
        if (type == null) {
            type = DivAccessibility.Type.AUTO;
        }
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view, toAccessibilityType(type, divBase));
        if (accessibilityDelegate != null) {
            ViewCompat.setAccessibilityDelegate(view, accessibilityDelegate);
        }
    }

    private AccessibilityDelegateCompat getAccessibilityDelegate(View view, AccessibilityType type) {
        if (type == AccessibilityType.LIST && (view instanceof BackHandlingRecyclerView)) {
            return new AccessibilityListDelegate((BackHandlingRecyclerView) view);
        }
        String toClassName = getToClassName(type);
        boolean z = type == AccessibilityType.HEADER;
        CharSequence accessibilityClassName = view.getAccessibilityClassName();
        if (!(toClassName.length() == 0 || Intrinsics.areEqual(toClassName, accessibilityClassName)) || z) {
            return new ExtensiveAccessibilityDelegate(toClassName, z, type == AccessibilityType.CHECK_BOX || type == AccessibilityType.RADIO_BUTTON);
        }
        return null;
    }

    private AccessibilityType toAccessibilityType(DivAccessibility.Type type, DivBase divBase) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                if (divBase instanceof DivInput) {
                    return AccessibilityType.EDIT_TEXT;
                }
                if (divBase instanceof DivText) {
                    return AccessibilityType.TEXT;
                }
                if (divBase instanceof DivTabs) {
                    return AccessibilityType.TAB_WIDGET;
                }
                if (divBase instanceof DivSelect) {
                    return AccessibilityType.SELECT;
                }
                if (divBase instanceof DivSlider) {
                    return AccessibilityType.SLIDER;
                }
                if (!(divBase instanceof DivImage) && !(divBase instanceof DivGifImage)) {
                    if (divBase instanceof DivGallery) {
                        DivAccessibility accessibility = divBase.getAccessibility();
                        if ((accessibility != null ? accessibility.description : null) != null) {
                            return AccessibilityType.PAGER;
                        }
                    }
                    return divBase instanceof DivContainer ? AccessibilityType.CONTAINER : AccessibilityType.NONE;
                }
                return AccessibilityType.IMAGE;
            case 2:
                return AccessibilityType.NONE;
            case 3:
                return AccessibilityType.BUTTON;
            case 4:
                return AccessibilityType.IMAGE;
            case 5:
                return AccessibilityType.TEXT;
            case 6:
                return AccessibilityType.EDIT_TEXT;
            case 7:
                return AccessibilityType.HEADER;
            case 8:
                return AccessibilityType.LIST;
            case 9:
                return AccessibilityType.SELECT;
            case 10:
                return AccessibilityType.TAB_WIDGET;
            case 11:
                return AccessibilityType.RADIO_BUTTON;
            case 12:
                return AccessibilityType.CHECK_BOX;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private String getToClassName(AccessibilityType accessibilityType) {
        switch (WhenMappings.$EnumSwitchMapping$1[accessibilityType.ordinal()]) {
            case 1:
            case 4:
            case 6:
            case 8:
                return "";
            case 2:
                return "android.widget.Button";
            case 3:
                return "android.widget.EditText";
            case 5:
                return "android.widget.ImageView";
            case 7:
                return "androidx.viewpager.widget.ViewPager";
            case 9:
                return "android.widget.Spinner";
            case 10:
                return "android.widget.TabWidget";
            case 11:
                return "android.widget.TextView";
            case 12:
                return "android.widget.CheckBox";
            case 13:
                return "android.widget.RadioButton";
            case 14:
                return "android.view.ViewGroup";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private void bindDescriptionAndHint(final View view, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility accessibility;
        DivAccessibility accessibility2;
        DivAccessibility accessibility3 = divBase.getAccessibility();
        Expression expression = accessibility3 != null ? accessibility3.description : null;
        DivAccessibility accessibility4 = divBase.getAccessibility();
        Expression expression2 = accessibility4 != null ? accessibility4.hint : null;
        if (ExpressionsKt.equalsToConstant(expression, (divBase2 == null || (accessibility2 = divBase2.getAccessibility()) == null) ? null : accessibility2.description)) {
            if (ExpressionsKt.equalsToConstant(expression2, (divBase2 == null || (accessibility = divBase2.getAccessibility()) == null) ? null : accessibility.hint)) {
                return;
            }
        }
        applyDescriptionAndHint(view, expression != null ? (String) expression.evaluate(expressionResolver) : null, expression2 != null ? (String) expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstantOrNull(expression2)) {
            return;
        }
        final Expression expression3 = expression;
        final Expression expression4 = expression2;
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindDescriptionAndHint$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7152invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7152invoke(@NotNull Object obj) {
                Expression expression5;
                DivAccessibilityBinder divAccessibilityBinder = DivAccessibilityBinder.this;
                View view2 = view;
                Expression<String> expression6 = expression3;
                DivAccessibility.Mode mode = null;
                String evaluate = expression6 != null ? expression6.evaluate(expressionResolver) : null;
                Expression<String> expression7 = expression4;
                divAccessibilityBinder.applyDescriptionAndHint(view2, evaluate, expression7 != null ? expression7.evaluate(expressionResolver) : null);
                DivAccessibilityBinder divAccessibilityBinder2 = DivAccessibilityBinder.this;
                View view3 = view;
                DivAccessibility accessibility5 = divBase.getAccessibility();
                if (accessibility5 != null && (expression5 = accessibility5.mode) != null) {
                    mode = (DivAccessibility.Mode) expression5.evaluate(expressionResolver);
                }
                divAccessibilityBinder2.applyMode(view3, mode);
            }
        };
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDescriptionAndHint(View view, String str, String str2) {
        if (str == null) {
            str = str2;
        } else if (str2 != null && !Intrinsics.areEqual(str, str2)) {
            str = str + '\n' + str2;
        }
        view.setContentDescription(str);
    }

    private void bindMode(final View view, DivBase divBase, DivBase divBase2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility accessibility;
        if (getEnabled()) {
            DivAccessibility accessibility2 = divBase.getAccessibility();
            Expression expression = accessibility2 != null ? accessibility2.mode : null;
            if (ExpressionsKt.equalsToConstant(expression, (divBase2 == null || (accessibility = divBase2.getAccessibility()) == null) ? null : accessibility.mode)) {
                return;
            }
            applyMode(view, expression != null ? (DivAccessibility.Mode) expression.evaluate(expressionResolver) : null);
            if (ExpressionsKt.isConstantOrNull(expression)) {
                return;
            }
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindMode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DivAccessibility.Mode) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull DivAccessibility.Mode mode) {
                    DivAccessibilityBinder.this.applyMode(view, mode);
                }
            }) : null);
        }
    }

    static /* synthetic */ void applyMode$default(DivAccessibilityBinder divAccessibilityBinder, View view, DivAccessibility.Mode mode, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMode");
        }
        if ((i & 1) != 0) {
            mode = null;
        }
        divAccessibilityBinder.applyMode(view, mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyMode(View view, DivAccessibility.Mode mode) {
        DivAccessibility.Mode mode2 = DivAccessibility.Mode.MERGE;
        int i = 0;
        ViewCompat.setScreenReaderFocusable(view, mode == mode2);
        if (mode == DivAccessibility.Mode.EXCLUDE) {
            i = 4;
        } else {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null && !StringsKt.isBlank(contentDescription) && (mode == mode2 || (view instanceof DivImageView) || (view instanceof DivGifImageView))) {
                i = 1;
            }
        }
        view.setImportantForAccessibility(i);
    }

    private void bindStateDescription(final View view, DivBase divBase, DivBase divBase2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility accessibility;
        DivAccessibility accessibility2 = divBase.getAccessibility();
        Expression expression = accessibility2 != null ? accessibility2.stateDescription : null;
        if (ExpressionsKt.equalsToConstant(expression, (divBase2 == null || (accessibility = divBase2.getAccessibility()) == null) ? null : accessibility.stateDescription)) {
            return;
        }
        applyStateDescription(view, expression != null ? (String) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindStateDescription$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str) {
                DivAccessibilityBinder.this.applyStateDescription(view, str);
            }
        }) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyStateDescription(View view, String str) {
        ViewCompat.setStateDescription(view, str);
    }

    private void bindCheckedState(final View view, final DivBase divBase, DivBase divBase2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility accessibility;
        DivAccessibility accessibility2 = divBase.getAccessibility();
        Expression expression = accessibility2 != null ? accessibility2.isChecked : null;
        if (ExpressionsKt.equalsToConstant(expression, (divBase2 == null || (accessibility = divBase2.getAccessibility()) == null) ? null : accessibility.isChecked)) {
            return;
        }
        applyCheckedState(view, divBase, expression != null ? (Boolean) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindCheckedState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                DivAccessibilityBinder.this.applyCheckedState(view, divBase, Boolean.valueOf(z));
            }
        }) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyCheckedState(View view, DivBase divBase, Boolean bool) {
        DivAccessibility.Type type;
        DivAccessibility accessibility = divBase.getAccessibility();
        AccessibilityType accessibilityType = (accessibility == null || (type = accessibility.type) == null) ? null : toAccessibilityType(type, divBase);
        if (accessibilityType == AccessibilityType.CHECK_BOX || accessibilityType == AccessibilityType.RADIO_BUTTON) {
            AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view);
            ExtensiveAccessibilityDelegate extensiveAccessibilityDelegate = accessibilityDelegate instanceof ExtensiveAccessibilityDelegate ? (ExtensiveAccessibilityDelegate) accessibilityDelegate : null;
            if (extensiveAccessibilityDelegate != null) {
                extensiveAccessibilityDelegate.setChecked(bool);
            }
        }
    }
}
