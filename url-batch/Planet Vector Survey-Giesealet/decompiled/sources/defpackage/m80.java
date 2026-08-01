package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class m80 {
    public static final /* synthetic */ int l = 0;
    public final String d;
    public p80 e;
    public final ArrayList f;
    public final ps0 g;
    public final LinkedHashMap h;
    public int i;
    public String j;
    public lu0 k;

    static {
        new LinkedHashMap();
    }

    public m80(p90 p90Var) {
        p90Var.getClass();
        LinkedHashMap linkedHashMap = q90.b;
        this.d = d31.x(p90Var.getClass());
        this.f = new ArrayList();
        this.g = new ps0();
        this.h = new LinkedHashMap();
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.h;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            g8.q();
            return null;
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                g8.q();
                return null;
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (defpackage.mz.K(r3, new defpackage.h80(r15, 1)).isEmpty() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k80 b(t7 t7Var) {
        Bundle bundle;
        int i;
        boolean z;
        m80 m80Var = this;
        ArrayList arrayList = m80Var.f;
        Bundle bundle2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        k80 k80Var = null;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            i80 i80Var = (i80) arrayList.get(i2);
            Uri uri = (Uri) t7Var.e;
            LinkedHashMap linkedHashMap = m80Var.h;
            Bundle d = uri != null ? i80Var.d(uri, linkedHashMap) : bundle2;
            int b = i80Var.b(uri);
            String str = (String) t7Var.f;
            if (str == null || !str.equals(bundle2)) {
                bundle = d;
                i = b;
                z = false;
            } else {
                bundle = d;
                i = b;
                z = true;
            }
            if (bundle == null) {
                if (z) {
                    linkedHashMap.getClass();
                    Bundle bundle3 = new Bundle();
                    if (uri != null) {
                        Pattern pattern = (Pattern) i80Var.d.getValue();
                        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            i80Var.e(matcher, bundle3, linkedHashMap);
                            if (((Boolean) i80Var.e.getValue()).booleanValue()) {
                                i80Var.f(uri, bundle3, linkedHashMap);
                            }
                        }
                    }
                }
                bundle2 = null;
                m80Var = this;
                i2 = i3;
            }
            k80 k80Var2 = new k80(m80Var, bundle, i80Var.l, i, z);
            if (k80Var == null || k80Var2.compareTo(k80Var) > 0) {
                bundle2 = null;
                m80Var = this;
                k80Var = k80Var2;
                i2 = i3;
            }
            bundle2 = null;
            m80Var = this;
            i2 = i3;
        }
        return k80Var;
    }

    public final k80 c(String str) {
        i80 i80Var;
        str.getClass();
        lu0 lu0Var = this.k;
        if (lu0Var == null || (i80Var = (i80) lu0Var.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle d = i80Var.d(parse, this.h);
        if (d == null) {
            return null;
        }
        return new k80(this, d, i80Var.l, i80Var.b(parse), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        LinkedHashMap linkedHashMap;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof m80)) {
                m80 m80Var = (m80) obj;
                ps0 ps0Var = m80Var.g;
                LinkedHashMap linkedHashMap2 = m80Var.h;
                boolean l2 = nz.l(this.f, m80Var.f);
                ps0 ps0Var2 = this.g;
                if (ps0Var2.e() == ps0Var.e()) {
                    Iterator it = ((ti) kq0.y(new qs0(ps0Var2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!nz.l(ps0Var2.b(intValue), ps0Var.b(intValue))) {
                        }
                    }
                    z = true;
                    linkedHashMap = this.h;
                    if (linkedHashMap.size() == linkedHashMap2.size()) {
                        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            if (linkedHashMap2.containsKey(entry.getKey()) && nz.l(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (this.i == m80Var.i || !nz.l(this.j, m80Var.j) || !l2 || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (this.i == m80Var.i) {
                    }
                }
                z = false;
                linkedHashMap = this.h;
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                }
                z2 = false;
                if (this.i == m80Var.i) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.i * 31;
        String str = this.j;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((i80) obj).a.hashCode() + (hashCode * 31)) * 961;
        }
        ps0 ps0Var = this.g;
        ps0Var.getClass();
        if (ps0Var.e() > 0) {
            ps0Var.f(0).getClass();
            g8.q();
            return 0;
        }
        LinkedHashMap linkedHashMap = this.h;
        for (String str2 : linkedHashMap.keySet()) {
            int hashCode2 = (str2.hashCode() + (hashCode * 31)) * 31;
            Object obj2 = linkedHashMap.get(str2);
            hashCode = (obj2 != null ? obj2.hashCode() : 0) + hashCode2;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.i));
        sb.append(")");
        String str = this.j;
        if (str != null && !tt0.w(str)) {
            sb.append(" route=");
            sb.append(this.j);
        }
        return sb.toString();
    }
}
