package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.football.transfertrivia.R;
import k.C0153b;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216j extends C0246y implements InterfaceC0220l {
    public final /* synthetic */ C0218k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0216j(C0218k c0218k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = c0218k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        d1.a(this, getContentDescription());
        setOnTouchListener(new C0153b(this, this));
    }

    @Override // l.InterfaceC0220l
    public final boolean b() {
        return false;
    }

    @Override // l.InterfaceC0220l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
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
            D.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
