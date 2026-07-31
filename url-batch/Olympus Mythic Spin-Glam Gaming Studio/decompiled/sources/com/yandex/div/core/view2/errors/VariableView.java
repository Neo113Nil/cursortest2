package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.R;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: VariableMonitorView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\f\u0010\u001d\u001a\u00020\f*\u00020\u0006H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "nameText", "Landroid/widget/TextView;", "getNameText", "()Landroid/widget/TextView;", "onEnterAction", "Lkotlin/Function1;", "", "", "getOnEnterAction", "()Lkotlin/jvm/functions/Function1;", "setOnEnterAction", "(Lkotlin/jvm/functions/Function1;)V", "typeText", "getTypeText", "valueText", "Landroid/widget/EditText;", "getValueText", "()Landroid/widget/EditText;", "addCell", "cell", "width", "", "createCell", "createEditableCell", "configureCommon", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
final class VariableView extends LinearLayout {
    public static final int CELL_PADDING = 8;
    public static final int NAME_WIDTH = 200;
    public static final int TYPE_WIDTH = 60;

    @NotNull
    private final TextView nameText;

    @NotNull
    private Function1 onEnterAction;

    @NotNull
    private final TextView typeText;

    @NotNull
    private final EditText valueText;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public VariableView(@NotNull Context context) {
        super(context);
        TextView createCell = createCell();
        this.nameText = createCell;
        TextView createCell2 = createCell();
        this.typeText = createCell2;
        EditText createEditableCell = createEditableCell();
        this.valueText = createEditableCell;
        this.onEnterAction = new Function1() { // from class: com.yandex.div.core.view2.errors.VariableView$onEnterAction$1
            public final void invoke(@NotNull String str) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        };
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addCell(createCell, 200);
        addCell(createCell2, 60);
        addView(createEditableCell, new LinearLayout.LayoutParams(-2, -2, 1.0f));
    }

    @NotNull
    public final TextView getNameText() {
        return this.nameText;
    }

    @NotNull
    public final TextView getTypeText() {
        return this.typeText;
    }

    @NotNull
    public final EditText getValueText() {
        return this.valueText;
    }

    @NotNull
    public final Function1 getOnEnterAction() {
        return this.onEnterAction;
    }

    public final void setOnEnterAction(@NotNull Function1 function1) {
        this.onEnterAction = function1;
    }

    private final TextView createCell() {
        TextView textView = new TextView(getContext());
        configureCommon(textView);
        return textView;
    }

    private final EditText createEditableCell() {
        final EditText editText = new EditText(getContext());
        configureCommon(editText);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.errors.VariableView$$ExternalSyntheticLambda0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean createEditableCell$lambda$2$lambda$1;
                createEditableCell$lambda$2$lambda$1 = VariableView.createEditableCell$lambda$2$lambda$1(VariableView.this, editText, textView, i, keyEvent);
                return createEditableCell$lambda$2$lambda$1;
            }
        });
        return editText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createEditableCell$lambda$2$lambda$1(VariableView variableView, EditText editText, TextView textView, int i, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getAction() != 0) || i != 6) {
            return false;
        }
        variableView.onEnterAction.invoke(editText.getText().toString());
        return true;
    }

    private final void configureCommon(TextView textView) {
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        textView.setTextColor(-1);
        textView.setBackgroundResource(R.drawable.table_cell_background);
        textView.setHorizontallyScrolling(true);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setMaxLines(1);
    }

    private final void addCell(TextView cell, int width) {
        addView(cell, new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(width), getResources().getDisplayMetrics()), -1));
    }
}
