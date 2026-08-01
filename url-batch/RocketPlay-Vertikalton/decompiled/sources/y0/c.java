package y0;

import K.T;
import M0.f;
import M0.g;
import M0.k;
import M0.v;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.luckycounter.drinkwater.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f4624a;

    /* renamed from: b, reason: collision with root package name */
    public k f4625b;

    /* renamed from: c, reason: collision with root package name */
    public int f4626c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4627e;

    /* renamed from: f, reason: collision with root package name */
    public int f4628f;

    /* renamed from: g, reason: collision with root package name */
    public int f4629g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f4630j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4631k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4632l;

    /* renamed from: m, reason: collision with root package name */
    public g f4633m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4637q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f4639s;

    /* renamed from: t, reason: collision with root package name */
    public int f4640t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4634n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4635o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4636p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4638r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f4624a = materialButton;
        this.f4625b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f4639s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4639s.getNumberOfLayers() > 2 ? (v) this.f4639s.getDrawable(2) : (v) this.f4639s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f4639s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f4639s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f4625b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = T.f633a;
        MaterialButton materialButton = this.f4624a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f4627e;
        int i4 = this.f4628f;
        this.f4628f = i2;
        this.f4627e = i;
        if (!this.f4635o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f4625b);
        MaterialButton materialButton = this.f4624a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f4630j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f4631k;
        gVar.f828a.f820j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f828a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f4625b);
        gVar2.setTint(0);
        float f3 = this.h;
        int C2 = this.f4634n ? F1.d.C(materialButton, R.attr.colorSurface) : 0;
        gVar2.f828a.f820j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(C2);
        f fVar2 = gVar2.f828a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f4625b);
        this.f4633m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(K0.a.a(this.f4632l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f4626c, this.f4627e, this.d, this.f4628f), this.f4633m);
        this.f4639s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f4640t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f4631k;
            b2.f828a.f820j = f2;
            b2.invalidateSelf();
            f fVar = b2.f828a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int C2 = this.f4634n ? F1.d.C(this.f4624a, R.attr.colorSurface) : 0;
                b3.f828a.f820j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(C2);
                f fVar2 = b3.f828a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
