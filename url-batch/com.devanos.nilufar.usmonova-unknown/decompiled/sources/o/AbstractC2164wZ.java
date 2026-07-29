package o;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* renamed from: o.wZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2164wZ {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C1510me b(View view, C1510me c1510me) {
        ContentInfo D = c1510me.a.D();
        Objects.requireNonNull(D);
        ContentInfo g = D2.g(D);
        ContentInfo performReceiveContent = view.performReceiveContent(g);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g ? c1510me : new C1510me(new Y1(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC1092gG interfaceC1092gG) {
        if (interfaceC1092gG == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC2230xZ(interfaceC1092gG));
        }
    }
}
