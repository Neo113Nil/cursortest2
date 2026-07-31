package com.ironsource;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public class Ze implements Runnable {

    @Nullable
    private Long a;

    @Nullable
    public final Long a() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public final void a(@Nullable Long l) {
        this.a = l;
    }
}
