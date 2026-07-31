package com.ironsource;

import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.mg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C4776mg extends AbstractC4634f<a> {

    /* renamed from: com.ironsource.mg$a */
    public interface a {
        void a();
    }

    public C4776mg(long j) {
        super(j);
    }

    public final void a(@Nullable a aVar) {
        a((C4776mg) aVar);
    }

    @Override // com.ironsource.AbstractC4634f
    protected void b() {
        a aVar = (a) this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e() {
        c();
    }
}
