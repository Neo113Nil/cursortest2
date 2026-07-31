package com.smaato.sdk.ng.utils.svgparser.utils;

import android.util.Log;
import com.ironsource.B5;
import com.safedk.android.utils.SdksMapping;
import com.smaato.sdk.ng.utils.svgparser.SVGExternalFileResolver;
import com.smaato.sdk.ng.utils.svgparser.utils.SVGBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* loaded from: classes10.dex */
public class CSSParser {
    private d a;
    private Source b;
    private SVGExternalFileResolver c;
    private boolean d;

    public static class Rule {
        final o a;
        final Style b;
        final Source c;

        Rule(o oVar, Style style, Source source) {
            this.a = oVar;
            this.b = style;
            this.c = source;
        }

        public String toString() {
            return this.a + " {...} (src=" + this.c + ")";
        }
    }

    public static class Ruleset {
        private List<Rule> a = null;

        void a(Rule rule) {
            if (this.a == null) {
                this.a = new LinkedList();
            }
            ListIterator<Rule> listIterator = this.a.listIterator();
            while (listIterator.hasNext()) {
                int nextIndex = listIterator.nextIndex();
                if (listIterator.next().a.b > rule.a.b) {
                    this.a.add(nextIndex, rule);
                    return;
                }
            }
            this.a.add(rule);
        }

        public void addAll(Ruleset ruleset) {
            if (ruleset.a == null) {
                return;
            }
            if (this.a == null) {
                this.a = new LinkedList();
            }
            Iterator<Rule> it = ruleset.a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        public List<Rule> getRules() {
            return this.a;
        }

        public boolean isEmpty() {
            List<Rule> list = this.a;
            return list == null || list.isEmpty();
        }

        public void removeFromSource(Source source) {
            List<Rule> list = this.a;
            if (list == null) {
                return;
            }
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().c == source) {
                    it.remove();
                }
            }
        }

