package K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class O {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0013f b(View view, C0013f c0013f) {
        ContentInfo n2 = c0013f.f658a.n();
        Objects.requireNonNull(n2);
        ContentInfo g2 = J0.e.g(n2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0013f : new C0013f(new A1.d(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0025s interfaceC0025s) {
        if (interfaceC0025s == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new P(interfaceC0025s));
        }
    }
}
