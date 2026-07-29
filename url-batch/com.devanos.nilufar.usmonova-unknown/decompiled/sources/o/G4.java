package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class G4 {
    public final int a;
    public final C2002u5 b;
    public final String c;

    public G4(C2002u5 c2002u5, String str) {
        this.b = c2002u5;
        this.c = str;
        this.a = Arrays.hashCode(new Object[]{c2002u5, WU.a, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G4)) {
            return false;
        }
        G4 g4 = (G4) obj;
        if (!EB.o(this.b, g4.b)) {
            return false;
        }
        WU wu = WU.a;
        return EB.o(wu, wu) && EB.o(this.c, g4.c);
    }

    public final int hashCode() {
        return this.a;
    }
}
