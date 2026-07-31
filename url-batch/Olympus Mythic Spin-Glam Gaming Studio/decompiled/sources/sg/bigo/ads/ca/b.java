package sg.bigo.ads.ca;

import androidx.annotation.ColorInt;

/* loaded from: classes12.dex */
public final class b {
    public final int a;
    public final int b = 0;
    public final int c;

    @ColorInt
    public final int d;

    private b(int i, int i2, @ColorInt int i3) {
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public static b a(int i, int i2, @ColorInt int i3) {
        return new b(i, i2, i3);
    }
}
