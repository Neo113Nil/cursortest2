package p0;

/* renamed from: p0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0323l extends AbstractC0322k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3770a;

    /* renamed from: b, reason: collision with root package name */
    public String f3771b;

    /* renamed from: c, reason: collision with root package name */
    public int f3772c;

    public AbstractC0323l() {
        this.f3770a = null;
        this.f3772c = 0;
    }

    public C.g[] getPathData() {
        return this.f3770a;
    }

    public String getPathName() {
        return this.f3771b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3770a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.g gVar = gVarArr2[i];
                char c2 = gVar.f236a;
                C.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f236a || gVar.f237b.length != gVar2.f237b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3770a = F1.l.v(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3770a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f236a = gVarArr[i2].f236a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f237b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f237b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0323l(AbstractC0323l abstractC0323l) {
        this.f3770a = null;
        this.f3772c = 0;
        this.f3771b = abstractC0323l.f3771b;
        this.f3770a = F1.l.v(abstractC0323l.f3770a);
    }
}
