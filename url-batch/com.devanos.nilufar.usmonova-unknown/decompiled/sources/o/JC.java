package o;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class JC {
    public final C0208Hx a;
    public final C0604Xe b;
    public final HashMap c;

    public JC(Context context, C0604Xe c0604Xe) {
        C0208Hx c0208Hx = new C0208Hx(context, 3);
        this.c = new HashMap();
        this.a = c0208Hx;
        this.b = c0604Xe;
    }

    public final synchronized InterfaceC2095vW a(String str) {
        if (this.c.containsKey(str)) {
            return (InterfaceC2095vW) this.c.get(str);
        }
        CctBackendFactory M0 = this.a.M0(str);
        if (M0 == null) {
            return null;
        }
        C0604Xe c0604Xe = this.b;
        InterfaceC2095vW create = M0.create(new C1938t7(c0604Xe.a, c0604Xe.b, c0604Xe.c, str));
        this.c.put(str, create);
        return create;
    }
}
