package o;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: o.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081g5 extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C1213i5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1081g5(LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5, C2169we c2169we) {
        super(c2169we, null);
        this.p = layoutInflaterFactory2C1213i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.p.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.p;
                layoutInflaterFactory2C1213i5.r(layoutInflaterFactory2C1213i5.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(EB.t(getContext(), i));
    }
}
