package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class vk {
    public static final ml a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [cw] */
    /* JADX WARN: Type inference failed for: r0v7, types: [uk] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ml] */
    /* JADX WARN: Type inference failed for: r0v9, types: [uk] */
    static {
        String str;
        ?? r0;
        int i = ru0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            gl glVar = vm.a;
            r0 = o40.a;
            cw cwVar = r0.i;
            if (!(r0 != 0)) {
                r0 = uk.m;
            }
        } else {
            r0 = uk.m;
        }
        a = r0;
    }
}
