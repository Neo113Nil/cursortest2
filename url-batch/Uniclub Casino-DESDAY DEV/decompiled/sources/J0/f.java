package J0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f266a;

    /* renamed from: b, reason: collision with root package name */
    public C0.a f267b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f268c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f269e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f270f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f271g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f272j;

    /* renamed from: k, reason: collision with root package name */
    public int f273k;

    /* renamed from: l, reason: collision with root package name */
    public float f274l;

    /* renamed from: m, reason: collision with root package name */
    public float f275m;

    /* renamed from: n, reason: collision with root package name */
    public int f276n;

    /* renamed from: o, reason: collision with root package name */
    public int f277o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f278p;

    public f(k kVar) {
        this.f268c = null;
        this.d = null;
        this.f269e = null;
        this.f270f = PorterDuff.Mode.SRC_IN;
        this.f271g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f273k = 255;
        this.f274l = 0.0f;
        this.f275m = 0.0f;
        this.f276n = 0;
        this.f277o = 0;
        this.f278p = Paint.Style.FILL_AND_STROKE;
        this.f266a = kVar;
        this.f267b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f283e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f268c = null;
        this.d = null;
        this.f269e = null;
        this.f270f = PorterDuff.Mode.SRC_IN;
        this.f271g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f273k = 255;
        this.f274l = 0.0f;
        this.f275m = 0.0f;
        this.f276n = 0;
        this.f277o = 0;
        this.f278p = Paint.Style.FILL_AND_STROKE;
        this.f266a = fVar.f266a;
        this.f267b = fVar.f267b;
        this.f272j = fVar.f272j;
        this.f268c = fVar.f268c;
        this.d = fVar.d;
        this.f270f = fVar.f270f;
        this.f269e = fVar.f269e;
        this.f273k = fVar.f273k;
        this.h = fVar.h;
        this.f277o = fVar.f277o;
        this.i = fVar.i;
        this.f274l = fVar.f274l;
        this.f275m = fVar.f275m;
        this.f276n = fVar.f276n;
        this.f278p = fVar.f278p;
        if (fVar.f271g != null) {
            this.f271g = new Rect(fVar.f271g);
        }
    }
}
