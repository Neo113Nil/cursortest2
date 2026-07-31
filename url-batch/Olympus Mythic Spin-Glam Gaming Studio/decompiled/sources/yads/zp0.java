package yads;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class zp0 implements aq0 {
    public final Context a;
    public final mg2 b;

    public zp0(Context context, mg2 mg2Var) {
        this.a = context;
        this.b = mg2Var;
    }

    @Override // yads.aq0
    public final Parcelable getValue() {
        return ng2.a(this.a, this.b);
    }
}
