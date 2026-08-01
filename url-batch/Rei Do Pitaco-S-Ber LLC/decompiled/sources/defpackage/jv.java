package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class jv implements OnBackAnimationCallback {
    public final /* synthetic */ iv a;

    public jv(iv ivVar) {
        this.a = ivVar;
    }

    public final void onBackCancelled() {
        iv ivVar = this.a;
        oe oeVar = ivVar.a;
        if (oeVar == null) {
            l8.u("This input is not added to any dispatcher.");
            return;
        }
        if (!ivVar.b) {
            oeVar.g(ivVar, null);
        }
        qu quVar = (qu) oeVar.g;
        quVar.getClass();
        if (ivVar.equals(quVar.h) && -1 == quVar.g) {
            kv kvVar = quVar.f;
            if (kvVar == null) {
                kvVar = quVar.c(-1);
            }
            quVar.f = null;
            quVar.g = 0;
            quVar.h = null;
            if (kvVar != null) {
                kvVar.d.getClass();
            }
            quVar.a.b(ru.o);
        }
        ivVar.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        nu a = vv.a(backEvent);
        iv ivVar = this.a;
        oe oeVar = ivVar.a;
        if (oeVar == null) {
            l8.u("This input is not added to any dispatcher.");
            return;
        }
        if (ivVar.b) {
            qu quVar = (qu) oeVar.g;
            quVar.getClass();
            if (ivVar.equals(quVar.h) && -1 == quVar.g) {
                kv kvVar = quVar.f;
                if (kvVar == null) {
                    kvVar = quVar.c(-1);
                }
                if (kvVar != null) {
                    kvVar.d.getClass();
                }
                quVar.a.b(new su(a));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        nu a = vv.a(backEvent);
        iv ivVar = this.a;
        oe oeVar = ivVar.a;
        if (oeVar == null) {
            l8.u("This input is not added to any dispatcher.");
        } else {
            if (ivVar.b) {
                return;
            }
            oeVar.g(ivVar, a);
            ivVar.b = true;
        }
    }
}
