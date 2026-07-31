package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.d.a.c;
import com.amazon.d.a.j;
import java.util.Map;

/* compiled from: AbstractCommandTask.java */
/* loaded from: classes3.dex */
public abstract class a extends com.amazon.a.a.n.c.a {
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("AbstractCommandTask");

    /* renamed from: a, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.l.b f550a;

    @com.amazon.a.a.k.a
    private Application c;

    @com.amazon.a.a.k.a
    private d d;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e e;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f;

    @com.amazon.a.a.k.a
    private b g;

    protected abstract void a(com.amazon.d.a.h hVar) throws RemoteException, com.amazon.a.a.d.b;

    protected abstract void a(j jVar) throws RemoteException, com.amazon.a.a.d.b;

    protected abstract String a_();

    protected abstract Map<String, Object> b();

    protected abstract String c();

    protected abstract boolean d();

    protected void e() throws com.amazon.a.a.d.b {
    }

    protected boolean f() {
        return true;
    }

    @Override // com.amazon.a.a.n.a
    public final void a() {
        try {
            if (com.amazon.a.a.o.c.f599a) {
                com.amazon.a.a.o.c cVar = b;
                cVar.a("----------------------------------------------");
                cVar.a("Executing: " + a_());
                cVar.a("----------------------------------------------");
            }
            e();
            if (!d()) {
                if (com.amazon.a.a.o.c.f599a) {
                    b.a("Execution not needed, quitting");
                }
                return;
            }
            if (com.amazon.a.a.o.c.f599a) {
                b.a("Executing Command: " + a_());
            }
            a(this.d.a(i()));
            if (com.amazon.a.a.o.c.f599a) {
                b.a("Task finished");
            }
            j();
        } catch (Throwable th) {
            try {
                a(th);
                if (com.amazon.a.a.o.c.f599a) {
                    b.a("Task finished");
                }
                j();
            } finally {
                if (com.amazon.a.a.o.c.f599a) {
                    b.a("Task finished");
                }
                j();
            }
        }
    }

    private void a(c cVar) throws com.amazon.a.a.d.b, RemoteException {
        if (com.amazon.a.a.o.c.f599a) {
            b.a("Received result from CommandService: " + cVar);
        }
        if (cVar == null) {
            if (com.amazon.a.a.o.c.f599a) {
                b.a("Received null result from command service, exiting task");
            }
        } else {
            if (cVar.e() != null) {
                a(cVar.e());
                return;
            }
            this.g.a(cVar.a(), this.d.a());
            if (cVar.b() != null) {
                b(cVar.b());
            } else if (cVar.c() != null) {
                b(cVar.c());
            } else if (f()) {
                a(cVar.d());
            }
        }
    }

    private void a(com.amazon.d.a.g gVar) throws RemoteException, com.amazon.a.a.d.b {
        throw new com.amazon.a.a.n.a.a.f(gVar);
    }

    private void b(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.f599a) {
            b.a("Command executed successfully");
        }
        a(jVar);
    }

    private void b(com.amazon.d.a.h hVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.f599a) {
            b.a("Command failed execution: " + hVar.b());
        }
        a(hVar);
    }

    private void a(com.amazon.d.a.f fVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.f599a) {
            b.a("Handling Decision");
        }
        try {
            f fVar2 = new f(fVar);
            this.e.a((com.amazon.a.a.i.b) fVar2);
            com.amazon.d.a.a i = fVar2.i();
            if (i == null) {
                if (com.amazon.a.a.o.c.f599a) {
                    b.a("DecisionChooser returned null!!, expiring");
                }
                a(fVar, e.EXPIRATION_DURATION_ELAPSED);
                return;
            }
            a(fVar, i);
        } catch (com.amazon.a.a.n.a.a.e e) {
            a(fVar, e.a());
        }
    }

    private void a(com.amazon.d.a.f fVar, com.amazon.d.a.a aVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.f599a) {
            b.a("Handling customer choice: " + aVar);
        }
        Intent b2 = aVar.b();
        if (b2 != null) {
            if (com.amazon.a.a.o.c.f599a) {
                b.a("Choice has intent, scheduling it to be fired!!");
            }
            com.amazon.a.a.l.a a2 = this.f550a.a(b2);
            if (a2 == null) {
                if (com.amazon.a.a.o.c.f599a) {
                    b.a("No result recived, expiring decision");
                }
                a(fVar, e.EXPIRATION_DURATION_ELAPSED);
                return;
            } else if (a2.d() == 0) {
                if (com.amazon.a.a.o.c.f599a) {
                    b.a("Result canceled, expiring decision");
                }
                a(fVar, e.ACTION_CANCELED);
                return;
            } else {
                if (com.amazon.a.a.o.c.f599a) {
                    b.a("Result received!!!, notifying service");
                }
                a(this.d.a(aVar));
                return;
            }
        }
        if (com.amazon.a.a.o.c.f599a) {
            b.a("No intent given, choosing now");
        }
        a(this.d.a(aVar));
    }

    private void a(com.amazon.d.a.f fVar, e eVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.f599a) {
            b.a("Expiring Decision: " + fVar + ", reason: " + eVar);
        }
        a(this.d.a(fVar, eVar));
    }

    private com.amazon.d.a.c i() {
        return new c.a() { // from class: com.amazon.a.a.n.a.a.1
            @Override // com.amazon.d.a.c
            public String a() throws RemoteException {
                return a.this.c();
            }

            @Override // com.amazon.d.a.c
            public String b() throws RemoteException {
                return a.this.a_();
            }

            @Override // com.amazon.d.a.c
            public Map c() throws RemoteException {
                return a.this.b();
            }

            @Override // com.amazon.d.a.c
            public String d() throws RemoteException {
                return a.this.c.getPackageName();
            }
        };
    }

    private void a(Throwable th) {
        if (com.amazon.a.a.o.c.f599a) {
            b.a("Exception occurred while processing task: " + th, th);
        }
        com.amazon.a.a.d.b b2 = b(th);
        b(b2);
        this.f.a(a(b2));
    }

    private com.amazon.a.a.d.b b(Throwable th) {
        if (th instanceof com.amazon.a.a.d.b) {
            return (com.amazon.a.a.d.b) th;
        }
        if (th instanceof RemoteException) {
            return new com.amazon.a.a.n.a.a.d((RemoteException) th);
        }
        return new com.amazon.a.a.n.a.a.h(th);
    }

    protected com.amazon.a.a.h.a a(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.h.a aVar = new com.amazon.a.a.h.a(g());
        aVar.a("subType", bVar.a()).a("reason", bVar.b()).a("context", bVar.c());
        return aVar;
    }

    protected String g() {
        return a_() + "_failure";
    }

    protected String h() {
        return a_() + "_success";
    }

    protected void b(com.amazon.a.a.d.b bVar) {
        b.b("On Exception!!!!: " + bVar);
    }

    private void j() {
        if (m()) {
            return;
        }
        this.d.b();
    }
}
