package yads;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R$drawable;

/* loaded from: classes11.dex */
public final class rt0 extends ek3 {
    public final s21 c;

    public rt0(ImageView imageView, s21 s21Var) {
        super(imageView);
        this.c = s21Var;
    }

    @Override // yads.ek3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    @Override // yads.ek3
    public final void b(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        q31 q31Var = ((ot0) obj).a;
        if (q31Var == null) {
            return;
        }
        imageView.setForeground(null);
        imageView.setBackground(null);
        a(q31Var);
    }

    public final void a(q31 q31Var) {
        this.c.a(q31Var, new p21() { // from class: yads.rt0$$ExternalSyntheticLambda0
            @Override // yads.p21
            public final void a(Drawable drawable) {
                rt0.a(rt0.this, drawable);
            }
        });
    }

    public static final void a(rt0 rt0Var, Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = (ImageView) rt0Var.b();
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) rt0Var.b();
        if (imageView2 != null) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(imageView2.getContext(), R$drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }
}
