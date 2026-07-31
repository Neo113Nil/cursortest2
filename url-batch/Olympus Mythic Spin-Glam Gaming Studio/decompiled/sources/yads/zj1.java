package yads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class zj1 extends gk1 implements tj1 {
    public final Context G0;
    public final ak H0;
    public final pc0 I0;
    public int J0;
    public boolean K0;
    public jw0 L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public nn2 Q0;

    public zj1(Context context, vj1 vj1Var, ik1 ik1Var, boolean z, Handler handler, un0 un0Var, pc0 pc0Var) {
        super(1, vj1Var, ik1Var, z, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = pc0Var;
        this.H0 = new ak(handler, un0Var);
        pc0Var.r = new yj1(this);
    }

    @Override // yads.tj1
    public final long a() {
        if (this.g == 2) {
            long a = this.I0.a(e());
            if (a != Long.MIN_VALUE) {
                if (!this.O0) {
                    a = Math.max(this.M0, a);
                }
                this.M0 = a;
                this.O0 = false;
            }
        }
        return this.M0;
    }

    @Override // yads.fo
    public final tj1 b() {
        return this;
    }

    @Override // yads.gk1
    public final boolean b(jw0 jw0Var) {
        return this.I0.a(jw0Var) != 0;
    }

    @Override // yads.fo
    public final String c() {
        return "MediaCodecAudioRenderer";
    }

    @Override // yads.gk1, yads.fo
    public final boolean e() {
        if (this.x0) {
            pc0 pc0Var = this.I0;
            if (!pc0Var.f() || (pc0Var.S && (!pc0Var.f() || !pc0Var.i.b(pc0Var.d())))) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.gk1, yads.fo
    public final boolean f() {
        pc0 pc0Var = this.I0;
        return (pc0Var.f() && pc0Var.i.b(pc0Var.d())) || super.f();
    }

    @Override // yads.fo
    public final void g() {
        this.P0 = true;
        try {
            this.I0.b();
            try {
                this.B = null;
                this.C0 = -9223372036854775807L;
                this.D0 = -9223372036854775807L;
                this.E0 = 0;
                o();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.B = null;
                this.C0 = -9223372036854775807L;
                this.D0 = -9223372036854775807L;
                this.E0 = 0;
                o();
                throw th;
            } finally {
            }
        }
    }

    @Override // yads.tj1
    public final re2 getPlaybackParameters() {
        pc0 pc0Var = this.I0;
        return pc0Var.k ? pc0Var.y : pc0Var.c().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // yads.fo
    public final void h() {
        try {
            try {
                this.m0 = false;
                this.u.b();
                this.t.b();
                this.l0 = false;
                this.k0 = false;
                t();
            } finally {
                um0.a(this.E, null);
                this.E = null;
            }
        } finally {
            if (this.P0) {
                this.P0 = false;
                pc0 pc0Var = this.I0;
                pc0Var.b();
                for (zj zjVar : pc0Var.f) {
                    zjVar.d();
                }
                for (zj zjVar2 : pc0Var.g) {
                    zjVar2.d();
                }
                pc0Var.U = false;
                pc0Var.a0 = false;
            }
        }
    }

    @Override // yads.fo
    public final void i() {
        this.I0.h();
    }

    @Override // yads.fo
    public final void j() {
        long a = this.I0.a(e());
        if (a != Long.MIN_VALUE) {
            if (!this.O0) {
                a = Math.max(this.M0, a);
            }
            this.M0 = a;
            this.O0 = false;
        }
        this.I0.g();
    }

    @Override // yads.gk1
    public final void r() {
        this.I0.G = true;
    }

    @Override // yads.gk1
    public final void u() {
        try {
            pc0 pc0Var = this.I0;
            if (!pc0Var.S && pc0Var.f() && pc0Var.a()) {
                pc0Var.i();
                pc0Var.S = true;
            }
        } catch (fk e) {
            throw a(e, e.d, e.c, 5002);
        }
    }

    @Override // yads.gk1
    public final void b(fb0 fb0Var) {
        if (!this.N0 || fb0Var.b(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(fb0Var.f - this.M0) > 500000) {
            this.M0 = fb0Var.f;
        }
        this.N0 = false;
    }

    @Override // yads.gk1
    public final boolean a(long j, long j2, xj1 xj1Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, jw0 jw0Var) {
        byteBuffer.getClass();
        if (this.L0 != null && (i2 & 2) != 0) {
            xj1Var.getClass();
            xj1Var.a(false, i);
            return true;
        }
        if (z) {
            if (xj1Var != null) {
                xj1Var.a(false, i);
            }
            this.B0.f += i3;
            this.I0.G = true;
            return true;
        }
        try {
            if (!this.I0.a(byteBuffer, j3, i3)) {
                return false;
            }
            if (xj1Var != null) {
                xj1Var.a(false, i);
            }
            this.B0.e += i3;
            return true;
        } catch (dk e) {
            throw a(e, e.d, e.c, 5001);
        } catch (fk e2) {
            throw a(e2, jw0Var, e2.c, 5002);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if ((r4.isEmpty() ? null : (yads.ck1) r4.get(0)) != null) goto L30;
     */
    @Override // yads.gk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(ik1 ik1Var, jw0 jw0Var) {
        boolean z;
        if (!"audio".equals(vt1.c(jw0Var.m))) {
            return fo.a(0, 0, 0);
        }
        int i = sb3.a >= 21 ? 32 : 0;
        int i2 = jw0Var.F;
        boolean z2 = true;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        if (z4 && this.I0.a(jw0Var) != 0) {
            if (z3) {
                List a = qk1.a("audio/raw", false, false);
            }
            return fo.a(4, 8, i);
        }
        if ("audio/raw".equals(jw0Var.m) && this.I0.a(jw0Var) == 0) {
            return fo.a(1, 0, 0);
        }
        pc0 pc0Var = this.I0;
        int i4 = jw0Var.z;
        int i5 = jw0Var.A;
        iw0 iw0Var = new iw0();
        iw0Var.k = "audio/raw";
        iw0Var.x = i4;
        iw0Var.y = i5;
        iw0Var.z = 2;
        if (pc0Var.a(new jw0(iw0Var)) != 0) {
            l41 a2 = a(ik1Var, jw0Var, false, this.I0);
            if (a2.isEmpty()) {
                return fo.a(1, 0, 0);
            }
            if (!z4) {
                return fo.a(2, 0, 0);
            }
            ck1 ck1Var = (ck1) a2.get(0);
            boolean a3 = ck1Var.a(jw0Var);
            if (!a3) {
                for (int i6 = 1; i6 < a2.size(); i6++) {
                    ck1 ck1Var2 = (ck1) a2.get(i6);
                    if (ck1Var2.a(jw0Var)) {
                        z = false;
                        ck1Var = ck1Var2;
                        break;
                    }
                }
            }
            z = true;
            z2 = a3;
            int i7 = z2 ? 4 : 3;
            if (z2 && ck1Var.b(jw0Var)) {
                i3 = 16;
            }
            return i7 | i3 | i | (ck1Var.g ? 64 : 0) | (z ? 128 : 0);
        }
        return fo.a(1, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("QVhPTiA3IG1pbmk=", 0), r11).equals(r9) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd A[LOOP:1: B:26:0x00b7->B:28:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    @Override // yads.gk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uj1 a(ck1 ck1Var, jw0 jw0Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        MediaFormat mediaFormat;
        List list;
        int i;
        jw0[] jw0VarArr = this.i;
        jw0VarArr.getClass();
        int a = a(jw0Var, ck1Var);
        if (jw0VarArr.length != 1) {
            for (jw0 jw0Var2 : jw0VarArr) {
                if (ck1Var.a(jw0Var, jw0Var2).d != 0) {
                    a = Math.max(a, a(jw0Var2, ck1Var));
                }
            }
        }
        this.J0 = a;
        String str = ck1Var.a;
        int i2 = sb3.a;
        if (i2 < 24) {
            byte[] decode = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(decode, charset).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset).equals(sb3.c)) {
                String str2 = sb3.b;
                if (str2.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset)) || str2.startsWith(new String(Base64.decode("aGVyb2x0ZQ==", 0), charset)) || str2.startsWith(new String(Base64.decode("aGVyb3FsdGU=", 0), charset))) {
                    z = true;
                    this.K0 = z;
                    String str3 = ck1Var.c;
                    int i3 = this.J0;
                    mediaFormat = new MediaFormat();
                    mediaFormat.setString("mime", str3);
                    mediaFormat.setInteger("channel-count", jw0Var.z);
                    mediaFormat.setInteger("sample-rate", jw0Var.A);
                    list = jw0Var.o;
                    for (i = 0; i < list.size(); i++) {
                        mediaFormat.setByteBuffer(gg2.a(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
                    }
                    kl1.a(mediaFormat, "max-input-size", i3);
                    if (i2 >= 23) {
                        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                        if (f != -1.0f) {
                            if (i2 == 23) {
                                byte[] decode2 = Base64.decode("WlRFIEIyMDE3Rw==", 0);
                                Charset charset2 = Charsets.UTF_8;
                                String str4 = new String(decode2, charset2);
                                String str5 = sb3.d;
                                if (!str4.equals(str5)) {
                                }
                            }
                            mediaFormat.setFloat("operating-rate", f);
                        }
                    }
                    if (i2 <= 28 && "audio/ac4".equals(jw0Var.m)) {
                        mediaFormat.setInteger(new String(Base64.decode("YWM0LWlzLXN5bmM=", 0), Charsets.UTF_8), 1);
                    }
                    if (i2 >= 24) {
                        pc0 pc0Var = this.I0;
                        int i4 = jw0Var.z;
                        int i5 = jw0Var.A;
                        iw0 iw0Var = new iw0();
                        iw0Var.k = "audio/raw";
                        iw0Var.x = i4;
                        iw0Var.y = i5;
                        iw0Var.z = 4;
                        if (pc0Var.a(new jw0(iw0Var)) == 2) {
                            mediaFormat.setInteger("pcm-encoding", 4);
                        }
                    }
                    if (i2 >= 32) {
                        mediaFormat.setInteger("max-output-channel-count", 99);
                    }
                    this.L0 = ("audio/raw".equals(ck1Var.b) || "audio/raw".equals(jw0Var.m)) ? null : jw0Var;
                    return new uj1(ck1Var, mediaFormat, jw0Var, null, mediaCrypto);
                }
            }
        }
        z = false;
        this.K0 = z;
        String str32 = ck1Var.c;
        int i32 = this.J0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        mediaFormat.setInteger("channel-count", jw0Var.z);
        mediaFormat.setInteger("sample-rate", jw0Var.A);
        list = jw0Var.o;
        while (i < list.size()) {
        }
        kl1.a(mediaFormat, "max-input-size", i32);
        if (i2 >= 23) {
        }
        if (i2 <= 28) {
            mediaFormat.setInteger(new String(Base64.decode("YWM0LWlzLXN5bmM=", 0), Charsets.UTF_8), 1);
        }
        if (i2 >= 24) {
        }
        if (i2 >= 32) {
        }
        this.L0 = ("audio/raw".equals(ck1Var.b) || "audio/raw".equals(jw0Var.m)) ? null : jw0Var;
        return new uj1(ck1Var, mediaFormat, jw0Var, null, mediaCrypto);
    }

    @Override // yads.gk1
    public final ArrayList a(ik1 ik1Var, jw0 jw0Var, boolean z) {
        return qk1.a(a(ik1Var, jw0Var, z, this.I0), jw0Var);
    }

    public static l41 a(ik1 ik1Var, jw0 jw0Var, boolean z, pc0 pc0Var) {
        String str = jw0Var.m;
        if (str == null) {
            i41 i41Var = l41.c;
            return um2.f;
        }
        if (pc0Var.a(jw0Var) != 0) {
            List a = qk1.a("audio/raw", false, false);
            ck1 ck1Var = a.isEmpty() ? null : (ck1) a.get(0);
            if (ck1Var != null) {
                return l41.a(ck1Var);
            }
        }
        List a2 = ik1Var.a(str, z, false);
        String a3 = qk1.a(jw0Var);
        if (a3 == null) {
            return l41.a(a2);
        }
        List a4 = ik1Var.a(a3, z, false);
        i41 i41Var2 = l41.c;
        return new h41().a(a2).a(a4).a();
    }

    @Override // yads.gk1
    public final hb0 a(ck1 ck1Var, jw0 jw0Var, jw0 jw0Var2) {
        hb0 a = ck1Var.a(jw0Var, jw0Var2);
        int i = a.e;
        if (a(jw0Var2, ck1Var) > this.J0) {
            i |= 64;
        }
        int i2 = i;
        return new hb0(ck1Var.a, jw0Var, jw0Var2, i2 != 0 ? 0 : a.d, i2);
    }

    @Override // yads.gk1
    public final float a(float f, jw0[] jw0VarArr) {
        int i = -1;
        for (jw0 jw0Var : jw0VarArr) {
            int i2 = jw0Var.A;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    @Override // yads.gk1
    public final void a(String str, long j, long j2) {
        this.H0.a(str, j, j2);
    }

    @Override // yads.gk1
    public final void a(String str) {
        this.H0.a(str);
    }

    @Override // yads.gk1
    public final void a(Exception exc) {
        gh1.b("MediaCodecAudioRenderer", gh1.a("Audio codec error", exc));
        this.H0.a(exc);
    }

    @Override // yads.gk1
    public final hb0 a(kw0 kw0Var) {
        hb0 a = super.a(kw0Var);
        this.H0.a(kw0Var.b, a);
        return a;
    }

    @Override // yads.gk1
    public final void a(jw0 jw0Var, MediaFormat mediaFormat) {
        int b;
        int i;
        jw0 jw0Var2 = this.L0;
        int[] iArr = null;
        if (jw0Var2 != null) {
            jw0Var = jw0Var2;
        } else if (this.K != null) {
            if ("audio/raw".equals(jw0Var.m)) {
                b = jw0Var.B;
            } else if (sb3.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                b = mediaFormat.getInteger("pcm-encoding");
            } else {
                b = mediaFormat.containsKey("v-bits-per-sample") ? sb3.b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            iw0 iw0Var = new iw0();
            iw0Var.k = "audio/raw";
            iw0Var.z = b;
            iw0Var.A = jw0Var.C;
            iw0Var.B = jw0Var.D;
            iw0Var.x = mediaFormat.getInteger("channel-count");
            iw0Var.y = mediaFormat.getInteger("sample-rate");
            jw0 jw0Var3 = new jw0(iw0Var);
            if (this.K0 && jw0Var3.z == 6 && (i = jw0Var.z) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < jw0Var.z; i2++) {
                    iArr[i2] = i2;
                }
            }
            jw0Var = jw0Var3;
        }
        try {
            this.I0.a(jw0Var, iArr);
        } catch (ck e) {
            throw a((Exception) e, e.b, false, 5001);
        }
    }

    @Override // yads.gk1, yads.fo
    public final void a(long j, boolean z) {
        super.a(j, z);
        this.I0.b();
        this.M0 = j;
        this.N0 = true;
        this.O0 = true;
    }

    @Override // yads.tj1
    public final void a(re2 re2Var) {
        pc0 pc0Var = this.I0;
        pc0Var.getClass();
        float f = re2Var.b;
        int i = sb3.a;
        re2 re2Var2 = new re2(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(re2Var.c, 8.0f)));
        if (pc0Var.k && sb3.a >= 23) {
            pc0Var.a(re2Var2);
            return;
        }
        boolean z = pc0Var.c().b;
        kc0 c = pc0Var.c();
        if (re2Var2.equals(c.a) && z == c.b) {
            return;
        }
        kc0 kc0Var = new kc0(re2Var2, z, -9223372036854775807L, -9223372036854775807L);
        if (pc0Var.f()) {
            pc0Var.w = kc0Var;
        } else {
            pc0Var.x = kc0Var;
        }
    }

    @Override // yads.fo
    public final void a(boolean z) {
        cb0 cb0Var = new cb0();
        this.B0 = cb0Var;
        this.H0.b(cb0Var);
        on2 on2Var = this.d;
        on2Var.getClass();
        if (on2Var.a) {
            pc0 pc0Var = this.I0;
            pc0Var.getClass();
            if (sb3.a >= 21) {
                if (pc0Var.V) {
                    if (!pc0Var.Y) {
                        pc0Var.Y = true;
                        pc0Var.b();
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            pc0 pc0Var2 = this.I0;
            if (pc0Var2.Y) {
                pc0Var2.Y = false;
                pc0Var2.b();
            }
        }
        pc0 pc0Var3 = this.I0;
        ff2 ff2Var = this.f;
        ff2Var.getClass();
        pc0Var3.q = ff2Var;
    }

    @Override // yads.fo, yads.hf2
    public final void a(int i, Object obj) {
        if (i == 2) {
            pc0 pc0Var = this.I0;
            float floatValue = ((Float) obj).floatValue();
            if (pc0Var.J != floatValue) {
                pc0Var.J = floatValue;
                pc0Var.j();
                return;
            }
            return;
        }
        if (i == 3) {
            nj njVar = (nj) obj;
            pc0 pc0Var2 = this.I0;
            if (pc0Var2.v.equals(njVar)) {
                return;
            }
            pc0Var2.v = njVar;
            if (pc0Var2.Y) {
                return;
            }
            pc0Var2.b();
            return;
        }
        if (i != 6) {
            switch (i) {
                case 9:
                    pc0 pc0Var3 = this.I0;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    re2 re2Var = pc0Var3.c().a;
                    kc0 c = pc0Var3.c();
                    if (!re2Var.equals(c.a) || booleanValue != c.b) {
                        kc0 kc0Var = new kc0(re2Var, booleanValue, -9223372036854775807L, -9223372036854775807L);
                        if (pc0Var3.f()) {
                            pc0Var3.w = kc0Var;
                            break;
                        } else {
                            pc0Var3.x = kc0Var;
                            break;
                        }
                    }
                    break;
                case 10:
                    pc0 pc0Var4 = this.I0;
                    int intValue = ((Integer) obj).intValue();
                    if (pc0Var4.W != intValue) {
                        pc0Var4.W = intValue;
                        pc0Var4.V = intValue != 0;
                        pc0Var4.b();
                        break;
                    }
                    break;
                case 11:
                    this.Q0 = (nn2) obj;
                    break;
            }
            return;
        }
        mk mkVar = (mk) obj;
        pc0 pc0Var5 = this.I0;
        if (pc0Var5.X.equals(mkVar)) {
            return;
        }
        mkVar.getClass();
        if (pc0Var5.u != null) {
            pc0Var5.X.getClass();
        }
        pc0Var5.X = mkVar;
    }

    public final int a(jw0 jw0Var, ck1 ck1Var) {
        int i;
        if (!tk2.a.a().equals(ck1Var.a) || (i = sb3.a) >= 24 || (i == 23 && sb3.c(this.G0))) {
            return jw0Var.n;
        }
        return -1;
    }
}
