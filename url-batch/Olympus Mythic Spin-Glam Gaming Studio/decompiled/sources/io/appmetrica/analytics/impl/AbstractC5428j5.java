package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC5428j5 {
    public final C5532n5 a;
    public final String b = "[ComponentMigrationToV113]";

    public AbstractC5428j5(C5532n5 c5532n5) {
        this.a = c5532n5;
    }

    @NotNull
    public final C5532n5 a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public abstract boolean b(int i);

    public abstract void c();

    public final void a(int i) {
        if (b(i)) {
            c();
        }
    }
}
