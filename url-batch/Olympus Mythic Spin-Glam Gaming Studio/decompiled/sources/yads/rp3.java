package yads;

import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class rp3 {
    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static String a(XmlPullParser xmlPullParser) {
        String str;
        if (xmlPullParser.next() != 4) {
            str = "";
        } else {
            str = xmlPullParser.getText();
            xmlPullParser.nextTag();
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }
}
