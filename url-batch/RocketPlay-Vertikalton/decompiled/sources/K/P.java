package K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0025s f629a;

    public P(InterfaceC0025s interfaceC0025s) {
        this.f629a = interfaceC0025s;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0013f c0013f = new C0013f(new A1.d(contentInfo));
        C0013f a2 = ((Q.r) this.f629a).a(view, c0013f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0013f) {
            return contentInfo;
        }
        ContentInfo n2 = a2.f658a.n();
        Objects.requireNonNull(n2);
        return J0.e.g(n2);
    }
}
