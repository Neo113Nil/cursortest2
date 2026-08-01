package l0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3134a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3135b;

    /* renamed from: c, reason: collision with root package name */
    public float f3136c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3137e;

    /* renamed from: f, reason: collision with root package name */
    public float f3138f;

    /* renamed from: g, reason: collision with root package name */
    public float f3139g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3140j;

    /* renamed from: k, reason: collision with root package name */
    public String f3141k;

    public j() {
        this.f3134a = new Matrix();
        this.f3135b = new ArrayList();
        this.f3136c = 0.0f;
        this.d = 0.0f;
        this.f3137e = 0.0f;
        this.f3138f = 1.0f;
        this.f3139g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3140j = new Matrix();
        this.f3141k = null;
    }

    @Override // l0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3135b;
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
            ArrayList arrayList = this.f3135b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3140j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3137e);
        matrix.postScale(this.f3138f, this.f3139g);
        matrix.postRotate(this.f3136c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3137e);
    }

    public String getGroupName() {
        return this.f3141k;
    }

    public Matrix getLocalMatrix() {
        return this.f3140j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3137e;
    }

    public float getRotation() {
        return this.f3136c;
    }

    public float getScaleX() {
        return this.f3138f;
    }

    public float getScaleY() {
        return this.f3139g;
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
        if (f2 != this.f3137e) {
            this.f3137e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3136c) {
            this.f3136c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3138f) {
            this.f3138f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3139g) {
            this.f3139g = f2;
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
        this.f3134a = new Matrix();
        this.f3135b = new ArrayList();
        this.f3136c = 0.0f;
        this.d = 0.0f;
        this.f3137e = 0.0f;
        this.f3138f = 1.0f;
        this.f3139g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3140j = matrix;
        this.f3141k = null;
        this.f3136c = jVar.f3136c;
        this.d = jVar.d;
        this.f3137e = jVar.f3137e;
        this.f3138f = jVar.f3138f;
        this.f3139g = jVar.f3139g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f3141k;
        this.f3141k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f3140j);
        ArrayList arrayList = jVar.f3135b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f3135b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f3126e = 0.0f;
                    iVar2.f3128g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f3129j = 1.0f;
                    iVar2.f3130k = 0.0f;
                    iVar2.f3131l = Paint.Cap.BUTT;
                    iVar2.f3132m = Paint.Join.MITER;
                    iVar2.f3133n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f3126e = iVar.f3126e;
                    iVar2.f3128g = iVar.f3128g;
                    iVar2.f3127f = iVar.f3127f;
                    iVar2.f3144c = iVar.f3144c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f3129j = iVar.f3129j;
                    iVar2.f3130k = iVar.f3130k;
                    iVar2.f3131l = iVar.f3131l;
                    iVar2.f3132m = iVar.f3132m;
                    iVar2.f3133n = iVar.f3133n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3135b.add(hVar);
                Object obj2 = hVar.f3143b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
