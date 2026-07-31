package sg.bigo.ads.core.player;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.an.g;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.ay.b;
import sg.bigo.ads.bj.d;
import sg.bigo.ads.bj.h;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.core.player.a;
import sg.bigo.ads.cy.c;

/* loaded from: classes4.dex */
public final class b implements b.a, a.c {
    public static b a = new b();
    public sg.bigo.ads.ay.b c;
    protected g e;

    @NonNull
    private Context h;
    private List<o> i;
    private List<o> j;
    private Map<String, a> k;
    private sg.bigo.ads.core.player.a l;
    private sg.bigo.ads.az.a m;
    private sg.bigo.ads.cw.d n;
    private int f = 1;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private long g = 0;
    public WeakHashMap<o, String> d = new WeakHashMap<>();

    public interface a {
        void a();

        void a(int i);

        void a(String str, sg.bigo.ads.ay.a aVar);

        void b(int i);
    }

    private b() {
    }

    private static sg.bigo.ads.ai.d a(@NonNull o oVar) {
        j jVar;
        if (!oVar.aZ() || oVar.ba() || (jVar = k.a) == null || jVar.r() == null) {
            return null;
        }
        return jVar.r();
    }

    private static sg.bigo.ads.ay.a a(Context context, String str, String str2, @NonNull o oVar, sg.bigo.ads.ai.d dVar) {
        if (dVar == null) {
            return new sg.bigo.ads.ay.a(str, oVar.a(context), str2, oVar.aZ(), oVar.am(), oVar.ba(), null);
        }
        return new sg.bigo.ads.ay.a(str, oVar.a(context), str2, oVar.aZ(), oVar.am(), false, new sg.bigo.ads.ay.c(dVar.a(oVar.w(), oVar.y()), dVar.c(oVar.y()), dVar.a(oVar.y()), dVar.b(oVar.y()), dVar.d(oVar.y())));
    }

