package io.bidmachine.iab.vast.tags;

import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastLog;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes14.dex */
class TrackingEventsTag extends VastXmlTag {
    private final EnumMap c;

    TrackingEventsTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        TrackingEvent trackingEvent;
        this.c = new EnumMap(TrackingEvent.class);
        xmlPullParser.require(2, null, "TrackingEvents");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), "Tracking")) {
                    String a = new TrackingTag(xmlPullParser).a("event");
                    try {
                        trackingEvent = TrackingEvent.valueOf(a);
                    } catch (Exception unused) {
                        VastLog.d("VastXmlTag", "Event: %s is not valid. Skipping it.", a);
                        trackingEvent = null;
                    }
                    if (trackingEvent != null) {
                        String c = VastXmlTag.c(xmlPullParser);
                        List list = (List) this.c.get(trackingEvent);
                        if (list != null) {
                            list.add(c);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(c);
                            this.c.put((EnumMap) trackingEvent, (TrackingEvent) arrayList);
                        }
                    } else {
                        VastXmlTag.d(xmlPullParser);
                    }
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "TrackingEvents");
    }

    EnumMap a() {
        return this.c;
    }
}
