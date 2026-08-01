package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class lx extends ConstraintLayout {
    public final p1 v;
    public int w;
    public final ls x;

    public lx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ls lsVar = new ls();
        this.x = lsVar;
        lsVar.setShapeAppearanceModel(lsVar.g.a.d(new jz(0.5f)));
        this.x.r(ColorStateList.valueOf(-1));
        setBackground(this.x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.D, R.attr.materialClockStyle, 0);
        this.w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.v = new p1(12, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            p1 p1Var = this.v;
            handler.removeCallbacks(p1Var);
            handler.post(p1Var);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            p1 p1Var = this.v;
            handler.removeCallbacks(p1Var);
            handler.post(p1Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.x.r(ColorStateList.valueOf(i));
    }
}
