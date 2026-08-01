package M0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f814a;

    /* renamed from: b, reason: collision with root package name */
    public F0.a f815b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f816c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f817e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f818f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f819g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f820j;

    /* renamed from: k, reason: collision with root package name */
    public int f821k;

    /* renamed from: l, reason: collision with root package name */
    public float f822l;

    /* renamed from: m, reason: collision with root package name */
    public float f823m;

    /* renamed from: n, reason: collision with root package name */
    public int f824n;

    /* renamed from: o, reason: collision with root package name */
    public int f825o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f826p;

    public f(k kVar) {
        this.f816c = null;
        this.d = null;
        this.f817e = null;
        this.f818f = PorterDuff.Mode.SRC_IN;
        this.f819g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f821k = 255;
        this.f822l = RecyclerView.f1949A0;
        this.f823m = RecyclerView.f1949A0;
        this.f824n = 0;
        this.f825o = 0;
        this.f826p = Paint.Style.FILL_AND_STROKE;
        this.f814a = kVar;
        this.f815b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f831e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f816c = null;
        this.d = null;
        this.f817e = null;
        this.f818f = PorterDuff.Mode.SRC_IN;
        this.f819g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f821k = 255;
        this.f822l = RecyclerView.f1949A0;
        this.f823m = RecyclerView.f1949A0;
        this.f824n = 0;
        this.f825o = 0;
        this.f826p = Paint.Style.FILL_AND_STROKE;
        this.f814a = fVar.f814a;
        this.f815b = fVar.f815b;
        this.f820j = fVar.f820j;
        this.f816c = fVar.f816c;
        this.d = fVar.d;
        this.f818f = fVar.f818f;
        this.f817e = fVar.f817e;
        this.f821k = fVar.f821k;
        this.h = fVar.h;
        this.f825o = fVar.f825o;
        this.i = fVar.i;
        this.f822l = fVar.f822l;
        this.f823m = fVar.f823m;
        this.f824n = fVar.f824n;
        this.f826p = fVar.f826p;
        if (fVar.f819g != null) {
            this.f819g = new Rect(fVar.f819g);
        }
    }
}
