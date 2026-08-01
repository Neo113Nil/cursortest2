package l;

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

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0244x extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0228p f3108a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3109b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0244x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        this.f3110c = false;
        Q0.a(this, getContext());
        C0228p c0228p = new C0228p(this);
        this.f3108a = c0228p;
        c0228p.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3109b = dVar;
        dVar.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0228p c0228p = this.f3108a;
        if (c0228p != null) {
            c0228p.a();
        }
        B.d dVar = this.f3109b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0228p c0228p = this.f3108a;
        if (c0228p != null) {
            return c0228p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228p c0228p = this.f3108a;
        if (c0228p != null) {
            return c0228p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        S0 s02;
        B.d dVar = this.f3109b;
        if (dVar == null || (s02 = (S0) dVar.f45c) == null) {
            return null;
        }
        return s02.f2942a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        S0 s02;
        B.d dVar = this.f3109b;
        if (dVar == null || (s02 = (S0) dVar.f45c) == null) {
            return null;
        }
        return s02.f2943b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3109b.f44b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228p c0228p = this.f3108a;
        if (c0228p != null) {
            c0228p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228p c0228p = this.f3108a;
        if (c0228p != null) {
            c0228p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3109b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3109b;
        if (dVar != null && drawable != null && !this.f3110c) {
            dVar.f43a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3110c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f44b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f43a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3110c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3109b;
        ImageView imageView = (ImageView) dVar.f44b;
        if (i != 0) {
            Drawable w2 = T.e.w(imageView.getContext(), i);
            if (w2 != null) {
                AbstractC0221l0.a(w2);
            }
            imageView.setImageDrawable(w2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3109b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228p c0228p = this.f3108a;
        if (c0228p != null) {
            c0228p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228p c0228p = this.f3108a;
        if (c0228p != null) {
            c0228p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3109b;
        if (dVar != null) {
            if (((S0) dVar.f45c) == null) {
                dVar.f45c = new S0();
            }
            S0 s02 = (S0) dVar.f45c;
            s02.f2942a = colorStateList;
            s02.d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3109b;
        if (dVar != null) {
            if (((S0) dVar.f45c) == null) {
                dVar.f45c = new S0();
            }
            S0 s02 = (S0) dVar.f45c;
            s02.f2943b = mode;
            s02.f2944c = true;
            dVar.a();
        }
    }
}
