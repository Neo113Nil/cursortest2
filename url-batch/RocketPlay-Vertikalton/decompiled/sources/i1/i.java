package i1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3050a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3051b;

    public i(int i) {
        this.f3050a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                f.d(compile, "compile(...)");
                this.f3051b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f3050a) {
            case 0:
                return String.valueOf(this.f3051b);
            default:
                String pattern = ((Pattern) this.f3051b).toString();
                f.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
