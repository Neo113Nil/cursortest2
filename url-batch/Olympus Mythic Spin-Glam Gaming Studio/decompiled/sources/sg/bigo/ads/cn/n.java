package sg.bigo.ads.cn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.cn.a;

/* loaded from: classes12.dex */
public final class n extends e<sg.bigo.ads.cf.e> {
    public n(@NonNull Map<String, Object> map, @NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.cf.b bVar, @NonNull sg.bigo.ads.ce.b bVar2) {
        super(map, gVar, bVar, bVar2);
    }

    @Override // sg.bigo.ads.cn.e, sg.bigo.ads.cn.a
    protected final void a(@NonNull a.b bVar) {
        super.a(bVar);
        bVar.a("token", this.b.P());
        bVar.a("req_status", Integer.valueOf(sg.bigo.ads.at.b.c()));
    }

    @Override // sg.bigo.ads.cn.a
    @Nullable
    protected final sg.bigo.ads.bh.e c() {
        return sg.bigo.ads.bp.e.c();
    }

    @Override // sg.bigo.ads.cn.a
    protected final long e() {
        sg.bigo.ads.cf.b bVar = this.c;
        return bVar != null ? bVar.a.l.e : super.e();
    }

    @Override // sg.bigo.ads.cn.a
    @NonNull
    protected final /* synthetic */ sg.bigo.ads.bo.a f() {
        return this.c.b("/Ad/ReportUniBaina", null);
    }

    @Override // sg.bigo.ads.cn.a
    protected final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.cn.a
    protected final void i() {
        sg.bigo.ads.bw.a.D();
    }

    @Override // sg.bigo.ads.cn.a
    protected final boolean j() {
        return sg.bigo.ads.ai.k.a.f() && sg.bigo.ads.bw.a.C();
    }
}
