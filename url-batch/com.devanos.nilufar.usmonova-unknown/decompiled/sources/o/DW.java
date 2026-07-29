package o;

/* loaded from: classes.dex */
public final class DW extends CW {
    public final /* synthetic */ int k;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                int i = this.j;
                this.j = i + 2;
                Object[] objArr = this.h;
                return new C2338zB(objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.j;
                this.j = i2 + 2;
                return this.h[i2];
            default:
                int i3 = this.j;
                this.j = i3 + 2;
                return this.h[i3 + 1];
        }
    }
}
