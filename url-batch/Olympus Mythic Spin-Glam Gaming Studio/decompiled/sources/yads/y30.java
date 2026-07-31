package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y30 {
    public static final y30 c;
    public static final y30 d;
    public static final y30 e;
    public static final y30 f;
    public static final y30 g;
    public static final y30 h;
    public static final /* synthetic */ y30[] i;
    public final String b;

    static {
        y30 y30Var = new y30(0, "CROSS_CLICKED", "cross_clicked");
        c = y30Var;
        y30 y30Var2 = new y30(1, "ACTIVITY_OPENED", "activity_opened");
        d = y30Var2;
        y30 y30Var3 = new y30(2, "ACTIVITY_RESTARTED", "activity_restarted");
        e = y30Var3;
        y30 y30Var4 = new y30(3, "CROSS_TIMER_START", "cross_timer_start");
        f = y30Var4;
        y30 y30Var5 = new y30(4, "CROSS_TIMER_END", "cross_timer_end");
        g = y30Var5;
        y30 y30Var6 = new y30(5, "FAILED_TO_CREATE_DOWNLOAD_MANAGER", "failed_to_create_download_manager");
        h = y30Var6;
        y30[] y30VarArr = {y30Var, y30Var2, y30Var3, y30Var4, y30Var5, y30Var6, new y30(6, "LISTENER_IS_NULL_ON_LOADING_FINISHED", "listener_is_null_on_loading_finished")};
        i = y30VarArr;
        EnumEntriesKt.enumEntries(y30VarArr);
    }

    public y30(int i2, String str, String str2) {
        this.b = str2;
    }

    public static y30 valueOf(String str) {
        return (y30) Enum.valueOf(y30.class, str);
    }

    public static y30[] values() {
        return (y30[]) i.clone();
    }
}
