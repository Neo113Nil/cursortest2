package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: o.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1673p5 extends ImageButton {
    public final L4 h;
    public final C1739q5 i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673p5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RV.a(context);
        this.j = false;
        CV.a(this, getContext());
        L4 l4 = new L4(this);
        this.h = l4;
        l4.e(attributeSet, i);
        C1739q5 c1739q5 = new C1739q5(this);
        this.i = c1739q5;
        c1739q5.c(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L4 l4 = this.h;
        if (l4 != null) {
            l4.a();
        }
        C1739q5 c1739q5 = this.i;
        if (c1739q5 != null) {
            c1739q5.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        L4 l4 = this.h;
        if (l4 != null) {
            return l4.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        L4 l4 = this.h;
        if (l4 != null) {
            return l4.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0214Id c0214Id;
        C1739q5 c1739q5 = this.i;
        if (c1739q5 == null || (c0214Id = (C0214Id) c1739q5.d) == null) {
            return null;
        }
        return (ColorStateList) c0214Id.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0214Id c0214Id;
        C1739q5 c1739q5 = this.i;
        if (c1739q5 == null || (c0214Id = (C0214Id) c1739q5.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0214Id.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.i.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        L4 l4 = this.h;
        if (l4 != null) {
            l4.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        L4 l4 = this.h;
        if (l4 != null) {
            l4.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1739q5 c1739q5 = this.i;
        if (c1739q5 != null) {
            c1739q5.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1739q5 c1739q5 = this.i;
        if (c1739q5 != null && drawable != null && !this.j) {
            c1739q5.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c1739q5 != null) {
            c1739q5.a();
            if (this.j) {
                return;
            }
            ImageView imageView = (ImageView) c1739q5.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c1739q5.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.j = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C1739q5 c1739q5 = this.i;
        ImageView imageView = (ImageView) c1739q5.c;
        if (i != 0) {
            Drawable t = EB.t(imageView.getContext(), i);
            if (t != null) {
                AbstractC1317jj.a(t);
            }
            imageView.setImageDrawable(t);
        } else {
            imageView.setImageDrawable(null);
        }
        c1739q5.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1739q5 c1739q5 = this.i;
        if (c1739q5 != null) {
            c1739q5.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        L4 l4 = this.h;
        if (l4 != null) {
            l4.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        L4 l4 = this.h;
        if (l4 != null) {
            l4.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1739q5 c1739q5 = this.i;
        if (c1739q5 != null) {
            if (((C0214Id) c1739q5.d) == null) {
                c1739q5.d = new C0214Id();
            }
            C0214Id c0214Id = (C0214Id) c1739q5.d;
            c0214Id.c = colorStateList;
            c0214Id.b = true;
            c1739q5.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1739q5 c1739q5 = this.i;
        if (c1739q5 != null) {
            if (((C0214Id) c1739q5.d) == null) {
                c1739q5.d = new C0214Id();
            }
            C0214Id c0214Id = (C0214Id) c1739q5.d;
            c0214Id.d = mode;
            c0214Id.a = true;
            c1739q5.a();
        }
    }
}
