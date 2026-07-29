package o;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class DL implements InterfaceC0649Yx {
    public static final boolean p = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    public static final HashMap q;
    public int[] h;
    public String i;
    public int j;
    public String[] k;
    public String[] l;
    public String[] m;
    public EnumC0571Vx n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f30o;

    static {
        HashMap hashMap = new HashMap();
        q = hashMap;
        hashMap.put(C1639ob.j(new C2245xo("kotlin.jvm.internal.KotlinClass")), EnumC0571Vx.CLASS);
        hashMap.put(C1639ob.j(new C2245xo("kotlin.jvm.internal.KotlinFileFacade")), EnumC0571Vx.FILE_FACADE);
        hashMap.put(C1639ob.j(new C2245xo("kotlin.jvm.internal.KotlinMultifileClass")), EnumC0571Vx.MULTIFILE_CLASS);
        hashMap.put(C1639ob.j(new C2245xo("kotlin.jvm.internal.KotlinMultifileClassPart")), EnumC0571Vx.MULTIFILE_CLASS_PART);
        hashMap.put(C1639ob.j(new C2245xo("kotlin.jvm.internal.KotlinSyntheticClass")), EnumC0571Vx.SYNTHETIC_CLASS);
    }

    @Override // o.InterfaceC0649Yx
    public final InterfaceC0597Wx b(C1639ob c1639ob, C1426lM c1426lM) {
        EnumC0571Vx enumC0571Vx;
        C2245xo b = c1639ob.b();
        if (b.equals(AbstractC0438Qu.a)) {
            return new BL(this, 0);
        }
        if (b.equals(AbstractC0438Qu.f93o)) {
            return new BL(this, 1);
        }
        if (p || this.n != null || (enumC0571Vx = (EnumC0571Vx) q.get(c1639ob)) == null) {
            return null;
        }
        this.n = enumC0571Vx;
        return new BL(this, 2);
    }
}
