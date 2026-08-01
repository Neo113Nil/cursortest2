package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h1 extends l4 implements l1 {
    public final /* synthetic */ k1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k1 k1Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.i = k1Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        s50.a(this, getContentDescription());
        setOnTouchListener(new c1(this, this));
    }

    @Override // defpackage.l1
    public final boolean a() {
        return false;
    }

    @Override // defpackage.l1
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.i.n();
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
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
