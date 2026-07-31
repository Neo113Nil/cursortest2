package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class y31 extends ek3 {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final s21 c;
    public final u31 d;
    public final t13 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(ImageView imageView, ri2 ri2Var, t8 t8Var) {
        super(imageView);
        s21 s21Var = new s21(imageView.getContext(), new h42(t8Var), ri2Var);
        u31 u31Var = new u31(ri2Var);
        t13 t13Var = new t13();
        this.c = s21Var;
        this.d = u31Var;
        this.e = t13Var;
    }

    @Override // yads.ek3
    public final void a(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        this.e.a(imageView);
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        imageView.setOnTouchListener(null);
        imageView.setSelected(false);
    }

    @Override // yads.ek3
    public final void b(View view, Object obj) {
        a((q31) obj);
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        up hk0Var;
        q31 q31Var = (q31) obj;
        u31 u31Var = this.d;
        Drawable drawable = ((ImageView) view).getDrawable();
        Bitmap a = u31Var.a.a(q31Var);
        if (a == null) {
            ri2 ri2Var = u31Var.a;
            ri2Var.getClass();
            String str = q31Var.g;
            qi2 qi2Var = str != null ? new qi2(str, new j03(q31Var.a, q31Var.b)) : null;
            a = qi2Var != null ? (Bitmap) ri2Var.c.get(qi2Var) : null;
        }
        if (drawable == null || a == null) {
            return false;
        }
        if (drawable instanceof BitmapDrawable) {
            hk0Var = new wp();
        } else {
            hk0Var = new hk0();
        }
        return hk0Var.a(drawable, a);
    }

    public final void a(final q31 q31Var) {
        this.c.a(q31Var, new p21() { // from class: yads.y31$$ExternalSyntheticLambda0
            @Override // yads.p21
            public final void a(Drawable drawable) {
                y31.a(y31.this, q31Var, drawable);
            }
        });
    }

    public static final void a(y31 y31Var, q31 q31Var, Drawable drawable) {
        ImageView imageView;
        if (drawable == null || (imageView = (ImageView) y31Var.b()) == null) {
            return;
        }
        if (q31Var.e != null) {
            y31Var.e.a(imageView, q31Var, drawable);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }
}
