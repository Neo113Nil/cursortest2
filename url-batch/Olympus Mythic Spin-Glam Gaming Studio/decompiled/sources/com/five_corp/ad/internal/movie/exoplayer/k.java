package com.five_corp.ad.internal.movie.exoplayer;

/* loaded from: classes9.dex */
public abstract class k {
    public abstract c a(com.five_corp.ad.internal.l lVar);

    public k a() {
        String.format("Method %s unsupported!, state: %s", "backToStart", this);
        return this;
    }

    public abstract int b();

    public k c() {
        String.format("Method %s unsupported!, state: %s", "onPlaybackStateChangedStateBuffering", this);
        return this;
    }

    public k d() {
        String.format("Method %s unsupported!, state: %s", "onPlaybackStateChangedStateEnded", this);
        return this;
    }

    public k e() {
        String.format("Method %s unsupported!, state: %s", "pause", this);
        return this;
    }

    public k f() {
        String.format("Method %s unsupported!, state: %s", "prepare", this);
        return this;
    }

    public k g() {
        String.format("Method %s unsupported!, state: %s", "release", this);
        return this;
    }

    public k h() {
        String.format("Method %s unsupported!, state: %s", "start", this);
        return this;
    }

    public k a(long j) {
        String.format("Method %s unsupported!, state: %s", "onPlaybackStateChangedStateReady", this);
        return this;
    }

    public void a(boolean z) {
        String.format("Method %s unsupported!, state: %s", "setSoundEnabled", this);
    }
}
