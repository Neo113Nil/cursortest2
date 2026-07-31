package sg.bigo.ads.cf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public class i {
    protected String a;
    protected String b;
    protected int c;

    protected i(String str, @Nullable String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @NonNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return sg.bigo.ads.common.utils.c.a(this.b);
    }

    public final int d() {
        return this.c;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
