package yads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class nn0 extends ne2 {
    public final int d;
    public final String e;
    public final int f;
    public final jw0 g;
    public final int h;
    public final im1 i;
    public final boolean j;

    static {
        new mq() { // from class: yads.nn0$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return new nn0(bundle);
            }
        };
    }

    public nn0(int i, Exception exc, int i2) {
        this(i, exc, null, i2, null, -1, null, 4, false);
    }

    public nn0(Bundle bundle) {
        super(bundle);
        this.d = bundle.getInt(Integer.toString(1001, 36), 2);
        this.e = bundle.getString(Integer.toString(1002, 36));
        this.f = bundle.getInt(Integer.toString(1003, 36), -1);
        Bundle bundle2 = bundle.getBundle(Integer.toString(1004, 36));
        this.g = bundle2 == null ? null : (jw0) jw0.I.a(bundle2);
        this.h = bundle.getInt(Integer.toString(1005, 36), 4);
        this.j = bundle.getBoolean(Integer.toString(1006, 36), false);
        this.i = null;
    }

    public nn0(String str, Throwable th, int i, int i2, String str2, int i3, jw0 jw0Var, int i4, im1 im1Var, long j, boolean z) {
        super(str, th, i, j);
        if (z && i2 != 1) {
            throw new IllegalArgumentException();
        }
        if (th == null && i2 != 3) {
            throw new IllegalArgumentException();
        }
        this.d = i2;
        this.e = str2;
        this.f = i3;
        this.g = jw0Var;
        this.h = i4;
        this.i = im1Var;
        this.j = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nn0(int i, Exception exc, String str, int i2, String str2, int i3, jw0 jw0Var, int i4, boolean z) {
        this(r0, exc, i2, i, str2, i3, jw0Var, i4, null, SystemClock.elapsedRealtime(), z);
        String str3;
        String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(jw0Var);
            sb.append(", format_supported=");
            int i5 = sb3.a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            sb.append(str4);
            str3 = sb.toString();
        } else if (i != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        if (!TextUtils.isEmpty(str)) {
            str3 = str3 + ": " + str;
        }
    }
}
