package io.bidmachine.analytics.internal.G;

import io.bidmachine.analytics.internal.g.h;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class g {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.a.values().length];
            try {
                iArr[h.a.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.MONITOR_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.MONITOR_NO_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.a.MONITOR_BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.a.READER_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.a.READER_NO_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.a.READER_BAD_CONTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.a.READER_NO_ACCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final JSONObject a(h hVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", hVar.a());
        jSONObject.put("type", a(hVar.c()));
        jSONObject.put("reason", hVar.b());
        return jSONObject;
    }

    public static final h a(JSONObject jSONObject) {
        try {
            return new h(jSONObject.getString("name"), a(jSONObject.getInt("type")), jSONObject.optString("reason"));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final int a(h.a aVar) {
        switch (a.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return 2000;
            case 2:
                return 2100;
            case 3:
                return 2101;
            case 4:
                return 2102;
            case 5:
                return 2200;
            case 6:
                return 2201;
            case 7:
                return 2202;
            case 8:
                return 2203;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final h.a a(int i) {
        switch (i) {
            case 2100:
                return h.a.MONITOR_INVALID;
            case 2101:
                return h.a.MONITOR_NO_CONTENT;
            case 2102:
                return h.a.MONITOR_BAD_CONTENT;
            default:
                switch (i) {
                    case 2200:
                        return h.a.READER_INVALID;
                    case 2201:
                        return h.a.READER_NO_CONTENT;
                    case 2202:
                        return h.a.READER_BAD_CONTENT;
                    case 2203:
                        return h.a.READER_NO_ACCESS;
                    default:
                        return h.a.UNKNOWN;
                }
        }
    }
}
