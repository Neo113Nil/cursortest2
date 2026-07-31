package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class vd3 implements qp3 {
    public final rp3 a;
    public final vc1 b;
    public final ud3 c;
    public final p83 d;

    public vd3() {
        rp3 rp3Var = new rp3();
        vc1 vc1Var = new vc1();
        ud3 ud3Var = new ud3();
        p83 p83Var = new p83();
        this.a = rp3Var;
        this.b = vc1Var;
        this.c = ud3Var;
        this.d = p83Var;
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, dm dmVar) {
        this.a.getClass();
        xmlPullParser.require(2, null, VastTagName.VERIFICATION);
        this.a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, VastAttributes.VENDOR);
        HashMap hashMap = new HashMap();
        uc1 uc1Var = null;
        String str = null;
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (Intrinsics.areEqual(VastTagName.JAVA_SCRIPT_RESOURCE, name)) {
                    rp3 rp3Var = this.b.a;
                    xmlPullParser.require(2, null, VastTagName.JAVA_SCRIPT_RESOURCE);
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "browserOptional");
                    Boolean valueOf = attributeValue3 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue3)) : null;
                    String a = rp3.a(xmlPullParser);
                    uc1Var = (attributeValue2 == null || attributeValue2.length() == 0 || valueOf == null || a.length() <= 0) ? null : new uc1(attributeValue2, a, valueOf.booleanValue());
                } else if (Intrinsics.areEqual(VastTagName.VERIFICATION_PARAMETERS, name)) {
                    rp3 rp3Var2 = this.c.a;
                    xmlPullParser.require(2, null, VastTagName.VERIFICATION_PARAMETERS);
                    str = rp3.a(xmlPullParser);
                    if (str.length() == 0) {
                        str = null;
                    }
                } else if (Intrinsics.areEqual("TrackingEvents", name)) {
                    hashMap = this.d.a(xmlPullParser);
                } else {
                    this.a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new rd3(attributeValue, uc1Var, str, hashMap);
    }
}
