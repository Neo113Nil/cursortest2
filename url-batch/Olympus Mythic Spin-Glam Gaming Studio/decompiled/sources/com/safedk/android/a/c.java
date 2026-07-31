package com.safedk.android.a;

import android.os.Bundle;
import com.safedk.android.a.g;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class c extends g {
    FileUploadManager.b a;
    String b;
    String c;

    public c(String str, int i, FileUploadManager.b bVar, String str2) {
        super(null, str, i);
        this.b = null;
        this.c = "GcsUploadFile";
        this.a = bVar;
        this.b = str2;
        Logger.d("GcsUploadFile", "GcsUploadFile object created for File upload, hash=", str, ", params =", bVar.toString());
    }

    public c(String str, String str2, int i, FileUploadManager.b bVar) {
        super(str, str2, i);
        this.b = null;
        this.c = "GcsUploadFile";
        this.a = bVar;
        Logger.d("GcsUploadFile", "GcsUploadFile object created, File path=", str, ", hash=", str2, ", params =", bVar.toString());
    }

    @Override // com.safedk.android.a.g
    public g.a a() throws IOException {
        if (this.j == null) {
            Logger.d(this.c, "File to upload is null");
            return null;
        }
        File file = new File(this.j);
        if (!file.exists()) {
            Logger.d(this.c, "File to upload not found ", this.j);
            return null;
        }
        String d = this.a.d();
        Logger.d(this.c, "About to upload File to ", d, ", prefix=", this.a.a(), ", File path: ", this.j);
        Bundle c = this.a.c();
        Logger.printFullVerboseLog(this.c, "Uploading File with headers: ", c);
        HashMap hashMap = new HashMap();
        for (String str : c.keySet()) {
            Logger.d(this.c, "adding field key: ", str, " with value: ", c.getString(str));
            hashMap.put(str, c.getString(str));
        }
        d dVar = new d(g.f, d, "UTF-8", this.i, hashMap);
        dVar.a("file", file, false);
        dVar.a();
        String str2 = this.a.a() + this.a.b();
        Logger.d(this.c, "File uploaded successfully to GCS");
        return new g.a(str2, dVar.b(), this.k);
    }

    public g.a b() throws IOException {
        String d = this.a.d();
        Logger.d(this.c, "About to upload File to ", d, ", prefix=", this.a.a());
        Bundle c = this.a.c();
        Logger.printFullVerboseLog(this.c, "Uploading File with headers: ", c);
        HashMap hashMap = new HashMap();
        for (String str : c.keySet()) {
            Logger.d(this.c, "adding field key: ", str, " with value: ", c.getString(str));
            hashMap.put(str, c.getString(str));
        }
        d dVar = new d(g.f, d, "UTF-8", this.i, hashMap);
        a(dVar);
        dVar.a();
        Logger.d(this.c, "File uploaded successfully to GCS");
        return new g.a(d, dVar.b(), this.k);
    }

    public void a(d dVar) throws IOException {
        File file = null;
        try {
            try {
                file = File.createTempFile("file", ".gz");
                Logger.d(this.c, "created temp file in: ", file.getAbsolutePath());
                new FileOutputStream(file).write(this.b.getBytes("UTF-8"));
                dVar.a(file);
                if (file == null || !file.exists()) {
                    return;
                }
            } catch (IOException e) {
                Logger.d(this.c, "Error adding gzip file: ", e);
                if (file == null || !file.exists()) {
                    return;
                }
            }
            file.delete();
        } catch (Throwable th) {
            if (file != null && file.exists()) {
                file.delete();
            }
            throw th;
        }
    }
}
