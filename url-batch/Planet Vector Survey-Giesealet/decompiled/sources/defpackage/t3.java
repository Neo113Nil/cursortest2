package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t3 extends v00 implements bu {
    public static final t3 A;
    public static final t3 B;
    public static final t3 C;
    public static final t3 D;
    public static final t3 E;
    public static final t3 F;
    public static final t3 G;
    public static final t3 H;
    public static final t3 I;
    public static final t3 f;
    public static final t3 g;
    public static final t3 h;
    public static final t3 i;
    public static final t3 j;
    public static final t3 k;
    public static final t3 l;
    public static final t3 m;
    public static final t3 n;
    public static final t3 o;
    public static final t3 p;
    public static final t3 q;
    public static final t3 r;
    public static final t3 s;
    public static final t3 t;
    public static final t3 u;
    public static final t3 v;
    public static final t3 w;
    public static final t3 x;
    public static final t3 y;
    public static final t3 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 0;
        f = new t3(i2, 0);
        g = new t3(i2, 1);
        h = new t3(i2, 2);
        i = new t3(i2, 3);
        j = new t3(i2, 4);
        k = new t3(i2, 5);
        l = new t3(i2, 6);
        m = new t3(i2, 7);
        n = new t3(i2, 8);
        o = new t3(i2, 9);
        p = new t3(i2, 10);
        q = new t3(i2, 11);
        r = new t3(i2, 12);
        s = new t3(i2, 13);
        t = new t3(i2, 14);
        u = new t3(i2, 15);
        v = new t3(i2, 16);
        w = new t3(i2, 17);
        x = new t3(i2, 18);
        y = new t3(i2, 19);
        z = new t3(i2, 20);
        A = new t3(i2, 21);
        B = new t3(i2, 22);
        C = new t3(i2, 23);
        D = new t3(i2, 24);
        E = new t3(i2, 25);
        F = new t3(i2, 26);
        G = new t3(i2, 27);
        H = new t3(i2, 28);
        I = new t3(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bu
    public final Object a() {
        pq pqVar;
        rj s2;
        Choreographer choreographer;
        Object[] objArr = 0;
        switch (this.e) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return "DEFAULT_TEST_TAG";
            case 7:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    gl glVar = vm.a;
                    cw cwVar = o40.a;
                    qu m5Var = new m5(2, objArr == true ? 1 : 0, 0);
                    Thread currentThread = Thread.currentThread();
                    b2 b2Var = b2.t;
                    uj ujVar = (uj) cwVar.k(b2Var);
                    up upVar = up.d;
                    if (ujVar == null) {
                        pqVar = hw0.a();
                        s2 = a50.s(upVar, nz.Q(cwVar, pqVar), true);
                        gl glVar2 = vm.a;
                        if (s2 != glVar2 && s2.k(b2Var) == null) {
                            s2 = s2.i(glVar2);
                        }
                    } else {
                        pqVar = (pq) hw0.a.get();
                        s2 = a50.s(upVar, cwVar, true);
                        gl glVar3 = vm.a;
                        if (s2 != glVar3 && s2.k(b2Var) == null) {
                            s2 = s2.i(glVar3);
                        }
                    }
                    s9 s9Var = new s9(s2, currentThread, pqVar);
                    s9Var.d0(ek.d, s9Var, m5Var);
                    pq pqVar2 = s9Var.h;
                    if (pqVar2 != null) {
                        int i2 = pq.i;
                        pqVar2.r(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long v2 = pqVar2 != null ? pqVar2.v() : Long.MAX_VALUE;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g00.d;
                            if (atomicReferenceFieldUpdater.get(s9Var) instanceof nx) {
                                LockSupport.parkNanos(s9Var, v2);
                            } else {
                                if (pqVar2 != null) {
                                    int i3 = pq.i;
                                    pqVar2.l(false);
                                }
                                Object R = nk.R(atomicReferenceFieldUpdater.get(s9Var));
                                jf jfVar = R instanceof jf ? (jf) R : null;
                                if (jfVar != null) {
                                    throw jfVar.a;
                                }
                                choreographer = (Choreographer) R;
                            }
                        } catch (Throwable th) {
                            if (pqVar2 != null) {
                                int i4 = pq.i;
                                pqVar2.l(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    s9Var.y(interruptedException);
                    throw interruptedException;
                }
                p5 p5Var = new p5(choreographer, nk.l(Looper.getMainLooper()));
                return nz.Q(p5Var, p5Var.o);
            case 8:
                return null;
            case 9:
                return le.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case 10:
                return Boolean.TRUE;
            case 11:
            case 12:
                return null;
            case 13:
                hi.b("LocalAutofillManager");
                throw null;
            case 14:
                hi.b("LocalAutofillTree");
                throw null;
            case 15:
                hi.b("LocalClipboard");
                throw null;
            case 16:
                hi.b("LocalClipboardManager");
                throw null;
            case 17:
                return Boolean.TRUE;
            case 18:
                hi.b("LocalDensity");
                throw null;
            case 19:
                hi.b("LocalFocusManager");
                throw null;
            case 20:
                hi.b("LocalFontFamilyResolver");
                throw null;
            case 21:
                hi.b("LocalFontLoader");
                throw null;
            case 22:
                hi.b("LocalGraphicsContext");
                throw null;
            case 23:
                hi.b("LocalHapticFeedback");
                throw null;
            case 24:
                hi.b("LocalInputManager");
                throw null;
            case 25:
                hi.b("LocalLayoutDirection");
                throw null;
            case 26:
                return null;
            case 27:
                return Boolean.FALSE;
            case 28:
            default:
                return null;
        }
    }
}
