package yads;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class na implements db3 {
    public final km0 a = new km0();

    @Override // yads.db3
    public final cb3 a() {
        return cb3.b;
    }

    @Override // yads.db3
    public final String a(Context context, v3 v3Var, fy2 fy2Var) {
        return this.a.a(context, new wt0(tt0.a(context, v3Var, fy2Var)).toString());
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
