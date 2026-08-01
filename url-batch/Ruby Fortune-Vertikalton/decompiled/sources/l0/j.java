package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3128a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3129b;

    /* renamed from: c, reason: collision with root package name */
    public float f3130c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3131e;

    /* renamed from: f, reason: collision with root package name */
    public float f3132f;

    /* renamed from: g, reason: collision with root package name */
    public float f3133g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3134j;

    /* renamed from: k, reason: collision with root package name */
    public String f3135k;

    public j() {
        this.f3128a = new Matrix();
        this.f3129b = new ArrayList();
        this.f3130c = 0.0f;
        this.d = 0.0f;
        this.f3131e = 0.0f;
        this.f3132f = 1.0f;
        this.f3133g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3134j = new Matrix();
        this.f3135k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3129b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // l0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3129b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3134j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3131e);
        matrix.postScale(this.f3132f, this.f3133g);
        matrix.postRotate(this.f3130c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3131e);
    }

    public String getGroupName() {
        return this.f3135k;
    }

    public Matrix getLocalMatrix() {
        return this.f3134j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3131e;
    }

    public float getRotation() {
        return this.f3130c;
    }

    public float getScaleX() {
        return this.f3132f;
    }

    public float getScaleY() {
        return this.f3133g;
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
        if (f2 != this.f3131e) {
            this.f3131e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3130c) {
            this.f3130c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3132f) {
            this.f3132f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3133g) {
            this.f3133g = f2;
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
        this.f3128a = new Matrix();
        this.f3129b = new ArrayList();
        this.f3130c = 0.0f;
        this.d = 0.0f;
        this.f3131e = 0.0f;
        this.f3132f = 1.0f;
        this.f3133g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3134j = matrix;
        this.f3135k = null;
        this.f3130c = jVar.f3130c;
        this.d = jVar.d;
        this.f3131e = jVar.f3131e;
        this.f3132f = jVar.f3132f;
        this.f3133g = jVar.f3133g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3135k;
        this.f3135k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3134j);
        ArrayList arrayList = jVar.f3129b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3129b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3120e = 0.0f;
                    iVar2.f3122g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3123j = 1.0f;
                    iVar2.f3124k = 0.0f;
                    iVar2.f3125l = Paint.Cap.BUTT;
                    iVar2.f3126m = Paint.Join.MITER;
                    iVar2.f3127n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3120e = iVar.f3120e;
                    iVar2.f3122g = iVar.f3122g;
                    iVar2.f3121f = iVar.f3121f;
                    iVar2.f3138c = iVar.f3138c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3123j = iVar.f3123j;
                    iVar2.f3124k = iVar.f3124k;
                    iVar2.f3125l = iVar.f3125l;
                    iVar2.f3126m = iVar.f3126m;
                    iVar2.f3127n = iVar.f3127n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3129b.add(hVar);
                Object obj2 = hVar.f3137b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
