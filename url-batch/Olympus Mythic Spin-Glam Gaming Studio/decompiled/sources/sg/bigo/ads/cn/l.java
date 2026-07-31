package sg.bigo.ads.cn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.cn.a;

/* loaded from: classes12.dex */
public final class l extends sg.bigo.ads.cn.a<sg.bigo.ads.cf.e> {
    private a j;

    public interface a {
        void a(String str, int i, int i2, int i3, @NonNull String str2, @Nullable Map<String, Object> map);

        void a(String str, int i, String str2, @Nullable Map<String, Object> map);
    }

    public l(@NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.cf.b bVar, a aVar) {
        super(gVar, bVar);
        this.j = aVar;
    }

    @Override // sg.bigo.ads.cn.a
    protected final void a(int i, int i2, String str) {
    }

    @Override // sg.bigo.ads.cn.a
    protected final void a(String str, int i, int i2, String str2, @Nullable Map<String, Object> map) {
        super.a(str, i, i2, str2, map);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(str, a(), i, i2, str2, map);
        }
    }

    @Override // sg.bigo.ads.cn.a
    protected final void a(String str, @NonNull String str2, @NonNull Map<String, Object> map) {
        super.a(str, str2, map);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(str, a(), str2, map);
        }
    }

    @Override // sg.bigo.ads.cn.a
    protected final void a(@NonNull String str, @NonNull Map<String, Object> map) {
    }

    @Override // sg.bigo.ads.cn.a
    protected final void a(@NonNull a.b bVar) {
    }

    @Override // sg.bigo.ads.cn.a
    @Nullable
    protected final sg.bigo.ads.bh.e c() {
        return sg.bigo.ads.bp.e.b();
    }

    @Override // sg.bigo.ads.cn.a
    protected final sg.bigo.ads.bo.f d() {
        return sg.bigo.ads.bo.f.a("application/json");
    }

    @Override // sg.bigo.ads.cn.a
    protected final long e() {
        sg.bigo.ads.cf.b bVar = this.c;
        return bVar != null ? bVar.a.l.a : super.e();
    }

    @Override // sg.bigo.ads.cn.a
    @NonNull
    protected final /* synthetic */ sg.bigo.ads.cf.e f() {
        String str = this.i;
        return str != null ? this.c.b("/Ad/GetSDKConfig", str) : this.c.b("/Ad/GetSDKConfig", null);
    }

    @Override // sg.bigo.ads.cn.a
    protected final boolean h() {
        return false;
    }

    @Override // sg.bigo.ads.cn.a
    protected final void i() {
    }

    @Override // sg.bigo.ads.cn.a
    protected final boolean j() {
        return false;
    }
}
