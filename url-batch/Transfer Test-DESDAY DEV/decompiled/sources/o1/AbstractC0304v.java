package o1;

/* renamed from: o1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0304v {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0305w f3342a;

    static {
        String str;
        p1.c cVar;
        int i = s1.r.f3716a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            u1.d dVar = AbstractC0308z.f3345a;
            p1.c cVar2 = s1.m.f3714a;
            p1.c cVar3 = cVar2.f3430f;
            cVar = !(cVar2 instanceof InterfaceC0305w) ? RunnableC0303u.i : cVar2;
        } else {
            cVar = RunnableC0303u.i;
        }
        f3342a = cVar;
    }
}
