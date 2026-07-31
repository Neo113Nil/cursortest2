package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetManager;
import com.my.target.common.StoreType;
import com.my.target.common.webform.WebFormClient;
import com.my.target.internal.api.internalnativead.ExternalNavigationRouter;
import com.my.target.si;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public final class m2 {
    private static final si d = si.a();
    private static final List e = Arrays.asList(StoreType.GOOGLE_PLAY, StoreType.APP_STORE, StoreType.RU_STORE, StoreType.APP_GALLERY, "galaxystore", "mistore");
    private static final List f = Arrays.asList("lead_form", "leadform");
    private final CustomParams a;
    private final k2 b = new k2();
    private final x7 c = new y7();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void c();
    }

    public m2(CustomParams customParams) {
        this.a = customParams;
    }

    private void b(b bVar, Context context, String str, Map map, o2 o2Var, ExternalNavigationRouter externalNavigationRouter, WebFormClient webFormClient) {
        String a2 = a(str, bVar, map);
        if (a(bVar, a2, o2Var, externalNavigationRouter)) {
            return;
        }
        List N = bVar.N();
        if (a(N, e)) {
            a(bVar, context, a2, o2Var);
        } else if (a(N, f)) {
            a(bVar, context, webFormClient, a2, o2Var, N);
        } else {
            a(bVar, context, a2, o2Var, N);
        }
    }

    public void a(b bVar, Context context, o2 o2Var, ExternalNavigationRouter externalNavigationRouter, WebFormClient webFormClient, a aVar) {
        bVar.f().a(2, 7000, null, o2.a(o2Var));
        if (!this.b.e()) {
            bVar.f().c(2, AdError.MISSING_DEPENDENCIES_ERROR, "ClickHandlerV2: click not permitted until previuos was not handled");
            return;
        }
        Map a2 = a(o2Var);
        wh.a(bVar.H(), "click", a2, 2);
        if (aVar != null) {
            aVar.c();
        }
        int a3 = a(bVar, o2Var);
        String a4 = a(bVar, a3);
        if (a4 != null) {
            a(bVar, context, a4, a3, a2, o2Var, externalNavigationRouter, webFormClient);
        }
        if (this.b.d()) {
            return;
        }
        this.b.c();
    }

    private void b(final String str, final g3 g3Var) {
        o0.d(new Runnable() { // from class: com.my.target.m2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                m2.this.a(str, g3Var);
            }
        });
    }

    private int a(b bVar, o2 o2Var) {
        boolean z = o2Var.b() == 64;
        if (TextUtils.isEmpty(bVar.m())) {
            return (!z || TextUtils.isEmpty(bVar.k())) ? 2 : 1;
        }
        return 0;
    }

    private String a(b bVar, int i) {
        if (i == 0) {
            return bVar.m();
        }
        if (i != 1) {
            return bVar.L();
        }
        return bVar.k();
    }

    private void a(b bVar, Context context, String str, int i, Map map, o2 o2Var, ExternalNavigationRouter externalNavigationRouter, WebFormClient webFormClient) {
        if (i == 0) {
            a(bVar, context, str, map, externalNavigationRouter, o2Var);
        } else if (i == 1) {
            a(bVar, context, str, map, o2Var, externalNavigationRouter, webFormClient);
        } else {
            if (i != 2) {
                return;
            }
            b(bVar, context, str, map, o2Var, externalNavigationRouter, webFormClient);
        }
    }

    private void a(b bVar, Context context, String str, Map map, ExternalNavigationRouter externalNavigationRouter, o2 o2Var) {
        wh.a(bVar.H(), "deeplinkClick", map, 2);
        if (this.c.b(bVar, context, str, o2Var)) {
            bVar.f().a(2, AdError.LOAD_CALLED_WHILE_SHOWING_AD, null, o2.a(o2Var));
        } else {
            a(bVar, context, map, o2Var, externalNavigationRouter);
        }
    }

    private void a(b bVar, Context context, Map map, o2 o2Var, ExternalNavigationRouter externalNavigationRouter) {
        String L;
        int i;
        boolean z = o2Var.b() == 64;
        String k = bVar.k();
        if (!z || k == null || TextUtils.isEmpty(k)) {
            L = bVar.L();
            i = 2;
        } else {
            L = k;
            i = 1;
        }
        if (L != null) {
            a(bVar, context, L, i, map, o2Var, externalNavigationRouter, null);
        } else {
            bVar.f().a(2, 7001, null, o2.a(o2Var));
        }
    }

    private void a(b bVar, Context context, String str, Map map, o2 o2Var, ExternalNavigationRouter externalNavigationRouter, WebFormClient webFormClient) {
        wh.a(bVar.H(), "ctaClick", map, 2);
        b(bVar, context, str, map, o2Var, externalNavigationRouter, webFormClient);
    }

    private boolean a(b bVar, String str, o2 o2Var, ExternalNavigationRouter externalNavigationRouter) {
        if (externalNavigationRouter == null || !externalNavigationRouter.navigate(str, bVar.N())) {
            return false;
        }
        bVar.f().a(2, AdError.LOAD_CALLED_WHILE_SHOWING_AD, null, o2.a(o2Var));
        return true;
    }

    private void a(b bVar, Context context, String str, o2 o2Var) {
        bVar.f().a(2, this.c.c(bVar, context, str, o2Var) ? AdError.LOAD_CALLED_WHILE_SHOWING_AD : 7001, null, o2.a(o2Var));
    }

    private void a(final b bVar, final Context context, final WebFormClient webFormClient, final String str, final o2 o2Var, List list) {
        bVar.f().a(2, AdError.LOAD_CALLED_WHILE_SHOWING_AD, null, o2.a(o2Var));
        if (bVar.T()) {
            this.c.a(bVar, context, webFormClient, str, o2Var, this.a);
        } else {
            this.b.a();
            b(str, new g3() { // from class: com.my.target.m2$$ExternalSyntheticLambda2
                @Override // com.my.target.g3
                public final void accept(Object obj) {
                    m2.this.a(str, bVar, context, webFormClient, o2Var, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, b bVar, Context context, WebFormClient webFormClient, o2 o2Var, String str2) {
        this.c.a(bVar, context, webFormClient, str2 != null ? str2 : str, o2Var, this.a);
        this.b.b();
    }

    private void a(final b bVar, final Context context, final String str, final o2 o2Var, List list) {
        if (bVar.T()) {
            this.c.a(bVar, context, str, o2Var);
            bVar.f().a(2, AdError.LOAD_CALLED_WHILE_SHOWING_AD, null, o2.a(o2Var));
        } else {
            this.b.a();
            b(str, new g3() { // from class: com.my.target.m2$$ExternalSyntheticLambda1
                @Override // com.my.target.g3
                public final void accept(Object obj) {
                    m2.this.a(str, bVar, context, o2Var, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, b bVar, Context context, o2 o2Var, String str2) {
        if (str2 != null) {
            str = str2;
        }
        this.c.a(bVar, context, str, o2Var);
        this.b.b();
    }

    private String a(String str, b bVar, Map map) {
        if (map.isEmpty() || str == null) {
            return str;
        }
        if (!str.equals(bVar.L()) && !str.equals(bVar.k())) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    private Map a(o2 o2Var) {
        HashMap hashMap = new HashMap();
        if (o2Var != null && o2Var.a()) {
            hashMap.put("click_target", String.valueOf(o2Var.c()));
        }
        return hashMap;
    }

    private boolean a(List list, List list2) {
        if (list == null || list2 == null || list.isEmpty() || list2.isEmpty()) {
            return false;
        }
        return !Collections.disjoint(list, new HashSet(list2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final String str, final g3 g3Var) {
        final si.a a2 = d.a(str, 1, MyTargetManager.a());
        o0.e(new Runnable() { // from class: com.my.target.m2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                m2.this.a(g3Var, a2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g3 g3Var, si.a aVar, String str) {
        if (g3Var != null) {
            String a2 = a(aVar);
            if (a2 != null) {
                str = a2;
            }
            g3Var.accept(str);
        }
    }

    private String a(si.a aVar) {
        String str;
        if (aVar == null || !aVar.a() || (str = aVar.b) == null) {
            return null;
        }
        return str;
    }
}
