package defpackage;

import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ky {
    public final View a;

    public ky(View view, f3 f3Var) {
        new ky(view);
        Choreographer.getInstance();
        this.a = view;
        long j = xv0.b;
        int length = new l7("", 0).e.length();
        int i = xv0.c;
        int i2 = (int) (j >> 32);
        int i3 = i2 < 0 ? 0 : i2;
        i3 = i3 > length ? length : i3;
        int i4 = (int) (j & 4294967295L);
        int i5 = i4 >= 0 ? i4 : 0;
        length = i5 <= length ? i5 : length;
        if (i3 != i2 || length != i4) {
            od0.c(i3, length);
        }
        int i6 = fx.e;
        new ArrayList();
        x40.H(w10.d, new b(19, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }

    public ky(View view) {
        this.a = view;
        x40.H(w10.d, new b(6, this));
    }
}
