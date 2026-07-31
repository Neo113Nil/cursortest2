package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class AutoNextLineLinearLayout extends LinearLayout {
    int a;
    int b;
    int c;
    int d;
    Hashtable e;

    static class a {
        int a;
        int b;
        int c;
        int d;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.e = new Hashtable();
    }

    public AutoNextLineLinearLayout(Context context, int i, int i2) {
        super(context);
        this.e = new Hashtable();
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Hashtable();
    }

    private int a(int i, int i2) {
        if (i <= 0) {
            return getPaddingLeft();
        }
        int i3 = i2 - 1;
        return a(i - 1, i3) + getChildAt(i3).getMeasuredWidth() + 30;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) this.e.get(childAt);
            if (aVar != null) {
                childAt.layout(aVar.a, aVar.b, aVar.c, aVar.d);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        byte b = 0;
        this.a = 0;
        this.b = 0;
        this.c = 5;
        this.d = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i4 += measuredWidth;
            a aVar = new a(b);
            int a2 = a(i3 - i5, i3);
            this.a = a2;
            this.b = a2 + childAt.getMeasuredWidth();
            if (i4 >= size) {
                this.a = 0;
                this.b = childAt.getMeasuredWidth();
                this.c = i6 + measuredHeight + layoutParams.topMargin;
                i5 = i3;
                i4 = measuredWidth;
            }
            int measuredHeight2 = this.c + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
            this.d = measuredHeight2;
            int i7 = this.c;
            aVar.a = this.a;
            aVar.b = i7 + 3;
            aVar.c = this.b;
            aVar.d = measuredHeight2;
            this.e.put(childAt, aVar);
            i3++;
            i6 = i7;
        }
        setMeasuredDimension(size, this.d);
    }
}
