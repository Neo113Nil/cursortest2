package com.smaato.sdk.ng.utils.svgparser.utils;

import com.ironsource.B5;
import com.safedk.android.utils.SdksMapping;
import com.smaato.sdk.ng.utils.svgparser.utils.CSSParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class CSSTextScanner extends TextScanner {
    static final Pattern e = Pattern.compile("(?s)/\\*.*?\\*/");

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CSSParser.h.values().length];
            a = iArr;
            try {
                iArr[CSSParser.h.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CSSParser.h.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CSSParser.h.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CSSParser.h.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[CSSParser.h.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[CSSParser.h.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[CSSParser.h.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[CSSParser.h.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[CSSParser.h.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[CSSParser.h.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[CSSParser.h.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[CSSParser.h.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[CSSParser.h.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[CSSParser.h.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[CSSParser.h.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[CSSParser.h.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[CSSParser.h.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[CSSParser.h.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[CSSParser.h.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[CSSParser.h.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[CSSParser.h.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[CSSParser.h.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[CSSParser.h.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[CSSParser.h.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    private static class b {
        public final int a;
        public final int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public CSSTextScanner(String str) {
        super(e.matcher(str).replaceAll(""));
    }

    private int c(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    private b k() {
        com.smaato.sdk.ng.utils.svgparser.utils.a aVar;
        b bVar;
        if (empty()) {
            return null;
        }
        int i = this.b;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        int i2 = 1;
        if (consume("odd")) {
            bVar = new b(2, 1);
        } else {
            if (consume("even")) {
                bVar = new b(2, 0);
            } else {
                int i3 = (!consume('+') && consume('-')) ? -1 : 1;
                com.smaato.sdk.ng.utils.svgparser.utils.a a2 = com.smaato.sdk.ng.utils.svgparser.utils.a.a(this.a, this.b, this.c, false);
                if (a2 != null) {
                    this.b = a2.a();
                }
                if (consume('n') || consume('N')) {
                    if (a2 == null) {
                        a2 = new com.smaato.sdk.ng.utils.svgparser.utils.a(1L, this.b);
                    }
                    skipWhitespace();
                    boolean consume = consume('+');
                    if (!consume && (consume = consume('-'))) {
                        i2 = -1;
                    }
                    if (consume) {
                        skipWhitespace();
                        aVar = com.smaato.sdk.ng.utils.svgparser.utils.a.a(this.a, this.b, this.c, false);
                        if (aVar == null) {
                            this.b = i;
                            return null;
                        }
                        this.b = aVar.a();
                    } else {
                        aVar = null;
                    }
                    int i4 = i2;
                    i2 = i3;
                    i3 = i4;
                } else {
                    aVar = a2;
                    a2 = null;
                }
                bVar = new b(a2 == null ? 0 : i2 * a2.b(), aVar != null ? i3 * aVar.b() : 0);
            }
        }
        skipWhitespace();
        if (consume(')')) {
            return bVar;
        }
        this.b = i;
        return null;
    }

    private String l() {
        if (empty()) {
            return null;
        }
        String nextQuotedString = nextQuotedString();
        return nextQuotedString != null ? nextQuotedString : nextIdentifier();
    }

    private List<String> m() {
        if (empty()) {
            return null;
        }
        int i = this.b;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        ArrayList arrayList = null;
        do {
            String nextIdentifier = nextIdentifier();
            if (nextIdentifier == null) {
                this.b = i;
                return null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(nextIdentifier);
            skipWhitespace();
        } while (skipCommaWhitespace());
        if (consume(')')) {
            return arrayList;
        }
        this.b = i;
        return null;
    }

    private List<CSSParser.o> o() throws CSSParseException {
        List<CSSParser.p> list;
        List<CSSParser.e> list2;
        if (empty()) {
            return null;
        }
        int i = this.b;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        List<CSSParser.o> nextSelectorGroup = nextSelectorGroup();
        if (nextSelectorGroup == null) {
            this.b = i;
            return null;
        }
        if (!consume(')')) {
            this.b = i;
            return null;
        }
        Iterator<CSSParser.o> it = nextSelectorGroup.iterator();
        while (it.hasNext() && (list = it.next().a) != null) {
            Iterator<CSSParser.p> it2 = list.iterator();
            while (it2.hasNext() && (list2 = it2.next().d) != null) {
                Iterator<CSSParser.e> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next() instanceof CSSParser.i) {
                        return null;
                    }
                }
            }
        }
        return nextSelectorGroup;
    }

    private int p() {
        int i;
        if (empty()) {
            return this.b;
        }
        int i2 = this.b;
        int charAt = this.a.charAt(i2);
        if (charAt == 45) {
            charAt = a();
        }
        if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 45 && charAt != 95 && charAt < 128)) {
            i = i2;
        } else {
            int a2 = a();
            while (true) {
                if ((a2 < 65 || a2 > 90) && ((a2 < 97 || a2 > 122) && ((a2 < 48 || a2 > 57) && a2 != 45 && a2 != 95 && a2 < 128))) {
                    break;
                }
                a2 = a();
            }
            i = this.b;
        }
        this.b = i2;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean a(CSSParser.o oVar) throws CSSParseException {
        CSSParser.c cVar;
        CSSParser.p pVar;
        String str;
        if (empty()) {
            return false;
        }
        int i = this.b;
        if (!oVar.d()) {
            if (consume('>')) {
                cVar = CSSParser.c.CHILD;
                skipWhitespace();
            } else if (consume('+')) {
                cVar = CSSParser.c.FOLLOWS;
                skipWhitespace();
            }
            if (consume('*')) {
                String nextIdentifier = nextIdentifier();
                if (nextIdentifier != null) {
                    CSSParser.p pVar2 = new CSSParser.p(cVar, nextIdentifier);
                    oVar.b();
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
            } else {
                pVar = new CSSParser.p(cVar, null);
            }
            while (!empty()) {
                if (!consume('.')) {
                    if (!consume('#')) {
                        if (!consume('[')) {
                            if (!consume(':')) {
                                break;
                            }
                            if (pVar == null) {
                                pVar = new CSSParser.p(cVar, null);
                            }
                            a(oVar, pVar);
                        } else {
                            if (pVar == null) {
                                pVar = new CSSParser.p(cVar, null);
                            }
                            skipWhitespace();
                            String nextIdentifier2 = nextIdentifier();
                            if (nextIdentifier2 == null) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            skipWhitespace();
                            CSSParser.b bVar = consume(B5.U) ? CSSParser.b.EQUALS : consume("~=") ? CSSParser.b.INCLUDES : consume("|=") ? CSSParser.b.DASHMATCH : null;
                            if (bVar != null) {
                                skipWhitespace();
                                str = l();
                                if (str == null) {
                                    throw new CSSParseException("Invalid attribute simpleSelectors");
                                }
                                skipWhitespace();
                            } else {
                                str = null;
                            }
                            if (!consume(']')) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            if (bVar == null) {
                                bVar = CSSParser.b.EXISTS;
                            }
                            pVar.a(nextIdentifier2, bVar, str);
                            oVar.a();
                        }
                    } else {
                        if (pVar == null) {
                            pVar = new CSSParser.p(cVar, null);
                        }
                        String nextIdentifier3 = nextIdentifier();
                        if (nextIdentifier3 == null) {
                            throw new CSSParseException("Invalid \"#id\" simpleSelectors");
                        }
                        pVar.a("id", CSSParser.b.EQUALS, nextIdentifier3);
                        oVar.c();
                    }
                } else {
                    if (pVar == null) {
                        pVar = new CSSParser.p(cVar, null);
                    }
                    String nextIdentifier4 = nextIdentifier();
                    if (nextIdentifier4 == null) {
                        throw new CSSParseException("Invalid \".class\" simpleSelectors");
                    }
                    pVar.a(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, CSSParser.b.EQUALS, nextIdentifier4);
                    oVar.a();
                }
            }
            if (pVar == null) {
                oVar.a(pVar);
                return true;
            }
            this.b = i;
            return false;
        }
        cVar = null;
        if (consume('*')) {
        }
        while (!empty()) {
        }
        if (pVar == null) {
        }
    }

    String n() {
        char charAt;
        int c;
        StringBuilder sb = new StringBuilder();
        while (!empty() && (charAt = this.a.charAt(this.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !b(charAt) && !Character.isISOControl((int) charAt)) {
            this.b++;
            if (charAt == '\\') {
                if (!empty()) {
                    String str = this.a;
                    int i = this.b;
                    this.b = i + 1;
                    charAt = str.charAt(i);
                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                        int c2 = c(charAt);
                        if (c2 != -1) {
                            for (int i2 = 1; i2 <= 5 && !empty() && (c = c(this.a.charAt(this.b))) != -1; i2++) {
                                this.b++;
                                c2 = (c2 * 16) + c;
                            }
                            sb.append((char) c2);
                        }
                    }
                }
            }
            sb.append(charAt);
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public String nextCSSString() {
        int c;
        if (empty()) {
            return null;
        }
        char charAt = this.a.charAt(this.b);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int intValue = d().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = d().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = d().intValue();
                    } else {
                        int c2 = c(intValue);
                        if (c2 != -1) {
                            for (int i = 1; i <= 5 && (c = c((intValue = d().intValue()))) != -1; i++) {
                                c2 = (c2 * 16) + c;
                            }
                            sb.append((char) c2);
                        }
                    }
                }
            }
            sb.append((char) intValue);
            intValue = d().intValue();
        }
        return sb.toString();
    }

    public String nextIdentifier() {
        int p = p();
        int i = this.b;
        if (p == i) {
            return null;
        }
        String substring = this.a.substring(i, p);
        this.b = p;
        return substring;
    }

    public String nextPropertyValue() {
        if (empty()) {
            return null;
        }
        int i = this.b;
        int charAt = this.a.charAt(i);
        int i2 = i;
        while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !a(charAt)) {
            if (!b(charAt)) {
                i2 = this.b + 1;
            }
            charAt = a();
        }
        if (this.b > i) {
            return this.a.substring(i, i2);
        }
        this.b = i;
        return null;
    }

    public List<CSSParser.o> nextSelectorGroup() throws CSSParseException {
        if (empty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        CSSParser.o oVar = new CSSParser.o();
        while (!empty() && a(oVar)) {
            if (skipCommaWhitespace()) {
                arrayList.add(oVar);
                oVar = new CSSParser.o();
            }
        }
        if (!oVar.d()) {
            arrayList.add(oVar);
        }
        return arrayList;
    }

    public String nextURL() {
        if (empty()) {
            return null;
        }
        int i = this.b;
        if (!consume("url(")) {
            return null;
        }
        skipWhitespace();
        String nextCSSString = nextCSSString();
        if (nextCSSString == null) {
            nextCSSString = n();
        }
        if (nextCSSString == null) {
            this.b = i;
            return null;
        }
        skipWhitespace();
        if (empty() || consume(")")) {
            return nextCSSString;
        }
        this.b = i;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(CSSParser.o oVar, CSSParser.p pVar) throws CSSParseException {
        CSSParser.e fVar;
        CSSParser.f fVar2;
        String nextIdentifier = nextIdentifier();
        if (nextIdentifier != null) {
            CSSParser.h a2 = CSSParser.h.a(nextIdentifier);
            switch (a.a[a2.ordinal()]) {
                case 1:
                    fVar = new CSSParser.f(0, 1, true, false, null);
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 2:
                    fVar = new CSSParser.f(0, 1, false, false, null);
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 3:
                    fVar = new CSSParser.k(false, null);
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 4:
                    fVar = new CSSParser.f(0, 1, true, true, pVar.b);
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 5:
                    fVar = new CSSParser.f(0, 1, false, true, pVar.b);
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 6:
                    fVar = new CSSParser.k(true, pVar.b);
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 7:
                    fVar = new CSSParser.l();
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 8:
                    fVar = new CSSParser.g();
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z = a2 == CSSParser.h.nth_child || a2 == CSSParser.h.nth_of_type;
                    boolean z2 = a2 == CSSParser.h.nth_of_type || a2 == CSSParser.h.nth_last_of_type;
                    b k = k();
                    if (k != null) {
                        CSSParser.f fVar3 = new CSSParser.f(k.a, k.b, z, z2, pVar.b);
                        oVar.a();
                        fVar2 = fVar3;
                        fVar = fVar2;
                        pVar.a(fVar);
                        return;
                    }
                    throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + nextIdentifier);
                case 13:
                    List<CSSParser.o> o = o();
                    if (o != null) {
                        CSSParser.i iVar = new CSSParser.i(o);
                        oVar.b = iVar.a();
                        fVar2 = iVar;
                        fVar = fVar2;
                        pVar.a(fVar);
                        return;
                    }
                    throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + nextIdentifier);
                case 14:
                    fVar = new CSSParser.m();
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 15:
                    m();
                    fVar = new CSSParser.j(nextIdentifier);
                    oVar.a();
                    pVar.a(fVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    fVar = new CSSParser.j(nextIdentifier);
                    oVar.a();
                    pVar.a(fVar);
                    return;
                default:
                    throw new CSSParseException("Unsupported pseudo class: " + nextIdentifier);
            }
        }
        throw new CSSParseException("Invalid pseudo class");
    }
}
