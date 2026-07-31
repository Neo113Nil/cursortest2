package sg.bigo.ads.ci;

import android.os.Parcel;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;
import sg.bigo.ads.an.n;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes13.dex */
public final class c implements sg.bigo.ads.ai.d {
    private static final int[][] n = {new int[]{1, 2}, new int[]{3, 4}};
    int h;
    int a = 0;
    String b = "";
    String c = "";
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;

    @NonNull
    final a i = new a(3);

    @NonNull
    final a j = new a(4);

    @NonNull
    final a k = new a(12);

    @NonNull
    final a l = new a(1);

    @NonNull
    final a m = new a(20);

    class a implements sg.bigo.ads.an.f {
        public int a = 0;
        public int b = 20;
        public int c = 5;
        private int e;

        a(int i) {
            this.e = i;
        }

        @Override // sg.bigo.ads.an.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e);
            parcel.writeInt(this.c);
        }

        public final void a(JSONObject jSONObject) {
            String str;
            int i = this.e;
            if (i == 1) {
                this.a = jSONObject.optInt("nat_load_fail_fill", 0);
                this.c = jSONObject.optInt("nat_time_for_check_process", 5);
                str = "nat_min_video_loading_pro";
            } else if (i == 12) {
                this.a = jSONObject.optInt("spl_load_fail_fill", 0);
                this.c = jSONObject.optInt("spl_time_for_check_process", 5);
                str = "spl_min_video_loading_pro";
            } else if (i == 20) {
                this.a = jSONObject.optInt("pop_load_fail_fill", 0);
                this.c = jSONObject.optInt("pop_time_for_check_process", 5);
                this.b = jSONObject.optInt("pop_min_video_loading_pro", 20);
                return;
            } else if (i == 3) {
                this.a = jSONObject.optInt("int_load_fail_fill", 0);
                this.c = jSONObject.optInt("int_time_for_check_process", 5);
                str = "int_min_video_loading_pro";
            } else {
                if (i != 4) {
                    return;
                }
                this.a = jSONObject.optInt("rew_load_fail_fill", 0);
                this.c = jSONObject.optInt("rew_time_for_check_process", 5);
                str = "rew_min_video_loading_pro";
            }
            this.b = jSONObject.optInt(str, 20);
        }

        @Override // sg.bigo.ads.an.f
        public final void b(@NonNull Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt();
            this.c = parcel.readInt();
        }
    }

    @Override // sg.bigo.ads.ai.d
    public final int a() {
        return this.a;
    }

    @Override // sg.bigo.ads.ai.d
    public final int a(int i) {
        if (i == 1) {
            return this.g;
        }
        if (i == 12) {
            return this.f;
        }
        if (i == 20) {
            return this.h;
        }
        if (i == 3) {
            return this.d;
        }
        if (i != 4) {
            return 0;
        }
        return this.e;
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        n.a(parcel, this.i);
        n.a(parcel, this.j);
        n.a(parcel, this.k);
        n.a(parcel, this.l);
        parcel.writeInt(this.h);
        n.a(parcel, this.m);
    }

    @Override // sg.bigo.ads.ai.d
    public final boolean a(String str, int i) {
        int i2 = !r.a((CharSequence) this.b) ? 1 : 0;
        int i3 = !r.a((CharSequence) this.c) ? 1 : 0;
        if (a(i) > 0) {
            int i4 = n[i2][i3];
            if (i4 != 1) {
                if (i4 != 2) {
                    return i4 == 3 && r.a(this.b.split(StringUtils.COMMA), str);
                }
                if (!r.a(this.c.split(StringUtils.COMMA), str)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.ai.d
    public final int b(int i) {
        a aVar;
        if (i == 1) {
            aVar = this.l;
        } else if (i == 12) {
            aVar = this.k;
        } else if (i == 20) {
            aVar = this.m;
        } else if (i == 3) {
            aVar = this.i;
        } else {
            if (i != 4) {
                return 5;
            }
            aVar = this.j;
        }
        return aVar.c;
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        n.b(parcel, this.i);
        n.b(parcel, this.j);
        n.b(parcel, this.k);
        n.b(parcel, this.l);
        this.h = parcel.readInt();
        n.b(parcel, this.m);
    }

    @Override // sg.bigo.ads.ai.d
    public final boolean c(int i) {
        return i != 1 ? i != 12 ? i != 20 ? i != 3 ? i == 4 && this.j.a == 1 : this.i.a == 1 : this.m.a == 1 : this.k.a == 1 : this.l.a == 1;
    }

    @Override // sg.bigo.ads.ai.d
    public final int d(int i) {
        a aVar;
        if (i == 1) {
            aVar = this.l;
        } else if (i == 12) {
            aVar = this.k;
        } else if (i == 20) {
            aVar = this.m;
        } else if (i == 3) {
            aVar = this.i;
        } else {
            if (i != 4) {
                return 20;
            }
            aVar = this.j;
        }
        return aVar.b;
    }
}
