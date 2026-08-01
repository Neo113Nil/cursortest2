package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i80 {
    public static final Pattern m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern n = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final lu0 d;
    public final lu0 e;
    public final u10 f;
    public boolean g;
    public final u10 h;
    public final u10 i;
    public final u10 j;
    public final lu0 k;
    public final boolean l;

    public i80(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.d = new lu0(new g80(this, 6));
        this.e = new lu0(new g80(this, 4));
        g80 g80Var = new g80(this, 7);
        w10 w10Var = w10.d;
        this.f = x40.H(w10Var, g80Var);
        this.h = x40.H(w10Var, new g80(this, 1 == true ? 1 : 0));
        this.i = x40.H(w10Var, new g80(this, 0));
        this.j = x40.H(w10Var, new g80(this, 3));
        this.k = new lu0(new g80(this, 2));
        new lu0(new g80(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        a(str.substring(0, matcher.start()), arrayList, sb);
        this.l = (tt0.t(sb, ".*") || tt0.t(sb, "([^/]+?)")) ? false : true;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        this.c = tt0.y(sb.toString(), ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = n.matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            arrayList.add(group);
            if (matcher.start() > i) {
                sb.append(Pattern.quote(str.substring(i, matcher.start())));
            }
            sb.append("([^/]*?|)");
            i = matcher.end();
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.a).getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(pathSegments);
        linkedHashSet.retainAll(pathSegments2);
        return linkedHashSet.size();
    }

    public final ArrayList c() {
        Collection values = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ee.a0(arrayList, ((f80) it.next()).b);
        }
        return zd.l0(zd.l0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        uri.getClass();
        linkedHashMap.getClass();
        Pattern pattern = (Pattern) this.d.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (e(matcher, bundle, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.k.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(ae.Y(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            px0.V();
                            throw null;
                        }
                        String str = (String) obj;
                        String decode = Uri.decode(matcher2.group(i2));
                        if (linkedHashMap.get(str) != null) {
                            g8.q();
                            return null;
                        }
                        try {
                            decode.getClass();
                            bundle.putString(str, decode);
                            arrayList.add(ky0.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (mz.K(linkedHashMap, new h80(bundle, 0)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(ae.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                px0.V();
                throw null;
            }
            String str = (String) obj;
            String decode = Uri.decode(matcher.group(i3));
            if (map.get(str) != null) {
                g8.q();
                return false;
            }
            try {
                decode.getClass();
                bundle.putString(str, decode);
                arrayList2.add(ky0.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i80)) {
            return false;
        }
        return this.a.equals(((i80) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        ky0 ky0Var;
        String query;
        for (Map.Entry entry : ((Map) this.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            f80 f80Var = (f80) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = px0.H(query);
            }
            queryParameters.getClass();
            ky0 ky0Var2 = ky0.a;
            int i = 0;
            Bundle r = x40.r(new pd0[0]);
            ArrayList arrayList = f80Var.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (map.get((String) obj) != null) {
                    g8.q();
                    return false;
                }
            }
            for (String str2 : queryParameters) {
                String str3 = f80Var.a;
                Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList2 = f80Var.b;
                ArrayList arrayList3 = new ArrayList(ae.Y(arrayList2, 10));
                int size2 = arrayList2.size();
                int i3 = i;
                int i4 = i3;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    ?? r18 = i;
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        px0.V();
                        throw null;
                    }
                    String str4 = (String) obj2;
                    String group = matcher.group(i5);
                    if (group == null) {
                        group = "";
                    }
                    String str5 = group;
                    if (map.get(str4) != null) {
                        g8.q();
                        return r18;
                    }
                    if (r.containsKey(str4)) {
                        ky0Var = Boolean.valueOf(!r.containsKey(str4));
                        arrayList3.add(ky0Var);
                        i4 = i5;
                        i = r18 == true ? 1 : 0;
                    } else {
                        r.putString(str4, str5);
                        ky0Var = ky0Var2;
                        arrayList3.add(ky0Var);
                        i4 = i5;
                        i = r18 == true ? 1 : 0;
                    }
                }
            }
            bundle.putAll(r);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
