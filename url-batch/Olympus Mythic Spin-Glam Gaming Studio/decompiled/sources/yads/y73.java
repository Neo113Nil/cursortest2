package yads;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class y73 implements nq {
    public static final y73 e = new y73(new x73[0]);
    public static final mq f = new mq() { // from class: yads.y73$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return y73.a(bundle);
        }
    };
    public final int b;
    public final um2 c;
    public int d;

    public y73(x73... x73VarArr) {
        this.c = l41.b(x73VarArr);
        this.b = x73VarArr.length;
        int i = 0;
        while (i < this.c.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.c.size(); i3++) {
                if (((x73) this.c.get(i)).equals(this.c.get(i3))) {
                    gh1.b("TrackGroupArray", gh1.a("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray.")));
                }
            }
            i = i2;
        }
    }

    public final x73 a(int i) {
        return (x73) this.c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y73.class != obj.getClass()) {
            return false;
        }
        y73 y73Var = (y73) obj;
        return this.b == y73Var.b && this.c.equals(y73Var.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode();
        }
        return this.d;
    }

    public static y73 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return parcelableArrayList == null ? new y73(new x73[0]) : new y73((x73[]) oq.a(x73.g, parcelableArrayList).toArray(new x73[0]));
    }
}
