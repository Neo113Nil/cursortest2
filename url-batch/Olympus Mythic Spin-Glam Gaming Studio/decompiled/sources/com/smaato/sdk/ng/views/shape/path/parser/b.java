package com.smaato.sdk.ng.views.shape.path.parser;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes13.dex */
class b {
    private static final String d = SvgToPath.n;
    final HashMap<String, String> a = new HashMap<>();
    private final Stack<a> b = new Stack<>();
    private final XmlPullParser c;

    class a {
        final String a;
        int c = 0;
        final StringBuilder b = new StringBuilder();

        public a(String str) {
            this.a = str;
        }
    }

    b(XmlPullParser xmlPullParser) {
        this.c = xmlPullParser;
    }

    private void a(StringBuilder sb, String str, XmlPullParser xmlPullParser) {
        sb.append("<");
        sb.append(str);
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            sb.append(" ");
            sb.append(xmlPullParser.getAttributeName(i));
            sb.append("='");
            sb.append(d.a(xmlPullParser.getAttributeValue(i)));
            sb.append("'");
        }
        sb.append(">");
    }

    public void b() throws XmlPullParserException, IOException {
        int eventType = this.c.getEventType();
        do {
            if (eventType != 0 && eventType != 1) {
                if (eventType == 2) {
                    c();
                } else if (eventType == 3) {
                    a();
                }
            }
            eventType = this.c.next();
        } while (eventType != 1);
    }

    void c() {
        String name = this.c.getName();
        String a2 = d.a("id", this.c);
        if (a2 != null) {
            this.b.push(new a(a2));
        }
        if (this.b.size() > 0) {
            a lastElement = this.b.lastElement();
            lastElement.c++;
            a(lastElement.b, name, this.c);
        }
    }

    void a() {
        String name = this.c.getName();
        if (this.b.size() > 0) {
            a lastElement = this.b.lastElement();
            lastElement.b.append("</");
            lastElement.b.append(name);
            lastElement.b.append(">");
            int i = lastElement.c - 1;
            lastElement.c = i;
            if (i == 0) {
                String sb = lastElement.b.toString();
                this.a.put(lastElement.a, sb);
                this.b.pop();
                if (this.b.size() > 0) {
                    this.b.lastElement().b.append(sb);
                }
                Log.w(d, sb);
            }
        }
    }
}
