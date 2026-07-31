package yads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j51 extends LinearLayout {
    public final sq a;
    public final TextView b;

    public j51(Context context, yg0 yg0Var) {
        super(context);
        sq sqVar = new sq(context);
        this.a = sqVar;
        TextView textView = new TextView(context);
        this.b = textView;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: yads.j51$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j51.a(j51.this, view);
            }
        };
        setOrientation(0);
        int roundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        sqVar.setOnClickListener(onClickListener);
        addView(sqVar);
        int roundToInt2 = MathKt.roundToInt(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        textView.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        int roundToInt3 = MathKt.roundToInt(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(roundToInt3, -65536);
        textView.setBackgroundDrawable(gradientDrawable);
        addView(textView);
        int roundToInt4 = MathKt.roundToInt(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(roundToInt4, 0, roundToInt4, roundToInt4);
        textView.setLayoutParams(layoutParams2);
        textView.setVisibility(8);
    }

    public static final void a(j51 j51Var, View view) {
        boolean isSelected = j51Var.a.isSelected();
        j51Var.a.setSelected(!isSelected);
        j51Var.b.setVisibility(!isSelected ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
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

    public final void setDescription(@NotNull String str) {
        this.b.setText(str);
    }
}
