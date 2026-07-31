package yads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.O6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.util.network.NetworkUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes8.dex */
public final class g30 extends DefaultHandler implements dc2 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public g30() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static void a(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair c(XmlPullParser xmlPullParser) {
        String str;
        ?? r7;
        String str2;
        String str3;
        ?? r8;
        char c2;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String a = lh.a(attributeValue);
            a.getClass();
            switch (a.hashCode()) {
                case -1980789791:
                    if (a.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 489446379:
                    if (a.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 755418770:
                    if (a.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812765994:
                    if (a.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    r7 = xq.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 1:
                    r7 = xq.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 2:
                    r7 = xq.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !MobileFuseDefaults.ADVERTISING_ID_ZEROS.equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i2 = 0; i2 < split.length; i2++) {
                            uuidArr[i2] = UUID.fromString(split[i2]);
                        }
                        r7 = xq.b;
                        str3 = null;
                        r8 = il2.a(r7, uuidArr, null);
                        break;
                    } else {
                        r7 = null;
                        str2 = r7;
                        str3 = str2;
                        r8 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if (!sp3.c(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r8 = r8;
                } else if (sp3.c(xmlPullParser, "ms:laurl")) {
                    if (r8 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            hl2 a2 = il2.a(decode);
                            UUID uuid = a2 == null ? null : a2.a;
                            if (uuid == null) {
                                gh1.d("MpdParser", "Skipping malformed cenc:pssh data");
                                r7 = uuid;
                                r8 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r8 = decode;
                                r7 = uuid2;
                            }
                        }
                    }
                    if (r8 == 0) {
                        ?? r10 = xq.e;
                        if (r10.equals(r7) && sp3.c(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r8 = il2.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    a(xmlPullParser);
                    r8 = r8;
                } else {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r8 = r8;
                }
            } while (!sp3.b(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r7 != null ? new uk0(r7, str3, "video/mp4", r8) : null);
        }
        str = null;
        r7 = null;
        str2 = r7;
        str3 = str2;
        r8 = str2;
        do {
            xmlPullParser.next();
            if (!sp3.c(xmlPullParser, "clearkey:Laurl")) {
            }
            if (sp3.c(xmlPullParser, "ms:laurl")) {
            }
        } while (!sp3.b(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r7 != null ? new uk0(r7, str3, "video/mp4", r8) : null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (r0 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        if (r6.equals("fa01") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r0 < 33) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(XmlPullParser xmlPullParser) {
        char c2;
        int i = 6;
        char c3 = 3;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 4:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                i = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (i > 0) {
                    break;
                }
                i = -1;
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null) {
                    i = Integer.parseInt(attributeValue3);
                    break;
                }
                i = -1;
                break;
            case 2:
            case 6:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    String a = lh.a(attributeValue4);
                    a.getClass();
                    switch (a.hashCode()) {
                        case 1596796:
                            if (a.equals("4000")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2937391:
                            if (a.equals("a000")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094035:
                            if (a.equals("f801")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 3:
                            i = 8;
                            break;
                    }
                }
                i = -1;
                break;
            case 3:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (parseInt >= 0) {
                    int[] iArr = e;
                    if (parseInt < iArr.length) {
                        i = iArr[parseInt];
                        break;
                    }
                }
                i = -1;
                break;
            case 5:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 != null) {
                    i = Integer.bitCount(Integer.parseInt(attributeValue6, 16));
                    break;
                }
                i = -1;
                break;
            default:
                i = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!sp3.b(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    @Override // yads.dc2
    public final Object a(Uri uri, s30 s30Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(s30Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return a(newPullParser, uri);
            }
            throw new cc2("inputStream does not contain a valid media presentation description", null, true, 4);
        } catch (XmlPullParserException e2) {
            throw new cc2(null, e2, true, 4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0cd5, code lost:
    
        if (r8.equals(r9) == false) goto L411;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x1440 A[LOOP:5: B:192:0x0536->B:201:0x1440, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x12e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x1118 A[LOOP:11: B:377:0x08e5->B:386:0x1118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0b88 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0c9e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x1868  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x187a  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x10af  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x10c1  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x10e5  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x10c4  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x10b2  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x0478  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e30 a(XmlPullParser xmlPullParser, Uri uri) {
        boolean z;
        long j;
        long j2;
        String str;
        int i;
        String str2;
        ArrayList arrayList;
        long j3;
        boolean z2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Object obj;
        Object obj2;
        String str10;
        String str11;
        String str12;
        String str13;
        ArrayList arrayList2;
        Exception exc;
        long j4;
        ArrayList arrayList3;
        String str14;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str15;
        ArrayList arrayList6;
        String str16;
        long j5;
        String str17;
        ArrayList arrayList7;
        ArrayList arrayList8;
        String str18;
        long j6;
        String str19;
        ArrayList arrayList9;
        String str20;
        long parseLong;
        String str21;
        ArrayList arrayList10;
        String str22;
        int parseInt;
        String str23;
        int i2;
        String str24;
        String str25;
        String str26;
        String attributeValue;
        String str27;
        float f;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str28;
        ArrayList arrayList14;
        String str29;
        String str30;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        String str31;
        long j7;
        String str32;
        String str33;
        ArrayList arrayList18;
        long j8;
        ArrayList arrayList19;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str34;
        ArrayList arrayList22;
        ArrayList arrayList23;
        String str35;
        String str36;
        String str37;
        String str38;
        ArrayList arrayList24;
        ArrayList arrayList25;
        ArrayList arrayList26;
        ArrayList arrayList27;
        ArrayList arrayList28;
        ArrayList arrayList29;
        String str39;
        String str40;
        int i3;
        String str41;
        long j9;
        String str42;
        String str43;
        String str44;
        ArrayList arrayList30;
        String str45;
        String str46;
        ArrayList arrayList31;
        String str47;
        ArrayList arrayList32;
        float f2;
        String attributeValue2;
        int parseInt2;
        String str48;
        ArrayList arrayList33;
        ArrayList arrayList34;
        ArrayList arrayList35;
        ArrayList arrayList36;
        ArrayList arrayList37;
        String str49;
        ArrayList arrayList38;
        int i4;
        String str50;
        float f3;
        String str51;
        String str52;
        int i5;
        ArrayList arrayList39;
        Object obj3;
        String str53;
        String str54;
        ArrayList arrayList40;
        int i6;
        ArrayList arrayList41;
        int i7;
        int i8;
        ArrayList arrayList42;
        String str55;
        Object obj4;
        ArrayList arrayList43;
        ArrayList arrayList44;
        String str56;
        String str57;
        ArrayList arrayList45;
        ArrayList arrayList46;
        ArrayList arrayList47;
        ArrayList arrayList48;
        String str58;
        String str59;
        String str60;
        ArrayList arrayList49;
        ArrayList arrayList50;
        int i9;
        int i10;
        String str61;
        String str62;
        String str63;
        String[] split;
        ArrayList arrayList51;
        String str64;
        int parseInt3;
        String str65;
        int i11;
        String str66;
        char c2;
        int i12;
        char c3;
        int i13;
        char c4;
        Object obj5;
        Object obj6;
        int i14;
        String str67;
        String[] split2;
        String str68;
        ArrayList arrayList52;
        int i15;
        String str69;
        oo2 mo2Var;
        String str70;
        ArrayList arrayList53;
        boolean z3;
        long j10;
        long j11;
        float f4;
        long j12;
        long j13;
        float f5;
        String str71;
        String str72;
        String str73;
        String str74;
        long j14;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String str75 = "contentType";
        String str76 = "Period";
        String str77 = "max";
        String str78 = "min";
        String str79 = "ServiceDescription";
        String str80 = "value";
        String str81 = "schemeIdUri";
        Object obj7 = "forced-subtitle";
        String[] strArr = new String[0];
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "profiles");
        String[] split3 = attributeValue3 == null ? strArr : attributeValue3.split(StringUtils.COMMA);
        int length = split3.length;
        Object obj8 = "forced_subtitle";
        int i16 = 0;
        while (true) {
            if (i16 >= length) {
                z = false;
                break;
            }
            int i17 = length;
            String[] strArr2 = split3;
            if (split3[i16].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i16++;
            length = i17;
            split3 = strArr2;
        }
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "availabilityStartTime");
        String str82 = "ProgramInformation";
        long f6 = attributeValue4 == null ? -9223372036854775807L : sb3.f(attributeValue4);
        long a = a(xmlPullParser2, "mediaPresentationDuration", -9223372036854775807L);
        long a2 = a(xmlPullParser2, "minBufferTime", -9223372036854775807L);
        boolean equals = POBAdDescriptor.DYNAMIC_PRICE_BID.equals(xmlPullParser2.getAttributeValue(null, "type"));
        if (equals) {
            j = -9223372036854775807L;
            j2 = a(xmlPullParser2, "minimumUpdatePeriod", -9223372036854775807L);
        } else {
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
        }
        long a3 = equals ? a(xmlPullParser2, "timeShiftBufferDepth", j) : j;
        long a4 = equals ? a(xmlPullParser2, "suggestedPresentationDelay", j) : -9223372036854775807L;
        String attributeValue5 = xmlPullParser2.getAttributeValue(null, "publishTime");
        long f7 = attributeValue5 == null ? -9223372036854775807L : sb3.f(attributeValue5);
        long j15 = equals ? 0L : -9223372036854775807L;
        String uri2 = uri.toString();
        String uri3 = uri.toString();
        if (z) {
            str = "mimeType";
            str2 = "text";
            i = 1;
        } else {
            str = "mimeType";
            i = Integer.MIN_VALUE;
            str2 = "text";
        }
        ArrayList a5 = sf1.a(new lo(i, 1, uri2, uri3));
        ArrayList arrayList54 = new ArrayList();
        ArrayList arrayList55 = new ArrayList();
        long j16 = equals ? -9223372036854775807L : 0L;
        kj2 kj2Var = null;
        rb3 rb3Var = null;
        Uri uri4 = null;
        py2 py2Var = null;
        boolean z4 = false;
        boolean z5 = false;
        String str83 = "AdaptationSet";
        String str84 = IronSourceConstants.EVENTS_DURATION;
        long j17 = j15;
        while (true) {
            xmlPullParser.next();
            ArrayList arrayList56 = arrayList54;
            String str85 = "BaseURL";
            if (sp3.c(xmlPullParser2, "BaseURL")) {
                if (!z4) {
                    j17 = a(xmlPullParser2, j17);
                    z4 = true;
                }
                arrayList55.addAll(a(xmlPullParser2, a5, z));
                j3 = j16;
                z2 = z;
                str3 = str80;
                str4 = str78;
                str5 = str79;
                str6 = str76;
                str7 = str77;
                str9 = str75;
                obj = obj7;
                obj2 = obj8;
                str8 = str82;
                str10 = str2;
                str11 = str83;
                str12 = str84;
                str13 = str;
                arrayList2 = arrayList56;
                exc = null;
                j4 = -9223372036854775807L;
                arrayList3 = arrayList55;
                str14 = str81;
                arrayList = a5;
            } else {
                long j18 = j17;
                String str86 = str82;
                boolean c5 = sp3.c(xmlPullParser2, str86);
                arrayList = a5;
                String str87 = O6.q;
                if (c5) {
                    String attributeValue6 = xmlPullParser2.getAttributeValue(null, "moreInformationURL");
                    String str88 = attributeValue6 == null ? null : attributeValue6;
                    String attributeValue7 = xmlPullParser2.getAttributeValue(null, O6.q);
                    if (attributeValue7 == null) {
                        str72 = null;
                        str73 = null;
                        str74 = null;
                        str71 = null;
                    } else {
                        str71 = attributeValue7;
                        str72 = null;
                        str73 = null;
                        str74 = null;
                    }
                    do {
                        xmlPullParser.next();
                        String str89 = str72;
                        if (sp3.c(xmlPullParser2, "Title")) {
                            str72 = xmlPullParser.nextText();
                        } else {
                            if (sp3.c(xmlPullParser2, "Source")) {
                                str73 = xmlPullParser.nextText();
                            } else if (sp3.c(xmlPullParser2, "Copyright")) {
                                str74 = xmlPullParser.nextText();
                            } else {
                                a(xmlPullParser);
                            }
                            str72 = str89;
                        }
                    } while (!sp3.b(xmlPullParser2, str86));
                    kj2Var = new kj2(str72, str73, str74, str88, str71);
                    j3 = j16;
                    z2 = z;
                    str3 = str80;
                    str4 = str78;
                    str5 = str79;
                    str6 = str76;
                    str7 = str77;
                    str8 = str86;
                } else if (sp3.c(xmlPullParser2, "UTCTiming")) {
                    j3 = j16;
                    z2 = z;
                    str3 = str80;
                    str4 = str78;
                    str5 = str79;
                    str6 = str76;
                    str7 = str77;
                    str8 = str86;
                    rb3Var = new rb3(xmlPullParser2.getAttributeValue(null, str81), xmlPullParser2.getAttributeValue(null, str80));
                } else if (sp3.c(xmlPullParser2, NetworkUtils.HEADER_LOCATION)) {
                    j3 = j16;
                    z2 = z;
                    str3 = str80;
                    str4 = str78;
                    str5 = str79;
                    str6 = str76;
                    str7 = str77;
                    str8 = str86;
                    uri4 = Uri.parse(ab3.a(uri.toString(), xmlPullParser.nextText()));
                } else if (sp3.c(xmlPullParser2, str79)) {
                    long j19 = -9223372036854775807L;
                    float f8 = -3.4028235E38f;
                    long j20 = -9223372036854775807L;
                    long j21 = -9223372036854775807L;
                    float f9 = -3.4028235E38f;
                    while (true) {
                        xmlPullParser.next();
                        if (sp3.c(xmlPullParser2, "Latency")) {
                            String attributeValue8 = xmlPullParser2.getAttributeValue(null, "target");
                            long parseLong2 = attributeValue8 == null ? -9223372036854775807L : Long.parseLong(attributeValue8);
                            String attributeValue9 = xmlPullParser2.getAttributeValue(null, str78);
                            long parseLong3 = attributeValue9 == null ? -9223372036854775807L : Long.parseLong(attributeValue9);
                            String attributeValue10 = xmlPullParser2.getAttributeValue(null, str77);
                            f4 = f8;
                            j11 = parseLong3;
                            f5 = f9;
                            j12 = attributeValue10 == null ? -9223372036854775807L : Long.parseLong(attributeValue10);
                            j13 = parseLong2;
                        } else {
                            if (sp3.c(xmlPullParser2, "PlaybackRate")) {
                                String attributeValue11 = xmlPullParser2.getAttributeValue(null, str78);
                                f8 = attributeValue11 == null ? -3.4028235E38f : Float.parseFloat(attributeValue11);
                                String attributeValue12 = xmlPullParser2.getAttributeValue(null, str77);
                                f9 = attributeValue12 == null ? -3.4028235E38f : Float.parseFloat(attributeValue12);
                            }
                            j11 = j19;
                            f4 = f8;
                            j12 = j20;
                            j13 = j21;
                            f5 = f9;
                        }
                        if (sp3.b(xmlPullParser2, str79)) {
                            j3 = j16;
                            z2 = z;
                            str3 = str80;
                            str4 = str78;
                            str5 = str79;
                            str6 = str76;
                            str7 = str77;
                            str8 = str86;
                            py2Var = new py2(j13, j11, j12, f4, f5);
                        } else {
                            j21 = j13;
                            j19 = j11;
                            j20 = j12;
                            f8 = f4;
                            f9 = f5;
                        }
                    }
                } else {
                    if (sp3.c(xmlPullParser2, str76) && !z5) {
                        if (arrayList55.isEmpty()) {
                            str8 = str86;
                            arrayList4 = arrayList;
                        } else {
                            arrayList4 = arrayList55;
                            str8 = str86;
                        }
                        String str90 = "id";
                        ArrayList arrayList57 = arrayList55;
                        String attributeValue13 = xmlPullParser2.getAttributeValue(null, "id");
                        long a6 = a(xmlPullParser2, "start", j16);
                        long j22 = j16;
                        long j23 = f6 != -9223372036854775807L ? f6 + a6 : -9223372036854775807L;
                        String str91 = str84;
                        long a7 = a(xmlPullParser2, str91, -9223372036854775807L);
                        String str92 = str76;
                        ArrayList arrayList58 = new ArrayList();
                        ArrayList arrayList59 = new ArrayList();
                        ArrayList arrayList60 = new ArrayList();
                        long j24 = -9223372036854775807L;
                        String str93 = str78;
                        String str94 = str79;
                        long j25 = j18;
                        yx2 yx2Var = null;
                        boolean z6 = false;
                        while (true) {
                            xmlPullParser.next();
                            if (sp3.c(xmlPullParser2, str85)) {
                                if (!z6) {
                                    j25 = a(xmlPullParser2, j25);
                                    z6 = true;
                                }
                                arrayList60.addAll(a(xmlPullParser2, arrayList4, z));
                                str12 = str91;
                                z2 = z;
                                str3 = str80;
                                arrayList5 = arrayList60;
                                arrayList6 = arrayList4;
                                str9 = str75;
                                str15 = str87;
                                obj = obj7;
                                obj2 = obj8;
                                str10 = str2;
                                str11 = str83;
                                str6 = str92;
                                str13 = str;
                                arrayList3 = arrayList57;
                                arrayList8 = arrayList58;
                                j3 = j22;
                                arrayList7 = arrayList59;
                                str4 = str93;
                                str5 = str94;
                                j4 = -9223372036854775807L;
                                str14 = str81;
                                str7 = str77;
                                str18 = str90;
                                str17 = str85;
                                exc = null;
                            } else {
                                String str95 = str83;
                                ArrayList arrayList61 = arrayList4;
                                String str96 = "SegmentTemplate";
                                String str97 = str77;
                                if (sp3.c(xmlPullParser2, str95)) {
                                    ArrayList arrayList62 = arrayList60;
                                    if (arrayList60.isEmpty()) {
                                        arrayList60 = arrayList61;
                                    }
                                    String attributeValue14 = xmlPullParser2.getAttributeValue(null, str90);
                                    if (attributeValue14 == null) {
                                        str22 = str91;
                                        parseInt = -1;
                                    } else {
                                        str22 = str91;
                                        parseInt = Integer.parseInt(attributeValue14);
                                    }
                                    String attributeValue15 = xmlPullParser2.getAttributeValue(null, str75);
                                    long j26 = j25;
                                    String str98 = "video";
                                    String str99 = "audio";
                                    if (TextUtils.isEmpty(attributeValue15)) {
                                        str23 = str2;
                                    } else {
                                        if ("audio".equals(attributeValue15)) {
                                            str23 = str2;
                                            str24 = null;
                                            i2 = 1;
                                        } else if ("video".equals(attributeValue15)) {
                                            str23 = str2;
                                            str24 = null;
                                            i2 = 2;
                                        } else {
                                            str23 = str2;
                                            if (str23.equals(attributeValue15)) {
                                                i2 = 3;
                                                str24 = null;
                                            }
                                        }
                                        String str100 = str;
                                        str25 = str80;
                                        String attributeValue16 = xmlPullParser2.getAttributeValue(str24, str100);
                                        str26 = str95;
                                        String attributeValue17 = xmlPullParser2.getAttributeValue(str24, "codecs");
                                        String attributeValue18 = xmlPullParser2.getAttributeValue(str24, "width");
                                        int parseInt4 = attributeValue18 != null ? -1 : Integer.parseInt(attributeValue18);
                                        String attributeValue19 = xmlPullParser2.getAttributeValue(str24, "height");
                                        int parseInt5 = attributeValue19 != null ? -1 : Integer.parseInt(attributeValue19);
                                        attributeValue = xmlPullParser2.getAttributeValue(str24, "frameRate");
                                        if (attributeValue != null) {
                                            Matcher matcher = b.matcher(attributeValue);
                                            if (matcher.matches()) {
                                                int parseInt6 = Integer.parseInt(matcher.group(1));
                                                str27 = str81;
                                                f = !TextUtils.isEmpty(matcher.group(2)) ? parseInt6 / Integer.parseInt(r0) : parseInt6;
                                                float f10 = f;
                                                String attributeValue20 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                                                int parseInt7 = attributeValue20 == null ? -1 : Integer.parseInt(attributeValue20);
                                                String attributeValue21 = xmlPullParser2.getAttributeValue(null, str87);
                                                String attributeValue22 = xmlPullParser2.getAttributeValue(null, "label");
                                                arrayList11 = new ArrayList();
                                                arrayList12 = new ArrayList();
                                                arrayList13 = new ArrayList();
                                                ArrayList arrayList63 = new ArrayList();
                                                str28 = "SegmentList";
                                                arrayList14 = new ArrayList();
                                                str29 = "SegmentBase";
                                                ArrayList arrayList64 = new ArrayList();
                                                str30 = str100;
                                                arrayList15 = new ArrayList();
                                                arrayList16 = new ArrayList();
                                                arrayList17 = arrayList63;
                                                str31 = str23;
                                                yx2 yx2Var2 = yx2Var;
                                                long j27 = j24;
                                                j7 = j26;
                                                str32 = attributeValue22;
                                                String str101 = null;
                                                int i18 = -1;
                                                str33 = str90;
                                                String str102 = attributeValue21;
                                                arrayList18 = arrayList64;
                                                int i19 = i2;
                                                boolean z7 = false;
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (sp3.c(xmlPullParser2, str85)) {
                                                        if (z7) {
                                                            j8 = j7;
                                                            z3 = z7;
                                                        } else {
                                                            j8 = a(xmlPullParser2, j7);
                                                            z3 = true;
                                                        }
                                                        arrayList16.addAll(a(xmlPullParser2, arrayList60, z));
                                                        z7 = z3;
                                                    } else {
                                                        j8 = j7;
                                                        if (sp3.c(xmlPullParser2, "ContentProtection")) {
                                                            Pair c6 = c(xmlPullParser);
                                                            Object obj9 = c6.first;
                                                            if (obj9 != null) {
                                                                str101 = (String) obj9;
                                                            }
                                                            Object obj10 = c6.second;
                                                            if (obj10 != null) {
                                                                arrayList11.add((uk0) obj10);
                                                            }
                                                        } else {
                                                            if (sp3.c(xmlPullParser2, "ContentComponent")) {
                                                                String attributeValue23 = xmlPullParser2.getAttributeValue(null, str87);
                                                                if (str102 == null) {
                                                                    str102 = attributeValue23;
                                                                } else if (attributeValue23 != null && !str102.equals(attributeValue23)) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                String attributeValue24 = xmlPullParser2.getAttributeValue(null, str75);
                                                                if (TextUtils.isEmpty(attributeValue24)) {
                                                                    str68 = str31;
                                                                } else {
                                                                    if (str99.equals(attributeValue24)) {
                                                                        arrayList52 = arrayList11;
                                                                        str68 = str31;
                                                                        i15 = 1;
                                                                    } else if (str98.equals(attributeValue24)) {
                                                                        arrayList52 = arrayList11;
                                                                        str68 = str31;
                                                                        i15 = 2;
                                                                    } else {
                                                                        str68 = str31;
                                                                        if (str68.equals(attributeValue24)) {
                                                                            arrayList52 = arrayList11;
                                                                            i15 = 3;
                                                                        }
                                                                    }
                                                                    if (i19 != -1) {
                                                                        i19 = i15;
                                                                    } else if (i15 != -1 && i19 != i15) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    z2 = z;
                                                                    arrayList20 = arrayList16;
                                                                    obj = obj7;
                                                                    arrayList21 = arrayList52;
                                                                    obj2 = obj8;
                                                                    arrayList6 = arrayList61;
                                                                    str16 = str92;
                                                                    str34 = str25;
                                                                    arrayList3 = arrayList57;
                                                                    arrayList22 = arrayList58;
                                                                    j3 = j22;
                                                                    arrayList23 = arrayList59;
                                                                    str43 = str96;
                                                                    str7 = str97;
                                                                    arrayList5 = arrayList62;
                                                                    str35 = str22;
                                                                    str37 = str27;
                                                                    str38 = str33;
                                                                    arrayList30 = arrayList12;
                                                                    arrayList28 = arrayList18;
                                                                    str13 = str30;
                                                                    arrayList25 = arrayList15;
                                                                    str45 = str32;
                                                                    arrayList26 = arrayList17;
                                                                    arrayList27 = arrayList13;
                                                                    str40 = str98;
                                                                    str44 = str99;
                                                                    arrayList24 = arrayList60;
                                                                    arrayList29 = arrayList14;
                                                                    str9 = str75;
                                                                    str15 = str87;
                                                                    str17 = str85;
                                                                    str4 = str93;
                                                                    str5 = str94;
                                                                    j5 = j26;
                                                                    str46 = str26;
                                                                    str39 = str28;
                                                                    str42 = str29;
                                                                    str10 = str68;
                                                                }
                                                                arrayList52 = arrayList11;
                                                                i15 = -1;
                                                                if (i19 != -1) {
                                                                }
                                                                z2 = z;
                                                                arrayList20 = arrayList16;
                                                                obj = obj7;
                                                                arrayList21 = arrayList52;
                                                                obj2 = obj8;
                                                                arrayList6 = arrayList61;
                                                                str16 = str92;
                                                                str34 = str25;
                                                                arrayList3 = arrayList57;
                                                                arrayList22 = arrayList58;
                                                                j3 = j22;
                                                                arrayList23 = arrayList59;
                                                                str43 = str96;
                                                                str7 = str97;
                                                                arrayList5 = arrayList62;
                                                                str35 = str22;
                                                                str37 = str27;
                                                                str38 = str33;
                                                                arrayList30 = arrayList12;
                                                                arrayList28 = arrayList18;
                                                                str13 = str30;
                                                                arrayList25 = arrayList15;
                                                                str45 = str32;
                                                                arrayList26 = arrayList17;
                                                                arrayList27 = arrayList13;
                                                                str40 = str98;
                                                                str44 = str99;
                                                                arrayList24 = arrayList60;
                                                                arrayList29 = arrayList14;
                                                                str9 = str75;
                                                                str15 = str87;
                                                                str17 = str85;
                                                                str4 = str93;
                                                                str5 = str94;
                                                                j5 = j26;
                                                                str46 = str26;
                                                                str39 = str28;
                                                                str42 = str29;
                                                                str10 = str68;
                                                            } else {
                                                                ArrayList arrayList65 = arrayList11;
                                                                String str103 = str31;
                                                                if (sp3.c(xmlPullParser2, "Role")) {
                                                                    arrayList19 = arrayList17;
                                                                    arrayList19.add(a(xmlPullParser2, "Role"));
                                                                } else {
                                                                    arrayList19 = arrayList17;
                                                                    if (sp3.c(xmlPullParser2, "AudioChannelConfiguration")) {
                                                                        i18 = b(xmlPullParser);
                                                                        z2 = z;
                                                                        arrayList20 = arrayList16;
                                                                        str15 = str87;
                                                                        obj = obj7;
                                                                        arrayList21 = arrayList65;
                                                                        obj2 = obj8;
                                                                        arrayList6 = arrayList61;
                                                                        str16 = str92;
                                                                        str34 = str25;
                                                                        arrayList3 = arrayList57;
                                                                        arrayList22 = arrayList58;
                                                                        j3 = j22;
                                                                        arrayList23 = arrayList59;
                                                                        str43 = str96;
                                                                        str7 = str97;
                                                                        arrayList5 = arrayList62;
                                                                        str35 = str22;
                                                                        str37 = str27;
                                                                        str38 = str33;
                                                                        arrayList30 = arrayList12;
                                                                        arrayList28 = arrayList18;
                                                                        str39 = str28;
                                                                        str13 = str30;
                                                                        arrayList25 = arrayList15;
                                                                        str10 = str103;
                                                                        arrayList26 = arrayList19;
                                                                        arrayList27 = arrayList13;
                                                                        str40 = str98;
                                                                        str44 = str99;
                                                                        arrayList24 = arrayList60;
                                                                        arrayList29 = arrayList14;
                                                                        str9 = str75;
                                                                        str17 = str85;
                                                                        str4 = str93;
                                                                        str5 = str94;
                                                                        j5 = j26;
                                                                        str46 = str26;
                                                                        str42 = str29;
                                                                        str45 = str32;
                                                                        j7 = j8;
                                                                    } else if (sp3.c(xmlPullParser2, "Accessibility")) {
                                                                        arrayList13.add(a(xmlPullParser2, "Accessibility"));
                                                                    } else if (sp3.c(xmlPullParser2, "EssentialProperty")) {
                                                                        arrayList14.add(a(xmlPullParser2, "EssentialProperty"));
                                                                    } else {
                                                                        str15 = str87;
                                                                        if (!sp3.c(xmlPullParser2, "SupplementalProperty")) {
                                                                            String str104 = str103;
                                                                            ArrayList arrayList66 = arrayList18;
                                                                            ArrayList arrayList67 = arrayList60;
                                                                            ArrayList arrayList68 = arrayList66;
                                                                            String str105 = "SupplementalProperty";
                                                                            if (sp3.c(xmlPullParser2, "Representation")) {
                                                                                String str106 = str75;
                                                                                String str107 = "InbandEventStream";
                                                                                if (arrayList16.isEmpty()) {
                                                                                    arrayList31 = arrayList67;
                                                                                    str47 = null;
                                                                                } else {
                                                                                    str47 = null;
                                                                                    arrayList31 = arrayList16;
                                                                                }
                                                                                String str108 = str33;
                                                                                String str109 = str102;
                                                                                String attributeValue25 = xmlPullParser2.getAttributeValue(str47, str108);
                                                                                String str110 = "EssentialProperty";
                                                                                String attributeValue26 = xmlPullParser2.getAttributeValue(str47, "bandwidth");
                                                                                int parseInt8 = attributeValue26 == null ? -1 : Integer.parseInt(attributeValue26);
                                                                                String str111 = str30;
                                                                                ArrayList arrayList69 = arrayList16;
                                                                                String str112 = str111;
                                                                                String attributeValue27 = xmlPullParser2.getAttributeValue(str47, str112);
                                                                                int i20 = parseInt8;
                                                                                String str113 = attributeValue27 == null ? attributeValue16 : attributeValue27;
                                                                                String attributeValue28 = xmlPullParser2.getAttributeValue(str47, "codecs");
                                                                                String str114 = attributeValue28 == null ? attributeValue17 : attributeValue28;
                                                                                String attributeValue29 = xmlPullParser2.getAttributeValue(str47, "width");
                                                                                int parseInt9 = attributeValue29 == null ? parseInt4 : Integer.parseInt(attributeValue29);
                                                                                String attributeValue30 = xmlPullParser2.getAttributeValue(str47, "height");
                                                                                int parseInt10 = attributeValue30 == null ? parseInt5 : Integer.parseInt(attributeValue30);
                                                                                String attributeValue31 = xmlPullParser2.getAttributeValue(str47, "frameRate");
                                                                                if (attributeValue31 != null) {
                                                                                    Matcher matcher2 = b.matcher(attributeValue31);
                                                                                    if (matcher2.matches()) {
                                                                                        int parseInt11 = Integer.parseInt(matcher2.group(1));
                                                                                        arrayList32 = arrayList19;
                                                                                        f2 = !TextUtils.isEmpty(matcher2.group(2)) ? parseInt11 / Integer.parseInt(r0) : parseInt11;
                                                                                        attributeValue2 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                                                                                        if (attributeValue2 != null) {
                                                                                            str48 = attributeValue25;
                                                                                            parseInt2 = parseInt7;
                                                                                        } else {
                                                                                            parseInt2 = Integer.parseInt(attributeValue2);
                                                                                            str48 = attributeValue25;
                                                                                        }
                                                                                        arrayList33 = new ArrayList();
                                                                                        arrayList34 = new ArrayList();
                                                                                        arrayList35 = new ArrayList(arrayList14);
                                                                                        arrayList36 = new ArrayList(arrayList68);
                                                                                        arrayList37 = new ArrayList();
                                                                                        String str115 = null;
                                                                                        str49 = str108;
                                                                                        arrayList38 = arrayList14;
                                                                                        yx2 yx2Var3 = yx2Var2;
                                                                                        long j28 = j27;
                                                                                        i4 = i18;
                                                                                        long j29 = j8;
                                                                                        boolean z8 = false;
                                                                                        while (true) {
                                                                                            xmlPullParser.next();
                                                                                            if (!sp3.c(xmlPullParser2, str85)) {
                                                                                                if (!z8) {
                                                                                                    j29 = a(xmlPullParser2, j29);
                                                                                                    z8 = true;
                                                                                                }
                                                                                                arrayList37.addAll(a(xmlPullParser2, arrayList31, z));
                                                                                            } else if (sp3.c(xmlPullParser2, "AudioChannelConfiguration")) {
                                                                                                i4 = b(xmlPullParser);
                                                                                            } else {
                                                                                                String str116 = str29;
                                                                                                if (sp3.c(xmlPullParser2, str116)) {
                                                                                                    yx2Var3 = a(xmlPullParser2, (xx2) yx2Var3);
                                                                                                    f3 = f2;
                                                                                                    str51 = str116;
                                                                                                    z2 = z;
                                                                                                    str52 = str98;
                                                                                                    i5 = i19;
                                                                                                    arrayList39 = arrayList31;
                                                                                                    obj3 = obj7;
                                                                                                    arrayList21 = arrayList65;
                                                                                                    arrayList6 = arrayList61;
                                                                                                    str16 = str92;
                                                                                                    str34 = str25;
                                                                                                    arrayList3 = arrayList57;
                                                                                                    arrayList22 = arrayList58;
                                                                                                    arrayList23 = arrayList59;
                                                                                                    str7 = str97;
                                                                                                    arrayList5 = arrayList62;
                                                                                                    str35 = str22;
                                                                                                    str53 = str26;
                                                                                                    str37 = str27;
                                                                                                    str54 = str109;
                                                                                                    arrayList40 = arrayList12;
                                                                                                    arrayList24 = arrayList67;
                                                                                                    str50 = str28;
                                                                                                    i6 = parseInt2;
                                                                                                    arrayList20 = arrayList69;
                                                                                                    arrayList41 = arrayList15;
                                                                                                    str10 = str104;
                                                                                                    str58 = str107;
                                                                                                    str9 = str106;
                                                                                                    str59 = str110;
                                                                                                    i7 = parseInt9;
                                                                                                    i8 = parseInt10;
                                                                                                    arrayList45 = arrayList33;
                                                                                                    arrayList29 = arrayList38;
                                                                                                    str38 = str49;
                                                                                                    i9 = i4;
                                                                                                    str13 = str112;
                                                                                                    arrayList42 = arrayList13;
                                                                                                    str55 = str99;
                                                                                                    arrayList28 = arrayList68;
                                                                                                    arrayList44 = arrayList37;
                                                                                                    obj4 = obj8;
                                                                                                    str4 = str93;
                                                                                                    str5 = str94;
                                                                                                    str56 = str96;
                                                                                                    j5 = j26;
                                                                                                    str60 = str105;
                                                                                                    arrayList49 = arrayList35;
                                                                                                    arrayList50 = arrayList36;
                                                                                                    long j30 = j22;
                                                                                                    str17 = str85;
                                                                                                    arrayList43 = arrayList32;
                                                                                                    j3 = j30;
                                                                                                    arrayList46 = arrayList34;
                                                                                                    if (sp3.b(xmlPullParser2, "Representation")) {
                                                                                                        String str117 = str55;
                                                                                                        if (str117.equals(vt1.c(str113))) {
                                                                                                            if (str114 == null) {
                                                                                                                str62 = str113;
                                                                                                                str61 = str52;
                                                                                                                i10 = 1;
                                                                                                            } else {
                                                                                                                int i21 = sb3.a;
                                                                                                                if (TextUtils.isEmpty(str114)) {
                                                                                                                    split2 = new String[0];
                                                                                                                } else {
                                                                                                                    split2 = str114.trim().split("(\\s*,\\s*)", -1);
                                                                                                                }
                                                                                                                for (String str118 : split2) {
                                                                                                                    String a8 = vt1.a(str118);
                                                                                                                    if (a8 != null && str117.equals(vt1.c(a8))) {
                                                                                                                        str63 = a8;
                                                                                                                        str61 = str52;
                                                                                                                        i10 = 1;
                                                                                                                        str62 = str113;
                                                                                                                    }
                                                                                                                }
                                                                                                                i10 = 1;
                                                                                                                str62 = str113;
                                                                                                                str61 = str52;
                                                                                                            }
                                                                                                            str63 = null;
                                                                                                        } else {
                                                                                                            i10 = 1;
                                                                                                            str61 = str52;
                                                                                                            if (str61.equals(vt1.c(str113))) {
                                                                                                                if (str114 != null) {
                                                                                                                    int i22 = sb3.a;
                                                                                                                    if (TextUtils.isEmpty(str114)) {
                                                                                                                        split = new String[0];
                                                                                                                    } else {
                                                                                                                        split = str114.trim().split("(\\s*,\\s*)", -1);
                                                                                                                    }
                                                                                                                    for (String str119 : split) {
                                                                                                                        String a9 = vt1.a(str119);
                                                                                                                        if (a9 != null && str61.equals(vt1.c(a9))) {
                                                                                                                            str63 = a9;
                                                                                                                            str62 = str113;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                str62 = str113;
                                                                                                            } else if (vt1.e(str113) || "image".equals(vt1.c(str113))) {
                                                                                                                str62 = str113;
                                                                                                                str63 = str62;
                                                                                                            } else {
                                                                                                                str62 = str113;
                                                                                                                if ("application/mp4".equals(str62)) {
                                                                                                                    str63 = vt1.a(str114);
                                                                                                                    if ("text/vtt".equals(str63)) {
                                                                                                                        str63 = "application/x-mp4-vtt";
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            str63 = null;
                                                                                                        }
                                                                                                        if ("audio/eac3".equals(str63)) {
                                                                                                            for (int i23 = 0; i23 < arrayList50.size(); i23 += i10) {
                                                                                                                eg0 eg0Var = (eg0) arrayList50.get(i23);
                                                                                                                String str120 = eg0Var.a;
                                                                                                                if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str120) && "JOC".equals(eg0Var.b)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str120) && "ec+3".equals(eg0Var.b))) {
                                                                                                                    str67 = "audio/eac3-joc";
                                                                                                                    str63 = str67;
                                                                                                                    if ("audio/eac3-joc".equals(str63)) {
                                                                                                                        str114 = "ec+3";
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            str67 = "audio/eac3";
                                                                                                            str63 = str67;
                                                                                                            if ("audio/eac3-joc".equals(str63)) {
                                                                                                            }
                                                                                                        }
                                                                                                        String str121 = str114;
                                                                                                        int i24 = 0;
                                                                                                        int i25 = 0;
                                                                                                        while (true) {
                                                                                                            String str122 = "urn:mpeg:dash:role:2011";
                                                                                                            if (i24 < arrayList43.size()) {
                                                                                                                ArrayList arrayList70 = arrayList43;
                                                                                                                eg0 eg0Var2 = (eg0) arrayList70.get(i24);
                                                                                                                if (lh.a("urn:mpeg:dash:role:2011", eg0Var2.a)) {
                                                                                                                    String str123 = eg0Var2.b;
                                                                                                                    if (str123 == null) {
                                                                                                                        obj5 = obj4;
                                                                                                                        obj6 = obj3;
                                                                                                                    } else {
                                                                                                                        obj5 = obj4;
                                                                                                                        if (str123.equals(obj5)) {
                                                                                                                            obj6 = obj3;
                                                                                                                        } else {
                                                                                                                            obj6 = obj3;
                                                                                                                        }
                                                                                                                        i14 = 2;
                                                                                                                        i25 = i14 | i25;
                                                                                                                    }
                                                                                                                    i14 = 0;
                                                                                                                    i25 = i14 | i25;
                                                                                                                } else {
                                                                                                                    obj5 = obj4;
                                                                                                                    obj6 = obj3;
                                                                                                                }
                                                                                                                i24++;
                                                                                                                obj3 = obj6;
                                                                                                                arrayList43 = arrayList70;
                                                                                                                obj4 = obj5;
                                                                                                            } else {
                                                                                                                ArrayList arrayList71 = arrayList43;
                                                                                                                Object obj11 = obj4;
                                                                                                                Object obj12 = obj3;
                                                                                                                ArrayList arrayList72 = arrayList46;
                                                                                                                int i26 = 0;
                                                                                                                int i27 = 0;
                                                                                                                while (i26 < arrayList71.size()) {
                                                                                                                    eg0 eg0Var3 = (eg0) arrayList71.get(i26);
                                                                                                                    ArrayList arrayList73 = arrayList71;
                                                                                                                    if (lh.a("urn:mpeg:dash:role:2011", eg0Var3.a)) {
                                                                                                                        String str124 = eg0Var3.b;
                                                                                                                        if (str124 != null) {
                                                                                                                            switch (str124.hashCode()) {
                                                                                                                                case -2060497896:
                                                                                                                                    if (str124.equals("subtitle")) {
                                                                                                                                        c4 = 0;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1724546052:
                                                                                                                                    if (str124.equals("description")) {
                                                                                                                                        c4 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1580883024:
                                                                                                                                    if (str124.equals("enhanced-audio-intelligibility")) {
                                                                                                                                        c4 = 2;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1574842690:
                                                                                                                                    if (str124.equals(obj11)) {
                                                                                                                                        c4 = 3;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1408024454:
                                                                                                                                    if (str124.equals(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE)) {
                                                                                                                                        c4 = 4;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1396432756:
                                                                                                                                    if (str124.equals(obj12)) {
                                                                                                                                        c4 = 5;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case 99825:
                                                                                                                                    if (str124.equals("dub")) {
                                                                                                                                        c4 = 6;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case 3343801:
                                                                                                                                    if (str124.equals(X3.i.Z)) {
                                                                                                                                        c4 = 7;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case 3530173:
                                                                                                                                    if (str124.equals("sign")) {
                                                                                                                                        c4 = '\b';
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case 552573414:
                                                                                                                                    if (str124.equals(ShareConstants.FEED_CAPTION_PARAM)) {
                                                                                                                                        c4 = '\t';
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case 899152809:
                                                                                                                                    if (str124.equals("commentary")) {
                                                                                                                                        c4 = '\n';
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case 1629013393:
                                                                                                                                    if (str124.equals("emergency")) {
                                                                                                                                        c4 = 11;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                case 1855372047:
                                                                                                                                    if (str124.equals("supplementary")) {
                                                                                                                                        c4 = '\f';
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    c4 = 65535;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            switch (c4) {
                                                                                                                                case 0:
                                                                                                                                case 3:
                                                                                                                                case 5:
                                                                                                                                    i13 = 128;
                                                                                                                                    break;
                                                                                                                                case 1:
                                                                                                                                    i13 = 512;
                                                                                                                                    break;
                                                                                                                                case 2:
                                                                                                                                    i13 = 2048;
                                                                                                                                    break;
                                                                                                                                case 4:
                                                                                                                                    i13 = 2;
                                                                                                                                    break;
                                                                                                                                case 6:
                                                                                                                                    i13 = 16;
                                                                                                                                    break;
                                                                                                                                case 7:
                                                                                                                                    i13 = 1;
                                                                                                                                    break;
                                                                                                                                case '\b':
                                                                                                                                    i13 = 256;
                                                                                                                                    break;
                                                                                                                                case '\t':
                                                                                                                                    i13 = 64;
                                                                                                                                    break;
                                                                                                                                case '\n':
                                                                                                                                    i13 = 8;
                                                                                                                                    break;
                                                                                                                                case 11:
                                                                                                                                    i13 = 32;
                                                                                                                                    break;
                                                                                                                                case '\f':
                                                                                                                                    i13 = 4;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            i27 |= i13;
                                                                                                                        }
                                                                                                                        i13 = 0;
                                                                                                                        i27 |= i13;
                                                                                                                    }
                                                                                                                    i26++;
                                                                                                                    arrayList71 = arrayList73;
                                                                                                                }
                                                                                                                ArrayList arrayList74 = arrayList71;
                                                                                                                int i28 = 0;
                                                                                                                int i29 = 0;
                                                                                                                while (i28 < arrayList42.size()) {
                                                                                                                    ArrayList arrayList75 = arrayList42;
                                                                                                                    ArrayList arrayList76 = arrayList45;
                                                                                                                    eg0 eg0Var4 = (eg0) arrayList75.get(i28);
                                                                                                                    arrayList42 = arrayList75;
                                                                                                                    if (lh.a(str122, eg0Var4.a)) {
                                                                                                                        String str125 = eg0Var4.b;
                                                                                                                        if (str125 != null) {
                                                                                                                            switch (str125.hashCode()) {
                                                                                                                                case -2060497896:
                                                                                                                                    if (str125.equals("subtitle")) {
                                                                                                                                        c3 = 0;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1724546052:
                                                                                                                                    if (str125.equals("description")) {
                                                                                                                                        c3 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1580883024:
                                                                                                                                    if (str125.equals("enhanced-audio-intelligibility")) {
                                                                                                                                        c3 = 2;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1574842690:
                                                                                                                                    if (str125.equals(obj11)) {
                                                                                                                                        c3 = 3;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1408024454:
                                                                                                                                    if (str125.equals(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE)) {
                                                                                                                                        c3 = 4;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case -1396432756:
                                                                                                                                    if (str125.equals(obj12)) {
                                                                                                                                        c3 = 5;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case 99825:
                                                                                                                                    if (str125.equals("dub")) {
                                                                                                                                        c3 = 6;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case 3343801:
                                                                                                                                    if (str125.equals(X3.i.Z)) {
                                                                                                                                        c3 = 7;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case 3530173:
                                                                                                                                    if (str125.equals("sign")) {
                                                                                                                                        c3 = '\b';
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case 552573414:
                                                                                                                                    if (str125.equals(ShareConstants.FEED_CAPTION_PARAM)) {
                                                                                                                                        c3 = '\t';
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case 899152809:
                                                                                                                                    if (str125.equals("commentary")) {
                                                                                                                                        c3 = '\n';
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case 1629013393:
                                                                                                                                    if (str125.equals("emergency")) {
                                                                                                                                        c3 = 11;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                case 1855372047:
                                                                                                                                    if (str125.equals("supplementary")) {
                                                                                                                                        c3 = '\f';
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    c3 = 65535;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            switch (c3) {
                                                                                                                                case 0:
                                                                                                                                case 3:
                                                                                                                                case 5:
                                                                                                                                    i12 = 128;
                                                                                                                                    str66 = str122;
                                                                                                                                    break;
                                                                                                                                case 1:
                                                                                                                                    str66 = str122;
                                                                                                                                    i12 = 512;
                                                                                                                                    break;
                                                                                                                                case 2:
                                                                                                                                    str66 = str122;
                                                                                                                                    i12 = 2048;
                                                                                                                                    break;
                                                                                                                                case 4:
                                                                                                                                    str66 = str122;
                                                                                                                                    i12 = 2;
                                                                                                                                    break;
                                                                                                                                case 6:
                                                                                                                                    i12 = 16;
                                                                                                                                    str66 = str122;
                                                                                                                                    break;
                                                                                                                                case 7:
                                                                                                                                    str66 = str122;
                                                                                                                                    i12 = 1;
                                                                                                                                    break;
                                                                                                                                case '\b':
                                                                                                                                    i12 = 256;
                                                                                                                                    str66 = str122;
                                                                                                                                    break;
                                                                                                                                case '\t':
                                                                                                                                    i12 = 64;
                                                                                                                                    str66 = str122;
                                                                                                                                    break;
                                                                                                                                case '\n':
                                                                                                                                    str66 = str122;
                                                                                                                                    i12 = 8;
                                                                                                                                    break;
                                                                                                                                case 11:
                                                                                                                                    i12 = 32;
                                                                                                                                    str66 = str122;
                                                                                                                                    break;
                                                                                                                                case '\f':
                                                                                                                                    str66 = str122;
                                                                                                                                    i12 = 4;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        str66 = str122;
                                                                                                                        i12 = 0;
                                                                                                                    } else {
                                                                                                                        str66 = str122;
                                                                                                                        if (lh.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eg0Var4.a)) {
                                                                                                                            String str126 = eg0Var4.b;
                                                                                                                            if (str126 != null) {
                                                                                                                                switch (str126.hashCode()) {
                                                                                                                                    case 49:
                                                                                                                                        if (str126.equals("1")) {
                                                                                                                                            c2 = 0;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c2 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 50:
                                                                                                                                        if (str126.equals("2")) {
                                                                                                                                            c2 = 1;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c2 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 51:
                                                                                                                                        if (str126.equals("3")) {
                                                                                                                                            c2 = 2;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c2 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 52:
                                                                                                                                        if (str126.equals("4")) {
                                                                                                                                            c2 = 3;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c2 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 53:
                                                                                                                                    default:
                                                                                                                                        c2 = 65535;
                                                                                                                                        break;
                                                                                                                                    case 54:
                                                                                                                                        if (str126.equals("6")) {
                                                                                                                                            c2 = 4;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        c2 = 65535;
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                                switch (c2) {
                                                                                                                                    case 0:
                                                                                                                                        i12 = 512;
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        i12 = 2048;
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        i12 = 4;
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        i12 = 8;
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        i12 = 1;
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i12 = 0;
                                                                                                                        } else {
                                                                                                                            i28++;
                                                                                                                            arrayList45 = arrayList76;
                                                                                                                            str122 = str66;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i29 |= i12;
                                                                                                                    i28++;
                                                                                                                    arrayList45 = arrayList76;
                                                                                                                    str122 = str66;
                                                                                                                }
                                                                                                                ArrayList arrayList77 = arrayList45;
                                                                                                                int i30 = i27 | i29;
                                                                                                                int i31 = 0;
                                                                                                                for (int i32 = 0; i32 < arrayList49.size(); i32++) {
                                                                                                                    if (lh.a("http://dashif.org/guidelines/trickmode", ((eg0) arrayList49.get(i32)).a)) {
                                                                                                                        i31 = 16384;
                                                                                                                    }
                                                                                                                }
                                                                                                                int i33 = i30 | i31;
                                                                                                                int i34 = 0;
                                                                                                                for (int i35 = 0; i35 < arrayList50.size(); i35++) {
                                                                                                                    if (lh.a("http://dashif.org/guidelines/trickmode", ((eg0) arrayList50.get(i35)).a)) {
                                                                                                                        i34 = 16384;
                                                                                                                    }
                                                                                                                }
                                                                                                                iw0 iw0Var = new iw0();
                                                                                                                iw0Var.a = str48;
                                                                                                                iw0Var.j = str62;
                                                                                                                iw0Var.k = str63;
                                                                                                                iw0Var.h = str121;
                                                                                                                iw0Var.g = i20;
                                                                                                                iw0Var.d = i25;
                                                                                                                iw0Var.e = i33 | i34;
                                                                                                                String str127 = str54;
                                                                                                                iw0Var.c = str127;
                                                                                                                if (str61.equals(vt1.c(str63))) {
                                                                                                                    iw0Var.p = i7;
                                                                                                                    iw0Var.q = i8;
                                                                                                                    iw0Var.r = f3;
                                                                                                                } else {
                                                                                                                    int i36 = i7;
                                                                                                                    int i37 = i8;
                                                                                                                    if (str117.equals(vt1.c(str63))) {
                                                                                                                        iw0Var.x = i9;
                                                                                                                        iw0Var.y = i6;
                                                                                                                    } else {
                                                                                                                        if (vt1.e(str63)) {
                                                                                                                            if ("application/cea-608".equals(str63)) {
                                                                                                                                int i38 = 0;
                                                                                                                                while (i38 < arrayList42.size()) {
                                                                                                                                    arrayList51 = arrayList42;
                                                                                                                                    eg0 eg0Var5 = (eg0) arrayList51.get(i38);
                                                                                                                                    if ("urn:scte:dash:cc:cea-608:2015".equals(eg0Var5.a) && (str65 = eg0Var5.b) != null) {
                                                                                                                                        Matcher matcher3 = c.matcher(str65);
                                                                                                                                        if (matcher3.matches()) {
                                                                                                                                            parseInt3 = Integer.parseInt(matcher3.group(1));
                                                                                                                                        } else {
                                                                                                                                            gh1.d("MpdParser", "Unable to parse CEA-608 channel number from: " + eg0Var5.b);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i38++;
                                                                                                                                    arrayList42 = arrayList51;
                                                                                                                                }
                                                                                                                                arrayList51 = arrayList42;
                                                                                                                                parseInt3 = -1;
                                                                                                                            } else {
                                                                                                                                arrayList51 = arrayList42;
                                                                                                                                if ("application/cea-708".equals(str63)) {
                                                                                                                                    for (int i39 = 0; i39 < arrayList51.size(); i39++) {
                                                                                                                                        eg0 eg0Var6 = (eg0) arrayList51.get(i39);
                                                                                                                                        if ("urn:scte:dash:cc:cea-708:2015".equals(eg0Var6.a) && (str64 = eg0Var6.b) != null) {
                                                                                                                                            Matcher matcher4 = d.matcher(str64);
                                                                                                                                            if (matcher4.matches()) {
                                                                                                                                                parseInt3 = Integer.parseInt(matcher4.group(1));
                                                                                                                                            } else {
                                                                                                                                                gh1.d("MpdParser", "Unable to parse CEA-708 service block number from: " + eg0Var6.b);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                parseInt3 = -1;
                                                                                                                            }
                                                                                                                            iw0Var.C = parseInt3;
                                                                                                                        } else {
                                                                                                                            arrayList51 = arrayList42;
                                                                                                                            if ("image".equals(vt1.c(str63))) {
                                                                                                                                iw0Var.p = i36;
                                                                                                                                iw0Var.q = i37;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        jw0 jw0Var = new jw0(iw0Var);
                                                                                                                        f30 f30Var = new f30(jw0Var, arrayList44.isEmpty() ? arrayList44 : arrayList39, yx2Var3 == null ? yx2Var3 : new xx2(), str115, arrayList77, arrayList72, arrayList49, arrayList50);
                                                                                                                        int d2 = vt1.d(jw0Var.m);
                                                                                                                        i11 = i5;
                                                                                                                        if (i11 != -1) {
                                                                                                                            if (d2 != -1 && i11 != d2) {
                                                                                                                                throw new IllegalStateException();
                                                                                                                            }
                                                                                                                            d2 = i11;
                                                                                                                        }
                                                                                                                        ArrayList arrayList78 = arrayList41;
                                                                                                                        arrayList78.add(f30Var);
                                                                                                                        arrayList27 = arrayList51;
                                                                                                                        arrayList25 = arrayList78;
                                                                                                                        str40 = str61;
                                                                                                                        str44 = str117;
                                                                                                                        obj2 = obj11;
                                                                                                                        str102 = str127;
                                                                                                                        arrayList26 = arrayList74;
                                                                                                                        str43 = str56;
                                                                                                                        str45 = str32;
                                                                                                                        arrayList30 = arrayList40;
                                                                                                                        str42 = str51;
                                                                                                                        str39 = str50;
                                                                                                                        str46 = str53;
                                                                                                                        xmlPullParser2 = xmlPullParser;
                                                                                                                        obj = obj12;
                                                                                                                        i19 = d2;
                                                                                                                    }
                                                                                                                }
                                                                                                                arrayList51 = arrayList42;
                                                                                                                jw0 jw0Var2 = new jw0(iw0Var);
                                                                                                                if (yx2Var3 == null) {
                                                                                                                }
                                                                                                                f30 f30Var2 = new f30(jw0Var2, arrayList44.isEmpty() ? arrayList44 : arrayList39, yx2Var3 == null ? yx2Var3 : new xx2(), str115, arrayList77, arrayList72, arrayList49, arrayList50);
                                                                                                                int d22 = vt1.d(jw0Var2.m);
                                                                                                                i11 = i5;
                                                                                                                if (i11 != -1) {
                                                                                                                }
                                                                                                                ArrayList arrayList782 = arrayList41;
                                                                                                                arrayList782.add(f30Var2);
                                                                                                                arrayList27 = arrayList51;
                                                                                                                arrayList25 = arrayList782;
                                                                                                                str40 = str61;
                                                                                                                str44 = str117;
                                                                                                                obj2 = obj11;
                                                                                                                str102 = str127;
                                                                                                                arrayList26 = arrayList74;
                                                                                                                str43 = str56;
                                                                                                                str45 = str32;
                                                                                                                arrayList30 = arrayList40;
                                                                                                                str42 = str51;
                                                                                                                str39 = str50;
                                                                                                                str46 = str53;
                                                                                                                xmlPullParser2 = xmlPullParser;
                                                                                                                obj = obj12;
                                                                                                                i19 = d22;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        xmlPullParser2 = xmlPullParser;
                                                                                                        i4 = i9;
                                                                                                        str107 = str58;
                                                                                                        str110 = str59;
                                                                                                        str105 = str60;
                                                                                                        arrayList35 = arrayList49;
                                                                                                        arrayList36 = arrayList50;
                                                                                                        str99 = str55;
                                                                                                        arrayList34 = arrayList46;
                                                                                                        z = z2;
                                                                                                        arrayList13 = arrayList42;
                                                                                                        arrayList67 = arrayList24;
                                                                                                        arrayList38 = arrayList29;
                                                                                                        arrayList68 = arrayList28;
                                                                                                        str85 = str17;
                                                                                                        arrayList33 = arrayList45;
                                                                                                        str96 = str56;
                                                                                                        arrayList37 = arrayList44;
                                                                                                        parseInt2 = i6;
                                                                                                        str112 = str13;
                                                                                                        str106 = str9;
                                                                                                        obj8 = obj4;
                                                                                                        arrayList31 = arrayList39;
                                                                                                        parseInt9 = i7;
                                                                                                        parseInt10 = i8;
                                                                                                        f2 = f3;
                                                                                                        arrayList12 = arrayList40;
                                                                                                        str27 = str37;
                                                                                                        str25 = str34;
                                                                                                        str98 = str52;
                                                                                                        i19 = i5;
                                                                                                        arrayList58 = arrayList22;
                                                                                                        str29 = str51;
                                                                                                        str92 = str16;
                                                                                                        str49 = str38;
                                                                                                        str109 = str54;
                                                                                                        str22 = str35;
                                                                                                        str26 = str53;
                                                                                                        arrayList61 = arrayList6;
                                                                                                        arrayList57 = arrayList3;
                                                                                                        arrayList62 = arrayList5;
                                                                                                        str97 = str7;
                                                                                                        j26 = j5;
                                                                                                        str104 = str10;
                                                                                                        str94 = str5;
                                                                                                        str93 = str4;
                                                                                                        arrayList65 = arrayList21;
                                                                                                        obj7 = obj3;
                                                                                                        arrayList15 = arrayList41;
                                                                                                        arrayList59 = arrayList23;
                                                                                                        str28 = str50;
                                                                                                        arrayList69 = arrayList20;
                                                                                                        long j31 = j3;
                                                                                                        arrayList32 = arrayList43;
                                                                                                        j22 = j31;
                                                                                                    }
                                                                                                } else {
                                                                                                    int i40 = parseInt2;
                                                                                                    String str128 = str28;
                                                                                                    if (sp3.c(xmlPullParser2, str128)) {
                                                                                                        j28 = a(xmlPullParser2, j28);
                                                                                                        arrayList39 = arrayList31;
                                                                                                        long j32 = j22;
                                                                                                        str17 = str85;
                                                                                                        arrayList43 = arrayList32;
                                                                                                        j3 = j32;
                                                                                                        i6 = i40;
                                                                                                        f3 = f2;
                                                                                                        str10 = str104;
                                                                                                        i7 = parseInt9;
                                                                                                        i8 = parseInt10;
                                                                                                        z2 = z;
                                                                                                        obj4 = obj8;
                                                                                                        obj3 = obj7;
                                                                                                        arrayList21 = arrayList65;
                                                                                                        arrayList3 = arrayList57;
                                                                                                        str34 = str25;
                                                                                                        str37 = str27;
                                                                                                        arrayList40 = arrayList12;
                                                                                                        arrayList20 = arrayList69;
                                                                                                        arrayList41 = arrayList15;
                                                                                                        str13 = str112;
                                                                                                        arrayList42 = arrayList13;
                                                                                                        str52 = str98;
                                                                                                        str4 = str93;
                                                                                                        str5 = str94;
                                                                                                        j5 = j26;
                                                                                                        i5 = i19;
                                                                                                        str51 = str116;
                                                                                                        str16 = str92;
                                                                                                        arrayList22 = arrayList58;
                                                                                                        arrayList23 = arrayList59;
                                                                                                        str7 = str97;
                                                                                                        arrayList5 = arrayList62;
                                                                                                        arrayList24 = arrayList67;
                                                                                                        arrayList28 = arrayList68;
                                                                                                        str50 = str128;
                                                                                                        arrayList6 = arrayList61;
                                                                                                        str53 = str26;
                                                                                                        str35 = str22;
                                                                                                        str54 = str109;
                                                                                                        arrayList29 = arrayList38;
                                                                                                        str38 = str49;
                                                                                                        str55 = str99;
                                                                                                        yx2Var3 = a(xmlPullParser, (ux2) yx2Var3, j23, a7, j29, j28, a3);
                                                                                                        arrayList44 = arrayList37;
                                                                                                        str56 = str96;
                                                                                                        str59 = str110;
                                                                                                        j29 = j29;
                                                                                                        str60 = str105;
                                                                                                        str58 = str107;
                                                                                                        str9 = str106;
                                                                                                        arrayList45 = arrayList33;
                                                                                                        arrayList46 = arrayList34;
                                                                                                        arrayList49 = arrayList35;
                                                                                                        arrayList50 = arrayList36;
                                                                                                    } else {
                                                                                                        str50 = str128;
                                                                                                        f3 = f2;
                                                                                                        str51 = str116;
                                                                                                        z2 = z;
                                                                                                        str52 = str98;
                                                                                                        i5 = i19;
                                                                                                        arrayList39 = arrayList31;
                                                                                                        obj3 = obj7;
                                                                                                        arrayList21 = arrayList65;
                                                                                                        arrayList6 = arrayList61;
                                                                                                        str16 = str92;
                                                                                                        str34 = str25;
                                                                                                        arrayList3 = arrayList57;
                                                                                                        arrayList22 = arrayList58;
                                                                                                        arrayList23 = arrayList59;
                                                                                                        String str129 = str96;
                                                                                                        str7 = str97;
                                                                                                        arrayList5 = arrayList62;
                                                                                                        str35 = str22;
                                                                                                        str53 = str26;
                                                                                                        str37 = str27;
                                                                                                        str54 = str109;
                                                                                                        arrayList40 = arrayList12;
                                                                                                        arrayList24 = arrayList67;
                                                                                                        i6 = i40;
                                                                                                        arrayList20 = arrayList69;
                                                                                                        arrayList41 = arrayList15;
                                                                                                        str10 = str104;
                                                                                                        i7 = parseInt9;
                                                                                                        i8 = parseInt10;
                                                                                                        arrayList29 = arrayList38;
                                                                                                        str38 = str49;
                                                                                                        long j33 = j28;
                                                                                                        str13 = str112;
                                                                                                        arrayList42 = arrayList13;
                                                                                                        str55 = str99;
                                                                                                        arrayList28 = arrayList68;
                                                                                                        long j34 = j29;
                                                                                                        obj4 = obj8;
                                                                                                        str4 = str93;
                                                                                                        str5 = str94;
                                                                                                        j5 = j26;
                                                                                                        long j35 = j22;
                                                                                                        str17 = str85;
                                                                                                        arrayList43 = arrayList32;
                                                                                                        j3 = j35;
                                                                                                        String str130 = str110;
                                                                                                        if (sp3.c(xmlPullParser2, str129)) {
                                                                                                            j28 = a(xmlPullParser2, j33);
                                                                                                            arrayList44 = arrayList37;
                                                                                                            str56 = str129;
                                                                                                            str57 = str130;
                                                                                                            str9 = str106;
                                                                                                            arrayList45 = arrayList33;
                                                                                                            arrayList46 = arrayList34;
                                                                                                            arrayList47 = arrayList35;
                                                                                                            arrayList48 = arrayList36;
                                                                                                            yx2Var3 = a(xmlPullParser, (vx2) yx2Var3, arrayList28, j23, a7, j34, j28, a3);
                                                                                                        } else {
                                                                                                            arrayList44 = arrayList37;
                                                                                                            str56 = str129;
                                                                                                            str57 = str130;
                                                                                                            str9 = str106;
                                                                                                            arrayList45 = arrayList33;
                                                                                                            arrayList46 = arrayList34;
                                                                                                            arrayList47 = arrayList35;
                                                                                                            arrayList48 = arrayList36;
                                                                                                            if (sp3.c(xmlPullParser2, "ContentProtection")) {
                                                                                                                Pair c7 = c(xmlPullParser);
                                                                                                                Object obj13 = c7.first;
                                                                                                                if (obj13 != null) {
                                                                                                                    str115 = (String) obj13;
                                                                                                                }
                                                                                                                Object obj14 = c7.second;
                                                                                                                if (obj14 != null) {
                                                                                                                    arrayList45.add((uk0) obj14);
                                                                                                                }
                                                                                                                j28 = j33;
                                                                                                            } else {
                                                                                                                str58 = str107;
                                                                                                                if (sp3.c(xmlPullParser2, str58)) {
                                                                                                                    arrayList46.add(a(xmlPullParser2, str58));
                                                                                                                    str60 = str105;
                                                                                                                    str59 = str57;
                                                                                                                    arrayList49 = arrayList47;
                                                                                                                } else {
                                                                                                                    str59 = str57;
                                                                                                                    if (sp3.c(xmlPullParser2, str59)) {
                                                                                                                        arrayList49 = arrayList47;
                                                                                                                        arrayList49.add(a(xmlPullParser2, str59));
                                                                                                                        str60 = str105;
                                                                                                                    } else {
                                                                                                                        str60 = str105;
                                                                                                                        arrayList49 = arrayList47;
                                                                                                                        if (sp3.c(xmlPullParser2, str60)) {
                                                                                                                            arrayList50 = arrayList48;
                                                                                                                            arrayList50.add(a(xmlPullParser2, str60));
                                                                                                                        } else {
                                                                                                                            arrayList50 = arrayList48;
                                                                                                                            a(xmlPullParser);
                                                                                                                        }
                                                                                                                        j28 = j33;
                                                                                                                        j29 = j34;
                                                                                                                    }
                                                                                                                }
                                                                                                                arrayList50 = arrayList48;
                                                                                                                j28 = j33;
                                                                                                                j29 = j34;
                                                                                                            }
                                                                                                        }
                                                                                                        j29 = j34;
                                                                                                        str60 = str105;
                                                                                                        str58 = str107;
                                                                                                        str59 = str57;
                                                                                                        i9 = i4;
                                                                                                        arrayList49 = arrayList47;
                                                                                                        arrayList50 = arrayList48;
                                                                                                        if (sp3.b(xmlPullParser2, "Representation")) {
                                                                                                        }
                                                                                                    }
                                                                                                    i9 = i4;
                                                                                                    if (sp3.b(xmlPullParser2, "Representation")) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            i6 = parseInt2;
                                                                                            f3 = f2;
                                                                                            z2 = z;
                                                                                            str52 = str98;
                                                                                            i5 = i19;
                                                                                            arrayList39 = arrayList31;
                                                                                            obj3 = obj7;
                                                                                            arrayList21 = arrayList65;
                                                                                            arrayList6 = arrayList61;
                                                                                            str16 = str92;
                                                                                            str34 = str25;
                                                                                            arrayList3 = arrayList57;
                                                                                            arrayList22 = arrayList58;
                                                                                            arrayList23 = arrayList59;
                                                                                            str7 = str97;
                                                                                            arrayList5 = arrayList62;
                                                                                            str35 = str22;
                                                                                            str53 = str26;
                                                                                            str37 = str27;
                                                                                            str54 = str109;
                                                                                            arrayList40 = arrayList12;
                                                                                            arrayList24 = arrayList67;
                                                                                            str50 = str28;
                                                                                            str51 = str29;
                                                                                            arrayList20 = arrayList69;
                                                                                            arrayList41 = arrayList15;
                                                                                            str10 = str104;
                                                                                            str58 = str107;
                                                                                            str9 = str106;
                                                                                            str59 = str110;
                                                                                            i7 = parseInt9;
                                                                                            i8 = parseInt10;
                                                                                            arrayList45 = arrayList33;
                                                                                            arrayList29 = arrayList38;
                                                                                            str38 = str49;
                                                                                            i9 = i4;
                                                                                            str13 = str112;
                                                                                            arrayList42 = arrayList13;
                                                                                            str55 = str99;
                                                                                            arrayList28 = arrayList68;
                                                                                            arrayList44 = arrayList37;
                                                                                            obj4 = obj8;
                                                                                            str4 = str93;
                                                                                            str5 = str94;
                                                                                            str56 = str96;
                                                                                            j5 = j26;
                                                                                            str60 = str105;
                                                                                            arrayList49 = arrayList35;
                                                                                            arrayList50 = arrayList36;
                                                                                            long j302 = j22;
                                                                                            str17 = str85;
                                                                                            arrayList43 = arrayList32;
                                                                                            j3 = j302;
                                                                                            arrayList46 = arrayList34;
                                                                                            if (sp3.b(xmlPullParser2, "Representation")) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                arrayList32 = arrayList19;
                                                                                f2 = f10;
                                                                                attributeValue2 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                                                                                if (attributeValue2 != null) {
                                                                                }
                                                                                arrayList33 = new ArrayList();
                                                                                arrayList34 = new ArrayList();
                                                                                arrayList35 = new ArrayList(arrayList14);
                                                                                arrayList36 = new ArrayList(arrayList68);
                                                                                arrayList37 = new ArrayList();
                                                                                String str1152 = null;
                                                                                str49 = str108;
                                                                                arrayList38 = arrayList14;
                                                                                yx2 yx2Var32 = yx2Var2;
                                                                                long j282 = j27;
                                                                                i4 = i18;
                                                                                long j292 = j8;
                                                                                boolean z82 = false;
                                                                                while (true) {
                                                                                    xmlPullParser.next();
                                                                                    if (!sp3.c(xmlPullParser2, str85)) {
                                                                                    }
                                                                                    i6 = parseInt2;
                                                                                    f3 = f2;
                                                                                    z2 = z;
                                                                                    str52 = str98;
                                                                                    i5 = i19;
                                                                                    arrayList39 = arrayList31;
                                                                                    obj3 = obj7;
                                                                                    arrayList21 = arrayList65;
                                                                                    arrayList6 = arrayList61;
                                                                                    str16 = str92;
                                                                                    str34 = str25;
                                                                                    arrayList3 = arrayList57;
                                                                                    arrayList22 = arrayList58;
                                                                                    arrayList23 = arrayList59;
                                                                                    str7 = str97;
                                                                                    arrayList5 = arrayList62;
                                                                                    str35 = str22;
                                                                                    str53 = str26;
                                                                                    str37 = str27;
                                                                                    str54 = str109;
                                                                                    arrayList40 = arrayList12;
                                                                                    arrayList24 = arrayList67;
                                                                                    str50 = str28;
                                                                                    str51 = str29;
                                                                                    arrayList20 = arrayList69;
                                                                                    arrayList41 = arrayList15;
                                                                                    str10 = str104;
                                                                                    str58 = str107;
                                                                                    str9 = str106;
                                                                                    str59 = str110;
                                                                                    i7 = parseInt9;
                                                                                    i8 = parseInt10;
                                                                                    arrayList45 = arrayList33;
                                                                                    arrayList29 = arrayList38;
                                                                                    str38 = str49;
                                                                                    i9 = i4;
                                                                                    str13 = str112;
                                                                                    arrayList42 = arrayList13;
                                                                                    str55 = str99;
                                                                                    arrayList28 = arrayList68;
                                                                                    arrayList44 = arrayList37;
                                                                                    obj4 = obj8;
                                                                                    str4 = str93;
                                                                                    str5 = str94;
                                                                                    str56 = str96;
                                                                                    j5 = j26;
                                                                                    str60 = str105;
                                                                                    arrayList49 = arrayList35;
                                                                                    arrayList50 = arrayList36;
                                                                                    long j3022 = j22;
                                                                                    str17 = str85;
                                                                                    arrayList43 = arrayList32;
                                                                                    j3 = j3022;
                                                                                    arrayList46 = arrayList34;
                                                                                    if (sp3.b(xmlPullParser2, "Representation")) {
                                                                                    }
                                                                                    xmlPullParser2 = xmlPullParser;
                                                                                    i4 = i9;
                                                                                    str107 = str58;
                                                                                    str110 = str59;
                                                                                    str105 = str60;
                                                                                    arrayList35 = arrayList49;
                                                                                    arrayList36 = arrayList50;
                                                                                    str99 = str55;
                                                                                    arrayList34 = arrayList46;
                                                                                    z = z2;
                                                                                    arrayList13 = arrayList42;
                                                                                    arrayList67 = arrayList24;
                                                                                    arrayList38 = arrayList29;
                                                                                    arrayList68 = arrayList28;
                                                                                    str85 = str17;
                                                                                    arrayList33 = arrayList45;
                                                                                    str96 = str56;
                                                                                    arrayList37 = arrayList44;
                                                                                    parseInt2 = i6;
                                                                                    str112 = str13;
                                                                                    str106 = str9;
                                                                                    obj8 = obj4;
                                                                                    arrayList31 = arrayList39;
                                                                                    parseInt9 = i7;
                                                                                    parseInt10 = i8;
                                                                                    f2 = f3;
                                                                                    arrayList12 = arrayList40;
                                                                                    str27 = str37;
                                                                                    str25 = str34;
                                                                                    str98 = str52;
                                                                                    i19 = i5;
                                                                                    arrayList58 = arrayList22;
                                                                                    str29 = str51;
                                                                                    str92 = str16;
                                                                                    str49 = str38;
                                                                                    str109 = str54;
                                                                                    str22 = str35;
                                                                                    str26 = str53;
                                                                                    arrayList61 = arrayList6;
                                                                                    arrayList57 = arrayList3;
                                                                                    arrayList62 = arrayList5;
                                                                                    str97 = str7;
                                                                                    j26 = j5;
                                                                                    str104 = str10;
                                                                                    str94 = str5;
                                                                                    str93 = str4;
                                                                                    arrayList65 = arrayList21;
                                                                                    obj7 = obj3;
                                                                                    arrayList15 = arrayList41;
                                                                                    arrayList59 = arrayList23;
                                                                                    str28 = str50;
                                                                                    arrayList69 = arrayList20;
                                                                                    long j312 = j3;
                                                                                    arrayList32 = arrayList43;
                                                                                    j22 = j312;
                                                                                }
                                                                            } else {
                                                                                z2 = z;
                                                                                arrayList20 = arrayList16;
                                                                                arrayList21 = arrayList65;
                                                                                arrayList6 = arrayList61;
                                                                                str16 = str92;
                                                                                str34 = str25;
                                                                                arrayList22 = arrayList58;
                                                                                j3 = j22;
                                                                                arrayList23 = arrayList59;
                                                                                str7 = str97;
                                                                                arrayList5 = arrayList62;
                                                                                str35 = str22;
                                                                                str36 = str26;
                                                                                str37 = str27;
                                                                                str38 = str33;
                                                                                ArrayList arrayList79 = arrayList12;
                                                                                arrayList24 = arrayList67;
                                                                                String str131 = str28;
                                                                                str13 = str30;
                                                                                arrayList25 = arrayList15;
                                                                                str10 = str104;
                                                                                arrayList26 = arrayList19;
                                                                                arrayList27 = arrayList13;
                                                                                arrayList28 = arrayList68;
                                                                                int i41 = i19;
                                                                                str9 = str75;
                                                                                str17 = str85;
                                                                                Object obj15 = obj7;
                                                                                arrayList3 = arrayList57;
                                                                                str4 = str93;
                                                                                str5 = str94;
                                                                                String str132 = str96;
                                                                                j5 = j26;
                                                                                String str133 = str99;
                                                                                String str134 = str102;
                                                                                arrayList29 = arrayList14;
                                                                                XmlPullParser xmlPullParser3 = xmlPullParser2;
                                                                                Object obj16 = obj8;
                                                                                String str135 = str29;
                                                                                if (sp3.c(xmlPullParser3, str135)) {
                                                                                    yx2Var2 = a(xmlPullParser3, (xx2) yx2Var2);
                                                                                    str40 = str98;
                                                                                    obj = obj15;
                                                                                    str44 = str133;
                                                                                    obj2 = obj16;
                                                                                    str43 = str132;
                                                                                    str45 = str32;
                                                                                    j7 = j8;
                                                                                    arrayList30 = arrayList79;
                                                                                    str39 = str131;
                                                                                    i19 = i41;
                                                                                    xmlPullParser2 = xmlPullParser3;
                                                                                    str102 = str134;
                                                                                    str42 = str135;
                                                                                    str46 = str36;
                                                                                    if (sp3.b(xmlPullParser2, str46)) {
                                                                                        arrayList12 = arrayList30;
                                                                                        str26 = str46;
                                                                                        str29 = str42;
                                                                                        arrayList62 = arrayList5;
                                                                                        z = z2;
                                                                                        str32 = str45;
                                                                                        arrayList13 = arrayList27;
                                                                                        arrayList60 = arrayList24;
                                                                                        arrayList14 = arrayList29;
                                                                                        arrayList18 = arrayList28;
                                                                                        str98 = str40;
                                                                                        str85 = str17;
                                                                                        str97 = str7;
                                                                                        j26 = j5;
                                                                                        arrayList16 = arrayList20;
                                                                                        str99 = str44;
                                                                                        str75 = str9;
                                                                                        str31 = str10;
                                                                                        str94 = str5;
                                                                                        str93 = str4;
                                                                                        obj8 = obj2;
                                                                                        arrayList11 = arrayList21;
                                                                                        arrayList15 = arrayList25;
                                                                                        arrayList58 = arrayList22;
                                                                                        arrayList59 = arrayList23;
                                                                                        str92 = str16;
                                                                                        str33 = str38;
                                                                                        str22 = str35;
                                                                                        str96 = str43;
                                                                                        str28 = str39;
                                                                                        arrayList61 = arrayList6;
                                                                                        arrayList57 = arrayList3;
                                                                                        j22 = j3;
                                                                                        obj7 = obj;
                                                                                        str30 = str13;
                                                                                        str87 = str15;
                                                                                        str27 = str37;
                                                                                        arrayList17 = arrayList26;
                                                                                        str25 = str34;
                                                                                    } else {
                                                                                        ArrayList arrayList80 = new ArrayList(arrayList25.size());
                                                                                        int i42 = 0;
                                                                                        while (i42 < arrayList25.size()) {
                                                                                            ArrayList arrayList81 = arrayList25;
                                                                                            f30 f30Var3 = (f30) arrayList81.get(i42);
                                                                                            iw0 iw0Var2 = new iw0(f30Var3.a);
                                                                                            if (str45 != null) {
                                                                                                iw0Var2.b = str45;
                                                                                            }
                                                                                            String str136 = f30Var3.d;
                                                                                            if (str136 == null) {
                                                                                                str136 = str101;
                                                                                            }
                                                                                            ArrayList arrayList82 = f30Var3.e;
                                                                                            ArrayList arrayList83 = arrayList21;
                                                                                            arrayList82.addAll(arrayList83);
                                                                                            if (arrayList82.isEmpty()) {
                                                                                                str69 = str45;
                                                                                                arrayList25 = arrayList81;
                                                                                                arrayList21 = arrayList83;
                                                                                            } else {
                                                                                                int i43 = 0;
                                                                                                while (true) {
                                                                                                    if (i43 < arrayList82.size()) {
                                                                                                        uk0 uk0Var = (uk0) arrayList82.get(i43);
                                                                                                        str69 = str45;
                                                                                                        if (!xq.c.equals(uk0Var.c) || (str70 = uk0Var.d) == null) {
                                                                                                            i43++;
                                                                                                            str45 = str69;
                                                                                                        } else {
                                                                                                            arrayList82.remove(i43);
                                                                                                        }
                                                                                                    } else {
                                                                                                        str69 = str45;
                                                                                                        str70 = null;
                                                                                                    }
                                                                                                }
                                                                                                if (str70 != null) {
                                                                                                    int i44 = 0;
                                                                                                    while (i44 < arrayList82.size()) {
                                                                                                        uk0 uk0Var2 = (uk0) arrayList82.get(i44);
                                                                                                        ArrayList arrayList84 = arrayList81;
                                                                                                        if (xq.b.equals(uk0Var2.c) && uk0Var2.d == null) {
                                                                                                            arrayList53 = arrayList83;
                                                                                                            arrayList82.set(i44, new uk0(xq.c, str70, uk0Var2.e, uk0Var2.f));
                                                                                                        } else {
                                                                                                            arrayList53 = arrayList83;
                                                                                                        }
                                                                                                        i44++;
                                                                                                        arrayList83 = arrayList53;
                                                                                                        arrayList81 = arrayList84;
                                                                                                    }
                                                                                                }
                                                                                                arrayList25 = arrayList81;
                                                                                                arrayList21 = arrayList83;
                                                                                                for (int size = arrayList82.size() - 1; size >= 0; size--) {
                                                                                                    uk0 uk0Var3 = (uk0) arrayList82.get(size);
                                                                                                    if (uk0Var3.f == null) {
                                                                                                        int i45 = 0;
                                                                                                        while (true) {
                                                                                                            if (i45 < arrayList82.size()) {
                                                                                                                uk0 uk0Var4 = (uk0) arrayList82.get(i45);
                                                                                                                if (uk0Var4.f != null && uk0Var3.f == null && uk0Var4.a(uk0Var3.c)) {
                                                                                                                    arrayList82.remove(size);
                                                                                                                } else {
                                                                                                                    i45++;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                iw0Var2.n = new vk0(str136, false, (uk0[]) arrayList82.toArray(new uk0[0]));
                                                                                            }
                                                                                            ArrayList arrayList85 = f30Var3.f;
                                                                                            arrayList85.addAll(arrayList30);
                                                                                            jw0 jw0Var3 = new jw0(iw0Var2);
                                                                                            l41 l41Var = f30Var3.b;
                                                                                            yx2 yx2Var4 = f30Var3.c;
                                                                                            if (yx2Var4 instanceof xx2) {
                                                                                                mo2Var = new no2(jw0Var3, l41Var, (xx2) yx2Var4, arrayList85);
                                                                                            } else if (yx2Var4 instanceof tx2) {
                                                                                                mo2Var = new mo2(jw0Var3, l41Var, (tx2) yx2Var4, arrayList85);
                                                                                            } else {
                                                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                                            }
                                                                                            arrayList80.add(mo2Var);
                                                                                            i42++;
                                                                                            str45 = str69;
                                                                                        }
                                                                                        ArrayList arrayList86 = arrayList22;
                                                                                        arrayList86.add(new ta(parseInt, i19, arrayList80, arrayList27, arrayList29, arrayList28));
                                                                                        arrayList8 = arrayList86;
                                                                                        str11 = str46;
                                                                                        str14 = str37;
                                                                                        str3 = str34;
                                                                                        arrayList7 = arrayList23;
                                                                                        str18 = str38;
                                                                                        str12 = str35;
                                                                                        exc = null;
                                                                                        j4 = -9223372036854775807L;
                                                                                    }
                                                                                } else {
                                                                                    str39 = str131;
                                                                                    if (sp3.c(xmlPullParser3, str39)) {
                                                                                        j27 = a(xmlPullParser3, j27);
                                                                                        str40 = str98;
                                                                                        obj = obj15;
                                                                                        obj2 = obj16;
                                                                                        xmlPullParser2 = xmlPullParser3;
                                                                                        str41 = str134;
                                                                                        str42 = str135;
                                                                                        yx2Var2 = a(xmlPullParser, (ux2) yx2Var2, j23, a7, j8, j27, a3);
                                                                                        str44 = str133;
                                                                                        i19 = i41;
                                                                                        str43 = str132;
                                                                                    } else {
                                                                                        str40 = str98;
                                                                                        i3 = i41;
                                                                                        obj = obj15;
                                                                                        obj2 = obj16;
                                                                                        str41 = str134;
                                                                                        j9 = j27;
                                                                                        xmlPullParser2 = xmlPullParser3;
                                                                                        str42 = str135;
                                                                                        if (sp3.c(xmlPullParser2, str132)) {
                                                                                            j27 = a(xmlPullParser2, j9);
                                                                                            str43 = str132;
                                                                                            str44 = str133;
                                                                                            yx2Var2 = a(xmlPullParser, (vx2) yx2Var2, arrayList28, j23, a7, j8, j27, a3);
                                                                                            i19 = i3;
                                                                                        } else {
                                                                                            str43 = str132;
                                                                                            str44 = str133;
                                                                                            if (sp3.c(xmlPullParser2, "InbandEventStream")) {
                                                                                                arrayList30 = arrayList79;
                                                                                                arrayList30.add(a(xmlPullParser2, "InbandEventStream"));
                                                                                            } else {
                                                                                                arrayList30 = arrayList79;
                                                                                                if (sp3.c(xmlPullParser2, "Label")) {
                                                                                                    str45 = "";
                                                                                                    do {
                                                                                                        xmlPullParser.next();
                                                                                                        if (xmlPullParser.getEventType() == 4) {
                                                                                                            str45 = xmlPullParser.getText();
                                                                                                        } else {
                                                                                                            a(xmlPullParser);
                                                                                                        }
                                                                                                    } while (!sp3.b(xmlPullParser2, "Label"));
                                                                                                    j27 = j9;
                                                                                                    i19 = i3;
                                                                                                    j7 = j8;
                                                                                                    str102 = str41;
                                                                                                    str46 = str36;
                                                                                                } else if (xmlPullParser.getEventType() == 2) {
                                                                                                    a(xmlPullParser);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str45 = str32;
                                                                                    j7 = j8;
                                                                                    arrayList30 = arrayList79;
                                                                                    str102 = str41;
                                                                                    str46 = str36;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            ArrayList arrayList87 = arrayList18;
                                                                            arrayList87.add(a(xmlPullParser2, "SupplementalProperty"));
                                                                            z2 = z;
                                                                            arrayList20 = arrayList16;
                                                                            i3 = i19;
                                                                            str41 = str102;
                                                                            obj = obj7;
                                                                            arrayList21 = arrayList65;
                                                                            obj2 = obj8;
                                                                            arrayList6 = arrayList61;
                                                                            str16 = str92;
                                                                            str34 = str25;
                                                                            arrayList3 = arrayList57;
                                                                            arrayList22 = arrayList58;
                                                                            j3 = j22;
                                                                            arrayList23 = arrayList59;
                                                                            str43 = str96;
                                                                            str7 = str97;
                                                                            arrayList5 = arrayList62;
                                                                            str35 = str22;
                                                                            str36 = str26;
                                                                            str37 = str27;
                                                                            str38 = str33;
                                                                            arrayList30 = arrayList12;
                                                                            str13 = str30;
                                                                            arrayList25 = arrayList15;
                                                                            arrayList26 = arrayList19;
                                                                            arrayList27 = arrayList13;
                                                                            str40 = str98;
                                                                            str44 = str99;
                                                                            arrayList24 = arrayList60;
                                                                            arrayList29 = arrayList14;
                                                                            str9 = str75;
                                                                            arrayList28 = arrayList87;
                                                                            str17 = str85;
                                                                            str4 = str93;
                                                                            str5 = str94;
                                                                            j5 = j26;
                                                                            str39 = str28;
                                                                            str42 = str29;
                                                                            str10 = str103;
                                                                            j9 = j27;
                                                                        }
                                                                        j27 = j9;
                                                                        i19 = i3;
                                                                        str45 = str32;
                                                                        j7 = j8;
                                                                        str102 = str41;
                                                                        str46 = str36;
                                                                        if (sp3.b(xmlPullParser2, str46)) {
                                                                        }
                                                                    }
                                                                    if (sp3.b(xmlPullParser2, str46)) {
                                                                    }
                                                                }
                                                                z2 = z;
                                                                arrayList20 = arrayList16;
                                                                i3 = i19;
                                                                str41 = str102;
                                                                str15 = str87;
                                                                obj = obj7;
                                                                arrayList21 = arrayList65;
                                                                obj2 = obj8;
                                                                arrayList6 = arrayList61;
                                                                str16 = str92;
                                                                str34 = str25;
                                                                arrayList3 = arrayList57;
                                                                arrayList22 = arrayList58;
                                                                j3 = j22;
                                                                arrayList23 = arrayList59;
                                                                str43 = str96;
                                                                str7 = str97;
                                                                arrayList5 = arrayList62;
                                                                str35 = str22;
                                                                str36 = str26;
                                                                str37 = str27;
                                                                str38 = str33;
                                                                arrayList30 = arrayList12;
                                                                arrayList28 = arrayList18;
                                                                str39 = str28;
                                                                str13 = str30;
                                                                arrayList25 = arrayList15;
                                                                str10 = str103;
                                                                arrayList26 = arrayList19;
                                                                arrayList27 = arrayList13;
                                                                str40 = str98;
                                                                str44 = str99;
                                                                arrayList24 = arrayList60;
                                                                arrayList29 = arrayList14;
                                                                str9 = str75;
                                                                str17 = str85;
                                                                str4 = str93;
                                                                str5 = str94;
                                                                j5 = j26;
                                                                str42 = str29;
                                                                j9 = j27;
                                                                j27 = j9;
                                                                i19 = i3;
                                                                str45 = str32;
                                                                j7 = j8;
                                                                str102 = str41;
                                                                str46 = str36;
                                                                if (sp3.b(xmlPullParser2, str46)) {
                                                                }
                                                            }
                                                            j7 = j8;
                                                            if (sp3.b(xmlPullParser2, str46)) {
                                                            }
                                                        }
                                                    }
                                                    arrayList21 = arrayList11;
                                                    z2 = z;
                                                    arrayList20 = arrayList16;
                                                    obj = obj7;
                                                    obj2 = obj8;
                                                    arrayList6 = arrayList61;
                                                    str16 = str92;
                                                    str34 = str25;
                                                    arrayList3 = arrayList57;
                                                    arrayList22 = arrayList58;
                                                    j3 = j22;
                                                    arrayList23 = arrayList59;
                                                    str43 = str96;
                                                    str7 = str97;
                                                    arrayList5 = arrayList62;
                                                    str35 = str22;
                                                    str37 = str27;
                                                    str38 = str33;
                                                    arrayList30 = arrayList12;
                                                    arrayList28 = arrayList18;
                                                    str13 = str30;
                                                    arrayList25 = arrayList15;
                                                    str45 = str32;
                                                    arrayList26 = arrayList17;
                                                    j7 = j8;
                                                    arrayList27 = arrayList13;
                                                    str40 = str98;
                                                    str44 = str99;
                                                    arrayList24 = arrayList60;
                                                    arrayList29 = arrayList14;
                                                    str9 = str75;
                                                    str15 = str87;
                                                    str17 = str85;
                                                    str4 = str93;
                                                    str5 = str94;
                                                    j5 = j26;
                                                    str46 = str26;
                                                    str39 = str28;
                                                    str42 = str29;
                                                    str10 = str31;
                                                    if (sp3.b(xmlPullParser2, str46)) {
                                                    }
                                                }
                                            }
                                        }
                                        str27 = str81;
                                        f = -1.0f;
                                        float f102 = f;
                                        String attributeValue202 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                                        if (attributeValue202 == null) {
                                        }
                                        String attributeValue212 = xmlPullParser2.getAttributeValue(null, str87);
                                        String attributeValue222 = xmlPullParser2.getAttributeValue(null, "label");
                                        arrayList11 = new ArrayList();
                                        arrayList12 = new ArrayList();
                                        arrayList13 = new ArrayList();
                                        ArrayList arrayList632 = new ArrayList();
                                        str28 = "SegmentList";
                                        arrayList14 = new ArrayList();
                                        str29 = "SegmentBase";
                                        ArrayList arrayList642 = new ArrayList();
                                        str30 = str100;
                                        arrayList15 = new ArrayList();
                                        arrayList16 = new ArrayList();
                                        arrayList17 = arrayList632;
                                        str31 = str23;
                                        yx2 yx2Var22 = yx2Var;
                                        long j272 = j24;
                                        j7 = j26;
                                        str32 = attributeValue222;
                                        String str1012 = null;
                                        int i182 = -1;
                                        str33 = str90;
                                        String str1022 = attributeValue212;
                                        arrayList18 = arrayList642;
                                        int i192 = i2;
                                        boolean z72 = false;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (sp3.c(xmlPullParser2, str85)) {
                                            }
                                            arrayList21 = arrayList11;
                                            z2 = z;
                                            arrayList20 = arrayList16;
                                            obj = obj7;
                                            obj2 = obj8;
                                            arrayList6 = arrayList61;
                                            str16 = str92;
                                            str34 = str25;
                                            arrayList3 = arrayList57;
                                            arrayList22 = arrayList58;
                                            j3 = j22;
                                            arrayList23 = arrayList59;
                                            str43 = str96;
                                            str7 = str97;
                                            arrayList5 = arrayList62;
                                            str35 = str22;
                                            str37 = str27;
                                            str38 = str33;
                                            arrayList30 = arrayList12;
                                            arrayList28 = arrayList18;
                                            str13 = str30;
                                            arrayList25 = arrayList15;
                                            str45 = str32;
                                            arrayList26 = arrayList17;
                                            j7 = j8;
                                            arrayList27 = arrayList13;
                                            str40 = str98;
                                            str44 = str99;
                                            arrayList24 = arrayList60;
                                            arrayList29 = arrayList14;
                                            str9 = str75;
                                            str15 = str87;
                                            str17 = str85;
                                            str4 = str93;
                                            str5 = str94;
                                            j5 = j26;
                                            str46 = str26;
                                            str39 = str28;
                                            str42 = str29;
                                            str10 = str31;
                                            if (sp3.b(xmlPullParser2, str46)) {
                                            }
                                            arrayList12 = arrayList30;
                                            str26 = str46;
                                            str29 = str42;
                                            arrayList62 = arrayList5;
                                            z = z2;
                                            str32 = str45;
                                            arrayList13 = arrayList27;
                                            arrayList60 = arrayList24;
                                            arrayList14 = arrayList29;
                                            arrayList18 = arrayList28;
                                            str98 = str40;
                                            str85 = str17;
                                            str97 = str7;
                                            j26 = j5;
                                            arrayList16 = arrayList20;
                                            str99 = str44;
                                            str75 = str9;
                                            str31 = str10;
                                            str94 = str5;
                                            str93 = str4;
                                            obj8 = obj2;
                                            arrayList11 = arrayList21;
                                            arrayList15 = arrayList25;
                                            arrayList58 = arrayList22;
                                            arrayList59 = arrayList23;
                                            str92 = str16;
                                            str33 = str38;
                                            str22 = str35;
                                            str96 = str43;
                                            str28 = str39;
                                            arrayList61 = arrayList6;
                                            arrayList57 = arrayList3;
                                            j22 = j3;
                                            obj7 = obj;
                                            str30 = str13;
                                            str87 = str15;
                                            str27 = str37;
                                            arrayList17 = arrayList26;
                                            str25 = str34;
                                        }
                                    }
                                    str24 = null;
                                    i2 = -1;
                                    String str1002 = str;
                                    str25 = str80;
                                    String attributeValue162 = xmlPullParser2.getAttributeValue(str24, str1002);
                                    str26 = str95;
                                    String attributeValue172 = xmlPullParser2.getAttributeValue(str24, "codecs");
                                    String attributeValue182 = xmlPullParser2.getAttributeValue(str24, "width");
                                    if (attributeValue182 != null) {
                                    }
                                    String attributeValue192 = xmlPullParser2.getAttributeValue(str24, "height");
                                    if (attributeValue192 != null) {
                                    }
                                    attributeValue = xmlPullParser2.getAttributeValue(str24, "frameRate");
                                    if (attributeValue != null) {
                                    }
                                    str27 = str81;
                                    f = -1.0f;
                                    float f1022 = f;
                                    String attributeValue2022 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                                    if (attributeValue2022 == null) {
                                    }
                                    String attributeValue2122 = xmlPullParser2.getAttributeValue(null, str87);
                                    String attributeValue2222 = xmlPullParser2.getAttributeValue(null, "label");
                                    arrayList11 = new ArrayList();
                                    arrayList12 = new ArrayList();
                                    arrayList13 = new ArrayList();
                                    ArrayList arrayList6322 = new ArrayList();
                                    str28 = "SegmentList";
                                    arrayList14 = new ArrayList();
                                    str29 = "SegmentBase";
                                    ArrayList arrayList6422 = new ArrayList();
                                    str30 = str1002;
                                    arrayList15 = new ArrayList();
                                    arrayList16 = new ArrayList();
                                    arrayList17 = arrayList6322;
                                    str31 = str23;
                                    yx2 yx2Var222 = yx2Var;
                                    long j2722 = j24;
                                    j7 = j26;
                                    str32 = attributeValue2222;
                                    String str10122 = null;
                                    int i1822 = -1;
                                    str33 = str90;
                                    String str10222 = attributeValue2122;
                                    arrayList18 = arrayList6422;
                                    int i1922 = i2;
                                    boolean z722 = false;
                                    while (true) {
                                        xmlPullParser.next();
                                        if (sp3.c(xmlPullParser2, str85)) {
                                        }
                                        arrayList21 = arrayList11;
                                        z2 = z;
                                        arrayList20 = arrayList16;
                                        obj = obj7;
                                        obj2 = obj8;
                                        arrayList6 = arrayList61;
                                        str16 = str92;
                                        str34 = str25;
                                        arrayList3 = arrayList57;
                                        arrayList22 = arrayList58;
                                        j3 = j22;
                                        arrayList23 = arrayList59;
                                        str43 = str96;
                                        str7 = str97;
                                        arrayList5 = arrayList62;
                                        str35 = str22;
                                        str37 = str27;
                                        str38 = str33;
                                        arrayList30 = arrayList12;
                                        arrayList28 = arrayList18;
                                        str13 = str30;
                                        arrayList25 = arrayList15;
                                        str45 = str32;
                                        arrayList26 = arrayList17;
                                        j7 = j8;
                                        arrayList27 = arrayList13;
                                        str40 = str98;
                                        str44 = str99;
                                        arrayList24 = arrayList60;
                                        arrayList29 = arrayList14;
                                        str9 = str75;
                                        str15 = str87;
                                        str17 = str85;
                                        str4 = str93;
                                        str5 = str94;
                                        j5 = j26;
                                        str46 = str26;
                                        str39 = str28;
                                        str42 = str29;
                                        str10 = str31;
                                        if (sp3.b(xmlPullParser2, str46)) {
                                        }
                                        arrayList12 = arrayList30;
                                        str26 = str46;
                                        str29 = str42;
                                        arrayList62 = arrayList5;
                                        z = z2;
                                        str32 = str45;
                                        arrayList13 = arrayList27;
                                        arrayList60 = arrayList24;
                                        arrayList14 = arrayList29;
                                        arrayList18 = arrayList28;
                                        str98 = str40;
                                        str85 = str17;
                                        str97 = str7;
                                        j26 = j5;
                                        arrayList16 = arrayList20;
                                        str99 = str44;
                                        str75 = str9;
                                        str31 = str10;
                                        str94 = str5;
                                        str93 = str4;
                                        obj8 = obj2;
                                        arrayList11 = arrayList21;
                                        arrayList15 = arrayList25;
                                        arrayList58 = arrayList22;
                                        arrayList59 = arrayList23;
                                        str92 = str16;
                                        str33 = str38;
                                        str22 = str35;
                                        str96 = str43;
                                        str28 = str39;
                                        arrayList61 = arrayList6;
                                        arrayList57 = arrayList3;
                                        j22 = j3;
                                        obj7 = obj;
                                        str30 = str13;
                                        str87 = str15;
                                        str27 = str37;
                                        arrayList17 = arrayList26;
                                        str25 = str34;
                                    }
                                } else {
                                    String str137 = str91;
                                    z2 = z;
                                    String str138 = str80;
                                    String str139 = str81;
                                    arrayList5 = arrayList60;
                                    String str140 = str90;
                                    str9 = str75;
                                    str15 = str87;
                                    obj = obj7;
                                    obj2 = obj8;
                                    str10 = str2;
                                    arrayList6 = arrayList61;
                                    str16 = str92;
                                    str13 = str;
                                    arrayList3 = arrayList57;
                                    ArrayList arrayList88 = arrayList58;
                                    j3 = j22;
                                    ArrayList arrayList89 = arrayList59;
                                    str4 = str93;
                                    str5 = str94;
                                    str7 = str97;
                                    j5 = j25;
                                    str17 = str85;
                                    if (sp3.c(xmlPullParser2, "EventStream")) {
                                        String str141 = null;
                                        String attributeValue32 = xmlPullParser2.getAttributeValue(null, str139);
                                        if (attributeValue32 == null) {
                                            attributeValue32 = "";
                                        }
                                        String str142 = str138;
                                        String attributeValue33 = xmlPullParser2.getAttributeValue(null, str142);
                                        if (attributeValue33 == null) {
                                            attributeValue33 = "";
                                        }
                                        String attributeValue34 = xmlPullParser2.getAttributeValue(null, "timescale");
                                        long parseLong4 = attributeValue34 == null ? 1L : Long.parseLong(attributeValue34);
                                        ArrayList arrayList90 = new ArrayList();
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                        while (true) {
                                            xmlPullParser.next();
                                            if (sp3.c(xmlPullParser2, "Event")) {
                                                String str143 = str140;
                                                String attributeValue35 = xmlPullParser2.getAttributeValue(str141, str143);
                                                long parseLong5 = attributeValue35 == null ? 0L : Long.parseLong(attributeValue35);
                                                str20 = str137;
                                                String attributeValue36 = xmlPullParser2.getAttributeValue(str141, str20);
                                                if (attributeValue36 == null) {
                                                    str19 = str142;
                                                    parseLong = -9223372036854775807L;
                                                } else {
                                                    str19 = str142;
                                                    parseLong = Long.parseLong(attributeValue36);
                                                }
                                                String attributeValue37 = xmlPullParser2.getAttributeValue(str141, "presentationTime");
                                                long parseLong6 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                long j36 = parseLong4;
                                                long a10 = sb3.a(parseLong, 1000L, j36);
                                                long a11 = sb3.a(parseLong6, 1000000L, j36);
                                                String attributeValue38 = xmlPullParser2.getAttributeValue(str141, "messageData");
                                                if (attributeValue38 == null) {
                                                    attributeValue38 = str141;
                                                }
                                                byteArrayOutputStream.reset();
                                                XmlSerializer newSerializer = Xml.newSerializer();
                                                j6 = parseLong4;
                                                newSerializer.setOutput(byteArrayOutputStream, zt.c.name());
                                                xmlPullParser.nextToken();
                                                while (!sp3.b(xmlPullParser2, "Event")) {
                                                    switch (xmlPullParser.getEventType()) {
                                                        case 0:
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            newSerializer.startDocument(null, Boolean.FALSE);
                                                            break;
                                                        case 1:
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            newSerializer.endDocument();
                                                            break;
                                                        case 2:
                                                            newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                            int i46 = 0;
                                                            while (i46 < xmlPullParser.getAttributeCount()) {
                                                                newSerializer.attribute(xmlPullParser2.getAttributeNamespace(i46), xmlPullParser2.getAttributeName(i46), xmlPullParser2.getAttributeValue(i46));
                                                                i46++;
                                                                arrayList88 = arrayList88;
                                                                str143 = str143;
                                                            }
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        case 3:
                                                            newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        case 4:
                                                            newSerializer.text(xmlPullParser.getText());
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        case 5:
                                                            newSerializer.cdsect(xmlPullParser.getText());
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        case 6:
                                                            newSerializer.entityRef(xmlPullParser.getText());
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        case 7:
                                                            newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        case 8:
                                                            newSerializer.processingInstruction(xmlPullParser.getText());
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        case 9:
                                                            newSerializer.comment(xmlPullParser.getText());
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        case 10:
                                                            newSerializer.docdecl(xmlPullParser.getText());
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                        default:
                                                            str21 = str143;
                                                            arrayList10 = arrayList88;
                                                            break;
                                                    }
                                                    xmlPullParser.nextToken();
                                                    arrayList88 = arrayList10;
                                                    str143 = str21;
                                                }
                                                str140 = str143;
                                                arrayList9 = arrayList88;
                                                newSerializer.flush();
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                Long valueOf = Long.valueOf(a11);
                                                if (attributeValue38 != null) {
                                                    byteArray = sb3.c(attributeValue38);
                                                }
                                                arrayList90.add(Pair.create(valueOf, new ym0(attributeValue32, attributeValue33, a10, parseLong5, byteArray)));
                                            } else {
                                                j6 = parseLong4;
                                                str19 = str142;
                                                arrayList9 = arrayList88;
                                                str20 = str137;
                                                a(xmlPullParser);
                                            }
                                            if (sp3.b(xmlPullParser2, "EventStream")) {
                                                long[] jArr = new long[arrayList90.size()];
                                                ym0[] ym0VarArr = new ym0[arrayList90.size()];
                                                for (int i47 = 0; i47 < arrayList90.size(); i47++) {
                                                    Pair pair = (Pair) arrayList90.get(i47);
                                                    jArr[i47] = ((Long) pair.first).longValue();
                                                    ym0VarArr[i47] = (ym0) pair.second;
                                                }
                                                arrayList89.add(new cn0(attributeValue32, attributeValue33, jArr, ym0VarArr));
                                                str14 = str139;
                                                arrayList7 = arrayList89;
                                                str11 = str95;
                                                str12 = str20;
                                                str3 = str19;
                                                arrayList8 = arrayList9;
                                                str18 = str140;
                                                exc = null;
                                                j4 = -9223372036854775807L;
                                            } else {
                                                str137 = str20;
                                                parseLong4 = j6;
                                                str142 = str19;
                                                arrayList88 = arrayList9;
                                                str141 = null;
                                            }
                                        }
                                    } else {
                                        if (sp3.c(xmlPullParser2, "SegmentBase")) {
                                            exc = null;
                                            yx2Var = a(xmlPullParser2, (xx2) null);
                                            str14 = str139;
                                            arrayList7 = arrayList89;
                                            str11 = str95;
                                            str12 = str137;
                                            j25 = j5;
                                            str3 = str138;
                                            arrayList8 = arrayList88;
                                            str6 = str16;
                                            str18 = str140;
                                        } else {
                                            exc = null;
                                            if (sp3.c(xmlPullParser2, "SegmentList")) {
                                                long a12 = a(xmlPullParser2, -9223372036854775807L);
                                                str3 = str138;
                                                str18 = str140;
                                                j25 = j5;
                                                str14 = str139;
                                                arrayList8 = arrayList88;
                                                arrayList7 = arrayList89;
                                                str11 = str95;
                                                yx2Var = a(xmlPullParser, null, j23, a7, j25, a12, a3);
                                                str12 = str137;
                                                j24 = a12;
                                                str6 = str16;
                                            } else {
                                                str14 = str139;
                                                arrayList7 = arrayList89;
                                                str11 = str95;
                                                str3 = str138;
                                                arrayList8 = arrayList88;
                                                str18 = str140;
                                                if (sp3.c(xmlPullParser2, str96)) {
                                                    long a13 = a(xmlPullParser2, -9223372036854775807L);
                                                    i41 i41Var = l41.c;
                                                    j4 = -9223372036854775807L;
                                                    str12 = str137;
                                                    yx2Var = a(xmlPullParser, null, um2.f, j23, a7, j5, a13, a3);
                                                    j24 = a13;
                                                } else {
                                                    str12 = str137;
                                                    j4 = -9223372036854775807L;
                                                    if (sp3.c(xmlPullParser2, "AssetIdentifier")) {
                                                        a(xmlPullParser2, "AssetIdentifier");
                                                    } else {
                                                        a(xmlPullParser);
                                                    }
                                                }
                                                j25 = j5;
                                                str6 = str16;
                                            }
                                        }
                                        j4 = -9223372036854775807L;
                                    }
                                }
                                j25 = j5;
                                str6 = str16;
                            }
                            if (sp3.b(xmlPullParser2, str6)) {
                                Pair create = Pair.create(new sc2(attributeValue13, a6, arrayList8, arrayList7), Long.valueOf(a7));
                                sc2 sc2Var = (sc2) create.first;
                                if (sc2Var.b != j4) {
                                    long longValue = ((Long) create.second).longValue();
                                    if (longValue == j4) {
                                        arrayList2 = arrayList56;
                                        j10 = j4;
                                    } else {
                                        j10 = longValue + sc2Var.b;
                                        arrayList2 = arrayList56;
                                    }
                                    arrayList2.add(sc2Var);
                                    j3 = j10;
                                } else {
                                    if (!equals) {
                                        throw new cc2("Unable to determine start of period " + arrayList56.size(), exc, true, 4);
                                    }
                                    arrayList2 = arrayList56;
                                    j17 = j18;
                                    z5 = true;
                                }
                            } else {
                                str92 = str6;
                                str90 = str18;
                                arrayList4 = arrayList6;
                                arrayList60 = arrayList5;
                                z = z2;
                                str80 = str3;
                                arrayList58 = arrayList8;
                                str81 = str14;
                                str85 = str17;
                                str77 = str7;
                                str83 = str11;
                                str91 = str12;
                                str = str13;
                                str75 = str9;
                                str2 = str10;
                                str94 = str5;
                                str93 = str4;
                                str87 = str15;
                                obj8 = obj2;
                                j22 = j3;
                                arrayList59 = arrayList7;
                                arrayList57 = arrayList3;
                                obj7 = obj;
                            }
                        }
                    } else {
                        j3 = j16;
                        z2 = z;
                        str3 = str80;
                        str4 = str78;
                        str5 = str79;
                        str6 = str76;
                        str7 = str77;
                        str8 = str86;
                        str9 = str75;
                        obj = obj7;
                        obj2 = obj8;
                        str10 = str2;
                        str11 = str83;
                        str12 = str84;
                        str13 = str;
                        arrayList2 = arrayList56;
                        exc = null;
                        j4 = -9223372036854775807L;
                        arrayList3 = arrayList55;
                        str14 = str81;
                        a(xmlPullParser);
                    }
                    j17 = j18;
                }
                str9 = str75;
                obj = obj7;
                obj2 = obj8;
                str10 = str2;
                str11 = str83;
                str12 = str84;
                str13 = str;
                arrayList2 = arrayList56;
                j17 = j18;
                exc = null;
                j4 = -9223372036854775807L;
                arrayList3 = arrayList55;
                str14 = str81;
            }
            if (sp3.b(xmlPullParser2, "MPD")) {
                if (a == j4) {
                    if (j3 != j4) {
                        j14 = j3;
                        if (arrayList2.isEmpty()) {
                            return new e30(f6, j14, a2, equals, j2, a3, a4, f7, kj2Var, rb3Var, py2Var, uri4, arrayList2);
                        }
                        throw new cc2("No periods found.", exc, true, 4);
                    }
                    if (!equals) {
                        throw new cc2("Unable to determine duration of static manifest.", exc, true, 4);
                    }
                }
                j14 = a;
                if (arrayList2.isEmpty()) {
                }
            } else {
                str76 = str6;
                arrayList54 = arrayList2;
                arrayList55 = arrayList3;
                j16 = j3;
                z = z2;
                str80 = str3;
                a5 = arrayList;
                str81 = str14;
                str82 = str8;
                str77 = str7;
                str83 = str11;
                obj7 = obj;
                str84 = str12;
                str = str13;
                str75 = str9;
                str2 = str10;
                str79 = str5;
                str78 = str4;
                obj8 = obj2;
            }
        }
    }

    public static xx2 a(XmlPullParser xmlPullParser, xx2 xx2Var) {
        long j = xx2Var != null ? xx2Var.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = xx2Var != null ? xx2Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = xx2Var != null ? xx2Var.d : 0L;
        long j6 = xx2Var != null ? xx2Var.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j5 = Long.parseLong(split[0]);
            j6 = (Long.parseLong(split[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        tl2 tl2Var = xx2Var != null ? xx2Var.a : null;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "Initialization")) {
                tl2Var = a(xmlPullParser, "sourceURL", "range");
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentBase"));
        return new xx2(tl2Var, j2, j4, j8, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    public static ux2 a(XmlPullParser xmlPullParser, ux2 ux2Var, long j, long j2, long j3, long j4, long j5) {
        tl2 tl2Var;
        List list;
        ArrayList arrayList;
        long j6 = ux2Var != null ? ux2Var.b : 1L;
        ArrayList arrayList2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = ux2Var != null ? ux2Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = ux2Var != null ? ux2Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = ux2Var != null ? ux2Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        tl2 tl2Var2 = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "Initialization")) {
                tl2Var2 = a(xmlPullParser, "sourceURL", "range");
            } else if (sp3.c(xmlPullParser, "SegmentTimeline")) {
                list2 = a(xmlPullParser, j7, j2);
            } else if (sp3.c(xmlPullParser, "SegmentURL")) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(a(xmlPullParser, "media", "mediaRange"));
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentList"));
        if (ux2Var != null) {
            if (tl2Var2 == null) {
                tl2Var2 = ux2Var.a;
            }
            if (list2 == null) {
                list2 = ux2Var.f;
            }
            if (arrayList2 == null) {
                arrayList = ux2Var.j;
                tl2Var = tl2Var2;
                list = list2;
                return new ux2(tl2Var, j7, j9, j13, j11, list, j15, arrayList, sb3.a(j5), sb3.a(j));
            }
        }
        tl2Var = tl2Var2;
        list = list2;
        arrayList = arrayList2;
        return new ux2(tl2Var, j7, j9, j13, j11, list, j15, arrayList, sb3.a(j5), sb3.a(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    public static vx2 a(XmlPullParser xmlPullParser, vx2 vx2Var, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        ArrayList arrayList;
        long j7 = vx2Var != null ? vx2Var.b : 1L;
        tl2 tl2Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = vx2Var != null ? vx2Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = vx2Var != null ? vx2Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = vx2Var != null ? vx2Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            eg0 eg0Var = (eg0) list.get(i);
            if (lh.a("http://dashif.org/guidelines/last-segment-number", eg0Var.a)) {
                j6 = Long.parseLong(eg0Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        hb3 a = a(xmlPullParser, "media", vx2Var != null ? vx2Var.k : null);
        hb3 a2 = a(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, vx2Var != null ? vx2Var.j : null);
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "Initialization")) {
                tl2Var = a(xmlPullParser, "sourceURL", "range");
            } else if (sp3.c(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = a(xmlPullParser, j8, j2);
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentTemplate"));
        if (vx2Var != null) {
            if (tl2Var == null) {
                tl2Var = vx2Var.a;
            }
            if (arrayList2 == null) {
                arrayList = vx2Var.f;
                return new vx2(tl2Var, j8, j10, j14, j15, j12, arrayList, j17, a2, a, sb3.a(j5), sb3.a(j));
            }
        }
        arrayList = arrayList2;
        return new vx2(tl2Var, j8, j10, j14, j15, j12, arrayList, j17, a2, a, sb3.a(j5), sb3.a(j));
    }

    public static ArrayList a(XmlPullParser xmlPullParser, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    j3 = a(arrayList, j3, j4, i, parseLong);
                }
                if (parseLong == -9223372036854775807L) {
                    parseLong = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                long parseLong2 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                long j5 = parseLong2;
                z = true;
                j4 = j5;
                j3 = parseLong;
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentTimeline"));
        if (z) {
            a(arrayList, j3, j4, i, sb3.a(j2, j, 1000L));
        }
        return arrayList;
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = sb3.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new wx2(j, j2));
            j += j2;
        }
        return j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static hb3 a(XmlPullParser xmlPullParser, String str, hb3 hb3Var) {
        String str2;
        char c2;
        int i = -1;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return hb3Var;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i2 = 0;
        int i3 = 0;
        while (i2 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i2);
            if (indexOf == i) {
                strArr[i3] = strArr[i3] + attributeValue.substring(i2);
                i2 = attributeValue.length();
            } else if (indexOf != i2) {
                strArr[i3] = strArr[i3] + attributeValue.substring(i2, indexOf);
                i2 = indexOf;
            } else if (attributeValue.startsWith("$$", i2)) {
                strArr[i3] = strArr[i3] + "$";
                i2 += 2;
            } else {
                int i4 = i2 + 1;
                int indexOf2 = attributeValue.indexOf("$", i4);
                String substring = attributeValue.substring(i4, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i3] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 == i) {
                        str2 = "%01d";
                    } else {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith(VastAttributes.HORIZONTAL_POSITION) && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    }
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                    c2 = 65535;
                    switch (c2) {
                        case 0:
                            iArr[i3] = 2;
                            break;
                        case 1:
                            iArr[i3] = 4;
                            break;
                        case 2:
                            iArr[i3] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i3] = str2;
                }
                i3++;
                strArr[i3] = "";
                i2 = indexOf2 + 1;
                i = -1;
            }
        }
        return new hb3(strArr, iArr, strArr2, i3);
    }

    public static tl2 a(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new tl2(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new tl2(attributeValue, j, j2);
    }

    public static ArrayList a(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = z ? 1 : Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "BaseURL"));
        if (str != null && ab3.a(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return sf1.a(new lo(i, parseInt, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            lo loVar = (lo) arrayList.get(i2);
            String a = ab3.a(loVar.a, str);
            String str2 = attributeValue3 == null ? a : attributeValue3;
            if (z) {
                i = loVar.c;
                parseInt = loVar.d;
                str2 = loVar.b;
            }
            arrayList2.add(new lo(i, parseInt, a, str2));
        }
        return arrayList2;
    }

    public static long a(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static eg0 a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!sp3.b(xmlPullParser, str));
        return new eg0(attributeValue, attributeValue2, str2);
    }

    public static long a(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = sb3.h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
            String group2 = matcher.group(5);
            double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
            String group3 = matcher.group(7);
            double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
            String group4 = matcher.group(10);
            double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
            String group5 = matcher.group(12);
            double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
            String group6 = matcher.group(14);
            long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
            return !isEmpty ? -parseDouble6 : parseDouble6;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }
}
