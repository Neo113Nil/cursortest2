package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class g80 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ i80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g80(i80 i80Var, int i) {
        super(0);
        this.e = i;
        this.f = i80Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        List list;
        int i = this.e;
        i80 i80Var = this.f;
        switch (i) {
            case 0:
                pd0 pd0Var = (pd0) i80Var.h.getValue();
                return (pd0Var == null || (list = (List) pd0Var.d) == null) ? new ArrayList() : list;
            case 1:
                String str = i80Var.a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                fragment.getClass();
                i80.a(fragment, arrayList, sb);
                return new pd0(arrayList, sb.toString());
            case 2:
                String str2 = (String) i80Var.j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                pd0 pd0Var2 = (pd0) i80Var.h.getValue();
                if (pd0Var2 != null) {
                    return (String) pd0Var2.e;
                }
                return null;
            case 4:
                return Boolean.valueOf(Uri.parse(i80Var.a).getQuery() != null);
            case 5:
                return null;
            case 6:
                String str3 = i80Var.c;
                if (str3 != null) {
                    return Pattern.compile(str3, 2);
                }
                return null;
            default:
                String str4 = i80Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) i80Var.e.getValue()).booleanValue()) {
                    Uri parse = Uri.parse(str4);
                    for (String str5 : parse.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str5);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str6 = (String) zd.d0(queryParameters);
                        if (str6 == null) {
                            i80Var.g = true;
                            str6 = str5;
                        }
                        Matcher matcher = i80.n.matcher(str6);
                        f80 f80Var = new f80();
                        int i2 = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            group.getClass();
                            f80Var.b.add(group);
                            str6.getClass();
                            sb2.append(Pattern.quote(str6.substring(i2, matcher.start())));
                            sb2.append("(.+?)?");
                            i2 = matcher.end();
                        }
                        if (i2 < str6.length()) {
                            sb2.append(Pattern.quote(str6.substring(i2)));
                        }
                        f80Var.a = tt0.y(sb2.toString(), ".*", "\\E.*\\Q");
                        str5.getClass();
                        linkedHashMap.put(str5, f80Var);
                    }
                }
                return linkedHashMap;
        }
    }
}
