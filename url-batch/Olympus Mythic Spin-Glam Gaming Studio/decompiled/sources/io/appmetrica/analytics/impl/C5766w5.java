package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5766w5 implements To {
    public final List a;

    public C5766w5(@NotNull List<? extends Pair<String, ? extends To>> list) {
        this.a = list;
    }

    @Override // io.appmetrica.analytics.impl.To
    public final void a(@NotNull String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((To) ((Pair) it.next()).getSecond()).a(str);
        }
    }

    @Override // io.appmetrica.analytics.impl.To
    @Nullable
    public final String b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String b = ((To) ((Pair) it.next()).getSecond()).b();
            if (b != null && b.length() > 0) {
                return b;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.To
    public final void flushAsync() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((To) ((Pair) it.next()).getSecond()).flushAsync();
        }
    }

    @Override // io.appmetrica.analytics.impl.To
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((To) ((Pair) it.next()).getSecond()).a();
        }
    }
}
