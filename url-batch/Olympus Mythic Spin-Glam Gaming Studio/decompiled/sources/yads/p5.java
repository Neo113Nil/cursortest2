package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p5 implements nq {
    public static final p5 g = new p5(new o5[0], 0, -9223372036854775807L, 0);
    public static final o5 h = new o5(0, -1, new int[0], new Uri[0], new long[0], 0, false).a();
    public static final mq i = new mq() { // from class: yads.p5$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return p5.a(bundle);
        }
    };
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final o5[] f;

    public p5(o5[] o5VarArr, long j, long j2, int i2) {
        this.c = j;
        this.d = j2;
        this.b = o5VarArr.length + i2;
        this.f = o5VarArr;
        this.e = i2;
    }

    public final o5 a(int i2) {
        int i3 = this.e;
        return i2 < i3 ? h : this.f[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p5.class != obj.getClass()) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return sb3.a((Object) null, (Object) null) && this.b == p5Var.b && this.c == p5Var.c && this.d == p5Var.d && this.e == p5Var.e && Arrays.equals(this.f, p5Var.f);
    }

    public final int hashCode() {
        return (((((((this.b * 961) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + Arrays.hashCode(this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f[i2].b);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.f[i2].e.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.f[i2].e[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f[i2].f[i3]);
                sb.append(')');
                if (i3 < this.f[i2].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public static p5 a(Bundle bundle) {
        o5[] o5VarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            o5VarArr = new o5[0];
        } else {
            o5[] o5VarArr2 = new o5[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                o5VarArr2[i2] = (o5) o5.i.a((Bundle) parcelableArrayList.get(i2));
            }
            o5VarArr = o5VarArr2;
        }
        return new p5(o5VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }
}
