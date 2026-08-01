package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import com.ionia.reidopitaco.libya.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class tr {
    public final MaterialButton a;
    public m10 b;
    public w20 c;
    public h d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public ls o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public tr(MaterialButton materialButton, m10 m10Var) {
        this.a = materialButton;
        this.b = m10Var;
    }

    public final ls a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (ls) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void c() {
        ls lsVar = new ls(this.b);
        w20 w20Var = this.c;
        if (w20Var != null) {
            lsVar.p(w20Var);
        }
        h hVar = this.d;
        if (hVar != null) {
            lsVar.I = hVar;
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        lsVar.n(context);
        lsVar.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            lsVar.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        lsVar.g.j = f;
        lsVar.invalidateSelf();
        js jsVar = lsVar.g;
        if (jsVar.d != colorStateList) {
            jsVar.d = colorStateList;
            lsVar.onStateChange(lsVar.getState());
        }
        ls lsVar2 = new ls(this.b);
        w20 w20Var2 = this.c;
        if (w20Var2 != null) {
            lsVar2.p(w20Var2);
        }
        int i = 0;
        lsVar2.setTint(0);
        float f2 = this.j;
        int c0 = this.p ? g8.c0(materialButton.getContext(), m60.W(materialButton, R.attr.colorSurface)) : 0;
        lsVar2.g.j = f2;
        lsVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c0);
        js jsVar2 = lsVar2.g;
        if (jsVar2.d != valueOf) {
            jsVar2.d = valueOf;
            lsVar2.onStateChange(lsVar2.getState());
        }
        ls lsVar3 = new ls(this.b);
        this.o = lsVar3;
        w20 w20Var3 = this.c;
        if (w20Var3 != null) {
            lsVar3.p(w20Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(d00.b(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{lsVar2, lsVar}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        ls a = a(false);
        if (a != null) {
            a.q(this.v);
            a.setState(materialButton.getDrawableState());
        }
        Drawable background = materialButton.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else {
            if (background instanceof DrawableWrapper) {
                Drawable drawable = ((DrawableWrapper) background).getDrawable();
                if (drawable instanceof FocusRingDrawable) {
                    focusRingDrawable = (FocusRingDrawable) drawable;
                }
            }
            if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                while (true) {
                    if (i >= layerDrawable.getNumberOfLayers()) {
                        break;
                    }
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable2;
                        break;
                    }
                    i++;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.m = new WeakReference(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        z10 z10Var;
        ls a = a(false);
        if (a != null) {
            a.s(this.b);
            w20 w20Var = this.c;
            if (w20Var != null) {
                a.p(w20Var);
            }
        }
        ls a2 = a(true);
        if (a2 != null) {
            a2.s(this.b);
            w20 w20Var2 = this.c;
            if (w20Var2 != null) {
                a2.p(w20Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof z10) {
                z10Var = (z10) findDrawableByLayerId;
                if (z10Var == null) {
                    boolean z = z10Var instanceof ls;
                    m10 m10Var = this.b;
                    if (!z) {
                        z10Var.setShapeAppearanceModel(m10Var.c());
                        return;
                    }
                    ls lsVar = (ls) z10Var;
                    lsVar.s(m10Var);
                    w20 w20Var3 = this.c;
                    if (w20Var3 != null) {
                        lsVar.p(w20Var3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z10Var = null;
        if (z10Var == null) {
        }
    }

    public final void e() {
        int i = 0;
        ls a = a(false);
        ls a2 = a(true);
        if (a != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            a.g.j = f;
            a.invalidateSelf();
            js jsVar = a.g;
            if (jsVar.d != colorStateList) {
                jsVar.d = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f2 = this.j;
                if (this.p) {
                    MaterialButton materialButton = this.a;
                    i = g8.c0(materialButton.getContext(), m60.W(materialButton, R.attr.colorSurface));
                }
                a2.g.j = f2;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                js jsVar2 = a2.g;
                if (jsVar2.d != valueOf) {
                    jsVar2.d = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
