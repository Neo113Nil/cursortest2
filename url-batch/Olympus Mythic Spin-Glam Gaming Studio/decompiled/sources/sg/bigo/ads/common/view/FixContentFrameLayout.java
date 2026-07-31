package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.an.p;

/* loaded from: classes9.dex */
public class FixContentFrameLayout extends RoundedFrameLayout {
    private boolean a;

    public static class a extends FrameLayout.LayoutParams {
        public int a;
        public int b;

        public a() {
            super(-1, -1);
        }
    }

    public FixContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public FixContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFixContent(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        p pVar;
        if (!this.a) {
            super.onMeasure(i, i2);
            return;
        }
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.a <= 0 || aVar.b <= 0) {
                    pVar = new p(defaultSize, defaultSize2);
                } else {
                    aVar.setMargins(0, 0, 0, 0);
                    pVar = p.a(aVar.a, aVar.b, defaultSize, defaultSize2);
                }
                i3 = Math.max(i3, pVar.b);
                i4 = Math.max(i4, pVar.c);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, pVar.b), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, pVar.c), 1073741824));
            }
        }
        setMeasuredDimension(i3, i4);
    }

    public void setFixContent(boolean z) {
        if (z) {
            setPadding(0, 0, 0, 0);
        }
        if (z != this.a) {
            this.a = z;
            requestLayout();
        }
    }
}
