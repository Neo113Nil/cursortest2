package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class d80 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static bd b(View view, bd bdVar) {
        ContentInfo m = bdVar.a.m();
        Objects.requireNonNull(m);
        ContentInfo performReceiveContent = view.performReceiveContent(m);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m ? bdVar : new bd(new j0(performReceiveContent));
    }
}
