package com.mbridge.msdk.config.component.database.file;

import android.text.TextUtils;
import com.ironsource.V5;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FileOperate.java */
/* loaded from: classes6.dex */
public class a {
    final String a = "FileOperate";

    public void a(String str) {
        String str2;
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("WHERE")) {
            String[] split = str.split("WHERE");
            if (split.length > 1) {
                str2 = split[1];
            }
            str2 = "";
        } else {
            if (str.contains("where")) {
                String[] split2 = str.split("where");
                if (split2.length > 1) {
                    str2 = split2[1];
                }
            }
            str2 = "";
        }
        Map<String, Object> d = com.mbridge.msdk.config.component.database.a.a().d("SELECT filePath FROM FileDB WHERE " + str2);
        if (d == null || d.isEmpty() || !(d.get("data") instanceof List) || (arrayList = (ArrayList) d.get("data")) == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                if (((String) entry.getKey()).equals(V5.c.c)) {
                    arrayList2.add(String.valueOf(entry.getValue()));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            a(new File(str3));
            if (str3.contains(".zip")) {
                String replace = str3.replace(".zip", "");
                if (!TextUtils.isEmpty(replace)) {
                    a(new File(replace));
                }
            }
        }
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }
}
