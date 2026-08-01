package l;

import a1.AbstractC0067d;
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

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0287y extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0271q f3527a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3528b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0287y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f3529c = false;
        S0.a(this, getContext());
        C0271q c0271q = new C0271q(this);
        this.f3527a = c0271q;
        c0271q.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3528b = dVar;
        dVar.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0271q c0271q = this.f3527a;
        if (c0271q != null) {
            c0271q.a();
        }
        B.d dVar = this.f3528b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271q c0271q = this.f3527a;
        if (c0271q != null) {
            return c0271q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271q c0271q = this.f3527a;
        if (c0271q != null) {
            return c0271q.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        U0 u02;
        B.d dVar = this.f3528b;
        if (dVar == null || (u02 = (U0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) u02.f3378c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        U0 u02;
        B.d dVar = this.f3528b;
        if (dVar == null || (u02 = (U0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) u02.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3528b.f61c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271q c0271q = this.f3527a;
        if (c0271q != null) {
            c0271q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271q c0271q = this.f3527a;
        if (c0271q != null) {
            c0271q.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3528b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3528b;
        if (dVar != null && drawable != null && !this.f3529c) {
            dVar.f60b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3529c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f61c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f60b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3529c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3528b;
        ImageView imageView = (ImageView) dVar.f61c;
        if (i != 0) {
            Drawable k2 = AbstractC0067d.k(imageView.getContext(), i);
            if (k2 != null) {
                AbstractC0266n0.a(k2);
            }
            imageView.setImageDrawable(k2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3528b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271q c0271q = this.f3527a;
        if (c0271q != null) {
            c0271q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271q c0271q = this.f3527a;
        if (c0271q != null) {
            c0271q.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3528b;
        if (dVar != null) {
            if (((U0) dVar.d) == null) {
                dVar.d = new U0();
            }
            U0 u02 = (U0) dVar.d;
            u02.f3378c = colorStateList;
            u02.f3377b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3528b;
        if (dVar != null) {
            if (((U0) dVar.d) == null) {
                dVar.d = new U0();
            }
            U0 u02 = (U0) dVar.d;
            u02.d = mode;
            u02.f3376a = true;
            dVar.a();
        }
    }
}
