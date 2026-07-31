package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import sg.bigo.ads.cb.d;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes14.dex */
public class RealtimeBlurLinearLayout extends LinearLayout implements sg.bigo.ads.cb.c<RealtimeBlurLinearLayout> {
    private final d<RealtimeBlurLinearLayout> a;

    public RealtimeBlurLinearLayout(Context context) {
        this(context, null);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d<RealtimeBlurLinearLayout> dVar = new d<>(this);
        this.a = dVar;
        setBackground(dVar.d);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        return background instanceof sg.bigo.ads.cb.a ? ((sg.bigo.ads.cb.a) background).a : background;
    }

    @Nullable
    public sg.bigo.ads.cb.b getBlurStyle() {
        return this.a.d.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d<RealtimeBlurLinearLayout> dVar = this.a;
        View a = v.a(dVar.c, dVar.b);
        dVar.f = a;
        if (a == null) {
            dVar.g = false;
            return;
        }
        a.getViewTreeObserver().addOnPreDrawListener(dVar.h);
        dVar.a();
        boolean z = dVar.f.getRootView() != dVar.b.getRootView();
        dVar.g = z;
        if (z) {
            dVar.f.postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d<RealtimeBlurLinearLayout> dVar = this.a;
        View view = dVar.f;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(dVar.h);
        }
        dVar.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        d<RealtimeBlurLinearLayout> dVar = this.a;
        sg.bigo.ads.cb.a aVar = dVar.d;
        if (drawable != aVar) {
            aVar.a(drawable);
            dVar.b();
        }
        super.setBackground(dVar.d);
    }

    @Override // sg.bigo.ads.cb.c
    public void setBlurStyle(@Nullable sg.bigo.ads.cb.b bVar) {
        this.a.setBlurStyle(bVar);
    }
}
