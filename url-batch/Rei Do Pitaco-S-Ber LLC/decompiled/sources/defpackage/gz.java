package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class gz implements Serializable {
    public final /* synthetic */ int f;
    public Object g;

    public gz(int i) {
        this.f = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                compile.getClass();
                this.g = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return String.valueOf(this.g);
            default:
                String pattern = ((Pattern) this.g).toString();
                pattern.getClass();
                return pattern;
        }
    }
}
