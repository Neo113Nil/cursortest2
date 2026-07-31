package com.my.target;

import com.my.target.c0;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class ri implements Runnable {
    private c0 a;
    private c0.a b;

    public ri() {
    }

    private boolean a(float f) {
        return f > 0.0f;
    }

    public void a(c0.a aVar) {
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c0.a aVar;
        if (this.a == null) {
            return;
        }
        try {
            float position = r0.getPosition() / 1000.0f;
            float duration = this.a.getDuration();
            if (a(duration) && (aVar = this.b) != null) {
                aVar.b(position, duration);
            }
        } catch (Throwable th) {
            String str = this.a.getClass() + ": Error - " + th.getMessage();
            mi.a(str);
            c0.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a(str);
            }
        }
    }

    public ri(c0 c0Var) {
        this.a = c0Var;
    }

    public void a(c0 c0Var) {
        this.a = c0Var;
    }

    public void a() {
        this.a = null;
        this.b = null;
    }
}
