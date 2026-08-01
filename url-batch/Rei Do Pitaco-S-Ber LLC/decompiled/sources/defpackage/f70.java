package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class f70 extends e70 {
    public ew[] a;
    public String b;
    public int c;

    public f70(f70 f70Var) {
        this.a = null;
        this.c = 0;
        this.b = f70Var.b;
        ew[] ewVarArr = f70Var.a;
        ew[] ewVarArr2 = new ew[ewVarArr.length];
        for (int i = 0; i < ewVarArr.length; i++) {
            ewVarArr2[i] = new ew(ewVarArr[i]);
        }
        this.a = ewVarArr2;
    }

    public ew[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(ew[] ewVarArr) {
        int i;
        ew[] ewVarArr2 = this.a;
        if (ewVarArr2 != null && ewVarArr != null && ewVarArr2.length == ewVarArr.length) {
            for (0; i < ewVarArr2.length; i + 1) {
                ew ewVar = ewVarArr2[i];
                char c = ewVar.a;
                ew ewVar2 = ewVarArr[i];
                i = (c == ewVar2.a && ewVar.b.length == ewVar2.b.length) ? i + 1 : 0;
            }
            ew[] ewVarArr3 = this.a;
            for (int i2 = 0; i2 < ewVarArr.length; i2++) {
                ewVarArr3[i2].a = ewVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = ewVarArr[i2].b;
                    if (i3 < fArr.length) {
                        ewVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        ew[] ewVarArr4 = new ew[ewVarArr.length];
        for (int i4 = 0; i4 < ewVarArr.length; i4++) {
            ewVarArr4[i4] = new ew(ewVarArr[i4]);
        }
        this.a = ewVarArr4;
    }

    public f70() {
        this.a = null;
        this.c = 0;
    }
}
