package l0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public C.f[] f3145a;

    /* renamed from: b, reason: collision with root package name */
    public String f3146b;

    /* renamed from: c, reason: collision with root package name */
    public int f3147c;

    public l() {
        this.f3145a = null;
        this.f3147c = 0;
    }

    public C.f[] getPathData() {
        return this.f3145a;
    }

    public String getPathName() {
        return this.f3146b;
    }

    public void setPathData(C.f[] fVarArr) {
        C.f[] fVarArr2 = this.f3145a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.f fVar = fVarArr2[i];
                char c2 = fVar.f58a;
                C.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f58a || fVar.f59b.length != fVar2.f59b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3145a = q1.l.A(fVarArr);
            return;
        }
        C.f[] fVarArr3 = this.f3145a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f58a = fVarArr[i2].f58a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f59b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f59b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f3145a = null;
        this.f3147c = 0;
        this.f3146b = lVar.f3146b;
        this.f3145a = q1.l.A(lVar.f3145a);
    }
}
