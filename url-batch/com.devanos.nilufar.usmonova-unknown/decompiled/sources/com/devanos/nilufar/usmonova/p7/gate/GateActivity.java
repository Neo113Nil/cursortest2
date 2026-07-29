package com.devanos.nilufar.usmonova.p7.gate;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.a;
import java.util.Arrays;
import kotlin.Metadata;
import o.A8;
import o.AS;
import o.AbstractActivityC0446Rc;
import o.AbstractC0022At;
import o.AbstractC0048Bt;
import o.AbstractC0106Dz;
import o.AbstractC0472Sc;
import o.AbstractC0868ct;
import o.AbstractC0896dH;
import o.AbstractC0946e20;
import o.AbstractC1180hc;
import o.AbstractC1259iq;
import o.AbstractC1442lc;
import o.AbstractC1494mO;
import o.AbstractC2203x8;
import o.AbstractC2219xO;
import o.BT;
import o.C0067Cm;
import o.C0460Rq;
import o.C0615Xp;
import o.C0641Yp;
import o.C0666Zo;
import o.C0667Zp;
import o.C0721ad;
import o.C0734aq;
import o.C0776bS;
import o.C0782bY;
import o.C0800bq;
import o.C0865cq;
import o.C0901dM;
import o.C1115gd;
import o.C1150h8;
import o.C1188hk;
import o.C1247id;
import o.C1268j;
import o.C1311jd;
import o.C1334k;
import o.C1376kc;
import o.C1443ld;
import o.C1456lq;
import o.C1575nd;
import o.C1623oL;
import o.C1728py;
import o.C2234xd;
import o.DA;
import o.EB;
import o.EnumC0080Cz;
import o.GL;
import o.HB;
import o.I2;
import o.IT;
import o.InterfaceC0189He;
import o.InterfaceC0235Iy;
import o.InterfaceC0365Nz;
import o.InterfaceC0746b00;
import o.InterfaceC1181hd;
import o.InterfaceC1377kd;
import o.InterfaceC2312yp;
import o.JH;
import o.KJ;
import o.LB;
import o.MP;
import o.ON;
import o.PQ;
import o.PX;
import o.RC;
import o.SP;
import o.TD;
import o.TM;
import o.UC;
import o.UM;
import o.UT;
import o.UY;
import o.XZ;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\bR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lcom/devanos/nilufar/usmonova/p7/gate/GateActivity;", "Lo/Rc;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lo/bY;", "extractAndStoreClickId", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "Lo/lq;", "viewModel$delegate", "Lo/Iy;", "getViewModel", "()Lo/lq;", "viewModel", "Lo/iq;", "uiState", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GateActivity extends AbstractActivityC0446Rc {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC0235Iy viewModel = new C1334k(UM.a.b(C1456lq.class), new C0865cq(this, 0), new C0641Yp(0), new C0865cq(this, 1));

    private final void extractAndStoreClickId(Intent intent) {
        Uri data;
        String queryParameter;
        if (intent == null || (data = intent.getData()) == null || (queryParameter = data.getQueryParameter("click_id")) == null || UT.J(queryParameter)) {
            return;
        }
        AbstractC0896dH.d("GateActivity", "click captured");
        AbstractC0868ct.H(PX.S(this), null, null, new C0667Zp(queryParameter, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1456lq getViewModel() {
        return (C1456lq) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0782bY onCreate$lambda$0(GateActivity gateActivity, InterfaceC1377kd interfaceC1377kd, int i) {
        if ((i & 3) == 2) {
            C1575nd c1575nd = (C1575nd) interfaceC1377kd;
            if (c1575nd.t()) {
                c1575nd.F();
                return C0782bY.a;
            }
        }
        IT it = AbstractC1442lc.a;
        long j = AbstractC1180hc.t;
        HB.a(new C1376kc(j, AbstractC1180hc.j, AbstractC1180hc.u, AbstractC1180hc.k, AbstractC1180hc.e, AbstractC1180hc.w, AbstractC1180hc.l, AbstractC1180hc.x, AbstractC1180hc.m, AbstractC1180hc.H, AbstractC1180hc.p, AbstractC1180hc.I, AbstractC1180hc.q, AbstractC1180hc.a, AbstractC1180hc.g, AbstractC1180hc.y, AbstractC1180hc.n, AbstractC1180hc.G, AbstractC1180hc.f176o, j, AbstractC1180hc.f, AbstractC1180hc.d, AbstractC1180hc.b, AbstractC1180hc.h, AbstractC1180hc.c, AbstractC1180hc.i, AbstractC1180hc.r, AbstractC1180hc.s, AbstractC1180hc.v, AbstractC1180hc.z, AbstractC1180hc.F, AbstractC1180hc.A, AbstractC1180hc.B, AbstractC1180hc.C, AbstractC1180hc.D, AbstractC1180hc.E), null, null, AbstractC0946e20.F(-1031645418, new C0615Xp(gateActivity, 0), interfaceC1377kd), interfaceC1377kd, 3072);
        return C0782bY.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0782bY onCreate$lambda$0$0(GateActivity gateActivity, InterfaceC1377kd interfaceC1377kd, int i) {
        int i2 = i & 3;
        C0782bY c0782bY = C0782bY.a;
        int i3 = 2;
        if (i2 == 2) {
            C1575nd c1575nd = (C1575nd) interfaceC1377kd;
            if (c1575nd.t()) {
                c1575nd.F();
                return c0782bY;
            }
        }
        GL gl = gateActivity.getViewModel().f;
        C1575nd c1575nd2 = (C1575nd) interfaceC1377kd;
        InterfaceC0365Nz interfaceC0365Nz = (InterfaceC0365Nz) c1575nd2.h(DA.a);
        Object value = gl.h.getValue();
        AbstractC0106Dz lifecycle = interfaceC0365Nz.getLifecycle();
        EnumC0080Cz enumC0080Cz = EnumC0080Cz.k;
        C1188hk c1188hk = C1188hk.h;
        Object[] objArr = {gl, lifecycle, enumC0080Cz, c1188hk};
        boolean e = c1575nd2.e(lifecycle) | c1575nd2.d(enumC0080Cz) | c1575nd2.e(c1188hk) | c1575nd2.e(gl);
        Object C = c1575nd2.C();
        C1623oL c1623oL = C1311jd.a;
        if (e || C == c1623oL) {
            C0067Cm c0067Cm = new C0067Cm(lifecycle, enumC0080Cz, c1188hk, gl, null);
            c1575nd2.P(c0067Cm);
            C = c0067Cm;
        }
        InterfaceC2312yp interfaceC2312yp = (InterfaceC2312yp) C;
        Object C2 = c1575nd2.C();
        if (C2 == c1623oL) {
            C2 = AbstractC2219xO.r(value);
            c1575nd2.P(C2);
        }
        TD td = (TD) C2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean e2 = c1575nd2.e(interfaceC2312yp);
        Object C3 = c1575nd2.C();
        if (e2 || C3 == c1623oL) {
            C3 = new AS(interfaceC2312yp, td, null);
            c1575nd2.P(C3);
        }
        InterfaceC2312yp interfaceC2312yp2 = (InterfaceC2312yp) C3;
        InterfaceC0189He interfaceC0189He = ((C0901dM) c1575nd2.b).t;
        boolean z = false;
        for (Object obj : Arrays.copyOf(copyOf, copyOf.length)) {
            z |= c1575nd2.d(obj);
        }
        Object C4 = c1575nd2.C();
        if (z || C4 == c1623oL) {
            c1575nd2.P(new C1728py(interfaceC0189He, interfaceC2312yp2));
        }
        boolean e3 = c1575nd2.e(gateActivity);
        Object C5 = c1575nd2.C();
        if (e3 || C5 == c1623oL) {
            C5 = new C0734aq(gateActivity, null);
            c1575nd2.P(C5);
        }
        PX.g(c0782bY, c1575nd2, (InterfaceC2312yp) C5);
        AbstractC1259iq onCreate$lambda$0$0$0 = onCreate$lambda$0$0$0(td);
        boolean d = c1575nd2.d(td) | c1575nd2.e(gateActivity);
        Object C6 = c1575nd2.C();
        if (d || C6 == c1623oL) {
            C6 = new C0800bq(gateActivity, td, null);
            c1575nd2.P(C6);
        }
        PX.g(onCreate$lambda$0$0$0, c1575nd2, (InterfaceC2312yp) C6);
        UC a = a.a(androidx.compose.foundation.layout.a.a, AbstractC0022At.c(4279243793L));
        C1150h8 c1150h8 = C0460Rq.f100o;
        Object obj2 = (LB) AbstractC2203x8.a.get(c1150h8);
        if (obj2 == null) {
            obj2 = new A8(c1150h8, false);
        }
        int i4 = c1575nd2.M;
        JH j = c1575nd2.j();
        c1575nd2.I(439770924);
        if (!a.a(I2.w)) {
            c1575nd2.G(1219399079, null, 0, null);
            a = (UC) a.b(RC.a, new SP(i3, 16));
            c1575nd2.n(false);
        }
        c1575nd2.n(false);
        InterfaceC1181hd.a.getClass();
        C2234xd c2234xd = C1115gd.b;
        c1575nd2.G(125, null, 2, null);
        c1575nd2.q = true;
        boolean z2 = c1575nd2.L;
        if (z2) {
            c1575nd2.i(c2234xd);
        } else {
            c1575nd2.q = false;
            if (z2) {
                EB.h("useNode() called while inserting");
                throw null;
            }
            C0776bS c0776bS = c1575nd2.D;
            Object i5 = c0776bS.i(c0776bS.i);
            C1443ld c1443ld = c1575nd2.I;
            c1443ld.c();
            c1443ld.h.a.add(i5);
        }
        TM.B(obj2, c1575nd2, C1115gd.e);
        TM.B(j, c1575nd2, C1115gd.d);
        C1268j c1268j = C1115gd.f;
        if (c1575nd2.L || !AbstractC0048Bt.h(c1575nd2.C(), Integer.valueOf(i4))) {
            c1575nd2.P(Integer.valueOf(i4));
            c1575nd2.b(Integer.valueOf(i4), c1268j);
        }
        TM.B(a, c1575nd2, C1115gd.c);
        KJ.a(null, AbstractC0022At.c(4290378688L), 0.0f, 0L, 0, c1575nd2, 48);
        c1575nd2.n(true);
        return c0782bY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1259iq onCreate$lambda$0$0$0(BT bt) {
        return (AbstractC1259iq) bt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XZ viewModel_delegate$lambda$0() {
        return new C0666Zo(1);
    }

    @Override // o.AbstractActivityC0446Rc, o.AbstractActivityC0420Qc, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC0896dH.d("GateActivity", "onCreate");
        extractAndStoreClickId(getIntent());
        C0721ad c0721ad = new C0721ad(1135872066, true, new C0615Xp(this, 1));
        ViewGroup.LayoutParams layoutParams = AbstractC0472Sc.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C1247id c1247id = childAt instanceof C1247id ? (C1247id) childAt : null;
        if (c1247id != null) {
            c1247id.setParentCompositionContext(null);
            c1247id.setContent(c0721ad);
            return;
        }
        C1247id c1247id2 = new C1247id(this);
        c1247id2.setParentCompositionContext(null);
        c1247id2.setContent(c0721ad);
        View decorView = getWindow().getDecorView();
        if (ON.g(decorView) == null) {
            ON.q(decorView, this);
        }
        if (((InterfaceC0746b00) PQ.v(PQ.A(PQ.x(decorView, UY.p), UY.q))) == null) {
            decorView.setTag(com.devanos.nilufar.usmonova.R.id.view_tree_view_model_store_owner, this);
        }
        if (((MP) PQ.v(PQ.A(PQ.x(decorView, UY.n), UY.f116o))) == null) {
            AbstractC1494mO.k(decorView, this);
        }
        setContentView(c1247id2, AbstractC0472Sc.a);
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC0048Bt.n(intent, "intent");
        super.onNewIntent(intent);
        extractAndStoreClickId(intent);
    }
}
