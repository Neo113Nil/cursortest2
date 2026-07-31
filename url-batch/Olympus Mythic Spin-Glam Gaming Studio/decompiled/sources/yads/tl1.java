package yads;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes4.dex */
public final class tl1 implements nq {
    public static final tl1 d = new tl1(new sl1());
    public static final mq e = new mq() { // from class: yads.tl1$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return tl1.a(bundle);
        }
    };
    public final Uri b;
    public final String c;

    public tl1(sl1 sl1Var) {
        this.b = sl1Var.a;
        this.c = sl1Var.b;
    }

    public static tl1 a(Bundle bundle) {
        sl1 sl1Var = new sl1();
        sl1Var.a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
        sl1Var.b = bundle.getString(Integer.toString(1, 36));
        sl1Var.c = bundle.getBundle(Integer.toString(2, 36));
        return new tl1(sl1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return sb3.a(this.b, tl1Var.b) && sb3.a(this.c, tl1Var.c);
    }

    public final int hashCode() {
        Uri uri = this.b;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
