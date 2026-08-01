package E1;

import h1.InterfaceC0173a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m implements InterfaceC0173a {

    /* renamed from: a, reason: collision with root package name */
    public final u f326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f327b;

    public m(q qVar, u uVar) {
        this.f327b = qVar;
        this.f326a = uVar;
    }

    @Override // h1.InterfaceC0173a
    public final Object c() {
        q qVar = this.f327b;
        u uVar = this.f326a;
        try {
        } catch (IOException e2) {
            qVar.a(2, 2, e2);
        } catch (Throwable th) {
            qVar.a(3, 3, null);
            y1.b.b(uVar);
            throw th;
        }
        if (!uVar.a(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (uVar.a(false, this)) {
        }
        qVar.a(1, 9, null);
        y1.b.b(uVar);
        return V0.i.f1250a;
    }
}
