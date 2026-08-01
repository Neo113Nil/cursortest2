package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mx0 extends lx0 {
    public final /* synthetic */ int g;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g) {
            case 0:
                int i = this.f;
                this.f = i + 2;
                Object[] objArr = this.d;
                return new v40(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f;
                this.f = i2 + 2;
                return this.d[i2];
            default:
                int i3 = this.f;
                this.f = i3 + 2;
                return this.d[i3 + 1];
        }
    }
}
