package o;

import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CI implements InterfaceC2279yI {
    public C1125gn h;
    public AbstractActivityC0560Vm i;
    public C0068Cn j;
    public C1590ns l;
    public FlutterJNI k = null;
    public Surface r = null;
    public SurfaceControl s = null;
    public final C1590ns t = new C1590ns(27, this);
    public final D0 m = new D0();
    public final SparseArray n = new SparseArray();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f20o = new SparseArray();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();

    public CI() {
        if (C0208Hx.k == null) {
            C0208Hx.k = new C0208Hx(7);
        }
    }

    @Override // o.InterfaceC2279yI
    public final void L(int i) {
        if (this.n.get(i) != null) {
            throw new ClassCastException();
        }
    }

    @Override // o.InterfaceC2279yI
    public final void d0() {
        this.m.a = null;
    }

    @Override // o.InterfaceC2279yI
    public final void n(io.flutter.view.b bVar) {
        this.m.a = bVar;
    }

    @Override // o.InterfaceC2279yI
    public final boolean x(int i) {
        return false;
    }
}
