package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hj {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj)) {
            return false;
        }
        hj hjVar = (hj) obj;
        return Objects.equals(this.a, hjVar.a) && Objects.equals(this.b, hjVar.b) && Objects.equals(this.c, hjVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
