package p0;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3388a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3389b;

    /* renamed from: c, reason: collision with root package name */
    public float f3390c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3391e;

    /* renamed from: f, reason: collision with root package name */
    public float f3392f;

    /* renamed from: g, reason: collision with root package name */
    public float f3393g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3394j;

    /* renamed from: k, reason: collision with root package name */
    public String f3395k;

    public j() {
        this.f3388a = new Matrix();
        this.f3389b = new ArrayList();
        this.f3390c = RecyclerView.f1570A0;
        this.d = RecyclerView.f1570A0;
        this.f3391e = RecyclerView.f1570A0;
        this.f3392f = 1.0f;
        this.f3393g = 1.0f;
        this.h = RecyclerView.f1570A0;
        this.i = RecyclerView.f1570A0;
        this.f3394j = new Matrix();
        this.f3395k = null;
    }

    @Override // p0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3389b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3389b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3394j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3391e);
        matrix.postScale(this.f3392f, this.f3393g);
        matrix.postRotate(this.f3390c, RecyclerView.f1570A0, RecyclerView.f1570A0);
        matrix.postTranslate(this.h + this.d, this.i + this.f3391e);
    }

    public String getGroupName() {
        return this.f3395k;
    }

    public Matrix getLocalMatrix() {
        return this.f3394j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3391e;
    }

    public float getRotation() {
        return this.f3390c;
    }

    public float getScaleX() {
        return this.f3392f;
    }

    public float getScaleY() {
        return this.f3393g;
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
        if (f2 != this.f3391e) {
            this.f3391e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3390c) {
            this.f3390c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3392f) {
            this.f3392f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3393g) {
            this.f3393g = f2;
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
    public j(j jVar, o.b bVar) {
        h hVar;
        this.f3388a = new Matrix();
        this.f3389b = new ArrayList();
        this.f3390c = RecyclerView.f1570A0;
        this.d = RecyclerView.f1570A0;
        this.f3391e = RecyclerView.f1570A0;
        this.f3392f = 1.0f;
        this.f3393g = 1.0f;
        this.h = RecyclerView.f1570A0;
        this.i = RecyclerView.f1570A0;
        Matrix matrix = new Matrix();
        this.f3394j = matrix;
        this.f3395k = null;
        this.f3390c = jVar.f3390c;
        this.d = jVar.d;
        this.f3391e = jVar.f3391e;
        this.f3392f = jVar.f3392f;
        this.f3393g = jVar.f3393g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3395k;
        this.f3395k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3394j);
        ArrayList arrayList = jVar.f3389b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3389b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3380e = RecyclerView.f1570A0;
                    iVar2.f3382g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = RecyclerView.f1570A0;
                    iVar2.f3383j = 1.0f;
                    iVar2.f3384k = RecyclerView.f1570A0;
                    iVar2.f3385l = Paint.Cap.BUTT;
                    iVar2.f3386m = Paint.Join.MITER;
                    iVar2.f3387n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3380e = iVar.f3380e;
                    iVar2.f3382g = iVar.f3382g;
                    iVar2.f3381f = iVar.f3381f;
                    iVar2.f3398c = iVar.f3398c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3383j = iVar.f3383j;
                    iVar2.f3384k = iVar.f3384k;
                    iVar2.f3385l = iVar.f3385l;
                    iVar2.f3386m = iVar.f3386m;
                    iVar2.f3387n = iVar.f3387n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3389b.add(hVar);
                Object obj2 = hVar.f3397b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
