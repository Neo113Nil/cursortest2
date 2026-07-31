package yads;

import android.os.SystemClock;
import com.ironsource.Hb;
import com.ironsource.X3;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class po {
    public final g11 a;
    public final uq b;

    public po(g11 g11Var) {
        uq uqVar = new uq();
        this.a = g11Var;
        this.b = uqVar;
    }

    public final u82 a(ro2 ro2Var) {
        IOException e;
        byte[] bArr;
        e92 e92Var;
        int i;
        Map map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            e11 e11Var = null;
            try {
                zq zqVar = ro2Var.p;
                if (zqVar == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str = zqVar.b;
                    if (str != null) {
                        hashMap.put("If-None-Match", str);
                    }
                    long j = zqVar.d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = hashMap;
                }
                e11 a = this.a.a(ro2Var, map);
                try {
                    int i2 = a.a;
                    List unmodifiableList = Collections.unmodifiableList(a.b);
                    if (i2 == 304) {
                        SystemClock.elapsedRealtime();
                        return f92.a(ro2Var, unmodifiableList);
                    }
                    InputStream inputStream = a.d;
                    if (inputStream == null) {
                        inputStream = a.e != null ? new ByteArrayInputStream(a.e) : null;
                    }
                    byte[] a2 = inputStream != null ? f92.a(inputStream, a.c, this.b) : new byte[0];
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (lm3.a || elapsedRealtime2 > 3000) {
                        int i3 = ro2Var.o.b;
                        boolean z = ob1.a;
                    }
                    if (i2 < 200 || i2 > 299) {
                        throw new IOException();
                    }
                    SystemClock.elapsedRealtime();
                    return new u82(i2, a2, false, unmodifiableList);
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                    e11Var = a;
                    if (e instanceof SocketTimeoutException) {
                        e92Var = new e92("socket", new i73());
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL " + ro2Var.g(), e);
                        }
                        if (e11Var != null) {
                            int i4 = e11Var.a;
                            ro2Var.g();
                            boolean z2 = lm3.a;
                            boolean z3 = ob1.a;
                            if (bArr != null) {
                                List unmodifiableList2 = Collections.unmodifiableList(e11Var.b);
                                SystemClock.elapsedRealtime();
                                u82 u82Var = new u82(i4, bArr, false, unmodifiableList2);
                                if (i4 == 401 || i4 == 403) {
                                    e92Var = new e92("auth", new lk(u82Var));
                                } else {
                                    if (i4 >= 400 && i4 <= 499) {
                                        throw new kv(u82Var);
                                    }
                                    if (i4 < 500 || i4 > 599 || !ro2Var.m) {
                                        throw new jy2(u82Var);
                                    }
                                    e92Var = new e92(Hb.a, new jy2(u82Var));
                                }
                            } else {
                                e92Var = new e92("network", new s82());
                            }
                        } else {
                            if (!ro2Var.n) {
                                throw new p92(e);
                            }
                            e92Var = new e92("connection", new p92());
                        }
                    }
                    we0 we0Var = ro2Var.o;
                    i = we0Var.a;
                    try {
                        hm3 hm3Var = e92Var.b;
                        int i5 = we0Var.b + 1;
                        we0Var.b = i5;
                        we0Var.a = ((int) (i * we0Var.d)) + i;
                        if (i5 > we0Var.c) {
                            throw hm3Var;
                        }
                        ro2Var.a(e92Var.a + "-retry [timeout=" + i + X3.j.e);
                    } catch (hm3 e3) {
                        ro2Var.a(e92Var.a + "-timeout-giveup [timeout=" + i + X3.j.e);
                        throw e3;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                bArr = null;
            }
            ro2Var.a(e92Var.a + "-retry [timeout=" + i + X3.j.e);
        }
    }
}