    public static b a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, @NonNull o oVar, a aVar, boolean z) {
        sg.bigo.ads.ay.a aVar2;
        String str;
        String str2;
        if (z) {
            oVar.i(0);
        }
        String aX = oVar.aX();
        String aY = oVar.aY();
        sg.bigo.ads.ay.a a2 = a(context, aX, aY, oVar, a(oVar));
        if (!z && a2.c()) {
            a2.o = true;
        }
        if (a2.c()) {
            a2.toString();
            if (z) {
                this.j.add(oVar);
            }
        }
        boolean z2 = k.a.n().a(9) && URLUtil.isHttpUrl(aX);
        if (z2) {
            aVar2 = a2;
            str = aY;
            str2 = aX;
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) oVar, aX, "Invalid http url", 0L, 0L, 2, "", false, (String) null, (String) null, (String) null);
        } else {
            aVar2 = a2;
            str = aY;
            str2 = aX;
        }
        if (z2 || r.a((CharSequence) str2) || r.a((CharSequence) str)) {
            sg.bigo.ads.ay.a aVar3 = aVar2;
            oVar.j(5);
            if (!aVar3.c()) {
                aVar.b(z2 ? 10118 : 10103);
                return;
            }
            aVar.a();
            this.k.put(oVar.aR(), aVar);
            this.l.c(aVar3);
            return;
        }
        this.i.add(oVar);
        this.k.put(oVar.aR(), aVar);
        sg.bigo.ads.ay.a aVar4 = aVar2;
        sg.bigo.ads.ay.b.a("downloadMedia", aVar4);
        this.c.a(aVar4, false);
        if (z) {
            this.l.a(aVar4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        if (((java.lang.Boolean) r2.second).booleanValue() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(File file, final boolean z) {
        boolean z2;
        sg.bigo.ads.ay.b.a("filterAdFiles dir = " + file.getAbsolutePath(), (sg.bigo.ads.ay.a) null);
        if (file.exists()) {
            final long currentTimeMillis = System.currentTimeMillis();
            String d = sg.bigo.ads.an.o.d(this.h);
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            Arrays.sort(listFiles, new Comparator<File>() { // from class: sg.bigo.ads.core.player.b.4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file2, File file3) {
                    long lastModified = file2.lastModified() - file3.lastModified();
                    if (lastModified > 0) {
                        return -1;
                    }
                    return lastModified == 0 ? 0 : 1;
                }
            });
            final int length = listFiles.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < listFiles.length) {
                File file2 = listFiles[i];
                int i4 = i;
                Pair<Boolean, Boolean> a2 = this.m.a(i, file2.lastModified(), currentTimeMillis);
                String name = file2.getName();
                boolean a3 = k.a.n().a(29);
                boolean booleanValue = ((Boolean) a2.first).booleanValue();
                if (a3) {
                    if (!booleanValue) {
                        if (((Boolean) a2.second).booleanValue()) {
                            Iterator<String> it = this.d.values().iterator();
                            z2 = false;
                            while (it.hasNext()) {
                                if (!it.next().equals(name)) {
                                    z2 = true;
                                }
                            }
                        }
                        z2 = false;
                        break;
                    }
                    z2 = true;
                } else {
                    if (!booleanValue) {
                    }
                    z2 = true;
                }
                if (z2) {
                    if (a3) {
                        if (((Boolean) a2.first).booleanValue()) {
                            i2++;
                        } else {
                            i3++;
                        }
                    }
                    sg.bigo.ads.ay.b.a("delete expired file name = " + file2.getName(), (sg.bigo.ads.ay.a) null);
                    File file3 = new File(d, file2.getName());
                    if (file3.exists()) {
                        sg.bigo.ads.ay.b.a("delete expired cover name = " + file2.getName(), (sg.bigo.ads.ay.a) null);
                        file3.delete();
                    }
                    file2.delete();
                    if (a3) {
                        sg.bigo.ads.av.a aVar = new sg.bigo.ads.av.a(name, currentTimeMillis, sg.bigo.ads.bw.a.j());
                        aVar.toString();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("res_file_name", aVar.b);
                        contentValues.put("res_delete_millis", Long.valueOf(aVar.c));
                        contentValues.put("sdk_init_millis", Long.valueOf(aVar.d));
                        contentValues.put("ext", aVar.e);
                        long j = aVar.f;
                        if (j == 0) {
                            j = System.currentTimeMillis();
                        }
                        contentValues.put("ctime", Long.valueOf(j));
                        long j2 = aVar.g;
                        if (j2 == 0) {
                            j2 = System.currentTimeMillis();
                        }
                        contentValues.put("mtime", Long.valueOf(j2));
                        sg.bigo.ads.au.a.b("tb_resource", contentValues);
                    }
                }
                i = i4 + 1;
            }
            if (i3 > 0 || i2 > 0) {
                final int i5 = i2;
                final int i6 = i3;
                sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.da.b.a(z ? "2" : "1", String.valueOf(b.this.f), String.valueOf(i5), String.valueOf(i6), String.valueOf(b.this.d.size()), String.valueOf(length), String.valueOf(b.this.e.L()), String.valueOf(b.this.e.M()), String.valueOf(q.b()), String.valueOf(b.this.e.N()), String.valueOf(((int) (currentTimeMillis - sg.bigo.ads.bw.a.H())) / 1000));
                        sg.bigo.ads.bw.a.f(currentTimeMillis);
                        if (b.this.f == 1) {
                            sg.bigo.ads.au.a.b("tb_resource", "res_delete_millis < ?", new String[]{String.valueOf(System.currentTimeMillis() - 604800000)});
                        }
                    }
                });
            }
        }
    }

    private boolean a(o oVar, sg.bigo.ads.ay.a aVar) {
        return TextUtils.equals(oVar.b(this.h), aVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(sg.bigo.ads.ay.a aVar, int i, long j) {
        String str;
        boolean z;
        boolean a2;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str2;
        n nVar;
        boolean z5;
        int i2;
        int i3 = i;
        int i4 = 1;
        int i5 = 2;
        boolean z6 = i3 == 2;
        n nVar2 = new n();
        if (sg.bigo.ads.an.o.a(this.h, aVar.c) && aVar.e == 1 && !aVar.f) {
            File file = new File(sg.bigo.ads.an.o.d(this.h), aVar.d);
            if ((!file.exists() || file.length() < 0) && aVar.a() != null && !TextUtils.isEmpty(aVar.d)) {
                String a3 = aVar.a();
                if (z6) {
                    a3 = sg.bigo.ads.common.utils.g.e(a3);
                }
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(a3, 1);
                if (createVideoThumbnail != null) {
                    String d = sg.bigo.ads.an.o.d(this.h);
                    sg.bigo.ads.common.utils.g.a(d + File.separator, aVar.d);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(d, aVar.d));
                        createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception unused) {
                    }
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(z6 ? sg.bigo.ads.common.utils.g.e(aVar.a()) : aVar.a());
                    nVar2.a = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    nVar2.b = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    nVar2.c = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                    str = mediaMetadataRetriever.extractMetadata(12);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused5) {
                }
                throw th;
            }
            String str3 = str;
            boolean a4 = b().a();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (o oVar : this.i) {
                if (a(oVar, aVar)) {
                    if (i3 != 0) {
                        if (i3 != i4) {
                            r2 = i3 == i5 ? 3 : 4;
                            if (oVar.aW() || !z6) {
                                ArrayList arrayList7 = arrayList5;
                                ArrayList arrayList8 = arrayList6;
                                String str4 = str3;
                                n nVar3 = nVar2;
                                int i6 = i4;
                                z3 = z6;
                                if (z3) {
                                    arrayList7.add(oVar);
                                    arrayList8.add(oVar);
                                    arrayList2 = arrayList8;
                                    arrayList = arrayList7;
                                    z4 = z3;
                                    sg.bigo.ads.da.b.a(oVar, aVar.b, i, j, aVar.g / 1024, aVar.k, 2, "video", aVar.p, null, null, null, aVar.d, oVar.bm());
                                    oVar.i(0);
                                } else {
                                    z4 = z3;
                                    arrayList = arrayList7;
                                    arrayList2 = arrayList8;
                                }
                                i3 = i;
                                str3 = str4;
                                arrayList5 = arrayList;
                                i4 = i6;
                                nVar2 = nVar3;
                                arrayList6 = arrayList2;
                                z6 = z4;
                            } else {
                                long j2 = aVar.i;
                                long j3 = j2 > 0 ? (aVar.g * 100) / j2 : 0L;
                                if (a4 && !oVar.be() && oVar.c(j3)) {
                                    sg.bigo.ads.ay.b.a("Video partial download done, target callback.", aVar);
                                    arrayList5.add(oVar);
                                    arrayList3 = arrayList5;
                                    arrayList4 = arrayList6;
                                    z5 = z6;
                                    i2 = 1;
                                    nVar = nVar2;
                                    str2 = str3;
                                    sg.bigo.ads.da.b.a(oVar, aVar.b, i, j, aVar.g / 1024, aVar.k, 2, "video", aVar.p, null, null, null, aVar.d, oVar.bm());
                                    oVar.i(0);
                                } else {
                                    arrayList3 = arrayList5;
                                    arrayList4 = arrayList6;
                                    str2 = str3;
                                    nVar = nVar2;
                                    z5 = z6;
                                    i2 = 1;
                                }
                                i3 = i;
                                str3 = str2;
                                i4 = i2;
                                arrayList5 = arrayList3;
                                arrayList6 = arrayList4;
                                z6 = z5;
                                nVar2 = nVar;
                            }
                            i5 = 2;
                        }
                        oVar.h(r2);
                    } else {
                        oVar.h(i4);
                    }
                    oVar.j(r2);
                    if (oVar.aW()) {
                    }
                    ArrayList arrayList72 = arrayList5;
                    ArrayList arrayList82 = arrayList6;
                    String str42 = str3;
                    n nVar32 = nVar2;
                    int i62 = i4;
                    z3 = z6;
                    if (z3) {
                    }
                    i3 = i;
                    str3 = str42;
                    arrayList5 = arrayList;
                    i4 = i62;
                    nVar2 = nVar32;
                    arrayList6 = arrayList2;
                    z6 = z4;
                    i5 = 2;
                } else {
                    sg.bigo.ads.ay.b.a("not match addata=" + oVar.aS(), aVar);
                }
            }
            ArrayList<o> arrayList9 = arrayList5;
            String str5 = str3;
            n nVar4 = nVar2;
            z = z6;
            this.i.removeAll(arrayList6);
            a2 = r.a((CharSequence) str5);
            if (!a2) {
                aVar.q = str5;
            }
            for (o oVar2 : arrayList9) {
                if (!oVar2.be()) {
                    if (!a2) {
                        oVar2.c(str5);
                    }
                    n nVar5 = nVar4;
                    nVar5.d = aVar.i;
                    nVar5.e = aVar.h();
                    oVar2.a(nVar5);
                    a remove = this.k.remove(oVar2.aR());
                    this.j.remove(oVar2);
                    if (remove != null) {
                        sg.bigo.ads.ay.b.a("listener is valid, execute AdProxy successful callback", aVar);
                        o.d aJ = oVar2.aJ();
                        z2 = z;
                        if (aJ != null) {
                            aJ.a(z2);
                        }
                        sg.bigo.ads.core.player.a aVar2 = this.l;
                        if (aVar2.b.containsKey(aVar.a)) {
                            sg.bigo.ads.bh.d.a(aVar2.b.get(aVar.a));
                            aVar2.b.remove(aVar.a);
                        }
                        aVar2.b(aVar);
                        remove.a(i);
                    } else {
                        z2 = z;
                        sg.bigo.ads.ay.b.a("Not found target listener.", aVar);
                    }
                    oVar2.bf();
                    nVar4 = nVar5;
                    z = z2;
                }
            }
            if (z) {
                this.f = 2;
                d();
                return;
            }
            return;
        }
        str = "";
        String str32 = str;
        boolean a42 = b().a();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        while (r21.hasNext()) {
        }
        ArrayList<o> arrayList92 = arrayList52;
        String str52 = str32;
        n nVar42 = nVar2;
        z = z6;
        this.i.removeAll(arrayList62);
        a2 = r.a((CharSequence) str52);
        if (!a2) {
        }
        while (r4.hasNext()) {
        }
        if (z) {
        }
    }

    static /* synthetic */ void b(b bVar) {
        bVar.a(new File(sg.bigo.ads.an.o.b(bVar.h)), false);
        bVar.a(new File(sg.bigo.ads.an.o.c(bVar.h)), true);
    }

    private static sg.bigo.ads.cw.d c() {
        sg.bigo.ads.ay.b.a("start HttpProxyCacheServer ServerSocket", (sg.bigo.ads.ay.a) null);
        return new sg.bigo.ads.cw.d();
    }

    private void d() {
        if (System.currentTimeMillis() - this.g > 3600000) {
            e();
        }
    }

    private void e() {
        this.g = System.currentTimeMillis();
        sg.bigo.ads.ay.b.a("start resource delete task", (sg.bigo.ads.ay.a) null);
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.b(b.this);
            }
        }, 30000L);
    }

    public final void a(final Context context, @NonNull final o oVar, final a aVar) {
        if (!this.b.get()) {
            sg.bigo.ads.ay.b.a("please execute initAdResource first", (sg.bigo.ads.ay.a) null);
        } else if (sg.bigo.ads.bh.d.a()) {
            a(context, oVar, aVar, true);
        } else {
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context, oVar, aVar, true);
                }
            });
        }
    }

    public final void a(String str) {
        if (this.k == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.k.remove(str);
    }

    @SuppressLint({"IteratorRemove"})
    public final void a(g gVar, @NonNull Context context, @NonNull sg.bigo.ads.az.a aVar, boolean z) {
        h hVar;
        sg.bigo.ads.bj.d dVar;
        h hVar2;
        sg.bigo.ads.bj.d dVar2;
        this.e = gVar;
        this.h = context;
        if (this.b.getAndSet(true)) {
            sg.bigo.ads.ay.b.a("already init.", (sg.bigo.ads.ay.a) null);
            return;
        }
        this.m = aVar;
        sg.bigo.ads.cy.c a2 = sg.bigo.ads.cy.c.a();
        sg.bigo.ads.az.a aVar2 = this.m;
        a2.d = context;
        a2.c = aVar2;
        a2.c();
        this.c = new sg.bigo.ads.ay.b(context, this.m, z, this);
        this.l = new sg.bigo.ads.core.player.a(this);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new Hashtable();
        e();
        hVar = h.a.a;
        hVar.a(aVar);
        dVar = d.a.a;
        dVar.a(aVar);
        hVar2 = h.a.a;
        hVar2.d(context);
        dVar2 = d.a.a;
        dVar2.d(context);
    }

    public final void a(o oVar, String str) {
        if (oVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(oVar, str);
    }

    @Override // sg.bigo.ads.ay.b.a
    public final void a(sg.bigo.ads.ay.a aVar) {
        sg.bigo.ads.cy.c.a();
        if (sg.bigo.ads.cy.c.a(this.h, aVar)) {
            return;
        }
        Iterator<o> it = this.i.iterator();
        boolean a2 = r.a((CharSequence) aVar.q);
        while (!a2 && it.hasNext()) {
            o next = it.next();
            if (a(next, aVar)) {
                next.c(aVar.q);
            }
        }
    }

    @Override // sg.bigo.ads.ay.b.a
    public final void a(sg.bigo.ads.ay.a aVar, int i, long j) {
        sg.bigo.ads.cy.c a2 = sg.bigo.ads.cy.c.a();
        if (!sg.bigo.ads.an.o.a(this.h, aVar.c, aVar.d)) {
            sg.bigo.ads.ay.b.a("callback download completed source=".concat(String.valueOf(i)), aVar);
            b(aVar, i, j);
            return;
        }
        if (i == 2) {
            return;
        }
        String name = new File(aVar.c).getName();
        File file = new File(aVar.a());
        File file2 = new File(aVar.c);
        sg.bigo.ads.cy.c cVar = sg.bigo.ads.cy.c.a;
        c.a remove = cVar.b.remove(name);
        String str = !TextUtils.isEmpty(aVar.b) ? aVar.b : remove != null ? remove.b : "";
        long length = file.isFile() ? file.length() : 0L;
        StringBuilder sb = new StringBuilder();
        if (!sg.bigo.ads.cy.d.a(file, file2, sb)) {
            String sb2 = sb.length() > 0 ? sb.toString() : "unzip failed";
            sg.bigo.ads.bn.a.a("PlayableZip", "unzipInto failed: ".concat(String.valueOf(sb2)));
            sg.bigo.ads.da.b.a(remove != null ? remove.a : null, 2, str, length, j, sb2);
            sg.bigo.ads.common.utils.g.b(file2);
            cVar.a(name, 4, sb2);
            return;
        }
        if (!sg.bigo.ads.common.utils.g.a(file)) {
            sg.bigo.ads.bn.a.a("PlayableZip", "delete zip after successful unzip failed: " + file.getAbsolutePath());
        }
        if (sg.bigo.ads.cy.c.a(file2)) {
            sg.bigo.ads.da.b.a(remove != null ? remove.a : null, 1, str, length, j, (String) null, 1);
            cVar.a(name, file2);
            a2.b();
        } else {
            sg.bigo.ads.bn.a.a("PlayableZip", "writeExtractionDoneMarker failed, clearing cache: " + file2.getAbsolutePath());
            sg.bigo.ads.da.b.a(remove != null ? remove.a : null, 2, str, length, j, "write extraction marker failed");
            sg.bigo.ads.common.utils.g.b(file2);
            cVar.a(name, 5, "write extraction marker failed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0215  */
    @Override // sg.bigo.ads.ay.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sg.bigo.ads.ay.a aVar, String str, long j, long j2) {
        String str2;
        String str3;
        int i;
        String str4;
        o oVar;
        o oVar2;
        String str5;
        a aVar2;
        int bm;
        int i2;
        String str6;
        sg.bigo.ads.cy.c a2 = sg.bigo.ads.cy.c.a();
        if (sg.bigo.ads.an.o.a(this.h, aVar.c, aVar.d)) {
            String str7 = str;
            String name = new File(aVar.c).getName();
            sg.bigo.ads.cy.c cVar = sg.bigo.ads.cy.c.a;
            c.a remove = cVar.b.remove(name);
            File file = new File(aVar.a());
            long length = file.isFile() ? file.length() : j2;
            long j3 = length < 0 ? 0L : length;
            if (!TextUtils.isEmpty(aVar.b)) {
                str3 = aVar.b;
            } else {
                if (remove == null) {
                    str2 = "";
                    if (str7 == null) {
                        str7 = "";
                    }
                    sg.bigo.ads.da.b.a(remove == null ? remove.a : null, 2, str2, j3, j, str7);
                    sg.bigo.ads.common.utils.g.b(new File(aVar.c));
                    cVar.a(name, 3, "download failed: ".concat(str7));
                    a2.b();
                    return;
                }
                str3 = remove.b;
            }
            str2 = str3;
            if (str7 == null) {
            }
            sg.bigo.ads.da.b.a(remove == null ? remove.a : null, 2, str2, j3, j, str7);
            sg.bigo.ads.common.utils.g.b(new File(aVar.c));
            cVar.a(name, 3, "download failed: ".concat(str7));
            a2.b();
            return;
        }
        sg.bigo.ads.ay.b.a("callback download failed error= ".concat(String.valueOf(str)), aVar);
        this.l.b(aVar);
        Iterator<o> it = this.i.iterator();
        boolean a3 = r.a((CharSequence) aVar.q);
        while (true) {
            if (!it.hasNext()) {
                i = 3;
                break;
            }
            o next = it.next();
            if (a(next, aVar)) {
                if (!a3) {
                    next.c(aVar.q);
                }
                if (next != null) {
                    next.j(("Unable to download media file.".equals(str) || "internal storage is not enough".equals(str)) ? 5 : j2 == 0 ? 0 : 1);
                }
                if (!aVar.c() || "internal storage is not enough".equalsIgnoreCase(str)) {
                    str4 = "internal storage is not enough";
                    oVar = next;
                    a remove2 = this.k.remove(oVar.aR());
                    if (remove2 != null) {
                        oVar2 = oVar;
                        sg.bigo.ads.da.b.a(oVar, aVar.b, str, j, aVar.g / 1024, 2, "video", aVar.p, null, null, null, oVar.bm());
                        sg.bigo.ads.ay.b.a("listener is valid, execute AdProxy failure callback", aVar);
                        str5 = str;
                        remove2.b(r.a(str5, -1));
                        it.remove();
                        if (str4.equalsIgnoreCase(str5)) {
                            this.j.remove(oVar2);
                        }
                        i = 3;
                    }
                } else {
                    int y = next.y();
                    if ((y == 3 || y == 4) && this.m.e && !"Unable to download media file.".equals(str) && (aVar2 = this.k.get(next.aR())) != null && (bm = next.bm()) < 2) {
                        str4 = "internal storage is not enough";
                        sg.bigo.ads.da.b.a(next, aVar.b, str, j, aVar.g / 1024, 2, "video", aVar.p, null, null, null, bm);
                        next.i(bm + 1);
                        this.i.remove(next);
                        a(this.h, next, aVar2, false);
                        str5 = str;
                        oVar2 = next;
                        if (str4.equalsIgnoreCase(str5)) {
                        }
                        i = 3;
                    } else {
                        int bm2 = next.bm();
                        a aVar3 = this.k.get(next.aR());
                        if (aVar3 != null) {
                            str4 = "internal storage is not enough";
                            sg.bigo.ads.da.b.a(next, aVar.b, str, j, aVar.g / 1024, 2, "video", aVar.p, null, null, null, bm2);
                            if (next.bl() != 2) {
                                str6 = "video download failed when support fillStrategy, so download backupImg";
                            } else if (aVar.d()) {
                                str6 = "video download failed but filled success, so download backupImg";
                            } else {
                                sg.bigo.ads.ay.b.a("video download failed and filled fail, so don't download backupImg", aVar);
                                oVar = next;
                                i2 = 0;
                            }
                            sg.bigo.ads.ay.b.a(str6, aVar);
                            aVar3.a();
                            oVar = next;
                            i2 = 0;
                        } else {
                            str4 = "internal storage is not enough";
                            i2 = 0;
                            oVar = next;
                        }
                        oVar.i(i2);
                    }
                }
                str5 = str;
                oVar2 = oVar;
                it.remove();
                if (str4.equalsIgnoreCase(str5)) {
                }
                i = 3;
            }
        }
        this.f = i;
        d();
    }

    public final sg.bigo.ads.cw.d b() {
        sg.bigo.ads.cw.d dVar = this.n;
        if (dVar != null) {
            return dVar;
        }
        sg.bigo.ads.cw.d c = c();
        this.n = c;
        return c;
    }

    @Override // sg.bigo.ads.core.player.a.c
    public final void b(sg.bigo.ads.ay.a aVar) {
        sg.bigo.ads.ay.b.a("callback download fill time source=", aVar);
        sg.bigo.ads.ay.b.a("callback download fill time", aVar);
        Iterator<o> it = this.j.iterator();
        boolean a2 = r.a((CharSequence) aVar.q);
        while (it.hasNext()) {
            o next = it.next();
            if (a(next, aVar)) {
                if (!a2) {
                    next.c(aVar.q);
                }
                next.j(2);
                a aVar2 = this.k.get(next.aR());
                if (aVar2 != null) {
                    aVar2.a("", aVar);
                    if (aVar.b == null) {
                        this.k.remove(next.aR());
                    }
                }
                it.remove();
            }
        }
        this.f = 4;
        d();
    }

    @Override // sg.bigo.ads.core.player.a.c
    public final void c(sg.bigo.ads.ay.a aVar) {
        sg.bigo.ads.ay.b.a("callback download check Process source=", aVar);
        int g = aVar.g();
        long j = aVar.i;
        if (j > 0 && aVar.g * 100 >= j * g) {
            sg.bigo.ads.ay.b.a("video download process is enough. download percent: " + aVar.g + ", total size:" + aVar.i, aVar);
            return;
        }
        sg.bigo.ads.ay.b.a("video download process is not enough. download size: " + aVar.g + ", total size:" + aVar.i + ", begin to download backup", aVar);
        boolean a2 = r.a((CharSequence) aVar.q);
        for (o oVar : this.i) {
            if (a(oVar, aVar)) {
                if (!a2) {
                    oVar.c(aVar.q);
                }
                a aVar2 = this.k.get(oVar.aR());
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        }
    }
}
