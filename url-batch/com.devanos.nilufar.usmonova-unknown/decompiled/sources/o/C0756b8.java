package o;

import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: o.b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756b8 implements InterfaceC1346k8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0756b8(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // o.InterfaceC1346k8
    public final void a(ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                C0950e6 c0950e6 = (C0950e6) this.c;
                try {
                    ((InterfaceC0821c8) this.b).u0(((CC) c0950e6.k).h(byteBuffer));
                    break;
                } catch (RuntimeException e) {
                    Log.e("BasicMessageChannel#".concat((String) c0950e6.j), "Failed to handle message reply", e);
                    return;
                }
            default:
                C0950e6 c0950e62 = (C0950e6) this.c;
                NC nc = (NC) this.b;
                try {
                    if (byteBuffer == null) {
                        nc.b();
                    } else {
                        try {
                            nc.d(((PC) c0950e62.k).i(byteBuffer));
                        } catch (C1191hn e2) {
                            nc.a(e2.h, e2.getMessage(), e2.i);
                        }
                    }
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) c0950e62.j), "Failed to handle method call result", e3);
                    return;
                }
        }
    }
}
