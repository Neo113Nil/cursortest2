package sg.bigo.ads.cj;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.i;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.u;
import sg.bigo.ads.dh.a;

/* loaded from: classes11.dex */
public final class l extends b implements sg.bigo.ads.cp.a {
    private static final AtomicInteger L = new AtomicInteger();
    protected String A;

    @Nullable
    protected o.a B;

    @Nullable
    protected o.a[] C;

    @Nullable
    protected o.c D;
    protected int E;
    protected int F;

    @Nullable
    protected o.b G;

    @Nullable
    protected o.d H;
    public int I;

    @Nullable
    protected i.b J;
    public sg.bigo.ads.bj.f K;

    @Nullable
    private sg.bigo.ads.dh.p M;

    @Nullable
    private sg.bigo.ads.api.core.n N;
    private boolean O;
    private String P;

    @NonNull
    private int Q;
    private int R;

    @NonNull
    private long S;
    private a.C1889a T;
    private a.C1889a U;
    private boolean V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private Pair<Bitmap, String> ac;
    private boolean ad;
    private final String ae;
    private String af;
    private boolean ag;
    private u ah;
    private int ai;
    private AtomicInteger aj;
    private AtomicInteger ak;
    private int al;
    private boolean am;

    protected l(long j, @NonNull sg.bigo.ads.api.core.h hVar, @NonNull sg.bigo.ads.ai.n nVar, @NonNull JSONObject jSONObject) {
        super(j, hVar, nVar, jSONObject);
        this.F = 0;
        this.I = 0;
        this.O = false;
        this.Q = 0;
        this.R = 0;
        this.V = false;
        this.W = false;
        this.X = 4;
        this.Z = 6;
        this.aa = 4;
        this.ab = 0;
        this.ad = false;
        this.aj = new AtomicInteger(0);
        this.ak = new AtomicInteger(0);
        this.am = true;
        this.A = jSONObject.optString("iurl");
        JSONObject optJSONObject = jSONObject.optJSONObject("icon");
        if (optJSONObject != null) {
            this.B = new i(optJSONObject);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    arrayList.add(new i(optJSONObject2));
                }
            }
            i[] iVarArr = new i[arrayList.size()];
            this.C = iVarArr;
            this.C = (o.a[]) arrayList.toArray(iVarArr);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("video");
        if (optJSONObject3 != null) {
            this.D = new r(optJSONObject3);
        }
        this.G = new j(jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_play_cfg");
        if (optJSONObject4 != null) {
            this.H = new s(optJSONObject4);
        }
        this.E = jSONObject.optInt("immersive_ad_type", 0);
        JSONObject optJSONObject5 = jSONObject.optJSONObject("display");
        if (optJSONObject5 != null) {
            this.J = new h(optJSONObject5);
        }
        this.ae = this.k + "_" + this.b + "_" + L.addAndGet(1);
    }

