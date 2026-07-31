package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.a.g;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistableBase;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class FileUploadManager {
    private static final String A = "upload_url";
    private static final String B = "url";
    private static final String C = "query_params";
    private static final String D = "return_params";
    private static final String E = "base_url";
    private static final String F = "attributes";
    private static final String G = "bucket";
    private static final String H = "x-amz-date";
    private static final String I = "signature";
    private static final String J = "AWSAccessKeyId";
    private static final String K = "acl";
    private static final String L = "x-amz-server-side-encryption";
    private static final String M = "x-amz-algorithm";
    private static final String N = "x-amz-credential";
    private static final String O = "policy";
    private static final String P = "s3_key_prefix";
    private static final String Q = "image_id";
    private static final String R = "Content-Type";
    private static final String S = "type";
    private static final String T = "sha1";
    private static FileUploadManager U = null;
    private static LimitedConcurrentHashMap<String, FileUploadData> V = null;
    private static LimitedConcurrentHashMap<String, HashSet<FileUploadData>> W = null;
    public static final String a = "original_url";
    public static final String b = "resolved_url";
    public static final String c = "fingerprint";
    public static final String d = "sdk_uuid";
    public static final String e = "impression_id";
    public static final String f = "package";
    public static final String g = "id";
    public static final String h = "file";
    public static final String i = "files";
    public static final String j = "action";
    public static final String k = "id";
    public static final String l = "upload";
    public static final String m = "discard";
    public static final int n = 200;
    public static final String o = ".snk";
    public static String p = null;
    private static final String q = "FileUploadManager";
    private static final String r = "images_to_upload";
    private static final String s = "images_to_discard";
    private static final String t = "s3_access_tokens";
    private static final String u = "resolve_urls";
    private static final String v = "url";
    private static final String w = "key_prefix";
    private static final String x = "key";
    private static final String y = "gcs_params";
    private static final String z = "headers";
    private final ScheduledExecutorService X = Executors.newScheduledThreadPool(1);

    private FileUploadManager() {
        b();
        int A2 = com.safedk.android.internal.d.A();
        V = new LimitedConcurrentHashMap<>(A2);
        W = new LimitedConcurrentHashMap<>(A2);
        p = SafeDK.getInstance().ae() + "Files" + File.separator;
        d();
        e();
    }

    private void b() {
        AppLovinBridge.registerListener(AppLovinBridge.b, new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.FileUploadManager.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(FileUploadManager.q, "Response received");
                FileUploadManager.this.b(bundle);
            }
        });
    }

    private a a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Logger.printFullVerboseLog(q, "Extract AWS upload parameters from response body: ", bundle);
        if (!bundle.containsKey(t)) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
        } else {
            Bundle bundle2 = bundle.getBundle(t);
            Logger.d(q, "s3AccessTokens=", bundle2.toString());
            String string = bundle2.getString(E);
            Bundle bundle3 = bundle2.getBundle(F);
            String string2 = bundle3.getString(G);
            String string3 = bundle3.getString(H);
            String string4 = bundle3.getString("signature");
            String string5 = bundle3.getString(J);
            String string6 = bundle3.getString(K);
            String string7 = bundle3.getString(L);
            String string8 = bundle3.getString(M);
            String string9 = bundle3.getString(N);
            String string10 = bundle3.getString(O);
            String string11 = bundle3.getString("Content-Type");
            Logger.d(q, "s3 credentials collected");
            str11 = string11;
            str3 = string2;
            str8 = string3;
            str2 = string4;
            str4 = string;
            str5 = string5;
            str6 = string6;
            str9 = string7;
            str7 = string8;
            str10 = string9;
            str = string10;
        }
        return new a(str5, str, str2, null, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bundle bundle) {
        b bVar;
        try {
            Logger.d(q, "Response from server: ", bundle.toString());
            ArrayList<c> arrayList = new ArrayList();
            if (bundle.containsKey(r)) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(r);
                Logger.d(q, "imagesToUploadArrayList=", stringArrayList.toString());
                Iterator<String> it = stringArrayList.iterator();
                a aVar = null;
                while (it.hasNext()) {
                    Bundle bundle2 = (Bundle) it.next();
                    String string = bundle2.getString(c);
                    String string2 = bundle2.getString("image_id");
                    if (bundle2.containsKey(y)) {
                        String string3 = bundle2.getString(w);
                        String string4 = bundle2.getString("key");
                        Bundle bundle3 = bundle2.getBundle(y);
                        bVar = new b(string3, string4, bundle3.getBundle(z), bundle3.getString(A));
                    } else if (aVar != null) {
                        bVar = null;
                    } else {
                        aVar = a(bundle);
                        bVar = null;
                    }
                    if (aVar != null) {
                        String string5 = bundle2.getString(P);
                        aVar.a(string5);
                        Logger.d(q, "imagesToUploadBundle item : fingerprint=", string, ", imageId=", string2, ", s3KeyPrefix=", string5);
                    }
                    com.safedk.android.analytics.brandsafety.c k2 = com.safedk.android.analytics.brandsafety.b.k(string2);
                    if (k2 != null) {
                        Logger.d(q, "Image for upload added : image id ", string2);
                        arrayList.add(new c(k2.p, string2, string, bVar, aVar));
                    }
                }
                for (c cVar : arrayList) {
                    if (cVar.a != null) {
                        com.safedk.android.analytics.brandsafety.a a2 = SafeDK.getInstance().a(cVar.a);
                        if (a2 != null) {
                            Logger.d(q, "Executing image upload request for ad type ", cVar.a.name());
                            a2.a(cVar.e, cVar.d, cVar.b, cVar.c);
                        } else {
                            Logger.d(q, "Upload: finder not found for ad type ", cVar.a.name());
                        }
                    } else {
                        Logger.d(q, "Upload: finder not found for ad type null");
                    }
                }
            }
            if (bundle.containsKey(u)) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(u);
                Logger.d(q, "clickUrlsToResolveArrayList=", stringArrayList2.toString());
                Iterator<String> it2 = stringArrayList2.iterator();
                while (it2.hasNext()) {
                    Bundle bundle4 = (Bundle) it2.next();
                    String string6 = bundle4.getString(c);
                    String string7 = bundle4.getString("sdk_uuid");
                    String string8 = bundle4.getString("impression_id");
                    String string9 = bundle4.getString("url");
                    Logger.d(q, "clickUrlsToResolveBundle item : fingerprint=", string6, ", url=", string9);
                    if (string6 != null && string9 != null) {
                        i.a().a(string9, string6, string7, string8);
                    } else {
                        Logger.d(q, "fingerprint and url are null, skipping");
                    }
                }
            }
            if (bundle.containsKey(s)) {
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList(s);
                Logger.d(q, "Images to discard : ", stringArrayList3.toString());
                Iterator<String> it3 = stringArrayList3.iterator();
                while (it3.hasNext()) {
                    String next = it3.next();
                    com.safedk.android.analytics.brandsafety.c k3 = com.safedk.android.analytics.brandsafety.b.k(next);
                    if (k3 != null) {
                        com.safedk.android.analytics.brandsafety.a a3 = SafeDK.getInstance().a(k3.p);
                        if (a3 != null) {
                            Logger.d(q, "Executing image discard request for hash ", next);
                            a3.g(next);
                        } else {
                            Logger.d(q, "Discard : finder not found for image id ", next);
                        }
                    }
                }
            }
            if (bundle.isEmpty() || !bundle.containsKey(r)) {
                c();
            }
            if (bundle.containsKey(i)) {
                c(bundle);
                e();
            }
        } catch (Throwable th) {
            Logger.e(q, "Failed to handle response from server", th);
            new CrashReporter().caughtException(th);
        }
    }

    private void c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(i);
        Logger.d(q, "fileArrayList=", stringArrayList.toString());
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = (Bundle) it.next();
            String string = bundle2.getString("id", null);
            String string2 = bundle2.getString("action");
            if (string != null && string2 != null) {
                if (string2.equals(l)) {
                    Logger.d(q, "edge server responded to upload the file id: ", string);
                    if (bundle2.containsKey(y)) {
                        a(bundle2, string);
                    }
                } else if (string2.equals(m)) {
                    Logger.d(q, "edge server responded to discard the file id: ", string);
                    c(string);
                } else {
                    Logger.d(q, "edge server responded with an unknown action value or it does not exist: ", string2);
                }
            }
        }
    }

    private void a(Bundle bundle, String str) {
        String str2;
        Bundle bundle2;
        Bundle bundle3 = bundle.getBundle(y);
        Bundle bundle4 = bundle3.getBundle(z);
        String string = bundle3.getString("url");
        String string2 = bundle3.getString(C);
        if (string != null && string2 != null) {
            str2 = string + "?" + string2;
        } else {
            str2 = null;
        }
        if (!bundle.containsKey(D)) {
            bundle2 = null;
        } else {
            bundle2 = bundle.getBundle(D);
        }
        a(str, new b(null, null, bundle4, str2), string, bundle2);
    }

    private void a(final String str, final b bVar, final String str2, final Bundle bundle) {
        this.X.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.FileUploadManager.2
            @Override // java.lang.Runnable
            public void run() {
                FileUploadManager.this.a(str, bVar, str2, bundle, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final b bVar, final String str2, final Bundle bundle, final int i2) {
        g.a aVar;
        String str3;
        FileUploadData fileUploadData = V.get(str);
        if (fileUploadData == null) {
            Logger.d(q, "File upload - did not find file with id: ", str);
            return;
        }
        if (fileUploadData.d() != null && fileUploadData.d().length() != 0) {
            Logger.d(q, "Uploading file Upload Data ", fileUploadData, " to server, ms, isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (bVar != null) {
                try {
                    aVar = new com.safedk.android.a.c(fileUploadData.c(), SafeDK.getInstance().L(), bVar, fileUploadData.d()).b();
                } catch (IOException e2) {
                    if (i2 >= 2) {
                        Logger.d(q, "IOException when uploading file ", fileUploadData.c(), " : ", e2.getMessage(), e2);
                        return;
                    }
                    int i3 = com.safedk.android.a.g.h[i2];
                    Logger.d(q, "IOException when uploading file, next retry in ", Integer.valueOf(i3), " ms, file: ", fileUploadData.c());
                    this.X.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.FileUploadManager.3
                        @Override // java.lang.Runnable
                        public void run() {
                            FileUploadManager.this.a(str, bVar, str2, bundle, i2 + 1);
                        }
                    }, i3, TimeUnit.MILLISECONDS);
                    return;
                } catch (Throwable th) {
                    Logger.e(q, "Failed to upload file ", fileUploadData.c(), " : ", th.getMessage(), th);
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (bundle != null && bundle.containsKey(c)) {
                str3 = bundle.getString(c);
                bundle.remove(c);
            } else {
                str3 = null;
            }
            if (aVar != null && aVar.b() == 200) {
                String a2 = aVar.a();
                Logger.d(q, "Upload file succeeded: ", a2, "gcsResponse: ", aVar);
                if (a2 != null && !a2.isEmpty()) {
                    Bundle bundle2 = new Bundle();
                    Bundle bundle3 = new Bundle();
                    try {
                        bundle3.putString("url", str2);
                        bundle3.putString("id", fileUploadData.a());
                        bundle3.putString("type", fileUploadData.b());
                        bundle3.putString(T, fileUploadData.c());
                        if (str3 != null) {
                            bundle3.putString(c, str3);
                        }
                        if (bundle != null) {
                            Logger.d(q, "Upload file - entering return params into the file data to return: ", bundle);
                            bundle3.putAll(bundle);
                        }
                        bundle2.putBundle("file", bundle3);
                    } catch (Throwable th2) {
                        Logger.e(q, th2.getMessage(), th2);
                        new CrashReporter().caughtException(th2);
                    }
                    Logger.d(q, "going to report back to edge: ", bundle2);
                    g.b(bundle2);
                }
            } else if (aVar != null && aVar.b() != 200) {
                Logger.d(q, "upload file failed, returned code is: ", Integer.valueOf(aVar.b()), " for fingerprint: ", str3);
            } else {
                Logger.d(q, "upload file failed, gcsResponse is null, fingerprint = ", str3);
            }
            c(str);
            return;
        }
        Logger.d(q, "File upload - file with id: ", str, " is empty");
    }

    private void c() {
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
        while (it.hasNext()) {
            it.next().b((l) null);
        }
    }

    public static FileUploadManager a() {
        if (U == null) {
            U = new FileUploadManager();
        }
        return U;
    }

    public static class b {
        String a;
        String b;
        Bundle c;
        String d;

        public b(String str, String str2, Bundle bundle, String str3) {
            this.a = str;
            this.b = str2;
            this.c = bundle;
            this.d = str3;
            Logger.d(FileUploadManager.q, "GcsUploadParams ctor, keyPrefix=", str, ", key=", str2, ", headers=", bundle, ", uploadUrl=", str3);
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public Bundle c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public String toString() {
            return "keyPrefix=" + this.a + ", key = " + this.b + ", headers=" + this.c + ", uploadUrl=" + this.d;
        }
    }

    public static class a {
        String a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String g;
        String h;
        String i;
        String j;
        String k;
        String l;
        String m;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
            this.k = str11;
            this.l = str12;
            this.m = str13;
            Logger.d(FileUploadManager.q, "AwsUploadParams ctor, awsAccessKey=", str, ", keyPrefix=", str4, ", bucket=", str5);
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return this.f;
        }

        public String g() {
            return this.h;
        }

        public String h() {
            return this.i;
        }

        public String i() {
            return this.j;
        }

        public String j() {
            return this.k;
        }

        public String k() {
            return this.l;
        }

        public void a(String str) {
            this.d = str;
        }

        public String l() {
            return this.m;
        }

        public String toString() {
            return "BaseUrl=" + this.f + ", keyPrefix = " + this.d;
        }
    }

    static class c implements Comparable {
        BrandSafetyUtils.AdType a;
        String b;
        String c;
        a d;
        b e;

        c(BrandSafetyUtils.AdType adType, String str, String str2, b bVar, a aVar) {
            this.a = adType;
            this.b = str;
            this.c = str2;
            this.e = bVar;
            this.d = aVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object compareTo) {
            return this.a.ordinal() - ((c) compareTo).a.ordinal();
        }
    }

    public static String a(String str) {
        if (str == null || !str.contains("_")) {
            return null;
        }
        return str.substring(str.lastIndexOf("_") + 1);
    }

    private void d() {
        FileUploadData b2;
        File[] listFiles = new File(p).listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            Logger.d(q, "loading saved file: ", file.getAbsolutePath());
            if (file.isFile() && file.getName().endsWith(o) && (b2 = b(file.getAbsolutePath())) != null) {
                a(b2, false);
            }
        }
    }

    public FileUploadData b(String str) {
        FileUploadData fileUploadData;
        FileInputStream fileInputStream;
        byte[] b2;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (TextUtils.isEmpty(str) || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                b2 = com.safedk.android.utils.n.b((InputStream) fileInputStream);
                fileUploadData = (FileUploadData) com.safedk.android.utils.i.a(new String(b2));
            } catch (Throwable th) {
                th = th;
                fileUploadData = null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileUploadData = null;
        }
        try {
            Logger.d(q, "File retrieved with ID: ", fileUploadData.a(), " amount of bytes: ", Integer.valueOf(b2.length));
            com.safedk.android.utils.n.a((Closeable) fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            try {
                Logger.d(q, "Exception retrieving file content", th);
                d(str);
                return fileUploadData;
            } finally {
                com.safedk.android.utils.n.a((Closeable) fileInputStream2);
            }
        }
        return fileUploadData;
    }

    private void b(FileUploadData fileUploadData) {
        if (fileUploadData == null || TextUtils.isEmpty(fileUploadData.d())) {
            return;
        }
        String f2 = fileUploadData.f();
        Logger.d(q, "file for save path is: ", f2);
        File file = new File(f2);
        if (file.exists()) {
            return;
        }
        Logger.d(q, "file for save name is: ", file.getName());
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(com.safedk.android.utils.i.a(fileUploadData).getBytes());
                Logger.d(q, "File saved with ID: ", fileUploadData.a());
                com.safedk.android.utils.n.a((Closeable) fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    Logger.d(q, "Error saving file content ", th.getMessage(), th);
                } finally {
                    com.safedk.android.utils.n.a((Closeable) fileOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean d(String str) {
        Logger.d(q, "Removing file from disk started for: ", str);
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    private void e() {
        Logger.d(q, "Removing outdated files scan started");
        synchronized (V) {
            for (FileUploadData fileUploadData : V.values()) {
                if (fileUploadData.g()) {
                    c(fileUploadData.a());
                }
            }
        }
    }

    private void c(FileUploadData fileUploadData) {
        String e2 = fileUploadData.e();
        HashSet<FileUploadData> hashSet = W.get(e2);
        if (hashSet != null) {
            hashSet.remove(fileUploadData);
            if (hashSet.size() == 0) {
                W.remove(e2);
            }
        }
    }

    public void a(FileUploadData fileUploadData) {
        a(fileUploadData, true);
    }

    public void a(FileUploadData fileUploadData, boolean z2) {
        String a2 = fileUploadData.a();
        String e2 = fileUploadData.e();
        Logger.d(q, "add file upload data - file id: ", a2, " for CI id: ", e2);
        if (V.size() == V.b()) {
            c(V.a());
        }
        synchronized (V) {
            V.put(a2, fileUploadData);
        }
        if (!W.containsKey(e2)) {
            W.put(e2, new HashSet<>());
        }
        W.get(e2).add(fileUploadData);
        if (z2) {
            b(fileUploadData);
        }
    }

    public void c(String str) {
        FileUploadData remove;
        Logger.d(q, "Removing file upload data with id: ", str);
        synchronized (V) {
            remove = V.remove(str);
        }
        if (remove != null) {
            c(remove);
            d(remove.f());
        }
    }

    public HashSet<FileUploadData> a(CreativeInfo creativeInfo) {
        if (creativeInfo == null || creativeInfo.L() == null) {
            return null;
        }
        return W.get(creativeInfo.L());
    }

    public static class FileUploadData extends PersistableBase {
        private static final String g = "FileUploadData";
        private static final long serialVersionUID = 1;
        String a;
        String b;
        String c;
        String d;
        String e;
        long f;

        public FileUploadData() {
        }

        public FileUploadData(String type, String fileContent) {
            this(type, fileContent, null);
        }

        public FileUploadData(String type, String fileContent, String adId) {
            this.a = UUID.randomUUID().toString();
            this.b = type;
            this.c = com.safedk.android.utils.k.o(fileContent);
            this.d = fileContent;
            this.f = System.currentTimeMillis();
            this.e = adId;
            Logger.d(g, "FileUploadData ctor, fileId=", this.a, ", type=", type, ", hash=", this.c, " ad id=", adId);
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return FileUploadManager.p + this.b + "_" + this.a + FileUploadManager.o;
        }

        public boolean g() {
            boolean z = System.currentTimeMillis() - this.f > 86400000;
            if (z) {
                Logger.d(g, "is outdated returned true for file with id: ", this.a);
            }
            return z;
        }

        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putString("id", this.a);
            bundle.putString("type", this.b);
            bundle.putString(FileUploadManager.T, this.c);
            return bundle;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "fileId=" + this.a + ", type=" + this.b + ", hash=" + this.c + ", creation=" + this.f;
        }

        @Override // com.safedk.android.utils.f
        public JSONObject i() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.a)) {
                jSONObject.put("fileId", this.a);
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("type", this.b);
            }
            if (!TextUtils.isEmpty(this.c)) {
                jSONObject.put("sha1Value", this.c);
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("fileContent", this.d);
            }
            if (!TextUtils.isEmpty(this.e)) {
                jSONObject.put("adId", this.e);
            }
            jSONObject.put("creationTime", this.f);
            return jSONObject;
        }

        @Override // com.safedk.android.utils.f
        public void a(JSONObject jSONObject) throws JSONException {
            this.a = jSONObject.optString("fileId", "");
            this.b = jSONObject.optString("type", "");
            this.c = jSONObject.optString("sha1Value", "");
            this.d = jSONObject.optString("fileContent", "");
            this.e = jSONObject.optString("adId", "");
            this.f = jSONObject.optLong("creationTime", 0L);
        }
    }
}
