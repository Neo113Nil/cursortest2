package o;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: o.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2336z9 implements InterfaceC0387Ov, Serializable {
    public static final Object NO_RECEIVER = C2270y9.i;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC0387Ov reflected;
    private final String signature;

    public AbstractC2336z9(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // o.InterfaceC0387Ov
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // o.InterfaceC0387Ov
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC0387Ov compute() {
        InterfaceC0387Ov interfaceC0387Ov = this.reflected;
        if (interfaceC0387Ov != null) {
            return interfaceC0387Ov;
        }
        InterfaceC0387Ov computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC0387Ov computeReflected();

    @Override // o.InterfaceC0361Nv
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // o.InterfaceC0387Ov
    public String getName() {
        return this.name;
    }

    public InterfaceC1134gw getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? UM.a.c(cls, "") : UM.a.b(cls);
    }

    @Override // o.InterfaceC0387Ov
    public List<InterfaceC0310Lw> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC0387Ov getReflected();

    @Override // o.InterfaceC0387Ov
    public InterfaceC1463lx getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // o.InterfaceC0387Ov
    public List<InterfaceC1727px> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // o.InterfaceC0387Ov
    public EnumC2122vx getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // o.InterfaceC0387Ov
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // o.InterfaceC0387Ov
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // o.InterfaceC0387Ov
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // o.InterfaceC0387Ov, o.InterfaceC1396kw
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
