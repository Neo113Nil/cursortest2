package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0194A extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0244q f2846a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f2847b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f2848c = false;
        S0.a(this, getContext());
        C0244q c0244q = new C0244q(this);
        this.f2846a = c0244q;
        c0244q.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f2847b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0244q c0244q = this.f2846a;
        if (c0244q != null) {
            c0244q.a();
        }
        B.d dVar = this.f2847b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244q c0244q = this.f2846a;
        if (c0244q != null) {
            return c0244q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0244q c0244q = this.f2846a;
        if (c0244q != null) {
            return c0244q.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        i1.g gVar;
        B.d dVar = this.f2847b;
        if (dVar == null || (gVar = (i1.g) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) gVar.f2431c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        i1.g gVar;
        B.d dVar = this.f2847b;
        if (dVar == null || (gVar = (i1.g) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) gVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2847b.f17c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244q c0244q = this.f2846a;
        if (c0244q != null) {
            c0244q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244q c0244q = this.f2846a;
        if (c0244q != null) {
            c0244q.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f2847b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f2847b;
        if (dVar != null && drawable != null && !this.f2848c) {
            dVar.f16b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f2848c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f17c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f16b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f2848c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f2847b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f17c;
            if (i != 0) {
                Drawable u2 = q1.d.u(imageView.getContext(), i);
                if (u2 != null) {
                    AbstractC0239n0.a(u2);
                }
                imageView.setImageDrawable(u2);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f2847b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244q c0244q = this.f2846a;
        if (c0244q != null) {
            c0244q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0244q c0244q = this.f2846a;
        if (c0244q != null) {
            c0244q.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f2847b;
        if (dVar != null) {
            if (((i1.g) dVar.d) == null) {
                dVar.d = new i1.g();
            }
            i1.g gVar = (i1.g) dVar.d;
            gVar.f2431c = colorStateList;
            gVar.f2430b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f2847b;
        if (dVar != null) {
            if (((i1.g) dVar.d) == null) {
                dVar.d = new i1.g();
            }
            i1.g gVar = (i1.g) dVar.d;
            gVar.d = mode;
            gVar.f2429a = true;
            dVar.a();
        }
    }
}
