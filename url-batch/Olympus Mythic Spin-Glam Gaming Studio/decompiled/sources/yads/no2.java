package yads;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class no2 extends oo2 {
    public final tl2 f;
    public final g03 g;

    public no2(jw0 jw0Var, l41 l41Var, xx2 xx2Var, ArrayList arrayList) {
        super(jw0Var, l41Var, xx2Var, arrayList);
        Uri.parse(((lo) l41Var.get(0)).a);
        long j = xx2Var.e;
        tl2 tl2Var = j <= 0 ? null : new tl2(null, xx2Var.d, j);
        this.f = tl2Var;
        this.g = tl2Var == null ? new g03(new tl2(null, 0L, -1L)) : null;
    }

    @Override // yads.oo2
    public final String c() {
        return null;
    }

    @Override // yads.oo2
    public final k30 d() {
        return this.g;
    }

    @Override // yads.oo2
    public final tl2 e() {
        return this.f;
    }
}
