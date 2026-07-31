package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import com.safedk.android.internal.partials.LiftoffMonetizeFilesBridge;
import com.vungle.ads.AssetFailedToDeleteError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* loaded from: classes14.dex */
public abstract class n {
    public static m a = new m() { // from class: com.vungle.ads.internal.util.n$$ExternalSyntheticLambda0
        @Override // com.vungle.ads.internal.util.m
        public final ObjectInputStream a(InputStream inputStream) {
            return n.a(inputStream);
        }
    };
    public static final List b = CollectionsKt.listOf((Object[]) new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});

    public static final ObjectInputStream a(InputStream inputStream) {
        return new x(inputStream, b);
    }

    public static final void b(File folder, Set set) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        File[] listFiles = folder.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            a(file, set);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0026: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:51:0x0026 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vungle.ads.internal.util.m] */
    public static final Object c(File file) {
        Closeable closeable;
        Closeable closeable2;
        Exception e;
        ObjectInputStream objectInputStream;
        ClassNotFoundException e2;
        IOException e3;
        Closeable closeable3;
        Intrinsics.checkNotNullParameter(file, "file");
        ?? exists = file.exists();
        Closeable closeable4 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
                try {
                    objectInputStream = a.a(exists);
                    try {
                        Object readObject = objectInputStream.readObject();
                        a((Closeable) objectInputStream);
                        a((Closeable) exists);
                        return readObject;
                    } catch (IOException e4) {
                        e3 = e4;
                        boolean z = u.a;
                        t.b("FileUtility", "IOException: " + e3.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        try {
                            a(file, (Set) null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e5) {
                        e2 = e5;
                        boolean z2 = u.a;
                        t.b("FileUtility", "ClassNotFoundException: " + e2.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        a(file, (Set) null);
                        return null;
                    } catch (Exception e6) {
                        e = e6;
                        boolean z3 = u.a;
                        t.b("FileUtility", "cannot read serializable " + e.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        a(file, (Set) null);
                        return null;
                    }
                } catch (IOException e7) {
                    e3 = e7;
                    objectInputStream = null;
                } catch (ClassNotFoundException e8) {
                    e2 = e8;
                    objectInputStream = null;
                } catch (Exception e9) {
                    e = e9;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable4;
                    closeable4 = exists;
                    a(closeable2);
                    a(closeable4);
                    throw th;
                }
            } catch (IOException e10) {
                e3 = e10;
                exists = 0;
                objectInputStream = null;
            } catch (ClassNotFoundException e11) {
                e2 = e11;
                exists = 0;
                objectInputStream = null;
            } catch (Exception e12) {
                e = e12;
                exists = 0;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                closeable2 = null;
                a(closeable2);
                a(closeable4);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable4 = closeable;
        }
    }

    public static String d(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return FilesKt.readText$default(file, null, 1, null);
        } catch (IOException e) {
            boolean z = u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("IOException: ");
            a2.append(e.getMessage());
            t.b("FileUtility", a2.toString());
            return null;
        } catch (Exception e2) {
            boolean z2 = u.a;
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("cannot read string ");
            a3.append(e2.getMessage());
            t.b("FileUtility", a3.toString());
            return null;
        }
    }

    public static final void a(File file, Set set) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        if (set != null && set.contains(file.getName())) {
                            boolean z = u.a;
                            t.a("FileUtility", "Skipping deletion of directory: " + file.getName());
                            return;
                        }
                        b(file, set);
                    }
                    if (set != null && set.contains(file.getName())) {
                        boolean z2 = u.a;
                        t.a("FileUtility", "Skipping deletion of file: " + file.getName());
                        return;
                    }
                    if (file.delete()) {
                        return;
                    }
                    boolean z3 = u.a;
                    t.a("FileUtility", "Failed to delete file: " + file);
                }
            } catch (Exception e) {
                boolean z4 = u.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Failed to delete file: ");
                a2.append(e.getLocalizedMessage());
                t.b("FileUtility", a2.toString());
            }
        }
    }

    public static final void b(File file) {
        Path path;
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                path = file.toPath();
                Files.delete(path);
            } else if (!file.delete()) {
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Failed to delete ");
            a2.append(file.getName());
            a2.append(" with error :");
            a2.append(e.getMessage());
            new AssetFailedToDeleteError(a2.toString()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void a(File file, Serializable serializable) {
        Throwable th;
        ?? r2;
        IOException e;
        FileOutputStream fileOutputStream;
        Closeable closeable;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            b(file);
        }
        if (serializable == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = LiftoffMonetizeFilesBridge.fileOutputStreamCtor(file);
        } catch (IOException e2) {
            e = e2;
            r2 = 0;
        } catch (Throwable th2) {
            th = th2;
            r2 = 0;
            fileOutputStream = fileOutputStream2;
            fileOutputStream2 = r2;
            a(fileOutputStream2);
            a(fileOutputStream);
            throw th;
        }
        try {
            r2 = new ObjectOutputStream(fileOutputStream);
            try {
                r2.writeObject(serializable);
                r2.reset();
                closeable = r2;
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                r2 = r2;
                try {
                    boolean z = u.a;
                    t.b("FileUtility", String.valueOf(e.getMessage()));
                    fileOutputStream = fileOutputStream2;
                    closeable = r2;
                    a(closeable);
                    a(fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    fileOutputStream2 = r2;
                    a(fileOutputStream2);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = r2;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            r2 = 0;
        } catch (Throwable th5) {
            th = th5;
            a(fileOutputStream2);
            a(fileOutputStream);
            throw th;
        }
        a(closeable);
        a(fileOutputStream);
    }

    public static void a(File file, String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (str == null) {
            return;
        }
        try {
            FilesKt.writeText(file, str, Charsets.UTF_8);
        } catch (IOException e) {
            boolean z = u.a;
            t.b("FileUtility", String.valueOf(e.getMessage()));
        }
    }

    public static boolean a(String str) {
        if (str != null) {
            try {
                if (!StringsKt.isBlank(str)) {
                    if (HttpUrl.INSTANCE.parse(str) != null) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static String a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        String guessFileName = URLUtil.guessFileName(url, null, str);
        Intrinsics.checkNotNullExpressionValue(guessFileName, "guessFileName(url, null, ext)");
        return guessFileName;
    }
}
