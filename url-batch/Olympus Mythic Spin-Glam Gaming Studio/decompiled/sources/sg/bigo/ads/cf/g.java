package sg.bigo.ads.cf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class g {

    @Nullable
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;

    public g(@Nullable String str, boolean z) {
        this(str, true, z, 0, "success");
    }

    public g(@Nullable String str, boolean z, boolean z2, int i, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = str2;
    }

    public static g a(@Nullable String str, boolean z, int i, String str2) {
        return new g(str, false, z, i, str2);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
