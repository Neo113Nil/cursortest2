package K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class O {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0006f b(View view, C0006f c0006f) {
        ContentInfo n2 = c0006f.f407a.n();
        Objects.requireNonNull(n2);
        ContentInfo g2 = E0.e.g(n2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0006f : new C0006f(new B0.d(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0018s interfaceC0018s) {
        if (interfaceC0018s == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new P(interfaceC0018s));
        }
    }
}
