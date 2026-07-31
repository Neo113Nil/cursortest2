package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.B5;
import com.my.target.pj;
import com.my.target.vg;
import com.my.target.wh;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class og implements vg.a {
    final rg a;
    final WeakReference b;
    final pj c;
    final se d;
    WeakReference e;
    a f;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(String str);

        void b(String str);
    }

    public og(rg rgVar, se seVar, Context context) {
        mi.a("ShoppableAdPresenter: create presenter");
        this.a = rgVar;
        this.b = new WeakReference(context);
        this.d = seVar;
        this.c = pj.a(rgVar.P(), rgVar.H(), (wh.c) null);
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    public long b() {
        vg vgVar;
        WeakReference weakReference = this.e;
        if (weakReference == null || (vgVar = (vg) weakReference.get()) == null) {
            return 0L;
        }
        return vgVar.getAndResetInteractionEnd();
    }

    public View c() {
        vg vgVar;
        WeakReference weakReference = this.e;
        if (weakReference != null && (vgVar = (vg) weakReference.get()) != null) {
            return vgVar;
        }
        Context context = (Context) this.b.get();
        if (context == null) {
            mi.a("ShoppableAdPresenter: context is null");
            return null;
        }
        vg vgVar2 = new vg(context);
        vgVar2.setListener(this);
        vgVar2.a(this.d);
        this.c.b(vgVar2);
        vgVar2.a(null, this.a.Y(), POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
        this.e = new WeakReference(vgVar2);
        return vgVar2;
    }

    public void a() {
        vg vgVar;
        mi.a("ShoppableAdPresenter: destroy presenter");
        this.c.a((pj.a) null);
        this.c.e();
        WeakReference weakReference = this.e;
        if (weakReference != null && (vgVar = (vg) weakReference.get()) != null) {
            vgVar.setListener(null);
        }
        this.e = null;
    }

    @Override // com.my.target.vg.a
    public void a(String str) {
        mi.a("ShoppableAdPresenter: on shoppable view click, url - " + str);
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.my.target.vg.a
    public void a(int i, String str, String str2) {
        a aVar = this.f;
        if (aVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WebView error - ");
        sb.append(i);
        if (!TextUtils.isEmpty(str)) {
            sb.append(", ");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(", ");
            sb.append(str2);
        }
        aVar.b(sb.toString());
    }
}
