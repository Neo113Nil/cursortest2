package yads;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.widget.CheckBox;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class n73 extends CheckBox {
    public Drawable a;
    public Drawable b;

    public n73(@NotNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }

    public final void setCheckedIcon(@NotNull Drawable drawable) {
        this.a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }

    public void setMuted(boolean z) {
        setChecked(z);
    }

    public final void setUncheckedIcon(@NotNull Drawable drawable) {
        this.b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }
}
