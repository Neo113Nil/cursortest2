package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lb3 {
    public static final kb3 c;
    public static final lb3 d;
    public static final lb3 e;
    public static final lb3 f;
    public static final lb3 g;
    public static final /* synthetic */ lb3[] h;
    public final String b;

    static {
        lb3 lb3Var = new lb3(0, "SMS_SCHEME", "sms:");
        lb3 lb3Var2 = new lb3(1, "MAIL_SCHEME", "mailto:");
        lb3 lb3Var3 = new lb3(2, "VOICE_MAIL_SCHEME", "voicemail:");
        lb3 lb3Var4 = new lb3(3, "TEL_SCHEME", "tel:");
        lb3 lb3Var5 = new lb3(4, "CALLTO", "callto:");
        lb3 lb3Var6 = new lb3(5, "FAX", "fax:");
        lb3 lb3Var7 = new lb3(6, "GEO_SCHEME", "geo:");
        lb3 lb3Var8 = new lb3(7, "MAP_SCHEME", "map:");
        lb3 lb3Var9 = new lb3(8, "MAPS_SCHEME", "maps:");
        lb3 lb3Var10 = new lb3(9, "GOOGLE_MARKET_SCHEME", "market:");
        d = lb3Var10;
        lb3 lb3Var11 = new lb3(10, "GOOGLE_PLAY_SCHEME", "play:");
        e = lb3Var11;
        lb3 lb3Var12 = new lb3(11, "GOOGLE_STREET_VIEW_SCHEME", "google.streetview:");
        lb3 lb3Var13 = new lb3(12, "GOOGLE_MARKET_HOST", "market.android");
        f = lb3Var13;
        lb3 lb3Var14 = new lb3(13, "GOOGLE_PLAY_HOST", "play.google");
        g = lb3Var14;
        lb3[] lb3VarArr = {lb3Var, lb3Var2, lb3Var3, lb3Var4, lb3Var5, lb3Var6, lb3Var7, lb3Var8, lb3Var9, lb3Var10, lb3Var11, lb3Var12, lb3Var13, lb3Var14, new lb3(14, "MAP_HOST", "map"), new lb3(15, "MAPS_HOST", "maps"), new lb3(16, "MOBMAPS", "mobile.maps"), new lb3(17, "SHORTMOBMAPS", "m.maps"), new lb3(18, "MESSAGE", "message:"), new lb3(19, "SIP", "sip:"), new lb3(20, "SKYPE", "skype:"), new lb3(21, "SMS", "sms:"), new lb3(22, "GTALK", "gtalk:"), new lb3(23, "SPOTIFY", "spotify:"), new lb3(24, "LASTFM", "lastfm:")};
        h = lb3VarArr;
        EnumEntriesKt.enumEntries(lb3VarArr);
        c = new kb3();
    }

    public lb3(int i, String str, String str2) {
        this.b = str2;
    }

    public static lb3 valueOf(String str) {
        return (lb3) Enum.valueOf(lb3.class, str);
    }

    public static lb3[] values() {
        return (lb3[]) h.clone();
    }
}
