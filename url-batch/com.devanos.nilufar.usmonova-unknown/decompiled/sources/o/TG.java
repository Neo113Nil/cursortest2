package o;

import android.graphics.Outline;

/* loaded from: classes.dex */
public final class TG {
    public static final TG a = new TG();

    public final void a(Outline outline, DH dh) {
        if (!(dh instanceof E3)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((E3) dh).a);
    }
}
