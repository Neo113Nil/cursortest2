package com.mbridge.msdk.config.component.style;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.mbridge.msdk.config.component.animation.b;
import com.mbridge.msdk.config.component.animation.g;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class StyleCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {
    private final b h = new b();
    private final com.mbridge.msdk.config.component.animation.d i = new com.mbridge.msdk.config.component.animation.d();
    private com.mbridge.msdk.config.component.style.model.b j;
    private XMLView k;
    private com.mbridge.msdk.config.component.style.inter.a l;

    private void c(View view) {
        if (view != null) {
            view.setVisibility(0);
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("view_tag"), view.getTag());
            a(a("903008", (Map<String, Object>) hashMap));
        }
    }

    private void g() {
        XMLView xMLView = this.k;
        if (xMLView != null) {
            this.i.a(xMLView);
            HashMap hashMap = new HashMap();
            if (e() != null) {
                e().removeView(this.k);
            }
            Map<String, Object> k = k();
            if (!k.isEmpty()) {
                hashMap.putAll(k);
            }
            a(a("903005", (Map<String, Object>) hashMap));
            this.k = null;
        }
        Object b = this.d.b(c.c("sdk_context"));
        if (b instanceof Map) {
            Object obj = ((Map) b).get("lifecycleListeners");
            if (obj instanceof List) {
                ((List) obj).clear();
            }
        }
    }

    private void h() {
        String a2 = this.j.a();
        if (TextUtils.isEmpty(a2)) {
            a("2000005", "Component command is null");
            return;
        }
        try {
            if (a2.equals(c.c("319"))) {
                q();
            } else if (a2.equals(c.c("325"))) {
                l();
            } else if (a2.equals(c.c("326"))) {
                a(8);
            } else if (a2.equals(c.c("307"))) {
                g();
            }
        } catch (Exception e) {
            q0.b("StyleCpt", "Error in doRenderTemplateAction", e);
            a("", "Command execute error " + e.getMessage());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.style.model.b bVar = this.j;
        if (bVar == null || bVar.e() == null) {
            return;
        }
        for (com.mbridge.msdk.config.component.style.model.a aVar : this.j.e()) {
            if (aVar != null) {
                String a2 = aVar.a();
                String h = aVar.h();
                if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(h)) {
                    View c = c(h);
                    if (c == null) {
                        q0.b("StyleCpt", "Widget view not found: " + h);
                    } else {
                        try {
                            if (a2.equals(c.c("319"))) {
                                c(c);
                            } else if (a2.equals(c.c("325"))) {
                                a(c);
                            } else if (a2.equals(c.c("328"))) {
                                a(c, aVar);
                            } else if (a2.equals(c.c("327"))) {
                                b(c);
                            } else if ("animate".equalsIgnoreCase(a2)) {
                                b(c, aVar);
                            }
                            d(c, aVar);
                            c(c, aVar);
                        } catch (Exception e) {
                            q0.b("StyleCpt", "Error in doWidgetViewAction", e);
                        }
                    }
                }
            }
        }
    }

    private void j() {
        com.mbridge.msdk.config.component.style.model.b bVar = this.j;
        if (bVar == null || TextUtils.isEmpty(bVar.d())) {
            return;
        }
        this.k = com.mbridge.msdk.config.dynamic.utils.d.a(e(), SameMD5.getMD5(this.j.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> k() {
        String f;
        List<com.mbridge.msdk.config.component.style.model.a> e = this.j.e();
        if (e != null && !e.isEmpty()) {
            for (com.mbridge.msdk.config.component.style.model.a aVar : e) {
                if (aVar != null && (f = aVar.f()) != null) {
                    f.equals("1");
                }
            }
        }
        return com.mbridge.msdk.config.dynamic.utils.d.a((ViewGroup) this.k);
    }

    private void l() {
        XMLView xMLView = this.k;
        if (xMLView == null) {
            return;
        }
        xMLView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        h();
        i();
    }

    private void p() {
        if (this.l != null) {
            return;
        }
        this.l = new a();
    }

    private void q() {
        a(a("903002", (Map<String, Object>) new HashMap()));
        XMLView xMLView = this.k;
        if (xMLView == null) {
            a(0);
        } else if (xMLView.getVisibility() != 0) {
            this.k.setVisibility(0);
        }
        HashMap hashMap = new HashMap();
        Map<String, Object> k = k();
        if (!k.isEmpty()) {
            hashMap.putAll(k);
        }
        a(a("903006", (Map<String, Object>) hashMap));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f = "903001";
        this.j = new com.mbridge.msdk.config.component.style.model.b(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.style.StyleCpt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                StyleCpt.this.m();
            }
        });
        a("903011", (HashMap<String, Object>) null);
    }

    public void n() {
        a(a("903004", (Map<String, Object>) new HashMap()));
    }

    public void o() {
        a(a("903003", (Map<String, Object>) new HashMap()));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        p();
    }

    private void b(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    private void b(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        g c;
        if (view == null || aVar == null) {
            return;
        }
        String d = aVar.d();
        if (TextUtils.isEmpty(d)) {
            d = aVar.h();
        }
        String c2 = aVar.c();
        Object e = aVar.e();
        if (e instanceof com.mbridge.msdk.config.component.animation.a) {
            com.mbridge.msdk.config.component.animation.a aVar2 = (com.mbridge.msdk.config.component.animation.a) e;
            if (!TextUtils.isEmpty(aVar2.a())) {
                d = aVar2.a();
            }
            c2 = aVar2.b();
        }
        String str = d;
        if (TextUtils.isEmpty(c2)) {
            c2 = "start";
        }
        if (e instanceof g) {
            c = (g) e;
        } else {
            c = e instanceof com.mbridge.msdk.config.component.animation.c ? ((com.mbridge.msdk.config.component.animation.c) e).c() : null;
        }
        g gVar = c;
        if (a(c2, str, gVar != null)) {
            return;
        }
        if (gVar != null) {
            boolean z = "1".equals(aVar.g()) || Boolean.parseBoolean(aVar.g());
            Animator a2 = this.h.a(gVar, view);
            if (a2 == null) {
                return;
            }
            this.i.a(str, gVar, view, a2, z);
            return;
        }
        if (e != null) {
            q0.b("StyleCpt", "Unsupported animationSpec type: " + e.getClass().getName() + ", viewTag=" + aVar.h() + ", animationId=" + str);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.c("116"));
                if (obj2 instanceof String) {
                    String valueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(valueOf)) {
                        return valueOf.equals(this.j.d());
                    }
                }
            }
        }
        return false;
    }

    private void c(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String i = aVar.i();
            if (TextUtils.isEmpty(i)) {
                return;
            }
            String[] d = d(i);
            if (d.length != 2) {
                q0.b("StyleCpt", "Invalid widget location format: " + i);
                return;
            }
            int parseInt = Integer.parseInt(d[0]);
            int parseInt2 = Integer.parseInt(d[1]);
            view.setX(parseInt);
            view.setY(parseInt2);
        } catch (Exception e) {
            q0.b("StyleCpt", "Error relocating widget: " + e.getMessage());
        }
    }

    private void d(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String j = aVar.j();
            if (TextUtils.isEmpty(j)) {
                return;
            }
            String[] d = d(j);
            if (d.length != 2) {
                q0.b("StyleCpt", "Invalid widget size format: " + j);
                return;
            }
            int parseInt = Integer.parseInt(d[0]);
            int parseInt2 = Integer.parseInt(d[1]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = parseInt;
                layoutParams.height = parseInt2;
                view.setLayoutParams(layoutParams);
            }
        } catch (Exception e) {
            q0.b("StyleCpt", "Error resizing widget: " + e.getMessage());
        }
    }

    class a implements com.mbridge.msdk.config.component.style.inter.a {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(String str, Map<String, Object> map) {
            if (TextUtils.isEmpty(str)) {
                q0.b("StyleCpt", "Click tag is empty");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("view_tag"), str);
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(map);
            }
            Map k = StyleCpt.this.k();
            if (!k.isEmpty()) {
                hashMap.put("all_properties", k);
            }
            StyleCpt styleCpt = StyleCpt.this;
            styleCpt.a(styleCpt.a("903010", (Map<String, Object>) hashMap));
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(Map<String, Object> map) {
            if (map != null) {
                StyleCpt styleCpt = StyleCpt.this;
                styleCpt.a(styleCpt.a("903008", map));
            }
        }
    }

    private void a(String str, String str2) {
        q0.b("StyleCpt", str2);
        HashMap hashMap = new HashMap();
        hashMap.put(c.c("reason"), str2);
        hashMap.put(c.c("code"), str);
        if (this.j.e() != null) {
            q0.b("StyleCpt", hashMap.toString());
        } else {
            a(a("903007", (Map<String, Object>) hashMap));
        }
    }

    private void a(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            Object b = aVar.b();
            View view2 = b instanceof View ? (View) b : null;
            if (view2 == null) {
                q0.b("StyleCpt", "Action view is null");
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                viewGroup.addView(view2);
            }
        } catch (Exception e) {
            q0.b("StyleCpt", "Error adding widget: " + e.getMessage());
        }
    }

    private View c(String str) {
        XMLView xMLView = this.k;
        if (xMLView == null) {
            return e().findViewWithTag(str);
        }
        return xMLView.findViewWithTag(str);
    }

    private String[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.replaceAll("[\\[\\]]", "").split(StringUtils.COMMA);
    }

    private boolean a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!"stop".equalsIgnoreCase(str) && !c.c("311").equals(str)) {
            if ("start".equalsIgnoreCase(str) || "animationStart".equalsIgnoreCase(str)) {
                if (z) {
                    return false;
                }
                this.i.d(str2);
                return true;
            }
            if (!"pause".equalsIgnoreCase(str) && !"animationPause".equalsIgnoreCase(str)) {
                if (!"resume".equalsIgnoreCase(str) && !"animationResume".equalsIgnoreCase(str)) {
                    if (!"cancel".equalsIgnoreCase(str) && !"animationCancel".equalsIgnoreCase(str)) {
                        if (!"destroy".equalsIgnoreCase(str) && !"animationDestroy".equalsIgnoreCase(str)) {
                            return false;
                        }
                        this.i.a(str2);
                        return true;
                    }
                    this.i.a(str2, true);
                    return true;
                }
                this.i.c(str2);
                return true;
            }
            this.i.b(str2);
            return true;
        }
        this.i.e(str2);
        return true;
    }

    private void b(int i) {
        XMLView xMLView;
        String d = this.j.d();
        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(this.j.b())) {
            try {
                XMLView xMLView2 = (XMLView) new com.mbridge.msdk.config.dynamic.a().a(this.j.b(), e(), this.d);
                this.k = xMLView2;
                if (xMLView2 == null) {
                    a("2000004", "xml render fail");
                } else {
                    xMLView2.setRenderMap(d);
                    this.k.setXmlViewActionListener(this.l);
                    if (e() != null && (xMLView = this.k) != null) {
                        xMLView.setVisibility(i);
                    }
                }
                return;
            } catch (Exception e) {
                a("2000004", e.getMessage());
                return;
            }
        }
        a("2000001", "Template Url or path is empty");
    }

    private void a(View view) {
        if (view != null) {
            view.setVisibility(4);
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("view_tag"), view.getTag());
            a(a("903009", (Map<String, Object>) hashMap));
        }
    }

    private void a(int i) {
        b(i);
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        str.hashCode();
        if (str.equals("onStop")) {
            o();
        } else if (str.equals(X3.i.u0)) {
            n();
        }
    }
}
