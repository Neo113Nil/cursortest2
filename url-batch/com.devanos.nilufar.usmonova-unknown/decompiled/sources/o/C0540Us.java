package o;

import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;

/* renamed from: o.Us, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540Us {
    public final View a;
    public final Object b;

    public C0540Us(View view) {
        this.a = view;
        this.b = EB.C(EnumC1992tz.i, new C1139h0(13, this));
    }

    public C0540Us(View view, S2 s2) {
        new C0540Us(view);
        Choreographer.getInstance();
        this.a = view;
        new C0779bV(new Y3("", null, null, null), C1501mV.b);
        int i = C1919ss.e;
        new ArrayList();
        this.b = EB.C(EnumC1992tz.i, new LE(14, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }
}