        public String toString() {
            if (this.a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator<Rule> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    public enum Source {
        Document,
        RenderOptions
    }

    private static class a {
        public final String a;
        final b b;
        public final String c;

        a(String str, b bVar, String str2) {
            this.a = str;
            this.b = bVar;
            this.c = str2;
        }
    }

    enum b {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    enum c {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum d {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    interface e {
        boolean a(n nVar, SVGBase.E e);
    }

    static class f implements e {
        private final int a;
        private final int b;
        private final boolean c;
        private final boolean d;
        private final String e;

        f(int i, int i2, boolean z, boolean z2, String str) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = str;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.CSSParser.e
        public boolean a(n nVar, SVGBase.E e) {
            int i;
            int i2;
            String a = (this.d && this.e == null) ? e.a() : this.e;
            SVGBase.SvgContainer svgContainer = e.b;
            if (svgContainer != null) {
                Iterator<SVGBase.SvgObject> it = svgContainer.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    SVGBase.E e2 = (SVGBase.E) it.next();
                    if (e2 == e) {
                        i = i2;
                    }
                    if (a == null || e2.a().equals(a)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.c ? i + 1 : i2 - i;
            int i4 = this.a;
            if (i4 == 0) {
                return i3 == this.b;
            }
            int i5 = i3 - this.b;
            return i5 % i4 == 0 && (Integer.signum(i5) == 0 || Integer.signum(i3 - this.b) == Integer.signum(this.a));
        }

        public String toString() {
            String str = this.c ? "" : "last-";
            return this.d ? String.format(Locale.US, "nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.a), Integer.valueOf(this.b), this.e) : String.format(Locale.US, "nth-%schild(%dn%+d)", str, Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    static class g implements e {
        g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.smaato.sdk.ng.utils.svgparser.utils.CSSParser.e
        public boolean a(n nVar, SVGBase.E e) {
            return !(e instanceof SVGBase.SvgContainer) || ((SVGBase.SvgContainer) e).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    enum h {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map<String, h> z = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar != UNSUPPORTED) {
                    z.put(hVar.name().replace('_', '-'), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = z.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    static class j implements e {
        private final String a;

        j(String str) {
            this.a = str;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.CSSParser.e
        public boolean a(n nVar, SVGBase.E e) {
            return false;
        }

        public String toString() {
            return this.a;
        }
    }

    static class k implements e {
        private final boolean a;
        private final String b;

        public k(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.CSSParser.e
        public boolean a(n nVar, SVGBase.E e) {
            int i;
            String a = (this.a && this.b == null) ? e.a() : this.b;
            SVGBase.SvgContainer svgContainer = e.b;
            if (svgContainer != null) {
                Iterator<SVGBase.SvgObject> it = svgContainer.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVGBase.E e2 = (SVGBase.E) it.next();
                    if (a == null || e2.a().equals(a)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public String toString() {
            return this.a ? String.format("only-of-type <%s>", this.b) : "only-child";
        }
    }

    static class l implements e {
        l() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.CSSParser.e
        public boolean a(n nVar, SVGBase.E e) {
            return e.b == null;
        }

        public String toString() {
            return "root";
        }
    }

    static class m implements e {
        m() {
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.CSSParser.e
        public boolean a(n nVar, SVGBase.E e) {
            return nVar != null && e == nVar.a;
        }

        public String toString() {
            return "target";
        }
    }

    static class n {
        SVGBase.E a;

        n() {
        }

        public String toString() {
            SVGBase.E e = this.a;
            return e != null ? String.format("<%s id=\"%s\">", e.a(), this.a.c) : "";
        }
    }

    CSSParser(Source source, SVGExternalFileResolver sVGExternalFileResolver) {
        this(d.screen, source, sVGExternalFileResolver);
    }

    private static List<d> b(CSSTextScanner cSSTextScanner) {
        String nextWord;
        ArrayList arrayList = new ArrayList();
        while (!cSSTextScanner.empty() && (nextWord = cSSTextScanner.nextWord()) != null) {
            try {
                arrayList.add(d.valueOf(nextWord));
            } catch (IllegalArgumentException unused) {
            }
            if (!cSSTextScanner.skipCommaWhitespace()) {
                break;
            }
        }
        return arrayList;
    }

    private Ruleset c(CSSTextScanner cSSTextScanner) {
        Ruleset ruleset = new Ruleset();
        while (!cSSTextScanner.empty()) {
            try {
                if (!cSSTextScanner.consume("<!--") && !cSSTextScanner.consume("-->")) {
                    if (!cSSTextScanner.consume('@')) {
                        if (!b(ruleset, cSSTextScanner)) {
                            break;
                        }
                    } else {
                        a(ruleset, cSSTextScanner);
                    }
                }
            } catch (CSSParseException e2) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e2.getMessage());
                return ruleset;
            }
        }
        return ruleset;
    }

    private void d(CSSTextScanner cSSTextScanner) {
        int i2 = 0;
        while (!cSSTextScanner.empty()) {
            int intValue = cSSTextScanner.d().intValue();
            if (intValue == 59 && i2 == 0) {
                return;
            }
            if (intValue == 123) {
                i2++;
            } else if (intValue == 125 && i2 > 0 && i2 - 1 == 0) {
                return;
            }
        }
    }

    public static List<String> parseClassAttribute(String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        ArrayList arrayList = null;
        while (!cSSTextScanner.empty()) {
            String nextToken = cSSTextScanner.nextToken();
            if (nextToken != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(nextToken);
                cSSTextScanner.skipWhitespace();
            }
        }
        return arrayList;
    }

    Ruleset a(String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        cSSTextScanner.skipWhitespace();
        return c(cSSTextScanner);
    }

    static class i implements e {
        private final List<o> a;

        i(List<o> list) {
            this.a = list;
        }

        @Override // com.smaato.sdk.ng.utils.svgparser.utils.CSSParser.e
        public boolean a(n nVar, SVGBase.E e) {
            Iterator<o> it = this.a.iterator();
            while (it.hasNext()) {
                if (CSSParser.a(nVar, it.next(), e)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return "not(" + this.a + ")";
        }

        int a() {
            Iterator<o> it = this.a.iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i2 = it.next().b;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }
    }

    CSSParser(d dVar, Source source, SVGExternalFileResolver sVGExternalFileResolver) {
        this.d = false;
        this.a = dVar;
        this.b = source;
        this.c = sVGExternalFileResolver;
    }

    static class o {
        List<p> a = null;
        int b = 0;

        o() {
        }

        void a(p pVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add(pVar);
        }

        void b() {
            this.b++;
        }

        void c() {
            this.b += 1000000;
        }

        boolean d() {
            List<p> list = this.a;
            return list == null || list.isEmpty();
        }

        int e() {
            List<p> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator<p> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
            return sb.toString();
        }

        p a(int i) {
            return this.a.get(i);
        }

        void a() {
            this.b += 1000;
        }
    }

    static class p {
        c a;
        String b;
        List<a> c = null;
        List<e> d = null;

        p(c cVar, String str) {
            this.a = cVar == null ? c.DESCENDANT : cVar;
            this.b = str;
        }

        void a(String str, b bVar, String str2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new a(str, bVar, str2));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            c cVar = this.a;
            if (cVar == c.CHILD) {
                sb.append("> ");
            } else if (cVar == c.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = Marker.ANY_MARKER;
            }
            sb.append(str);
            List<a> list = this.c;
            if (list != null) {
                for (a aVar : list) {
                    sb.append('[');
                    sb.append(aVar.a);
                    int ordinal = aVar.b.ordinal();
                    if (ordinal == 1) {
                        sb.append(B5.U);
                        sb.append(aVar.c);
                    } else if (ordinal == 2) {
                        sb.append("~=");
                        sb.append(aVar.c);
                    } else if (ordinal == 3) {
                        sb.append("|=");
                        sb.append(aVar.c);
                    }
                    sb.append(']');
                }
            }
            List<e> list2 = this.d;
            if (list2 != null) {
                for (e eVar : list2) {
                    sb.append(':');
                    sb.append(eVar);
                }
            }
            return sb.toString();
        }

        void a(e eVar) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(eVar);
        }
    }

    static boolean a(String str, d dVar) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        cSSTextScanner.skipWhitespace();
        return a(b(cSSTextScanner), dVar);
    }

    private static void a(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    private static boolean a(List<d> list, d dVar) {
        if (list.size() == 0) {
            return true;
        }
        for (d dVar2 : list) {
            if (dVar2 == d.all || dVar2 == dVar) {
                return true;
            }
        }
        return false;
    }

    private boolean b(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        List<o> nextSelectorGroup = cSSTextScanner.nextSelectorGroup();
        if (nextSelectorGroup == null || nextSelectorGroup.isEmpty()) {
            return false;
        }
        if (cSSTextScanner.consume('{')) {
            cSSTextScanner.skipWhitespace();
            Style a2 = a(cSSTextScanner);
            cSSTextScanner.skipWhitespace();
            Iterator<o> it = nextSelectorGroup.iterator();
            while (it.hasNext()) {
                ruleset.a(new Rule(it.next(), a2, this.b));
            }
            return true;
        }
        throw new CSSParseException("Malformed rule block: expected '{'");
    }

    private void a(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        String nextIdentifier = cSSTextScanner.nextIdentifier();
        cSSTextScanner.skipWhitespace();
        if (nextIdentifier != null) {
            if (!this.d && nextIdentifier.equals("media")) {
                List<d> b2 = b(cSSTextScanner);
                if (cSSTextScanner.consume('{')) {
                    cSSTextScanner.skipWhitespace();
                    if (a(b2, this.a)) {
                        this.d = true;
                        ruleset.addAll(c(cSSTextScanner));
                        this.d = false;
                    } else {
                        c(cSSTextScanner);
                    }
                    if (!cSSTextScanner.empty() && !cSSTextScanner.consume('}')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new CSSParseException("Invalid @media rule: missing rule set");
                }
            } else if (!this.d && nextIdentifier.equals("import")) {
                String nextURL = cSSTextScanner.nextURL();
                if (nextURL == null) {
                    nextURL = cSSTextScanner.nextCSSString();
                }
                if (nextURL != null) {
                    cSSTextScanner.skipWhitespace();
                    List<d> b3 = b(cSSTextScanner);
                    if (!cSSTextScanner.empty() && !cSSTextScanner.consume(';')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                    if (this.c != null && a(b3, this.a)) {
                        String resolveCSSStyleSheet = this.c.resolveCSSStyleSheet(nextURL);
                        if (resolveCSSStyleSheet == null) {
                            return;
                        } else {
                            ruleset.addAll(a(resolveCSSStyleSheet));
                        }
                    }
                } else {
                    throw new CSSParseException("Invalid @import rule: expected string or url()");
                }
            } else {
                a("Ignoring @%s rule", nextIdentifier);
                d(cSSTextScanner);
            }
            cSSTextScanner.skipWhitespace();
            return;
        }
        throw new CSSParseException("Invalid '@' rule");
    }

    private Style a(CSSTextScanner cSSTextScanner) throws CSSParseException {
        Style style = new Style();
        do {
            String nextIdentifier = cSSTextScanner.nextIdentifier();
            cSSTextScanner.skipWhitespace();
            if (cSSTextScanner.consume(':')) {
                cSSTextScanner.skipWhitespace();
                String nextPropertyValue = cSSTextScanner.nextPropertyValue();
                if (nextPropertyValue != null) {
                    cSSTextScanner.skipWhitespace();
                    if (cSSTextScanner.consume('!')) {
                        cSSTextScanner.skipWhitespace();
                        if (cSSTextScanner.consume("important")) {
                            cSSTextScanner.skipWhitespace();
                        } else {
                            throw new CSSParseException("Malformed rule set: found unexpected '!'");
                        }
                    }
                    cSSTextScanner.consume(';');
                    Style.a(style, nextIdentifier, nextPropertyValue, false);
                    cSSTextScanner.skipWhitespace();
                    if (cSSTextScanner.empty()) {
                        break;
                    }
                } else {
                    throw new CSSParseException("Expected property value");
                }
            } else {
                throw new CSSParseException("Expected ':'");
            }
        } while (!cSSTextScanner.consume('}'));
        return style;
    }

    static boolean a(n nVar, o oVar, SVGBase.E e2) {
        if (oVar.e() == 1) {
            return a(nVar, oVar.a(0), e2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj = e2.b; obj != null; obj = ((SVGBase.SvgObject) obj).b) {
            arrayList.add(obj);
        }
        Collections.reverse(arrayList);
        return a(nVar, oVar, oVar.e() - 1, arrayList, arrayList.size() - 1, e2);
    }

    private static boolean a(n nVar, o oVar, int i2, List<SVGBase.SvgContainer> list, int i3, SVGBase.E e2) {
        p a2 = oVar.a(i2);
        if (!a(nVar, a2, e2)) {
            return false;
        }
        c cVar = a2.a;
        if (cVar == c.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 >= 0) {
                if (a(nVar, oVar, i2 - 1, list, i3)) {
                    return true;
                }
                i3--;
            }
            return false;
        }
        if (cVar == c.CHILD) {
            return a(nVar, oVar, i2 - 1, list, i3);
        }
        int a3 = a(list, i3, e2);
        if (a3 <= 0) {
            return false;
        }
        return a(nVar, oVar, i2 - 1, list, i3, (SVGBase.E) e2.b.getChildren().get(a3 - 1));
    }

    private static boolean a(n nVar, o oVar, int i2, List<SVGBase.SvgContainer> list, int i3) {
        p a2 = oVar.a(i2);
        SVGBase.E e2 = (SVGBase.E) list.get(i3);
        if (!a(nVar, a2, e2)) {
            return false;
        }
        c cVar = a2.a;
        if (cVar == c.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 > 0) {
                i3--;
                if (a(nVar, oVar, i2 - 1, list, i3)) {
                    return true;
                }
            }
            return false;
        }
        if (cVar == c.CHILD) {
            return a(nVar, oVar, i2 - 1, list, i3 - 1);
        }
        int a3 = a(list, i3, e2);
        if (a3 <= 0) {
            return false;
        }
        return a(nVar, oVar, i2 - 1, list, i3, (SVGBase.E) e2.b.getChildren().get(a3 - 1));
    }

    private static int a(List<SVGBase.SvgContainer> list, int i2, SVGBase.E e2) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        SVGBase.SvgContainer svgContainer = list.get(i2);
        SVGBase.SvgContainer svgContainer2 = e2.b;
        if (svgContainer != svgContainer2) {
            return -1;
        }
        Iterator<SVGBase.SvgObject> it = svgContainer2.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == e2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    private static boolean a(n nVar, p pVar, SVGBase.E e2) {
        List<String> list;
        String str = pVar.b;
        if (str != null && !str.equals(e2.a().toLowerCase(Locale.US))) {
            return false;
        }
        List<a> list2 = pVar.c;
        if (list2 != null) {
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = pVar.c.get(i2);
                String str2 = aVar.a;
                str2.getClass();
                if (!str2.equals("id")) {
                    if (!str2.equals(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS) || (list = e2.g) == null || !list.contains(aVar.c)) {
                        return false;
                    }
                } else if (!aVar.c.equals(e2.c)) {
                    return false;
                }
            }
        }
        List<e> list3 = pVar.d;
        if (list3 == null) {
            return true;
        }
        int size2 = list3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (!pVar.d.get(i3).a(nVar, e2)) {
                return false;
            }
        }
        return true;
    }
}
