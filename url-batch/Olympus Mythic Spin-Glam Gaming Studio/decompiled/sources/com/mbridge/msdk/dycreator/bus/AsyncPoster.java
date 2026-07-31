package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes3.dex */
class AsyncPoster implements Runnable {
    private final PendingPostQueue a = new PendingPostQueue();
    private final EventBus b;

    AsyncPoster(EventBus eventBus) {
        this.b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.a.a(PendingPost.a(subscription, obj));
        EventBus.n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost a = this.a.a();
        if (a == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.b.a(a);
    }
}
