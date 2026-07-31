package com.mbridge.msdk.config.component.base;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BaseComponent.java */
/* loaded from: classes13.dex */
public class a {
    public Map<?, ?> a;
    public c b;
    private String c;
    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a d;
    protected boolean e = false;
    protected String f;
    private String g;

    private Map<String, Object> b(String str) {
        Map<?, ?> map = this.a;
        if (map != null && !map.isEmpty()) {
            Object obj = this.a.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("13"));
                if (obj2 instanceof Map) {
                    Object obj3 = ((Map) obj2).get(str);
                    if (obj3 instanceof Map) {
                        Map<String, Object> map2 = (Map) obj3;
                        if (!map2.isEmpty()) {
                            Map<String, Object> a = com.mbridge.msdk.config.component.common.util.c.a(map2, this.d);
                            return !a.isEmpty() ? a : map2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void c() {
        Map<?, ?> map = this.a;
        if (map == null) {
            q0.b("BaseComponent", "Execute config is null");
            return;
        }
        this.c = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c("15")));
        Object obj = this.a.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
        if (!(obj instanceof Map)) {
            q0.b("BaseComponent", "Component config is not instance of Map");
            return;
        }
        Map<String, Object> map2 = (Map) obj;
        b(map2);
        if (map2.containsKey(com.mbridge.msdk.config.component.common.util.c.c("13"))) {
            Object obj2 = map2.get(com.mbridge.msdk.config.component.common.util.c.c("13"));
            if (obj2 instanceof Map) {
                c((Map) obj2);
            } else {
                q0.b("BaseComponent", "Component event is not instance of Map");
            }
        }
    }

    private void d(Map<?, ?> map) {
        Map map2;
        Map map3;
        Map map4;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.a == null) {
            this.a = map;
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            HashMap hashMap2 = new HashMap();
            Map map5 = (Map) map.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
            if ((map5 instanceof Map) && (map4 = (Map) map5.get(com.mbridge.msdk.config.component.common.util.c.c("13"))) != null) {
                hashMap2.putAll(map4);
            }
            if ((map.get(com.mbridge.msdk.config.component.common.util.c.c("13")) instanceof Map) && (map3 = (Map) map.get(com.mbridge.msdk.config.component.common.util.c.c("13"))) != null) {
                hashMap2.putAll(map3);
            }
            HashMap hashMap3 = new HashMap();
            Map map6 = (Map) this.a.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
            if ((map6 instanceof Map) && (map2 = (Map) map6.get(com.mbridge.msdk.config.component.common.util.c.c("13"))) != null) {
                hashMap3.putAll(map2);
            }
            com.mbridge.msdk.config.component.common.util.c.a(hashMap3, hashMap2);
            Object obj = hashMap.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
            if (obj instanceof Map) {
                Map map7 = (Map) obj;
                if (!map7.isEmpty()) {
                    map7.put(com.mbridge.msdk.config.component.common.util.c.c("13"), hashMap3);
                }
            } else {
                HashMap hashMap4 = new HashMap();
                hashMap4.put(com.mbridge.msdk.config.component.common.util.c.c("13"), hashMap3);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("16"), hashMap4);
            }
            this.a = hashMap;
        } catch (Throwable th) {
            q0.b("BaseComponent", th.getMessage(), th);
        }
    }

    public void a() {
    }

    public void a(Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        if (map == null) {
            return;
        }
        this.g = str;
        this.d = aVar;
        d(map);
        b();
        c();
        a();
    }

    protected void b(Map<String, Object> map) {
    }

    protected void c(Map<String, Object> map) {
    }

