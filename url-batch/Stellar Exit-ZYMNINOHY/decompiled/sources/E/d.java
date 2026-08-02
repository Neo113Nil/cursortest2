package E;

import D.AbstractActivityC0005f;
import android.content.Intent;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0005f f171a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f172b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f173c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f174d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f175e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f176f;

    public d(AbstractActivityC0005f abstractActivityC0005f, androidx.lifecycle.j jVar) {
        new HashSet();
        this.f176f = new HashSet();
        this.f171a = abstractActivityC0005f;
        new HiddenLifecycleReference(jVar);
    }

    public final boolean a(int i2, int i3, Intent intent) {
        Iterator it = new HashSet(this.f173c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((Q.a) it.next()).f361d;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((M.k) hashMap.remove(Integer.valueOf(i2))).c(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }
}
