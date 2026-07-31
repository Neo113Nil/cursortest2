package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.u0;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* compiled from: WebViewSpiderLoader.java */
/* loaded from: classes8.dex */
public class p extends f implements a.InterfaceC1419a {
    private g b;
    private JumpLoaderResult c;
    private boolean e;
    private Context f;
    private com.mbridge.msdk.foundation.same.task.b g;
    private com.mbridge.msdk.click.entity.a h;
    private boolean d = true;
    private Handler i = new Handler(Looper.getMainLooper());

    /* compiled from: WebViewSpiderLoader.java */
    class a implements k {
        a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.c = jumpLoaderResult;
        }
    }

    /* compiled from: WebViewSpiderLoader.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.b != null) {
                if (p.this.c.isSuccess()) {
                    p.this.b.a(p.this.c);
                } else {
                    p.this.b.a(p.this.c, p.this.c.getMsg());
                }
            }
        }
    }

    /* compiled from: WebViewSpiderLoader.java */
    private class c extends com.mbridge.msdk.foundation.same.task.a {
        private final Context b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;
        private boolean g;
        private boolean h;
        private int i;
        private final Semaphore a = new Semaphore(0);
        private o.f j = new a();

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z, boolean z2, int i) {
            this.b = context;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = z;
            this.h = z2;
            this.i = i;
        }

        private boolean a(int i) {
            return i == 200;
        }

        private boolean b(int i) {
            return i == 301 || i == 302 || i == 307;
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f, p.this.c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.b != null) {
                p.this.b.b(null);
            }
            p.this.c = new JumpLoaderResult();
            p.this.c.setUrl(this.c);
            p.this.c = a(this.c, this.g, this.h, this.f, this.i);
            if (!TextUtils.isEmpty(p.this.c.getExceptionMsg())) {
                p.this.c.setSuccess(true);
            }
            if (p.this.d && p.this.c.isSuccess()) {
                if (p.this.h != null) {
                    p.this.c.setStatusCode(p.this.h.f);
                }
                q.a(this.f, p.this.c, p.this.h, this.d, this.e, this.b, this.j, this.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.a.release();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01fb A[EDGE_INSN: B:86:0x01fb->B:55:0x01fb BREAK  A[LOOP:0: B:19:0x0064->B:51:0x01a5], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private JumpLoaderResult a(String str, boolean z, boolean z2, CampaignEx campaignEx, int i) {
            String str2;
            String str3;
            int i2;
            String str4 = str;
            String str5 = "";
            if (p.this.e) {
                String a2 = com.mbridge.msdk.setting.b.a(this.b, str4);
                if (!TextUtils.isEmpty(a2)) {
                    str4 = str4 + a2;
                }
            }
            if (com.mbridge.msdk.util.b.a()) {
                str4 = q.a(this.f, str4);
            }
            String str6 = str4;
            JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
            i iVar = new i();
            try {
            } catch (Exception e) {
                e = e;
                str2 = "";
            }
            if (b(str6)) {
                str3 = "";
                String str7 = str6;
                i2 = 0;
                String str8 = str5;
                String str9 = str3;
                while (true) {
                    if (i2 >= 10) {
                    }
                    i2++;
                }
                return jumpLoaderResult;
            }
            URI create = URI.create(str6);
            str2 = create.getScheme();
            try {
                str5 = create.getHost();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                str3 = str5;
                str5 = str2;
                String str72 = str6;
                i2 = 0;
                String str82 = str5;
                String str92 = str3;
                while (true) {
                    if (i2 >= 10) {
                    }
                    i2++;
                }
                return jumpLoaderResult;
            }
            str3 = str5;
            str5 = str2;
            String str722 = str6;
            i2 = 0;
            String str822 = str5;
            String str922 = str3;
            while (true) {
                if (i2 >= 10) {
                    break;
                }
                if (!p.this.d) {
                    return null;
                }
                p.this.h = iVar.a(str722, z, z2, campaignEx);
                if (p.this.h != null) {
                    if (!TextUtils.isEmpty(p.this.h.h)) {
                        jumpLoaderResult.setUrl(str722);
                        jumpLoaderResult.setExceptionMsg(p.this.h.h);
                        jumpLoaderResult.setType(1);
                        jumpLoaderResult.setHeader(p.this.h.a());
                        jumpLoaderResult.setSuccess(false);
                        if (i2 == 0) {
                            com.mbridge.msdk.click.retry.a.b().a(str722, p.this.h.h, campaignEx, this.e, z, z2, i);
                        }
                    } else {
                        jumpLoaderResult.setSuccess(true);
                        if (!b(p.this.h.f)) {
                            if (a(p.this.h.f)) {
                                jumpLoaderResult.setjumpDone(true);
                                jumpLoaderResult.setUrl(str722);
                                jumpLoaderResult.setContent(p.this.h.g);
                            } else {
                                jumpLoaderResult.setjumpDone(false);
                                jumpLoaderResult.setUrl(str722);
                                if (i2 == 0) {
                                    com.mbridge.msdk.click.retry.a.b().a(str722, "error code:" + p.this.h.f, campaignEx, this.e, z, z2, i);
                                }
                            }
                        } else {
                            jumpLoaderResult.setIs302Jump(true);
                            if (!TextUtils.isEmpty(p.this.h.a)) {
                                str722 = p.this.h.a;
                                if (b(str722)) {
                                    if (!c(str722) || TextUtils.isEmpty(str822) || TextUtils.isEmpty(str922)) {
                                        break;
                                    }
                                    str722 = str822 + "://" + str922 + str722;
                                    str922 = null;
                                    str822 = null;
                                } else if (!b(str722)) {
                                    try {
                                        URI create2 = URI.create(str722);
                                        str822 = create2.getScheme();
                                        str922 = create2.getHost();
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (!a(str722)) {
                                    if (p.this.e) {
                                        String a3 = com.mbridge.msdk.setting.b.a(this.b, str722);
                                        if (!TextUtils.isEmpty(a3)) {
                                            str722 = str722 + a3;
                                        }
                                    }
                                    if (com.mbridge.msdk.util.b.a()) {
                                        str722 = q.a(this.f, str722);
                                    }
                                    i2++;
                                } else {
                                    jumpLoaderResult.setjumpDone(true);
                                    jumpLoaderResult.setUrl(str722);
                                    break;
                                }
                            } else {
                                jumpLoaderResult.setjumpDone(true);
                                jumpLoaderResult.setUrl(str722);
                                break;
                            }
                        }
                    }
                } else {
                    jumpLoaderResult.setUrl(str722);
                    jumpLoaderResult.setSuccess(false);
                    jumpLoaderResult.setMsg("request url is invalided");
                    break;
                }
            }
            return jumpLoaderResult;
        }

        /* compiled from: WebViewSpiderLoader.java */
        class a implements o.f {
            a() {
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean d = c.this.d(str);
                if (d) {
                    a();
                }
                return d;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean d = c.this.d(str);
                if (d) {
                    a();
                }
                return d;
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z, String str2) {
                c.this.d(str);
                p.this.c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (p.this) {
                    p.this.c.setSuccess(true);
                    c.this.a();
                }
            }
        }

        private boolean a(String str) {
            return u0.a.b(str);
        }
    }

    public p(Context context) {
        this.f = context;
        this.g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, g gVar, boolean z, String str2, String str3, CampaignEx campaignEx, boolean z2, boolean z3, int i) {
        c cVar;
        this.b = gVar;
        this.e = z;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f);
        bVar.c(str);
        bVar.b(z);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z2);
        bVar.c(z3);
        bVar.a(i);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f, str, str2, str3, campaignEx, z2, z3, i);
        }
        this.g.b(cVar, this);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC1419a
    public void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.d) {
            this.i.post(new b());
        }
    }
}
