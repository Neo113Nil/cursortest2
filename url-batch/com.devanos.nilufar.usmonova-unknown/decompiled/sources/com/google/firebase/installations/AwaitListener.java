package com.google.firebase.installations;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.InterfaceC0764bG;
import o.MU;

/* loaded from: classes.dex */
final class AwaitListener implements InterfaceC0764bG {
    private final CountDownLatch latch = new CountDownLatch(1);

    public boolean await(long j, TimeUnit timeUnit) {
        return this.latch.await(j, timeUnit);
    }

    @Override // o.InterfaceC0764bG
    public void onComplete(MU mu) {
        this.latch.countDown();
    }

    public void onSuccess() {
        this.latch.countDown();
    }
}
