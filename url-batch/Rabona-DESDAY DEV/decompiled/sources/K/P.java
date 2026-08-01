package K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0018s f377a;

    public P(InterfaceC0018s interfaceC0018s) {
        this.f377a = interfaceC0018s;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0006f c0006f = new C0006f(new B0.d(contentInfo));
        C0006f a2 = ((Q.s) this.f377a).a(view, c0006f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0006f) {
            return contentInfo;
        }
        ContentInfo p2 = a2.f407a.p();
        Objects.requireNonNull(p2);
        return E0.e.g(p2);
    }
}
