package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2201x6 {
    public static final String a = C1717pn.class.getName().concat(".aot-shared-library-name");
    public static final String b = C1717pn.class.getName().concat(".vm-snapshot-data");
    public static final String c = C1717pn.class.getName().concat(".isolate-snapshot-data");
    public static final String d = C1717pn.class.getName().concat(".flutter-assets-dir");

    public static C0785bb a(Context context) {
        int i;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str = null;
            String string = bundle == null ? null : bundle.getString(a, null);
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                bundle2.getString(b, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            if (bundle3 != null) {
                bundle3.getString(c, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String string2 = bundle4 == null ? null : bundle4.getString(d, null);
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                b(xml, jSONArray, false);
                            }
                        }
                    }
                    str = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str2 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            boolean z = bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true;
            C0785bb c0785bb = new C0785bb();
            if (string == null) {
                string = "libapp.so";
            }
            c0785bb.b = string;
            if (string2 == null) {
                string2 = "flutter_assets";
            }
            c0785bb.c = string2;
            c0785bb.e = str2;
            if (str == null) {
                str = "";
            }
            c0785bb.d = str;
            c0785bb.a = z;
            return c0785bb;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
