package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327i {

    /* renamed from: a, reason: collision with root package name */
    public int f3929a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3930b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3931c;
    public final C0328j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3932e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3933f;

    public C0327i() {
        l lVar = new l();
        lVar.f4004a = 0;
        lVar.f4005b = 0;
        lVar.f4006c = 1.0f;
        lVar.d = Float.NaN;
        this.f3930b = lVar;
        k kVar = new k();
        kVar.f3998a = -1;
        kVar.f3999b = 0;
        kVar.f4000c = -1;
        kVar.d = Float.NaN;
        kVar.f4001e = Float.NaN;
        kVar.f4002f = Float.NaN;
        kVar.f4003g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3931c = kVar;
        C0328j c0328j = new C0328j();
        c0328j.f3960a = false;
        c0328j.d = -1;
        c0328j.f3967e = -1;
        c0328j.f3969f = -1.0f;
        c0328j.f3971g = true;
        c0328j.h = -1;
        c0328j.i = -1;
        c0328j.f3975j = -1;
        c0328j.f3976k = -1;
        c0328j.f3978l = -1;
        c0328j.f3980m = -1;
        c0328j.f3982n = -1;
        c0328j.f3984o = -1;
        c0328j.f3986p = -1;
        c0328j.f3987q = -1;
        c0328j.f3988r = -1;
        c0328j.f3989s = -1;
        c0328j.f3990t = -1;
        c0328j.f3991u = -1;
        c0328j.f3992v = -1;
        c0328j.f3993w = 0.5f;
        c0328j.f3994x = 0.5f;
        c0328j.f3995y = null;
        c0328j.f3996z = -1;
        c0328j.f3935A = 0;
        c0328j.f3936B = 0.0f;
        c0328j.f3937C = -1;
        c0328j.f3938D = -1;
        c0328j.f3939E = -1;
        c0328j.F = 0;
        c0328j.f3940G = 0;
        c0328j.f3941H = 0;
        c0328j.f3942I = 0;
        c0328j.f3943J = 0;
        c0328j.f3944K = 0;
        c0328j.f3945L = 0;
        c0328j.f3946M = Integer.MIN_VALUE;
        c0328j.f3947N = Integer.MIN_VALUE;
        c0328j.f3948O = Integer.MIN_VALUE;
        c0328j.f3949P = Integer.MIN_VALUE;
        c0328j.f3950Q = Integer.MIN_VALUE;
        c0328j.f3951R = Integer.MIN_VALUE;
        c0328j.f3952S = Integer.MIN_VALUE;
        c0328j.f3953T = -1.0f;
        c0328j.f3954U = -1.0f;
        c0328j.f3955V = 0;
        c0328j.f3956W = 0;
        c0328j.f3957X = 0;
        c0328j.f3958Y = 0;
        c0328j.f3959Z = 0;
        c0328j.f3961a0 = 0;
        c0328j.f3963b0 = 0;
        c0328j.f3965c0 = 0;
        c0328j.f3966d0 = 1.0f;
        c0328j.f3968e0 = 1.0f;
        c0328j.f3970f0 = -1;
        c0328j.f3972g0 = 0;
        c0328j.f3973h0 = -1;
        c0328j.f3979l0 = false;
        c0328j.f3981m0 = false;
        c0328j.f3983n0 = true;
        c0328j.f3985o0 = 0;
        this.d = c0328j;
        m mVar = new m();
        mVar.f4008a = 0.0f;
        mVar.f4009b = 0.0f;
        mVar.f4010c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4011e = 1.0f;
        mVar.f4012f = Float.NaN;
        mVar.f4013g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4014j = 0.0f;
        mVar.f4015k = 0.0f;
        mVar.f4016l = false;
        mVar.f4017m = 0.0f;
        this.f3932e = mVar;
        this.f3933f = new HashMap();
    }

    public final void a(C0323e c0323e) {
        C0328j c0328j = this.d;
        c0323e.f3879e = c0328j.h;
        c0323e.f3881f = c0328j.i;
        c0323e.f3883g = c0328j.f3975j;
        c0323e.h = c0328j.f3976k;
        c0323e.i = c0328j.f3978l;
        c0323e.f3887j = c0328j.f3980m;
        c0323e.f3888k = c0328j.f3982n;
        c0323e.f3890l = c0328j.f3984o;
        c0323e.f3892m = c0328j.f3986p;
        c0323e.f3894n = c0328j.f3987q;
        c0323e.f3896o = c0328j.f3988r;
        c0323e.f3902s = c0328j.f3989s;
        c0323e.f3903t = c0328j.f3990t;
        c0323e.f3904u = c0328j.f3991u;
        c0323e.f3905v = c0328j.f3992v;
        ((ViewGroup.MarginLayoutParams) c0323e).leftMargin = c0328j.F;
        ((ViewGroup.MarginLayoutParams) c0323e).rightMargin = c0328j.f3940G;
        ((ViewGroup.MarginLayoutParams) c0323e).topMargin = c0328j.f3941H;
        ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin = c0328j.f3942I;
        c0323e.f3847A = c0328j.f3951R;
        c0323e.f3848B = c0328j.f3950Q;
        c0323e.f3907x = c0328j.f3947N;
        c0323e.f3909z = c0328j.f3949P;
        c0323e.f3851E = c0328j.f3993w;
        c0323e.F = c0328j.f3994x;
        c0323e.f3898p = c0328j.f3996z;
        c0323e.f3900q = c0328j.f3935A;
        c0323e.f3901r = c0328j.f3936B;
        c0323e.f3852G = c0328j.f3995y;
        c0323e.f3865T = c0328j.f3937C;
        c0323e.f3866U = c0328j.f3938D;
        c0323e.f3854I = c0328j.f3953T;
        c0323e.f3853H = c0328j.f3954U;
        c0323e.f3856K = c0328j.f3956W;
        c0323e.f3855J = c0328j.f3955V;
        c0323e.f3868W = c0328j.f3979l0;
        c0323e.f3869X = c0328j.f3981m0;
        c0323e.f3857L = c0328j.f3957X;
        c0323e.f3858M = c0328j.f3958Y;
        c0323e.f3861P = c0328j.f3959Z;
        c0323e.f3862Q = c0328j.f3961a0;
        c0323e.f3859N = c0328j.f3963b0;
        c0323e.f3860O = c0328j.f3965c0;
        c0323e.f3863R = c0328j.f3966d0;
        c0323e.f3864S = c0328j.f3968e0;
        c0323e.f3867V = c0328j.f3939E;
        c0323e.f3876c = c0328j.f3969f;
        c0323e.f3872a = c0328j.d;
        c0323e.f3874b = c0328j.f3967e;
        ((ViewGroup.MarginLayoutParams) c0323e).width = c0328j.f3962b;
        ((ViewGroup.MarginLayoutParams) c0323e).height = c0328j.f3964c;
        String str = c0328j.f3977k0;
        if (str != null) {
            c0323e.f3870Y = str;
        }
        c0323e.f3871Z = c0328j.f3985o0;
        c0323e.setMarginStart(c0328j.f3944K);
        c0323e.setMarginEnd(c0328j.f3943J);
        c0323e.a();
    }

    public final Object clone() {
        C0327i c0327i = new C0327i();
        C0328j c0328j = c0327i.d;
        c0328j.getClass();
        C0328j c0328j2 = this.d;
        c0328j.f3960a = c0328j2.f3960a;
        c0328j.f3962b = c0328j2.f3962b;
        c0328j.f3964c = c0328j2.f3964c;
        c0328j.d = c0328j2.d;
        c0328j.f3967e = c0328j2.f3967e;
        c0328j.f3969f = c0328j2.f3969f;
        c0328j.f3971g = c0328j2.f3971g;
        c0328j.h = c0328j2.h;
        c0328j.i = c0328j2.i;
        c0328j.f3975j = c0328j2.f3975j;
        c0328j.f3976k = c0328j2.f3976k;
        c0328j.f3978l = c0328j2.f3978l;
        c0328j.f3980m = c0328j2.f3980m;
        c0328j.f3982n = c0328j2.f3982n;
        c0328j.f3984o = c0328j2.f3984o;
        c0328j.f3986p = c0328j2.f3986p;
        c0328j.f3987q = c0328j2.f3987q;
        c0328j.f3988r = c0328j2.f3988r;
        c0328j.f3989s = c0328j2.f3989s;
        c0328j.f3990t = c0328j2.f3990t;
        c0328j.f3991u = c0328j2.f3991u;
        c0328j.f3992v = c0328j2.f3992v;
        c0328j.f3993w = c0328j2.f3993w;
        c0328j.f3994x = c0328j2.f3994x;
        c0328j.f3995y = c0328j2.f3995y;
        c0328j.f3996z = c0328j2.f3996z;
        c0328j.f3935A = c0328j2.f3935A;
        c0328j.f3936B = c0328j2.f3936B;
        c0328j.f3937C = c0328j2.f3937C;
        c0328j.f3938D = c0328j2.f3938D;
        c0328j.f3939E = c0328j2.f3939E;
        c0328j.F = c0328j2.F;
        c0328j.f3940G = c0328j2.f3940G;
        c0328j.f3941H = c0328j2.f3941H;
        c0328j.f3942I = c0328j2.f3942I;
        c0328j.f3943J = c0328j2.f3943J;
        c0328j.f3944K = c0328j2.f3944K;
        c0328j.f3945L = c0328j2.f3945L;
        c0328j.f3946M = c0328j2.f3946M;
        c0328j.f3947N = c0328j2.f3947N;
        c0328j.f3948O = c0328j2.f3948O;
        c0328j.f3949P = c0328j2.f3949P;
        c0328j.f3950Q = c0328j2.f3950Q;
        c0328j.f3951R = c0328j2.f3951R;
        c0328j.f3952S = c0328j2.f3952S;
        c0328j.f3953T = c0328j2.f3953T;
        c0328j.f3954U = c0328j2.f3954U;
        c0328j.f3955V = c0328j2.f3955V;
        c0328j.f3956W = c0328j2.f3956W;
        c0328j.f3957X = c0328j2.f3957X;
        c0328j.f3958Y = c0328j2.f3958Y;
        c0328j.f3959Z = c0328j2.f3959Z;
        c0328j.f3961a0 = c0328j2.f3961a0;
        c0328j.f3963b0 = c0328j2.f3963b0;
        c0328j.f3965c0 = c0328j2.f3965c0;
        c0328j.f3966d0 = c0328j2.f3966d0;
        c0328j.f3968e0 = c0328j2.f3968e0;
        c0328j.f3970f0 = c0328j2.f3970f0;
        c0328j.f3972g0 = c0328j2.f3972g0;
        c0328j.f3973h0 = c0328j2.f3973h0;
        c0328j.f3977k0 = c0328j2.f3977k0;
        int[] iArr = c0328j2.f3974i0;
        if (iArr == null || c0328j2.j0 != null) {
            c0328j.f3974i0 = null;
        } else {
            c0328j.f3974i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0328j.j0 = c0328j2.j0;
        c0328j.f3979l0 = c0328j2.f3979l0;
        c0328j.f3981m0 = c0328j2.f3981m0;
        c0328j.f3983n0 = c0328j2.f3983n0;
        c0328j.f3985o0 = c0328j2.f3985o0;
        k kVar = c0327i.f3931c;
        kVar.getClass();
        k kVar2 = this.f3931c;
        kVar2.getClass();
        kVar.f3998a = kVar2.f3998a;
        kVar.f4000c = kVar2.f4000c;
        kVar.f4001e = kVar2.f4001e;
        kVar.d = kVar2.d;
        l lVar = c0327i.f3930b;
        l lVar2 = this.f3930b;
        lVar.f4004a = lVar2.f4004a;
        lVar.f4006c = lVar2.f4006c;
        lVar.d = lVar2.d;
        lVar.f4005b = lVar2.f4005b;
        m mVar = c0327i.f3932e;
        mVar.getClass();
        m mVar2 = this.f3932e;
        mVar2.getClass();
        mVar.f4008a = mVar2.f4008a;
        mVar.f4009b = mVar2.f4009b;
        mVar.f4010c = mVar2.f4010c;
        mVar.d = mVar2.d;
        mVar.f4011e = mVar2.f4011e;
        mVar.f4012f = mVar2.f4012f;
        mVar.f4013g = mVar2.f4013g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4014j = mVar2.f4014j;
        mVar.f4015k = mVar2.f4015k;
        mVar.f4016l = mVar2.f4016l;
        mVar.f4017m = mVar2.f4017m;
        c0327i.f3929a = this.f3929a;
        return c0327i;
    }
}
