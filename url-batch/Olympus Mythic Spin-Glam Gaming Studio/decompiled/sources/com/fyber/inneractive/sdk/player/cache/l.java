package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public abstract class l {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
