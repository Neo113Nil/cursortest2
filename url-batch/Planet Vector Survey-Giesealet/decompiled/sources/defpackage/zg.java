package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import java.util.function.Consumer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zg implements ScrollCaptureCallback {
    public final rp0 a;
    public final fz b;
    public final y10 c;
    public final f3 d;
    public final jj e;
    public final kj0 f;

    public zg(rp0 rp0Var, fz fzVar, jj jjVar, y10 y10Var, f3 f3Var) {
        this.a = rp0Var;
        this.b = fzVar;
        this.c = y10Var;
        this.d = f3Var;
        this.e = new jj(jjVar.d.i(qm.e));
        this.f = new kj0(fzVar.d - fzVar.b, new yg(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r9 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zg zgVar, ScrollCaptureSession scrollCaptureSession, fz fzVar, lj ljVar) {
        xg xgVar;
        int i;
        ck ckVar;
        int i2;
        int i3;
        o1 o1Var;
        ScrollCaptureSession scrollCaptureSession2;
        int i4;
        fz fzVar2;
        int i5;
        int g;
        int g2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (ljVar instanceof xg) {
            xgVar = (xg) ljVar;
            int i6 = xgVar.j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                xgVar.j = i6 - Integer.MIN_VALUE;
                Object obj = xgVar.h;
                i = xgVar.j;
                ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj);
                    i2 = fzVar.b;
                    i3 = fzVar.d;
                    kj0 kj0Var = zgVar.f;
                    xgVar.d = scrollCaptureSession;
                    xgVar.e = fzVar;
                    xgVar.f = i2;
                    xgVar.g = i3;
                    xgVar.j = 1;
                    int i7 = kj0Var.a;
                    if (i2 > i3) {
                        throw new IllegalArgumentException(y6.v("Expected min=", i2, " ≤ max=", i3).toString());
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        throw new IllegalArgumentException(y6.v("Expected range (", i8, ") to be ≤ viewportSize=", i7).toString());
                    }
                    float f = i2;
                    float f2 = kj0Var.c;
                    Object obj2 = ky0.a;
                    if (f < f2 || i3 > i7 + f2) {
                        Object a = kj0Var.a((f < f2 ? i2 : i3 - i7) - f2, xgVar);
                        if (a != ckVar) {
                            a = obj2;
                        }
                        if (a == ckVar) {
                            obj2 = a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = xgVar.g;
                        i5 = xgVar.f;
                        fzVar2 = xgVar.e;
                        scrollCaptureSession2 = s2.e(xgVar.d);
                        rg0.u(obj);
                        kj0 kj0Var2 = zgVar.f;
                        g = rg0.g(i5 - a50.H(kj0Var2.c), 0, kj0Var2.a);
                        kj0 kj0Var3 = zgVar.f;
                        g2 = rg0.g(i4 - a50.H(kj0Var3.c), 0, kj0Var3.a);
                        int i9 = fzVar2.a;
                        int i10 = fzVar2.c;
                        if (g != g2) {
                            return fz.e;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -g);
                            fz fzVar3 = zgVar.b;
                            lockHardwareCanvas.translate(-fzVar3.a, -fzVar3.b);
                            zgVar.d.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int H = a50.H(zgVar.f.c);
                            return new fz(i9, g + H, i10, g2 + H);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = xgVar.g;
                    int i12 = xgVar.f;
                    fz fzVar4 = xgVar.e;
                    ScrollCaptureSession e = s2.e(xgVar.d);
                    rg0.u(obj);
                    i2 = i12;
                    fzVar = fzVar4;
                    i3 = i11;
                    scrollCaptureSession = e;
                }
                o1Var = o1.r;
                xgVar.d = scrollCaptureSession;
                xgVar.e = fzVar;
                xgVar.f = i2;
                xgVar.g = i3;
                xgVar.j = 2;
                if (x40.D(xgVar.getContext()).e(o1Var, xgVar) != ckVar) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i4 = i3;
                    fzVar2 = fzVar;
                    i5 = i2;
                    kj0 kj0Var22 = zgVar.f;
                    g = rg0.g(i5 - a50.H(kj0Var22.c), 0, kj0Var22.a);
                    kj0 kj0Var32 = zgVar.f;
                    g2 = rg0.g(i4 - a50.H(kj0Var32.c), 0, kj0Var32.a);
                    int i92 = fzVar2.a;
                    int i102 = fzVar2.c;
                    if (g != g2) {
                    }
                }
                return ckVar;
            }
        }
        xgVar = new xg(zgVar, ljVar);
        Object obj3 = xgVar.h;
        i = xgVar.j;
        ckVar = ck.d;
        if (i != 0) {
        }
        o1Var = o1.r;
        xgVar.d = scrollCaptureSession;
        xgVar.e = fzVar;
        xgVar.f = i2;
        xgVar.g = i3;
        xgVar.j = 2;
        if (x40.D(xgVar.getContext()).e(o1Var, xgVar) != ckVar) {
        }
        return ckVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        d31.E(this.e, ia0.e, new c(this, runnable, null, 9), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final ws0 E = d31.E(this.e, null, new wg(this, scrollCaptureSession, rect, consumer, null, 0), 3);
        E.q(new f2(9, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: ah
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                ws0.this.a(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ld0.s(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
