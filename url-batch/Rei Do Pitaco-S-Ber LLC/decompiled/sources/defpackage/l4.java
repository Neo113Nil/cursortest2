package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class l4 extends ImageView {
    public final y1 f;
    public final k4 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f50.a(context);
        this.h = false;
        b50.a(this, getContext());
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, i);
        k4 k4Var = new k4(this);
        this.g = k4Var;
        k4Var.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        k4 k4Var = this.g;
        if (k4Var != null) {
            k4Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        vb vbVar;
        k4 k4Var = this.g;
        if (k4Var == null || (vbVar = (vb) k4Var.d) == null) {
            return null;
        }
        return (ColorStateList) vbVar.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        vb vbVar;
        k4 k4Var = this.g;
        if (k4Var == null || (vbVar = (vb) k4Var.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) vbVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        k4 k4Var = this.g;
        if (k4Var != null) {
            k4Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        k4 k4Var = this.g;
        if (k4Var != null && drawable != null && !this.h) {
            k4Var.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (k4Var != null) {
            k4Var.a();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) k4Var.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(k4Var.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        k4 k4Var = this.g;
        if (k4Var != null) {
            k4Var.e(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k4 k4Var = this.g;
        if (k4Var != null) {
            k4Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        k4 k4Var = this.g;
        if (k4Var != null) {
            if (((vb) k4Var.d) == null) {
                k4Var.d = new vb();
            }
            vb vbVar = (vb) k4Var.d;
            vbVar.c = colorStateList;
            vbVar.b = true;
            k4Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        k4 k4Var = this.g;
        if (k4Var != null) {
            if (((vb) k4Var.d) == null) {
                k4Var.d = new vb();
            }
            vb vbVar = (vb) k4Var.d;
            vbVar.d = mode;
            vbVar.a = true;
            k4Var.a();
        }
    }
}
