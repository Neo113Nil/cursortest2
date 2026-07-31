package sg.bigo.ads.cg;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.an.f;
import sg.bigo.ads.an.n;
import sg.bigo.ads.cf.i;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes.dex */
public class b implements sg.bigo.ads.an.f {
    public C1863b a;
    public C1863b b;
    public int c;
    private final String d;
    private final String e;
    private Map<a, C1863b> f;
    private Map<a, List<C1863b>> g;
    private int h = 3;
    private Map<a, C1863b> i = b();
    private Map<a, List<C1863b>> j;

    static class a implements sg.bigo.ads.an.f {
        private static final f.a<a> c = new f.a<a>() { // from class: sg.bigo.ads.cg.b.a.1
            @Override // sg.bigo.ads.an.f.a
            public final /* synthetic */ a a() {
                return new a("", 0);
            }
        };
        public String a;
        public int b;

        protected a(String str, int i) {
            this.a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
            this.b = i;
        }

        @Override // sg.bigo.ads.an.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }

        @Override // sg.bigo.ads.an.f
        public final void b(@NonNull Parcel parcel) {
            this.a = n.a(parcel, "");
            this.b = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.a + "_" + this.b).hashCode();
        }

        @NonNull
        public final String toString() {
            return super.toString();
        }
    }

    /* renamed from: sg.bigo.ads.cg.b$b, reason: collision with other inner class name */
    public static class C1863b extends i implements sg.bigo.ads.an.f {
        private static final f.a<C1863b> e = new f.a<C1863b>() { // from class: sg.bigo.ads.cg.b.b.1
            @Override // sg.bigo.ads.an.f.a
            public final /* synthetic */ C1863b a() {
                return new C1863b("", "", 0);
            }
        };
        boolean d;
        private int f;
        private long g;
        private int h;

        protected C1863b(String str, String str2, int i) {
            super(str, str2, i);
            this.d = true;
            this.f = 0;
            this.g = 0L;
            this.h = 0;
        }

        static /* synthetic */ int c(C1863b c1863b) {
            c1863b.h = 0;
            return 0;
        }

        static /* synthetic */ int e(C1863b c1863b) {
            int i = c1863b.f;
            c1863b.f = i + 1;
            return i;
        }

        static /* synthetic */ int f(C1863b c1863b) {
            c1863b.f = 0;
            return 0;
        }

        static /* synthetic */ int g(C1863b c1863b) {
            int i = c1863b.h;
            c1863b.h = i + 1;
            return i;
        }

        @Override // sg.bigo.ads.an.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeInt(this.c);
            n.a(parcel, this.d);
            parcel.writeString(this.b);
            parcel.writeInt(this.f);
            parcel.writeLong(this.g);
            parcel.writeInt(this.h);
        }

        public final void a(String str) {
            this.b = str;
        }

        @Override // sg.bigo.ads.an.f
        public final void b(@NonNull Parcel parcel) {
            this.a = n.a(parcel, "");
            this.c = n.a(parcel, 1);
            this.d = n.b(parcel, true);
            this.b = n.a(parcel, "");
            this.f = n.a(parcel, 0);
            this.g = n.a(parcel, 0L);
            this.h = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof i) {
                return TextUtils.equals(this.a, ((i) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }
    }

    public b(@NonNull String str, @Nullable String str2) {
        this.d = str;
        this.e = str2;
    }

    @NonNull
    private static List<a> a(@NonNull a aVar) {
        ArrayList arrayList = new ArrayList();
        a aVar2 = new a("all", 0);
        if (aVar2.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar2);
        a aVar3 = new a("all", aVar.b);
        if (aVar3.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar3);
        a aVar4 = new a(aVar.a, 0);
        if (aVar4.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar4);
        arrayList.add(0, aVar);
        return arrayList;
    }

    @Nullable
    private static C1863b a(Map<a, C1863b> map, a aVar) {
        if (!l.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1863b c1863b = map.get(it.next());
                if (a(c1863b)) {
                    return c1863b;
                }
            }
        }
        return null;
    }

    @Nullable
    private C1863b a(a aVar, boolean z) {
        C1863b a2 = a(this.f, aVar);
        if (!a(a2)) {
            a2 = b(this.g, aVar);
            if (!a(a2)) {
                a2 = a(this.i, aVar);
                if (!a(a2)) {
                    a2 = b(this.j, aVar);
                    a(a2);
                }
            }
        }
        Objects.toString(aVar);
        Objects.toString(this.b);
        if (a(a2)) {
            return a2;
        }
        return null;
    }

    private void a(Map<a, C1863b> map, Map<a, List<C1863b>> map2, String str, int i) {
        C1863b value;
        C1863b c1863b;
        synchronized (this) {
            try {
                if (!l.a(this.f) && !l.a(map)) {
                    for (Map.Entry<a, C1863b> entry : this.f.entrySet()) {
                        a key = entry.getKey();
                        if (key != null && (value = entry.getValue()) != null && (c1863b = map.get(key)) != null && value.equals(c1863b)) {
                            value.a(c1863b.b());
                        }
                    }
                }
                if (!l.a(this.g) && !l.a(map2)) {
                    for (Map.Entry<a, List<C1863b>> entry2 : this.g.entrySet()) {
                        a key2 = entry2.getKey();
                        if (key2 != null) {
                            List<C1863b> value2 = entry2.getValue();
                            if (!l.a((Collection) value2)) {
                                List<C1863b> list = map2.get(key2);
                                if (!l.a((Collection) list)) {
                                    for (C1863b c1863b2 : value2) {
                                        if (c1863b2 != null) {
                                            Iterator<C1863b> it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    C1863b next = it.next();
                                                    if (c1863b2.equals(next)) {
                                                        c1863b2.a(next.b());
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C1863b c1863b3 = this.b;
                if (c1863b3 != null) {
                    if (c1863b3.d() == 1) {
                        C1863b c1863b4 = this.f.get(new a(str, i));
                        if (this.b.equals(c1863b4)) {
                            this.b.a(c1863b4.b());
                        }
                    } else if (this.b.d() == 2) {
                        List<C1863b> list2 = this.g.get(new a(str, i));
                        if (!l.a((Collection) list2)) {
                            Iterator<C1863b> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C1863b next2 = it2.next();
                                if (this.b.equals(next2)) {
                                    this.b.a(next2.b());
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean a(C1863b c1863b) {
        return c1863b != null && c1863b.d;
    }

    @NonNull
    private Map<a, C1863b> b() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.d)) {
            hashMap.put(new a("all", 0), new C1863b(this.d, "", 0));
        }
        if (!TextUtils.isEmpty(this.e)) {
            hashMap.put(new a("ru", 0), new C1863b(this.e, "", 0));
        }
        return hashMap;
    }

    @Nullable
    private C1863b b(Map<a, List<C1863b>> map, a aVar) {
        if (!l.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1863b c1863b = (C1863b) l.a(l.a(map.get(it.next()), new Comparable<C1863b>() { // from class: sg.bigo.ads.cg.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C1863b c1863b2) {
                        C1863b c1863b3 = c1863b2;
                        return (c1863b3 == null || !c1863b3.d) ? 0 : 1;
                    }
                }));
                if (a(c1863b)) {
                    return c1863b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<String, Integer> a(j jVar) {
        synchronized (this) {
            try {
                if (l.a(this.f)) {
                    return null;
                }
                if (jVar == null) {
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<Map.Entry<a, C1863b>> it = this.f.entrySet().iterator();
                while (it.hasNext()) {
                    C1863b value = it.next().getValue();
                    if (!value.d) {
                        if (value.f % jVar.y() == 0) {
                            C1863b.c(value);
                            if (value.g != 0) {
                                if (Math.round(Math.abs(currentTimeMillis - value.g) / 8.64E7f) > jVar.A()) {
                                }
                                value = null;
                            }
                            if (value != null) {
                                value.g = currentTimeMillis;
                                C1863b.e(value);
                                return new Pair<>(value.a(), Integer.valueOf(value.f));
                            }
                        } else {
                            if (Math.round(Math.abs(currentTimeMillis - value.g) / 60000.0f) > jVar.z()) {
                                if (value != null) {
                                }
                            }
                            value = null;
                            if (value != null) {
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public final sg.bigo.ads.cf.d a(String str, int i) {
        boolean z;
        synchronized (this) {
            try {
                C1863b c1863b = this.b;
                if (c1863b != null && this.c < this.h) {
                    return new sg.bigo.ads.cf.d(c1863b, false, false);
                }
                a aVar = new a(str, i);
                C1863b a2 = a(aVar, false);
                if (a(a2)) {
                    z = false;
                } else {
                    a();
                    a2 = a(aVar, true);
                    z = true;
                }
                if (a(a2)) {
                    a2.d = false;
                    this.a = this.b;
                    this.b = new C1863b(a2.a(), a2.b(), a2.d());
                    this.c = 0;
                }
                if (this.b == null) {
                    this.b = new C1863b(this.d, "", 0);
                }
                return new sg.bigo.ads.cf.d(this.b, z, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Map<a, C1863b> map = this.f;
        if (map != null) {
            Iterator<Map.Entry<a, C1863b>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                C1863b value = it.next().getValue();
                if (value != null) {
                    value.d = true;
                }
            }
        }
        Map<a, List<C1863b>> map2 = this.g;
        if (map2 != null) {
            Iterator<Map.Entry<a, List<C1863b>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                List<C1863b> value2 = it2.next().getValue();
                if (!l.a((Collection) value2)) {
                    Iterator<C1863b> it3 = value2.iterator();
                    while (it3.hasNext()) {
                        it3.next().d = true;
                    }
                }
            }
        }
        Map<a, List<C1863b>> map3 = this.j;
        if (map3 != null) {
            Iterator<Map.Entry<a, List<C1863b>>> it4 = map3.entrySet().iterator();
            while (it4.hasNext()) {
                List<C1863b> value3 = it4.next().getValue();
                if (!l.a((Collection) value3)) {
                    Iterator<C1863b> it5 = value3.iterator();
                    while (it5.hasNext()) {
                        it5.next().d = true;
                    }
                }
            }
        }
        Map<a, C1863b> map4 = this.i;
        if (map4 != null) {
            Iterator<Map.Entry<a, C1863b>> it6 = map4.entrySet().iterator();
            while (it6.hasNext()) {
                C1863b value4 = it6.next().getValue();
                if (value4 != null) {
                    value4.d = true;
                }
            }
        }
        this.a = this.b;
        this.b = null;
        this.c = 0;
    }

    @Override // sg.bigo.ads.an.f
    @CallSuper
    public void a(@NonNull Parcel parcel) {
        synchronized (this) {
            n.a(parcel, this.f);
            n.b(parcel, this.g);
            parcel.writeInt(this.h);
            n.a(parcel, this.i);
            n.b(parcel, this.j);
            n.a(parcel, this.a);
            n.a(parcel, this.b);
            parcel.writeInt(this.c);
        }
    }

    public void a(@NonNull JSONObject jSONObject, boolean z, String str, int i) {
        synchronized (this) {
            try {
                HashMap hashMap = new HashMap();
                JSONArray optJSONArray = jSONObject.optJSONArray("country_hosts");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("host", "");
                            if (sg.bigo.ads.common.utils.c.a(optString)) {
                                hashMap.put(new a(optJSONObject.optString("country", "all"), optJSONObject.optInt("app_flag", 0)), new C1863b(optString, optJSONObject.optString("domain_front", ""), 1));
                            }
                        }
                    }
                }
                HashMap hashMap2 = new HashMap();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("backup_hosts");
                if (optJSONArray2 != null) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                        if (optJSONObject2 != null) {
                            a aVar = new a(optJSONObject2.optString("country", "all"), optJSONObject2.optInt("app_flag", 0));
                            List<C1863b> list = hashMap2.get(aVar);
                            if (list == null) {
                                list = new ArrayList<>();
                                hashMap2.put(aVar, list);
                            }
                            String optString2 = optJSONObject2.optString("domain_front", "");
                            JSONArray optJSONArray3 = optJSONObject2.optJSONArray("hosts");
                            if (optJSONArray3 != null) {
                                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                    String optString3 = optJSONArray3.optString(i4, "");
                                    if (sg.bigo.ads.common.utils.c.a(optString3)) {
                                        C1863b c1863b = new C1863b(optString3, optString2, 2);
                                        if (!list.contains(c1863b)) {
                                            list.add(c1863b);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z) {
                    a(hashMap, hashMap2, str, i);
                } else {
                    int optInt = jSONObject.optInt("threshold", 3);
                    this.f = hashMap;
                    this.g = hashMap2;
                    this.h = optInt;
                    this.j = new HashMap();
                    this.i = b();
                    this.a = this.b;
                    this.b = null;
                    this.c = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            try {
                if (!sg.bigo.ads.common.utils.c.a(str2)) {
                    return false;
                }
                a aVar = new a(str, 0);
                if (this.j == null) {
                    this.j = new HashMap();
                }
                List<C1863b> list = this.j.get(aVar);
                if (list == null) {
                    list = new ArrayList<>();
                    this.j.put(aVar, list);
                }
                C1863b c1863b = new C1863b(str2, "", 3);
                if (list.contains(c1863b)) {
                    return false;
                }
                list.add(c1863b);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x003d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0187, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, String str2, int i, j jVar, boolean z) {
        Map<a, C1863b> map;
        C1863b c1863b;
        Map<a, List<C1863b>> map2;
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(str) && (map = this.f) != null && jVar != null) {
                    Iterator<Map.Entry<a, C1863b>> it = map.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        c1863b = it.next().getValue();
                        if (TextUtils.equals(c1863b.a(), str)) {
                            if (z) {
                                C1863b.c(c1863b);
                                C1863b.f(c1863b);
                                break;
                            }
                            C1863b.g(c1863b);
                            if (c1863b.h != 0 && c1863b.h % jVar.y() == 0) {
                            }
                        }
                    }
                    c1863b = null;
                    if (c1863b == null) {
                        return false;
                    }
                    C1863b.c(c1863b);
                    C1863b.f(c1863b);
                    C1863b a2 = a(this.f, new a(str2, i));
                    if (a2 != null) {
                        c1863b = a2;
                    }
                    C1863b c1863b2 = this.b;
                    if (c1863b2 != null) {
                        synchronized (this) {
                            ArrayList arrayList = new ArrayList();
                            int d = c1863b2.d();
                            if (d == 0) {
                                Map<a, C1863b> map3 = this.i;
                                if (map3 != null) {
                                    for (C1863b c1863b3 : map3.values()) {
                                        if (c1863b3 != null && TextUtils.equals(c1863b3.a(), c1863b2.a())) {
                                            arrayList.add(c1863b3);
                                        }
                                    }
                                }
                            } else if (d == 1) {
                                Map<a, C1863b> map4 = this.f;
                                if (map4 != null) {
                                    for (C1863b c1863b4 : map4.values()) {
                                        if (c1863b4 != null && TextUtils.equals(c1863b4.a(), c1863b2.a())) {
                                            arrayList.add(c1863b4);
                                        }
                                    }
                                }
                            } else if (d == 2) {
                                Map<a, List<C1863b>> map5 = this.g;
                                if (map5 != null) {
                                    Iterator<List<C1863b>> it2 = map5.values().iterator();
                                    while (it2.hasNext()) {
                                        for (C1863b c1863b5 : it2.next()) {
                                            if (c1863b5 != null && TextUtils.equals(c1863b5.a(), c1863b2.a())) {
                                                arrayList.add(c1863b5);
                                            }
                                        }
                                    }
                                }
                            } else if (d == 3 && (map2 = this.j) != null) {
                                Iterator<List<C1863b>> it3 = map2.values().iterator();
                                while (it3.hasNext()) {
                                    for (C1863b c1863b6 : it3.next()) {
                                        if (c1863b6 != null && TextUtils.equals(c1863b6.a(), c1863b2.a())) {
                                            arrayList.add(c1863b6);
                                        }
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    ((C1863b) it4.next()).d = true;
                                }
                            }
                        }
                    }
                    this.a = this.b;
                    this.b = c1863b;
                    this.c = 0;
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // sg.bigo.ads.an.f
    @CallSuper
    public void b(@NonNull Parcel parcel) {
        synchronized (this) {
            try {
                this.f = n.a(parcel, a.c, C1863b.e);
                this.g = n.b(parcel, a.c, C1863b.e);
                this.h = n.a(parcel, 3);
                Map a2 = n.a(parcel, a.c, C1863b.e);
                this.j = n.b(parcel, a.c, C1863b.e);
                this.a = (C1863b) n.b(parcel, C1863b.e);
                this.b = (C1863b) n.b(parcel, C1863b.e);
                this.c = n.a(parcel, 0);
                this.i = b();
                HashSet hashSet = new HashSet();
                for (C1863b c1863b : this.i.values()) {
                    hashSet.add(c1863b.a());
                    if (!l.a(a2)) {
                        for (C1863b c1863b2 : a2.values()) {
                            if (TextUtils.equals(c1863b.a(), c1863b2.a())) {
                                c1863b.d = c1863b2.d;
                            }
                        }
                    }
                }
                C1863b c1863b3 = this.b;
                if (c1863b3 != null && c1863b3.d() == 0 && !hashSet.contains(this.b.a())) {
                    this.a = this.b;
                    this.b = null;
                    this.c = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
