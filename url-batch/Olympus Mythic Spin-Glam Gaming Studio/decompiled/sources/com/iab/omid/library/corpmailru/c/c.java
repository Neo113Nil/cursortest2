package com.iab.omid.library.corpmailru.c;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.corpmailru.c.a;
import com.iab.omid.library.corpmailru.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class c implements a {
    private final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    @NonNull
    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.corpmailru.b.a a = com.iab.omid.library.corpmailru.b.a.a();
        if (a != null) {
            Collection<com.iab.omid.library.corpmailru.adsession.a> c = a.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            Iterator<com.iab.omid.library.corpmailru.adsession.a> it = c.iterator();
            while (it.hasNext()) {
                View d = it.next().d();
                if (d != null && f.c(d) && (rootView = d.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.corpmailru.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.corpmailru.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.corpmailru.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0287a interfaceC0287a, boolean z) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0287a.a(it.next(), this.a, jSONObject);
        }
    }
}
