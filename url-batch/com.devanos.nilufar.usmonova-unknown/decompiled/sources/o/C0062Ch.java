package o;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.Ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062Ch implements InterfaceC0010Ah {
    public static final /* synthetic */ InterfaceC0937dx[] W;
    public final C0036Bh A;
    public final C0036Bh B;
    public final C0036Bh C;
    public final C0036Bh D;
    public final C0036Bh E;
    public final C0036Bh F;
    public final C0036Bh G;
    public final C0036Bh H;
    public final C0036Bh I;
    public final C0036Bh J;
    public final C0036Bh K;
    public final C0036Bh L;
    public final C0036Bh M;
    public final C0036Bh N;
    public final C0036Bh O;
    public final C0036Bh P;
    public final C0036Bh Q;
    public final C0036Bh R;
    public final C0036Bh S;
    public final C0036Bh T;
    public final C0036Bh U;
    public final C0036Bh V;
    public boolean a;
    public final C0036Bh b = new C0036Bh(C0030Bb.d, this);
    public final C0036Bh c;
    public final C0036Bh d;
    public final C0036Bh e;
    public final C0036Bh f;
    public final C0036Bh g;
    public final C0036Bh h;
    public final C0036Bh i;
    public final C0036Bh j;
    public final C0036Bh k;
    public final C0036Bh l;
    public final C0036Bh m;
    public final C0036Bh n;

    /* renamed from: o, reason: collision with root package name */
    public final C0036Bh f23o;
    public final C0036Bh p;
    public final C0036Bh q;
    public final C0036Bh r;
    public final C0036Bh s;
    public final C0036Bh t;
    public final C0036Bh u;
    public final C0036Bh v;
    public final C0036Bh w;
    public final C0036Bh x;
    public final C0036Bh y;
    public final C0036Bh z;

    static {
        VM vm = UM.a;
        W = new InterfaceC0937dx[]{vm.e(new JD(vm.b(C0062Ch.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), vm.e(new JD(vm.b(C0062Ch.class), "withDefinedIn", "getWithDefinedIn()Z")), vm.e(new JD(vm.b(C0062Ch.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), vm.e(new JD(vm.b(C0062Ch.class), "modifiers", "getModifiers()Ljava/util/Set;")), vm.e(new JD(vm.b(C0062Ch.class), "startFromName", "getStartFromName()Z")), vm.e(new JD(vm.b(C0062Ch.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), vm.e(new JD(vm.b(C0062Ch.class), "debugMode", "getDebugMode()Z")), vm.e(new JD(vm.b(C0062Ch.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), vm.e(new JD(vm.b(C0062Ch.class), "verbose", "getVerbose()Z")), vm.e(new JD(vm.b(C0062Ch.class), "unitReturnType", "getUnitReturnType()Z")), vm.e(new JD(vm.b(C0062Ch.class), "withoutReturnType", "getWithoutReturnType()Z")), vm.e(new JD(vm.b(C0062Ch.class), "enhancedTypes", "getEnhancedTypes()Z")), vm.e(new JD(vm.b(C0062Ch.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderDefaultModality", "getRenderDefaultModality()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), vm.e(new JD(vm.b(C0062Ch.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), vm.e(new JD(vm.b(C0062Ch.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), vm.e(new JD(vm.b(C0062Ch.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), vm.e(new JD(vm.b(C0062Ch.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), vm.e(new JD(vm.b(C0062Ch.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), vm.e(new JD(vm.b(C0062Ch.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), vm.e(new JD(vm.b(C0062Ch.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), vm.e(new JD(vm.b(C0062Ch.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), vm.e(new JD(vm.b(C0062Ch.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), vm.e(new JD(vm.b(C0062Ch.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), vm.e(new JD(vm.b(C0062Ch.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), vm.e(new JD(vm.b(C0062Ch.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), vm.e(new JD(vm.b(C0062Ch.class), "receiverAfterName", "getReceiverAfterName()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), vm.e(new JD(vm.b(C0062Ch.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), vm.e(new JD(vm.b(C0062Ch.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), vm.e(new JD(vm.b(C0062Ch.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), vm.e(new JD(vm.b(C0062Ch.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), vm.e(new JD(vm.b(C0062Ch.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), vm.e(new JD(vm.b(C0062Ch.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), vm.e(new JD(vm.b(C0062Ch.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), vm.e(new JD(vm.b(C0062Ch.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), vm.e(new JD(vm.b(C0062Ch.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), vm.e(new JD(vm.b(C0062Ch.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), vm.e(new JD(vm.b(C0062Ch.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), vm.e(new JD(vm.b(C0062Ch.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), vm.e(new JD(vm.b(C0062Ch.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), vm.e(new JD(vm.b(C0062Ch.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public C0062Ch() {
        Boolean bool = Boolean.TRUE;
        this.c = new C0036Bh(bool, this);
        this.d = new C0036Bh(bool, this);
        this.e = new C0036Bh(EnumC2370zh.i, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new C0036Bh(bool2, this);
        this.g = new C0036Bh(bool2, this);
        this.h = new C0036Bh(bool2, this);
        this.i = new C0036Bh(bool2, this);
        this.j = new C0036Bh(bool2, this);
        this.k = new C0036Bh(bool, this);
        this.l = new C0036Bh(bool2, this);
        this.m = new C0036Bh(bool2, this);
        this.n = new C0036Bh(bool2, this);
        this.f23o = new C0036Bh(bool, this);
        this.p = new C0036Bh(bool, this);
        this.q = new C0036Bh(bool2, this);
        this.r = new C0036Bh(bool2, this);
        this.s = new C0036Bh(bool2, this);
        this.t = new C0036Bh(bool2, this);
        this.u = new C0036Bh(bool2, this);
        this.v = new C0036Bh(bool2, this);
        this.w = new C0036Bh(bool2, this);
        this.x = new C0036Bh(I2.B, this);
        this.y = new C0036Bh(I2.A, this);
        this.z = new C0036Bh(bool, this);
        this.A = new C0036Bh(UG.i, this);
        this.B = new C0036Bh(C2172wh.a, this);
        this.C = new C0036Bh(EnumC1822rN.h, this);
        this.D = new C0036Bh(EnumC1948tH.h, this);
        this.E = new C0036Bh(bool2, this);
        this.F = new C0036Bh(bool2, this);
        this.G = new C0036Bh(OJ.h, this);
        this.H = new C0036Bh(bool2, this);
        this.I = new C0036Bh(bool2, this);
        this.J = new C0036Bh(C1648ok.h, this);
        this.K = new C0036Bh(AbstractC0662Zk.a, this);
        this.L = new C0036Bh(null, this);
        this.M = new C0036Bh(EnumC0752b4.NO_ARGUMENTS, this);
        this.N = new C0036Bh(bool2, this);
        this.O = new C0036Bh(bool, this);
        this.P = new C0036Bh(bool, this);
        this.Q = new C0036Bh(bool2, this);
        this.R = new C0036Bh(bool, this);
        this.S = new C0036Bh(bool, this);
        this.T = new C0036Bh(bool2, this);
        this.U = new C0036Bh(bool2, this);
        this.V = new C0036Bh(bool, this);
    }

    @Override // o.InterfaceC0010Ah
    public final void a() {
        InterfaceC0937dx interfaceC0937dx = W[29];
        this.E.b(Boolean.TRUE, interfaceC0937dx);
    }

    @Override // o.InterfaceC0010Ah
    public final void b() {
        InterfaceC0937dx interfaceC0937dx = W[6];
        this.h.b(Boolean.TRUE, interfaceC0937dx);
    }

    @Override // o.InterfaceC0010Ah
    public final void c() {
        InterfaceC0937dx interfaceC0937dx = W[30];
        this.F.b(Boolean.TRUE, interfaceC0937dx);
    }

    @Override // o.InterfaceC0010Ah
    public final void d(InterfaceC0056Cb interfaceC0056Cb) {
        this.b.b(interfaceC0056Cb, W[0]);
    }

    @Override // o.InterfaceC0010Ah
    public final void e(Set set) {
        AbstractC0048Bt.n(set, "<set-?>");
        this.e.b(set, W[3]);
    }

    @Override // o.InterfaceC0010Ah
    public final void f() {
        InterfaceC0937dx interfaceC0937dx = W[4];
        this.f.b(Boolean.TRUE, interfaceC0937dx);
    }

    @Override // o.InterfaceC0010Ah
    public final void g() {
        InterfaceC0937dx interfaceC0937dx = W[1];
        this.c.b(Boolean.FALSE, interfaceC0937dx);
    }

    @Override // o.InterfaceC0010Ah
    public final Set h() {
        return (Set) this.K.a(this, W[35]);
    }

    @Override // o.InterfaceC0010Ah
    public final void i(LinkedHashSet linkedHashSet) {
        this.K.b(linkedHashSet, W[35]);
    }

    @Override // o.InterfaceC0010Ah
    public final void j() {
        InterfaceC0937dx interfaceC0937dx = W[20];
        this.v.b(Boolean.TRUE, interfaceC0937dx);
    }

    @Override // o.InterfaceC0010Ah
    public final void k() {
        this.C.b(EnumC1822rN.i, W[27]);
    }

    @Override // o.InterfaceC0010Ah
    public final void l() {
        InterfaceC0937dx interfaceC0937dx = W[21];
        this.w.b(Boolean.TRUE, interfaceC0937dx);
    }

    @Override // o.InterfaceC0010Ah
    public final void m(EnumC1948tH enumC1948tH) {
        this.D.b(enumC1948tH, W[28]);
    }

    public final boolean n() {
        return ((Boolean) this.h.a(this, W[6])).booleanValue();
    }
}
