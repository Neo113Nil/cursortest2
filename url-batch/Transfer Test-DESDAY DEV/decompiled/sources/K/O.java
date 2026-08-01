package K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class O {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0008g b(View view, C0008g c0008g) {
        ContentInfo r2 = c0008g.f400a.r();
        Objects.requireNonNull(r2);
        ContentInfo g2 = AbstractC0004c.g(r2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0008g : new C0008g(new A0.h(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0020t interfaceC0020t) {
        if (interfaceC0020t == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new P(interfaceC0020t));
        }
    }
}
