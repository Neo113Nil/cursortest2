package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class h1 implements Runnable {
    public final /* synthetic */ j1 a;

    public h1(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.a;
        if (j1Var.f && j1Var.g) {
            boolean hasWindowFocus = j1Var.a.hasWindowFocus();
            boolean areEqual = Intrinsics.areEqual(this.a.h, Boolean.valueOf(hasWindowFocus));
            this.a.h = Boolean.valueOf(hasWindowFocus);
            if (!areEqual) {
                this.a.i.clear();
            }
            this.a.a();
            this.a.e.postDelayed(this, 100L);
        }
    }
}
