package K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0020t f368a;

    public P(InterfaceC0020t interfaceC0020t) {
        this.f368a = interfaceC0020t;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0008g c0008g = new C0008g(new A0.h(contentInfo));
        C0008g a2 = ((Q.s) this.f368a).a(view, c0008g);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0008g) {
            return contentInfo;
        }
        ContentInfo r2 = a2.f400a.r();
        Objects.requireNonNull(r2);
        return AbstractC0004c.g(r2);
    }
}
