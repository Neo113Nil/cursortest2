package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class cw2 extends hn1 {
    public final xv2 d;
    public final hn1 e;
    public final j03 f;
    public final qm2 g;
    public final qm2 h;
    public final bw2 i;
    public static final /* synthetic */ KProperty[] k = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(cw2.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(cw2.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(cw2.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;", 0))};
    public static final yv2 j = new yv2();

    public cw2(CustomizableMediaView customizableMediaView, xv2 xv2Var, hn1 hn1Var, rn1 rn1Var, j03 j03Var) {
        super(customizableMediaView, rn1Var);
        this.d = xv2Var;
        this.e = hn1Var;
        this.f = j03Var;
        this.g = new qm2(null);
        this.h = new qm2(null);
        Delegates delegates = Delegates.INSTANCE;
        this.i = new bw2(xv2Var, this);
        customizableMediaView.setOnSizeChangedListener$mobileads_externalRelease(new zv2(new WeakReference(this)));
    }

    @Override // yads.ek3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.d.a((View) customizableMediaView);
        this.e.a((View) customizableMediaView);
    }

    @Override // yads.hn1
    public final gn1 d() {
        return ((hn1) this.i.getValue(this, k[2])).d();
    }

    @Override // yads.ek3
    public final void a(ph phVar, hk3 hk3Var, Object obj) {
        dn1 dn1Var = (dn1) obj;
        this.d.a(phVar, hk3Var, dn1Var);
        this.e.a(phVar, hk3Var, dn1Var);
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        return ((hn1) this.i.getValue(this, k[2])).a(view, obj);
    }

    @Override // yads.hn1
    /* renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, dn1 dn1Var) {
        qm2 qm2Var = this.g;
        KProperty<?>[] kPropertyArr = k;
        KProperty<?> kProperty = kPropertyArr[0];
        qm2Var.getClass();
        qm2Var.a = new WeakReference(customizableMediaView);
        qm2 qm2Var2 = this.h;
        KProperty<?> kProperty2 = kPropertyArr[1];
        qm2Var2.getClass();
        qm2Var2.a = new WeakReference(dn1Var);
        ((hn1) this.i.getValue(this, kPropertyArr[2])).b(customizableMediaView, dn1Var);
    }

    @Override // yads.ek3
    public final void a() {
        ((hn1) this.i.getValue(this, k[2])).a();
    }

    @Override // yads.hn1
    public final void a(dn1 dn1Var) {
        ((hn1) this.i.getValue(this, k[2])).a(dn1Var);
    }

    @Override // yads.hn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.d.d.a();
        this.e.a(customizableMediaView);
    }
}