    public ViewGroup e() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.d;
        if (aVar == null) {
            return null;
        }
        Object b = aVar.b(com.mbridge.msdk.config.component.common.util.c.c("sdk_context"));
        if (!(b instanceof Map)) {
            return null;
        }
        Object obj = ((Map) b).get(com.mbridge.msdk.config.component.common.util.c.c("rootView"));
        if (obj instanceof ViewGroup) {
            return (ViewGroup) obj;
        }
        return null;
    }

    protected void f() {
        a(a(this.f, (Map<String, Object>) new HashMap()));
    }

    protected void a(String str, HashMap<String, Object> hashMap) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(a(str, (Map<String, Object>) hashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void b() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar;
        if (!(this instanceof com.mbridge.msdk.config.component.vc.inter.a) || (aVar = this.d) == null) {
            return;
        }
        try {
            Object b = aVar.b(com.mbridge.msdk.config.component.common.util.c.c("sdk_context"));
            if (b instanceof Map) {
                Map map = (Map) b;
                if (map.containsKey("lifecycleListeners")) {
                    List list = (List) map.get("lifecycleListeners");
                    if (list != null && !list.contains(this)) {
                        list.add((com.mbridge.msdk.config.component.vc.inter.a) this);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((com.mbridge.msdk.config.component.vc.inter.a) this);
                    map.put("lifecycleListeners", arrayList);
                }
            }
        } catch (Throwable th) {
            q0.b("BaseComponent", "Error in addLifecycleListener", th);
        }
    }

    public void a(c cVar) {
        this.b = cVar;
    }

    public void a(b bVar) {
        c cVar;
        if (bVar == null) {
            q0.b("BaseComponent", "baseComponentOut cannot be null");
            return;
        }
        bVar.a(this.c);
        bVar.c(this.g);
        String c = bVar.c();
        if (c != null && !c.isEmpty()) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (bVar.b() != null) {
                hashMap.putAll(bVar.b());
                hashMap2.put("event_gen_data", new HashMap(bVar.b()));
            }
            Map<String, Object> b = b(c);
            if (b != null && !b.isEmpty()) {
                hashMap.putAll(b);
                hashMap2.put("event_replace_data", b);
            }
            bVar.b().clear();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("event_name"), c);
            bVar.b().put(com.mbridge.msdk.config.component.common.util.c.c("50"), hashMap);
            boolean a = a(b, com.mbridge.msdk.config.component.common.util.c.c("17"));
            boolean a2 = a(b, com.mbridge.msdk.config.component.common.util.c.c("19"));
            Map<?, ?> map = this.a;
            if (map != null && !map.isEmpty()) {
                bVar.b().put(com.mbridge.msdk.config.component.common.util.c.c("52"), this.a.get(com.mbridge.msdk.config.component.common.util.c.c("16")));
            }
            if (this.d != null) {
                bVar.b().put(com.mbridge.msdk.config.component.common.util.c.c("51"), this.d.b(com.mbridge.msdk.config.component.common.util.c.c("51")));
                bVar.b().put(com.mbridge.msdk.config.component.common.util.c.c("sdk_context"), this.d.b(com.mbridge.msdk.config.component.common.util.c.c("sdk_context")));
            }
            if (a2) {
                a(bVar, hashMap2);
            }
            if (!a || (cVar = this.b) == null) {
                return;
            }
            cVar.a(bVar);
            return;
        }
        q0.b("BaseComponent", "eventName cannot be null or empty");
    }

    public void d() {
        f();
    }

    private boolean a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return false;
        }
        return String.valueOf(obj).equals("1");
    }

    public b a(String str, Map<String, Object> map) {
        b bVar = new b();
        bVar.b(str);
        if (map == null) {
            map = new HashMap<>();
        }
        bVar.a(map);
        return bVar;
    }

    private void a(b bVar, Map<String, Object> map) {
        try {
            Map<String, Object> a = com.mbridge.msdk.config.component.common.metrics.b.a(bVar, map, this.d);
            if (a.isEmpty()) {
                return;
            }
            com.mbridge.msdk.config.component.common.metrics.a.a().a(a);
        } catch (Throwable th) {
            q0.b("BaseComponent", th.getMessage());
        }
    }

    public void a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("code"), str2);
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str3);
        a(a(str, (Map<String, Object>) hashMap));
    }
}
