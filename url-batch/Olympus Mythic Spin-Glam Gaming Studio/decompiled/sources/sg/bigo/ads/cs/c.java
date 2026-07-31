package sg.bigo.ads.cs;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class c {
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public static c a() {
        c cVar = new c();
        String l = sg.bigo.ads.bw.a.l();
        if (!r.a((CharSequence) l)) {
            String[] split = l.split(StringUtils.COMMA);
            if (split.length == 4) {
                try {
                    cVar.a = Integer.parseInt(split[0]);
                    cVar.b = Integer.parseInt(split[1]);
                    cVar.c = Integer.parseInt(split[2]);
                    cVar.d = Integer.parseInt(split[3]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return cVar;
    }

    protected final void a(String str) {
        str.hashCode();
        switch (str) {
            case "filled":
                this.b++;
                break;
            case "load":
                this.a++;
                break;
            case "impression":
                this.c++;
                break;
            case "clicked":
                this.d++;
                break;
        }
        sg.bigo.ads.bw.a.e(toString());
    }

    protected final boolean b() {
        return ((this.a + this.b) + this.c) + this.d == 0;
    }

    protected final void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        sg.bigo.ads.bw.a.e(toString());
    }

    @NonNull
    public final String toString() {
        return this.a + StringUtils.COMMA + this.b + StringUtils.COMMA + this.c + StringUtils.COMMA + this.d;
    }
}
