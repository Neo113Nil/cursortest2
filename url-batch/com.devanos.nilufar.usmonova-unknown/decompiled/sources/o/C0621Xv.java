package o;

/* renamed from: o.Xv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621Xv extends AbstractC1200hw {
    public static final /* synthetic */ InterfaceC0937dx[] n;
    public final RM c;
    public final RM d;
    public final RM e;
    public final RM f;
    public final SM g;
    public final RM h;
    public final RM i;
    public final RM j;
    public final RM k;
    public final RM l;
    public final RM m;

    static {
        VM vm = UM.a;
        n = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0621Xv.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), vm.g(new UJ(vm.b(C0621Xv.class), "annotations", "getAnnotations()Ljava/util/List;")), vm.g(new UJ(vm.b(C0621Xv.class), "simpleName", "getSimpleName()Ljava/lang/String;")), vm.g(new UJ(vm.b(C0621Xv.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), vm.g(new UJ(vm.b(C0621Xv.class), "constructors", "getConstructors()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), vm.g(new UJ(vm.b(C0621Xv.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), vm.g(new UJ(vm.b(C0621Xv.class), "supertypes", "getSupertypes()Ljava/util/List;")), vm.g(new UJ(vm.b(C0621Xv.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), vm.g(new UJ(vm.b(C0621Xv.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), vm.g(new UJ(vm.b(C0621Xv.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
    }

    public C0621Xv(C0740aw c0740aw) {
        super(c0740aw);
        this.c = TM.u(null, new C0569Vv(c0740aw, 3));
        TM.u(null, new C0543Uv(this, 3));
        this.d = TM.u(null, new C0569Vv(c0740aw, this));
        this.e = TM.u(null, new C0569Vv(c0740aw, 6));
        this.f = TM.u(null, new C0569Vv(c0740aw, 0));
        TM.u(null, new C0543Uv(this, 5));
        this.g = new SM(new C0595Wv(this, c0740aw, 0));
        TM.u(null, new C0595Wv(this, c0740aw, 2));
        TM.u(null, new C0595Wv(this, c0740aw, 1));
        TM.u(null, new C0543Uv(this, 6));
        this.h = TM.u(null, new C0569Vv(c0740aw, 1));
        this.i = TM.u(null, new C0569Vv(c0740aw, 2));
        this.j = TM.u(null, new C0569Vv(c0740aw, 4));
        this.k = TM.u(null, new C0569Vv(c0740aw, 5));
        this.l = TM.u(null, new C0543Uv(this, 1));
        this.m = TM.u(null, new C0543Uv(this, 2));
        TM.u(null, new C0543Uv(this, 4));
        TM.u(null, new C0543Uv(this, 0));
    }

    public final InterfaceC1245ib a() {
        InterfaceC0937dx interfaceC0937dx = n[0];
        Object invoke = this.c.invoke();
        AbstractC0048Bt.m(invoke, "<get-descriptor>(...)");
        return (InterfaceC1245ib) invoke;
    }
}
