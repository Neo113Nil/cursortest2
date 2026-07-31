package com.unity3d.player;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
final class c1 implements Y0 {
    final /* synthetic */ d1 a;

    c1(d1 d1Var) {
        this.a = d1Var;
    }

    public final void a(int i) {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        Semaphore semaphore;
        boolean z;
        reentrantLock = this.a.h.e;
        reentrantLock.lock();
        i1 i1Var = this.a.h;
        i1Var.g = i;
        if (i == 3) {
            z = i1Var.i;
            if (z) {
                i1Var.runOnUiThread(new b1(this));
            }
        }
        if (i != 0) {
            semaphore = this.a.h.d;
            semaphore.release();
        }
        reentrantLock2 = this.a.h.e;
        reentrantLock2.unlock();
    }
}
