package io.bidmachine.rendering.internal.state;

/* loaded from: classes14.dex */
public interface a {

    /* renamed from: io.bidmachine.rendering.internal.state.a$a, reason: collision with other inner class name */
    public enum EnumC1812a {
        LoadingStarted,
        Loaded,
        FailedToLoad,
        ShowInitiated,
        ViewabilityShow,
        Shown,
        FailedToShow,
        Clicked,
        Appeared,
        Disappeared,
        Finished,
        Expired,
        Destroyed
    }

    public interface b {
        void a(a aVar, EnumC1812a enumC1812a);
    }

    void a(b bVar);

    boolean a();

    boolean a(boolean z);

    void b(b bVar);

    boolean b();

    boolean b(boolean z);

    boolean c();

    boolean d();

    void destroy();

    boolean e();

    boolean f();

    boolean g();

    boolean h();

    boolean i();

    boolean isCompleted();

    boolean j();

    boolean k();

    void l();

    boolean m();

    boolean n();

    void o();

    boolean p();
}
