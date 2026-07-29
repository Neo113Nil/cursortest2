package o;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.iL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1229iL {
    public static final C1229iL c = new C1229iL();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Y1 a = new Y1(2);

    public final InterfaceC0839cQ a(Class cls) {
        InterfaceC0839cQ z;
        Class cls2;
        AbstractC2052ut.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        InterfaceC0839cQ interfaceC0839cQ = (InterfaceC0839cQ) concurrentHashMap.get(cls);
        if (interfaceC0839cQ != null) {
            return interfaceC0839cQ;
        }
        Y1 y1 = this.a;
        y1.getClass();
        Class cls3 = AbstractC1036fQ.a;
        if (!AbstractC2181wq.class.isAssignableFrom(cls) && (cls2 = AbstractC1036fQ.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C2018uL a = ((C1876sB) y1.i).a(cls);
        int i = a.d;
        F f = a.a;
        if ((i & 2) == 2) {
            if (AbstractC2181wq.class.isAssignableFrom(cls)) {
                z = new HC(AbstractC1036fQ.d, AbstractC1846rl.a, f);
            } else {
                C0913dY c0913dY = AbstractC1036fQ.b;
                C1781ql c1781ql = AbstractC1846rl.b;
                if (c1781ql == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                z = new HC(c0913dY, c1781ql, f);
            }
        } else if (AbstractC2181wq.class.isAssignableFrom(cls)) {
            z = (a.d & 1) == 1 ? GC.z(a, AbstractC2209xE.b, AbstractC1152hA.b, AbstractC1036fQ.d, AbstractC1846rl.a, DB.b) : GC.z(a, AbstractC2209xE.b, AbstractC1152hA.b, AbstractC1036fQ.d, null, DB.b);
        } else if ((a.d & 1) == 1) {
            C2143wE c2143wE = AbstractC2209xE.a;
            C1020fA c1020fA = AbstractC1152hA.a;
            C0913dY c0913dY2 = AbstractC1036fQ.b;
            C1781ql c1781ql2 = AbstractC1846rl.b;
            if (c1781ql2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            z = GC.z(a, c2143wE, c1020fA, c0913dY2, c1781ql2, DB.a);
        } else {
            z = GC.z(a, AbstractC2209xE.a, AbstractC1152hA.a, AbstractC1036fQ.c, null, DB.a);
        }
        InterfaceC0839cQ interfaceC0839cQ2 = (InterfaceC0839cQ) concurrentHashMap.putIfAbsent(cls, z);
        return interfaceC0839cQ2 != null ? interfaceC0839cQ2 : z;
    }
}
