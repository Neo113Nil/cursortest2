package p0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3396a;

    /* renamed from: b, reason: collision with root package name */
    public String f3397b;

    /* renamed from: c, reason: collision with root package name */
    public int f3398c;

    public l() {
        this.f3396a = null;
        this.f3398c = 0;
    }

    public C.g[] getPathData() {
        return this.f3396a;
    }

    public String getPathName() {
        return this.f3397b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3396a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.g gVar = gVarArr2[i];
                char c2 = gVar.f98a;
                C.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f98a || gVar.f99b.length != gVar2.f99b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3396a = A.c.y(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3396a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f98a = gVarArr[i2].f98a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f99b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f99b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f3396a = null;
        this.f3398c = 0;
        this.f3397b = lVar.f3397b;
        this.f3396a = A.c.y(lVar.f3396a);
    }
}
