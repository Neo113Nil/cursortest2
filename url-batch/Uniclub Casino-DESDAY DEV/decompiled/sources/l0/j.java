package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3137a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3138b;

    /* renamed from: c, reason: collision with root package name */
    public float f3139c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3140e;

    /* renamed from: f, reason: collision with root package name */
    public float f3141f;

    /* renamed from: g, reason: collision with root package name */
    public float f3142g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3143j;

    /* renamed from: k, reason: collision with root package name */
    public String f3144k;

    public j() {
        this.f3137a = new Matrix();
        this.f3138b = new ArrayList();
        this.f3139c = 0.0f;
        this.d = 0.0f;
        this.f3140e = 0.0f;
        this.f3141f = 1.0f;
        this.f3142g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3143j = new Matrix();
        this.f3144k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3138b;
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
            ArrayList arrayList = this.f3138b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3143j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3140e);
        matrix.postScale(this.f3141f, this.f3142g);
        matrix.postRotate(this.f3139c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3140e);
    }

    public String getGroupName() {
        return this.f3144k;
    }

    public Matrix getLocalMatrix() {
        return this.f3143j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3140e;
    }

    public float getRotation() {
        return this.f3139c;
    }

    public float getScaleX() {
        return this.f3141f;
    }

    public float getScaleY() {
        return this.f3142g;
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
        if (f2 != this.f3140e) {
            this.f3140e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3139c) {
            this.f3139c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3141f) {
            this.f3141f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3142g) {
            this.f3142g = f2;
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
        this.f3137a = new Matrix();
        this.f3138b = new ArrayList();
        this.f3139c = 0.0f;
        this.d = 0.0f;
        this.f3140e = 0.0f;
        this.f3141f = 1.0f;
        this.f3142g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3143j = matrix;
        this.f3144k = null;
        this.f3139c = jVar.f3139c;
        this.d = jVar.d;
        this.f3140e = jVar.f3140e;
        this.f3141f = jVar.f3141f;
        this.f3142g = jVar.f3142g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3144k;
        this.f3144k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3143j);
        ArrayList arrayList = jVar.f3138b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3138b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3129e = 0.0f;
                    iVar2.f3131g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3132j = 1.0f;
                    iVar2.f3133k = 0.0f;
                    iVar2.f3134l = Paint.Cap.BUTT;
                    iVar2.f3135m = Paint.Join.MITER;
                    iVar2.f3136n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3129e = iVar.f3129e;
                    iVar2.f3131g = iVar.f3131g;
                    iVar2.f3130f = iVar.f3130f;
                    iVar2.f3147c = iVar.f3147c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3132j = iVar.f3132j;
                    iVar2.f3133k = iVar.f3133k;
                    iVar2.f3134l = iVar.f3134l;
                    iVar2.f3135m = iVar.f3135m;
                    iVar2.f3136n = iVar.f3136n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3138b.add(hVar);
                Object obj2 = hVar.f3146b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
