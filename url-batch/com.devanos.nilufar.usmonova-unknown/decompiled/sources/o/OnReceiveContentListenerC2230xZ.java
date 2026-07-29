package o;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: o.xZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC2230xZ implements OnReceiveContentListener {
    public final InterfaceC1092gG a;

    public OnReceiveContentListenerC2230xZ(InterfaceC1092gG interfaceC1092gG) {
        this.a = interfaceC1092gG;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C1510me c1510me = new C1510me(new Y1(contentInfo));
        C1510me a = ((C2292yV) this.a).a(view, c1510me);
        if (a == null) {
            return null;
        }
        if (a == c1510me) {
            return contentInfo;
        }
        ContentInfo D = a.a.D();
        Objects.requireNonNull(D);
        return D2.g(D);
    }
}
