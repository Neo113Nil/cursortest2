package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2062v1 extends C1804r5 implements InterfaceC2194x1 {
    public final /* synthetic */ C2128w1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2062v1(C2128w1 c2128w1, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.k = c2128w1;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        TM.C(this, getContentDescription());
        setOnTouchListener(new C1733q1(this, this));
    }

    @Override // o.InterfaceC2194x1
    public final boolean b() {
        return false;
    }

    @Override // o.InterfaceC2194x1
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.k.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC1187hj.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
