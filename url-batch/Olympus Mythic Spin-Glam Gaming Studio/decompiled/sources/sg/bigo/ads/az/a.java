package sg.bigo.ads.az;

import android.util.Pair;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public int a = 3;
    public int b = 20;
    public int c = 40;
    public long d = 432000000;
    public boolean e = false;

    public a() {
        c();
    }

    private void c() {
        this.a = 3;
        this.b = 20;
        this.c = 40;
        this.d = 432000000L;
        this.e = false;
    }

    public final int a() {
        int i = this.b;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public final Pair<Boolean, Boolean> a(int i, long j, long j2) {
        return new Pair<>(Boolean.valueOf(j + this.d < j2), Boolean.valueOf(i >= a()));
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            c();
            return;
        }
        this.e = jSONObject.optInt("retry", 0) == 1;
        this.a = jSONObject.optInt("download_parallel_num", 3);
        int optInt = jSONObject.optInt("num", 20);
        this.b = optInt;
        this.c = optInt * 2;
        long optInt2 = jSONObject.optInt("valid_period") * 1000;
        if (optInt2 == 0) {
            optInt2 = 432000000;
        }
        this.d = optInt2;
    }

    public final boolean b() {
        return this.a <= 0;
    }
}
