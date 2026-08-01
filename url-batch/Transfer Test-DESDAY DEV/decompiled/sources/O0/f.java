package O0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f518a;

    /* renamed from: b, reason: collision with root package name */
    public H0.a f519b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f520c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f521e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f522f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f523g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f524j;

    /* renamed from: k, reason: collision with root package name */
    public int f525k;

    /* renamed from: l, reason: collision with root package name */
    public float f526l;

    /* renamed from: m, reason: collision with root package name */
    public float f527m;

    /* renamed from: n, reason: collision with root package name */
    public int f528n;

    /* renamed from: o, reason: collision with root package name */
    public int f529o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f530p;

    public f(k kVar) {
        this.f520c = null;
        this.d = null;
        this.f521e = null;
        this.f522f = PorterDuff.Mode.SRC_IN;
        this.f523g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f525k = 255;
        this.f526l = RecyclerView.f1570A0;
        this.f527m = RecyclerView.f1570A0;
        this.f528n = 0;
        this.f529o = 0;
        this.f530p = Paint.Style.FILL_AND_STROKE;
        this.f518a = kVar;
        this.f519b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f535e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f520c = null;
        this.d = null;
        this.f521e = null;
        this.f522f = PorterDuff.Mode.SRC_IN;
        this.f523g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f525k = 255;
        this.f526l = RecyclerView.f1570A0;
        this.f527m = RecyclerView.f1570A0;
        this.f528n = 0;
        this.f529o = 0;
        this.f530p = Paint.Style.FILL_AND_STROKE;
        this.f518a = fVar.f518a;
        this.f519b = fVar.f519b;
        this.f524j = fVar.f524j;
        this.f520c = fVar.f520c;
        this.d = fVar.d;
        this.f522f = fVar.f522f;
        this.f521e = fVar.f521e;
        this.f525k = fVar.f525k;
        this.h = fVar.h;
        this.f529o = fVar.f529o;
        this.i = fVar.i;
        this.f526l = fVar.f526l;
        this.f527m = fVar.f527m;
        this.f528n = fVar.f528n;
        this.f530p = fVar.f530p;
        if (fVar.f523g != null) {
            this.f523g = new Rect(fVar.f523g);
        }
    }
}
