package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class wj0 extends Handler {
    public final HandlerThread a;
    public final hd0 b;
    public final id0 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;

    public wj0(HandlerThread handlerThread, hd0 hd0Var, id0 id0Var, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = hd0Var;
        this.c = id0Var;
        this.d = handler;
        this.i = 3;
        this.j = 5;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public final void a(tj0 tj0Var, int i) {
        if (i == 0) {
            if (tj0Var.b == 1) {
                a(tj0Var, 0, 0);
            }
        } else if (i != tj0Var.f) {
            int i2 = tj0Var.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            a(new tj0(tj0Var.a, i2, tj0Var.c, System.currentTimeMillis(), tj0Var.e, i, 0, tj0Var.h));
        }
    }

    public final void b() {
        int i = 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            tj0 tj0Var = (tj0) this.e.get(i2);
            yj0 yj0Var = (yj0) this.f.get(tj0Var.a.b);
            int i3 = tj0Var.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        yj0Var.getClass();
                        if (yj0Var.e) {
                            throw new IllegalStateException();
                        }
                        if (this.h || this.g != 0 || i >= this.i) {
                            a(tj0Var, 0, 0);
                            yj0Var.a(false);
                        }
                    } else {
                        if (i3 != 5 && i3 != 7) {
                            throw new IllegalStateException();
                        }
                        if (yj0Var == null) {
                            yj0 yj0Var2 = new yj0(tj0Var.a, this.c.a(tj0Var.a), tj0Var.h, true, this.j, this);
                            this.f.put(tj0Var.a.b, yj0Var2);
                            yj0Var2.start();
                        } else if (!yj0Var.e) {
                            yj0Var.a(false);
                        }
                    }
                } else if (yj0Var != null) {
                    if (yj0Var.e) {
                        throw new IllegalStateException();
                    }
                    yj0Var.a(false);
                }
            } else if (yj0Var != null) {
                if (yj0Var.e) {
                    throw new IllegalStateException();
                }
                yj0Var.a(false);
            } else if (this.h || this.g != 0 || this.k >= this.i) {
                yj0Var = null;
            } else {
                tj0 a = a(tj0Var, 2, 0);
                yj0Var = new yj0(a.a, this.c.a(a.a), a.h, false, this.j, this);
                this.f.put(a.a.b, yj0Var);
                int i4 = this.k;
                this.k = i4 + 1;
                if (i4 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                yj0Var.start();
            }
            if (yj0Var != null && !yj0Var.e) {
                i++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        gd0 gd0Var;
        w30 w30Var;
        List emptyList;
        hd0 hd0Var;
        String str;
        w30 w30Var2;
        gd0 gd0Var2 = null;
        r10 = 0;
        int i = 0;
        switch (message.what) {
            case 0:
                this.g = message.arg1;
                try {
                    try {
                        this.b.b();
                        hd0 hd0Var2 = this.b;
                        int[] iArr = {0, 1, 2, 5, 7};
                        hd0Var2.a();
                        StringBuilder sb = new StringBuilder("state IN (");
                        for (int i2 = 0; i2 < 5; i2++) {
                            if (i2 > 0) {
                                sb.append(',');
                            }
                            sb.append(iArr[i2]);
                        }
                        sb.append(')');
                        gd0Var = new gd0(hd0Var2.a(sb.toString(), (String[]) null));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
                while (true) {
                    try {
                    } catch (IOException e2) {
                        e = e2;
                        gd0Var2 = gd0Var;
                        gh1.b("DownloadManager", gh1.a("Failed to load index.", e));
                        this.e.clear();
                        sb3.a(gd0Var2);
                        this.d.obtainMessage(0, new ArrayList(this.e)).sendToTarget();
                        b();
                        i = 1;
                        this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        gd0Var2 = gd0Var;
                        sb3.a(gd0Var2);
                        throw th;
                    }
                    if (!gd0Var.a.moveToPosition(gd0Var.a.getPosition() + 1)) {
                        sb3.a(gd0Var);
                        this.d.obtainMessage(0, new ArrayList(this.e)).sendToTarget();
                        b();
                        i = 1;
                        this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                        return;
                    }
                    this.e.add(hd0.a(gd0Var.a));
                }
            case 1:
                this.h = message.arg1 != 0;
                b();
                i = 1;
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 2:
                this.g = message.arg1;
                b();
                i = 1;
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 3:
                String str2 = (String) message.obj;
                int i3 = message.arg1;
                if (str2 == null) {
                    for (int i4 = 0; i4 < this.e.size(); i4++) {
                        a((tj0) this.e.get(i4), i3);
                    }
                    try {
                        hd0 hd0Var3 = this.b;
                        hd0Var3.a();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i3));
                            hd0Var3.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, hd0.d, null);
                        } finally {
                        }
                    } catch (IOException e3) {
                        gh1.b("DownloadManager", gh1.a("Failed to set manual stop reason", e3));
                    }
                } else {
                    tj0 a = a(str2, false);
                    if (a != null) {
                        a(a, i3);
                    } else {
                        try {
                            this.b.a(i3, str2);
                        } catch (IOException e4) {
                            gh1.b("DownloadManager", gh1.a("Failed to set manual stop reason: ".concat(str2), e4));
                        }
                    }
                }
                b();
                i = 1;
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 4:
                this.i = message.arg1;
                b();
                i = 1;
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 5:
                this.j = message.arg1;
                i = 1;
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 6:
                ck0 ck0Var = (ck0) message.obj;
                int i5 = message.arg1;
                tj0 a2 = a(ck0Var.b, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (a2 != null) {
                    int i6 = a2.b;
                    long j = (i6 == 5 || i6 == 3 || i6 == 4) ? currentTimeMillis : a2.c;
                    int i7 = (i6 == 5 || i6 == 7) ? 7 : i5 != 0 ? 1 : 0;
                    ck0 ck0Var2 = a2.a;
                    if (!ck0Var2.b.equals(ck0Var.b)) {
                        throw new IllegalArgumentException();
                    }
                    if (ck0Var2.e.isEmpty() || ck0Var.e.isEmpty()) {
                        emptyList = Collections.emptyList();
                    } else {
                        emptyList = new ArrayList(ck0Var2.e);
                        for (int i8 = 0; i8 < ck0Var.e.size(); i8++) {
                            g43 g43Var = (g43) ck0Var.e.get(i8);
                            if (!emptyList.contains(g43Var)) {
                                emptyList.add(g43Var);
                            }
                        }
                    }
                    a(new tj0(new ck0(ck0Var2.b, ck0Var.c, ck0Var.d, emptyList, ck0Var.f, ck0Var.g, ck0Var.h), i7, j, currentTimeMillis, -1L, i5, 0, new ak0()));
                } else {
                    a(new tj0(ck0Var, i5 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i5, 0, new ak0()));
                }
                b();
                i = 1;
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 7:
                String str3 = (String) message.obj;
                tj0 a3 = a(str3, true);
                if (a3 == null) {
                    gh1.b("DownloadManager", "Failed to remove nonexistent download: " + str3);
                } else {
                    a(a3, 5, 0);
                    b();
                }
                i = 1;
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 8:
                a();
                i = 1;
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 9:
                yj0 yj0Var = (yj0) message.obj;
                String str4 = yj0Var.b.b;
                this.f.remove(str4);
                boolean z = yj0Var.e;
                if (!z) {
                    int i9 = this.k - 1;
                    this.k = i9;
                    if (i9 == 0) {
                        removeMessages(11);
                    }
                }
                if (yj0Var.h) {
                    b();
                } else {
                    Exception exc = yj0Var.i;
                    if (exc != null) {
                        gh1.b("DownloadManager", gh1.a("Task failed: " + yj0Var.b + ", " + z, exc));
                    }
                    tj0 a4 = a(str4, false);
                    a4.getClass();
                    int i10 = a4.b;
                    if (i10 != 2) {
                        if (i10 != 5 && i10 != 7) {
                            throw new IllegalStateException();
                        }
                        if (!z) {
                            throw new IllegalStateException();
                        }
                        if (i10 == 7) {
                            int i11 = a4.f;
                            a(a4, i11 == 0 ? 0 : 1, i11);
                            b();
                        } else {
                            this.e.remove(a(a4.a.b));
                            try {
                                hd0Var = this.b;
                                str = a4.a.b;
                                hd0Var.a();
                            } catch (IOException unused) {
                                gh1.b("DownloadManager", "Failed to remove from database");
                            }
                            try {
                                hd0Var.a.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str});
                                this.d.obtainMessage(2, new vj0(a4, true, new ArrayList(this.e), null)).sendToTarget();
                            } finally {
                            }
                        }
                    } else {
                        if (z) {
                            throw new IllegalStateException();
                        }
                        ck0 ck0Var3 = a4.a;
                        tj0 tj0Var = new tj0(ck0Var3, exc == null ? 3 : 4, a4.c, System.currentTimeMillis(), a4.e, a4.f, exc == null ? 0 : 1, a4.h);
                        this.e.remove(a(ck0Var3.b));
                        try {
                            this.b.a(tj0Var);
                        } catch (IOException e5) {
                            gh1.b("DownloadManager", gh1.a("Failed to update index.", e5));
                        }
                        this.d.obtainMessage(2, new vj0(tj0Var, false, new ArrayList(this.e), exc)).sendToTarget();
                    }
                    b();
                }
                this.d.obtainMessage(1, i, this.f.size()).sendToTarget();
                return;
            case 10:
                yj0 yj0Var2 = (yj0) message.obj;
                int i12 = message.arg1;
                int i13 = message.arg2;
                int i14 = sb3.a;
                long j2 = ((i12 & 4294967295L) << 32) | (4294967295L & i13);
                tj0 a5 = a(yj0Var2.b.b, false);
                a5.getClass();
                if (j2 == a5.e || j2 == -1) {
                    return;
                }
                a(new tj0(a5.a, a5.b, a5.c, System.currentTimeMillis(), j2, a5.f, a5.g, a5.h));
                return;
            case 11:
                for (int i15 = 0; i15 < this.e.size(); i15++) {
                    tj0 tj0Var2 = (tj0) this.e.get(i15);
                    if (tj0Var2.b == 2) {
                        try {
                            this.b.a(tj0Var2);
                        } catch (IOException e6) {
                            gh1.b("DownloadManager", gh1.a("Failed to update index.", e6));
                        }
                    }
                }
                sendEmptyMessageDelayed(11, 5000L);
                return;
            case 12:
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((yj0) it.next()).a(true);
                }
                try {
                    this.b.b();
                } catch (IOException e7) {
                    gh1.b("DownloadManager", gh1.a("Failed to update index.", e7));
                }
                this.e.clear();
                this.a.quit();
                synchronized (this) {
                    notifyAll();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        try {
            hd0 hd0Var = this.b;
            int[] iArr = {3, 4};
            hd0Var.a();
            StringBuilder sb = new StringBuilder("state IN (");
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(iArr[i]);
            }
            sb.append(')');
            Cursor a = hd0Var.a(sb.toString(), (String[]) null);
            while (a.moveToPosition(a.getPosition() + 1)) {
                try {
                    arrayList.add(hd0.a(a));
                } finally {
                }
            }
            a.close();
        } catch (IOException unused) {
            gh1.b("DownloadManager", "Failed to load downloads.");
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ArrayList arrayList2 = this.e;
            tj0 tj0Var = (tj0) arrayList2.get(i2);
            arrayList2.set(i2, new tj0(tj0Var.a, 5, tj0Var.c, System.currentTimeMillis(), tj0Var.e, 0, 0, tj0Var.h));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ArrayList arrayList3 = this.e;
            tj0 tj0Var2 = (tj0) arrayList.get(i3);
            arrayList3.add(new tj0(tj0Var2.a, 5, tj0Var2.c, System.currentTimeMillis(), tj0Var2.e, 0, 0, tj0Var2.h));
        }
        Collections.sort(this.e, new wj0$$ExternalSyntheticLambda0());
        try {
            this.b.c();
        } catch (IOException e) {
            gh1.b("DownloadManager", gh1.a("Failed to update index.", e));
        }
        ArrayList arrayList4 = new ArrayList(this.e);
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            this.d.obtainMessage(2, new vj0((tj0) this.e.get(i4), false, arrayList4, null)).sendToTarget();
        }
        b();
    }

    public final tj0 a(tj0 tj0Var) {
        int i = tj0Var.b;
        if (i != 3 && i != 4) {
            int a = a(tj0Var.a.b);
            if (a == -1) {
                this.e.add(tj0Var);
                Collections.sort(this.e, new wj0$$ExternalSyntheticLambda0());
            } else {
                boolean z = tj0Var.c != ((tj0) this.e.get(a)).c;
                this.e.set(a, tj0Var);
                if (z) {
                    Collections.sort(this.e, new wj0$$ExternalSyntheticLambda0());
                }
            }
            try {
                this.b.a(tj0Var);
            } catch (IOException e) {
                gh1.b("DownloadManager", gh1.a("Failed to update index.", e));
            }
            this.d.obtainMessage(2, new vj0(tj0Var, false, new ArrayList(this.e), null)).sendToTarget();
            return tj0Var;
        }
        throw new IllegalStateException();
    }

    public final tj0 a(String str, boolean z) {
        int a = a(str);
        if (a != -1) {
            return (tj0) this.e.get(a);
        }
        if (!z) {
            return null;
        }
        try {
            return this.b.b(str);
        } catch (IOException e) {
            gh1.b("DownloadManager", gh1.a("Failed to load download: " + str, e));
            return null;
        }
    }

    public final int a(String str) {
        for (int i = 0; i < this.e.size(); i++) {
            if (((tj0) this.e.get(i)).a.b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final tj0 a(tj0 tj0Var, int i, int i2) {
        if (i != 3 && i != 4) {
            return a(new tj0(tj0Var.a, i, tj0Var.c, System.currentTimeMillis(), tj0Var.e, i2, 0, tj0Var.h));
        }
        throw new IllegalStateException();
    }

    public static int a(tj0 tj0Var, tj0 tj0Var2) {
        long j = tj0Var.c;
        long j2 = tj0Var2.c;
        int i = sb3.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
