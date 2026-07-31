package com.yandex.div.core.view2.errors;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0001H\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\u0001H\u0002J\u001a\u0010\u001d\u001a\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020 0\u001fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/errors/DetailsViewGroup;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "errorHandler", "Lkotlin/Function1;", "", "", "onCloseAction", "Lkotlin/Function0;", "onCopyAction", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "errorsOutput", "Landroidx/appcompat/widget/AppCompatTextView;", "monitorView", "Lcom/yandex/div/core/view2/errors/VariableMonitorView;", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "variableMonitor", "Lcom/yandex/div/core/view2/errors/VariableMonitor;", "configureView", "createControls", "createErrorsOutput", "createTopPanel", "updateVariables", "controllers", "", "Lcom/yandex/div/core/expression/variables/VariableController;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes9.dex */
final class DetailsViewGroup extends LinearLayout {

    @NotNull
    private final AppCompatTextView errorsOutput;

    @NotNull
    private final VariableMonitorView monitorView;

    @NotNull
    private final Function0 onCloseAction;

    @NotNull
    private final Function0 onCopyAction;

    @NotNull
    private final VariableMonitor variableMonitor;

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

    public DetailsViewGroup(@NotNull Context context, @NotNull Function1 function1, @NotNull Function0 function0, @NotNull Function0 function02) {
        super(context);
        this.onCloseAction = function0;
        this.onCopyAction = function02;
        VariableMonitor variableMonitor = new VariableMonitor(function1);
        this.variableMonitor = variableMonitor;
        this.errorsOutput = createErrorsOutput();
        this.monitorView = new VariableMonitorView(context, variableMonitor);
        configureView();
    }

    public final void setText(@NotNull String str) {
        this.errorsOutput.setText(str);
    }

    @NotNull
    public final String getText() {
        return this.errorsOutput.getText().toString();
    }

    public final void updateVariables(@NotNull Map<String, ? extends VariableController> controllers) {
        this.variableMonitor.setControllerMap(controllers);
    }

    private final LinearLayout createTopPanel() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(createControls(), new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(32, linearLayout.getResources().getDisplayMetrics()), -2));
        linearLayout.addView(this.errorsOutput, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    private final LinearLayout createControls() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(0, 0, BaseDivViewExtensionsKt.dpToPx(8, linearLayout.getResources().getDisplayMetrics()), 0);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageResource(R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.DetailsViewGroup$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsViewGroup.createControls$lambda$5$lambda$2$lambda$1(DetailsViewGroup.this, view);
            }
        });
        ImageView imageView2 = new ImageView(linearLayout.getContext());
        imageView2.setImageResource(R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.DetailsViewGroup$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsViewGroup.createControls$lambda$5$lambda$4$lambda$3(DetailsViewGroup.this, view);
            }
        });
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createControls$lambda$5$lambda$2$lambda$1(DetailsViewGroup detailsViewGroup, View view) {
        detailsViewGroup.onCloseAction.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createControls$lambda$5$lambda$4$lambda$3(DetailsViewGroup detailsViewGroup, View view) {
        detailsViewGroup.onCopyAction.mo4828invoke();
    }

    private final AppCompatTextView createErrorsOutput() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        return appCompatTextView;
    }

    private final void configureView() {
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, getResources().getDisplayMetrics());
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        setOrientation(1);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        setElevation(getResources().getDimension(com.yandex.div.R.dimen.div_shadow_elevation));
        addView(createTopPanel(), new LinearLayout.LayoutParams(-2, -2));
        addView(this.monitorView, new LinearLayout.LayoutParams(-1, -2));
    }
}
