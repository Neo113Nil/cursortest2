package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zx extends b00 {
    public final String f;
    public final long g;
    public final px h;

    public zx(String str, long j, px pxVar) {
        this.f = str;
        this.g = j;
        this.h = pxVar;
    }

    @Override // defpackage.b00
    public final long m() {
        return this.g;
    }

    @Override // defpackage.b00
    public final os n() {
        String str = this.f;
        if (str != null) {
            Pattern pattern = os.c;
            try {
                return g8.z(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.b00
    public final o8 o() {
        return this.h;
    }
}
