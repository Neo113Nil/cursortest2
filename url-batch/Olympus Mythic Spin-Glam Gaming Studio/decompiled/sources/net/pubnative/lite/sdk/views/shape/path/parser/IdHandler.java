package net.pubnative.lite.sdk.views.shape.path.parser;

import android.util.Log;
import java.util.HashMap;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
class IdHandler {
    private static final String TAG = SvgToPath.TAG;
    private final XmlPullParser atts;
    final HashMap<String, String> idXml = new HashMap<>();
    private final Stack<IdRecording> idRecordingStack = new Stack<>();

    class IdRecording {
        final String id;
        int level = 0;
        final StringBuilder sb = new StringBuilder();

        public IdRecording(String str) {
            this.id = str;
        }
    }

    IdHandler(XmlPullParser xmlPullParser) {
        this.atts = xmlPullParser;
    }

    private void appendElementString(StringBuilder sb, String str, XmlPullParser xmlPullParser) {
        sb.append("<");
        sb.append(str);
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            sb.append(" ");
            sb.append(xmlPullParser.getAttributeName(i));
            sb.append("='");
            sb.append(ParseUtil.escape(xmlPullParser.getAttributeValue(i)));
            sb.append("'");
        }
        sb.append(">");
    }

    void endElement() {
        String name = this.atts.getName();
        if (this.idRecordingStack.size() > 0) {
            IdRecording lastElement = this.idRecordingStack.lastElement();
            lastElement.sb.append("</");
            lastElement.sb.append(name);
            lastElement.sb.append(">");
            int i = lastElement.level - 1;
            lastElement.level = i;
            if (i == 0) {
                String sb = lastElement.sb.toString();
                this.idXml.put(lastElement.id, sb);
                this.idRecordingStack.pop();
                if (this.idRecordingStack.size() > 0) {
                    this.idRecordingStack.lastElement().sb.append(sb);
                }
                Log.w(TAG, sb);
            }
        }
    }

    public void processIds() {
        int eventType = this.atts.getEventType();
        do {
            if (eventType != 0 && eventType != 1) {
                if (eventType == 2) {
                    startElement();
                } else if (eventType == 3) {
                    endElement();
                }
            }
            eventType = this.atts.next();
        } while (eventType != 1);
    }

    void startElement() {
        String name = this.atts.getName();
        String stringAttr = ParseUtil.getStringAttr("id", this.atts);
        if (stringAttr != null) {
            this.idRecordingStack.push(new IdRecording(stringAttr));
        }
        if (this.idRecordingStack.size() > 0) {
            IdRecording lastElement = this.idRecordingStack.lastElement();
            lastElement.level++;
            appendElementString(lastElement.sb, name, this.atts);
        }
    }
}
