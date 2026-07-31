package com.amazon.a.a.n.c;

/* compiled from: AbstractTaskWorkflowAwareTask.java */
/* loaded from: classes3.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private b f580a;

    @Override // com.amazon.a.a.n.c.c
    public final void a(b bVar) {
        com.amazon.a.a.o.a.a.a((Object) bVar, "workflow");
        com.amazon.a.a.o.a.a.c(this.f580a, "workflow instance can only be set once");
        this.f580a = bVar;
    }

    protected final boolean m() {
        return this.f580a != null;
    }

    protected final void n() {
        com.amazon.a.a.o.a.a.a(m(), "task is no a workflow child");
        this.f580a.d();
    }
}
