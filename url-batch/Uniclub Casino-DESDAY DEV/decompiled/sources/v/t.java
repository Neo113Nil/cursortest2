package v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class t extends AbstractC0319c {
    public boolean h;
    public boolean i;

    @Override // v.AbstractC0319c
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // v.AbstractC0319c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4009b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.h = true;
                } else if (index == 22) {
                    this.i = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(s.g gVar, int i, int i2);

    @Override // v.AbstractC0319c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h || this.i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f3825b; i++) {
                    View view = (View) constraintLayout.f1253a.get(this.f3824a[i]);
                    if (view != null) {
                        if (this.h) {
                            view.setVisibility(visibility);
                        }
                        if (this.i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }
}
