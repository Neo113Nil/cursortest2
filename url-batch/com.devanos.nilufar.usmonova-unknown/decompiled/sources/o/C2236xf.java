package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2236xf extends AbstractC2225xU implements InterfaceC2114vp {
    public Object h;
    public Serializable i;
    public Object j;
    public Object k;
    public Iterator l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0657Zf f243o;
    public final /* synthetic */ C1334k p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2236xf(C0657Zf c0657Zf, C1334k c1334k, InterfaceC2235xe interfaceC2235xe) {
        super(1, interfaceC2235xe);
        this.f243o = c0657Zf;
        this.p = c1334k;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(InterfaceC2235xe interfaceC2235xe) {
        return new C2236xf(this.f243o, this.p, interfaceC2235xe);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return ((C2236xf) create((InterfaceC2235xe) obj)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        if (r14 != r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ZD c0762bE;
        C1098gM c1098gM;
        C1360kM c1360kM;
        C1360kM c1360kM2;
        Iterator it;
        ZD zd;
        C1098gM c1098gM2;
        C1360kM c1360kM3;
        C2170wf c2170wf;
        C0762bE c0762bE2;
        C1360kM c1360kM4;
        C1098gM c1098gM3;
        Object obj2;
        Object obj3;
        int hashCode;
        int i = this.n;
        C1334k c1334k = this.p;
        C0657Zf c0657Zf = this.f243o;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            c0762bE = new C0762bE();
            c1098gM = new C1098gM();
            c1360kM = new C1360kM();
            this.h = c0762bE;
            this.i = c1098gM;
            this.j = c1360kM;
            this.k = c1360kM;
            this.n = 1;
            obj = C0657Zf.e(c0657Zf, true, this);
            if (obj != enumC0448Re) {
                c1360kM2 = c1360kM;
            }
            return enumC0448Re;
        }
        if (i == 1) {
            c1360kM = (C1360kM) this.k;
            c1360kM2 = (C1360kM) this.j;
            c1098gM = (C1098gM) this.i;
            c0762bE = (ZD) this.h;
            AbstractC1494mO.l(obj);
        } else {
            if (i == 2) {
                it = this.l;
                c2170wf = (C2170wf) this.k;
                c1360kM3 = (C1360kM) this.j;
                c1098gM2 = (C1098gM) this.i;
                zd = (ZD) this.h;
                AbstractC1494mO.l(obj);
                while (it.hasNext()) {
                    InterfaceC2312yp interfaceC2312yp = (InterfaceC2312yp) it.next();
                    this.h = zd;
                    this.i = c1098gM2;
                    this.j = c1360kM3;
                    this.k = c2170wf;
                    this.l = it;
                    this.n = 2;
                    if (interfaceC2312yp.invoke(c2170wf, this) == enumC0448Re) {
                        break;
                    }
                }
                c1360kM2 = c1360kM3;
                c1098gM = c1098gM2;
                c0762bE = zd;
                c1334k.k = null;
                this.h = c1098gM;
                this.i = c1360kM2;
                this.j = c0762bE;
                this.k = null;
                this.l = null;
                this.n = 3;
                c0762bE2 = (C0762bE) c0762bE;
                if (c0762bE2.c(this) != enumC0448Re) {
                    c1360kM4 = c1360kM2;
                    c1098gM3 = c1098gM;
                    obj2 = c0762bE2;
                    c1098gM3.h = true;
                    ((C0762bE) obj2).e(null);
                    obj3 = c1360kM4.h;
                    hashCode = obj3 == null ? obj3.hashCode() : 0;
                    SR f = c0657Zf.f();
                    this.h = obj3;
                    this.i = null;
                    this.j = null;
                    this.m = hashCode;
                    this.n = 4;
                    obj = f.a();
                }
                return enumC0448Re;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hashCode = this.m;
                obj3 = this.h;
                AbstractC1494mO.l(obj);
                return new C1643of(hashCode, ((Number) obj).intValue(), obj3);
            }
            Object obj4 = (ZD) this.j;
            c1360kM4 = (C1360kM) this.i;
            c1098gM3 = (C1098gM) this.h;
            AbstractC1494mO.l(obj);
            obj2 = obj4;
            try {
                c1098gM3.h = true;
                ((C0762bE) obj2).e(null);
                obj3 = c1360kM4.h;
                hashCode = obj3 == null ? obj3.hashCode() : 0;
                SR f2 = c0657Zf.f();
                this.h = obj3;
                this.i = null;
                this.j = null;
                this.m = hashCode;
                this.n = 4;
                obj = f2.a();
            } catch (Throwable th) {
                ((C0762bE) obj2).e(null);
                throw th;
            }
        }
        c1360kM.h = ((C1643of) obj).b;
        C2170wf c2170wf2 = new C2170wf(c0762bE, c1098gM, c1360kM2, c0657Zf);
        List list = (List) c1334k.k;
        if (list != null) {
            it = list.iterator();
            zd = c0762bE;
            c1098gM2 = c1098gM;
            c1360kM3 = c1360kM2;
            c2170wf = c2170wf2;
            while (it.hasNext()) {
            }
            c1360kM2 = c1360kM3;
            c1098gM = c1098gM2;
            c0762bE = zd;
        }
        c1334k.k = null;
        this.h = c1098gM;
        this.i = c1360kM2;
        this.j = c0762bE;
        this.k = null;
        this.l = null;
        this.n = 3;
        c0762bE2 = (C0762bE) c0762bE;
        if (c0762bE2.c(this) != enumC0448Re) {
        }
        return enumC0448Re;
    }
}
