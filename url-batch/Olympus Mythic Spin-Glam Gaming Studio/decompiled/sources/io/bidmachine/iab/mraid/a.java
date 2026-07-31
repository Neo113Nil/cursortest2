package io.bidmachine.iab.mraid;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class a {
    static final DateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.US);
    static final String[] b = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};

    a() {
    }

    MraidCalendarEvent a(String str) {
        return b(new JSONObject(str));
    }

    MraidCalendarEvent b(JSONObject jSONObject) {
        String string = jSONObject.getString("description");
        Objects.requireNonNull(string);
        DateFormat dateFormat = a;
        Date parse = dateFormat.parse(jSONObject.getString("start"));
        Objects.requireNonNull(parse);
        MraidCalendarEvent mraidCalendarEvent = new MraidCalendarEvent(string, parse);
        if (jSONObject.has("location")) {
            mraidCalendarEvent.a(jSONObject.getString("location"));
        }
        if (jSONObject.has("summary")) {
            mraidCalendarEvent.d(jSONObject.getString("summary"));
        }
        if (jSONObject.has("end")) {
            mraidCalendarEvent.a(dateFormat.parse(jSONObject.getString("end")));
        }
        if (jSONObject.has("status")) {
            mraidCalendarEvent.c(jSONObject.getString("status"));
        }
        if (jSONObject.has("transparency")) {
            mraidCalendarEvent.e(jSONObject.getString("transparency"));
        }
        if (jSONObject.has("recurrence")) {
            mraidCalendarEvent.b(a(jSONObject.getJSONObject("recurrence")));
        }
        return mraidCalendarEvent;
    }

    void c(JSONObject jSONObject, StringBuilder sb) {
        if (jSONObject.isNull("interval")) {
            return;
        }
        try {
            sb.append("INTERVAL=");
            sb.append(jSONObject.getInt("interval"));
            sb.append(";");
        } catch (Exception unused) {
        }
    }

    void d(JSONObject jSONObject, StringBuilder sb) {
        try {
            if (jSONObject.isNull("frequency") || !"monthly".equalsIgnoreCase(jSONObject.getString("frequency"))) {
                return;
            }
            if (!jSONObject.isNull("daysInMonth")) {
                JSONArray jSONArray = jSONObject.getJSONArray("daysInMonth");
                if (jSONArray.length() > 0) {
                    sb.append("BYMONTHDAY=");
                    sb.append(b(jSONArray));
                    sb.append(";");
                }
            }
            if (jSONObject.isNull("weeksInMonth")) {
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("weeksInMonth");
            if (jSONArray2.length() > 0) {
                sb.append("BYWEEKNO=");
                sb.append(b(jSONArray2));
                sb.append(";");
            }
        } catch (Exception unused) {
        }
    }

    void e(JSONObject jSONObject, StringBuilder sb) {
        try {
            if (jSONObject.isNull("frequency") || !"weekly".equalsIgnoreCase(jSONObject.getString("frequency")) || jSONObject.isNull("daysInWeek")) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("daysInWeek");
            if (jSONArray.length() > 0) {
                sb.append("BYDAY=");
                sb.append(a(jSONArray));
                sb.append(";");
            }
        } catch (Exception unused) {
        }
    }

    void f(JSONObject jSONObject, StringBuilder sb) {
        try {
            if (jSONObject.isNull("frequency") || !"yearly".equalsIgnoreCase(jSONObject.getString("frequency"))) {
                return;
            }
            if (!jSONObject.isNull("monthsInYear")) {
                JSONArray jSONArray = jSONObject.getJSONArray("monthsInYear");
                if (jSONArray.length() > 0) {
                    sb.append("BYMONTH=");
                    sb.append(b(jSONArray));
                    sb.append(";");
                }
            }
            if (jSONObject.isNull("daysInYear")) {
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("daysInYear");
            if (jSONArray2.length() > 0) {
                sb.append("BYYEARDAY=");
                sb.append(b(jSONArray2));
                sb.append(";");
            }
        } catch (Exception unused) {
        }
    }

    String a(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        b(jSONObject, sb);
        c(jSONObject, sb);
        a(jSONObject, sb);
        e(jSONObject, sb);
        d(jSONObject, sb);
        f(jSONObject, sb);
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    void a(JSONObject jSONObject, StringBuilder sb) {
        if (jSONObject.isNull("expires")) {
            return;
        }
        try {
            Date parse = a.parse(jSONObject.getString("expires"));
            sb.append("UNTIL=");
            sb.append(parse);
            sb.append(";");
        } catch (Exception unused) {
        }
    }

    String a(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                sb.append(StringUtils.COMMA);
            }
            int i2 = jSONArray.getInt(i);
            if (i2 >= 0 && i2 <= 6) {
                sb.append(b[i2]);
            }
        }
        return sb.toString();
    }

    void b(JSONObject jSONObject, StringBuilder sb) {
        if (jSONObject.isNull("frequency")) {
            return;
        }
        try {
            sb.append("FREQ=");
            sb.append(jSONObject.getString("frequency"));
            sb.append(";");
        } catch (Exception unused) {
        }
    }

    String b(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(jSONArray.get(i).toString());
        }
        return sb.toString();
    }
}
