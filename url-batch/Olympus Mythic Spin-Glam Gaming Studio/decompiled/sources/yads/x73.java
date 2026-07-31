package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class x73 implements nq {
    public static final mq g = new mq() { // from class: yads.x73$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return x73.a(bundle);
        }
    };
    public final int b;
    public final String c;
    public final int d;
    public final jw0[] e;
    public int f;

    public x73(String str, jw0... jw0VarArr) {
        if (jw0VarArr.length <= 0) {
            throw new IllegalArgumentException();
        }
        this.c = str;
        this.e = jw0VarArr;
        this.b = jw0VarArr.length;
        int d = vt1.d(jw0VarArr[0].m);
        this.d = d == -1 ? vt1.d(jw0VarArr[0].l) : d;
        String str2 = jw0VarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = jw0VarArr[0].f | 16384;
        int i2 = 1;
        while (true) {
            jw0[] jw0VarArr2 = this.e;
            if (i2 >= jw0VarArr2.length) {
                return;
            }
            String str3 = jw0VarArr2[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                jw0[] jw0VarArr3 = this.e;
                gh1.b("TrackGroup", gh1.a("", new IllegalStateException("Different languages combined in one TrackGroup: '" + jw0VarArr3[0].d + "' (track 0) and '" + jw0VarArr3[i2].d + "' (track " + i2 + ")")));
                return;
            }
            jw0[] jw0VarArr4 = this.e;
            if (i != (jw0VarArr4[i2].f | 16384)) {
                gh1.b("TrackGroup", gh1.a("", new IllegalStateException("Different role flags combined in one TrackGroup: '" + Integer.toBinaryString(jw0VarArr4[0].f) + "' (track 0) and '" + Integer.toBinaryString(this.e[i2].f) + "' (track " + i2 + ")")));
                return;
            }
            i2++;
        }
    }

    public static x73 a(Bundle bundle) {
        um2 a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            i41 i41Var = l41.c;
            a = um2.f;
        } else {
            a = oq.a(jw0.I, parcelableArrayList);
        }
        return new x73(bundle.getString(Integer.toString(1, 36), ""), (jw0[]) a.toArray(new jw0[0]));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x73.class != obj.getClass()) {
            return false;
        }
        x73 x73Var = (x73) obj;
        return this.c.equals(x73Var.c) && Arrays.equals(this.e, x73Var.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = c4.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.c) + Arrays.hashCode(this.e);
        }
        return this.f;
    }
}
