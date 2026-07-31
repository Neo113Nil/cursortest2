package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.SideBindParams;
import io.bidmachine.rendering.model.SideType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class e extends RelativeLayout {

    public static class a extends RelativeLayout.LayoutParams {
        private final int a;
        private final int b;
        private float c;
        private float d;

        public a(int i, int i2) {
            super(i, i2);
            this.c = 1.0f;
            this.d = 1.0f;
            this.a = i;
            this.b = i2;
        }

        public void a(float f) {
            this.d = f;
        }

        public void b(float f) {
            this.c = f;
        }

        private void b(SideBindParams sideBindParams, SideBindParams sideBindParams2, List list) {
            a(sideBindParams, SideType.Top, 6, 3, 10, list);
            a(sideBindParams2, SideType.Bottom, 8, 2, 12, list);
        }

        public void a(Context context, ElementLayoutParams elementLayoutParams, List list) {
            b(elementLayoutParams.getWidthPercent());
            a(elementLayoutParams.getHeightPercent());
            setMargins(elementLayoutParams.getMarginLeftPx(context), elementLayoutParams.getMarginTopPx(context), -elementLayoutParams.getMarginRightPx(context), -elementLayoutParams.getMarginBottomPx(context));
            SideBindParams topSideBindParams = elementLayoutParams.getTopSideBindParams();
            SideBindParams bottomSideBindParams = elementLayoutParams.getBottomSideBindParams();
            if (!a(elementLayoutParams.getCenterYSideBindParams(), 15, elementLayoutParams.getWidthPx(context))) {
                b(topSideBindParams, bottomSideBindParams, list);
            }
            SideBindParams leftSideBindParams = elementLayoutParams.getLeftSideBindParams();
            SideBindParams rightSideBindParams = elementLayoutParams.getRightSideBindParams();
            if (!a(elementLayoutParams.getCenterXSideBindParams(), 14, elementLayoutParams.getHeightPx(context))) {
                a(leftSideBindParams, rightSideBindParams, list);
            }
            a();
        }

        private void a() {
            int[] rules = getRules();
            if ((this.c > 0.0f || this.a > 0) && rules[9] == -1 && rules[11] == -1) {
                removeRule(9);
                removeRule(11);
                addRule(14);
            }
            if ((this.d > 0.0f || this.b > 0) && rules[10] == -1 && rules[12] == -1) {
                removeRule(10);
                removeRule(12);
                addRule(15);
            }
        }

        private boolean a(SideBindParams sideBindParams, int i, int i2) {
            if (i2 < 0 || sideBindParams == null) {
                return false;
            }
            addRule(i);
            return true;
        }

        private void a(SideBindParams sideBindParams, SideBindParams sideBindParams2, List list) {
            a(sideBindParams, SideType.Left, 5, 1, 9, list);
            a(sideBindParams2, SideType.Right, 7, 0, 11, list);
        }

        private void a(SideBindParams sideBindParams, SideType sideType, int i, int i2, int i3, List list) {
            if (sideBindParams == null) {
                return;
            }
            View a = a(list, sideBindParams.getTargetName());
            if (a != null) {
                if (sideBindParams.getTargetSideType() != sideType) {
                    i = i2;
                }
                addRule(i, a.getId());
                return;
            }
            addRule(i3);
        }

        private View a(List list, String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                io.bidmachine.rendering.internal.b bVar = (io.bidmachine.rendering.internal.b) it.next();
                if (bVar.g().getName().equals(str)) {
                    return bVar.i();
                }
            }
            return null;
        }
    }

    public e(Context context) {
        super(context);
    }

    void a(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof a) {
                a(size, size2, childAt, (a) layoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        a(i, i2);
        super.onMeasure(i, i2);
    }

    private void a(int i, int i2, View view, a aVar) {
        Integer a2;
        Integer a3;
        float f = aVar.c;
        if (f > 0.0f && f < 1.0f && (a3 = a(aVar.a, i, view.getMeasuredWidth(), f)) != null) {
            ((RelativeLayout.LayoutParams) aVar).width = a3.intValue();
        }
        float f2 = aVar.d;
        if (f2 <= 0.0f || f2 >= 1.0f || (a2 = a(aVar.b, i2, view.getMeasuredHeight(), f2)) == null) {
            return;
        }
        ((RelativeLayout.LayoutParams) aVar).height = a2.intValue();
    }

    Integer a(int i, int i2, int i3, float f) {
        if (i <= 0) {
            if (i == -1) {
                i = i2;
            } else {
                if (i != -2 || i3 == 0) {
                    return null;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(Math.round(i * f));
    }
}
