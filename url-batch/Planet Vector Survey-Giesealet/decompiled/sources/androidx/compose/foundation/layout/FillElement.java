package androidx.compose.foundation.layout;

import defpackage.br;
import defpackage.t50;
import defpackage.y6;
import defpackage.z50;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class FillElement extends z50 {
    public final int a;

    public FillElement(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.a == ((FillElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.z50
    public final t50 f() {
        br brVar = new br();
        brVar.r = this.a;
        brVar.s = 1.0f;
        return brVar;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        br brVar = (br) t50Var;
        brVar.r = this.a;
        brVar.s = 1.0f;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + (y6.D(this.a) * 31);
    }
}
