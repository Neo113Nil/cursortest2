package p0;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: p0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321j extends AbstractC0322k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3762a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3763b;

    /* renamed from: c, reason: collision with root package name */
    public float f3764c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3765e;

    /* renamed from: f, reason: collision with root package name */
    public float f3766f;

    /* renamed from: g, reason: collision with root package name */
    public float f3767g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3768j;

    /* renamed from: k, reason: collision with root package name */
    public String f3769k;

    public C0321j() {
        this.f3762a = new Matrix();
        this.f3763b = new ArrayList();
        this.f3764c = RecyclerView.f1949A0;
        this.d = RecyclerView.f1949A0;
        this.f3765e = RecyclerView.f1949A0;
        this.f3766f = 1.0f;
        this.f3767g = 1.0f;
        this.h = RecyclerView.f1949A0;
        this.i = RecyclerView.f1949A0;
        this.f3768j = new Matrix();
        this.f3769k = null;
    }

    @Override // p0.AbstractC0322k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3763b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0322k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p0.AbstractC0322k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3763b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0322k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3768j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3765e);
        matrix.postScale(this.f3766f, this.f3767g);
        matrix.postRotate(this.f3764c, RecyclerView.f1949A0, RecyclerView.f1949A0);
        matrix.postTranslate(this.h + this.d, this.i + this.f3765e);
    }

    public String getGroupName() {
        return this.f3769k;
    }

    public Matrix getLocalMatrix() {
        return this.f3768j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3765e;
    }

    public float getRotation() {
        return this.f3764c;
    }

    public float getScaleX() {
        return this.f3766f;
    }

    public float getScaleY() {
        return this.f3767g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f3765e) {
            this.f3765e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3764c) {
            this.f3764c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3766f) {
            this.f3766f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3767g) {
            this.f3767g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0321j(C0321j c0321j, o.b bVar) {
        C0319h c0319h;
        this.f3762a = new Matrix();
        this.f3763b = new ArrayList();
        this.f3764c = RecyclerView.f1949A0;
        this.d = RecyclerView.f1949A0;
        this.f3765e = RecyclerView.f1949A0;
        this.f3766f = 1.0f;
        this.f3767g = 1.0f;
        this.h = RecyclerView.f1949A0;
        this.i = RecyclerView.f1949A0;
        Matrix matrix = new Matrix();
        this.f3768j = matrix;
        this.f3769k = null;
        this.f3764c = c0321j.f3764c;
        this.d = c0321j.d;
        this.f3765e = c0321j.f3765e;
        this.f3766f = c0321j.f3766f;
        this.f3767g = c0321j.f3767g;
        this.h = c0321j.h;
        this.i = c0321j.i;
        String str = c0321j.f3769k;
        this.f3769k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(c0321j.f3768j);
        ArrayList arrayList = c0321j.f3763b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0321j) {
                this.f3763b.add(new C0321j((C0321j) obj, bVar));
            } else {
                if (obj instanceof C0320i) {
                    C0320i c0320i = (C0320i) obj;
                    C0320i c0320i2 = new C0320i(c0320i);
                    c0320i2.f3754e = RecyclerView.f1949A0;
                    c0320i2.f3756g = 1.0f;
                    c0320i2.h = 1.0f;
                    c0320i2.i = RecyclerView.f1949A0;
                    c0320i2.f3757j = 1.0f;
                    c0320i2.f3758k = RecyclerView.f1949A0;
                    c0320i2.f3759l = Paint.Cap.BUTT;
                    c0320i2.f3760m = Paint.Join.MITER;
                    c0320i2.f3761n = 4.0f;
                    c0320i2.d = c0320i.d;
                    c0320i2.f3754e = c0320i.f3754e;
                    c0320i2.f3756g = c0320i.f3756g;
                    c0320i2.f3755f = c0320i.f3755f;
                    c0320i2.f3772c = c0320i.f3772c;
                    c0320i2.h = c0320i.h;
                    c0320i2.i = c0320i.i;
                    c0320i2.f3757j = c0320i.f3757j;
                    c0320i2.f3758k = c0320i.f3758k;
                    c0320i2.f3759l = c0320i.f3759l;
                    c0320i2.f3760m = c0320i.f3760m;
                    c0320i2.f3761n = c0320i.f3761n;
                    c0319h = c0320i2;
                } else if (obj instanceof C0319h) {
                    c0319h = new C0319h((C0319h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3763b.add(c0319h);
                Object obj2 = c0319h.f3771b;
                if (obj2 != null) {
                    bVar.put(obj2, c0319h);
                }
            }
        }
    }
}
