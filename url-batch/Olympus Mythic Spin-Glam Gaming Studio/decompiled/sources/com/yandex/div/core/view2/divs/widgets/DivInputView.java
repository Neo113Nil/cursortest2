package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import com.android.billingclient.api.BillingClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightEditText;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivInputView.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010A\u001a\u00020:2\u0014\u0010B\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020:08H\u0016J\u0013\u0010C\u001a\u00020:2\b\u0010D\u001a\u0004\u0018\u00010<H\u0096\u0001J\t\u0010E\u001a\u00020:H\u0096\u0001J\u0010\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u00020HH\u0016J\u000b\u0010I\u001a\u0004\u0018\u00010JH\u0096\u0001J\t\u0010K\u001a\u00020:H\u0096\u0001J\u0019\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0096\u0001J\u0012\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020RH\u0016J\"\u0010S\u001a\u00020:2\u0006\u0010T\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020\n2\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\u001a\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J(\u0010\\\u001a\u00020:2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\nH\u0014J\t\u0010a\u001a\u00020:H\u0096\u0001J\t\u0010b\u001a\u00020:H\u0096\u0001J\b\u0010c\u001a\u00020:H\u0016J#\u0010d\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010g\u001a\u00020hH\u0096\u0001J\u0012\u0010i\u001a\u00020:2\b\u0010j\u001a\u0004\u0018\u00010kH\u0016J\u0012\u0010l\u001a\u00020:2\b\u0010m\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010n\u001a\u00020:2\u0006\u0010o\u001a\u00020\nH\u0016J\u0012\u0010p\u001a\u00020:2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016J\u0012\u0010s\u001a\u00020:2\b\u0010t\u001a\u0004\u0018\u00010!H\u0016J\u0011\u0010u\u001a\u00020:2\u0006\u0010g\u001a\u00020hH\u0096\u0001J\u0011\u0010v\u001a\u00020:2\u0006\u0010g\u001a\u00020hH\u0096\u0001R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0092\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0092\u000e¢\u0006\u0002\n\u0000R$\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0012\u0010+\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010\u0012R\u0016\u0010,\u001a\u0004\u0018\u00010-X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\n8SX\u0092\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00103\u001a\u00020\u000fX\u0096\u000f¢\u0006\f\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\"\u00106\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020:0807X\u0092\u0004¢\u0006\u0002\n\u0000R\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020<07X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0092\u000e¢\u0006\u0002\n\u0000¨\u0006w"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "Lcom/yandex/div/internal/widget/SuperLineHeightEditText;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div2/Div$Input;", "Lcom/yandex/div/core/view2/divs/widgets/DivAnimator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_hint", "", "value", "", "accessibilityEnabled", "getAccessibilityEnabled$div_release", "()Z", "setAccessibilityEnabled$div_release", "(Z)V", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "div", "getDiv", "()Lcom/yandex/div2/Div$Input;", "setDiv", "(Lcom/yandex/div2/Div$Input;)V", "editorActionListener", "Landroid/widget/TextView$OnEditorActionListener;", "enabled", "getEnabled", "setEnabled$div_release", "focusTracker", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "getFocusTracker$div_release", "()Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "setFocusTracker$div_release", "(Lcom/yandex/div/core/view2/reuse/InputFocusTracker;)V", "isTransient", "nativeBackground", "Landroid/graphics/drawable/Drawable;", "getNativeBackground$div_release", "()Landroid/graphics/drawable/Drawable;", "nativeBackgroundResId", "getNativeBackgroundResId", "()I", "needClipping", "getNeedClipping", "setNeedClipping", "onTextChangedActions", "", "Lkotlin/Function1;", "Landroid/text/Editable;", "", BillingClient.FeatureType.SUBSCRIPTIONS, "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "textChangeWatcher", "Landroid/text/TextWatcher;", "addAfterTextChangeAction", "action", "addSubscription", "subscription", "closeAllSubscription", "draw", "canvas", "Landroid/graphics/Canvas;", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "onBoundsChanged", "width", "height", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onFocusChanged", "focused", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onSizeChanged", "w", "h", "oldw", "oldh", "release", "releaseBorderDrawer", "removeAfterTextChangeListener", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "Landroid/view/View;", "setContentDescription", "contentDescription", "", "setInputHint", ViewHierarchyConstants.HINT_KEY, "setInputType", "type", "setKeyListener", "keyListener", "Landroid/text/method/KeyListener;", "setOnEditorActionListener", "l", "transitionFinished", "transitionStarted", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public class DivInputView extends SuperLineHeightEditText implements DivHolderView<Div.Input>, DivAnimator {
    private final /* synthetic */ DivHolderViewMixin<Div.Input> $$delegate_0;

    @Nullable
    private String _hint;
    private boolean accessibilityEnabled;

    @Nullable
    private TextView.OnEditorActionListener editorActionListener;
    private boolean enabled;

    @Nullable
    private InputFocusTracker focusTracker;

    @Nullable
    private final Drawable nativeBackground;

    @NotNull
    private final List<Function1> onTextChangedActions;

    @Nullable
    private TextWatcher textChangeWatcher;

    public DivInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Div.Input getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.onBoundsChanged(width, height);
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder border, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Div.Input input) {
        this.$$delegate_0.setDiv(input);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public /* synthetic */ DivInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.divInputStyle : i);
    }

    public DivInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.nativeBackground = ContextCompat.getDrawable(context, getNativeBackgroundResId());
        this.onTextChangedActions = new ArrayList();
        this.enabled = true;
    }

    @DrawableRes
    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    @Nullable
    /* renamed from: getNativeBackground$div_release, reason: from getter */
    public Drawable getNativeBackground() {
        return this.nativeBackground;
    }

    @Nullable
    /* renamed from: getFocusTracker$div_release, reason: from getter */
    public InputFocusTracker getFocusTracker() {
        return this.focusTracker;
    }

    public void setFocusTracker$div_release(@Nullable InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled$div_release(boolean z) {
        this.enabled = z;
        setFocusable(z);
        setFocusableInTouchMode(z);
    }

    /* renamed from: getAccessibilityEnabled$div_release, reason: from getter */
    public boolean getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    public void setAccessibilityEnabled$div_release(boolean z) {
        this.accessibilityEnabled = z;
        setInputHint(this._hint);
    }

    public void setInputHint(@Nullable String hint) {
        CharSequence contentDescription;
        this._hint = hint;
        CharSequence charSequence = hint;
        if (getAccessibilityEnabled()) {
            if ((hint == null || hint.length() == 0) && ((contentDescription = getContentDescription()) == null || contentDescription.length() == 0)) {
                charSequence = null;
            } else if (hint == null || hint.length() == 0) {
                charSequence = getContentDescription();
            } else {
                CharSequence contentDescription2 = getContentDescription();
                charSequence = hint;
                if (contentDescription2 != null) {
                    charSequence = hint;
                    if (contentDescription2.length() != 0) {
                        charSequence = StringsKt.trimEnd(hint, '.') + ". " + ((Object) getContentDescription());
                    }
                }
            }
        }
        setHint(charSequence);
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence contentDescription) {
        super.setContentDescription(contentDescription);
        setInputHint(this._hint);
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean focused, int direction, @Nullable Rect previouslyFocusedRect) {
        InputFocusTracker focusTracker = getFocusTracker();
        if (focusTracker != null) {
            focusTracker.inputFocusChanged(getTag(), this, focused);
        }
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int save;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            save = canvas.save();
            try {
                divBorderDrawer.clipCorners(canvas);
                super.draw(canvas);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
            }
        }
        float f = scrollX;
        float f2 = scrollY;
        save = canvas.save();
        try {
            canvas.translate(f, f2);
            divBorderDrawer.clipCorners(canvas);
            canvas.translate(-f, -f2);
            super.draw(canvas);
            canvas.translate(f, f2);
            divBorderDrawer.drawBorder(canvas);
        } finally {
        }
    }

    @Override // android.widget.TextView
    public void setOnEditorActionListener(@Nullable TextView.OnEditorActionListener l) {
        super.setOnEditorActionListener(l);
        this.editorActionListener = l;
    }

    public void addAfterTextChangeAction(@NotNull Function1 action) {
        if (this.textChangeWatcher == null) {
            TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$addAfterTextChangeAction$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s) {
                    List list;
                    list = DivInputView.this.onTextChangedActions;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(s);
                    }
                }
            };
            addTextChangedListener(textWatcher);
            this.textChangeWatcher = textWatcher;
        }
        this.onTextChangedActions.add(action);
    }

    public void removeAfterTextChangeListener() {
        removeTextChangedListener(this.textChangeWatcher);
        this.onTextChangedActions.clear();
        this.textChangeWatcher = null;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        if ((getInputType() & 131072) != 0 && (keyCode == 66 || keyCode == 160)) {
            int imeOptions = getImeOptions() & 255;
            TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
            if (onEditorActionListener != null) {
                return onEditorActionListener.onEditorAction(this, imeOptions, event);
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection == null) {
            return null;
        }
        return (getInputType() & 131072) == 0 ? onCreateInputConnection : new InputConnectionWrapper(onCreateInputConnection) { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$onCreateInputConnection$1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean sendKeyEvent(@NotNull KeyEvent event) {
                TextView.OnEditorActionListener onEditorActionListener;
                if ((event.getKeyCode() == 66 || event.getKeyCode() == 160) && event.getAction() == 0) {
                    int imeOptions = this.getImeOptions() & 255;
                    onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, event);
                    }
                }
                return super.sendKeyEvent(event);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitText(@Nullable CharSequence text, int newCursorPosition) {
                TextView.OnEditorActionListener onEditorActionListener;
                if (Intrinsics.areEqual(text, "\n")) {
                    int imeOptions = this.getImeOptions() & 255;
                    onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, null);
                    }
                }
                return super.commitText(text, newCursorPosition);
            }
        };
    }

    @Override // android.widget.TextView
    public void setInputType(int type) {
        if (getInputType() == type) {
            return;
        }
        super.setInputType(type);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (Intrinsics.areEqual(getKeyListener(), keyListener)) {
            return;
        }
        super.setKeyListener(keyListener);
    }
}
