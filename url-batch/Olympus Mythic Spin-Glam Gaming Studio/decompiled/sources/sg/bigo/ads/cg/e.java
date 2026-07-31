package sg.bigo.ads.cg;

import android.os.Parcel;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.an.n;
import sg.bigo.ads.cf.j;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes14.dex */
public final class e extends g implements sg.bigo.ads.an.f {
    public static final long a = s.d.a(1);
    public static final long b = s.b.a(30);
    private long g;
    private long h;
    private List<a> f = c();
    private long d = a;
    private long e = b;

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("google", "https://drive.google.com/uc?export=download&id=1ms4F7Cn_aInE9oFMMaZEiwMIuMKt1DZc", true));
        return arrayList;
    }

    @Override // sg.bigo.ads.cg.g
    @Nullable
    public final j a(String str) {
        synchronized (this) {
            try {
                if (l.a((Collection) this.f)) {
                    return null;
                }
                a a2 = g.a((List<a>) l.a(this.f, new Comparable<a>() { // from class: sg.bigo.ads.cg.e.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
                        a aVar2 = aVar;
                        return (aVar2 == null || !aVar2.d || aVar2.b) ? 0 : 1;
                    }
                }));
                if (a2 != null) {
                    return a2;
                }
                a a3 = g.a((List<a>) l.a(this.f, new Comparable<a>() { // from class: sg.bigo.ads.cg.e.2
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
                        a aVar2 = aVar;
                        return (aVar2 != null && aVar2.d && aVar2.b) ? 1 : 0;
                    }
                }));
                if (a3 != null) {
                    return a3;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
            n.a(parcel, this.f);
            parcel.writeLong(this.g);
            parcel.writeLong(this.h);
        }
    }

    public final void a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            try {
                long optLong = jSONObject.optLong("suc_interval", a / 1000) * 1000;
                long j = g.c;
                long max = Math.max(optLong, j);
                long max2 = Math.max(jSONObject.optLong("fail_interval", b / 1000) * 1000, j);
                List<a> c = c();
                JSONArray optJSONArray = jSONObject.optJSONArray("urls");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        String optString = optJSONObject.optString("name", "");
                        String optString2 = optJSONObject.optString("url", "");
                        if (URLUtil.isNetworkUrl(optString2)) {
                            c.add(new a(optString, optString2, false));
                        }
                    }
                }
                this.d = max;
                this.e = max2;
                this.f = c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.cg.g
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.h = System.currentTimeMillis();
        }
    }

    public final boolean a() {
        long j = this.g;
        long j2 = this.h;
        if (j == j2) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j > j2 ? Math.abs(currentTimeMillis - this.g) > this.e : Math.abs(currentTimeMillis - this.h) > this.d;
    }

    public final void b() {
        this.g = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (l.a((Collection) this.f)) {
                    return;
                }
                Iterator<a> it = this.f.iterator();
                while (it.hasNext()) {
                    it.next().d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            try {
                this.d = n.a(parcel, a);
                this.e = n.a(parcel, b);
                List<a> a2 = n.a(parcel, a.c);
                this.f = a2;
                if (l.a((Collection) a2)) {
                    this.f = c();
                }
                this.g = n.a(parcel, 0L);
                this.h = n.a(parcel, 0L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