    @Nullable
    private sg.bigo.ads.dh.b bI() {
        sg.bigo.ads.dh.p pVar = this.M;
        if (pVar != null) {
            return pVar.n;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.o
    @NonNull
    public final String a(Context context) {
        return ba() ? sg.bigo.ads.an.o.c(context) : sg.bigo.ads.an.o.b(context);
    }

    @Override // sg.bigo.ads.api.core.o
    public final void a(Pair<Bitmap, String> pair) {
        this.ac = pair;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void a(sg.bigo.ads.api.core.n nVar) {
        sg.bigo.ads.api.core.n nVar2 = this.N;
        if (nVar2 == null || nVar2.c <= 0 || nVar.c != 0) {
            this.N = nVar;
        }
    }

    @Override // sg.bigo.ads.cp.a
    public final void a(a.C1889a c1889a) {
        this.T = c1889a;
    }

    @Override // sg.bigo.ads.cp.a
    public final void a(sg.bigo.ads.dh.p pVar) {
        this.M = pVar;
        if (pVar != null && sg.bigo.ads.common.utils.r.b((CharSequence) pVar.m)) {
            O().a(this.M.m);
        }
        o.d dVar = this.H;
        if (dVar != null) {
            dVar.a(bc());
        }
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final o.a aD() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final i.b aE() {
        return this.J;
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final o.a[] aF() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final o.c aG() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final String aH() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final o.b aI() {
        return this.G;
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final o.d aJ() {
        return this.H;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int aK() {
        return this.Q;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int aL() {
        return this.R;
    }

    @Override // sg.bigo.ads.api.core.o
    public final long aM() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aN() {
        a.C1889a c1889a = this.U;
        return c1889a != null && c1889a.a();
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aO() {
        a.C1889a c1889a = this.T;
        return c1889a != null && c1889a.a();
    }

    @Override // sg.bigo.ads.api.core.o
    public final int aP() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aQ() {
        return this.af;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aR() {
        return !TextUtils.isEmpty(this.ae) ? this.ae : String.valueOf(this.i);
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final String aS() {
        sg.bigo.ads.dh.b bI = bI();
        if (bI != null) {
            return bI.c;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.o
    public final long aT() {
        o.d dVar = this.H;
        if (dVar != null) {
            return dVar.a();
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int aU() {
        return this.I;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aV() {
        sg.bigo.ads.dh.b bI = bI();
        String str = bI != null ? bI.e : null;
        if (sg.bigo.ads.common.utils.r.b((CharSequence) str)) {
            return str;
        }
        sg.bigo.ads.dh.p pVar = this.M;
        if (pVar != null) {
            return pVar.o;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aW() {
        o.d dVar;
        if (!ba() && (dVar = this.H) != null && dVar.b() && dVar.c() < 100) {
            sg.bigo.ads.dh.b bI = bI();
            if (bI != null ? "video/mp4".equals(bI.d) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final String aX() {
        return aS();
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final String aY() {
        String aV = aV();
        if (!sg.bigo.ads.common.utils.r.a((CharSequence) aV)) {
            return aV;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aZ() {
        return this.g == 2;
    }

    @Override // sg.bigo.ads.api.core.o
    @NonNull
    public final String b(Context context) {
        return a(context) + File.separator + aY();
    }

    @Override // sg.bigo.ads.api.core.o
    public final void b(long j) {
        this.S = j;
    }

    @Override // sg.bigo.ads.cp.a
    public final void b(a.C1889a c1889a) {
        this.U = c1889a;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bA() {
        this.am = false;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String bB() {
        sg.bigo.ads.bj.f fVar = this.K;
        if (fVar != null) {
            return fVar.f;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String bC() {
        sg.bigo.ads.bj.f fVar = this.K;
        if (fVar != null) {
            return fVar.g;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String bD() {
        sg.bigo.ads.bj.f fVar = this.K;
        if (fVar != null) {
            return fVar.h;
        }
        return null;
    }

    @Override // sg.bigo.ads.cp.a
    public final a.C1889a bE() {
        return this.T;
    }

    @Override // sg.bigo.ads.cp.a
    public final a.C1889a bF() {
        return this.U;
    }

    @Override // sg.bigo.ads.cp.a
    @NonNull
    public final u bG() {
        if (this.ah == null) {
            this.ah = new u(this.z);
        }
        return this.ah;
    }

    @Override // sg.bigo.ads.cp.a
    public final sg.bigo.ads.dh.p bH() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean ba() {
        sg.bigo.ads.dh.b bI = bI();
        return bI != null && bI.a();
    }

    @Override // sg.bigo.ads.api.core.o
    public final String bb() {
        o.a aVar;
        o.a[] aVarArr = this.C;
        if (aVarArr == null || aVarArr.length <= 0 || (aVar = aVarArr[0]) == null) {
            return null;
        }
        return aVar.c();
    }

    @Override // sg.bigo.ads.api.core.o
    public final long bc() {
        sg.bigo.ads.dh.p pVar = this.M;
        if (pVar != null) {
            return pVar.s;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.o
    @Nullable
    public final sg.bigo.ads.api.core.n bd() {
        return this.N;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean be() {
        return this.O;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bf() {
        this.O = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String bg() {
        String bb;
        if (!sg.bigo.ads.common.utils.r.a((CharSequence) this.P)) {
            return this.P;
        }
        if (aZ()) {
            sg.bigo.ads.dh.b bI = bI();
            if (bI != null) {
                this.P = bI.d;
            }
            if (!sg.bigo.ads.common.utils.r.a((CharSequence) this.P)) {
                return this.P;
            }
            bb = aS();
        } else {
            bb = bb();
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(bb));
        this.P = mimeTypeFromExtension;
        return mimeTypeFromExtension;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean bh() {
        return this.ad;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bi() {
        this.ad = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean bj() {
        return this.V;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bk() {
        this.V = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bl() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bm() {
        return this.Y;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bn() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bo() {
        return this.aa;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bp() {
        return this.ab;
    }

    @Override // sg.bigo.ads.api.core.o
    public final Pair<Bitmap, String> bq() {
        return this.ac;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean br() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bs() {
        this.W = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bt() {
        this.ag = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean bu() {
        return this.ag;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bv() {
        return this.ai;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bw() {
        return this.aj.get();
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bx() {
        return this.ak.get();
    }

    @Override // sg.bigo.ads.api.core.o
    public final int by() {
        return this.al;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean bz() {
        return this.am;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String c(Context context) {
        Pair pair;
        if (!aW()) {
            this.I = 0;
            return b(context);
        }
        sg.bigo.ads.cw.d b = sg.bigo.ads.core.player.b.a().b();
        String aS = aS();
        String a = a(context);
        String aY = aY();
        File file = new File(a, aY);
        if (file.exists()) {
            pair = new Pair(Uri.fromFile(file).toString(), 1);
        } else if (b.a()) {
            StringBuilder sb = new StringBuilder(aS);
            if (aS.contains("?")) {
                sb.append(X3.j.c);
            } else {
                sb.append("?");
            }
            sb.append("path=");
            sb.append(a);
            sb.append(X3.j.c);
            sb.append("name=");
            sb.append(aY);
            pair = new Pair(String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(b.c), sg.bigo.ads.common.utils.r.e(sb.toString())), 2);
        } else {
            pair = new Pair(aS, 3);
        }
        this.I = ((Integer) pair.second).intValue();
        return (String) pair.first;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void c(String str) {
        if ("video/mp4".equals(this.P) || sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            return;
        }
        this.P = str;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean c(@IntRange long j) {
        o.d dVar = this.H;
        return j >= ((long) (dVar != null ? dVar.c() : 50));
    }

    @Override // sg.bigo.ads.api.core.o
    public final void f(int i) {
        this.Q = i;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void g(int i) {
        this.R = i;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void h(int i) {
        this.X = i;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void i(int i) {
        this.Y = i;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void j(int i) {
        this.Z = i;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void k(int i) {
        this.aa = i;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void l(int i) {
        this.ab = i;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void m(int i) {
        this.ai = i;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void n(int i) {
        this.aj.set(i);
    }

    @Override // sg.bigo.ads.api.core.o
    public final void o(int i) {
        this.ak.set(i);
    }

    @Override // sg.bigo.ads.api.core.o
    public final void p(int i) {
        this.al = i;
    }

    @Override // sg.bigo.ads.cj.b, sg.bigo.ads.api.core.b
    public final String t() {
        sg.bigo.ads.dh.p pVar = this.M;
        return (pVar == null || !sg.bigo.ads.common.utils.r.b((CharSequence) pVar.p)) ? super.t() : this.M.p;
    }

    @Override // sg.bigo.ads.cj.b, sg.bigo.ads.api.core.b
    public final String u() {
        sg.bigo.ads.dh.p pVar = this.M;
        return (pVar == null || !sg.bigo.ads.common.utils.r.b((CharSequence) pVar.q)) ? super.u() : this.M.q;
    }
}
