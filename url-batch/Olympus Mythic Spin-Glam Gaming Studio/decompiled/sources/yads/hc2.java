package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes6.dex */
public final class hc2 implements db3 {
    public final vq1 a;
    public final km0 b;

    public hc2(vq1 vq1Var) {
        km0 km0Var = new km0();
        this.a = vq1Var;
        this.b = km0Var;
    }

    @Override // yads.db3
    public final cb3 a() {
        return cb3.c;
    }

    @Override // yads.db3
    public final String a(Context context, v3 v3Var, fy2 fy2Var) {
        Map map = this.a.c;
        st0 a = tt0.a(context, v3Var, fy2Var);
        if (map != null) {
            a.n.putAll(map);
        }
        return this.b.a(context, new wt0(a).toString());
    }

    @Override // yads.db3
    public final String a(v3 v3Var) {
        String str = v3Var.b.a.e;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }
}
