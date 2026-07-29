package o;

import android.os.Build;
import java.util.Iterator;

/* renamed from: o.Wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586Wm implements InterfaceC2244xn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0586Wm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.InterfaceC2244xn
    public final void a() {
        switch (this.a) {
            case 0:
                C0664Zm c0664Zm = (C0664Zm) this.b;
                c0664Zm.a.getClass();
                c0664Zm.h = false;
                break;
            case 1:
                ((io.flutter.embedding.engine.renderer.e) this.b).c = false;
                break;
            case 2:
                C0068Cn c0068Cn = (C0068Cn) this.b;
                c0068Cn.p = false;
                Iterator it = c0068Cn.f24o.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2244xn) it.next()).a();
                }
                break;
        }
    }

    @Override // o.InterfaceC2244xn
    public final void b() {
        switch (this.a) {
            case 0:
                C0664Zm c0664Zm = (C0664Zm) this.b;
                AbstractActivityC0560Vm abstractActivityC0560Vm = c0664Zm.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0560Vm.reportFullyDrawn();
                } else {
                    abstractActivityC0560Vm.getClass();
                }
                c0664Zm.h = true;
                c0664Zm.i = true;
                break;
            case 1:
                ((io.flutter.embedding.engine.renderer.e) this.b).c = true;
                break;
            case 2:
                C0068Cn c0068Cn = (C0068Cn) this.b;
                c0068Cn.p = true;
                Iterator it = c0068Cn.f24o.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2244xn) it.next()).b();
                }
                break;
            default:
                SurfaceHolderCallback2C2027uU surfaceHolderCallback2C2027uU = (SurfaceHolderCallback2C2027uU) this.b;
                surfaceHolderCallback2C2027uU.a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.e eVar = surfaceHolderCallback2C2027uU.b;
                if (eVar != null) {
                    eVar.c(this);
                    break;
                }
                break;
        }
    }

    private final void c() {
    }
}
