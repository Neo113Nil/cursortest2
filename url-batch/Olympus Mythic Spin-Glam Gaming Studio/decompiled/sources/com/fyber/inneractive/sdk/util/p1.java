package com.fyber.inneractive.sdk.util;

/* loaded from: classes11.dex */
public final class p1 implements Runnable {
    public final /* synthetic */ s1 a;

    public p1(s1 s1Var) {
        this.a = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1 s1Var = this.a;
        s1Var.getClass();
        r.a.execute(new r1(s1Var));
    }
}
