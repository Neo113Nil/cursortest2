package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3112a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3113b;

    /* renamed from: c, reason: collision with root package name */
    public float f3114c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3115e;

    /* renamed from: f, reason: collision with root package name */
    public float f3116f;

    /* renamed from: g, reason: collision with root package name */
    public float f3117g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3118j;

    /* renamed from: k, reason: collision with root package name */
    public String f3119k;

    public j() {
        this.f3112a = new Matrix();
        this.f3113b = new ArrayList();
        this.f3114c = 0.0f;
        this.d = 0.0f;
        this.f3115e = 0.0f;
        this.f3116f = 1.0f;
        this.f3117g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3118j = new Matrix();
        this.f3119k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3113b;
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
            ArrayList arrayList = this.f3113b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3118j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3115e);
        matrix.postScale(this.f3116f, this.f3117g);
        matrix.postRotate(this.f3114c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3115e);
    }

    public String getGroupName() {
        return this.f3119k;
    }

    public Matrix getLocalMatrix() {
        return this.f3118j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3115e;
    }

    public float getRotation() {
        return this.f3114c;
    }

    public float getScaleX() {
        return this.f3116f;
    }

    public float getScaleY() {
        return this.f3117g;
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
        if (f2 != this.f3115e) {
            this.f3115e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3114c) {
            this.f3114c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3116f) {
            this.f3116f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3117g) {
            this.f3117g = f2;
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
        this.f3112a = new Matrix();
        this.f3113b = new ArrayList();
        this.f3114c = 0.0f;
        this.d = 0.0f;
        this.f3115e = 0.0f;
        this.f3116f = 1.0f;
        this.f3117g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3118j = matrix;
        this.f3119k = null;
        this.f3114c = jVar.f3114c;
        this.d = jVar.d;
        this.f3115e = jVar.f3115e;
        this.f3116f = jVar.f3116f;
        this.f3117g = jVar.f3117g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3119k;
        this.f3119k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3118j);
        ArrayList arrayList = jVar.f3113b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3113b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3104e = 0.0f;
                    iVar2.f3106g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3107j = 1.0f;
                    iVar2.f3108k = 0.0f;
                    iVar2.f3109l = Paint.Cap.BUTT;
                    iVar2.f3110m = Paint.Join.MITER;
                    iVar2.f3111n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3104e = iVar.f3104e;
                    iVar2.f3106g = iVar.f3106g;
                    iVar2.f3105f = iVar.f3105f;
                    iVar2.f3122c = iVar.f3122c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3107j = iVar.f3107j;
                    iVar2.f3108k = iVar.f3108k;
                    iVar2.f3109l = iVar.f3109l;
                    iVar2.f3110m = iVar.f3110m;
                    iVar2.f3111n = iVar.f3111n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3113b.add(hVar);
                Object obj2 = hVar.f3121b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
