package net.pubnative.lite.sdk.utils.svgparser.utils;

import com.ironsource.B5;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;

/* loaded from: classes10.dex */
public class CSSTextScanner extends TextScanner {
    static final Pattern PATTERN_BLOCK_COMMENTS = Pattern.compile("(?s)/\\*.*?\\*/");

    /* renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.CSSTextScanner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents;

        static {
            int[] iArr = new int[CSSParser.PseudoClassIdents.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents = iArr;
            try {
                iArr[CSSParser.PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    private static class AnPlusB {
        public final int a;
        public final int b;

        AnPlusB(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public CSSTextScanner(String str) {
        super(PATTERN_BLOCK_COMMENTS.matcher(str).replaceAll(""));
    }

    private int hexChar(int i) {
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

    private AnPlusB nextAnPlusB() {
        IntegerParser integerParser;
        AnPlusB anPlusB;
        if (empty()) {
            return null;
        }
        int i = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        int i2 = 1;
        if (consume("odd")) {
            anPlusB = new AnPlusB(2, 1);
        } else {
            if (consume("even")) {
                anPlusB = new AnPlusB(2, 0);
            } else {
                int i3 = (!consume('+') && consume('-')) ? -1 : 1;
                IntegerParser parseInt = IntegerParser.parseInt(this.input, this.position, this.inputLength, false);
                if (parseInt != null) {
                    this.position = parseInt.getEndPos();
                }
                if (consume('n') || consume('N')) {
                    if (parseInt == null) {
                        parseInt = new IntegerParser(1L, this.position);
                    }
                    skipWhitespace();
                    boolean consume = consume('+');
                    if (!consume && (consume = consume('-'))) {
                        i2 = -1;
                    }
                    if (consume) {
                        skipWhitespace();
                        integerParser = IntegerParser.parseInt(this.input, this.position, this.inputLength, false);
                        if (integerParser == null) {
                            this.position = i;
                            return null;
                        }
                        this.position = integerParser.getEndPos();
                    } else {
                        integerParser = null;
                    }
                    int i4 = i2;
                    i2 = i3;
                    i3 = i4;
                } else {
                    integerParser = parseInt;
                    parseInt = null;
                }
                anPlusB = new AnPlusB(parseInt == null ? 0 : i2 * parseInt.value(), integerParser != null ? i3 * integerParser.value() : 0);
            }
        }
        skipWhitespace();
        if (consume(')')) {
            return anPlusB;
        }
        this.position = i;
        return null;
    }

    private String nextAttribValue() {
        if (empty()) {
            return null;
        }
        String nextQuotedString = nextQuotedString();
        return nextQuotedString != null ? nextQuotedString : nextIdentifier();
    }

    private List<String> nextIdentListParam() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        ArrayList arrayList = null;
        do {
            String nextIdentifier = nextIdentifier();
            if (nextIdentifier == null) {
                this.position = i;
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
        this.position = i;
        return null;
    }

    private List<CSSParser.Selector> nextPseudoNotParam() {
        List<CSSParser.SimpleSelector> list;
        List<CSSParser.PseudoClass> list2;
        if (empty()) {
            return null;
        }
        int i = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        List<CSSParser.Selector> nextSelectorGroup = nextSelectorGroup();
        if (nextSelectorGroup == null) {
            this.position = i;
            return null;
        }
        if (!consume(')')) {
            this.position = i;
            return null;
        }
        Iterator<CSSParser.Selector> it = nextSelectorGroup.iterator();
        while (it.hasNext() && (list = it.next().simpleSelectors) != null) {
            Iterator<CSSParser.SimpleSelector> it2 = list.iterator();
            while (it2.hasNext() && (list2 = it2.next().pseudos) != null) {
                Iterator<CSSParser.PseudoClass> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next() instanceof CSSParser.PseudoClassNot) {
                        return null;
                    }
                }
            }
        }
        return nextSelectorGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void parsePseudoClass(CSSParser.Selector selector, CSSParser.SimpleSelector simpleSelector) {
        CSSParser.PseudoClass pseudoClassAnPlusB;
        CSSParser.PseudoClassAnPlusB pseudoClassAnPlusB2;
        String nextIdentifier = nextIdentifier();
        if (nextIdentifier == null) {
            throw new CSSParseException("Invalid pseudo class");
        }
        CSSParser.PseudoClassIdents fromString = CSSParser.PseudoClassIdents.fromString(nextIdentifier);
        switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[fromString.ordinal()]) {
            case 1:
                pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, true, false, null);
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 2:
                pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, false, false, null);
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 3:
                pseudoClassAnPlusB = new CSSParser.PseudoClassOnlyChild(false, null);
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 4:
                pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, true, true, simpleSelector.tag);
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 5:
                pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, false, true, simpleSelector.tag);
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 6:
                pseudoClassAnPlusB = new CSSParser.PseudoClassOnlyChild(true, simpleSelector.tag);
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 7:
                pseudoClassAnPlusB = new CSSParser.PseudoClassRoot();
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 8:
                pseudoClassAnPlusB = new CSSParser.PseudoClassEmpty();
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 9:
            case 10:
            case 11:
            case 12:
                boolean z = fromString == CSSParser.PseudoClassIdents.nth_child || fromString == CSSParser.PseudoClassIdents.nth_of_type;
                boolean z2 = fromString == CSSParser.PseudoClassIdents.nth_of_type || fromString == CSSParser.PseudoClassIdents.nth_last_of_type;
                AnPlusB nextAnPlusB = nextAnPlusB();
                if (nextAnPlusB == null) {
                    throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + nextIdentifier);
                }
                CSSParser.PseudoClassAnPlusB pseudoClassAnPlusB3 = new CSSParser.PseudoClassAnPlusB(nextAnPlusB.a, nextAnPlusB.b, z, z2, simpleSelector.tag);
                selector.addedAttributeOrPseudo();
                pseudoClassAnPlusB2 = pseudoClassAnPlusB3;
                pseudoClassAnPlusB = pseudoClassAnPlusB2;
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 13:
                List<CSSParser.Selector> nextPseudoNotParam = nextPseudoNotParam();
                if (nextPseudoNotParam == null) {
                    throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + nextIdentifier);
                }
                CSSParser.PseudoClassNot pseudoClassNot = new CSSParser.PseudoClassNot(nextPseudoNotParam);
                selector.specificity = pseudoClassNot.getSpecificity();
                pseudoClassAnPlusB2 = pseudoClassNot;
                pseudoClassAnPlusB = pseudoClassAnPlusB2;
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 14:
                pseudoClassAnPlusB = new CSSParser.PseudoClassTarget();
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            case 15:
                nextIdentListParam();
                pseudoClassAnPlusB = new CSSParser.PseudoClassNotSupported(nextIdentifier);
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
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
                pseudoClassAnPlusB = new CSSParser.PseudoClassNotSupported(nextIdentifier);
                selector.addedAttributeOrPseudo();
                simpleSelector.addPseudo(pseudoClassAnPlusB);
                return;
            default:
                throw new CSSParseException("Unsupported pseudo class: " + nextIdentifier);
        }
    }

    private int scanForIdentifier() {
        int i;
        if (empty()) {
            return this.position;
        }
        int i2 = this.position;
        int charAt = this.input.charAt(i2);
        if (charAt == 45) {
            charAt = advanceChar();
        }
        if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 45 && charAt != 95 && charAt < 128)) {
            i = i2;
        } else {
            int advanceChar = advanceChar();
            while (true) {
                if ((advanceChar < 65 || advanceChar > 90) && ((advanceChar < 97 || advanceChar > 122) && ((advanceChar < 48 || advanceChar > 57) && advanceChar != 45 && advanceChar != 95 && advanceChar < 128))) {
                    break;
                }
                advanceChar = advanceChar();
            }
            i = this.position;
        }
        this.position = i2;
        return i;
    }

    public String nextCSSString() {
        int hexChar;
        if (empty()) {
            return null;
        }
        char charAt = this.input.charAt(this.position);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.position++;
        int intValue = nextChar().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = nextChar().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = nextChar().intValue();
                    } else {
                        int hexChar2 = hexChar(intValue);
                        if (hexChar2 != -1) {
                            for (int i = 1; i <= 5 && (hexChar = hexChar((intValue = nextChar().intValue()))) != -1; i++) {
                                hexChar2 = (hexChar2 * 16) + hexChar;
                            }
                            sb.append((char) hexChar2);
                        }
                    }
                }
            }
            sb.append((char) intValue);
            intValue = nextChar().intValue();
        }
        return sb.toString();
    }

    public String nextIdentifier() {
        int scanForIdentifier = scanForIdentifier();
        int i = this.position;
        if (scanForIdentifier == i) {
            return null;
        }
        String substring = this.input.substring(i, scanForIdentifier);
        this.position = scanForIdentifier;
        return substring;
    }

    String nextLegacyURL() {
        char charAt;
        int hexChar;
        StringBuilder sb = new StringBuilder();
        while (!empty() && (charAt = this.input.charAt(this.position)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !isWhitespace(charAt) && !Character.isISOControl((int) charAt)) {
            this.position++;
            if (charAt == '\\') {
                if (!empty()) {
                    String str = this.input;
                    int i = this.position;
                    this.position = i + 1;
                    charAt = str.charAt(i);
                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                        int hexChar2 = hexChar(charAt);
                        if (hexChar2 != -1) {
                            for (int i2 = 1; i2 <= 5 && !empty() && (hexChar = hexChar(this.input.charAt(this.position))) != -1; i2++) {
                                this.position++;
                                hexChar2 = (hexChar2 * 16) + hexChar;
                            }
                            sb.append((char) hexChar2);
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

    public String nextPropertyValue() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        int charAt = this.input.charAt(i);
        int i2 = i;
        while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !isEOL(charAt)) {
            if (!isWhitespace(charAt)) {
                i2 = this.position + 1;
            }
            charAt = advanceChar();
        }
        if (this.position > i) {
            return this.input.substring(i, i2);
        }
        this.position = i;
        return null;
    }

    public List<CSSParser.Selector> nextSelectorGroup() {
        if (empty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        CSSParser.Selector selector = new CSSParser.Selector();
        while (!empty() && nextSimpleSelector(selector)) {
            if (skipCommaWhitespace()) {
                arrayList.add(selector);
                selector = new CSSParser.Selector();
            }
        }
        if (!selector.isEmpty()) {
            arrayList.add(selector);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean nextSimpleSelector(CSSParser.Selector selector) {
        CSSParser.Combinator combinator;
        CSSParser.SimpleSelector simpleSelector;
        String str;
        if (empty()) {
            return false;
        }
        int i = this.position;
        if (!selector.isEmpty()) {
            if (consume('>')) {
                combinator = CSSParser.Combinator.CHILD;
                skipWhitespace();
            } else if (consume('+')) {
                combinator = CSSParser.Combinator.FOLLOWS;
                skipWhitespace();
            }
            if (consume('*')) {
                String nextIdentifier = nextIdentifier();
                if (nextIdentifier != null) {
                    CSSParser.SimpleSelector simpleSelector2 = new CSSParser.SimpleSelector(combinator, nextIdentifier);
                    selector.addedElement();
                    simpleSelector = simpleSelector2;
                } else {
                    simpleSelector = null;
                }
            } else {
                simpleSelector = new CSSParser.SimpleSelector(combinator, null);
            }
            while (!empty()) {
                if (!consume('.')) {
                    if (!consume('#')) {
                        if (!consume('[')) {
                            if (!consume(':')) {
                                break;
                            }
                            if (simpleSelector == null) {
                                simpleSelector = new CSSParser.SimpleSelector(combinator, null);
                            }
                            parsePseudoClass(selector, simpleSelector);
                        } else {
                            if (simpleSelector == null) {
                                simpleSelector = new CSSParser.SimpleSelector(combinator, null);
                            }
                            skipWhitespace();
                            String nextIdentifier2 = nextIdentifier();
                            if (nextIdentifier2 == null) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            skipWhitespace();
                            CSSParser.AttribOp attribOp = consume(B5.U) ? CSSParser.AttribOp.EQUALS : consume("~=") ? CSSParser.AttribOp.INCLUDES : consume("|=") ? CSSParser.AttribOp.DASHMATCH : null;
                            if (attribOp != null) {
                                skipWhitespace();
                                str = nextAttribValue();
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
                            if (attribOp == null) {
                                attribOp = CSSParser.AttribOp.EXISTS;
                            }
                            simpleSelector.addAttrib(nextIdentifier2, attribOp, str);
                            selector.addedAttributeOrPseudo();
                        }
                    } else {
                        if (simpleSelector == null) {
                            simpleSelector = new CSSParser.SimpleSelector(combinator, null);
                        }
                        String nextIdentifier3 = nextIdentifier();
                        if (nextIdentifier3 == null) {
                            throw new CSSParseException("Invalid \"#id\" simpleSelectors");
                        }
                        simpleSelector.addAttrib("id", CSSParser.AttribOp.EQUALS, nextIdentifier3);
                        selector.addedIdAttribute();
                    }
                } else {
                    if (simpleSelector == null) {
                        simpleSelector = new CSSParser.SimpleSelector(combinator, null);
                    }
                    String nextIdentifier4 = nextIdentifier();
                    if (nextIdentifier4 == null) {
                        throw new CSSParseException("Invalid \".class\" simpleSelectors");
                    }
                    simpleSelector.addAttrib(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, CSSParser.AttribOp.EQUALS, nextIdentifier4);
                    selector.addedAttributeOrPseudo();
                }
            }
            if (simpleSelector == null) {
                selector.add(simpleSelector);
                return true;
            }
            this.position = i;
            return false;
        }
        combinator = null;
        if (consume('*')) {
        }
        while (!empty()) {
        }
        if (simpleSelector == null) {
        }
    }

    public String nextURL() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        if (!consume("url(")) {
            return null;
        }
        skipWhitespace();
        String nextCSSString = nextCSSString();
        if (nextCSSString == null) {
            nextCSSString = nextLegacyURL();
        }
        if (nextCSSString == null) {
            this.position = i;
            return null;
        }
        skipWhitespace();
        if (empty() || consume(")")) {
            return nextCSSString;
        }
        this.position = i;
        return null;
    }
}
