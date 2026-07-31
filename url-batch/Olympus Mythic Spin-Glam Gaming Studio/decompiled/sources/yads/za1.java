package yads;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes6.dex */
public final class za1 {
    public final CoroutineScope a = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new a20()));
    public final ky0 b;
    public final l53 c;
    public final jy0 d;
    public final hy0 e;
    public final fy0 f;
    public final my0 g;
    public final c80 h;
    public final la i;
    public final ia j;
    public final fa k;
    public final as1 l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final Channel o;
    public final Flow p;

    public za1(ky0 ky0Var, l53 l53Var, jy0 jy0Var, hy0 hy0Var, fy0 fy0Var, my0 my0Var, c80 c80Var, la laVar, ia iaVar, fa faVar, as1 as1Var) {
        this.b = ky0Var;
        this.c = l53Var;
        this.d = jy0Var;
        this.e = hy0Var;
        this.f = fy0Var;
        this.g = my0Var;
        this.h = c80Var;
        this.i = laVar;
        this.j = iaVar;
        this.k = faVar;
        this.l = as1Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new ca0(null, v70.b, false, CollectionsKt.emptyList()));
        this.m = MutableStateFlow;
        this.n = FlowKt.asStateFlow(MutableStateFlow);
        Channel Channel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.o = Channel$default;
        this.p = FlowKt.receiveAsFlow(Channel$default);
    }

    public final void a(t90 t90Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (t90Var instanceof l90) {
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new ya1(this, null), 3, null);
            return;
        }
        if (t90Var instanceof r90) {
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new wa1(this, null), 3, null);
            return;
        }
        if (t90Var instanceof p90) {
            l53 l53Var = this.c;
            boolean z = !l53Var.a.a.a().e.a;
            vw2 vw2Var = l53Var.a.a.e.a;
            vw2Var.getClass();
            synchronized (vw2.k) {
                vw2Var.e = z;
                vw2Var.f = z;
                vw2Var.g = z;
                Unit unit = Unit.INSTANCE;
            }
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new ya1(this, null), 3, null);
            return;
        }
        if (t90Var instanceof o90) {
            ca0 ca0Var = ((ca0) this.m.getValue()).a;
            if (ca0Var == null) {
                BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new va1(this, u90.a, null), 3, null);
                return;
            }
            ca0 a = ca0.a(ca0Var, null, null, false, null, 11);
            MutableStateFlow mutableStateFlow = this.m;
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value4, a));
            return;
        }
        if (t90Var instanceof n90) {
            u70 u70Var = u70.b;
            ca0 ca0Var2 = (ca0) this.m.getValue();
            ca0 a2 = ca0.a(ca0Var2, ca0Var2, u70Var, false, null, 12);
            MutableStateFlow mutableStateFlow2 = this.m;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, a2));
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new ya1(this, null), 3, null);
            return;
        }
        if (t90Var instanceof m90) {
            s70 s70Var = new s70(((m90) t90Var).a);
            ca0 ca0Var3 = (ca0) this.m.getValue();
            ca0 a3 = ca0.a(ca0Var3, ca0Var3, s70Var, false, null, 12);
            MutableStateFlow mutableStateFlow3 = this.m;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, a3));
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new ya1(this, null), 3, null);
            return;
        }
        if (!(t90Var instanceof q90)) {
            if (t90Var instanceof s90) {
                BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new xa1(this, ((s90) t90Var).a, null), 3, null);
                return;
            }
            return;
        }
        x70 x70Var = ((ca0) this.m.getValue()).b;
        la0 la0Var = ((q90) t90Var).a;
        x70 t70Var = x70Var instanceof s70 ? new t70(la0Var) : new w70(la0Var.a);
        ca0 ca0Var4 = (ca0) this.m.getValue();
        ca0 a4 = ca0.a(ca0Var4, ca0Var4, t70Var, false, null, 12);
        MutableStateFlow mutableStateFlow4 = this.m;
        do {
            value = mutableStateFlow4.getValue();
        } while (!mutableStateFlow4.compareAndSet(value, a4));
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new ya1(this, null), 3, null);
    }
}
