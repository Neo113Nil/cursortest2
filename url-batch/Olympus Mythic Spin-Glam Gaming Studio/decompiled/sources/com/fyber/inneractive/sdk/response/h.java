package com.fyber.inneractive.sdk.response;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s0;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public final class h {
    public final boolean a;
    public String b;

    public h(String str) {
        this.a = false;
        try {
            a(str);
            this.a = true;
            IAlog.a("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.b("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    public final void a(String str) {
        String str2;
        IAlog.a("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, null, "tns:Ad");
                    IAlog.a("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.f("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.e("Ad content: %s", trim);
                    if (trim == null) {
                        trim = null;
                    } else {
                        s0 s0Var = s0.b;
                        s0Var.getClass();
                        int indexOf = trim.indexOf(38);
                        if (indexOf >= 0) {
                            StringWriter stringWriter = new StringWriter((int) ((trim.length() * 0.1d) + trim.length()));
                            try {
                                s0Var.a(stringWriter, trim, indexOf);
                            } catch (IOException unused) {
                            }
                            trim = stringWriter.toString();
                        }
                    }
                    this.b = trim;
                } else {
                    if (newPullParser.getEventType() != 2) {
                        throw new IllegalStateException();
                    }
                    int i = 1;
                    while (i != 0) {
                        int next = newPullParser.next();
                        if (next == 2) {
                            i++;
                        } else if (next == 3) {
                            i--;
                        }
                    }
                }
            }
        }
    }
}
