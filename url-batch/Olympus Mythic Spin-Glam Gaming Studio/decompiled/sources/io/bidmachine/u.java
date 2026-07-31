package io.bidmachine;

import android.content.Context;
import io.bidmachine.SessionManager;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.t;
import io.bidmachine.u;
import io.bidmachine.utils.BMError;
import java.util.Objects;

/* loaded from: classes15.dex */
final class u {
    private final Context a;
    private final String b;
    private final d c;
    final SessionManager.Observer d;
    t e;
    private final Object f;
    t.c g;

    static class b {
        private final InitResponse a;
        private final String b;

        public b(InitResponse initResponse, String str) {
            this.a = initResponse;
            this.b = str;
        }

        public InitResponse a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    private class c implements t.c {
        private final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onFail(BMError bMError) {
            u uVar = u.this;
            final d dVar = uVar.c;
            Objects.requireNonNull(dVar);
            uVar.a(new Executable() { // from class: io.bidmachine.u$c$$ExternalSyntheticLambda0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    u.d.this.b((u.b) obj);
                }
            });
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(InitResponse initResponse) {
            u.this.b();
            if (initResponse == null) {
                return;
            }
            n.a(u.this.a, initResponse, this.a);
            u.this.c.a(new b(initResponse, this.a));
        }
    }

    interface d {
        void a(b bVar);

        void b(b bVar);

        void c(b bVar);
    }

    private class e implements SessionManager.Observer {
        private e() {
        }

        @Override // io.bidmachine.SessionManager.Observer
        public void onSessionEvent(SessionManager.Status status) {
            if (status != SessionManager.Status.START) {
                return;
            }
            u.this.c();
        }
    }

    u(Context context, String str, d dVar) {
        e eVar = new e();
        this.d = eVar;
        this.e = null;
        this.f = new Object();
        SessionManager sessionManager = SessionManager.get();
        this.a = context;
        this.b = str;
        this.c = dVar;
        this.g = new c(sessionManager.getSessionId());
        sessionManager.addObserver(eVar);
    }

    void c() {
        synchronized (this.f) {
            b();
            t a2 = a();
            this.e = a2;
            a2.a(this.g);
            this.e.e();
        }
    }

    void d() {
        final d dVar = this.c;
        Objects.requireNonNull(dVar);
        a(new Executable() { // from class: io.bidmachine.u$$ExternalSyntheticLambda0
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                u.d.this.c((u.b) obj);
            }
        });
    }

    void a(Executable executable) {
        InitResponse i = n.i(this.a);
        String j = n.j(this.a);
        if (i != null) {
            executable.execute(new b(i, j));
        }
    }

    void b() {
        synchronized (this.f) {
            try {
                t tVar = this.e;
                if (tVar == null) {
                    return;
                }
                tVar.c();
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    t a() {
        return new t(this.a, this.b, UrlProvider.getInitUrlQueue());
    }
}
