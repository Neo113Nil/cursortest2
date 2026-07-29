package o;

/* loaded from: classes.dex */
public abstract class UM {
    public static final VM a;

    static {
        VM vm = null;
        try {
            vm = (VM) WM.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (vm == null) {
            vm = new VM();
        }
        a = vm;
    }
}
